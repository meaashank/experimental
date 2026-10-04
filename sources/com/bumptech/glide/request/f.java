package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import e.InterfaceC4326A;
import e.f0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v3.p;
import w3.InterfaceC5744e;
import y3.o;

/* JADX INFO: loaded from: classes2.dex */
public class f<R> implements d<R>, g<R> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f140065k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f140069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    @InterfaceC4326A("this")
    public R f140070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    @InterfaceC4326A("this")
    public e f140071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("this")
    public boolean f140072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @InterfaceC4326A("this")
    public boolean f140073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InterfaceC4326A("this")
    public boolean f140074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    @InterfaceC4326A("this")
    public GlideException f140075j;

    @f0
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f140065k);
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean a(@NonNull R r10, @NonNull Object obj, p<R> pVar, @NonNull DataSource dataSource, boolean z10) {
        this.f140073h = true;
        this.f140070e = r10;
        this.f140069d.a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean b(@Nullable GlideException glideException, Object obj, @NonNull p<R> pVar, boolean z10) {
        this.f140074i = true;
        this.f140075j = glideException;
        this.f140069d.a(this);
        return false;
    }

    public final synchronized R c(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f140068c && !isDone()) {
                o.a();
            }
            if (this.f140072g) {
                throw new CancellationException();
            }
            if (this.f140074i) {
                throw new ExecutionException(this.f140075j);
            }
            if (this.f140073h) {
                return this.f140070e;
            }
            if (l10 == null) {
                this.f140069d.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l10.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f140069d.b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f140074i) {
                throw new ExecutionException(this.f140075j);
            }
            if (this.f140072g) {
                throw new CancellationException();
            }
            if (!this.f140073h) {
                throw new TimeoutException();
            }
            return this.f140070e;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f140072g = true;
                this.f140069d.a(this);
                e eVar = null;
                if (z10) {
                    e eVar2 = this.f140071f;
                    this.f140071f = null;
                    eVar = eVar2;
                }
                if (eVar != null) {
                    eVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v3.p
    public void d(@Nullable Drawable drawable) {
    }

    @Override // v3.p
    public synchronized void g(@NonNull R r10, @Nullable InterfaceC5744e<? super R> interfaceC5744e) {
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return c(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // v3.p
    @Nullable
    public synchronized e getRequest() {
        return this.f140071f;
    }

    @Override // v3.p
    public void h(@NonNull v3.o oVar) {
        oVar.d(this.f140066a, this.f140067b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f140072g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f140072g     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f140073h     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f140074i     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.f.isDone():boolean");
    }

    @Override // v3.p
    public void k(@Nullable Drawable drawable) {
    }

    @Override // v3.p
    public synchronized void m(@Nullable e eVar) {
        this.f140071f = eVar;
    }

    @Override // v3.p
    public synchronized void n(@Nullable Drawable drawable) {
    }

    @Override // s3.l
    public void onDestroy() {
    }

    @Override // s3.l
    public void onStart() {
    }

    @Override // s3.l
    public void onStop() {
    }

    public String toString() {
        e eVar;
        String str;
        String strA = android.support.v4.media.e.a(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                eVar = null;
                if (this.f140072g) {
                    str = "CANCELLED";
                } else if (this.f140074i) {
                    str = "FAILURE";
                } else if (this.f140073h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    eVar = this.f140071f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar == null) {
            return androidx.concurrent.futures.a.a(strA, str, "]");
        }
        return strA + str + ", request=[" + eVar + "]]";
    }

    public f(int i10, int i11, boolean z10, a aVar) {
        this.f140066a = i10;
        this.f140067b = i11;
        this.f140068c = z10;
        this.f140069d = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return c(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // v3.p
    public void f(@NonNull v3.o oVar) {
    }
}
