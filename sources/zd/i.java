package zd;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.io.u;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import kotlin.text.M;
import md.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f241375e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final l f241376f = new l(200, 299, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final l f241377g = new l(400, 499, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f241378h = 200;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f241379i = 204;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f241380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f241381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f241382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f241383d;

    public static final class b {
        public b() {
        }

        @NotNull
        public final l a() {
            return i.f241377g;
        }

        @NotNull
        public final l b() {
            return i.f241376f;
        }

        public b(C4969v c4969v) {
        }
    }

    public i(@NotNull String url, int i10, @NotNull d headers, @NotNull a body) {
        G.p(url, "url");
        G.p(headers, "headers");
        G.p(body, "body");
        this.f241380a = url;
        this.f241381b = i10;
        this.f241382c = headers;
        this.f241383d = body;
    }

    public static /* synthetic */ i q(i iVar, String str, int i10, d dVar, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = iVar.f241380a;
        }
        if ((i11 & 2) != 0) {
            i10 = iVar.f241381b;
        }
        if ((i11 & 4) != 0) {
            dVar = iVar.f241382c;
        }
        if ((i11 & 8) != 0) {
            aVar = iVar.f241383d;
        }
        return iVar.p(str, i10, dVar, aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f241383d.close();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return G.g(this.f241380a, iVar.f241380a) && this.f241381b == iVar.f241381b && G.g(this.f241382c, iVar.f241382c) && G.g(this.f241383d, iVar.f241383d);
    }

    public int hashCode() {
        return this.f241383d.hashCode() + ((this.f241382c.hashCode() + (((this.f241380a.hashCode() * 31) + this.f241381b) * 31)) * 31);
    }

    @NotNull
    public final String l() {
        return this.f241380a;
    }

    public final int m() {
        return this.f241381b;
    }

    @NotNull
    public final d n() {
        return this.f241382c;
    }

    @NotNull
    public final a o() {
        return this.f241383d;
    }

    @NotNull
    public final i p(@NotNull String url, int i10, @NotNull d headers, @NotNull a body) {
        G.p(url, "url");
        G.p(headers, "headers");
        G.p(body, "body");
        return new i(url, i10, headers, body);
    }

    @NotNull
    public final a r() {
        return this.f241383d;
    }

    @NotNull
    public final d s() {
        return this.f241382c;
    }

    @NotNull
    public String toString() {
        String str = this.f241380a;
        int i10 = this.f241381b;
        d dVar = this.f241382c;
        a aVar = this.f241383d;
        StringBuilder sbA = androidx.constraintlayout.widget.e.a("Response(url=", str, ", status=", i10, ", headers=");
        sbA.append(dVar);
        sbA.append(", body=");
        sbA.append(aVar);
        sbA.append(")");
        return sbA.toString();
    }

    public final int u() {
        return this.f241381b;
    }

    @NotNull
    public final String y() {
        return this.f241380a;
    }

    public static class a implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0916a f241384c = new C0916a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InputStream f241385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Charset f241386b;

        /* JADX INFO: renamed from: zd.i$a$a, reason: collision with other inner class name */
        public static final class C0916a {
            public C0916a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final a a() {
                byte[] bytes = "".getBytes(C5013e.f218326b);
                G.o(bytes, "getBytes(...)");
                return new a(new ByteArrayInputStream(bytes), null, 2, 0 == true ? 1 : 0);
            }

            public C0916a(C4969v c4969v) {
            }
        }

        public a(@NotNull InputStream stream, @Nullable String str) {
            G.p(stream, "stream");
            this.f241385a = stream;
            Charset charsetForName = null;
            if (str != null) {
                try {
                    charsetForName = Charset.forName(M.P5(str, zd.b.f241359d, null, 2, null));
                } catch (Exception unused) {
                    charsetForName = C5013e.f218326b;
                }
            }
            this.f241386b = charsetForName == null ? C5013e.f218326b : charsetForName;
        }

        public static /* synthetic */ String f(a aVar, Charset charset, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: string");
            }
            if ((i10 & 1) != 0) {
                charset = null;
            }
            return aVar.e(charset);
        }

        public static /* synthetic */ Object k(a aVar, Charset charset, ed.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: useBufferedReader");
            }
            if ((i10 & 1) != 0) {
                charset = null;
            }
            return aVar.g(charset, lVar);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.f241385a.close();
            } catch (IOException unused) {
            }
        }

        @NotNull
        public final String e(@Nullable Charset charset) throws IOException {
            try {
                InputStream inputStream = this.f241385a;
                if (charset == null) {
                    charset = this.f241386b;
                }
                String strM = u.m(new InputStreamReader(inputStream, charset));
                close();
                return strM;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.b.a(this, th);
                    throw th2;
                }
            }
        }

        public final <R> R g(@Nullable Charset charset, @NotNull ed.l<? super BufferedReader, ? extends R> block) throws IOException {
            G.p(block, "block");
            try {
                InputStream inputStream = this.f241385a;
                if (charset == null) {
                    charset = this.f241386b;
                }
                R rInvoke = block.invoke(new BufferedReader(new InputStreamReader(inputStream, charset), 8192));
                close();
                return rInvoke;
            } finally {
            }
        }

        public final <R> R l(@NotNull ed.l<? super InputStream, ? extends R> block) throws IOException {
            G.p(block, "block");
            try {
                R rInvoke = block.invoke(this.f241385a);
                close();
                return rInvoke;
            } finally {
            }
        }

        public /* synthetic */ a(InputStream inputStream, String str, int i10, C4969v c4969v) {
            this(inputStream, (i10 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ void d() {
        }
    }
}
