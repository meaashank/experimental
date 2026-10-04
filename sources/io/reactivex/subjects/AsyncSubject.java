package io.reactivex.subjects;

import androidx.compose.animation.core.C1598m0;
import hc.G;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class AsyncSubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AsyncDisposable[] f212324d = new AsyncDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AsyncDisposable[] f212325e = new AsyncDisposable[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<AsyncDisposable<T>[]> f212326a = new AtomicReference<>(f212324d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f212327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f212328c;

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AsyncSubject<T> f212329h;

        public AsyncDisposable(G<? super T> g10, AsyncSubject<T> asyncSubject) {
            super(g10);
            this.f212329h = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            if (j()) {
                this.f212329h.n8(this);
            }
        }

        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.f203001a.onComplete();
        }

        public void onError(Throwable th) {
            if (isDisposed()) {
                C5666a.Y(th);
            } else {
                this.f203001a.onError(th);
            }
        }
    }

    @e
    @InterfaceC5190c
    public static <T> AsyncSubject<T> i8() {
        return new AsyncSubject<>();
    }

    @Override // hc.z
    public void C5(G<? super T> g10) {
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(g10, this);
        g10.onSubscribe(asyncDisposable);
        if (h8(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                n8(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th = this.f212327b;
        if (th != null) {
            g10.onError(th);
            return;
        }
        T t10 = this.f212328c;
        if (t10 != null) {
            asyncDisposable.e(t10);
        } else {
            asyncDisposable.onComplete();
        }
    }

    @Override // io.reactivex.subjects.c
    public Throwable c8() {
        if (this.f212326a.get() == f212325e) {
            return this.f212327b;
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean d8() {
        return this.f212326a.get() == f212325e && this.f212327b == null;
    }

    @Override // io.reactivex.subjects.c
    public boolean e8() {
        return this.f212326a.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean f8() {
        return this.f212326a.get() == f212325e && this.f212327b != null;
    }

    public boolean h8(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f212326a.get();
            if (asyncDisposableArr == f212325e) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!C1598m0.a(this.f212326a, asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    @f
    public T j8() {
        if (this.f212326a.get() == f212325e) {
            return this.f212328c;
        }
        return null;
    }

    @Deprecated
    public Object[] k8() {
        T tJ8 = j8();
        return tJ8 != null ? new Object[]{tJ8} : new Object[0];
    }

    @Deprecated
    public T[] l8(T[] tArr) {
        T tJ8 = j8();
        if (tJ8 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = tJ8;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean m8() {
        return this.f212326a.get() == f212325e && this.f212328c != null;
    }

    public void n8(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f212326a.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (asyncDisposableArr[i10] == asyncDisposable) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                asyncDisposableArr2 = f212324d;
            } else {
                AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i10);
                System.arraycopy(asyncDisposableArr, i10 + 1, asyncDisposableArr3, i10, (length - i10) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!C1598m0.a(this.f212326a, asyncDisposableArr, asyncDisposableArr2));
    }

    @Override // hc.G
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.f212326a.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f212325e;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t10 = this.f212328c;
        AsyncDisposable<T>[] andSet = this.f212326a.getAndSet(asyncDisposableArr2);
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

    @Override // hc.G
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncDisposable<T>[] asyncDisposableArr = this.f212326a.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f212325e;
        if (asyncDisposableArr == asyncDisposableArr2) {
            C5666a.Y(th);
            return;
        }
        this.f212328c = null;
        this.f212327b = th;
        for (AsyncDisposable<T> asyncDisposable : this.f212326a.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(th);
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f212326a.get() == f212325e) {
            return;
        }
        this.f212328c = t10;
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f212326a.get() == f212325e) {
            bVar.dispose();
        }
    }
}
