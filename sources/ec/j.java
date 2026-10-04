package Ec;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class j<T> extends CountDownLatch implements V<T>, Future<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f33830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f33832c;

    public j() {
        super(1);
        this.f33832c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        io.reactivex.rxjava3.disposables.d dVar;
        DisposableHelper disposableHelper;
        do {
            dVar = this.f33832c.get();
            if (dVar == this || dVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!C1598m0.a(this.f33832c, dVar, disposableHelper));
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
        Throwable th = this.f33831b;
        if (th == null) {
            return this.f33830a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f33832c.get());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // zc.V
    public void onComplete() {
        if (this.f33830a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        io.reactivex.rxjava3.disposables.d dVar = this.f33832c.get();
        if (dVar == this || dVar == DisposableHelper.DISPOSED || !C1598m0.a(this.f33832c, dVar, this)) {
            return;
        }
        countDown();
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        io.reactivex.rxjava3.disposables.d dVar;
        if (this.f33831b != null || (dVar = this.f33832c.get()) == this || dVar == DisposableHelper.DISPOSED || !C1598m0.a(this.f33832c, dVar, this)) {
            Ic.a.Y(t10);
        } else {
            this.f33831b = t10;
            countDown();
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        if (this.f33830a == null) {
            this.f33830a = t10;
        } else {
            this.f33832c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // zc.V
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.setOnce(this.f33832c, d10);
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
            Throwable th = this.f33831b;
            if (th == null) {
                return this.f33830a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
    }
}
