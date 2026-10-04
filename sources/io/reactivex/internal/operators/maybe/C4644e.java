package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4644e<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.e$a */
    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hc.t<? super T> f204998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f204999b;

        public a(hc.t<? super T> tVar) {
            this.f204998a = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f204998a = null;
            this.f204999b.dispose();
            this.f204999b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f204999b.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f204999b = DisposableHelper.DISPOSED;
            hc.t<? super T> tVar = this.f204998a;
            if (tVar != null) {
                this.f204998a = null;
                tVar.onComplete();
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204999b = DisposableHelper.DISPOSED;
            hc.t<? super T> tVar = this.f204998a;
            if (tVar != null) {
                this.f204998a = null;
                tVar.onError(th);
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204999b, bVar)) {
                this.f204999b = bVar;
                this.f204998a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204999b = DisposableHelper.DISPOSED;
            hc.t<? super T> tVar = this.f204998a;
            if (tVar != null) {
                this.f204998a = null;
                tVar.onSuccess(t10);
            }
        }
    }

    public C4644e(hc.w<T> wVar) {
        super(wVar);
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar));
    }
}
