package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;

/* JADX INFO: loaded from: classes2.dex */
public class Fade extends Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f117733a = "android:fade:transitionAlpha";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117734b = "Fade";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f117735c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f117736d = 2;

    public class a extends C2710w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f117737a;

        public a(View view) {
            this.f117737a = view;
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            N.h(this.f117737a, 1.0f);
            N.a(this.f117737a);
            transition.removeListener(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f117739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f117740b = false;

        public b(View view) {
            this.f117739a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            N.h(this.f117739a, 1.0f);
            if (this.f117740b) {
                this.f117739a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C2507z0.O0(this.f117739a) && this.f117739a.getLayerType() == 0) {
                this.f117740b = true;
                this.f117739a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i10) {
        setMode(i10);
    }

    public static float v(A a10, float f10) {
        Float f11;
        return (a10 == null || (f11 = (Float) a10.f117611a.get(f117733a)) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        super.captureStartValues(a10);
        a10.f117611a.put(f117733a, Float.valueOf(N.c(a10.f117612b)));
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(ViewGroup viewGroup, View view, A a10, A a11) {
        float fV = v(a10, 0.0f);
        return u(view, fV != 1.0f ? fV : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(ViewGroup viewGroup, View view, A a10, A a11) {
        N.e(view);
        return u(view, v(a10, 1.0f), 0.0f);
    }

    public final Animator u(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        N.h(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, N.f117761c, f11);
        objectAnimatorOfFloat.addListener(new b(view));
        addListener(new a(view));
        return objectAnimatorOfFloat;
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119546f);
        setMode(D0.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
