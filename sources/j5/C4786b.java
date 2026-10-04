package j5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: j5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4786b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueAnimator f212568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f212569b;

    /* JADX INFO: renamed from: j5.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f212570a;

        public a(d dVar) {
            this.f212570a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f212570a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: j5.b$b, reason: collision with other inner class name */
    public class C0806b extends AnimatorListenerAdapter {
        public C0806b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4786b.this.f212569b.a();
        }
    }

    /* JADX INFO: renamed from: j5.b$c */
    public interface c {
        void a();
    }

    /* JADX INFO: renamed from: j5.b$d */
    public interface d {
        void a(float f10);
    }

    public C4786b() {
        this(false);
    }

    public ValueAnimator a() {
        if (this.f212569b != null) {
            this.f212568a.addListener(new C0806b());
        }
        return this.f212568a;
    }

    public C4786b b(long j10) {
        this.f212568a.setStartDelay(j10);
        return this;
    }

    public C4786b c(long j10) {
        this.f212568a.setDuration(j10);
        return this;
    }

    public C4786b d(TimeInterpolator timeInterpolator) {
        this.f212568a.setInterpolator(timeInterpolator);
        return this;
    }

    public C4786b e(c cVar) {
        this.f212569b = cVar;
        return this;
    }

    public C4786b f(d dVar) {
        this.f212568a.addUpdateListener(new a(dVar));
        return this;
    }

    public C4786b g(int i10) {
        this.f212568a.setRepeatCount(i10);
        return this;
    }

    public C4786b(boolean z10) {
        if (z10) {
            this.f212568a = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            this.f212568a = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
    }
}
