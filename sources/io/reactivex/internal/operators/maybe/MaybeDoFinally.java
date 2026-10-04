package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC5265a;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDoFinally<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5265a f204834b;

    public static final class DoFinallyObserver<T> extends AtomicInteger implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5265a f204836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204837c;

        public DoFinallyObserver(hc.t<? super T> tVar, InterfaceC5265a interfaceC5265a) {
            this.f204835a = tVar;
            this.f204836b = interfaceC5265a;
        }

        public void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f204836b.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    C5666a.Y(th);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f204837c.dispose();
            d();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f204837c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f204835a.onComplete();
            d();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204835a.onError(th);
            d();
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204837c, bVar)) {
                this.f204837c = bVar;
                this.f204835a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204835a.onSuccess(t10);
            d();
        }
    }

    public MaybeDoFinally(hc.w<T> wVar, InterfaceC5265a interfaceC5265a) {
        super(wVar);
        this.f204834b = interfaceC5265a;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new DoFinallyObserver(tVar, this.f204834b));
    }
}
