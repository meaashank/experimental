package okhttp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import okio.B;
import okio.ByteString;
import okio.InterfaceC5361k;
import okio.Q;
import okio.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f225839a = new a();

    public static final class a {

        /* JADX INFO: renamed from: okhttp3.t$a$a, reason: collision with other inner class name */
        public static final class C0860a extends t {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f225840b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ File f225841c;

            public C0860a(q qVar, File file) {
                this.f225840b = qVar;
                this.f225841c = file;
            }

            @Override // okhttp3.t
            public long c() {
                return this.f225841c.length();
            }

            @Override // okhttp3.t
            @Nullable
            public q d() {
                return this.f225840b;
            }

            @Override // okhttp3.t
            public void t(@NotNull InterfaceC5361k sink) throws FileNotFoundException {
                G.p(sink, "sink");
                e0 e0VarR = Q.r(this.f225841c);
                try {
                    sink.Q2(e0VarR);
                    ((B) e0VarR).close();
                } finally {
                }
            }
        }

        public static final class b extends t {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f225842b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ByteString f225843c;

            public b(q qVar, ByteString byteString) {
                this.f225842b = qVar;
                this.f225843c = byteString;
            }

            @Override // okhttp3.t
            public long c() {
                return this.f225843c.y();
            }

            @Override // okhttp3.t
            @Nullable
            public q d() {
                return this.f225842b;
            }

            @Override // okhttp3.t
            public void t(@NotNull InterfaceC5361k sink) throws IOException {
                G.p(sink, "sink");
                sink.e2(this.f225843c);
            }
        }

        public static final class c extends t {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f225844b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f225845c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ byte[] f225846d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f225847e;

            public c(q qVar, int i10, byte[] bArr, int i11) {
                this.f225844b = qVar;
                this.f225845c = i10;
                this.f225846d = bArr;
                this.f225847e = i11;
            }

            @Override // okhttp3.t
            public long c() {
                return this.f225845c;
            }

            @Override // okhttp3.t
            @Nullable
            public q d() {
                return this.f225844b;
            }

            @Override // okhttp3.t
            public void t(@NotNull InterfaceC5361k sink) throws IOException {
                G.p(sink, "sink");
                sink.write(this.f225846d, this.f225847e, this.f225845c);
            }
        }

        public a() {
        }

        public static /* synthetic */ t n(a aVar, File file, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            return aVar.a(file, qVar);
        }

        public static /* synthetic */ t o(a aVar, String str, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            return aVar.b(str, qVar);
        }

        public static /* synthetic */ t p(a aVar, q qVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(qVar, bArr, i10, i11);
        }

        public static /* synthetic */ t q(a aVar, ByteString byteString, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qVar = null;
            }
            return aVar.i(byteString, qVar);
        }

        public static /* synthetic */ t r(a aVar, byte[] bArr, q qVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                qVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m(bArr, qVar, i10, i11);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final t a(@NotNull File file, @Nullable q qVar) {
            G.p(file, "<this>");
            return new C0860a(qVar, file);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final t b(@NotNull String str, @Nullable q qVar) {
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
            byte[] bytes = str.getBytes(charset);
            G.o(bytes, "this as java.lang.String).getBytes(charset)");
            return m(bytes, qVar, 0, bytes.length);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @NotNull
        public final t c(@Nullable q qVar, @NotNull File file) {
            G.p(file, "file");
            return a(file, qVar);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final t d(@Nullable q qVar, @NotNull String content) {
            G.p(content, "content");
            return b(content, qVar);
        }

        @dd.o
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final t e(@Nullable q qVar, @NotNull ByteString content) {
            G.p(content, "content");
            return i(content, qVar);
        }

        @dd.o
        @NotNull
        @dd.k
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final t f(@Nullable q qVar, @NotNull byte[] content) {
            G.p(content, "content");
            return p(this, qVar, content, 0, 0, 12, null);
        }

        @dd.o
        @NotNull
        @dd.k
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final t g(@Nullable q qVar, @NotNull byte[] content, int i10) {
            G.p(content, "content");
            return p(this, qVar, content, i10, 0, 8, null);
        }

        @dd.o
        @NotNull
        @dd.k
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final t h(@Nullable q qVar, @NotNull byte[] content, int i10, int i11) {
            G.p(content, "content");
            return m(content, qVar, i10, i11);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        public final t i(@NotNull ByteString byteString, @Nullable q qVar) {
            G.p(byteString, "<this>");
            return new b(qVar, byteString);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        @dd.k
        public final t j(@NotNull byte[] bArr) {
            G.p(bArr, "<this>");
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        @dd.k
        public final t k(@NotNull byte[] bArr, @Nullable q qVar) {
            G.p(bArr, "<this>");
            return r(this, bArr, qVar, 0, 0, 6, null);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        @dd.k
        public final t l(@NotNull byte[] bArr, @Nullable q qVar, int i10) {
            G.p(bArr, "<this>");
            return r(this, bArr, qVar, i10, 0, 4, null);
        }

        @dd.o
        @dd.j(name = w7.i.f240159x)
        @NotNull
        @dd.k
        public final t m(@NotNull byte[] bArr, @Nullable q qVar, int i10, int i11) {
            G.p(bArr, "<this>");
            Bd.f.n(bArr.length, i10, i11);
            return new c(qVar, i11, bArr, i10);
        }

        public a(C4969v c4969v) {
        }
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final t e(@NotNull File file, @Nullable q qVar) {
        return f225839a.a(file, qVar);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final t f(@NotNull String str, @Nullable q qVar) {
        return f225839a.b(str, qVar);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @NotNull
    public static final t g(@Nullable q qVar, @NotNull File file) {
        return f225839a.c(qVar, file);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final t h(@Nullable q qVar, @NotNull String str) {
        return f225839a.d(qVar, str);
    }

    @dd.o
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final t i(@Nullable q qVar, @NotNull ByteString byteString) {
        return f225839a.e(qVar, byteString);
    }

    @dd.o
    @NotNull
    @dd.k
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final t j(@Nullable q qVar, @NotNull byte[] bArr) {
        return f225839a.f(qVar, bArr);
    }

    @dd.o
    @NotNull
    @dd.k
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final t k(@Nullable q qVar, @NotNull byte[] bArr, int i10) {
        return f225839a.g(qVar, bArr, i10);
    }

    @dd.o
    @NotNull
    @dd.k
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @InterfaceC4852c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final t l(@Nullable q qVar, @NotNull byte[] bArr, int i10, int i11) {
        return f225839a.h(qVar, bArr, i10, i11);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    public static final t m(@NotNull ByteString byteString, @Nullable q qVar) {
        return f225839a.i(byteString, qVar);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    @dd.k
    public static final t n(@NotNull byte[] bArr) {
        return f225839a.j(bArr);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    @dd.k
    public static final t o(@NotNull byte[] bArr, @Nullable q qVar) {
        return f225839a.k(bArr, qVar);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    @dd.k
    public static final t p(@NotNull byte[] bArr, @Nullable q qVar, int i10) {
        return f225839a.l(bArr, qVar, i10);
    }

    @dd.o
    @dd.j(name = w7.i.f240159x)
    @NotNull
    @dd.k
    public static final t q(@NotNull byte[] bArr, @Nullable q qVar, int i10, int i11) {
        return f225839a.m(bArr, qVar, i10, i11);
    }

    public long c() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract q d();

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public abstract void t(@NotNull InterfaceC5361k interfaceC5361k) throws IOException;
}
