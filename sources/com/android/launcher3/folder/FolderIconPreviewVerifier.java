package com.android.launcher3.folder;

import com.android.launcher3.FolderInfo;
import com.android.launcher3.InvariantDeviceProfile;

/* JADX INFO: loaded from: classes2.dex */
public class FolderIconPreviewVerifier {
    private int mGridCountX;
    private final int mMaxGridCountX;
    private final int mMaxGridCountY;
    private final int mMaxItemsPerPage;
    private final int[] mGridSize = new int[2];
    private boolean mDisplayingUpperLeftQuadrant = false;

    public FolderIconPreviewVerifier(InvariantDeviceProfile invariantDeviceProfile) {
        int i10 = invariantDeviceProfile.numFolderColumns;
        this.mMaxGridCountX = i10;
        int i11 = invariantDeviceProfile.numFolderRows;
        this.mMaxGridCountY = i11;
        this.mMaxItemsPerPage = i10 * i11;
    }

    public boolean isItemInPreview(int i10) {
        return isItemInPreview(0, i10);
    }

    public void setFolderInfo(FolderInfo folderInfo) {
        int size = folderInfo.contents.size();
        FolderPagedView.calculateGridSize(size, 0, 0, this.mMaxGridCountX, this.mMaxGridCountY, this.mMaxItemsPerPage, this.mGridSize);
        this.mGridCountX = this.mGridSize[0];
        this.mDisplayingUpperLeftQuadrant = size > 4;
    }

    public boolean isItemInPreview(int i10, int i11) {
        if (i10 <= 0 && !this.mDisplayingUpperLeftQuadrant) {
            return i11 < 4;
        }
        int i12 = this.mGridCountX;
        return i11 % i12 < 2 && i11 / i12 < 2;
    }
}
