package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class u0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f211201b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f211203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f211205d;

        public a(zc.V<? super T> actual, long limit) {
            this.f211202a = actual;
            this.f211205d = limit;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211204c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211204c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211203b) {
                return;
            }
            this.f211203b = true;
            this.f211204c.dispose();
            this.f211202a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211203b) {
                Ic.a.Y(t10);
                return;
            }
            this.f211203b = true;
            this.f211204c.dispose();
            this.f211202a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211203b) {
                return;
            }
            long j10 = this.f211205d;
            long j11 = j10 - 1;
            this.f211205d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f211202a.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211204c, d10)) {
                this.f211204c = d10;
                if (this.f211205d != 0) {
                    this.f211202a.onSubscribe(this);
                    return;
                }
                this.f211203b = true;
                d10.dispose();
                EmptyDisposable.complete(this.f211202a);
            }
        }
    }

    public u0(zc.T<T> source, long limit) {
        super(source);
        this.f211201b = limit;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f211201b));
    }
}
