package com.android.launcher3.views;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.Insettable;
import com.android.launcher3.Launcher;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.compat.AccessibilityManagerCompat;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class BottomUserEducationView extends AbstractSlideInView implements Insettable {
    private static final int DEFAULT_CLOSE_DURATION = 200;
    private static final String KEY_SHOWED_BOTTOM_USER_EDUCATION = "showed_bottom_user_education";
    private View mCloseButton;
    private final Rect mInsets;

    public BottomUserEducationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void expandTouchAreaOfCloseButton() {
        Rect rect = new Rect();
        this.mCloseButton.getHitRect(rect);
        rect.left -= this.mCloseButton.getWidth();
        rect.top -= this.mCloseButton.getHeight();
        rect.right = this.mCloseButton.getWidth() + rect.right;
        rect.bottom = this.mCloseButton.getHeight() + rect.bottom;
        ((View) this.mCloseButton.getParent()).setTouchDelegate(new TouchDelegate(rect, this.mCloseButton));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishInflate$0(View view) {
        handleClose(true);
    }

    private void open(boolean z10) {
        if (this.mIsOpen || this.mOpenCloseAnimator.isRunning()) {
            return;
        }
        this.mIsOpen = true;
        if (!z10) {
            setTranslationShift(0.0f);
            return;
        }
        this.mOpenCloseAnimator.setValues(PropertyValuesHolder.ofFloat(AbstractSlideInView.TRANSLATION_SHIFT, 0.0f));
        this.mOpenCloseAnimator.setInterpolator(Interpolators.FAST_OUT_SLOW_IN);
        this.mOpenCloseAnimator.start();
    }

    public static void showIfNeeded(Launcher launcher) {
        if (launcher.getSharedPrefs().getBoolean(KEY_SHOWED_BOTTOM_USER_EDUCATION, false)) {
            return;
        }
        BottomUserEducationView bottomUserEducationView = (BottomUserEducationView) LayoutInflater.from(launcher).inflate(R.layout.work_tab_bottom_user_education_view, (ViewGroup) launcher.getDragLayer(), false);
        launcher.getDragLayer().addView(bottomUserEducationView);
        bottomUserEducationView.open(true);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void handleClose(boolean z10) {
        handleClose(z10, 200L);
        if (z10) {
            this.mLauncher.getSharedPrefs().edit().putBoolean(KEY_SHOWED_BOTTOM_USER_EDUCATION, true).apply();
            AccessibilityManagerCompat.sendCustomAccessibilityEvent(this, 32, getContext().getString(R.string.bottom_work_tab_user_education_closed));
        }
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public boolean isOfType(int i10) {
        return (i10 & 32) != 0;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void logActionCommand(int i10) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.close_bottom_user_tip);
        this.mCloseButton = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.launcher3.views.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136994a.lambda$onFinishInflate$0(view);
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationShift(this.mTranslationShift);
        expandTouchAreaOfCloseButton();
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.mInsets;
        int i11 = i10 - rect2.left;
        int i12 = rect.right - rect2.right;
        int i13 = rect.bottom - rect2.bottom;
        rect2.set(rect);
        setPadding(getPaddingLeft() + i11, getPaddingTop(), getPaddingRight() + i12, getPaddingBottom() + i13);
    }

    public BottomUserEducationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mInsets = new Rect();
        this.mContent = this;
    }
}
