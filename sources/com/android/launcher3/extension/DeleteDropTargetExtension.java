package com.android.launcher3.extension;

import U9.B;
import com.android.launcher3.DeleteDropTarget;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.dragndrop.DragOptions;

/* JADX INFO: loaded from: classes2.dex */
public interface DeleteDropTargetExtension {
    B<Void> completeDrop(DeleteDropTarget deleteDropTarget, DropTarget.DragObject dragObject, ItemInfo itemInfo);

    void preOnDrop(DeleteDropTarget deleteDropTarget, DropTarget.DragObject dragObject, DragOptions dragOptions);

    B<Boolean> supportsDrop(ItemInfo itemInfo);
}
