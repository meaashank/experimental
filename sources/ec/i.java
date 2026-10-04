package Ec;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import zc.F;
import zc.InterfaceC5888e;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class i<T> extends CountDownLatch implements F<T>, a0<T>, InterfaceC5888e, Future<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f33827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f33829c;

    public i() {
        super(1);
        this.f33829c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        io.reactivex.rxjava3.disposables.d dVar;
        DisposableHelper disposableHelper;
        do {
            dVar = this.f33829c.get();
            if (dVar == this || dVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!C1598m0.a(this.f33829c, dVar, disposableHelper));
        if (dVar != null) {
            dVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f33828b;
        if (th == null) {
            return this.f33827a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f33829c.get());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // zc.F, zc.InterfaceC5888e
    public void onComplete() {
        io.reactivex.rxjava3.disposables.d dVar = this.f33829c.get();
        if (dVar == DisposableHelper.DISPOSED) {
            return;
        }
        C1598m0.a(this.f33829c, dVar, this);
        countDown();
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onError(Throwable t10) {
        io.reactivex.rxjava3.disposables.d dVar;
        do {
            dVar = this.f33829c.get();
            if (dVar == DisposableHelper.DISPOSED) {
                Ic.a.Y(t10);
                return;
            }
            this.f33828b = t10;
        } while (!C1598m0.a(this.f33829c, dVar, this));
        countDown();
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.setOnce(this.f33829c, d10);
    }

    @Override // zc.F, zc.a0
    public void onSuccess(T t10) {
        io.reactivex.rxjava3.disposables.d dVar = this.f33829c.get();
        if (dVar == DisposableHelper.DISPOSED) {
            return;
        }
        this.f33827a = t10;
        C1598m0.a(this.f33829c, dVar, this);
        countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @yc.e TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.c.b();
            if (!await(timeout, unit)) {
                throw new TimeoutException(ExceptionHelper.h(timeout, unit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f33828b;
            if (th == null) {
                return this.f33827a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
    }
}
