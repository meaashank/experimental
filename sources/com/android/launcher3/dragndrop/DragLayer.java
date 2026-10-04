package com.android.launcher3.dragndrop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.android.launcher3.AbstractFloatingView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DropTargetBar;
import com.android.launcher3.Launcher;
import com.android.launcher3.ShortcutAndWidgetContainer;
import com.android.launcher3.Workspace;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.compat.AccessibilityManagerCompat;
import com.android.launcher3.folder.Folder;
import com.android.launcher3.folder.FolderIcon;
import com.android.launcher3.graphics.ViewScrim;
import com.android.launcher3.graphics.WorkspaceAndHotseatScrim;
import com.android.launcher3.keyboard.ViewGroupFocusHelper;
import com.android.launcher3.uioverrides.UiFactory;
import com.android.launcher3.views.BaseDragLayer;
import com.app.hider.master.promax.R;
import i.C4541d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DragLayer extends BaseDragLayer<Launcher> {
    private static final int ALPHA_CHANNEL_COUNT = 4;
    public static final int ALPHA_INDEX_LAUNCHER_LOAD = 1;
    public static final int ALPHA_INDEX_OVERLAY = 0;
    public static final int ALPHA_INDEX_SWIPE_UP = 3;
    public static final int ALPHA_INDEX_TRANSITIONS = 2;
    public static final int ANIMATION_END_DISAPPEAR = 0;
    public static final int ANIMATION_END_REMAIN_VISIBLE = 2;
    View mAnchorView;
    int mAnchorViewInitialScrollX;
    private int mChildCountOnLastUpdate;
    private final TimeInterpolator mCubicEaseOutInterpolator;
    DragController mDragController;
    private ValueAnimator mDropAnim;
    DragView mDropView;
    private final ViewGroupFocusHelper mFocusIndicatorHelper;
    private boolean mHoverPointClosesFolder;
    private final WorkspaceAndHotseatScrim mScrim;
    private int mTopViewIndex;

    public DragLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4);
        this.mDropAnim = null;
        this.mCubicEaseOutInterpolator = Interpolators.DEACCEL_1_5;
        this.mDropView = null;
        this.mAnchorViewInitialScrollX = 0;
        this.mAnchorView = null;
        this.mHoverPointClosesFolder = false;
        this.mChildCountOnLastUpdate = -1;
        setMotionEventSplittingEnabled(false);
        setChildrenDrawingOrderEnabled(true);
        this.mFocusIndicatorHelper = new ViewGroupFocusHelper(this);
        this.mScrim = new WorkspaceAndHotseatScrim(this);
    }

    private boolean isEventOverAccessibleDropTargetBar(MotionEvent motionEvent) {
        return isInAccessibleDrag() && isEventOverView(((Launcher) this.mActivity).getDropTargetBar(), motionEvent);
    }

    private boolean isInAccessibleDrag() {
        return ((Launcher) this.mActivity).getAccessibilityDelegate().isInAccessibleDrag();
    }

    private void sendTapOutsideFolderAccessibilityEvent(boolean z10) {
        AccessibilityManagerCompat.sendCustomAccessibilityEvent(this, 8, getContext().getString(z10 ? R.string.folder_tap_to_rename : R.string.folder_tap_to_close));
    }

    private void updateChildIndices() {
        this.mTopViewIndex = -1;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10) instanceof DragView) {
                this.mTopViewIndex = i10;
            }
        }
        this.mChildCountOnLastUpdate = childCount;
    }

    @Override // com.android.launcher3.views.BaseDragLayer, android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
        AbstractFloatingView topOpenViewWithType = AbstractFloatingView.getTopOpenViewWithType(this.mActivity, AbstractFloatingView.TYPE_ACCESSIBLE);
        if (topOpenViewWithType == null) {
            super.addChildrenForAccessibility(arrayList);
            return;
        }
        addAccessibleChildToList(topOpenViewWithType, arrayList);
        if (isInAccessibleDrag()) {
            addAccessibleChildToList(((Launcher) this.mActivity).getDropTargetBar(), arrayList);
        }
    }

    public void animateView(final DragView dragView, final Rect rect, final Rect rect2, final float f10, final float f11, final float f12, final float f13, final float f14, int i10, final Interpolator interpolator, final Interpolator interpolator2, Runnable runnable, int i11, View view) {
        int iMax;
        float fHypot = (float) Math.hypot(rect2.left - rect.left, rect2.top - rect.top);
        Resources resources = getResources();
        float integer = resources.getInteger(R.integer.config_dropAnimMaxDist);
        if (i10 < 0) {
            int integer2 = resources.getInteger(R.integer.config_dropAnimMaxDuration);
            if (fHypot < integer) {
                integer2 = (int) (this.mCubicEaseOutInterpolator.getInterpolation(fHypot / integer) * integer2);
            }
            iMax = Math.max(integer2, resources.getInteger(R.integer.config_dropAnimMinDuration));
        } else {
            iMax = i10;
        }
        TimeInterpolator timeInterpolator = (interpolator2 == null || interpolator == null) ? this.mCubicEaseOutInterpolator : null;
        final float alpha = dragView.getAlpha();
        final float scaleX = dragView.getScaleX();
        animateView(dragView, new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.dragndrop.DragLayer.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int scrollX;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int measuredWidth = dragView.getMeasuredWidth();
                int measuredHeight = dragView.getMeasuredHeight();
                Interpolator interpolator3 = interpolator2;
                float interpolation = interpolator3 == null ? fFloatValue : interpolator3.getInterpolation(fFloatValue);
                Interpolator interpolator4 = interpolator;
                float interpolation2 = interpolator4 == null ? fFloatValue : interpolator4.getInterpolation(fFloatValue);
                float f15 = f11;
                float f16 = scaleX;
                float f17 = f15 * f16;
                float f18 = f12 * f16;
                float f19 = 1.0f - fFloatValue;
                float f20 = (f17 * f19) + (f13 * fFloatValue);
                float f21 = (f19 * f18) + (f14 * fFloatValue);
                float fA = C4541d.a(1.0f, interpolation, alpha, f10 * interpolation);
                Rect rect3 = rect;
                int iRound = (int) ((((f17 - 1.0f) * measuredWidth) / 2.0f) + rect3.left + Math.round((rect2.left - r4) * interpolation2));
                int iRound2 = (int) ((((f18 - 1.0f) * measuredHeight) / 2.0f) + rect3.top + Math.round((rect2.top - r6) * interpolation2));
                View view2 = DragLayer.this.mAnchorView;
                if (view2 == null) {
                    scrollX = 0;
                } else {
                    float scaleX2 = view2.getScaleX();
                    DragLayer dragLayer = DragLayer.this;
                    scrollX = (int) (scaleX2 * (dragLayer.mAnchorViewInitialScrollX - dragLayer.mAnchorView.getScrollX()));
                }
                int scrollX2 = (iRound - DragLayer.this.mDropView.getScrollX()) + scrollX;
                int scrollY = iRound2 - DragLayer.this.mDropView.getScrollY();
                DragLayer.this.mDropView.setTranslationX(scrollX2);
                DragLayer.this.mDropView.setTranslationY(scrollY);
                DragLayer.this.mDropView.setScaleX(f20);
                DragLayer.this.mDropView.setScaleY(f21);
                DragLayer.this.mDropView.setAlpha(fA);
            }
        }, iMax, timeInterpolator, runnable, i11, view);
    }

    public void animateViewIntoPosition(DragView dragView, int[] iArr, float f10, float f11, float f12, int i10, Runnable runnable, int i11) {
        Rect rect = new Rect();
        getViewRectRelativeToSelf(dragView, rect);
        animateViewIntoPosition(dragView, rect.left, rect.top, iArr[0], iArr[1], f10, 1.0f, 1.0f, f11, f12, runnable, i10, i11, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        updateChildIndices();
    }

    public void clearAnimatedView() {
        ValueAnimator valueAnimator = this.mDropAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mDropAnim = null;
        DragView dragView = this.mDropView;
        if (dragView != null) {
            this.mDragController.onDeferredEndDrag(dragView);
        }
        this.mDropView = null;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.mScrim.draw(canvas);
        this.mFocusIndicatorHelper.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.mDragController.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.offsetLocation(getTranslationX(), 0.0f);
        try {
            return super.dispatchTouchEvent(motionEvent);
        } finally {
            motionEvent.offsetLocation(-getTranslationX(), 0.0f);
        }
    }

    @Override // com.android.launcher3.views.BaseDragLayer, android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i10) {
        return super.dispatchUnhandledMove(view, i10) || this.mDragController.dispatchUnhandledMove(view, i10);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ViewScrim viewScrim = ViewScrim.get(view);
        if (viewScrim != null) {
            viewScrim.draw(canvas, getWidth(), getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // com.android.launcher3.views.BaseDragLayer
    public boolean findActiveController(MotionEvent motionEvent) {
        if (!((Launcher) this.mActivity).getStateManager().getState().disableInteraction) {
            return super.findActiveController(motionEvent);
        }
        this.mActiveController = null;
        return true;
    }

    public View getAnimatedView() {
        return this.mDropView;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.mChildCountOnLastUpdate != i10) {
            updateChildIndices();
        }
        int i12 = this.mTopViewIndex;
        if (i12 != -1) {
            if (i11 == i10 - 1) {
                return i12;
            }
            if (i11 >= i12) {
                return i11 + 1;
            }
        }
        return i11;
    }

    public ViewGroupFocusHelper getFocusIndicatorHelper() {
        return this.mFocusIndicatorHelper;
    }

    public WorkspaceAndHotseatScrim getScrim() {
        return this.mScrim;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        T t10 = this.mActivity;
        if (t10 != 0 && ((Launcher) t10).getWorkspace() != null) {
            AbstractFloatingView topOpenView = AbstractFloatingView.getTopOpenView(this.mActivity);
            if ((topOpenView instanceof Folder) && ((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                Folder folder = (Folder) topOpenView;
                int action = motionEvent.getAction();
                if (action == 7) {
                    boolean z10 = isEventOverView(topOpenView, motionEvent) || isEventOverAccessibleDropTargetBar(motionEvent);
                    if (!z10 && !this.mHoverPointClosesFolder) {
                        sendTapOutsideFolderAccessibilityEvent(folder.isEditingName());
                        this.mHoverPointClosesFolder = true;
                        return true;
                    }
                    if (!z10) {
                        return true;
                    }
                    this.mHoverPointClosesFolder = false;
                } else if (action == 9) {
                    if (isEventOverView(topOpenView, motionEvent) || isEventOverAccessibleDropTargetBar(motionEvent)) {
                        this.mHoverPointClosesFolder = false;
                        return false;
                    }
                    sendTapOutsideFolderAccessibilityEvent(folder.isEditingName());
                    this.mHoverPointClosesFolder = true;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.android.launcher3.views.BaseDragLayer, android.view.ViewGroup
    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (isInAccessibleDrag() && (view instanceof DropTargetBar)) {
            return true;
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.mScrim.setSize(i10, i11);
    }

    @Override // com.android.launcher3.InsettableFrameLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        updateChildIndices();
    }

    @Override // com.android.launcher3.views.BaseDragLayer, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateChildIndices();
    }

    public void recreateControllers() {
        this.mControllers = UiFactory.createTouchControllers((Launcher) this.mActivity);
    }

    @Override // com.android.launcher3.InsettableFrameLayout, com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        super.setInsets(rect);
        this.mScrim.onInsetsChanged(rect);
    }

    public void setup(DragController dragController, Workspace workspace) {
        this.mDragController = dragController;
        this.mScrim.setWorkspace(workspace);
        recreateControllers();
    }

    public void animateViewIntoPosition(DragView dragView, View view, View view2) {
        animateViewIntoPosition(dragView, view, -1, view2);
    }

    public void animateViewIntoPosition(DragView dragView, final View view, int i10, View view2) {
        int iRound;
        int iRound2;
        int measuredWidth;
        float intrinsicIconScaleFactor;
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = (ShortcutAndWidgetContainer) view.getParent();
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        shortcutAndWidgetContainer.measureChild(view);
        Rect rect = new Rect();
        getViewRectRelativeToSelf(dragView, rect);
        float scaleX = view.getScaleX();
        float f10 = 1.0f - scaleX;
        int[] iArr = {layoutParams.f136867x + ((int) ((view.getMeasuredWidth() * f10) / 2.0f)), layoutParams.f136868y + ((int) ((view.getMeasuredHeight() * f10) / 2.0f))};
        float descendantCoordRelativeToSelf = getDescendantCoordRelativeToSelf((View) view.getParent(), iArr) * scaleX;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (view instanceof TextView) {
            intrinsicIconScaleFactor = descendantCoordRelativeToSelf / dragView.getIntrinsicIconScaleFactor();
            iRound = (int) ((Math.round(((TextView) view).getPaddingTop() * intrinsicIconScaleFactor) + i12) - (((1.0f - intrinsicIconScaleFactor) * dragView.getMeasuredHeight()) / 2.0f));
            if (dragView.getDragVisualizeOffset() != null) {
                iRound -= Math.round(dragView.getDragVisualizeOffset().y * intrinsicIconScaleFactor);
            }
            measuredWidth = i11 - ((dragView.getMeasuredWidth() - Math.round(descendantCoordRelativeToSelf * view.getMeasuredWidth())) / 2);
        } else {
            if (view instanceof FolderIcon) {
                iRound = (int) (((int) ((Math.round((view.getPaddingTop() - dragView.getDragRegionTop()) * descendantCoordRelativeToSelf) + i12) - ((dragView.getBlurSizeOutline() * descendantCoordRelativeToSelf) / 2.0f))) - (((1.0f - descendantCoordRelativeToSelf) * dragView.getMeasuredHeight()) / 2.0f));
                iRound2 = (dragView.getMeasuredWidth() - Math.round(view.getMeasuredWidth() * descendantCoordRelativeToSelf)) / 2;
            } else {
                iRound = i12 - (Math.round((dragView.getHeight() - view.getMeasuredHeight()) * descendantCoordRelativeToSelf) / 2);
                iRound2 = Math.round((dragView.getMeasuredWidth() - view.getMeasuredWidth()) * descendantCoordRelativeToSelf) / 2;
            }
            measuredWidth = i11 - iRound2;
            intrinsicIconScaleFactor = descendantCoordRelativeToSelf;
        }
        int i13 = iRound;
        int i14 = rect.left;
        int i15 = rect.top;
        view.setVisibility(4);
        animateViewIntoPosition(dragView, i14, i15, measuredWidth, i13, 1.0f, 1.0f, 1.0f, intrinsicIconScaleFactor, intrinsicIconScaleFactor, new Runnable() { // from class: com.android.launcher3.dragndrop.d
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        }, 0, i10, view2);
    }

    public void animateView(DragView dragView, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i10, TimeInterpolator timeInterpolator, final Runnable runnable, final int i11, View view) {
        ValueAnimator valueAnimator = this.mDropAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mDropView = dragView;
        dragView.cancelAnimation();
        this.mDropView.requestLayout();
        if (view != null) {
            this.mAnchorViewInitialScrollX = view.getScrollX();
        }
        this.mAnchorView = view;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.mDropAnim = valueAnimator2;
        valueAnimator2.setInterpolator(timeInterpolator);
        this.mDropAnim.setDuration(i10);
        this.mDropAnim.setFloatValues(0.0f, 1.0f);
        this.mDropAnim.addUpdateListener(animatorUpdateListener);
        this.mDropAnim.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.dragndrop.DragLayer.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (i11 == 0) {
                    DragLayer.this.clearAnimatedView();
                }
                DragLayer.this.mDropAnim = null;
            }
        });
        this.mDropAnim.start();
    }

    public void animateViewIntoPosition(DragView dragView, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13, float f14, Runnable runnable, int i14, int i15, View view) {
        animateView(dragView, new Rect(i10, i11, dragView.getMeasuredWidth() + i10, dragView.getMeasuredHeight() + i11), new Rect(i12, i13, dragView.getMeasuredWidth() + i12, dragView.getMeasuredHeight() + i13), f10, f11, f12, f13, f14, i15, null, null, runnable, i14, view);
    }
}
