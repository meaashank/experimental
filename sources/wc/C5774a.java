package wc;

import Bc.o;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import zc.W;

/* JADX INFO: renamed from: wc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile o<Callable<W>, W> f240239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o<W, W> f240240b;

    public C5774a() {
        throw new AssertionError("No instances.");
    }

    public static <T, R> R a(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    public static W b(o<Callable<W>, W> oVar, Callable<W> callable) {
        W w10 = (W) a(oVar, callable);
        if (w10 != null) {
            return w10;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static W c(Callable<W> callable) {
        try {
            W wCall = callable.call();
            if (wCall != null) {
                return wCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    public static o<Callable<W>, W> d() {
        return f240239a;
    }

    public static o<W, W> e() {
        return f240240b;
    }

    public static W f(Callable<W> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<Callable<W>, W> oVar = f240239a;
        return oVar == null ? c(callable) : b(oVar, callable);
    }

    public static W g(W w10) {
        if (w10 == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<W, W> oVar = f240240b;
        return oVar == null ? w10 : (W) a(oVar, w10);
    }

    public static void h() {
        f240239a = null;
        f240240b = null;
    }

    public static void i(o<Callable<W>, W> oVar) {
        f240239a = oVar;
    }

    public static void j(o<W, W> oVar) {
        f240240b = oVar;
    }
}
