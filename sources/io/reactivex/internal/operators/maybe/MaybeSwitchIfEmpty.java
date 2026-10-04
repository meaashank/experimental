package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.w<? extends T> f204924b;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2223459372976438024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.w<? extends T> f204926b;

        public static final class a<T> implements hc.t<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hc.t<? super T> f204927a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference<io.reactivex.disposables.b> f204928b;

            public a(hc.t<? super T> tVar, AtomicReference<io.reactivex.disposables.b> atomicReference) {
                this.f204927a = tVar;
                this.f204928b = atomicReference;
            }

            @Override // hc.t
            public void onComplete() {
                this.f204927a.onComplete();
            }

            @Override // hc.t
            public void onError(Throwable th) {
                this.f204927a.onError(th);
            }

            @Override // hc.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this.f204928b, bVar);
            }

            @Override // hc.t
            public void onSuccess(T t10) {
                this.f204927a.onSuccess(t10);
            }
        }

        public SwitchIfEmptyMaybeObserver(hc.t<? super T> tVar, hc.w<? extends T> wVar) {
            this.f204925a = tVar;
            this.f204926b = wVar;
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
            io.reactivex.disposables.b bVar = get();
            if (bVar == DisposableHelper.DISPOSED || !compareAndSet(bVar, null)) {
                return;
            }
            this.f204926b.b(new a(this.f204925a, this));
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204925a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f204925a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204925a.onSuccess(t10);
        }
    }

    public MaybeSwitchIfEmpty(hc.w<T> wVar, hc.w<? extends T> wVar2) {
        super(wVar);
        this.f204924b = wVar2;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new SwitchIfEmptyMaybeObserver(tVar, this.f204924b));
    }
}
