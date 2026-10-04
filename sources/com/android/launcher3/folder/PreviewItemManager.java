package com.android.launcher3.folder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PreviewItemManager {
    private static final int FINAL_ITEM_ANIMATION_DURATION = 200;
    static final int INITIAL_ITEM_ANIMATION_DURATION = 350;
    private static final int ITEM_SLIDE_IN_OUT_DISTANCE_PX = 200;
    private static final int SLIDE_IN_FIRST_PAGE_ANIMATION_DURATION = 300;
    private static final int SLIDE_IN_FIRST_PAGE_ANIMATION_DURATION_DELAY = 100;
    private FolderIcon mIcon;
    private boolean mShouldSlideInFirstPage;
    private float mIntrinsicIconSize = -1.0f;
    private int mTotalWidth = -1;
    private int mPrevTopPadding = -1;
    private Drawable mReferenceDrawable = null;
    private ArrayList<PreviewItemDrawingParams> mFirstPageParams = new ArrayList<>();
    private ArrayList<PreviewItemDrawingParams> mCurrentPageParams = new ArrayList<>();
    private float mCurrentPageItemsTransX = 0.0f;

    public PreviewItemManager(FolderIcon folderIcon) {
        this.mIcon = folderIcon;
    }

    private void computePreviewDrawingParams(int i10, int i11) {
        float f10 = i10;
        if (this.mIntrinsicIconSize == f10 && this.mTotalWidth == i11 && this.mPrevTopPadding == this.mIcon.getPaddingTop()) {
            return;
        }
        this.mIntrinsicIconSize = f10;
        this.mTotalWidth = i11;
        this.mPrevTopPadding = this.mIcon.getPaddingTop();
        FolderIcon folderIcon = this.mIcon;
        folderIcon.mBackground.setup(folderIcon.mLauncher, folderIcon, this.mTotalWidth, folderIcon.getPaddingTop());
        FolderIcon folderIcon2 = this.mIcon;
        folderIcon2.mPreviewLayoutRule.init(folderIcon2.mBackground.previewSize, this.mIntrinsicIconSize, Utilities.isRtl(folderIcon2.getResources()));
        updatePreviewItems(false);
    }

    private void drawPreviewItem(Canvas canvas, PreviewItemDrawingParams previewItemDrawingParams) {
        canvas.save();
        canvas.translate(previewItemDrawingParams.transX, previewItemDrawingParams.transY);
        float f10 = previewItemDrawingParams.scale;
        canvas.scale(f10, f10);
        Drawable drawable = previewItemDrawingParams.drawable;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            canvas.save();
            canvas.translate(-bounds.left, -bounds.top);
            canvas.scale(this.mIntrinsicIconSize / bounds.width(), this.mIntrinsicIconSize / bounds.height());
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    private PreviewItemDrawingParams getFinalIconParams(PreviewItemDrawingParams previewItemDrawingParams) {
        float f10 = this.mIcon.mLauncher.getDeviceProfile().iconSizePx;
        float f11 = (this.mIcon.mBackground.previewSize - f10) / 2.0f;
        previewItemDrawingParams.update(f11, f11, f10 / this.mReferenceDrawable.getIntrinsicWidth());
        return previewItemDrawingParams;
    }

    private void updateTransitionParam(PreviewItemDrawingParams previewItemDrawingParams, BubbleTextView bubbleTextView, int i10, int i11, int i12) {
        previewItemDrawingParams.drawable = bubbleTextView.getCompoundDrawables()[1];
        if (!this.mIcon.mFolder.isOpen()) {
            previewItemDrawingParams.drawable.setCallback(this.mIcon);
        }
        FolderPreviewItemAnim folderPreviewItemAnim = new FolderPreviewItemAnim(this, previewItemDrawingParams, i10, i12, i11, i12, 400, null);
        FolderPreviewItemAnim folderPreviewItemAnim2 = previewItemDrawingParams.anim;
        if (folderPreviewItemAnim2 != null && !folderPreviewItemAnim2.hasEqualFinalState(folderPreviewItemAnim)) {
            previewItemDrawingParams.anim.cancel();
        }
        previewItemDrawingParams.anim = folderPreviewItemAnim;
    }

    public void buildParamsForPage(int i10, ArrayList<PreviewItemDrawingParams> arrayList, boolean z10) {
        ArrayList arrayList2;
        List<BubbleTextView> previewItemsOnPage = this.mIcon.getPreviewItemsOnPage(i10);
        int size = arrayList.size();
        while (true) {
            arrayList2 = (ArrayList) previewItemsOnPage;
            if (arrayList2.size() >= arrayList.size()) {
                break;
            } else {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        while (arrayList2.size() > arrayList.size()) {
            arrayList.add(new PreviewItemDrawingParams(0.0f, 0.0f, 0.0f, 0.0f));
        }
        int size2 = i10 == 0 ? arrayList2.size() : 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            PreviewItemDrawingParams previewItemDrawingParams = arrayList.get(i11);
            Drawable drawable = ((BubbleTextView) arrayList2.get(i11)).getCompoundDrawables()[1];
            previewItemDrawingParams.drawable = drawable;
            if (drawable != null && !this.mIcon.mFolder.isOpen()) {
                previewItemDrawingParams.drawable.setCallback(this.mIcon);
            }
            if (z10) {
                FolderPreviewItemAnim folderPreviewItemAnim = new FolderPreviewItemAnim(this, previewItemDrawingParams, i11, size, i11, size2, 400, null);
                FolderPreviewItemAnim folderPreviewItemAnim2 = previewItemDrawingParams.anim;
                if (folderPreviewItemAnim2 == null) {
                    previewItemDrawingParams.anim = folderPreviewItemAnim;
                    folderPreviewItemAnim.start();
                } else if (!folderPreviewItemAnim2.hasEqualFinalState(folderPreviewItemAnim)) {
                    previewItemDrawingParams.anim.cancel();
                    previewItemDrawingParams.anim = folderPreviewItemAnim;
                    folderPreviewItemAnim.start();
                }
            } else {
                computePreviewItemDrawingParams(i11, size2, previewItemDrawingParams);
                if (this.mReferenceDrawable == null) {
                    this.mReferenceDrawable = previewItemDrawingParams.drawable;
                }
            }
        }
    }

    public PreviewItemDrawingParams computePreviewItemDrawingParams(int i10, int i11, PreviewItemDrawingParams previewItemDrawingParams) {
        return i10 == -1 ? getFinalIconParams(previewItemDrawingParams) : this.mIcon.mPreviewLayoutRule.computePreviewItemDrawingParams(i10, i11, previewItemDrawingParams);
    }

    public FolderPreviewItemAnim createFirstItemAnimation(boolean z10, Runnable runnable) {
        return z10 ? new FolderPreviewItemAnim(this, this.mFirstPageParams.get(0), 0, 2, -1, -1, 200, runnable) : new FolderPreviewItemAnim(this, this.mFirstPageParams.get(0), -1, -1, 0, 2, INITIAL_ITEM_ANIMATION_DURATION, runnable);
    }

    public void draw(Canvas canvas) {
        float f10;
        PreviewBackground folderBackground = this.mIcon.getFolderBackground();
        canvas.translate(folderBackground.basePreviewOffsetX, folderBackground.basePreviewOffsetY);
        if (this.mShouldSlideInFirstPage) {
            drawParams(canvas, this.mCurrentPageParams, this.mCurrentPageItemsTransX);
            f10 = this.mCurrentPageItemsTransX - 200.0f;
        } else {
            f10 = 0.0f;
        }
        drawParams(canvas, this.mFirstPageParams, f10);
        canvas.translate(-folderBackground.basePreviewOffsetX, -folderBackground.basePreviewOffsetY);
    }

    public void drawParams(Canvas canvas, ArrayList<PreviewItemDrawingParams> arrayList, float f10) {
        canvas.translate(f10, 0.0f);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            PreviewItemDrawingParams previewItemDrawingParams = arrayList.get(size);
            if (!previewItemDrawingParams.hidden) {
                drawPreviewItem(canvas, previewItemDrawingParams);
            }
        }
        canvas.translate(-f10, 0.0f);
    }

    public float getIntrinsicIconSize() {
        return this.mIntrinsicIconSize;
    }

    public void hidePreviewItem(int i10, boolean z10) {
        int iMax = Math.max(this.mFirstPageParams.size() - 4, 0) + i10;
        PreviewItemDrawingParams previewItemDrawingParams = iMax < this.mFirstPageParams.size() ? this.mFirstPageParams.get(iMax) : null;
        if (previewItemDrawingParams != null) {
            previewItemDrawingParams.hidden = z10;
        }
    }

    public void onDrop(List<BubbleTextView> list, List<BubbleTextView> list2, ShortcutInfo shortcutInfo) {
        int size = list2.size();
        ArrayList<PreviewItemDrawingParams> arrayList = this.mFirstPageParams;
        buildParamsForPage(0, arrayList, false);
        ArrayList arrayList2 = new ArrayList();
        for (BubbleTextView bubbleTextView : list2) {
            if (!list.contains(bubbleTextView) && !bubbleTextView.getTag().equals(shortcutInfo)) {
                arrayList2.add(bubbleTextView);
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            int iIndexOf = list2.indexOf(arrayList2.get(i10));
            PreviewItemDrawingParams previewItemDrawingParams = arrayList.get(iIndexOf);
            computePreviewItemDrawingParams(iIndexOf, size, previewItemDrawingParams);
            updateTransitionParam(previewItemDrawingParams, (BubbleTextView) arrayList2.get(i10), -3, list2.indexOf(arrayList2.get(i10)), size);
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            int iIndexOf2 = list.indexOf(list2.get(i11));
            if (iIndexOf2 >= 0 && i11 != iIndexOf2) {
                updateTransitionParam(arrayList.get(i11), list2.get(i11), iIndexOf2, i11, size);
            }
        }
        PreviewItemManager previewItemManager = this;
        ArrayList arrayList3 = new ArrayList(list);
        arrayList3.removeAll(list2);
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            BubbleTextView bubbleTextView2 = (BubbleTextView) arrayList3.get(i12);
            int iIndexOf3 = list.indexOf(bubbleTextView2);
            PreviewItemDrawingParams previewItemDrawingParamsComputePreviewItemDrawingParams = computePreviewItemDrawingParams(iIndexOf3, size, null);
            previewItemManager.updateTransitionParam(previewItemDrawingParamsComputePreviewItemDrawingParams, bubbleTextView2, iIndexOf3, -2, size);
            arrayList.add(0, previewItemDrawingParamsComputePreviewItemDrawingParams);
            i12++;
            previewItemManager = this;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (arrayList.get(i13).anim != null) {
                arrayList.get(i13).anim.start();
            }
        }
    }

    public void onFolderClose(int i10) {
        boolean z10 = i10 != 0;
        this.mShouldSlideInFirstPage = z10;
        if (z10) {
            this.mCurrentPageItemsTransX = 0.0f;
            buildParamsForPage(i10, this.mCurrentPageParams, false);
            onParamsChanged();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 200.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.folder.PreviewItemManager.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewItemManager.this.mCurrentPageItemsTransX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewItemManager.this.onParamsChanged();
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.folder.PreviewItemManager.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PreviewItemManager.this.mCurrentPageParams.clear();
                }
            });
            valueAnimatorOfFloat.setStartDelay(100L);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
        }
    }

    public void onParamsChanged() {
        this.mIcon.invalidate();
    }

    public Drawable prepareCreateAnimation(View view) {
        Drawable drawable = ((TextView) view).getCompoundDrawables()[1];
        computePreviewDrawingParams(drawable.getIntrinsicWidth(), view.getMeasuredWidth());
        this.mReferenceDrawable = drawable;
        return drawable;
    }

    public void recomputePreviewDrawingParams() {
        Drawable drawable = this.mReferenceDrawable;
        if (drawable != null) {
            computePreviewDrawingParams(drawable.getIntrinsicWidth(), this.mIcon.getMeasuredWidth());
        }
    }

    public void updatePreviewItems(boolean z10) {
        buildParamsForPage(0, this.mFirstPageParams, z10);
    }

    public boolean verifyDrawable(@NonNull Drawable drawable) {
        for (int i10 = 0; i10 < this.mFirstPageParams.size(); i10++) {
            if (this.mFirstPageParams.get(i10).drawable == drawable) {
                return true;
            }
        }
        return false;
    }
}
