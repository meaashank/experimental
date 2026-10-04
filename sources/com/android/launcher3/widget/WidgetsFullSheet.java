package com.android.launcher3.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.android.launcher3.DropTarget;
import com.android.launcher3.Insettable;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherAppWidgetHost;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.views.AbstractSlideInView;
import com.android.launcher3.views.RecyclerViewFastScroller;
import com.android.launcher3.views.TopRoundedCornerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetsFullSheet extends BaseWidgetSheet implements Insettable, LauncherAppWidgetHost.ProviderChangedListener {
    private static final long DEFAULT_OPEN_DURATION = 267;
    private static final long FADE_IN_DURATION = 150;
    private static final float VERTICAL_START_POSITION = 0.3f;
    private final WidgetsListAdapter mAdapter;
    private final Rect mInsets;
    private WidgetsRecyclerView mRecyclerView;

    public WidgetsFullSheet(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mInsets = new Rect();
        LauncherAppState launcherAppState = LauncherAppState.getInstance(context);
        this.mAdapter = new WidgetsListAdapter(context, LayoutInflater.from(context), launcherAppState.getWidgetCache(), launcherAppState.getIconCache(), this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0() {
        this.mRecyclerView.setLayoutFrozen(true);
        this.mOpenCloseAnimator.start();
        this.mContent.animate().alpha(1.0f).setDuration(150L);
    }

    private void open(boolean z10) {
        if (!z10) {
            setTranslationShift(0.0f);
            this.mAdapter.setApplyBitmapDeferred(false, this.mRecyclerView);
            post(new Runnable() { // from class: com.android.launcher3.widget.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136998a.announceAccessibilityChanges();
                }
            });
            return;
        }
        if (this.mLauncher.getDragLayer().getInsets().bottom > 0) {
            this.mContent.setAlpha(0.0f);
            setTranslationShift(0.3f);
        }
        this.mOpenCloseAnimator.setValues(PropertyValuesHolder.ofFloat(AbstractSlideInView.TRANSLATION_SHIFT, 0.0f));
        this.mOpenCloseAnimator.setDuration(DEFAULT_OPEN_DURATION).setInterpolator(AnimationUtils.loadInterpolator(getContext(), 17563662));
        this.mOpenCloseAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.widget.WidgetsFullSheet.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                WidgetsFullSheet.this.mRecyclerView.setLayoutFrozen(false);
                WidgetsFullSheet.this.mAdapter.setApplyBitmapDeferred(false, WidgetsFullSheet.this.mRecyclerView);
                ((AbstractSlideInView) WidgetsFullSheet.this).mOpenCloseAnimator.removeListener(this);
            }
        });
        post(new Runnable() { // from class: com.android.launcher3.widget.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f136997a.lambda$open$0();
            }
        });
    }

    public static WidgetsFullSheet show(Launcher launcher, boolean z10) {
        WidgetsFullSheet widgetsFullSheet = (WidgetsFullSheet) launcher.getLayoutInflater().inflate(R.layout.widgets_full_sheet, (ViewGroup) launcher.getDragLayer(), false);
        widgetsFullSheet.mIsOpen = true;
        launcher.getDragLayer().addView(widgetsFullSheet);
        widgetsFullSheet.open(z10);
        return widgetsFullSheet;
    }

    @Override // com.android.launcher3.widget.BaseWidgetSheet, com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public /* bridge */ /* synthetic */ void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        super.fillInLogContainerData(view, itemInfo, target, target2);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public Pair<View, String> getAccessibilityTarget() {
        return Pair.create(this.mRecyclerView, getContext().getString(this.mIsOpen ? R.string.widgets_list : R.string.widgets_list_closed));
    }

    @Override // com.android.launcher3.widget.BaseWidgetSheet
    public int getElementsRowCount() {
        return this.mAdapter.getItemCount();
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void handleClose(boolean z10) {
        handleClose(z10, DEFAULT_OPEN_DURATION);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public boolean isOfType(int i10) {
        return (i10 & 16) != 0;
    }

    @Override // com.android.launcher3.LauncherAppWidgetHost.ProviderChangedListener
    public void notifyWidgetProvidersChanged() {
        this.mLauncher.refreshAndBindWidgetsForPackageUser(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLauncher.getAppWidgetHost().addProviderChangeListener(this);
        notifyWidgetProvidersChanged();
    }

    @Override // com.android.launcher3.views.AbstractSlideInView, com.android.launcher3.util.TouchController
    public boolean onControllerInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mNoIntercept = false;
            RecyclerViewFastScroller scrollbar = this.mRecyclerView.getScrollbar();
            if (scrollbar.getThumbOffsetY() >= 0 && this.mLauncher.getDragLayer().isEventOverView(scrollbar, motionEvent)) {
                this.mNoIntercept = true;
            } else if (this.mLauncher.getDragLayer().isEventOverView(this.mContent, motionEvent)) {
                this.mNoIntercept = !this.mRecyclerView.shouldContainerScroll(motionEvent, this.mLauncher.getDragLayer());
            }
        }
        return super.onControllerInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mLauncher.getAppWidgetHost().removeProviderChangeListener(this);
    }

    @Override // com.android.launcher3.widget.BaseWidgetSheet, com.android.launcher3.DragSource
    public /* bridge */ /* synthetic */ void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z10) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mContent = findViewById(R.id.container);
        WidgetsRecyclerView widgetsRecyclerView = (WidgetsRecyclerView) findViewById(R.id.widgets_list_view);
        this.mRecyclerView = widgetsRecyclerView;
        widgetsRecyclerView.setAdapter(this.mAdapter);
        this.mAdapter.setApplyBitmapDeferred(true, this.mRecyclerView);
        TopRoundedCornerView topRoundedCornerView = (TopRoundedCornerView) this.mContent;
        topRoundedCornerView.addSpringView(R.id.widgets_list_view);
        this.mRecyclerView.setEdgeEffectFactory(topRoundedCornerView.createEdgeEffectFactory());
        onWidgetsBound();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int measuredWidth = this.mContent.getMeasuredWidth();
        int i15 = ((i12 - i10) - measuredWidth) / 2;
        View view = this.mContent;
        view.layout(i15, i14 - view.getMeasuredHeight(), measuredWidth + i15, i14);
        setTranslationShift(this.mTranslationShift);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iMax;
        if (this.mInsets.bottom > 0) {
            iMax = 0;
        } else {
            Rect rect = this.mLauncher.getDeviceProfile().workspacePadding;
            int i12 = rect.left + rect.right;
            Rect rect2 = this.mInsets;
            iMax = Math.max(i12, (rect2.left + rect2.right) * 2);
        }
        int i13 = iMax;
        measureChildWithMargins(this.mContent, i10, i13, i11, this.mInsets.top + this.mLauncher.getDeviceProfile().edgeMarginPx);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void onWidgetsBound() {
        this.mAdapter.setWidgets(this.mLauncher.getPopupDataProvider().getAllWidgets());
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        this.mInsets.set(rect);
        WidgetsRecyclerView widgetsRecyclerView = this.mRecyclerView;
        widgetsRecyclerView.setPadding(widgetsRecyclerView.getPaddingLeft(), this.mRecyclerView.getPaddingTop(), this.mRecyclerView.getPaddingRight(), rect.bottom);
        if (rect.bottom > 0) {
            setupNavBarColor();
        } else {
            clearNavBarColor();
        }
        ((TopRoundedCornerView) this.mContent).setNavBarScrimHeight(this.mInsets.bottom);
        requestLayout();
    }

    public WidgetsFullSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
