package com.inmobi.media;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152265a = "N0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f152266b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f152267c;

    public static M0 a(ValueAnimator valueAnimator, C3639m7 c3639m7) {
        valueAnimator.setDuration(0L);
        valueAnimator.setStartDelay(0L);
        C3472a8 c3472a8 = c3639m7.f153147d.f153200k;
        if (c3472a8 != null) {
            Z7 z72 = c3472a8.f152702a;
            Z7 z73 = c3472a8.f152703b;
            if (z73 != null) {
                valueAnimator.setDuration(z73.a() * ((long) 1000));
            }
            if (z72 != null) {
                valueAnimator.setStartDelay(z72.a() * ((long) 1000));
            }
        }
        return new M0(valueAnimator);
    }

    public static ValueAnimator b(final View view, float f10, float f11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        final C3722s7 c3722s7 = layoutParams instanceof C3722s7 ? (C3722s7) layoutParams : null;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: F5.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.inmobi.media.N0.b(c3722s7, view, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public static final void b(C3722s7 c3722s7, View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.G.p(view, "$view");
        kotlin.jvm.internal.G.p(valueAnimator, "valueAnimator");
        if (c3722s7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.G.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c3722s7.f153347b = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c3722s7);
        view.requestLayout();
    }

    public final void b() {
        if (this.f152267c) {
            int i10 = 0;
            this.f152267c = false;
            ArrayList arrayList = this.f152266b;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                M0 m02 = (M0) obj;
                Animator animator = m02.f152208a;
                kotlin.jvm.internal.G.n(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                m02.f152209b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    m02.f152210c = true;
                }
                valueAnimator.cancel();
            }
        }
    }

    public static ValueAnimator a(final View view, float f10, float f11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        final C3722s7 c3722s7 = layoutParams instanceof C3722s7 ? (C3722s7) layoutParams : null;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: F5.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.inmobi.media.N0.a(c3722s7, view, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public static final void a(C3722s7 c3722s7, View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.G.p(view, "$view");
        kotlin.jvm.internal.G.p(valueAnimator, "valueAnimator");
        if (c3722s7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.G.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c3722s7.f153346a = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c3722s7);
        view.requestLayout();
    }

    public final void a(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            M0 m02 = (M0) it.next();
            if (!m02.f152210c) {
                Animator animator = m02.f152208a;
                kotlin.jvm.internal.G.n(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setCurrentPlayTime(m02.f152209b);
                valueAnimator.start();
            }
            if (!this.f152266b.contains(m02)) {
                this.f152266b.add(m02);
            }
        }
    }

    public final void a() {
        ArrayList arrayList = this.f152266b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((M0) obj).f152208a.cancel();
        }
        this.f152266b.clear();
    }
}
