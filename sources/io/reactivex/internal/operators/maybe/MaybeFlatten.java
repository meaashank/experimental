package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatten<T, R> extends AbstractC4640a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends hc.w<? extends R>> f204888b;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super R> f204889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends hc.w<? extends R>> f204890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204891c;

        public final class a implements hc.t<R> {
            public a() {
            }

            @Override // hc.t
            public void onComplete() {
                FlatMapMaybeObserver.this.f204889a.onComplete();
            }

            @Override // hc.t
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.f204889a.onError(th);
            }

            @Override // hc.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, bVar);
            }

            @Override // hc.t
            public void onSuccess(R r10) {
                FlatMapMaybeObserver.this.f204889a.onSuccess(r10);
            }
        }

        public FlatMapMaybeObserver(hc.t<? super R> tVar, nc.o<? super T, ? extends hc.w<? extends R>> oVar) {
            this.f204889a = tVar;
            this.f204890b = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f204891c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            this.f204889a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204889a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204891c, bVar)) {
                this.f204891c = bVar;
                this.f204889a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            try {
                hc.w<? extends R> wVarApply = this.f204890b.apply(t10);
                io.reactivex.internal.functions.a.g(wVarApply, "The mapper returned a null MaybeSource");
                hc.w<? extends R> wVar = wVarApply;
                if (isDisposed()) {
                    return;
                }
                wVar.b(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f204889a.onError(e10);
            }
        }
    }

    public MaybeFlatten(hc.w<T> wVar, nc.o<? super T, ? extends hc.w<? extends R>> oVar) {
        super(wVar);
        this.f204888b = oVar;
    }

    @Override // hc.q
    public void o1(hc.t<? super R> tVar) {
        this.f204988a.b(new FlatMapMaybeObserver(tVar, this.f204888b));
    }
}
