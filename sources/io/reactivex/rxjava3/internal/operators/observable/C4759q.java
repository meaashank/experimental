package io.reactivex.rxjava3.internal.operators.observable;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4759q<T, U> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.T<U>> f211136b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.q$a */
    public static final class a<T, U> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.T<U>> f211138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f211140d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f211141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f211142f;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.q$a$a, reason: collision with other inner class name */
        public static final class C0784a<T, U> extends io.reactivex.rxjava3.observers.e<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a<T, U> f211143b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f211144c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final T f211145d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f211146e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final AtomicBoolean f211147f = new AtomicBoolean();

            public C0784a(a<T, U> parent, long index, T value) {
                this.f211143b = parent;
                this.f211144c = index;
                this.f211145d = value;
            }

            public void b() {
                if (this.f211147f.compareAndSet(false, true)) {
                    this.f211143b.a(this.f211144c, this.f211145d);
                }
            }

            @Override // zc.V
            public void onComplete() {
                if (this.f211146e) {
                    return;
                }
                this.f211146e = true;
                b();
            }

            @Override // zc.V
            public void onError(Throwable t10) {
                if (this.f211146e) {
                    Ic.a.Y(t10);
                } else {
                    this.f211146e = true;
                    this.f211143b.onError(t10);
                }
            }

            @Override // zc.V
            public void onNext(U t10) {
                if (this.f211146e) {
                    return;
                }
                this.f211146e = true;
                dispose();
                b();
            }
        }

        public a(zc.V<? super T> actual, Bc.o<? super T, ? extends zc.T<U>> debounceSelector) {
            this.f211137a = actual;
            this.f211138b = debounceSelector;
        }

        public void a(long idx, T value) {
            if (idx == this.f211141e) {
                this.f211137a.onNext(value);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211139c.dispose();
            DisposableHelper.dispose(this.f211140d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211139c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211142f) {
                return;
            }
            this.f211142f = true;
            io.reactivex.rxjava3.disposables.d dVar = this.f211140d.get();
            if (dVar != DisposableHelper.DISPOSED) {
                C0784a c0784a = (C0784a) dVar;
                if (c0784a != null) {
                    c0784a.b();
                }
                DisposableHelper.dispose(this.f211140d);
                this.f211137a.onComplete();
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            DisposableHelper.dispose(this.f211140d);
            this.f211137a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211142f) {
                return;
            }
            long j10 = this.f211141e + 1;
            this.f211141e = j10;
            io.reactivex.rxjava3.disposables.d dVar = this.f211140d.get();
            if (dVar != null) {
                dVar.dispose();
            }
            try {
                zc.T<U> tApply = this.f211138b.apply(t10);
                Objects.requireNonNull(tApply, "The ObservableSource supplied is null");
                zc.T<U> t11 = tApply;
                C0784a c0784a = new C0784a(this, j10, t10);
                if (C1598m0.a(this.f211140d, dVar, c0784a)) {
                    t11.a(c0784a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                dispose();
                this.f211137a.onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211139c, d10)) {
                this.f211139c = d10;
                this.f211137a.onSubscribe(this);
            }
        }
    }

    public C4759q(zc.T<T> source, Bc.o<? super T, ? extends zc.T<U>> debounceSelector) {
        super(source);
        this.f211136b = debounceSelector;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(new io.reactivex.rxjava3.observers.m(t10, false), this.f211136b));
    }
}
