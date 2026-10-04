package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.T<? extends T> f209950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209951b;

    public static final class BlockingObservableIterator<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.V<T>, Iterator<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6695226475494099826L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<T> f209952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Lock f209953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Condition f209954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f209955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile Throwable f209956e;

        public BlockingObservableIterator(int batchSize) {
            this.f209952a = new io.reactivex.rxjava3.internal.queue.a<>(batchSize);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f209953b = reentrantLock;
            this.f209954c = reentrantLock.newCondition();
        }

        public void d() {
            this.f209953b.lock();
            try {
                this.f209954c.signalAll();
            } finally {
                this.f209953b.unlock();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z10 = this.f209955d;
                boolean zIsEmpty = this.f209952a.isEmpty();
                if (z10) {
                    Throwable th = this.f209956e;
                    if (th != null) {
                        throw ExceptionHelper.i(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    io.reactivex.rxjava3.internal.util.c.b();
                    this.f209953b.lock();
                    while (!this.f209955d && this.f209952a.isEmpty() && !isDisposed()) {
                        try {
                            this.f209954c.await();
                        } finally {
                        }
                    }
                    this.f209953b.unlock();
                } catch (InterruptedException e10) {
                    DisposableHelper.dispose(this);
                    d();
                    throw ExceptionHelper.i(e10);
                }
            }
            Throwable th2 = this.f209956e;
            if (th2 == null) {
                return false;
            }
            throw ExceptionHelper.i(th2);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f209952a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // zc.V
        public void onComplete() {
            this.f209955d = true;
            d();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f209956e = t10;
            this.f209955d = true;
            d();
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f209952a.offer(t10);
            d();
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public BlockingObservableIterable(zc.T<? extends T> source, int bufferSize) {
        this.f209950a = source;
        this.f209951b = bufferSize;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.f209951b);
        this.f209950a.a(blockingObservableIterator);
        return blockingObservableIterator;
    }
}
