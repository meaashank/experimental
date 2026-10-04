package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class q0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f206417b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f206419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f206421d;

        public a(hc.G<? super T> g10, long j10) {
            this.f206418a = g10;
            this.f206421d = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206420c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206420c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206419b) {
                return;
            }
            this.f206419b = true;
            this.f206420c.dispose();
            this.f206418a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206419b) {
                C5666a.Y(th);
                return;
            }
            this.f206419b = true;
            this.f206420c.dispose();
            this.f206418a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206419b) {
                return;
            }
            long j10 = this.f206421d;
            long j11 = j10 - 1;
            this.f206421d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f206418a.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206420c, bVar)) {
                this.f206420c = bVar;
                if (this.f206421d != 0) {
                    this.f206418a.onSubscribe(this);
                    return;
                }
                this.f206419b = true;
                bVar.dispose();
                EmptyDisposable.complete(this.f206418a);
            }
        }
    }

    public q0(hc.E<T> e10, long j10) {
        super(e10);
        this.f206417b = j10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206417b));
    }
}
