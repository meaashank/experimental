package io.reactivex.rxjava3.subjects;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import yc.e;
import yc.f;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class PublishSubject<T> extends c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PublishDisposable[] f212106c = new PublishDisposable[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PublishDisposable[] f212107d = new PublishDisposable[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<PublishDisposable<T>[]> f212108a = new AtomicReference<>(f212107d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f212109b;

    public static final class PublishDisposable<T> extends AtomicBoolean implements d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V<? super T> f212110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishSubject<T> f212111b;

        public PublishDisposable(V<? super T> actual, PublishSubject<T> parent) {
            this.f212110a = actual;
            this.f212111b = parent;
        }

        public void d() {
            if (get()) {
                return;
            }
            this.f212110a.onComplete();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f212111b.H8(this);
            }
        }

        public void e(Throwable t10) {
            if (get()) {
                Ic.a.Y(t10);
            } else {
                this.f212110a.onError(t10);
            }
        }

        public void f(T t10) {
            if (get()) {
                return;
            }
            this.f212110a.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return get();
        }
    }

    @e
    @yc.c
    public static <T> PublishSubject<T> G8() {
        return new PublishSubject<>();
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @f
    @yc.c
    public Throwable A8() {
        if (this.f212108a.get() == f212106c) {
            return this.f212109b;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean B8() {
        return this.f212108a.get() == f212106c && this.f212109b == null;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean C8() {
        return this.f212108a.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean D8() {
        return this.f212108a.get() == f212106c && this.f212109b != null;
    }

    public boolean F8(PublishDisposable<T> ps) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f212108a.get();
            if (publishDisposableArr == f212106c) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = ps;
        } while (!C1598m0.a(this.f212108a, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    public void H8(PublishDisposable<T> ps) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f212108a.get();
            if (publishDisposableArr == f212106c || publishDisposableArr == f212107d) {
                return;
            }
            int length = publishDisposableArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (publishDisposableArr[i10] == ps) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f212107d;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i10);
                System.arraycopy(publishDisposableArr, i10 + 1, publishDisposableArr3, i10, (length - i10) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!C1598m0.a(this.f212108a, publishDisposableArr, publishDisposableArr2));
    }

    @Override // zc.N
    public void d6(V<? super T> t10) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(t10, this);
        t10.onSubscribe(publishDisposable);
        if (F8(publishDisposable)) {
            if (publishDisposable.get()) {
                H8(publishDisposable);
            }
        } else {
            Throwable th = this.f212109b;
            if (th != null) {
                t10.onError(th);
            } else {
                t10.onComplete();
            }
        }
    }

    @Override // zc.V
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f212108a.get();
        PublishDisposable<T>[] publishDisposableArr2 = f212106c;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.f212108a.getAndSet(publishDisposableArr2)) {
            publishDisposable.d();
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        PublishDisposable<T>[] publishDisposableArr = this.f212108a.get();
        PublishDisposable<T>[] publishDisposableArr2 = f212106c;
        if (publishDisposableArr == publishDisposableArr2) {
            Ic.a.Y(t10);
            return;
        }
        this.f212109b = t10;
        for (PublishDisposable<T> publishDisposable : this.f212108a.getAndSet(publishDisposableArr2)) {
            publishDisposable.e(t10);
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        for (PublishDisposable<T> publishDisposable : this.f212108a.get()) {
            publishDisposable.f(t10);
        }
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (this.f212108a.get() == f212106c) {
            d10.dispose();
        }
    }
}
