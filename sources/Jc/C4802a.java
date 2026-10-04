package jc;

import hc.H;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import nc.o;

/* JADX INFO: renamed from: jc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4802a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile o<Callable<H>, H> f214254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o<H, H> f214255b;

    public C4802a() {
        throw new AssertionError("No instances.");
    }

    public static <T, R> R a(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    public static H b(o<Callable<H>, H> oVar, Callable<H> callable) {
        H h10 = (H) a(oVar, callable);
        if (h10 != null) {
            return h10;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static H c(Callable<H> callable) {
        try {
            H hCall = callable.call();
            if (hCall != null) {
                return hCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    public static o<Callable<H>, H> d() {
        return f214254a;
    }

    public static o<H, H> e() {
        return f214255b;
    }

    public static H f(Callable<H> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<Callable<H>, H> oVar = f214254a;
        return oVar == null ? c(callable) : b(oVar, callable);
    }

    public static H g(H h10) {
        if (h10 == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<H, H> oVar = f214255b;
        return oVar == null ? h10 : (H) a(oVar, h10);
    }

    public static void h() {
        f214254a = null;
        f214255b = null;
    }

    public static void i(o<Callable<H>, H> oVar) {
        f214254a = oVar;
    }

    public static void j(o<H, H> oVar) {
        f214255b = oVar;
    }
}
