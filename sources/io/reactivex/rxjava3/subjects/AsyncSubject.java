package io.reactivex.rxjava3.subjects;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import yc.e;
import yc.f;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class AsyncSubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AsyncDisposable[] f212087d = new AsyncDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AsyncDisposable[] f212088e = new AsyncDisposable[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<AsyncDisposable<T>[]> f212089a = new AtomicReference<>(f212087d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f212090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f212091c;

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AsyncSubject<T> f212092h;

        public AsyncDisposable(V<? super T> actual, AsyncSubject<T> parent) {
            super(actual);
            this.f212092h = parent;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (j()) {
                this.f212092h.J8(this);
            }
        }

        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.f207590a.onComplete();
        }

        public void onError(Throwable t10) {
            if (isDisposed()) {
                Ic.a.Y(t10);
            } else {
                this.f207590a.onError(t10);
            }
        }
    }

    @e
    @yc.c
    public static <T> AsyncSubject<T> G8() {
        return new AsyncSubject<>();
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public Throwable A8() {
        if (this.f212089a.get() == f212088e) {
            return this.f212090b;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean B8() {
        return this.f212089a.get() == f212088e && this.f212090b == null;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean C8() {
        return this.f212089a.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean D8() {
        return this.f212089a.get() == f212088e && this.f212090b != null;
    }

    public boolean F8(AsyncDisposable<T> ps) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f212089a.get();
            if (asyncDisposableArr == f212088e) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = ps;
        } while (!C1598m0.a(this.f212089a, asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    @f
    @yc.c
    public T H8() {
        if (this.f212089a.get() == f212088e) {
            return this.f212091c;
        }
        return null;
    }

    @yc.c
    public boolean I8() {
        return this.f212089a.get() == f212088e && this.f212091c != null;
    }

    public void J8(AsyncDisposable<T> ps) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f212089a.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (asyncDisposableArr[i10] == ps) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                asyncDisposableArr2 = f212087d;
            } else {
                AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i10);
                System.arraycopy(asyncDisposableArr, i10 + 1, asyncDisposableArr3, i10, (length - i10) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!C1598m0.a(this.f212089a, asyncDisposableArr, asyncDisposableArr2));
    }

    @Override // zc.N
    public void d6(V<? super T> observer) {
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(observer, this);
        observer.onSubscribe(asyncDisposable);
        if (F8(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                J8(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th = this.f212090b;
        if (th != null) {
            observer.onError(th);
            return;
        }
        T t10 = this.f212091c;
        if (t10 != null) {
            asyncDisposable.e(t10);
        } else {
            asyncDisposable.onComplete();
        }
    }

    @Override // zc.V
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.f212089a.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f212088e;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t10 = this.f212091c;
        AsyncDisposable<T>[] andSet = this.f212089a.getAndSet(asyncDisposableArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].e(t10);
            i10++;
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        AsyncDisposable<T>[] asyncDisposableArr = this.f212089a.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f212088e;
        if (asyncDisposableArr == asyncDisposableArr2) {
            Ic.a.Y(t10);
            return;
        }
        this.f212091c = null;
        this.f212090b = t10;
        for (AsyncDisposable<T> asyncDisposable : this.f212089a.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(t10);
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        if (this.f212089a.get() == f212088e) {
            return;
        }
        this.f212091c = t10;
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (this.f212089a.get() == f212088e) {
            d10.dispose();
        }
    }
}
