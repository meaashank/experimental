package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.io.Closeable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y f159072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w f159073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f159074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f159075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    final q f159076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final r f159077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    final b0 f159078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    final a0 f159079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    final a0 f159080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    final a0 f159081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f159082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f159083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private volatile c f159084m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        y f159085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        w f159086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f159087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f159088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        q f159089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        r.a f159090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        b0 f159091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        a0 f159092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        a0 f159093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        a0 f159094j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f159095k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f159096l;

        public a() {
            this.f159087c = -1;
            this.f159090f = new r.a();
        }

        public a a(y yVar) {
            this.f159085a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f159090f.c(str, str2);
            return this;
        }

        public a c(@Nullable a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f159092h = a0Var;
            return this;
        }

        public a d(@Nullable a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f159094j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f159078g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f159086b = wVar;
            return this;
        }

        public a a(int i10) {
            this.f159087c = i10;
            return this;
        }

        public a(a0 a0Var) {
            this.f159087c = -1;
            this.f159085a = a0Var.f159072a;
            this.f159086b = a0Var.f159073b;
            this.f159087c = a0Var.f159074c;
            this.f159088d = a0Var.f159075d;
            this.f159089e = a0Var.f159076e;
            this.f159090f = a0Var.f159077f.a();
            this.f159091g = a0Var.f159078g;
            this.f159092h = a0Var.f159079h;
            this.f159093i = a0Var.f159080i;
            this.f159094j = a0Var.f159081j;
            this.f159095k = a0Var.f159082k;
            this.f159096l = a0Var.f159083l;
        }

        public a a(String str) {
            this.f159088d = str;
            return this;
        }

        public a b(long j10) {
            this.f159095k = j10;
            return this;
        }

        public a a(@Nullable q qVar) {
            this.f159089e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f159090f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f159090f = rVar.a();
            return this;
        }

        public a a(@Nullable b0 b0Var) {
            this.f159091g = b0Var;
            return this;
        }

        public a a(@Nullable a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f159093i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f159078g == null) {
                if (a0Var.f159079h == null) {
                    if (a0Var.f159080i == null) {
                        if (a0Var.f159081j != null) {
                            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, ".body != null"));
        }

        public a a(long j10) {
            this.f159096l = j10;
            return this;
        }

        public a0 a() {
            if (this.f159085a != null) {
                if (this.f159086b != null) {
                    if (this.f159087c >= 0) {
                        if (this.f159088d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f159087c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public a0(a aVar) {
        this.f159072a = aVar.f159085a;
        this.f159073b = aVar.f159086b;
        this.f159074c = aVar.f159087c;
        this.f159075d = aVar.f159088d;
        this.f159076e = aVar.f159089e;
        this.f159077f = aVar.f159090f.a();
        this.f159078g = aVar.f159091g;
        this.f159079h = aVar.f159092h;
        this.f159080i = aVar.f159093i;
        this.f159081j = aVar.f159094j;
        this.f159082k = aVar.f159095k;
        this.f159083l = aVar.f159096l;
    }

    @Nullable
    public String a(String str, @Nullable String str2) {
        String strB = this.f159077f.b(str);
        return strB != null ? strB : str2;
    }

    @Nullable
    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f159078g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    @Nullable
    public b0 d() {
        return this.f159078g;
    }

    public c h() {
        c cVar = this.f159084m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f159077f);
        this.f159084m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f159074c;
    }

    @Nullable
    public q l() {
        return this.f159076e;
    }

    public r m() {
        return this.f159077f;
    }

    public boolean n() {
        int i10 = this.f159074c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f159075d;
    }

    public a p() {
        return new a(this);
    }

    @Nullable
    public a0 q() {
        return this.f159081j;
    }

    public long r() {
        return this.f159083l;
    }

    public y s() {
        return this.f159072a;
    }

    public long t() {
        return this.f159082k;
    }

    public String toString() {
        return "Response{protocol=" + this.f159073b + ", code=" + this.f159074c + ", message=" + this.f159075d + ", url=" + this.f159072a.g() + '}';
    }
}
