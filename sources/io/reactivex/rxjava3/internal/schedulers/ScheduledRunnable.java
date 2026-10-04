package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f211756b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f211757c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f211758d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f211759e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f211760f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f211761g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f211762h = 2;
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f211763a;

    public ScheduledRunnable(Runnable actual, io.reactivex.rxjava3.disposables.e parent) {
        super(3);
        this.f211763a = actual;
        lazySet(0, parent);
    }

    public void a(Future<?> f10) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f211759e) {
                return;
            }
            if (obj == f211757c) {
                f10.cancel(false);
                return;
            } else if (obj == f211758d) {
                f10.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, f10));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f211759e || obj5 == (obj3 = f211757c) || obj5 == (obj4 = f211758d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f211759e || obj == (obj2 = f211756b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((io.reactivex.rxjava3.disposables.e) obj).b(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f211756b || obj == f211759e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        lazySet(2, Thread.currentThread());
        try {
            this.f211763a.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj5 = get(0);
        if (obj5 != f211756b && compareAndSet(0, obj5, f211759e) && obj5 != null) {
            ((io.reactivex.rxjava3.disposables.e) obj5).b(this);
        }
        do {
            obj4 = get(1);
            if (obj4 == f211757c || obj4 == f211758d) {
                return;
            }
        } while (!compareAndSet(1, obj4, f211759e));
    }
}
