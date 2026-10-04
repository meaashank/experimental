package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableWithLatestFromMany<T, R> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @yc.f
    public final zc.T<?>[] f210891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @yc.f
    public final Iterable<? extends zc.T<?>> f210892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @yc.e
    public final Bc.o<? super Object[], R> f210893d;

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1577321883966341961L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super R> f210894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super Object[], R> f210895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WithLatestInnerObserver[] f210896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f210897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicThrowable f210899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f210900g;

        public WithLatestFromObserver(zc.V<? super R> actual, Bc.o<? super Object[], R> combiner, int n10) {
            this.f210894a = actual;
            this.f210895b = combiner;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[n10];
            for (int i10 = 0; i10 < n10; i10++) {
                withLatestInnerObserverArr[i10] = new WithLatestInnerObserver(this, i10);
            }
            this.f210896c = withLatestInnerObserverArr;
            this.f210897d = new AtomicReferenceArray<>(n10);
            this.f210898e = new AtomicReference<>();
            this.f210899f = new AtomicThrowable();
        }

        public void a(int index) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f210896c;
            for (int i10 = 0; i10 < withLatestInnerObserverArr.length; i10++) {
                if (i10 != index) {
                    WithLatestInnerObserver withLatestInnerObserver = withLatestInnerObserverArr[i10];
                    withLatestInnerObserver.getClass();
                    DisposableHelper.dispose(withLatestInnerObserver);
                }
            }
        }

        public void b(int index, boolean nonEmpty) {
            if (nonEmpty) {
                return;
            }
            this.f210900g = true;
            a(index);
            io.reactivex.rxjava3.internal.util.g.b(this.f210894a, this, this.f210899f);
        }

        public void c(int index, Throwable t10) {
            this.f210900g = true;
            DisposableHelper.dispose(this.f210898e);
            a(index);
            io.reactivex.rxjava3.internal.util.g.d(this.f210894a, t10, this, this.f210899f);
        }

        public void d(int index, Object o10) {
            this.f210897d.set(index, o10);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this.f210898e);
            for (WithLatestInnerObserver withLatestInnerObserver : this.f210896c) {
                withLatestInnerObserver.getClass();
                DisposableHelper.dispose(withLatestInnerObserver);
            }
        }

        public void e(zc.T<?>[] others, int n10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f210896c;
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f210898e;
            for (int i10 = 0; i10 < n10 && !DisposableHelper.isDisposed(atomicReference.get()) && !this.f210900g; i10++) {
                others[i10].a(withLatestInnerObserverArr[i10]);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f210898e.get());
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f210900g) {
                return;
            }
            this.f210900g = true;
            a(-1);
            io.reactivex.rxjava3.internal.util.g.b(this.f210894a, this, this.f210899f);
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f210900g) {
                Ic.a.Y(t10);
                return;
            }
            this.f210900g = true;
            a(-1);
            io.reactivex.rxjava3.internal.util.g.d(this.f210894a, t10, this, this.f210899f);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f210900g) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f210897d;
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
                R rApply = this.f210895b.apply(objArr);
                Objects.requireNonNull(rApply, "combiner returned a null value");
                io.reactivex.rxjava3.internal.util.g.e(this.f210894a, rApply, this, this.f210899f);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this.f210898e, d10);
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.V<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WithLatestFromObserver<?, ?> f210901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f210902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f210903c;

        public WithLatestInnerObserver(WithLatestFromObserver<?, ?> parent, int index) {
            this.f210901a = parent;
            this.f210902b = index;
        }

        public void d() {
            DisposableHelper.dispose(this);
        }

        @Override // zc.V
        public void onComplete() {
            this.f210901a.b(this.f210902b, this.f210903c);
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210901a.c(this.f210902b, t10);
        }

        @Override // zc.V
        public void onNext(Object t10) {
            if (!this.f210903c) {
                this.f210903c = true;
            }
            this.f210901a.d(this.f210902b, t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }
    }

    public final class a implements Bc.o<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // Bc.o
        public R apply(T t10) throws Throwable {
            R rApply = ObservableWithLatestFromMany.this.f210893d.apply(new Object[]{t10});
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            return rApply;
        }
    }

    public ObservableWithLatestFromMany(@yc.e zc.T<T> source, @yc.e zc.T<?>[] otherArray, @yc.e Bc.o<? super Object[], R> combiner) {
        super(source);
        this.f210891b = otherArray;
        this.f210892c = null;
        this.f210893d = combiner;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> observer) {
        int length;
        zc.T<?>[] tArr = this.f210891b;
        if (tArr == null) {
            tArr = new zc.T[8];
            try {
                length = 0;
                for (zc.T<?> t10 : this.f210892c) {
                    if (length == tArr.length) {
                        tArr = (zc.T[]) Arrays.copyOf(tArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    tArr[length] = t10;
                    length = i10;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = tArr.length;
        }
        if (length == 0) {
            new C4743b0(this.f210954a, new a()).d6(observer);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(observer, this.f210893d, length);
        observer.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.e(tArr, length);
        this.f210954a.a(withLatestFromObserver);
    }

    public ObservableWithLatestFromMany(@yc.e zc.T<T> source, @yc.e Iterable<? extends zc.T<?>> otherIterable, @yc.e Bc.o<? super Object[], R> combiner) {
        super(source);
        this.f210891b = null;
        this.f210892c = otherIterable;
        this.f210893d = combiner;
    }
}
