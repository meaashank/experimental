package com.android.launcher3.touch;

import android.view.View;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherState;
import com.android.launcher3.dragndrop.DragController;
import com.android.launcher3.dragndrop.DragOptions;
import com.android.launcher3.extension.ExtensionFactory;
import com.android.launcher3.extension.ItemLongClickListenerExtension;
import com.android.launcher3.folder.Folder;

/* JADX INFO: loaded from: classes2.dex */
public class ItemLongClickListener {
    public static View.OnLongClickListener INSTANCE_WORKSPACE = new g();
    public static View.OnLongClickListener INSTANCE_ALL_APPS = new h();
    private static ItemLongClickListenerExtension extension = ExtensionFactory.getAllAppsOnLongClickListenerExtension();

    public static void beginDrag(View view, Launcher launcher, ItemInfo itemInfo, DragOptions dragOptions) {
        Folder open;
        if (itemInfo.container >= 0 && (open = Folder.getOpen(launcher)) != null) {
            if (open.getItemsInReadingOrder().contains(view)) {
                open.startDrag(view, dragOptions);
                return;
            }
            open.close(true);
        }
        launcher.getWorkspace().startDrag(new CellLayout.CellInfo(view, itemInfo), dragOptions);
    }

    public static boolean canStartDrag(Launcher launcher) {
        return (launcher == null || launcher.isWorkspaceLocked() || launcher.getDragController().isDragging()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean onAllAppsItemLongClick(final View view) {
        ItemLongClickListenerExtension itemLongClickListenerExtension = extension;
        if (itemLongClickListenerExtension != null && itemLongClickListenerExtension.onAllAppsItemLongClick(view)) {
            return true;
        }
        Launcher launcher = Launcher.getLauncher(view.getContext());
        if (!canStartDrag(launcher) || ((!launcher.isInState(LauncherState.ALL_APPS) && !launcher.isInState(LauncherState.OVERVIEW)) || launcher.getWorkspace().isSwitchingState())) {
            return false;
        }
        final DragController dragController = launcher.getDragController();
        dragController.addDragListener(new DragController.DragListener() { // from class: com.android.launcher3.touch.ItemLongClickListener.1
            @Override // com.android.launcher3.dragndrop.DragController.DragListener
            public void onDragEnd() {
                view.setVisibility(0);
                dragController.removeDragListener(this);
            }

            @Override // com.android.launcher3.dragndrop.DragController.DragListener
            public void onDragStart(DropTarget.DragObject dragObject, DragOptions dragOptions) {
                view.setVisibility(4);
            }
        });
        DeviceProfile deviceProfile = launcher.getDeviceProfile();
        DragOptions dragOptions = new DragOptions();
        dragOptions.intrinsicIconScaleFactor = deviceProfile.allAppsIconSizePx / deviceProfile.iconSizePx;
        launcher.getWorkspace().beginDragShared(view, launcher.getAppsView(), dragOptions);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean onWorkspaceItemLongClick(View view) {
        Launcher launcher = Launcher.getLauncher(view.getContext());
        if (!canStartDrag(launcher)) {
            return false;
        }
        if ((!launcher.isInState(LauncherState.NORMAL) && !launcher.isInState(LauncherState.OVERVIEW)) || !(view.getTag() instanceof ItemInfo)) {
            return false;
        }
        launcher.setWaitingForResult(null);
        beginDrag(view, launcher, (ItemInfo) view.getTag(), new DragOptions());
        return true;
    }
}
