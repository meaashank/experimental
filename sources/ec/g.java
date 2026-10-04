package Ec;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import zc.F;
import zc.InterfaceC5888e;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class g<T> extends CountDownLatch implements a0<T>, InterfaceC5888e, F<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f33819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f33821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f33822d;

    public g() {
        super(1);
    }

    public boolean a(long timeout, TimeUnit unit) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                if (!await(timeout, unit)) {
                    e();
                    return false;
                }
            } catch (InterruptedException e10) {
                e();
                throw ExceptionHelper.i(e10);
            }
        }
        Throwable th = this.f33820b;
        if (th == null) {
            return true;
        }
        throw ExceptionHelper.i(th);
    }

    public void b(Bc.g<? super T> gVar, Bc.g<? super Throwable> gVar2, Bc.a aVar) {
        try {
            if (getCount() != 0) {
                try {
                    io.reactivex.rxjava3.internal.util.c.b();
                    await();
                } catch (InterruptedException e10) {
                    e();
                    gVar2.accept(e10);
                    return;
                }
            }
            Throwable th = this.f33820b;
            if (th != null) {
                gVar2.accept(th);
                return;
            }
            T t10 = this.f33819a;
            if (t10 != null) {
                gVar.accept(t10);
            } else {
                aVar.run();
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            Ic.a.Y(th2);
        }
    }

    public T c() {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                e();
                throw ExceptionHelper.i(e10);
            }
        }
        Throwable th = this.f33820b;
        if (th == null) {
            return this.f33819a;
        }
        throw ExceptionHelper.i(th);
    }

    public T d(T defaultValue) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                e();
                throw ExceptionHelper.i(e10);
            }
        }
        Throwable th = this.f33820b;
        if (th != null) {
            throw ExceptionHelper.i(th);
        }
        T t10 = this.f33819a;
        return t10 != null ? t10 : defaultValue;
    }

    public void e() {
        this.f33822d = true;
        io.reactivex.rxjava3.disposables.d dVar = this.f33821c;
        if (dVar != null) {
            dVar.dispose();
        }
    }

    @Override // zc.InterfaceC5888e
    public void onComplete() {
        countDown();
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onError(Throwable e10) {
        this.f33820b = e10;
        countDown();
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        this.f33821c = d10;
        if (this.f33822d) {
            d10.dispose();
        }
    }

    @Override // zc.a0
    public void onSuccess(T value) {
        this.f33819a = value;
        countDown();
    }
}
