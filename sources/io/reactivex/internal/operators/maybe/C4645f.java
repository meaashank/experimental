package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4645f<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f205000b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.f$a */
    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f205001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5271g<? super T> f205002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205003c;

        public a(hc.t<? super T> tVar, InterfaceC5271g<? super T> interfaceC5271g) {
            this.f205001a = tVar;
            this.f205002b = interfaceC5271g;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205003c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205003c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f205001a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f205001a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205003c, bVar)) {
                this.f205003c = bVar;
                this.f205001a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f205001a.onSuccess(t10);
            try {
                this.f205002b.accept(t10);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(th);
            }
        }
    }

    public C4645f(hc.w<T> wVar, InterfaceC5271g<? super T> interfaceC5271g) {
        super(wVar);
        this.f205000b = interfaceC5271g;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this.f205000b));
    }
}
