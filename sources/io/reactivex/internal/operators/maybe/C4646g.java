package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import nc.InterfaceC5266b;

/* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4646g<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5266b<? super T, ? super Throwable> f205004b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.g$a */
    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f205005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5266b<? super T, ? super Throwable> f205006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205007c;

        public a(hc.t<? super T> tVar, InterfaceC5266b<? super T, ? super Throwable> interfaceC5266b) {
            this.f205005a = tVar;
            this.f205006b = interfaceC5266b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205007c.dispose();
            this.f205007c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205007c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f205007c = DisposableHelper.DISPOSED;
            try {
                this.f205006b.accept(null, null);
                this.f205005a.onComplete();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f205005a.onError(th);
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f205007c = DisposableHelper.DISPOSED;
            try {
                this.f205006b.accept(null, th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f205005a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205007c, bVar)) {
                this.f205007c = bVar;
                this.f205005a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f205007c = DisposableHelper.DISPOSED;
            try {
                this.f205006b.accept(t10, null);
                this.f205005a.onSuccess(t10);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f205005a.onError(th);
            }
        }
    }

    public C4646g(hc.w<T> wVar, InterfaceC5266b<? super T, ? super Throwable> interfaceC5266b) {
        super(wVar);
        this.f205004b = interfaceC5266b;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this.f205004b));
    }
}
