package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.C2705q;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public class C {

    public static class a extends AnimatorListenerAdapter implements Transition.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f117627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f117628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f117629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f117630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f117631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f117632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f117633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f117634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f117635i;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f117628b = view;
            this.f117627a = view2;
            this.f117629c = i10 - Math.round(view.getTranslationX());
            this.f117630d = i11 - Math.round(view.getTranslationY());
            this.f117634h = f10;
            this.f117635i = f11;
            int i12 = C2705q.g.f118512T1;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f117631e = iArr;
            if (iArr != null) {
                view2.setTag(i12, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f117631e == null) {
                this.f117631e = new int[2];
            }
            this.f117631e[0] = Math.round(this.f117628b.getTranslationX() + this.f117629c);
            this.f117631e[1] = Math.round(this.f117628b.getTranslationY() + this.f117630d);
            this.f117627a.setTag(C2705q.g.f118512T1, this.f117631e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f117632f = this.f117628b.getTranslationX();
            this.f117633g = this.f117628b.getTranslationY();
            this.f117628b.setTranslationX(this.f117634h);
            this.f117628b.setTranslationY(this.f117635i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f117628b.setTranslationX(this.f117632f);
            this.f117628b.setTranslationY(this.f117633g);
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            this.f117628b.setTranslationX(this.f117634h);
            this.f117628b.setTranslationY(this.f117635i);
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionResume(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionStart(@NonNull Transition transition) {
        }
    }

    @Nullable
    public static Animator a(@NonNull View view, @NonNull A a10, int i10, int i11, float f10, float f11, float f12, float f13, @Nullable TimeInterpolator timeInterpolator, @NonNull Transition transition) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) a10.f117612b.getTag(C2705q.g.f118512T1)) != null) {
            f14 = (r2[0] - i10) + translationX;
            f15 = (r2[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iRound = Math.round(f14 - translationX) + i10;
        int iRound2 = Math.round(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, a10.f117612b, iRound, iRound2, translationX, translationY);
        transition.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
