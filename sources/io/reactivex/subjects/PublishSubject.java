package io.reactivex.subjects;

import androidx.compose.animation.core.C1598m0;
import hc.G;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class PublishSubject<T> extends c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PublishDisposable[] f212343c = new PublishDisposable[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PublishDisposable[] f212344d = new PublishDisposable[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<PublishDisposable<T>[]> f212345a = new AtomicReference<>(f212344d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f212346b;

    public static final class PublishDisposable<T> extends AtomicBoolean implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G<? super T> f212347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishSubject<T> f212348b;

        public PublishDisposable(G<? super T> g10, PublishSubject<T> publishSubject) {
            this.f212347a = g10;
            this.f212348b = publishSubject;
        }

        public void d() {
            if (get()) {
                return;
            }
            this.f212347a.onComplete();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f212348b.j8(this);
            }
        }

        public void e(Throwable th) {
            if (get()) {
                C5666a.Y(th);
            } else {
                this.f212347a.onError(th);
            }
        }

        public void f(T t10) {
            if (get()) {
                return;
            }
            this.f212347a.onNext(t10);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }
    }

    @e
    @InterfaceC5190c
    public static <T> PublishSubject<T> i8() {
        return new PublishSubject<>();
    }

    @Override // hc.z
    public void C5(G<? super T> g10) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(g10, this);
        g10.onSubscribe(publishDisposable);
        if (h8(publishDisposable)) {
            if (publishDisposable.get()) {
                j8(publishDisposable);
            }
        } else {
            Throwable th = this.f212346b;
            if (th != null) {
                g10.onError(th);
            } else {
                g10.onComplete();
            }
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable c8() {
        if (this.f212345a.get() == f212343c) {
            return this.f212346b;
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean d8() {
        return this.f212345a.get() == f212343c && this.f212346b == null;
    }

    @Override // io.reactivex.subjects.c
    public boolean e8() {
        return this.f212345a.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean f8() {
        return this.f212345a.get() == f212343c && this.f212346b != null;
    }

    public boolean h8(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f212345a.get();
            if (publishDisposableArr == f212343c) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!C1598m0.a(this.f212345a, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    public void j8(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f212345a.get();
            if (publishDisposableArr == f212343c || publishDisposableArr == f212344d) {
                return;
            }
            int length = publishDisposableArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (publishDisposableArr[i10] == publishDisposable) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f212344d;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i10);
                System.arraycopy(publishDisposableArr, i10 + 1, publishDisposableArr3, i10, (length - i10) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!C1598m0.a(this.f212345a, publishDisposableArr, publishDisposableArr2));
    }

    @Override // hc.G
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f212345a.get();
        PublishDisposable<T>[] publishDisposableArr2 = f212343c;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.f212345a.getAndSet(publishDisposableArr2)) {
            publishDisposable.d();
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.f212345a.get();
        PublishDisposable<T>[] publishDisposableArr2 = f212343c;
        if (publishDisposableArr == publishDisposableArr2) {
            C5666a.Y(th);
            return;
        }
        this.f212346b = th;
        for (PublishDisposable<T> publishDisposable : this.f212345a.getAndSet(publishDisposableArr2)) {
            publishDisposable.e(th);
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.f212345a.get()) {
            publishDisposable.f(t10);
        }
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f212345a.get() == f212343c) {
            bVar.dispose();
        }
    }
}
