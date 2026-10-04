package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4732h<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super T> f209632b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.h$a */
    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.g<? super T> f209634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209635c;

        public a(zc.F<? super T> actual, Bc.g<? super T> onAfterSuccess) {
            this.f209633a = actual;
            this.f209634b = onAfterSuccess;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209635c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209635c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209633a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209633a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209635c, d10)) {
                this.f209635c = d10;
                this.f209633a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T t10) {
            this.f209633a.onSuccess(t10);
            try {
                this.f209634b.accept(t10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(th);
            }
        }
    }

    public C4732h(zc.I<T> source, Bc.g<? super T> onAfterSuccess) {
        super(source);
        this.f209632b = onAfterSuccess;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this.f209632b));
    }
}
