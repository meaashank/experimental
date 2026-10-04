package com.android.launcher3.folder;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
class PreviewItemDrawingParams {
    FolderPreviewItemAnim anim;
    Drawable drawable;
    public boolean hidden;
    float overlayAlpha;
    float scale;
    float transX;
    float transY;

    public PreviewItemDrawingParams(float f10, float f11, float f12, float f13) {
        this.transX = f10;
        this.transY = f11;
        this.scale = f12;
        this.overlayAlpha = f13;
    }

    public void update(float f10, float f11, float f12) {
        FolderPreviewItemAnim folderPreviewItemAnim = this.anim;
        if (folderPreviewItemAnim != null) {
            if (folderPreviewItemAnim.finalTransX == f10 || folderPreviewItemAnim.finalTransY == f11 || folderPreviewItemAnim.finalScale == f12) {
                return;
            } else {
                folderPreviewItemAnim.cancel();
            }
        }
        this.transX = f10;
        this.transY = f11;
        this.scale = f12;
    }
}
