package com.prism.commons.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class O<T, P> implements y0<T, P> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3861z<ThreadFactory, Void> f162044e = new C3861z<>(new N());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0<T, P> f162045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A0<T, P> f162046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f162047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f162048d = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new SynchronousQueue(), f162044e.a(null));

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f162049a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ObjectCacheSRAWP #" + this.f162049a.getAndIncrement());
        }
    }

    public O(y0<T, P> y0Var) {
        this.f162045a = y0Var;
        this.f162046b = y0Var;
    }

    public static /* synthetic */ ThreadFactory d(Void r02) {
        return new a();
    }

    @Override // com.prism.commons.utils.A0
    public void a(final P p10, final T t10) {
        this.f162048d.execute(new Runnable() { // from class: com.prism.commons.utils.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f162041a.e(t10, p10);
            }
        });
    }

    @Override // com.prism.commons.utils.w0
    public T b(P p10) {
        if (this.f162047c == null) {
            synchronized (this) {
                try {
                    if (this.f162047c == null) {
                        this.f162047c = this.f162045a.b(p10);
                    }
                } finally {
                }
            }
        }
        return this.f162047c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void e(Object obj, Object obj2) {
        if (obj != 0) {
            this.f162047c = obj;
            synchronized (this) {
                this.f162046b.a(obj2, obj);
            }
        }
    }
}
