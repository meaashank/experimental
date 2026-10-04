package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4753k<T, U extends Collection<? super T>, B> extends AbstractC4740a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.T<B> f211042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.s<U> f211043c;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.k$a */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.observers.e<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T, U, B> f211044b;

        public a(b<T, U, B> parent) {
            this.f211044b = parent;
        }

        @Override // zc.V
        public void onComplete() {
            this.f211044b.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211044b.onError(t10);
        }

        @Override // zc.V
        public void onNext(B t10) {
            this.f211044b.i();
        }
    }

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.k$b */
    public static final class b<T, U extends Collection<? super T>, B> extends Ec.l<T, U, U> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public final Bc.s<U> f211045K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public final zc.T<B> f211046L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211047M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211048N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public U f211049O;

        public b(zc.V<? super U> actual, Bc.s<U> bufferSupplier, zc.T<B> boundary) {
            super(actual, new MpscLinkedQueue());
            this.f211045K = bufferSupplier;
            this.f211046L = boundary;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f33835H) {
                return;
            }
            this.f33835H = true;
            this.f211048N.dispose();
            this.f211047M.dispose();
            if (c()) {
                this.f33834G.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // Ec.l, io.reactivex.rxjava3.internal.util.j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(zc.V<? super U> v10, U u10) {
            this.f33833F.onNext((Object) u10);
        }

        public void i() {
            try {
                U u10 = this.f211045K.get();
                Objects.requireNonNull(u10, "The buffer supplied is null");
                U u11 = u10;
                synchronized (this) {
                    try {
                        U u12 = this.f211049O;
                        if (u12 == null) {
                            return;
                        }
                        this.f211049O = u11;
                        f(u12, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                dispose();
                this.f33833F.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f33835H;
        }

        @Override // zc.V
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f211049O;
                    if (u10 == null) {
                        return;
                    }
                    this.f211049O = null;
                    this.f33834G.offer(u10);
                    this.f33836I = true;
                    if (c()) {
                        io.reactivex.rxjava3.internal.util.n.d(this.f33834G, this.f33833F, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            dispose();
            this.f33833F.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f211049O;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211047M, d10)) {
                this.f211047M = d10;
                try {
                    U u10 = this.f211045K.get();
                    Objects.requireNonNull(u10, "The buffer supplied is null");
                    this.f211049O = u10;
                    a aVar = new a(this);
                    this.f211048N = aVar;
                    this.f33833F.onSubscribe(this);
                    if (this.f33835H) {
                        return;
                    }
                    this.f211046L.a(aVar);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.f33835H = true;
                    d10.dispose();
                    EmptyDisposable.error(th, this.f33833F);
                }
            }
        }
    }

    public C4753k(zc.T<T> source, zc.T<B> boundary, Bc.s<U> bufferSupplier) {
        super(source);
        this.f211042b = boundary;
        this.f211043c = bufferSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super U> t10) {
        this.f210954a.a(new b(new io.reactivex.rxjava3.observers.m(t10, false), this.f211043c, this.f211042b));
    }
}
