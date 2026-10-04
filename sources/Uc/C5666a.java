package uc;

import hc.AbstractC4521a;
import hc.AbstractC4530j;
import hc.G;
import hc.H;
import hc.I;
import hc.InterfaceC4524d;
import hc.L;
import hc.q;
import hc.t;
import hc.z;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.schedulers.k;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import lc.e;
import lc.f;
import mc.AbstractC5221a;
import nc.InterfaceC5267c;
import nc.InterfaceC5269e;
import nc.InterfaceC5271g;
import nc.o;
import org.reactivestreams.Subscriber;
import sc.AbstractC5591a;
import tc.AbstractC5629a;

/* JADX INFO: renamed from: uc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5666a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f
    public static volatile InterfaceC5271g<? super Throwable> f239674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f
    public static volatile o<? super Runnable, ? extends Runnable> f239675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    public static volatile o<? super Callable<H>, ? extends H> f239676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f
    public static volatile o<? super Callable<H>, ? extends H> f239677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    public static volatile o<? super Callable<H>, ? extends H> f239678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f
    public static volatile o<? super Callable<H>, ? extends H> f239679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @f
    public static volatile o<? super H, ? extends H> f239680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @f
    public static volatile o<? super H, ? extends H> f239681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f
    public static volatile o<? super H, ? extends H> f239682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @f
    public static volatile o<? super H, ? extends H> f239683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC4530j, ? extends AbstractC4530j> f239684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC5221a, ? extends AbstractC5221a> f239685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @f
    public static volatile o<? super z, ? extends z> f239686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC5591a, ? extends AbstractC5591a> f239687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @f
    public static volatile o<? super q, ? extends q> f239688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @f
    public static volatile o<? super I, ? extends I> f239689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC4521a, ? extends AbstractC4521a> f239690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @f
    public static volatile o<? super AbstractC5629a, ? extends AbstractC5629a> f239691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @f
    public static volatile InterfaceC5267c<? super AbstractC4530j, ? super Subscriber, ? extends Subscriber> f239692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @f
    public static volatile InterfaceC5267c<? super q, ? super t, ? extends t> f239693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @f
    public static volatile InterfaceC5267c<? super z, ? super G, ? extends G> f239694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @f
    public static volatile InterfaceC5267c<? super I, ? super L, ? extends L> f239695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @f
    public static volatile InterfaceC5267c<? super AbstractC4521a, ? super InterfaceC4524d, ? extends InterfaceC4524d> f239696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @f
    public static volatile InterfaceC5269e f239697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile boolean f239698y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile boolean f239699z;

    public C5666a() {
        throw new IllegalStateException("No instances!");
    }

    @f
    public static InterfaceC5267c<? super z, ? super G, ? extends G> A() {
        return f239694u;
    }

    public static void A0(@f InterfaceC5267c<? super q, t, ? extends t> interfaceC5267c) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239693t = interfaceC5267c;
    }

    @f
    public static o<? super AbstractC5629a, ? extends AbstractC5629a> B() {
        return f239691r;
    }

    public static void B0(@f o<? super z, ? extends z> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239686m = oVar;
    }

    @f
    public static o<? super I, ? extends I> C() {
        return f239689p;
    }

    public static void C0(@f InterfaceC5267c<? super z, ? super G, ? extends G> interfaceC5267c) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239694u = interfaceC5267c;
    }

    @f
    public static InterfaceC5267c<? super I, ? super L, ? extends L> D() {
        return f239695v;
    }

    public static void D0(@f o<? super AbstractC5629a, ? extends AbstractC5629a> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239691r = oVar;
    }

    @f
    public static o<? super Runnable, ? extends Runnable> E() {
        return f239675b;
    }

    public static void E0(@f o<? super I, ? extends I> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239689p = oVar;
    }

    @f
    public static o<? super H, ? extends H> F() {
        return f239681h;
    }

    public static void F0(@f InterfaceC5267c<? super I, ? super L, ? extends L> interfaceC5267c) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239695v = interfaceC5267c;
    }

    @e
    public static H G(@e Callable<H> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<H>, ? extends H> oVar = f239676c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void G0(@f o<? super Runnable, ? extends Runnable> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239675b = oVar;
    }

    @e
    public static H H(@e Callable<H> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<H>, ? extends H> oVar = f239678e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void H0(@f o<? super H, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239681h = oVar;
    }

    @e
    public static H I(@e Callable<H> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<H>, ? extends H> oVar = f239679f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void I0(@e Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    @e
    public static H J(@e Callable<H> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<H>, ? extends H> oVar = f239677d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void J0() {
        f239698y = false;
    }

    public static boolean K(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    public static boolean L() {
        return f239699z;
    }

    public static boolean M() {
        return f239698y;
    }

    public static void N() {
        f239698y = true;
    }

    @e
    public static AbstractC4521a O(@e AbstractC4521a abstractC4521a) {
        o<? super AbstractC4521a, ? extends AbstractC4521a> oVar = f239690q;
        return oVar != null ? (AbstractC4521a) b(oVar, abstractC4521a) : abstractC4521a;
    }

    @e
    public static <T> AbstractC4530j<T> P(@e AbstractC4530j<T> abstractC4530j) {
        o<? super AbstractC4530j, ? extends AbstractC4530j> oVar = f239684k;
        return oVar != null ? (AbstractC4530j) b(oVar, abstractC4530j) : abstractC4530j;
    }

    @e
    public static <T> q<T> Q(@e q<T> qVar) {
        o<? super q, ? extends q> oVar = f239688o;
        return oVar != null ? (q) b(oVar, qVar) : qVar;
    }

    @e
    public static <T> z<T> R(@e z<T> zVar) {
        o<? super z, ? extends z> oVar = f239686m;
        return oVar != null ? (z) b(oVar, zVar) : zVar;
    }

    @e
    public static <T> I<T> S(@e I<T> i10) {
        o<? super I, ? extends I> oVar = f239689p;
        return oVar != null ? (I) b(oVar, i10) : i10;
    }

    @e
    public static <T> AbstractC5221a<T> T(@e AbstractC5221a<T> abstractC5221a) {
        o<? super AbstractC5221a, ? extends AbstractC5221a> oVar = f239685l;
        return oVar != null ? (AbstractC5221a) b(oVar, abstractC5221a) : abstractC5221a;
    }

    @e
    public static <T> AbstractC5591a<T> U(@e AbstractC5591a<T> abstractC5591a) {
        o<? super AbstractC5591a, ? extends AbstractC5591a> oVar = f239687n;
        return oVar != null ? (AbstractC5591a) b(oVar, abstractC5591a) : abstractC5591a;
    }

    @e
    public static <T> AbstractC5629a<T> V(@e AbstractC5629a<T> abstractC5629a) {
        o<? super AbstractC5629a, ? extends AbstractC5629a> oVar = f239691r;
        return oVar != null ? (AbstractC5629a) b(oVar, abstractC5629a) : abstractC5629a;
    }

    public static boolean W() {
        InterfaceC5269e interfaceC5269e = f239697x;
        if (interfaceC5269e == null) {
            return false;
        }
        try {
            return interfaceC5269e.d();
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    @e
    public static H X(@e H h10) {
        o<? super H, ? extends H> oVar = f239680g;
        return oVar == null ? h10 : (H) b(oVar, h10);
    }

    public static void Y(@e Throwable th) {
        InterfaceC5271g<? super Throwable> interfaceC5271g = f239674a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!K(th)) {
            th = new UndeliverableException(th);
        }
        if (interfaceC5271g != null) {
            try {
                interfaceC5271g.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                I0(th2);
            }
        }
        th.printStackTrace();
        I0(th);
    }

    @e
    public static H Z(@e H h10) {
        o<? super H, ? extends H> oVar = f239682i;
        return oVar == null ? h10 : (H) b(oVar, h10);
    }

    @e
    public static <T, U, R> R a(@e InterfaceC5267c<T, U, R> interfaceC5267c, @e T t10, @e U u10) {
        try {
            return interfaceC5267c.apply(t10, u10);
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    @e
    public static H a0(@e H h10) {
        o<? super H, ? extends H> oVar = f239683j;
        return oVar == null ? h10 : (H) b(oVar, h10);
    }

    @e
    public static <T, R> R b(@e o<T, R> oVar, @e T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    @e
    public static Runnable b0(@e Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f239675b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    @e
    public static H c(@e o<? super Callable<H>, ? extends H> oVar, Callable<H> callable) {
        Object objB = b(oVar, callable);
        io.reactivex.internal.functions.a.g(objB, "Scheduler Callable result can't be null");
        return (H) objB;
    }

    @e
    public static H c0(@e H h10) {
        o<? super H, ? extends H> oVar = f239681h;
        return oVar == null ? h10 : (H) b(oVar, h10);
    }

    @e
    public static H d(@e Callable<H> callable) {
        try {
            H hCall = callable.call();
            io.reactivex.internal.functions.a.g(hCall, "Scheduler Callable result can't be null");
            return hCall;
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    @e
    public static InterfaceC4524d d0(@e AbstractC4521a abstractC4521a, @e InterfaceC4524d interfaceC4524d) {
        InterfaceC5267c<? super AbstractC4521a, ? super InterfaceC4524d, ? extends InterfaceC4524d> interfaceC5267c = f239696w;
        return interfaceC5267c != null ? (InterfaceC4524d) a(interfaceC5267c, abstractC4521a, interfaceC4524d) : interfaceC4524d;
    }

    @e
    public static H e(@e ThreadFactory threadFactory) {
        io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null");
        return new io.reactivex.internal.schedulers.a(threadFactory);
    }

    @e
    public static <T> t<? super T> e0(@e q<T> qVar, @e t<? super T> tVar) {
        InterfaceC5267c<? super q, ? super t, ? extends t> interfaceC5267c = f239693t;
        return interfaceC5267c != null ? (t) a(interfaceC5267c, qVar, tVar) : tVar;
    }

    @e
    public static H f(@e ThreadFactory threadFactory) {
        io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null");
        return new io.reactivex.internal.schedulers.e(threadFactory);
    }

    @e
    public static <T> G<? super T> f0(@e z<T> zVar, @e G<? super T> g10) {
        InterfaceC5267c<? super z, ? super G, ? extends G> interfaceC5267c = f239694u;
        return interfaceC5267c != null ? (G) a(interfaceC5267c, zVar, g10) : g10;
    }

    @e
    public static H g(@e ThreadFactory threadFactory) {
        io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null");
        return new io.reactivex.internal.schedulers.f(threadFactory);
    }

    @e
    public static <T> L<? super T> g0(@e I<T> i10, @e L<? super T> l10) {
        InterfaceC5267c<? super I, ? super L, ? extends L> interfaceC5267c = f239695v;
        return interfaceC5267c != null ? (L) a(interfaceC5267c, i10, l10) : l10;
    }

    @e
    public static H h(@e ThreadFactory threadFactory) {
        io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null");
        return new k(threadFactory);
    }

    @e
    public static <T> Subscriber<? super T> h0(@e AbstractC4530j<T> abstractC4530j, @e Subscriber<? super T> subscriber) {
        InterfaceC5267c<? super AbstractC4530j, ? super Subscriber, ? extends Subscriber> interfaceC5267c = f239692s;
        return interfaceC5267c != null ? (Subscriber) a(interfaceC5267c, abstractC4530j, subscriber) : subscriber;
    }

    @f
    public static o<? super H, ? extends H> i() {
        return f239680g;
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
    public static InterfaceC5271g<? super Throwable> j() {
        return f239674a;
    }

    public static void j0(@f o<? super H, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239680g = oVar;
    }

    @f
    public static o<? super Callable<H>, ? extends H> k() {
        return f239676c;
    }

    public static void k0(@f InterfaceC5271g<? super Throwable> interfaceC5271g) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239674a = interfaceC5271g;
    }

    @f
    public static o<? super Callable<H>, ? extends H> l() {
        return f239678e;
    }

    public static void l0(boolean z10) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239699z = z10;
    }

    @f
    public static o<? super Callable<H>, ? extends H> m() {
        return f239679f;
    }

    public static void m0(@f o<? super Callable<H>, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239676c = oVar;
    }

    @f
    public static o<? super Callable<H>, ? extends H> n() {
        return f239677d;
    }

    public static void n0(@f o<? super Callable<H>, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239678e = oVar;
    }

    @f
    public static o<? super H, ? extends H> o() {
        return f239682i;
    }

    public static void o0(@f o<? super Callable<H>, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239679f = oVar;
    }

    @f
    public static o<? super H, ? extends H> p() {
        return f239683j;
    }

    public static void p0(@f o<? super Callable<H>, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239677d = oVar;
    }

    @f
    public static InterfaceC5269e q() {
        return f239697x;
    }

    public static void q0(@f o<? super H, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239682i = oVar;
    }

    @f
    public static o<? super AbstractC4521a, ? extends AbstractC4521a> r() {
        return f239690q;
    }

    public static void r0(@f o<? super H, ? extends H> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239683j = oVar;
    }

    @f
    public static InterfaceC5267c<? super AbstractC4521a, ? super InterfaceC4524d, ? extends InterfaceC4524d> s() {
        return f239696w;
    }

    public static void s0(@f InterfaceC5269e interfaceC5269e) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239697x = interfaceC5269e;
    }

    @f
    public static o<? super AbstractC5221a, ? extends AbstractC5221a> t() {
        return f239685l;
    }

    public static void t0(@f o<? super AbstractC4521a, ? extends AbstractC4521a> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239690q = oVar;
    }

    @f
    public static o<? super AbstractC5591a, ? extends AbstractC5591a> u() {
        return f239687n;
    }

    public static void u0(@f InterfaceC5267c<? super AbstractC4521a, ? super InterfaceC4524d, ? extends InterfaceC4524d> interfaceC5267c) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239696w = interfaceC5267c;
    }

    @f
    public static o<? super AbstractC4530j, ? extends AbstractC4530j> v() {
        return f239684k;
    }

    public static void v0(@f o<? super AbstractC5221a, ? extends AbstractC5221a> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239685l = oVar;
    }

    @f
    public static InterfaceC5267c<? super AbstractC4530j, ? super Subscriber, ? extends Subscriber> w() {
        return f239692s;
    }

    public static void w0(@f o<? super AbstractC5591a, ? extends AbstractC5591a> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239687n = oVar;
    }

    @f
    public static o<? super q, ? extends q> x() {
        return f239688o;
    }

    public static void x0(@f o<? super AbstractC4530j, ? extends AbstractC4530j> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239684k = oVar;
    }

    @f
    public static InterfaceC5267c<? super q, ? super t, ? extends t> y() {
        return f239693t;
    }

    public static void y0(@f InterfaceC5267c<? super AbstractC4530j, ? super Subscriber, ? extends Subscriber> interfaceC5267c) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239692s = interfaceC5267c;
    }

    @f
    public static o<? super z, ? extends z> z() {
        return f239686m;
    }

    public static void z0(@f o<? super q, ? extends q> oVar) {
        if (f239698y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f239688o = oVar;
    }
}
