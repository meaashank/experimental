package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import uc.C5666a;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4652e<T> extends AbstractC4648a<T, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f206249b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.e$a */
    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super Boolean> f206250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super T> f206251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f206253d;

        public a(hc.G<? super Boolean> g10, nc.r<? super T> rVar) {
            this.f206250a = g10;
            this.f206251b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206252c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206252c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206253d) {
                return;
            }
            this.f206253d = true;
            this.f206250a.onNext(Boolean.TRUE);
            this.f206250a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206253d) {
                C5666a.Y(th);
            } else {
                this.f206253d = true;
                this.f206250a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206253d) {
                return;
            }
            try {
                if (this.f206251b.test(t10)) {
                    return;
                }
                this.f206253d = true;
                this.f206252c.dispose();
                this.f206250a.onNext(Boolean.FALSE);
                this.f206250a.onComplete();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206252c.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206252c, bVar)) {
                this.f206252c = bVar;
                this.f206250a.onSubscribe(this);
            }
        }
    }

    public C4652e(hc.E<T> e10, nc.r<? super T> rVar) {
        super(e10);
        this.f206249b = rVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super Boolean> g10) {
        this.f206214a.a(new a(g10, this.f206249b));
    }
}
