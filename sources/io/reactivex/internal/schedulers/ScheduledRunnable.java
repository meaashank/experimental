package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oc.InterfaceC5347a;

/* JADX INFO: loaded from: classes7.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f207008b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f207009c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f207010d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f207011e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f207012f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f207013g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f207014h = 2;
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f207015a;

    public ScheduledRunnable(Runnable runnable, InterfaceC5347a interfaceC5347a) {
        super(3);
        this.f207015a = runnable;
        lazySet(0, interfaceC5347a);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f207011e) {
                return;
            }
            if (obj == f207009c) {
                future.cancel(false);
                return;
            } else if (obj == f207010d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f207011e || obj5 == (obj3 = f207009c) || obj5 == (obj4 = f207010d)) {
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
            if (obj == f207011e || obj == (obj2 = f207008b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC5347a) obj).b(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f207008b || obj == f207011e;
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
            this.f207015a.run();
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
        if (obj5 != f207008b && compareAndSet(0, obj5, f207011e) && obj5 != null) {
            ((InterfaceC5347a) obj5).b(this);
        }
        do {
            obj4 = get(1);
            if (obj4 == f207009c || obj4 == f207010d) {
                return;
            }
        } while (!compareAndSet(1, obj4, f207011e));
    }
}
