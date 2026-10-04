package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class B<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f209938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f209939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f209940d;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f209941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f209942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f209943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f209944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f209946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f209947g;

        public a(zc.V<? super T> actual, long index, T defaultValue, boolean errorOnFewer) {
            this.f209941a = actual;
            this.f209942b = index;
            this.f209943c = defaultValue;
            this.f209944d = errorOnFewer;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209945e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209945e.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f209947g) {
                return;
            }
            this.f209947g = true;
            T t10 = this.f209943c;
            if (t10 == null && this.f209944d) {
                this.f209941a.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f209941a.onNext(t10);
            }
            this.f209941a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f209947g) {
                Ic.a.Y(t10);
            } else {
                this.f209947g = true;
                this.f209941a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f209947g) {
                return;
            }
            long j10 = this.f209946f;
            if (j10 != this.f209942b) {
                this.f209946f = j10 + 1;
                return;
            }
            this.f209947g = true;
            this.f209945e.dispose();
            this.f209941a.onNext(t10);
            this.f209941a.onComplete();
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209945e, d10)) {
                this.f209945e = d10;
                this.f209941a.onSubscribe(this);
            }
        }
    }

    public B(zc.T<T> source, long index, T defaultValue, boolean errorOnFewer) {
        super(source);
        this.f209938b = index;
        this.f209939c = defaultValue;
        this.f209940d = errorOnFewer;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(t10, this.f209938b, this.f209939c, this.f209940d));
    }
}
