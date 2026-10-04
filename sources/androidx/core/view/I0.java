package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f111556a;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J0 f111557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f111558b;

        public a(J0 j02, View view) {
            this.f111557a = j02;
            this.f111558b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f111557a.a(this.f111558b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f111557a.b(this.f111558b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f111557a.c(this.f111558b);
        }
    }

    @e.T(21)
    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZ(f10);
        }

        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZBy(f10);
        }

        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.z(f10);
        }

        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.zBy(f10);
        }
    }

    public I0(View view) {
        this.f111556a = new WeakReference<>(view);
    }

    @NonNull
    public I0 A(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    @NonNull
    public I0 B(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 C(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().translationZ(f10);
        }
        return this;
    }

    @NonNull
    public I0 D(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().translationZBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 E(@NonNull Runnable runnable) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public I0 F() {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @NonNull
    public I0 G(@NonNull Runnable runnable) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @NonNull
    public I0 H(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    @NonNull
    public I0 I(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 J(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    @NonNull
    public I0 K(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 L(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().z(f10);
        }
        return this;
    }

    @NonNull
    public I0 M(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().zBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 b(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    @NonNull
    public I0 c(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void d() {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f111556a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @Nullable
    public Interpolator f() {
        View view = this.f111556a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long g() {
        View view = this.f111556a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public I0 h(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    @NonNull
    public I0 i(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 j(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    @NonNull
    public I0 k(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 l(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    @NonNull
    public I0 m(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 n(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    @NonNull
    public I0 o(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 p(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    @NonNull
    public I0 q(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    @NonNull
    public I0 r(long j10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    @NonNull
    public I0 s(@Nullable Interpolator interpolator) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public I0 t(@Nullable J0 j02) {
        View view = this.f111556a.get();
        if (view != null) {
            u(view, j02);
        }
        return this;
    }

    public final void u(View view, J0 j02) {
        if (j02 != null) {
            view.animate().setListener(new a(j02, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public I0 v(long j10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    @NonNull
    public I0 w(@Nullable final L0 l02) {
        final View view = this.f111556a.get();
        if (view != null) {
            view.animate().setUpdateListener(l02 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.H0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l02.a(view);
                }
            } : null);
        }
        return this;
    }

    public void x() {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public I0 y(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    @NonNull
    public I0 z(float f10) {
        View view = this.f111556a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }
}
