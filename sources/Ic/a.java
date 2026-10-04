package Ic;

import Bc.c;
import Bc.e;
import Bc.g;
import Bc.o;
import Bc.s;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.internal.schedulers.k;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;
import yc.f;
import zc.AbstractC5881C;
import zc.AbstractC5885b;
import zc.AbstractC5902t;
import zc.F;
import zc.InterfaceC5888e;
import zc.N;
import zc.V;
import zc.W;
import zc.X;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f
    public static volatile g<? super Throwable> f53023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f
    public static volatile o<? super Runnable, ? extends Runnable> f53024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    public static volatile o<? super s<W>, ? extends W> f53025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f
    public static volatile o<? super s<W>, ? extends W> f53026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    public static volatile o<? super s<W>, ? extends W> f53027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f
    public static volatile o<? super s<W>, ? extends W> f53028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @f
    public static volatile o<? super W, ? extends W> f53029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @f
    public static volatile o<? super W, ? extends W> f53030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f
    public static volatile o<? super W, ? extends W> f53031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @f
    public static volatile o<? super W, ? extends W> f53032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC5902t, ? extends AbstractC5902t> f53033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @f
    public static volatile o<? super Ac.a, ? extends Ac.a> f53034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @f
    public static volatile o<? super N, ? extends N> f53035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @f
    public static volatile o<? super Gc.a, ? extends Gc.a> f53036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC5881C, ? extends AbstractC5881C> f53037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @f
    public static volatile o<? super X, ? extends X> f53038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC5885b, ? extends AbstractC5885b> f53039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @f
    public static volatile o<? super Hc.a, ? extends Hc.a> f53040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @f
    public static volatile c<? super AbstractC5902t, ? super Subscriber, ? extends Subscriber> f53041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @f
    public static volatile c<? super AbstractC5881C, ? super F, ? extends F> f53042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @f
    public static volatile c<? super N, ? super V, ? extends V> f53043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @f
    public static volatile c<? super X, ? super a0, ? extends a0> f53044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @f
    public static volatile c<? super AbstractC5885b, ? super InterfaceC5888e, ? extends InterfaceC5888e> f53045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @f
    public static volatile e f53046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile boolean f53047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile boolean f53048z;

    public a() {
        throw new IllegalStateException("No instances!");
    }

    @f
    public static c<? super N, ? super V, ? extends V> A() {
        return f53043u;
    }

    public static void A0(@f c<? super AbstractC5881C, F, ? extends F> onMaybeSubscribe) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53042t = onMaybeSubscribe;
    }

    @f
    public static o<? super Hc.a, ? extends Hc.a> B() {
        return f53040r;
    }

    public static void B0(@f o<? super N, ? extends N> onObservableAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53035m = onObservableAssembly;
    }

    @f
    public static o<? super X, ? extends X> C() {
        return f53038p;
    }

    public static void C0(@f c<? super N, ? super V, ? extends V> onObservableSubscribe) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53043u = onObservableSubscribe;
    }

    @f
    public static c<? super X, ? super a0, ? extends a0> D() {
        return f53044v;
    }

    public static void D0(@f o<? super Hc.a, ? extends Hc.a> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53040r = handler;
    }

    @f
    public static o<? super Runnable, ? extends Runnable> E() {
        return f53024b;
    }

    public static void E0(@f o<? super X, ? extends X> onSingleAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53038p = onSingleAssembly;
    }

    @f
    public static o<? super W, ? extends W> F() {
        return f53030h;
    }

    public static void F0(@f c<? super X, ? super a0, ? extends a0> onSingleSubscribe) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53044v = onSingleSubscribe;
    }

    @yc.e
    public static W G(@yc.e s<W> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<W>, ? extends W> oVar = f53025c;
        return oVar == null ? d(defaultScheduler) : c(oVar, defaultScheduler);
    }

    public static void G0(@f o<? super Runnable, ? extends Runnable> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53024b = handler;
    }

    @yc.e
    public static W H(@yc.e s<W> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<W>, ? extends W> oVar = f53027e;
        return oVar == null ? d(defaultScheduler) : c(oVar, defaultScheduler);
    }

    public static void H0(@f o<? super W, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53030h = handler;
    }

    @yc.e
    public static W I(@yc.e s<W> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<W>, ? extends W> oVar = f53028f;
        return oVar == null ? d(defaultScheduler) : c(oVar, defaultScheduler);
    }

    public static void I0(@yc.e Throwable error) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    @yc.e
    public static W J(@yc.e s<W> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<W>, ? extends W> oVar = f53026d;
        return oVar == null ? d(defaultScheduler) : c(oVar, defaultScheduler);
    }

    public static void J0() {
        f53047y = false;
    }

    public static boolean K(Throwable error) {
        return (error instanceof OnErrorNotImplementedException) || (error instanceof MissingBackpressureException) || (error instanceof IllegalStateException) || (error instanceof NullPointerException) || (error instanceof IllegalArgumentException) || (error instanceof CompositeException);
    }

    public static boolean L() {
        return f53048z;
    }

    public static boolean M() {
        return f53047y;
    }

    public static void N() {
        f53047y = true;
    }

    @yc.e
    public static <T> Ac.a<T> O(@yc.e Ac.a<T> source) {
        o<? super Ac.a, ? extends Ac.a> oVar = f53034l;
        return oVar != null ? (Ac.a) b(oVar, source) : source;
    }

    @yc.e
    public static <T> Gc.a<T> P(@yc.e Gc.a<T> source) {
        o<? super Gc.a, ? extends Gc.a> oVar = f53036n;
        return oVar != null ? (Gc.a) b(oVar, source) : source;
    }

    @yc.e
    public static <T> Hc.a<T> Q(@yc.e Hc.a<T> source) {
        o<? super Hc.a, ? extends Hc.a> oVar = f53040r;
        return oVar != null ? (Hc.a) b(oVar, source) : source;
    }

    @yc.e
    public static AbstractC5885b R(@yc.e AbstractC5885b source) {
        o<? super AbstractC5885b, ? extends AbstractC5885b> oVar = f53039q;
        return oVar != null ? (AbstractC5885b) b(oVar, source) : source;
    }

    @yc.e
    public static <T> AbstractC5902t<T> S(@yc.e AbstractC5902t<T> source) {
        o<? super AbstractC5902t, ? extends AbstractC5902t> oVar = f53033k;
        return oVar != null ? (AbstractC5902t) b(oVar, source) : source;
    }

    @yc.e
    public static <T> AbstractC5881C<T> T(@yc.e AbstractC5881C<T> source) {
        o<? super AbstractC5881C, ? extends AbstractC5881C> oVar = f53037o;
        return oVar != null ? (AbstractC5881C) b(oVar, source) : source;
    }

    @yc.e
    public static <T> N<T> U(@yc.e N<T> source) {
        o<? super N, ? extends N> oVar = f53035m;
        return oVar != null ? (N) b(oVar, source) : source;
    }

    @yc.e
    public static <T> X<T> V(@yc.e X<T> source) {
        o<? super X, ? extends X> oVar = f53038p;
        return oVar != null ? (X) b(oVar, source) : source;
    }

    public static boolean W() {
        e eVar = f53046x;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.d();
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    @yc.e
    public static W X(@yc.e W defaultScheduler) {
        o<? super W, ? extends W> oVar = f53029g;
        return oVar == null ? defaultScheduler : (W) b(oVar, defaultScheduler);
    }

    public static void Y(@yc.e Throwable error) {
        g<? super Throwable> gVar = f53023a;
        if (error == null) {
            error = ExceptionHelper.b("onError called with a null Throwable.");
        } else if (!K(error)) {
            error = new UndeliverableException(error);
        }
        if (gVar != null) {
            try {
                gVar.accept(error);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                I0(th);
            }
        }
        error.printStackTrace();
        I0(error);
    }

    @yc.e
    public static W Z(@yc.e W defaultScheduler) {
        o<? super W, ? extends W> oVar = f53031i;
        return oVar == null ? defaultScheduler : (W) b(oVar, defaultScheduler);
    }

    @yc.e
    public static <T, U, R> R a(@yc.e c<T, U, R> f10, @yc.e T t10, @yc.e U u10) {
        try {
            return f10.apply(t10, u10);
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    @yc.e
    public static W a0(@yc.e W defaultScheduler) {
        o<? super W, ? extends W> oVar = f53032j;
        return oVar == null ? defaultScheduler : (W) b(oVar, defaultScheduler);
    }

    @yc.e
    public static <T, R> R b(@yc.e o<T, R> f10, @yc.e T t10) {
        try {
            return f10.apply(t10);
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    @yc.e
    public static Runnable b0(@yc.e Runnable run) {
        Objects.requireNonNull(run, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f53024b;
        return oVar == null ? run : (Runnable) b(oVar, run);
    }

    @yc.e
    public static W c(@yc.e o<? super s<W>, ? extends W> f10, s<W> s10) {
        Object objB = b(f10, s10);
        Objects.requireNonNull(objB, "Scheduler Supplier result can't be null");
        return (W) objB;
    }

    @yc.e
    public static W c0(@yc.e W defaultScheduler) {
        o<? super W, ? extends W> oVar = f53030h;
        return oVar == null ? defaultScheduler : (W) b(oVar, defaultScheduler);
    }

    @yc.e
    public static W d(@yc.e s<W> s10) {
        try {
            W w10 = s10.get();
            Objects.requireNonNull(w10, "Scheduler Supplier result can't be null");
            return w10;
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    @yc.e
    public static <T> Subscriber<? super T> d0(@yc.e AbstractC5902t<T> source, @yc.e Subscriber<? super T> subscriber) {
        c<? super AbstractC5902t, ? super Subscriber, ? extends Subscriber> cVar = f53041s;
        return cVar != null ? (Subscriber) a(cVar, source, subscriber) : subscriber;
    }

    @yc.e
    public static W e(@yc.e ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new io.reactivex.rxjava3.internal.schedulers.a(threadFactory);
    }

    @yc.e
    public static InterfaceC5888e e0(@yc.e AbstractC5885b source, @yc.e InterfaceC5888e observer) {
        c<? super AbstractC5885b, ? super InterfaceC5888e, ? extends InterfaceC5888e> cVar = f53045w;
        return cVar != null ? (InterfaceC5888e) a(cVar, source, observer) : observer;
    }

    @yc.e
    public static W f(@yc.e ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new io.reactivex.rxjava3.internal.schedulers.e(threadFactory);
    }

    @yc.e
    public static <T> F<? super T> f0(@yc.e AbstractC5881C<T> source, @yc.e F<? super T> observer) {
        c<? super AbstractC5881C, ? super F, ? extends F> cVar = f53042t;
        return cVar != null ? (F) a(cVar, source, observer) : observer;
    }

    @yc.e
    public static W g(@yc.e ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new io.reactivex.rxjava3.internal.schedulers.f(threadFactory);
    }

    @yc.e
    public static <T> V<? super T> g0(@yc.e N<T> source, @yc.e V<? super T> observer) {
        c<? super N, ? super V, ? extends V> cVar = f53043u;
        return cVar != null ? (V) a(cVar, source, observer) : observer;
    }

    @yc.e
    public static W h(@yc.e ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new k(threadFactory);
    }

    @yc.e
    public static <T> a0<? super T> h0(@yc.e X<T> source, @yc.e a0<? super T> observer) {
        c<? super X, ? super a0, ? extends a0> cVar = f53044v;
        return cVar != null ? (a0) a(cVar, source, observer) : observer;
    }

    @f
    public static o<? super W, ? extends W> i() {
        return f53029g;
    }

    public static void i0() {
        k0(null);
        G0(null);
        j0(null);
        m0(null);
        q0(null);
        n0(null);
        H0(null);
        p0(null);
        r0(null);
        o0(null);
        x0(null);
        y0(null);
        B0(null);
        C0(null);
        E0(null);
        F0(null);
        t0(null);
        u0(null);
        v0(null);
        w0(null);
        z0(null);
        A0(null);
        D0(null);
        l0(false);
        s0(null);
    }

    @f
    public static g<? super Throwable> j() {
        return f53023a;
    }

    public static void j0(@f o<? super W, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53029g = handler;
    }

    @f
    public static o<? super s<W>, ? extends W> k() {
        return f53025c;
    }

    public static void k0(@f g<? super Throwable> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53023a = handler;
    }

    @f
    public static o<? super s<W>, ? extends W> l() {
        return f53027e;
    }

    public static void l0(boolean enable) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53048z = enable;
    }

    @f
    public static o<? super s<W>, ? extends W> m() {
        return f53028f;
    }

    public static void m0(@f o<? super s<W>, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53025c = handler;
    }

    @f
    public static o<? super s<W>, ? extends W> n() {
        return f53026d;
    }

    public static void n0(@f o<? super s<W>, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53027e = handler;
    }

    @f
    public static o<? super W, ? extends W> o() {
        return f53031i;
    }

    public static void o0(@f o<? super s<W>, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53028f = handler;
    }

    @f
    public static o<? super W, ? extends W> p() {
        return f53032j;
    }

    public static void p0(@f o<? super s<W>, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53026d = handler;
    }

    @f
    public static e q() {
        return f53046x;
    }

    public static void q0(@f o<? super W, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53031i = handler;
    }

    @f
    public static o<? super AbstractC5885b, ? extends AbstractC5885b> r() {
        return f53039q;
    }

    public static void r0(@f o<? super W, ? extends W> handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53032j = handler;
    }

    @f
    public static c<? super AbstractC5885b, ? super InterfaceC5888e, ? extends InterfaceC5888e> s() {
        return f53045w;
    }

    public static void s0(@f e handler) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53046x = handler;
    }

    @f
    public static o<? super Ac.a, ? extends Ac.a> t() {
        return f53034l;
    }

    public static void t0(@f o<? super AbstractC5885b, ? extends AbstractC5885b> onCompletableAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53039q = onCompletableAssembly;
    }

    @f
    public static o<? super Gc.a, ? extends Gc.a> u() {
        return f53036n;
    }

    public static void u0(@f c<? super AbstractC5885b, ? super InterfaceC5888e, ? extends InterfaceC5888e> onCompletableSubscribe) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53045w = onCompletableSubscribe;
    }

    @f
    public static o<? super AbstractC5902t, ? extends AbstractC5902t> v() {
        return f53033k;
    }

    public static void v0(@f o<? super Ac.a, ? extends Ac.a> onConnectableFlowableAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53034l = onConnectableFlowableAssembly;
    }

    @f
    public static c<? super AbstractC5902t, ? super Subscriber, ? extends Subscriber> w() {
        return f53041s;
    }

    public static void w0(@f o<? super Gc.a, ? extends Gc.a> onConnectableObservableAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53036n = onConnectableObservableAssembly;
    }

    @f
    public static o<? super AbstractC5881C, ? extends AbstractC5881C> x() {
        return f53037o;
    }

    public static void x0(@f o<? super AbstractC5902t, ? extends AbstractC5902t> onFlowableAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53033k = onFlowableAssembly;
    }

    @f
    public static c<? super AbstractC5881C, ? super F, ? extends F> y() {
        return f53042t;
    }

    public static void y0(@f c<? super AbstractC5902t, ? super Subscriber, ? extends Subscriber> onFlowableSubscribe) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53041s = onFlowableSubscribe;
    }

    @f
    public static o<? super N, ? extends N> z() {
        return f53035m;
    }

    public static void z0(@f o<? super AbstractC5881C, ? extends AbstractC5881C> onMaybeAssembly) {
        if (f53047y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f53037o = onMaybeAssembly;
    }
}
