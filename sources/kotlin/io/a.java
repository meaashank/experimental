package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.C;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.collections.E;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "ByteStreamsKt")
public final class a {

    /* JADX INFO: renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    public static final class C0823a extends E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f217707a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f217708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f217709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BufferedInputStream f217710d;

        public C0823a(BufferedInputStream bufferedInputStream) {
            this.f217710d = bufferedInputStream;
        }

        public final boolean d() {
            return this.f217709c;
        }

        public final int e() {
            return this.f217707a;
        }

        public final boolean f() {
            return this.f217708b;
        }

        public final void g() throws IOException {
            if (this.f217708b || this.f217709c) {
                return;
            }
            int i10 = this.f217710d.read();
            this.f217707a = i10;
            this.f217708b = true;
            this.f217709c = i10 == -1;
        }

        public final void h(boolean z10) {
            this.f217709c = z10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            g();
            return !this.f217709c;
        }

        public final void i(int i10) {
            this.f217707a = i10;
        }

        public final void j(boolean z10) {
            this.f217708b = z10;
        }

        @Override // kotlin.collections.E
        public byte nextByte() throws IOException {
            g();
            if (this.f217709c) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b10 = (byte) this.f217707a;
            this.f217708b = false;
            return b10;
        }
    }

    @Xc.f
    public static final BufferedInputStream a(InputStream inputStream, int i10) {
        G.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    @Xc.f
    public static final BufferedOutputStream b(OutputStream outputStream, int i10) {
        G.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    public static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        G.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    public static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        G.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    @Xc.f
    public static final BufferedReader e(InputStream inputStream, Charset charset) {
        G.p(inputStream, "<this>");
        G.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(inputStream, "<this>");
        G.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @Xc.f
    public static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        G.p(outputStream, "<this>");
        G.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(outputStream, "<this>");
        G.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @Xc.f
    public static final ByteArrayInputStream i(String str, Charset charset) {
        G.p(str, "<this>");
        G.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        G.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(str, "<this>");
        G.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        G.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    @C
    public static final long k(@NotNull InputStream inputStream, @NotNull OutputStream out, int i10) throws IOException {
        G.p(inputStream, "<this>");
        G.p(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return k(inputStream, outputStream, i10);
    }

    @Xc.f
    public static final ByteArrayInputStream m(byte[] bArr) {
        G.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @Xc.f
    public static final ByteArrayInputStream n(byte[] bArr, int i10, int i11) {
        G.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i10, i11);
    }

    @NotNull
    public static final E o(@NotNull BufferedInputStream bufferedInputStream) {
        G.p(bufferedInputStream, "<this>");
        return new C0823a(bufferedInputStream);
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final byte[] p(@NotNull InputStream inputStream) {
        G.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        G.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @InterfaceC4982o(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @InterfaceC4852c0(expression = "readBytes()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "2.3", warningSince = "1.3")
    public static final /* synthetic */ byte[] q(InputStream inputStream, int i10) {
        G.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        G.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return q(inputStream, i10);
    }

    @Xc.f
    public static final InputStreamReader s(InputStream inputStream, Charset charset) {
        G.p(inputStream, "<this>");
        G.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(inputStream, "<this>");
        G.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @Xc.f
    public static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        G.p(outputStream, "<this>");
        G.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(outputStream, "<this>");
        G.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
