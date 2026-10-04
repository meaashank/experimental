package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.E<? extends T> f205292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205293b;

    public static final class BlockingObservableIterator<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.G<T>, Iterator<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.reactivex.internal.queue.a<T> f205294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Lock f205295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Condition f205296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f205297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f205298e;

        public BlockingObservableIterator(int i10) {
            this.f205294a = new io.reactivex.internal.queue.a<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f205295b = reentrantLock;
            this.f205296c = reentrantLock.newCondition();
        }

        public void d() {
            this.f205295b.lock();
            try {
                this.f205296c.signalAll();
            } finally {
                this.f205295b.unlock();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.f205297d;
                boolean zIsEmpty = this.f205294a.isEmpty();
                if (z10) {
                    Throwable th = this.f205298e;
                    if (th != null) {
                        throw ExceptionHelper.e(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    io.reactivex.internal.util.c.b();
                    this.f205295b.lock();
                    while (!this.f205297d && this.f205294a.isEmpty()) {
                        try {
                            this.f205296c.await();
                        } finally {
                        }
                    }
                    this.f205295b.unlock();
                } catch (InterruptedException e10) {
                    DisposableHelper.dispose(this);
                    d();
                    throw ExceptionHelper.e(e10);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f205294a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // hc.G
        public void onComplete() {
            this.f205297d = true;
            d();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205298e = th;
            this.f205297d = true;
            d();
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f205294a.offer(t10);
            d();
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public BlockingObservableIterable(hc.E<? extends T> e10, int i10) {
        this.f205292a = e10;
        this.f205293b = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.f205293b);
        this.f205292a.a(blockingObservableIterator);
        return blockingObservableIterator;
    }
}
