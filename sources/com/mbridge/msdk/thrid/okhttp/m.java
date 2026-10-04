package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f159662h = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Runnable f159665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private ExecutorService f159666d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f159663a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f159664b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<x.b> f159667e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque<x.b> f159668f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Deque<x> f159669g = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.f159666d = executorService;
    }

    private int c(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f159668f) {
            if (!bVar2.c().f159775f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public synchronized ExecutorService a() {
        try {
            if (this.f159666d == null) {
                this.f159666d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f159666d;
    }

    public void b(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("max < 1: ", i10));
        }
        synchronized (this) {
            this.f159664b = i10;
        }
        b();
    }

    public synchronized int c() {
        return this.f159668f.size() + this.f159669g.size();
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f159663a = i10;
            }
            b();
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("max < 1: ", i10));
    }

    public m() {
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f159662h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<x.b> it = this.f159667e.iterator();
                while (it.hasNext()) {
                    x.b next = it.next();
                    if (this.f159668f.size() >= this.f159663a) {
                        break;
                    }
                    if (c(next) < this.f159664b) {
                        it.remove();
                        arrayList.add(next);
                        this.f159668f.add(next);
                    }
                }
                z10 = c() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    public void a(x.b bVar) {
        synchronized (this) {
            this.f159667e.add(bVar);
        }
        b();
    }

    public synchronized void a(x xVar) {
        this.f159669g.add(xVar);
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f159665c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void b(x.b bVar) {
        a(this.f159668f, bVar);
    }

    public void b(x xVar) {
        a(this.f159669g, xVar);
    }
}
