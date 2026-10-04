package Ec;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.CountDownLatch;
import zc.F;
import zc.InterfaceC5888e;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> extends CountDownLatch implements F<T>, a0<T>, InterfaceC5888e, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f33816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SequentialDisposable f33818c;

    public d() {
        super(1);
        this.f33818c = new SequentialDisposable();
    }

    public void a(InterfaceC5888e observer) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                observer.onError(e10);
                return;
            }
        }
        if (this.f33818c.isDisposed()) {
            return;
        }
        Throwable th = this.f33817b;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    public void b(F<? super T> f10) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                f10.onError(e10);
                return;
            }
        }
        if (this.f33818c.isDisposed()) {
            return;
        }
        Throwable th = this.f33817b;
        if (th != null) {
            f10.onError(th);
            return;
        }
        T t10 = this.f33816a;
        if (t10 == null) {
            f10.onComplete();
        } else {
            f10.onSuccess(t10);
        }
    }

    public void c(a0<? super T> a0Var) {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                a0Var.onError(e10);
                return;
            }
        }
        if (this.f33818c.isDisposed()) {
            return;
        }
        Throwable th = this.f33817b;
        if (th != null) {
            a0Var.onError(th);
        } else {
            a0Var.onSuccess(this.f33816a);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        SequentialDisposable sequentialDisposable = this.f33818c;
        sequentialDisposable.getClass();
        DisposableHelper.dispose(sequentialDisposable);
        countDown();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f33818c.isDisposed();
    }

    @Override // zc.F, zc.InterfaceC5888e
    public void onComplete() {
        this.f33818c.lazySet(EmptyDisposable.INSTANCE);
        countDown();
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onError(@yc.e Throwable e10) {
        this.f33817b = e10;
        this.f33818c.lazySet(EmptyDisposable.INSTANCE);
        countDown();
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.setOnce(this.f33818c, d10);
    }

    @Override // zc.F, zc.a0
    public void onSuccess(@yc.e T t10) {
        this.f33816a = t10;
        this.f33818c.lazySet(EmptyDisposable.INSTANCE);
        countDown();
    }
}
