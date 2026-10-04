package io.reactivex.subjects;

import androidx.collection.C1522b;
import androidx.compose.animation.core.C1598m0;
import hc.G;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f212396h = new Object[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0802a[] f212397i = new C0802a[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0802a[] f212398j = new C0802a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f212399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<C0802a<T>[]> f212400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReadWriteLock f212401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f212402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f212403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Throwable> f212404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f212405g;

    /* JADX INFO: renamed from: io.reactivex.subjects.a$a, reason: collision with other inner class name */
    public static final class C0802a<T> implements io.reactivex.disposables.b, a.InterfaceC0777a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G<? super T> f212406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<T> f212407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f212408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f212409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.internal.util.a<Object> f212410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f212411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f212412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f212413h;

        public C0802a(G<? super T> g10, a<T> aVar) {
            this.f212406a = g10;
            this.f212407b = aVar;
        }

        public void a() {
            if (this.f212412g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f212412g) {
                        return;
                    }
                    if (this.f212408c) {
                        return;
                    }
                    a<T> aVar = this.f212407b;
                    Lock lock = aVar.f212402d;
                    lock.lock();
                    this.f212413h = aVar.f212405g;
                    Object obj = aVar.f212399a.get();
                    lock.unlock();
                    this.f212409d = obj != null;
                    this.f212408c = true;
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
            io.reactivex.internal.util.a<Object> aVar;
            while (!this.f212412g) {
                synchronized (this) {
                    try {
                        aVar = this.f212410e;
                        if (aVar == null) {
                            this.f212409d = false;
                            return;
                        }
                        this.f212410e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar.d(this);
            }
        }

        public void c(Object obj, long j10) {
            if (this.f212412g) {
                return;
            }
            if (!this.f212411f) {
                synchronized (this) {
                    try {
                        if (this.f212412g) {
                            return;
                        }
                        if (this.f212413h == j10) {
                            return;
                        }
                        if (this.f212409d) {
                            io.reactivex.internal.util.a<Object> aVar = this.f212410e;
                            if (aVar == null) {
                                aVar = new io.reactivex.internal.util.a<>(4);
                                this.f212410e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f212408c = true;
                        this.f212411f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f212412g) {
                return;
            }
            this.f212412g = true;
            this.f212407b.o8(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f212412g;
        }

        @Override // io.reactivex.internal.util.a.InterfaceC0777a, nc.r
        public boolean test(Object obj) {
            return this.f212412g || NotificationLite.accept(obj, this.f212406a);
        }
    }

    public a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f212401c = reentrantReadWriteLock;
        this.f212402d = reentrantReadWriteLock.readLock();
        this.f212403e = reentrantReadWriteLock.writeLock();
        this.f212400b = new AtomicReference<>(f212397i);
        this.f212399a = new AtomicReference<>();
        this.f212404f = new AtomicReference<>();
    }

    @e
    @InterfaceC5190c
    public static <T> a<T> i8() {
        return new a<>();
    }

    @e
    @InterfaceC5190c
    public static <T> a<T> j8(T t10) {
        return new a<>(t10);
    }

    @Override // hc.z
    public void C5(G<? super T> g10) {
        C0802a<T> c0802a = new C0802a<>(g10, this);
        g10.onSubscribe(c0802a);
        if (h8(c0802a)) {
            if (c0802a.f212412g) {
                o8(c0802a);
                return;
            } else {
                c0802a.a();
                return;
            }
        }
        Throwable th = this.f212404f.get();
        if (th == ExceptionHelper.f207183a) {
            g10.onComplete();
        } else {
            g10.onError(th);
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable c8() {
        Object obj = this.f212399a.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean d8() {
        return NotificationLite.isComplete(this.f212399a.get());
    }

    @Override // io.reactivex.subjects.c
    public boolean e8() {
        return this.f212400b.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean f8() {
        return NotificationLite.isError(this.f212399a.get());
    }

    public boolean h8(C0802a<T> c0802a) {
        C0802a<T>[] c0802aArr;
        C0802a[] c0802aArr2;
        do {
            c0802aArr = this.f212400b.get();
            if (c0802aArr == f212398j) {
                return false;
            }
            int length = c0802aArr.length;
            c0802aArr2 = new C0802a[length + 1];
            System.arraycopy(c0802aArr, 0, c0802aArr2, 0, length);
            c0802aArr2[length] = c0802a;
        } while (!C1598m0.a(this.f212400b, c0802aArr, c0802aArr2));
        return true;
    }

    @f
    public T k8() {
        Object obj = this.f212399a.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] l8() {
        Object[] objArr = f212396h;
        Object[] objArrM8 = m8(objArr);
        return objArrM8 == objArr ? new Object[0] : objArrM8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] m8(T[] tArr) {
        Object obj = this.f212399a.get();
        if (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
            return tArr;
        }
        Object value = NotificationLite.getValue(obj);
        if (tArr.length == 0) {
            T[] tArr2 = (T[]) ((Object[]) C1522b.a(tArr, 1));
            tArr2[0] = value;
            return tArr2;
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = 0;
        }
        return tArr;
    }

    public boolean n8() {
        Object obj = this.f212399a.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    public void o8(C0802a<T> c0802a) {
        C0802a<T>[] c0802aArr;
        C0802a[] c0802aArr2;
        do {
            c0802aArr = this.f212400b.get();
            int length = c0802aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0802aArr[i10] == c0802a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0802aArr2 = f212397i;
            } else {
                C0802a[] c0802aArr3 = new C0802a[length - 1];
                System.arraycopy(c0802aArr, 0, c0802aArr3, 0, i10);
                System.arraycopy(c0802aArr, i10 + 1, c0802aArr3, i10, (length - i10) - 1);
                c0802aArr2 = c0802aArr3;
            }
        } while (!C1598m0.a(this.f212400b, c0802aArr, c0802aArr2));
    }

    @Override // hc.G
    public void onComplete() {
        if (C1598m0.a(this.f212404f, null, ExceptionHelper.f207183a)) {
            Object objComplete = NotificationLite.complete();
            for (C0802a<T> c0802a : r8(objComplete)) {
                c0802a.c(objComplete, this.f212405g);
            }
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C1598m0.a(this.f212404f, null, th)) {
            C5666a.Y(th);
            return;
        }
        Object objError = NotificationLite.error(th);
        for (C0802a<T> c0802a : r8(objError)) {
            c0802a.c(objError, this.f212405g);
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f212404f.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        p8(next);
        for (C0802a<T> c0802a : this.f212400b.get()) {
            c0802a.c(next, this.f212405g);
        }
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f212404f.get() != null) {
            bVar.dispose();
        }
    }

    public void p8(Object obj) {
        this.f212403e.lock();
        this.f212405g++;
        this.f212399a.lazySet(obj);
        this.f212403e.unlock();
    }

    public int q8() {
        return this.f212400b.get().length;
    }

    public C0802a<T>[] r8(Object obj) {
        AtomicReference<C0802a<T>[]> atomicReference = this.f212400b;
        C0802a<T>[] c0802aArr = f212398j;
        C0802a<T>[] andSet = atomicReference.getAndSet(c0802aArr);
        if (andSet != c0802aArr) {
            p8(obj);
        }
        return andSet;
    }

    public a(T t10) {
        this();
        AtomicReference<Object> atomicReference = this.f212399a;
        io.reactivex.internal.functions.a.g(t10, "defaultValue is null");
        atomicReference.lazySet(t10);
    }
}
