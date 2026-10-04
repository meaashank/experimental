package com.android.launcher3.extension;

import U9.B;
import com.android.launcher3.CreateSysShortcutDropTarget;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.dragndrop.DragOptions;

/* JADX INFO: loaded from: classes2.dex */
public interface CreateSysShortcutDropTargetExtension {
    B<Void> completeDrop(CreateSysShortcutDropTarget createSysShortcutDropTarget, DropTarget.DragObject dragObject, ItemInfo itemInfo);

    void preOnDrop(CreateSysShortcutDropTarget createSysShortcutDropTarget, DropTarget.DragObject dragObject, DragOptions dragOptions);

    B<Boolean> supportsDrop(ItemInfo itemInfo);
}
