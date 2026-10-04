package com.android.launcher3.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.BaseRecyclerView;
import com.android.launcher3.Utilities;
import com.android.launcher3.graphics.FastScrollThumbDrawable;
import com.android.launcher3.util.Themes;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerViewFastScroller extends View {
    private static final float FAST_SCROLL_OVERLAY_Y_OFFSET_FACTOR = 0.75f;
    private static final int MAX_TRACK_ALPHA = 30;
    private static final int SCROLL_BAR_VIS_DURATION = 150;
    private static final int SCROLL_DELTA_THRESHOLD_DP = 4;
    private final boolean mCanThumbDetach;
    private final ViewConfiguration mConfig;
    private final float mDeltaThreshold;
    private int mDownX;
    private int mDownY;
    private int mDy;
    private boolean mIgnoreDragGesture;
    private boolean mIsDragging;
    private boolean mIsThumbDetached;
    private float mLastTouchY;
    private int mLastY;
    private final int mMaxWidth;
    private final int mMinWidth;
    private RecyclerView.r mOnScrollListener;
    private String mPopupSectionName;
    private TextView mPopupView;
    private boolean mPopupVisible;
    protected BaseRecyclerView mRv;
    protected final int mThumbHeight;
    protected int mThumbOffsetY;
    private final int mThumbPadding;
    private final Paint mThumbPaint;
    protected int mTouchOffsetY;
    private final Paint mTrackPaint;
    private int mWidth;
    private ObjectAnimator mWidthAnimator;
    private static final Rect sTempRect = new Rect();
    private static final Property<RecyclerViewFastScroller, Integer> TRACK_WIDTH = new AnonymousClass1(Integer.class, InMobiNetworkValues.WIDTH);

    /* JADX INFO: renamed from: com.android.launcher3.views.RecyclerViewFastScroller$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<RecyclerViewFastScroller, Integer> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Integer get(RecyclerViewFastScroller recyclerViewFastScroller) {
            return Integer.valueOf(recyclerViewFastScroller.mWidth);
        }

        @Override // android.util.Property
        public void set(RecyclerViewFastScroller recyclerViewFastScroller, Integer num) {
            recyclerViewFastScroller.setTrackWidth(num.intValue());
        }
    }

    public RecyclerViewFastScroller(Context context) {
        this(context, null);
    }

    private void animatePopupVisibility(boolean z10) {
        if (this.mPopupVisible != z10) {
            this.mPopupVisible = z10;
            this.mPopupView.animate().cancel();
            this.mPopupView.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(z10 ? 200L : 150L).start();
        }
    }

    private void calcTouchOffsetAndPrepToFastScroll(int i10, int i11) {
        this.mIsDragging = true;
        if (this.mCanThumbDetach) {
            this.mIsThumbDetached = true;
        }
        this.mTouchOffsetY = (i11 - i10) + this.mTouchOffsetY;
        animatePopupVisibility(true);
        showActiveScrollbar(true);
    }

    private boolean isNearThumb(int i10, int i11) {
        int i12 = i11 - this.mThumbOffsetY;
        return i10 >= 0 && i10 < getWidth() && i12 >= 0 && i12 <= this.mThumbHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackWidth(int i10) {
        if (this.mWidth == i10) {
            return;
        }
        this.mWidth = i10;
        invalidate();
    }

    private void showActiveScrollbar(boolean z10) {
        ObjectAnimator objectAnimator = this.mWidthAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, TRACK_WIDTH, z10 ? this.mMaxWidth : this.mMinWidth);
        this.mWidthAnimator = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(150L);
        this.mWidthAnimator.start();
    }

    private void updateFastScrollSectionNameAndThumbOffset(int i10, int i11) {
        int scrollbarTrackHeight = this.mRv.getScrollbarTrackHeight() - this.mThumbHeight;
        float fMax = Math.max(0, Math.min(scrollbarTrackHeight, i11 - this.mTouchOffsetY));
        String strScrollToPositionAtProgress = this.mRv.scrollToPositionAtProgress(fMax / scrollbarTrackHeight);
        if (!strScrollToPositionAtProgress.equals(this.mPopupSectionName)) {
            this.mPopupSectionName = strScrollToPositionAtProgress;
            this.mPopupView.setText(strScrollToPositionAtProgress);
        }
        animatePopupVisibility(!strScrollToPositionAtProgress.isEmpty());
        updatePopupY(i10);
        this.mLastTouchY = fMax;
        setThumbOffsetY((int) fMax);
    }

    private void updatePopupY(int i10) {
        this.mPopupView.setTranslationY(Utilities.boundToRange((i10 - (this.mPopupView.getHeight() * 0.75f)) + this.mRv.getScrollBarTop(), this.mMaxWidth, (this.mRv.getScrollbarTrackHeight() - this.mMaxWidth) - r0));
    }

    public int getThumbHeight() {
        return this.mThumbHeight;
    }

    public int getThumbOffsetY() {
        return this.mThumbOffsetY;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleTouchEvent(android.view.MotionEvent r5, android.graphics.Point r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.views.RecyclerViewFastScroller.handleTouchEvent(android.view.MotionEvent, android.graphics.Point):boolean");
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isDraggingThumb() {
        return this.mIsDragging;
    }

    public boolean isHitInParent(float f10, float f11, Point point) {
        if (this.mThumbOffsetY < 0) {
            return false;
        }
        Rect rect = sTempRect;
        getHitRect(rect);
        int scrollBarTop = this.mRv.getScrollBarTop() + rect.top;
        rect.top = scrollBarTop;
        if (point != null) {
            point.set(rect.left, scrollBarTop);
        }
        return rect.contains((int) f10, (int) f11);
    }

    public boolean isNearScrollBar(int i10) {
        return i10 >= (getWidth() - this.mMaxWidth) / 2 && i10 <= (getWidth() + this.mMaxWidth) / 2;
    }

    public boolean isThumbDetached() {
        return this.mIsThumbDetached;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mThumbOffsetY < 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getWidth() / 2, this.mRv.getScrollBarTop());
        float f10 = this.mWidth / 2;
        float scrollbarTrackHeight = this.mRv.getScrollbarTrackHeight();
        int i10 = this.mWidth;
        canvas.drawRoundRect(-f10, 0.0f, f10, scrollbarTrackHeight, i10, i10, this.mTrackPaint);
        canvas.translate(0.0f, this.mThumbOffsetY);
        int i11 = this.mThumbPadding;
        float f11 = f10 + i11;
        float f12 = this.mWidth + i11 + i11;
        canvas.drawRoundRect(-f11, 0.0f, f11, this.mThumbHeight, f12, f12, this.mThumbPaint);
        canvas.restoreToCount(iSave);
    }

    public void reattachThumbToScroll() {
        this.mIsThumbDetached = false;
    }

    public void setRecyclerView(BaseRecyclerView baseRecyclerView, TextView textView) {
        RecyclerView.r rVar;
        BaseRecyclerView baseRecyclerView2 = this.mRv;
        if (baseRecyclerView2 != null && (rVar = this.mOnScrollListener) != null) {
            baseRecyclerView2.removeOnScrollListener(rVar);
        }
        this.mRv = baseRecyclerView;
        RecyclerView.r rVar2 = new RecyclerView.r() { // from class: com.android.launcher3.views.RecyclerViewFastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.r
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                RecyclerViewFastScroller.this.mDy = i11;
                RecyclerViewFastScroller.this.mRv.onUpdateScrollbar(i11);
            }
        };
        this.mOnScrollListener = rVar2;
        baseRecyclerView.addOnScrollListener(rVar2);
        this.mPopupView = textView;
        textView.setBackground(new FastScrollThumbDrawable(this.mThumbPaint, Utilities.isRtl(getResources())));
    }

    public void setThumbOffsetY(int i10) {
        if (this.mThumbOffsetY == i10) {
            return;
        }
        this.mThumbOffsetY = i10;
        invalidate();
    }

    public boolean shouldBlockIntercept(int i10, int i11) {
        return isNearThumb(i10, i11);
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mDy = 0;
        Paint paint = new Paint();
        this.mTrackPaint = paint;
        paint.setColor(Themes.getAttrColor(context, R.attr.textColorPrimary));
        paint.setAlpha(30);
        Paint paint2 = new Paint();
        this.mThumbPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(Themes.getAttrColor(context, R.attr.colorAccent));
        paint2.setStyle(Paint.Style.FILL);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.fastscroll_track_min_width);
        this.mMinWidth = dimensionPixelSize;
        this.mWidth = dimensionPixelSize;
        this.mMaxWidth = resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.fastscroll_track_max_width);
        this.mThumbPadding = resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.fastscroll_thumb_padding);
        this.mThumbHeight = resources.getDimensionPixelSize(com.app.hider.master.promax.R.dimen.fastscroll_thumb_height);
        this.mConfig = ViewConfiguration.get(context);
        this.mDeltaThreshold = resources.getDisplayMetrics().density * 4.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.launcher3.R.styleable.RecyclerViewFastScroller, i10, 0);
        this.mCanThumbDetach = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
