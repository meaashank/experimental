package com.android.launcher3;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.android.launcher3.DropTarget;
import com.android.launcher3.dragndrop.DragOptions;
import com.android.launcher3.extension.CreateSysShortcutDropTargetExtension;
import com.android.launcher3.extension.ExtensionFactory;
import com.android.launcher3.logging.LoggerUtils;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes2.dex */
public class CreateSysShortcutDropTarget extends ButtonDropTarget {
    private static final String TAG = l0.b("CreateSysShortcutDropTarget");
    private static final CreateSysShortcutDropTargetExtension extension = ExtensionFactory.createCreateSysShortcutDropTargetExtension();
    private int mControlType;

    public CreateSysShortcutDropTarget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setControlTypeBasedOnDragSource(ItemInfo itemInfo) {
        this.mControlType = itemInfo.f136873id != -1 ? 5 : 14;
    }

    private void setTextBasedOnDragSource(ItemInfo itemInfo) {
        if (TextUtils.isEmpty(this.mText)) {
            return;
        }
        this.mText = getResources().getString(itemInfo.f136873id != -1 ? com.app.hider.master.promax.R.string.action_deep_shortcut : android.R.string.cancel);
        requestLayout();
    }

    @Override // com.android.launcher3.ButtonDropTarget
    public void completeDrop(DropTarget.DragObject dragObject) {
        ItemInfo itemInfo = dragObject.dragInfo;
        String str = TAG;
        Log.d(str, "completeDrop " + dragObject.cancelled);
        CreateSysShortcutDropTargetExtension createSysShortcutDropTargetExtension = extension;
        if (createSysShortcutDropTargetExtension == null || !createSysShortcutDropTargetExtension.completeDrop(this, dragObject, itemInfo).f73886a) {
            Log.d(str, "completeDrop");
        }
    }

    @Override // com.android.launcher3.ButtonDropTarget
    public int getAccessibilityAction() {
        return com.app.hider.master.promax.R.id.action_remove;
    }

    @Override // com.android.launcher3.ButtonDropTarget
    public LauncherLogProto.Target getDropTargetForLogging() {
        LauncherLogProto.Target targetNewTarget = LoggerUtils.newTarget(2);
        targetNewTarget.controlType = this.mControlType;
        return targetNewTarget;
    }

    @Override // com.android.launcher3.ButtonDropTarget
    public void onAccessibilityDrop(View view, ItemInfo itemInfo) {
    }

    @Override // com.android.launcher3.ButtonDropTarget, com.android.launcher3.dragndrop.DragController.DragListener
    public void onDragStart(DropTarget.DragObject dragObject, DragOptions dragOptions) {
        super.onDragStart(dragObject, dragOptions);
        setTextBasedOnDragSource(dragObject.dragInfo);
        setControlTypeBasedOnDragSource(dragObject.dragInfo);
    }

    @Override // com.android.launcher3.ButtonDropTarget, com.android.launcher3.DropTarget
    public void onDrop(DropTarget.DragObject dragObject, DragOptions dragOptions) {
        CreateSysShortcutDropTargetExtension createSysShortcutDropTargetExtension = extension;
        if (createSysShortcutDropTargetExtension != null) {
            createSysShortcutDropTargetExtension.preOnDrop(this, dragObject, dragOptions);
        }
        super.onDrop(dragObject, dragOptions);
    }

    @Override // com.android.launcher3.ButtonDropTarget, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mHoverColor = getResources().getColor(com.app.hider.master.promax.R.color.delete_target_hover_tint);
        setDrawable(com.app.hider.master.promax.R.drawable.ic_shortcut_shadow);
    }

    @Override // com.android.launcher3.ButtonDropTarget
    public boolean supportsAccessibilityDrop(ItemInfo itemInfo, View view) {
        return (itemInfo instanceof ShortcutInfo) || (itemInfo instanceof LauncherAppWidgetInfo) || (itemInfo instanceof FolderInfo);
    }

    @Override // com.android.launcher3.ButtonDropTarget
    public boolean supportsDrop(ItemInfo itemInfo) {
        CreateSysShortcutDropTargetExtension createSysShortcutDropTargetExtension = extension;
        if (createSysShortcutDropTargetExtension == null) {
            return true;
        }
        U9.B<Boolean> bSupportsDrop = createSysShortcutDropTargetExtension.supportsDrop(itemInfo);
        if (bSupportsDrop.f73886a) {
            return bSupportsDrop.f73887b.booleanValue();
        }
        return true;
    }

    public CreateSysShortcutDropTarget(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mControlType = 0;
    }
}
