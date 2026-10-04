package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeOnErrorNext<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super Throwable, ? extends hc.w<? extends T>> f204912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f204913c;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 2026620218879969836L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super Throwable, ? extends hc.w<? extends T>> f204915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f204916c;

        public static final class a<T> implements hc.t<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hc.t<? super T> f204917a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference<io.reactivex.disposables.b> f204918b;

            public a(hc.t<? super T> tVar, AtomicReference<io.reactivex.disposables.b> atomicReference) {
                this.f204917a = tVar;
                this.f204918b = atomicReference;
            }

            @Override // hc.t
            public void onComplete() {
                this.f204917a.onComplete();
            }

            @Override // hc.t
            public void onError(Throwable th) {
                this.f204917a.onError(th);
            }

            @Override // hc.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this.f204918b, bVar);
            }

            @Override // hc.t
            public void onSuccess(T t10) {
                this.f204917a.onSuccess(t10);
            }
        }

        public OnErrorNextMaybeObserver(hc.t<? super T> tVar, nc.o<? super Throwable, ? extends hc.w<? extends T>> oVar, boolean z10) {
            this.f204914a = tVar;
            this.f204915b = oVar;
            this.f204916c = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            this.f204914a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            if (!this.f204916c && !(th instanceof Exception)) {
                this.f204914a.onError(th);
                return;
            }
            try {
                hc.w<? extends T> wVarApply = this.f204915b.apply(th);
                io.reactivex.internal.functions.a.g(wVarApply, "The resumeFunction returned a null MaybeSource");
                hc.w<? extends T> wVar = wVarApply;
                DisposableHelper.replace(this, null);
                wVar.b(new a(this.f204914a, this));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f204914a.onError(new CompositeException(th, th2));
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f204914a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204914a.onSuccess(t10);
        }
    }

    public MaybeOnErrorNext(hc.w<T> wVar, nc.o<? super Throwable, ? extends hc.w<? extends T>> oVar, boolean z10) {
        super(wVar);
        this.f204912b = oVar;
        this.f204913c = z10;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new OnErrorNextMaybeObserver(tVar, this.f204912b, this.f204913c));
    }
}
