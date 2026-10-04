package com.google.android.material.transition;

import android.animation.Animator;
import android.support.v4.media.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.E;
import androidx.transition.A;
import com.google.android.material.R;
import e.InterfaceC4332f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    @InterfaceC4332f
    private static final int DEFAULT_THEMED_DURATION_ATTR = R.attr.motionDurationLong1;

    @InterfaceC4332f
    private static final int DEFAULT_THEMED_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f150925X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f150926Y = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f150927Z = 2;
    private final int axis;
    private final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Axis {
    }

    public MaterialSharedAxis(int i10, boolean z10) {
        super(createPrimaryAnimatorProvider(i10, z10), createSecondaryAnimatorProvider());
        this.axis = i10;
        this.forward = z10;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i10, boolean z10) {
        if (i10 == 0) {
            return new SlideDistanceProvider(z10 ? 8388613 : E.f111493b);
        }
        if (i10 == 1) {
            return new SlideDistanceProvider(z10 ? 80 : 48);
        }
        if (i10 == 2) {
            return new ScaleProvider(z10);
        }
        throw new IllegalArgumentException(c.a("Invalid axis: ", i10));
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC4332f
    public int getDurationThemeAttrResId(boolean z10) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC4332f
    public int getEasingThemeAttrResId(boolean z10) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, A a10, A a11) {
        return super.onAppear(viewGroup, view, a10, a11);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, A a10, A a11) {
        return super.onDisappear(viewGroup, view, a10, a11);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
