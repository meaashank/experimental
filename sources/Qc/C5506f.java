package qc;

import hc.InterfaceC4524d;
import hc.L;
import hc.t;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: qc.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5506f<T> extends CountDownLatch implements L<T>, InterfaceC4524d, t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f227053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f227054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.reactivex.disposables.b f227055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f227056d;

    public C5506f() {
        super(1);
    }

    public boolean a(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                if (!await(j10, timeUnit)) {
                    f();
                    return false;
                }
            } catch (InterruptedException e10) {
                f();
                throw ExceptionHelper.e(e10);
            }
        }
        Throwable th = this.f227054b;
        if (th == null) {
            return true;
        }
        throw ExceptionHelper.e(th);
    }

    public T b() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                f();
                throw ExceptionHelper.e(e10);
            }
        }
        Throwable th = this.f227054b;
        if (th == null) {
            return this.f227053a;
        }
        throw ExceptionHelper.e(th);
    }

    public T c(T t10) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                f();
                throw ExceptionHelper.e(e10);
            }
        }
        Throwable th = this.f227054b;
        if (th != null) {
            throw ExceptionHelper.e(th);
        }
        T t11 = this.f227053a;
        return t11 != null ? t11 : t10;
    }

    public Throwable d() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                f();
                return e10;
            }
        }
        return this.f227054b;
    }

    public Throwable e(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                if (!await(j10, timeUnit)) {
                    f();
                    throw ExceptionHelper.e(new TimeoutException());
                }
            } catch (InterruptedException e10) {
                f();
                throw ExceptionHelper.e(e10);
            }
        }
        return this.f227054b;
    }

    public void f() {
        this.f227056d = true;
        io.reactivex.disposables.b bVar = this.f227055c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // hc.InterfaceC4524d
    public void onComplete() {
        countDown();
    }

    @Override // hc.L
    public void onError(Throwable th) {
        this.f227054b = th;
        countDown();
    }

    @Override // hc.L
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        this.f227055c = bVar;
        if (this.f227056d) {
            bVar.dispose();
        }
    }

    @Override // hc.L
    public void onSuccess(T t10) {
        this.f227053a = t10;
        countDown();
    }
}
