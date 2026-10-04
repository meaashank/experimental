package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class C<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super Throwable> f204742b;

    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super Throwable> f204744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204745c;

        public a(hc.t<? super T> tVar, nc.r<? super Throwable> rVar) {
            this.f204743a = tVar;
            this.f204744b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f204745c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f204745c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f204743a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            try {
                if (this.f204744b.test(th)) {
                    this.f204743a.onComplete();
                } else {
                    this.f204743a.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f204743a.onError(new CompositeException(th, th2));
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204745c, bVar)) {
                this.f204745c = bVar;
                this.f204743a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204743a.onSuccess(t10);
        }
    }

    public C(hc.w<T> wVar, nc.r<? super Throwable> rVar) {
        super(wVar);
        this.f204742b = rVar;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this.f204742b));
    }
}
