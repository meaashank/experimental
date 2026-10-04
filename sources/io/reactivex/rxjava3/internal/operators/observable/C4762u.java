package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4762u<T, R> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.K<R>> f211196b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.u$a */
    public static final class a<T, R> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super R> f211197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.K<R>> f211198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f211199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211200d;

        public a(zc.V<? super R> downstream, Bc.o<? super T, ? extends zc.K<R>> selector) {
            this.f211197a = downstream;
            this.f211198b = selector;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211200d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211200d.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211199c) {
                return;
            }
            this.f211199c = true;
            this.f211197a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211199c) {
                Ic.a.Y(t10);
            } else {
                this.f211199c = true;
                this.f211197a.onError(t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zc.V
        public void onNext(T item) {
            if (this.f211199c) {
                if (item instanceof zc.K) {
                    zc.K k10 = (zc.K) item;
                    if (NotificationLite.isError(k10.f241333a)) {
                        Ic.a.Y(k10.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                zc.K<R> kApply = this.f211198b.apply(item);
                Objects.requireNonNull(kApply, "The selector returned a null Notification");
                zc.K<R> k11 = kApply;
                if (NotificationLite.isError(k11.f241333a)) {
                    this.f211200d.dispose();
                    onError(k11.d());
                } else if (!k11.f()) {
                    this.f211197a.onNext(k11.e());
                } else {
                    this.f211200d.dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211200d.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211200d, d10)) {
                this.f211200d = d10;
                this.f211197a.onSubscribe(this);
            }
        }
    }

    public C4762u(zc.T<T> source, Bc.o<? super T, ? extends zc.K<R>> selector) {
        super(source);
        this.f211196b = selector;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> observer) {
        this.f210954a.a(new a(observer, this.f211196b));
    }
}
