package io.reactivex.rxjava3.subjects;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import yc.e;
import yc.f;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0795a[] f212159h = new C0795a[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0795a[] f212160i = new C0795a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f212161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<C0795a<T>[]> f212162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReadWriteLock f212163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f212164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f212165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Throwable> f212166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f212167g;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.subjects.a$a, reason: collision with other inner class name */
    public static final class C0795a<T> implements d, a.InterfaceC0794a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V<? super T> f212168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<T> f212169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f212170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f212171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.internal.util.a<Object> f212172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f212173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f212174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f212175h;

        public C0795a(V<? super T> actual, a<T> state) {
            this.f212168a = actual;
            this.f212169b = state;
        }

        public void a() {
            if (this.f212174g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f212174g) {
                        return;
                    }
                    if (this.f212170c) {
                        return;
                    }
                    a<T> aVar = this.f212169b;
                    Lock lock = aVar.f212164d;
                    lock.lock();
                    this.f212175h = aVar.f212167g;
                    Object obj = aVar.f212161a.get();
                    lock.unlock();
                    this.f212171d = obj != null;
                    this.f212170c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            io.reactivex.rxjava3.internal.util.a<Object> aVar;
            while (!this.f212174g) {
                synchronized (this) {
                    try {
                        aVar = this.f212172e;
                        if (aVar == null) {
                            this.f212171d = false;
                            return;
                        }
                        this.f212172e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar.d(this);
            }
        }

        public void c(Object value, long stateIndex) {
            if (this.f212174g) {
                return;
            }
            if (!this.f212173f) {
                synchronized (this) {
                    try {
                        if (this.f212174g) {
                            return;
                        }
                        if (this.f212175h == stateIndex) {
                            return;
                        }
                        if (this.f212171d) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f212172e;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                                this.f212172e = aVar;
                            }
                            aVar.c(value);
                            return;
                        }
                        this.f212170c = true;
                        this.f212173f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(value);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f212174g) {
                return;
            }
            this.f212174g = true;
            this.f212169b.K8(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f212174g;
        }

        @Override // io.reactivex.rxjava3.internal.util.a.InterfaceC0794a, Bc.r
        public boolean test(Object o10) {
            return this.f212174g || NotificationLite.accept(o10, this.f212168a);
        }
    }

    public a(T defaultValue) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f212163c = reentrantReadWriteLock;
        this.f212164d = reentrantReadWriteLock.readLock();
        this.f212165e = reentrantReadWriteLock.writeLock();
        this.f212162b = new AtomicReference<>(f212159h);
        this.f212161a = new AtomicReference<>(defaultValue);
        this.f212166f = new AtomicReference<>();
    }

    @e
    @yc.c
    public static <T> a<T> G8() {
        return new a<>(null);
    }

    @e
    @yc.c
    public static <T> a<T> H8(T defaultValue) {
        Objects.requireNonNull(defaultValue, "defaultValue is null");
        return new a<>(defaultValue);
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @f
    @yc.c
    public Throwable A8() {
        Object obj = this.f212161a.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean B8() {
        return NotificationLite.isComplete(this.f212161a.get());
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean C8() {
        return this.f212162b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean D8() {
        return NotificationLite.isError(this.f212161a.get());
    }

    public boolean F8(C0795a<T> rs) {
        C0795a<T>[] c0795aArr;
        C0795a[] c0795aArr2;
        do {
            c0795aArr = this.f212162b.get();
            if (c0795aArr == f212160i) {
                return false;
            }
            int length = c0795aArr.length;
            c0795aArr2 = new C0795a[length + 1];
            System.arraycopy(c0795aArr, 0, c0795aArr2, 0, length);
            c0795aArr2[length] = rs;
        } while (!C1598m0.a(this.f212162b, c0795aArr, c0795aArr2));
        return true;
    }

    @f
    @yc.c
    public T I8() {
        Object obj = this.f212161a.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    @yc.c
    public boolean J8() {
        Object obj = this.f212161a.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    public void K8(C0795a<T> rs) {
        C0795a<T>[] c0795aArr;
        C0795a[] c0795aArr2;
        do {
            c0795aArr = this.f212162b.get();
            int length = c0795aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0795aArr[i10] == rs) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0795aArr2 = f212159h;
            } else {
                C0795a[] c0795aArr3 = new C0795a[length - 1];
                System.arraycopy(c0795aArr, 0, c0795aArr3, 0, i10);
                System.arraycopy(c0795aArr, i10 + 1, c0795aArr3, i10, (length - i10) - 1);
                c0795aArr2 = c0795aArr3;
            }
        } while (!C1598m0.a(this.f212162b, c0795aArr, c0795aArr2));
    }

    public void L8(Object o10) {
        this.f212165e.lock();
        this.f212167g++;
        this.f212161a.lazySet(o10);
        this.f212165e.unlock();
    }

    @yc.c
    public int M8() {
        return this.f212162b.get().length;
    }

    public C0795a<T>[] N8(Object terminalValue) {
        L8(terminalValue);
        return this.f212162b.getAndSet(f212160i);
    }

    @Override // zc.N
    public void d6(V<? super T> observer) {
        C0795a<T> c0795a = new C0795a<>(observer, this);
        observer.onSubscribe(c0795a);
        if (F8(c0795a)) {
            if (c0795a.f212174g) {
                K8(c0795a);
                return;
            } else {
                c0795a.a();
                return;
            }
        }
        Throwable th = this.f212166f.get();
        if (th == ExceptionHelper.f211932a) {
            observer.onComplete();
        } else {
            observer.onError(th);
        }
    }

    @Override // zc.V
    public void onComplete() {
        if (C1598m0.a(this.f212166f, null, ExceptionHelper.f211932a)) {
            Object objComplete = NotificationLite.complete();
            for (C0795a<T> c0795a : N8(objComplete)) {
                c0795a.c(objComplete, this.f212167g);
            }
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        if (!C1598m0.a(this.f212166f, null, t10)) {
            Ic.a.Y(t10);
            return;
        }
        Object objError = NotificationLite.error(t10);
        for (C0795a<T> c0795a : N8(objError)) {
            c0795a.c(objError, this.f212167g);
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        if (this.f212166f.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        L8(next);
        for (C0795a<T> c0795a : this.f212162b.get()) {
            c0795a.c(next, this.f212167g);
        }
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (this.f212166f.get() != null) {
            d10.dispose();
        }
    }
}
