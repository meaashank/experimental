package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.X;
import e.InterfaceC4345t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class V implements B {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f114123j = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114126b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Handler f114129e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f114122i = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final V f114124k = new V();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114127c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114128d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final D f114130f = new D(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Runnable f114131g = new Runnable() { // from class: androidx.lifecycle.U
        @Override // java.lang.Runnable
        public final void run() {
            V.i(this.f114121a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final X.a f114132h = new d();

    @e.T(29)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f114133a = new a();

        @dd.o
        @InterfaceC4345t
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.G.p(activity, "activity");
            kotlin.jvm.internal.G.p(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public b() {
        }

        @e.f0
        public static /* synthetic */ void b() {
        }

        @dd.o
        @NotNull
        public final B a() {
            return V.f114124k;
        }

        @dd.o
        public final void c(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            V.f114124k.h(context);
        }

        public b(C4969v c4969v) {
        }
    }

    public static final class c extends C2601n {

        public static final class a extends C2601n {
            final /* synthetic */ V this$0;

            public a(V v10) {
                this.this$0 = v10;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NotNull Activity activity) {
                kotlin.jvm.internal.G.p(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NotNull Activity activity) {
                kotlin.jvm.internal.G.p(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.C2601n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.G.p(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                X.f114159b.b(activity).f114161a = V.this.f114132h;
            }
        }

        @Override // androidx.lifecycle.C2601n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            V.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @e.T(29)
        public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.G.p(activity, "activity");
            a.a(activity, new a(V.this));
        }

        @Override // androidx.lifecycle.C2601n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            V.this.g();
        }
    }

    public static final class d implements X.a {
        public d() {
        }

        @Override // androidx.lifecycle.X.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.X.a
        public void onResume() {
            V.this.e();
        }

        @Override // androidx.lifecycle.X.a
        public void onStart() {
            V.this.f();
        }
    }

    public static final void i(V this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    @dd.o
    @NotNull
    public static final B l() {
        f114122i.getClass();
        return f114124k;
    }

    @dd.o
    public static final void m(@NotNull Context context) {
        f114122i.c(context);
    }

    public final void d() {
        int i10 = this.f114126b - 1;
        this.f114126b = i10;
        if (i10 == 0) {
            Handler handler = this.f114129e;
            kotlin.jvm.internal.G.m(handler);
            handler.postDelayed(this.f114131g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f114126b + 1;
        this.f114126b = i10;
        if (i10 == 1) {
            if (this.f114127c) {
                this.f114130f.o(Lifecycle.Event.ON_RESUME);
                this.f114127c = false;
            } else {
                Handler handler = this.f114129e;
                kotlin.jvm.internal.G.m(handler);
                handler.removeCallbacks(this.f114131g);
            }
        }
    }

    public final void f() {
        int i10 = this.f114125a + 1;
        this.f114125a = i10;
        if (i10 == 1 && this.f114128d) {
            this.f114130f.o(Lifecycle.Event.ON_START);
            this.f114128d = false;
        }
    }

    public final void g() {
        this.f114125a--;
        k();
    }

    @Override // androidx.lifecycle.B
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f114130f;
    }

    public final void h(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        this.f114129e = new Handler();
        this.f114130f.o(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.G.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f114126b == 0) {
            this.f114127c = true;
            this.f114130f.o(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f114125a == 0 && this.f114127c) {
            this.f114130f.o(Lifecycle.Event.ON_STOP);
            this.f114128d = true;
        }
    }
}
