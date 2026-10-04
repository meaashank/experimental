package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f159770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http.j f159771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.a f159772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private o f159773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y f159774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f159775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f159776g;

    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            x.this.cancel();
        }
    }

    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f159778d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f159779b;

        public b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f159779b = eVar;
        }

        public void a(ExecutorService executorService) {
            if (!f159778d && Thread.holdsLock(x.this.f159770a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f159773d.callFailed(x.this, interruptedIOException);
                    this.f159779b.a(x.this, interruptedIOException);
                    x.this.f159770a.j().b(this);
                }
            } catch (Throwable th) {
                x.this.f159770a.j().b(this);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            x.this.f159772c.h();
            boolean z10 = false;
            try {
                try {
                    try {
                        this.f159779b.a(x.this, x.this.c());
                        x.this.f159770a.j().b(this);
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        IOException iOExceptionA = x.this.a(e);
                        if (z10) {
                            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                        } else {
                            x.this.f159773d.callFailed(x.this, iOExceptionA);
                            this.f159779b.a(x.this, iOExceptionA);
                        }
                        x.this.f159770a.j().b(this);
                    } catch (Throwable th) {
                        th = th;
                        z10 = true;
                        x.this.cancel();
                        if (!z10) {
                            this.f159779b.a(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    x.this.f159770a.j().b(this);
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public x c() {
            return x.this;
        }

        public String d() {
            return x.this.f159774e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f159770a = vVar;
        this.f159774e = yVar;
        this.f159775f = z10;
        this.f159771b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f159772c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f159770a, this.f159774e, this.f159775f);
    }

    public a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f159770a.p());
        arrayList.add(this.f159771b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f159770a.i()));
        this.f159770a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f159770a));
        if (!this.f159775f) {
            arrayList.addAll(this.f159770a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f159775f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f159774e, this, this.f159773d, this.f159770a.e(), this.f159770a.y(), this.f159770a.C()).a(this.f159774e);
        if (!this.f159771b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.f159771b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.f159776g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f159776g = true;
        }
        a();
        this.f159772c.h();
        this.f159773d.callStart(this);
        try {
            try {
                this.f159770a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC != null) {
                    return a0VarC;
                }
                throw new IOException("Canceled");
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f159773d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } finally {
            this.f159770a.j().b(this);
        }
        this.f159770a.j().b(this);
    }

    public String e() {
        return this.f159774e.g().l();
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.f159775f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(e());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f159771b.b();
    }

    public static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f159773d = vVar.l().a(xVar);
        return xVar;
    }

    @Nullable
    public IOException a(@Nullable IOException iOException) {
        if (!this.f159772c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(Jb.d.f58184l);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f159771b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.f159776g) {
                this.f159776g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f159773d.callStart(this);
        this.f159770a.j().a(new b(eVar));
    }
}
