package qc;

import androidx.compose.animation.core.C1598m0;
import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class h<T> extends CountDownLatch implements G<T>, Future<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f227061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f227062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f227063c;

    public h() {
        super(1);
        this.f227063c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        io.reactivex.disposables.b bVar;
        DisposableHelper disposableHelper;
        do {
            bVar = this.f227063c.get();
            if (bVar == this || bVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!C1598m0.a(this.f227063c, bVar, disposableHelper));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            io.reactivex.internal.util.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f227062b;
        if (th == null) {
            return this.f227061a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f227063c.get());
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // hc.G
    public void onComplete() {
        io.reactivex.disposables.b bVar;
        if (this.f227061a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f227063c.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!C1598m0.a(this.f227063c, bVar, this));
        countDown();
    }

    @Override // hc.G
    public void onError(Throwable th) {
        io.reactivex.disposables.b bVar;
        if (this.f227062b != null) {
            C5666a.Y(th);
            return;
        }
        this.f227062b = th;
        do {
            bVar = this.f227063c.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                C5666a.Y(th);
                return;
            }
        } while (!C1598m0.a(this.f227063c, bVar, this));
        countDown();
    }

    @Override // hc.G
    public void onNext(T t10) {
        if (this.f227061a == null) {
            this.f227061a = t10;
        } else {
            this.f227063c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this.f227063c, bVar);
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.c.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException();
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f227062b;
            if (th == null) {
                return this.f227061a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }
}
