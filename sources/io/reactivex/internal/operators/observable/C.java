package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class C<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f205299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f205300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f205301d;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f205304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f205305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f205306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f205307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f205308g;

        public a(hc.G<? super T> g10, long j10, T t10, boolean z10) {
            this.f205302a = g10;
            this.f205303b = j10;
            this.f205304c = t10;
            this.f205305d = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205306e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205306e.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f205308g) {
                return;
            }
            this.f205308g = true;
            T t10 = this.f205304c;
            if (t10 == null && this.f205305d) {
                this.f205302a.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f205302a.onNext(t10);
            }
            this.f205302a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f205308g) {
                C5666a.Y(th);
            } else {
                this.f205308g = true;
                this.f205302a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f205308g) {
                return;
            }
            long j10 = this.f205307f;
            if (j10 != this.f205303b) {
                this.f205307f = j10 + 1;
                return;
            }
            this.f205308g = true;
            this.f205306e.dispose();
            this.f205302a.onNext(t10);
            this.f205302a.onComplete();
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205306e, bVar)) {
                this.f205306e = bVar;
                this.f205302a.onSubscribe(this);
            }
        }
    }

    public C(hc.E<T> e10, long j10, T t10, boolean z10) {
        super(e10);
        this.f205299b = j10;
        this.f205300c = t10;
        this.f205301d = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f205299b, this.f205300c, this.f205301d));
    }
}
