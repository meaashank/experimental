package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableWithLatestFromMany<T, R> extends AbstractC4648a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @lc.f
    public final hc.E<?>[] f206143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @lc.f
    public final Iterable<? extends hc.E<?>> f206144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @lc.e
    public final nc.o<? super Object[], R> f206145d;

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super R> f206146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super Object[], R> f206147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WithLatestInnerObserver[] f206148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f206149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f206150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicThrowable f206151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f206152g;

        public WithLatestFromObserver(hc.G<? super R> g10, nc.o<? super Object[], R> oVar, int i10) {
            this.f206146a = g10;
            this.f206147b = oVar;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                withLatestInnerObserverArr[i11] = new WithLatestInnerObserver(this, i11);
            }
            this.f206148c = withLatestInnerObserverArr;
            this.f206149d = new AtomicReferenceArray<>(i10);
            this.f206150e = new AtomicReference<>();
            this.f206151f = new AtomicThrowable();
        }

        public void a(int i10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f206148c;
            for (int i11 = 0; i11 < withLatestInnerObserverArr.length; i11++) {
                if (i11 != i10) {
                    WithLatestInnerObserver withLatestInnerObserver = withLatestInnerObserverArr[i11];
                    withLatestInnerObserver.getClass();
                    DisposableHelper.dispose(withLatestInnerObserver);
                }
            }
        }

        public void b(int i10, boolean z10) {
            if (z10) {
                return;
            }
            this.f206152g = true;
            a(i10);
            io.reactivex.internal.util.g.a(this.f206146a, this, this.f206151f);
        }

        public void c(int i10, Throwable th) {
            this.f206152g = true;
            DisposableHelper.dispose(this.f206150e);
            a(i10);
            io.reactivex.internal.util.g.c(this.f206146a, th, this, this.f206151f);
        }

        public void d(int i10, Object obj) {
            this.f206149d.set(i10, obj);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f206150e);
            for (WithLatestInnerObserver withLatestInnerObserver : this.f206148c) {
                withLatestInnerObserver.getClass();
                DisposableHelper.dispose(withLatestInnerObserver);
            }
        }

        public void e(hc.E<?>[] eArr, int i10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f206148c;
            AtomicReference<io.reactivex.disposables.b> atomicReference = this.f206150e;
            for (int i11 = 0; i11 < i10 && !DisposableHelper.isDisposed(atomicReference.get()) && !this.f206152g; i11++) {
                eArr[i11].a(withLatestInnerObserverArr[i11]);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f206150e.get());
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206152g) {
                return;
            }
            this.f206152g = true;
            a(-1);
            io.reactivex.internal.util.g.a(this.f206146a, this, this.f206151f);
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206152g) {
                C5666a.Y(th);
                return;
            }
            this.f206152g = true;
            a(-1);
            io.reactivex.internal.util.g.c(this.f206146a, th, this, this.f206151f);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206152g) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f206149d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i10 = 0;
            objArr[0] = t10;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                R rApply = this.f206147b.apply(objArr);
                io.reactivex.internal.functions.a.g(rApply, "combiner returned a null value");
                io.reactivex.internal.util.g.e(this.f206146a, rApply, this, this.f206151f);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f206150e, bVar);
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements hc.G<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WithLatestFromObserver<?, ?> f206153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f206154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f206155c;

        public WithLatestInnerObserver(WithLatestFromObserver<?, ?> withLatestFromObserver, int i10) {
            this.f206153a = withLatestFromObserver;
            this.f206154b = i10;
        }

        public void d() {
            DisposableHelper.dispose(this);
        }

        @Override // hc.G
        public void onComplete() {
            this.f206153a.b(this.f206154b, this.f206155c);
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206153a.c(this.f206154b, th);
        }

        @Override // hc.G
        public void onNext(Object obj) {
            if (!this.f206155c) {
                this.f206155c = true;
            }
            this.f206153a.d(this.f206154b, obj);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public final class a implements nc.o<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // nc.o
        public R apply(T t10) throws Exception {
            R rApply = ObservableWithLatestFromMany.this.f206145d.apply(new Object[]{t10});
            io.reactivex.internal.functions.a.g(rApply, "The combiner returned a null value");
            return rApply;
        }
    }

    public ObservableWithLatestFromMany(@lc.e hc.E<T> e10, @lc.e hc.E<?>[] eArr, @lc.e nc.o<? super Object[], R> oVar) {
        super(e10);
        this.f206143b = eArr;
        this.f206144c = null;
        this.f206145d = oVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super R> g10) {
        int length;
        hc.E<?>[] eArr = this.f206143b;
        if (eArr == null) {
            eArr = new hc.E[8];
            try {
                length = 0;
                for (hc.E<?> e10 : this.f206144c) {
                    if (length == eArr.length) {
                        eArr = (hc.E[]) Arrays.copyOf(eArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    eArr[length] = e10;
                    length = i10;
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                EmptyDisposable.error(th, g10);
                return;
            }
        } else {
            length = eArr.length;
        }
        if (length == 0) {
            new Y(this.f206214a, new a()).C5(g10);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(g10, this.f206145d, length);
        g10.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.e(eArr, length);
        this.f206214a.a(withLatestFromObserver);
    }

    public ObservableWithLatestFromMany(@lc.e hc.E<T> e10, @lc.e Iterable<? extends hc.E<?>> iterable, @lc.e nc.o<? super Object[], R> oVar) {
        super(e10);
        this.f206143b = null;
        this.f206144c = iterable;
        this.f206145d = oVar;
    }
}
