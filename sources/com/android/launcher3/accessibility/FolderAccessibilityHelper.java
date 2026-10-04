package com.android.launcher3.accessibility;

import com.android.launcher3.CellLayout;
import com.android.launcher3.folder.FolderPagedView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class FolderAccessibilityHelper extends DragAndDropAccessibilityDelegate {
    private final FolderPagedView mParent;
    private final int mStartPosition;

    public FolderAccessibilityHelper(CellLayout cellLayout) {
        super(cellLayout);
        FolderPagedView folderPagedView = (FolderPagedView) cellLayout.getParent();
        this.mParent = folderPagedView;
        this.mStartPosition = cellLayout.getCountY() * cellLayout.getCountX() * folderPagedView.indexOfChild(cellLayout);
    }

    @Override // com.android.launcher3.accessibility.DragAndDropAccessibilityDelegate
    public String getConfirmationForIconDrop(int i10) {
        return this.mContext.getString(R.string.item_moved);
    }

    @Override // com.android.launcher3.accessibility.DragAndDropAccessibilityDelegate
    public String getLocationDescriptionForIconDrop(int i10) {
        return this.mContext.getString(R.string.move_to_position, Integer.valueOf(i10 + this.mStartPosition + 1));
    }

    @Override // com.android.launcher3.accessibility.DragAndDropAccessibilityDelegate
    public int intersectsValidDropTarget(int i10) {
        return Math.min(i10, (this.mParent.getAllocatedContentSize() - this.mStartPosition) - 1);
    }
}
