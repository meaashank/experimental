package com.android.launcher3.folder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.android.launcher3.LauncherAnimUtils;
import i.C4541d;

/* JADX INFO: loaded from: classes2.dex */
class FolderPreviewItemAnim {
    private static PreviewItemDrawingParams sTmpParams = new PreviewItemDrawingParams(0.0f, 0.0f, 0.0f, 0.0f);
    float finalScale;
    float finalTransX;
    float finalTransY;
    private ValueAnimator mValueAnimator;

    public FolderPreviewItemAnim(final PreviewItemManager previewItemManager, final PreviewItemDrawingParams previewItemDrawingParams, int i10, int i11, int i12, int i13, int i14, final Runnable runnable) {
        previewItemManager.computePreviewItemDrawingParams(i12, i13, sTmpParams);
        PreviewItemDrawingParams previewItemDrawingParams2 = sTmpParams;
        this.finalScale = previewItemDrawingParams2.scale;
        this.finalTransX = previewItemDrawingParams2.transX;
        this.finalTransY = previewItemDrawingParams2.transY;
        previewItemManager.computePreviewItemDrawingParams(i10, i11, previewItemDrawingParams2);
        PreviewItemDrawingParams previewItemDrawingParams3 = sTmpParams;
        final float f10 = previewItemDrawingParams3.scale;
        final float f11 = previewItemDrawingParams3.transX;
        final float f12 = previewItemDrawingParams3.transY;
        ValueAnimator valueAnimatorOfFloat = LauncherAnimUtils.ofFloat(0.0f, 1.0f);
        this.mValueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.folder.FolderPreviewItemAnim.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                PreviewItemDrawingParams previewItemDrawingParams4 = previewItemDrawingParams;
                float f13 = f11;
                FolderPreviewItemAnim folderPreviewItemAnim = FolderPreviewItemAnim.this;
                previewItemDrawingParams4.transX = C4541d.a(folderPreviewItemAnim.finalTransX, f13, animatedFraction, f13);
                float f14 = f12;
                previewItemDrawingParams4.transY = C4541d.a(folderPreviewItemAnim.finalTransY, f14, animatedFraction, f14);
                float f15 = f10;
                previewItemDrawingParams4.scale = C4541d.a(folderPreviewItemAnim.finalScale, f15, animatedFraction, f15);
                previewItemManager.onParamsChanged();
            }
        });
        this.mValueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.folder.FolderPreviewItemAnim.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                previewItemDrawingParams.anim = null;
            }
        });
        this.mValueAnimator.setDuration(i14);
    }

    public void cancel() {
        this.mValueAnimator.cancel();
    }

    public boolean hasEqualFinalState(FolderPreviewItemAnim folderPreviewItemAnim) {
        return this.finalTransY == folderPreviewItemAnim.finalTransY && this.finalTransX == folderPreviewItemAnim.finalTransX && this.finalScale == folderPreviewItemAnim.finalScale;
    }

    public void start() {
        this.mValueAnimator.start();
    }
}
