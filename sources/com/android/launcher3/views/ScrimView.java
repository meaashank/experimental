package com.android.launcher3.views;

import G0.C1162y;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.Insettable;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherState;
import com.android.launcher3.LauncherStateManager;
import com.android.launcher3.Utilities;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.uioverrides.WallpaperColorInfo;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ScrimView extends View implements Insettable, WallpaperColorInfo.OnChangeListener, AccessibilityManager.AccessibilityStateChangeListener, LauncherStateManager.StateListener {
    public static final Property<ScrimView, Integer> DRAG_HANDLE_ALPHA = new AnonymousClass1(Integer.TYPE, "dragHandleAlpha");
    private static final int SETTINGS = 2132018857;
    private static final int WALLPAPERS = 2132019252;
    private static final int WIDGETS = 2132019264;
    private final AccessibilityManager mAM;
    private final AccessibilityHelper mAccessibilityHelper;
    protected int mCurrentFlatColor;

    @Nullable
    protected Drawable mDragHandle;
    private int mDragHandleAlpha;
    private final Rect mDragHandleBounds;
    protected final int mDragHandleSize;
    protected int mEndFlatColor;
    protected int mEndFlatColorAlpha;
    protected final int mEndScrim;
    private final RectF mHitRect;
    protected final Launcher mLauncher;
    protected float mMaxScrimAlpha;
    protected float mProgress;
    protected int mScrimColor;
    private final int[] mTempPos;
    private final Rect mTempRect;
    private final WallpaperColorInfo mWallpaperColorInfo;

    /* JADX INFO: renamed from: com.android.launcher3.views.ScrimView$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<ScrimView, Integer> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Integer get(ScrimView scrimView) {
            return Integer.valueOf(scrimView.mDragHandleAlpha);
        }

        @Override // android.util.Property
        public void set(ScrimView scrimView, Integer num) {
            scrimView.setDragHandleAlpha(num.intValue());
        }
    }

    public class AccessibilityHelper extends androidx.customview.widget.a {
        private static final int DRAG_HANDLE_ID = 1;

        public AccessibilityHelper() {
            super(ScrimView.this);
        }

        @Override // androidx.customview.widget.a
        public int getVirtualViewAt(float f10, float f11) {
            return ScrimView.this.mDragHandleBounds.contains((int) f10, (int) f11) ? 1 : Integer.MIN_VALUE;
        }

        @Override // androidx.customview.widget.a
        public void getVisibleVirtualViews(List<Integer> list) {
            list.add(1);
        }

        @Override // androidx.customview.widget.a
        public boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                ScrimView.this.mLauncher.getUserEventDispatcher().logActionOnControl(0, 1, ScrimView.this.mLauncher.getStateManager().getState().containerType);
                ScrimView.this.mLauncher.getStateManager().goToState(LauncherState.ALL_APPS);
                return true;
            }
            if (i11 == R.string.wallpaper_button_text) {
                return OptionsPopupView.startWallpaperPicker(ScrimView.this);
            }
            if (i11 == R.string.widget_button_text) {
                return OptionsPopupView.onWidgetsClicked(ScrimView.this);
            }
            if (i11 != R.string.settings_button_text) {
                return false;
            }
            OptionsPopupView.startSettings(ScrimView.this);
            return true;
        }

        @Override // androidx.customview.widget.a
        public void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.o1(ScrimView.this.getContext().getString(R.string.all_apps_button_label));
            accessibilityNodeInfoCompat.d1(ScrimView.this.mDragHandleBounds);
            ScrimView scrimView = ScrimView.this;
            scrimView.getLocationOnScreen(scrimView.mTempPos);
            ScrimView.this.mTempRect.set(ScrimView.this.mDragHandleBounds);
            ScrimView.this.mTempRect.offset(ScrimView.this.mTempPos[0], ScrimView.this.mTempPos[1]);
            accessibilityNodeInfoCompat.e1(ScrimView.this.mTempRect);
            accessibilityNodeInfoCompat.a(16);
            accessibilityNodeInfoCompat.k1(true);
            accessibilityNodeInfoCompat.w1(true);
            if (ScrimView.this.mLauncher.isInState(LauncherState.NORMAL)) {
                Context context = ScrimView.this.getContext();
                if (Utilities.isWallpaperAllowed(context)) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.a(R.string.wallpaper_button_text, context.getText(R.string.wallpaper_button_text)));
                }
                accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.a(R.string.widget_button_text, context.getText(R.string.widget_button_text)));
                accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.a(R.string.settings_button_text, context.getText(R.string.settings_button_text)));
            }
        }
    }

    public ScrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTempRect = new Rect();
        this.mTempPos = new int[2];
        this.mProgress = 1.0f;
        this.mHitRect = new RectF();
        this.mDragHandleAlpha = 255;
        this.mLauncher = Launcher.getLauncher(context);
        this.mWallpaperColorInfo = WallpaperColorInfo.getInstance(context);
        this.mEndScrim = Themes.getAttrColor(context, R.attr.allAppsScrimColor);
        this.mMaxScrimAlpha = 0.7f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vertical_drag_handle_size);
        this.mDragHandleSize = dimensionPixelSize;
        this.mDragHandleBounds = new Rect(0, 0, dimensionPixelSize, dimensionPixelSize);
        AccessibilityHelper accessibilityHelperCreateAccessibilityHelper = createAccessibilityHelper();
        this.mAccessibilityHelper = accessibilityHelperCreateAccessibilityHelper;
        C2507z0.G1(this, accessibilityHelperCreateAccessibilityHelper);
        this.mAM = (AccessibilityManager) context.getSystemService("accessibility");
        setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEvent$0(Rect rect, ValueAnimator valueAnimator) {
        invalidate(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDragHandleAlpha(int i10) {
        if (i10 != this.mDragHandleAlpha) {
            this.mDragHandleAlpha = i10;
            Drawable drawable = this.mDragHandle;
            if (drawable != null) {
                drawable.setAlpha(i10);
                invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDragHandleVisibility(Drawable drawable) {
        boolean z10 = this.mLauncher.getDeviceProfile().isVerticalBarLayout() || this.mAM.isEnabled();
        if (z10 != (this.mDragHandle != null)) {
            if (z10) {
                if (drawable == null) {
                    drawable = this.mLauncher.getDrawable(R.drawable.drag_handle_indicator);
                }
                this.mDragHandle = drawable;
                drawable.setBounds(this.mDragHandleBounds);
                updateDragHandleAlpha();
            } else {
                this.mDragHandle = null;
            }
            invalidate();
        }
    }

    @NonNull
    public AccessibilityHelper createAccessibilityHelper() {
        return new AccessibilityHelper();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.mAccessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.mAccessibilityHelper.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public int getDragHandleSize() {
        return this.mDragHandleSize;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        LauncherStateManager stateManager = this.mLauncher.getStateManager();
        stateManager.removeStateListener(this);
        if (z10) {
            stateManager.addStateListener(this);
            onStateSetImmediately(this.mLauncher.getStateManager().getState());
        } else {
            setImportantForAccessibility(4);
        }
        updateDragHandleVisibility(null);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mWallpaperColorInfo.addOnChangeListener(this);
        onExtractedColorsChanged(this.mWallpaperColorInfo);
        this.mAM.addAccessibilityStateChangeListener(this);
        onAccessibilityStateChanged(this.mAM.isEnabled());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mWallpaperColorInfo.removeOnChangeListener(this);
        this.mAM.removeAccessibilityStateChangeListener(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10 = this.mCurrentFlatColor;
        if (i10 != 0) {
            canvas.drawColor(i10);
        }
        Drawable drawable = this.mDragHandle;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // com.android.launcher3.uioverrides.WallpaperColorInfo.OnChangeListener
    public void onExtractedColorsChanged(WallpaperColorInfo wallpaperColorInfo) {
        int mainColor = wallpaperColorInfo.getMainColor();
        this.mScrimColor = mainColor;
        int iV = C1162y.v(this.mEndScrim, C1162y.D(mainColor, Math.round(this.mMaxScrimAlpha * 255.0f)));
        this.mEndFlatColor = iV;
        this.mEndFlatColorAlpha = Color.alpha(iV);
        updateColors();
        invalidate();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.mAccessibilityHelper.onFocusChanged(z10, i10, rect);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        updateDragHandleBounds();
    }

    @Override // com.android.launcher3.LauncherStateManager.StateListener
    public void onStateSetImmediately(LauncherState launcherState) {
        setImportantForAccessibility(launcherState == LauncherState.ALL_APPS ? 4 : 0);
    }

    @Override // com.android.launcher3.LauncherStateManager.StateListener
    public void onStateTransitionComplete(LauncherState launcherState) {
        onStateSetImmediately(launcherState);
    }

    @Override // com.android.launcher3.LauncherStateManager.StateListener
    public void onStateTransitionStart(LauncherState launcherState) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!zOnTouchEvent && this.mDragHandle != null && motionEvent.getAction() == 0 && this.mDragHandle.getAlpha() == 255 && this.mHitRect.contains(motionEvent.getX(), motionEvent.getY())) {
            final Drawable drawable = this.mDragHandle;
            this.mDragHandle = null;
            drawable.setBounds(this.mDragHandleBounds);
            Rect rect = new Rect(this.mDragHandleBounds);
            rect.offset(0, (-this.mDragHandleBounds.height()) / 2);
            final Rect rect2 = new Rect(this.mDragHandleBounds);
            rect2.top = rect.top;
            Keyframe keyframeOfObject = Keyframe.ofObject(0.6f, rect);
            keyframeOfObject.setInterpolator(Interpolators.DEACCEL);
            Keyframe keyframeOfObject2 = Keyframe.ofObject(1.0f, this.mDragHandleBounds);
            keyframeOfObject2.setInterpolator(Interpolators.ACCEL);
            PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe("bounds", Keyframe.ofObject(0.0f, this.mDragHandleBounds), keyframeOfObject, keyframeOfObject2);
            propertyValuesHolderOfKeyframe.setEvaluator(new RectEvaluator());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable, propertyValuesHolderOfKeyframe);
            objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.views.ScrimView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ScrimView.this.getOverlay().remove(drawable);
                    ScrimView.this.updateDragHandleVisibility(drawable);
                }
            });
            objectAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.views.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f136995a.lambda$onTouchEvent$0(rect2, valueAnimator);
                }
            });
            getOverlay().add(drawable);
            objectAnimatorOfPropertyValuesHolder.start();
        }
        return zOnTouchEvent;
    }

    public void reInitUi() {
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        updateDragHandleBounds();
        updateDragHandleVisibility(null);
    }

    public void setProgress(float f10) {
        if (this.mProgress != f10) {
            this.mProgress = f10;
            updateColors();
            updateDragHandleAlpha();
            invalidate();
        }
    }

    public void updateColors() {
        float f10 = this.mProgress;
        this.mCurrentFlatColor = f10 >= 1.0f ? 0 : C1162y.D(this.mEndFlatColor, Math.round((1.0f - f10) * this.mEndFlatColorAlpha));
    }

    public void updateDragHandleAlpha() {
        Drawable drawable = this.mDragHandle;
        if (drawable != null) {
            drawable.setAlpha(this.mDragHandleAlpha);
        }
    }

    public void updateDragHandleBounds() {
        int i10;
        int i11;
        DeviceProfile deviceProfile = this.mLauncher.getDeviceProfile();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() - this.mDragHandleSize) - deviceProfile.getInsets().bottom;
        if (deviceProfile.isVerticalBarLayout()) {
            i11 = deviceProfile.workspacePadding.bottom;
            i10 = deviceProfile.isSeascape() ? (measuredWidth - deviceProfile.getInsets().right) - this.mDragHandleSize : this.mDragHandleSize + deviceProfile.getInsets().left;
        } else {
            i10 = (measuredWidth - this.mDragHandleSize) / 2;
            i11 = deviceProfile.hotseatBarSizePx;
        }
        this.mDragHandleBounds.offsetTo(i10, measuredHeight - i11);
        this.mHitRect.set(this.mDragHandleBounds);
        float f10 = (-this.mDragHandleSize) / 2;
        this.mHitRect.inset(f10, f10);
        Drawable drawable = this.mDragHandle;
        if (drawable != null) {
            drawable.setBounds(this.mDragHandleBounds);
        }
    }
}
