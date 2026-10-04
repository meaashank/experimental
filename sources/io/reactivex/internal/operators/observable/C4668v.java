package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import uc.C5666a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4668v<T> extends AbstractC4648a<hc.y<T>, T> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.v$a */
    public static final class a<T> implements hc.G<hc.y<T>>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f206478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206479c;

        public a(hc.G<? super T> g10) {
            this.f206477a = g10;
        }

        @Override // hc.G
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(hc.y<T> yVar) {
            if (this.f206478b) {
                if (NotificationLite.isError(yVar.f202670a)) {
                    C5666a.Y(yVar.d());
                }
            } else if (NotificationLite.isError(yVar.f202670a)) {
                this.f206479c.dispose();
                onError(yVar.d());
            } else if (!yVar.f()) {
                this.f206477a.onNext(yVar.e());
            } else {
                this.f206479c.dispose();
                onComplete();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206479c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206479c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206478b) {
                return;
            }
            this.f206478b = true;
            this.f206477a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206478b) {
                C5666a.Y(th);
            } else {
                this.f206478b = true;
                this.f206477a.onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206479c, bVar)) {
                this.f206479c = bVar;
                this.f206477a.onSubscribe(this);
            }
        }
    }

    public C4668v(hc.E<hc.y<T>> e10) {
        super(e10);
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10));
    }
}
