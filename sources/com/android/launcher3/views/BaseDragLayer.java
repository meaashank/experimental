package com.android.launcher3.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.android.launcher3.AbstractFloatingView;
import com.android.launcher3.BaseActivity;
import com.android.launcher3.BaseDraggingActivity;
import com.android.launcher3.InsettableFrameLayout;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.MultiValueAlpha;
import com.android.launcher3.util.TouchController;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDragLayer<T extends BaseDraggingActivity> extends InsettableFrameLayout {
    protected TouchController mActiveController;
    protected final T mActivity;
    protected TouchController[] mControllers;
    protected final Rect mHitRect;
    private final MultiValueAlpha mMultiValueAlpha;
    protected final int[] mTmpXY;
    private TouchCompleteListener mTouchCompleteListener;

    public interface TouchCompleteListener {
        void onTouchComplete();
    }

    public BaseDragLayer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.mTmpXY = new int[2];
        this.mHitRect = new Rect();
        this.mActivity = (T) BaseActivity.fromContext(context);
        this.mMultiValueAlpha = new MultiValueAlpha(this, i10);
    }

    public static /* synthetic */ void a(View view) {
        AbstractFloatingView abstractFloatingView = (AbstractFloatingView) view;
        if (abstractFloatingView.isOpen()) {
            abstractFloatingView.close(false);
        }
    }

    public void addAccessibleChildToList(View view, ArrayList<View> arrayList) {
        if (view.isImportantForAccessibility()) {
            arrayList.add(view);
        } else {
            view.addChildrenForAccessibility(arrayList);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
        AbstractFloatingView topOpenViewWithType = AbstractFloatingView.getTopOpenViewWithType(this.mActivity, AbstractFloatingView.TYPE_ACCESSIBLE);
        if (topOpenViewWithType != null) {
            addAccessibleChildToList(topOpenViewWithType, arrayList);
        } else {
            super.addChildrenForAccessibility(arrayList);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractFloatingView topOpenView = AbstractFloatingView.getTopOpenView(this.mActivity);
        if (topOpenView != null) {
            topOpenView.addFocusables(arrayList, i10);
        } else {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    @Override // com.android.launcher3.InsettableFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i10) {
        return AbstractFloatingView.getTopOpenView(this.mActivity) != null;
    }

    public boolean findActiveController(MotionEvent motionEvent) {
        this.mActiveController = null;
        AbstractFloatingView topOpenView = AbstractFloatingView.getTopOpenView(this.mActivity);
        if (topOpenView != null && topOpenView.onControllerInterceptTouchEvent(motionEvent)) {
            this.mActiveController = topOpenView;
            return true;
        }
        for (TouchController touchController : this.mControllers) {
            if (touchController.onControllerInterceptTouchEvent(motionEvent)) {
                this.mActiveController = touchController;
                return true;
            }
        }
        return false;
    }

    public MultiValueAlpha.AlphaProperty getAlphaProperty(int i10) {
        return this.mMultiValueAlpha.getProperty(i10);
    }

    public float getDescendantCoordRelativeToSelf(View view, int[] iArr) {
        return getDescendantCoordRelativeToSelf(view, iArr, false);
    }

    public float getDescendantRectRelativeToSelf(View view, Rect rect) {
        int[] iArr = this.mTmpXY;
        iArr[0] = 0;
        iArr[1] = 0;
        float descendantCoordRelativeToSelf = getDescendantCoordRelativeToSelf(view, iArr);
        int[] iArr2 = this.mTmpXY;
        int i10 = iArr2[0];
        rect.set(i10, iArr2[1], (int) ((view.getMeasuredWidth() * descendantCoordRelativeToSelf) + i10), (int) ((view.getMeasuredHeight() * descendantCoordRelativeToSelf) + this.mTmpXY[1]));
        return descendantCoordRelativeToSelf;
    }

    public float getLocationInDragLayer(View view, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        return getDescendantCoordRelativeToSelf(view, iArr);
    }

    public void getViewRectRelativeToSelf(View view, Rect rect) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int i12 = iArr[0] - i10;
        int i13 = iArr[1] - i11;
        rect.set(i12, i13, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i13);
    }

    public boolean isEventOverView(View view, MotionEvent motionEvent) {
        getDescendantRectRelativeToSelf(view, this.mHitRect);
        return this.mHitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public void mapCoordInSelfToDescendant(View view, int[] iArr) {
        Utilities.mapCoordInSelfToDescendant(view, this, iArr);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            TouchCompleteListener touchCompleteListener = this.mTouchCompleteListener;
            if (touchCompleteListener != null) {
                touchCompleteListener.onTouchComplete();
            }
            this.mTouchCompleteListener = null;
        } else if (action == 0) {
            this.mActivity.finishAutoCancelActionMode();
        }
        return findActiveController(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                if (layoutParams2.customPosition) {
                    int i15 = layoutParams2.f136991x;
                    int i16 = layoutParams2.f136992y;
                    childAt.layout(i15, i16, ((FrameLayout.LayoutParams) layoutParams2).width + i15, ((FrameLayout.LayoutParams) layoutParams2).height + i16);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        AbstractFloatingView topOpenView = AbstractFloatingView.getTopOpenView(this.mActivity);
        return topOpenView != null ? topOpenView.requestFocus(i10, rect) : super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AbstractFloatingView topOpenViewWithType = AbstractFloatingView.getTopOpenViewWithType(this.mActivity, AbstractFloatingView.TYPE_ACCESSIBLE);
        if (topOpenViewWithType == null) {
            return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
        }
        if (view == topOpenViewWithType) {
            return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            TouchCompleteListener touchCompleteListener = this.mTouchCompleteListener;
            if (touchCompleteListener != null) {
                touchCompleteListener.onTouchComplete();
            }
            this.mTouchCompleteListener = null;
        }
        TouchController touchController = this.mActiveController;
        return touchController != null ? touchController.onControllerTouchEvent(motionEvent) : findActiveController(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (view instanceof AbstractFloatingView) {
            postDelayed(new Runnable() { // from class: com.android.launcher3.views.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseDragLayer.a(view);
                }
            }, 16L);
        }
    }

    public void setTouchCompleteListener(TouchCompleteListener touchCompleteListener) {
        this.mTouchCompleteListener = touchCompleteListener;
    }

    public static class LayoutParams extends InsettableFrameLayout.LayoutParams {
        public boolean customPosition;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f136991x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f136992y;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.customPosition = false;
        }

        public int getHeight() {
            return ((FrameLayout.LayoutParams) this).height;
        }

        public int getWidth() {
            return ((FrameLayout.LayoutParams) this).width;
        }

        public int getX() {
            return this.f136991x;
        }

        public int getY() {
            return this.f136992y;
        }

        public void setHeight(int i10) {
            ((FrameLayout.LayoutParams) this).height = i10;
        }

        public void setWidth(int i10) {
            ((FrameLayout.LayoutParams) this).width = i10;
        }

        public void setX(int i10) {
            this.f136991x = i10;
        }

        public void setY(int i10) {
            this.f136992y = i10;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.customPosition = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.customPosition = false;
        }
    }

    public float getDescendantCoordRelativeToSelf(View view, int[] iArr, boolean z10) {
        return Utilities.getDescendantCoordRelativeToAncestor(view, this, iArr, z10);
    }

    @Override // com.android.launcher3.InsettableFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // com.android.launcher3.InsettableFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.android.launcher3.InsettableFrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
