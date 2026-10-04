package okhttp3;

import androidx.collection.LruCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import okio.ByteString;
import okio.C5360j;
import okio.InterfaceC5362l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f225848b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Reader f225849a;

    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InterfaceC5362l f225850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Charset f225851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f225852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Reader f225853d;

        public a(@NotNull InterfaceC5362l source, @NotNull Charset charset) {
            G.p(source, "source");
            G.p(charset, "charset");
            this.f225850a = source;
            this.f225851b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            L0 l02;
            this.f225852c = true;
            Reader reader = this.f225853d;
            if (reader == null) {
                l02 = null;
            } else {
                reader.close();
                l02 = L0.f217464a;
            }
            if (l02 == null) {
                this.f225850a.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int i10, int i11) throws IOException {
            G.p(cbuf, "cbuf");
            if (this.f225852c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f225853d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f225850a.inputStream(), Bd.f.T(this.f225850a, this.f225851b));
                this.f225853d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    public static final class b {

        public static final class a extends u {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f225854c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f225855d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5362l f225856e;

            public a(q qVar, long j10, InterfaceC5362l interfaceC5362l) {
                this.f225854c = qVar;
                this.f225855d = j10;
                this.f225856e = interfaceC5362l;
            }

            @Override // okhttp3.u
            @NotNull
            public InterfaceC5362l L0() {
                return this.f225856e;
            }

            @Override // okhttp3.u
            public long p() {
                return this.f225855d;
            }

            @Override // okhttp3.u
            @Nullable
            public q q() {
                return this.f225854c;
            }
        }

        public b() {
        }

        public static /* synthetic */ u i(b bVar, String str, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            return bVar.a(str, qVar);
        }

        public static /* synthetic */ u j(b bVar, InterfaceC5362l interfaceC5362l, q qVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return bVar.f(interfaceC5362l, qVar, j10);
        }

        public static /* synthetic */ u k(b bVar, ByteString byteString, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            return bVar.g(byteString, qVar);
        }

        public static /* synthetic */ u l(b bVar, byte[] bArr, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            return bVar.h(bArr, qVar);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final u a(@NotNull String str, @Nullable q qVar) {
            G.p(str, "<this>");
            Charset charset = C5013e.f218326b;
            if (qVar != null) {
                Charset charsetG = q.g(qVar, null, 1, null);
                if (charsetG == null) {
                    qVar = q.f225814e.d(qVar + "; charset=utf-8");
                } else {
                    charset = charsetG;
                }
            }
            C5360j c5360j = new C5360j();
            c5360j.i4(str, charset);
            return f(c5360j, qVar, c5360j.f226051b);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @NotNull
        public final u b(@Nullable q qVar, long j10, @NotNull InterfaceC5362l content) {
            G.p(content, "content");
            return f(content, qVar, j10);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final u c(@Nullable q qVar, @NotNull String content) {
            G.p(content, "content");
            return a(content, qVar);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final u d(@Nullable q qVar, @NotNull ByteString content) {
            G.p(content, "content");
            return g(content, qVar);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final u e(@Nullable q qVar, @NotNull byte[] content) {
            G.p(content, "content");
            return h(content, qVar);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final u f(@NotNull InterfaceC5362l interfaceC5362l, @Nullable q qVar, long j10) {
            G.p(interfaceC5362l, "<this>");
            return new a(qVar, j10, interfaceC5362l);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final u g(@NotNull ByteString byteString, @Nullable q qVar) {
            G.p(byteString, "<this>");
            C5360j c5360j = new C5360j();
            c5360j.v3(byteString);
            return f(c5360j, qVar, byteString.y());
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final u h(@NotNull byte[] bArr, @Nullable q qVar) {
            G.p(bArr, "<this>");
            C5360j c5360j = new C5360j();
            c5360j.U3(bArr);
            return f(c5360j, qVar, bArr.length);
        }

        public b(C4969v c4969v) {
        }
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final u C0(@NotNull byte[] bArr, @Nullable q qVar) {
        return f225848b.h(bArr, qVar);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final u P(@Nullable q qVar, @NotNull byte[] bArr) {
        return f225848b.e(qVar, bArr);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final u U(@NotNull InterfaceC5362l interfaceC5362l, @Nullable q qVar, long j10) {
        return f225848b.f(interfaceC5362l, qVar, j10);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final u r(@NotNull String str, @Nullable q qVar) {
        return f225848b.a(str, qVar);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final u r0(@NotNull ByteString byteString, @Nullable q qVar) {
        return f225848b.g(byteString, qVar);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @NotNull
    public static final u s(@Nullable q qVar, long j10, @NotNull InterfaceC5362l interfaceC5362l) {
        return f225848b.b(qVar, j10, interfaceC5362l);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final u u(@Nullable q qVar, @NotNull String str) {
        return f225848b.c(qVar, str);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final u y(@Nullable q qVar, @NotNull ByteString byteString) {
        return f225848b.d(qVar, byteString);
    }

    @NotNull
    public abstract InterfaceC5362l L0();

    @NotNull
    public final String N0() throws IOException {
        InterfaceC5362l interfaceC5362lL0 = L0();
        try {
            String strO1 = interfaceC5362lL0.O1(Bd.f.T(interfaceC5362lL0, n()));
            interfaceC5362lL0.close();
            return strO1;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Bd.f.o(L0());
    }

    @NotNull
    public final InputStream d() {
        return L0().inputStream();
    }

    @NotNull
    public final ByteString k() throws IOException {
        long jP = p();
        if (jP > LruCacheKt.f86729a) {
            throw new IOException(G.C("Cannot buffer entire body for content length: ", Long.valueOf(jP)));
        }
        InterfaceC5362l interfaceC5362lL0 = L0();
        try {
            ByteString byteStringT1 = interfaceC5362lL0.T1();
            kotlin.io.b.a(interfaceC5362lL0, null);
            int iY = byteStringT1.y();
            if (jP == -1 || jP == iY) {
                return byteStringT1;
            }
            throw new IOException("Content-Length (" + jP + ") and stream length (" + iY + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final byte[] l() throws IOException {
        long jP = p();
        if (jP > LruCacheKt.f86729a) {
            throw new IOException(G.C("Cannot buffer entire body for content length: ", Long.valueOf(jP)));
        }
        InterfaceC5362l interfaceC5362lL0 = L0();
        try {
            byte[] bArrW1 = interfaceC5362lL0.w1();
            interfaceC5362lL0.close();
            int length = bArrW1.length;
            if (jP == -1 || jP == length) {
                return bArrW1;
            }
            throw new IOException("Content-Length (" + jP + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final Reader m() {
        Reader reader = this.f225849a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(L0(), n());
        this.f225849a = aVar;
        return aVar;
    }

    public final Charset n() {
        q qVarQ = q();
        Charset charsetF = qVarQ == null ? null : qVarQ.f(C5013e.f218326b);
        return charsetF == null ? C5013e.f218326b : charsetF;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    public final <T> T o(ed.l<? super InterfaceC5362l, ? extends T> lVar, ed.l<? super T, Integer> lVar2) throws IOException {
        long jP = p();
        if (jP > LruCacheKt.f86729a) {
            throw new IOException(G.C("Cannot buffer entire body for content length: ", Long.valueOf(jP)));
        }
        InterfaceC5362l interfaceC5362lL0 = L0();
        try {
            T tInvoke = lVar.invoke(interfaceC5362lL0);
            kotlin.io.b.a(interfaceC5362lL0, null);
            int iIntValue = lVar2.invoke(tInvoke).intValue();
            if (jP == -1 || jP == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jP + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    public abstract long p();

    @Nullable
    public abstract q q();
}
