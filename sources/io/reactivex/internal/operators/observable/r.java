package io.reactivex.internal.operators.observable;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class r<T, U> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends hc.E<U>> f206422b;

    public static final class a<T, U> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends hc.E<U>> f206424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f206426d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f206427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f206428f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.r$a$a, reason: collision with other inner class name */
        public static final class C0766a<T, U> extends io.reactivex.observers.d<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a<T, U> f206429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f206430c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final T f206431d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f206432e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final AtomicBoolean f206433f = new AtomicBoolean();

            public C0766a(a<T, U> aVar, long j10, T t10) {
                this.f206429b = aVar;
                this.f206430c = j10;
                this.f206431d = t10;
            }

            public void b() {
                if (this.f206433f.compareAndSet(false, true)) {
                    this.f206429b.a(this.f206430c, this.f206431d);
                }
            }

            @Override // hc.G
            public void onComplete() {
                if (this.f206432e) {
                    return;
                }
                this.f206432e = true;
                b();
            }

            @Override // hc.G
            public void onError(Throwable th) {
                if (this.f206432e) {
                    C5666a.Y(th);
                } else {
                    this.f206432e = true;
                    this.f206429b.onError(th);
                }
            }

            @Override // hc.G
            public void onNext(U u10) {
                if (this.f206432e) {
                    return;
                }
                this.f206432e = true;
                dispose();
                b();
            }
        }

        public a(hc.G<? super T> g10, nc.o<? super T, ? extends hc.E<U>> oVar) {
            this.f206423a = g10;
            this.f206424b = oVar;
        }

        public void a(long j10, T t10) {
            if (j10 == this.f206427e) {
                this.f206423a.onNext(t10);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206425c.dispose();
            DisposableHelper.dispose(this.f206426d);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206425c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206428f) {
                return;
            }
            this.f206428f = true;
            io.reactivex.disposables.b bVar = this.f206426d.get();
            if (bVar != DisposableHelper.DISPOSED) {
                ((C0766a) bVar).b();
                DisposableHelper.dispose(this.f206426d);
                this.f206423a.onComplete();
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f206426d);
            this.f206423a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206428f) {
                return;
            }
            long j10 = this.f206427e + 1;
            this.f206427e = j10;
            io.reactivex.disposables.b bVar = this.f206426d.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                hc.E<U> eApply = this.f206424b.apply(t10);
                io.reactivex.internal.functions.a.g(eApply, "The ObservableSource supplied is null");
                hc.E<U> e10 = eApply;
                C0766a c0766a = new C0766a(this, j10, t10);
                if (C1598m0.a(this.f206426d, bVar, c0766a)) {
                    e10.a(c0766a);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                dispose();
                this.f206423a.onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206425c, bVar)) {
                this.f206425c = bVar;
                this.f206423a.onSubscribe(this);
            }
        }
    }

    public r(hc.E<T> e10, nc.o<? super T, ? extends hc.E<U>> oVar) {
        super(e10);
        this.f206422b = oVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(new io.reactivex.observers.l(g10, false), this.f206422b));
    }
}
