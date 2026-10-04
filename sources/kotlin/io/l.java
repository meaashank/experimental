package kotlin.io;

import androidx.collection.LruCacheKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.L0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.sequences.InterfaceC5000m;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"})
public class l extends j {
    public static /* synthetic */ List A(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        return z(file, charset);
    }

    public static final L0 B(ArrayList arrayList, String it) {
        G.p(it, "it");
        arrayList.add(it);
        return L0.f217464a;
    }

    @NotNull
    public static final String C(@NotNull File file, @NotNull Charset charset) throws IOException {
        G.p(file, "<this>");
        G.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM = u.m(inputStreamReader);
            inputStreamReader.close();
            return strM;
        } finally {
        }
    }

    public static /* synthetic */ String D(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        return C(file, charset);
    }

    @Xc.f
    public static final InputStreamReader E(File file, Charset charset) {
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader F(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T G(@NotNull File file, @NotNull Charset charset, @NotNull ed.l<? super InterfaceC5000m<String>, ? extends T> block) throws IOException {
        G.p(file, "<this>");
        G.p(charset, "charset");
        G.p(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T tInvoke = block.invoke(u.i(bufferedReader));
            bufferedReader.close();
            return tInvoke;
        } finally {
        }
    }

    public static Object H(File file, Charset charset, ed.l block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(file, "<this>");
        G.p(charset, "charset");
        G.p(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object objInvoke = block.invoke(u.i(bufferedReader));
            bufferedReader.close();
            return objInvoke;
        } finally {
        }
    }

    public static final void I(@NotNull File file, @NotNull byte[] array) throws IOException {
        G.p(file, "<this>");
        G.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void J(@NotNull File file, @NotNull String text, @NotNull Charset charset) throws IOException {
        G.p(file, "<this>");
        G.p(text, "text");
        G.p(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            L(fileOutputStream, text, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static /* synthetic */ void K(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C5013e.f218326b;
        }
        J(file, str, charset);
    }

    public static void L(@NotNull OutputStream outputStream, @NotNull String text, @NotNull Charset charset) throws IOException {
        G.p(outputStream, "<this>");
        G.p(text, "text");
        G.p(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            G.o(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderU = u(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        G.m(charsetEncoderU);
        ByteBuffer byteBufferO = o(8192, charsetEncoderU);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            G.o(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderU.encode(charBufferAllocate, byteBufferO, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferO.array(), 0, byteBufferO.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferO.clear();
            i10 = i12;
        }
    }

    @Xc.f
    public static final OutputStreamWriter M(File file, Charset charset) {
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter N(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void h(@NotNull File file, @NotNull byte[] array) throws IOException {
        G.p(file, "<this>");
        G.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void i(@NotNull File file, @NotNull String text, @NotNull Charset charset) throws IOException {
        G.p(file, "<this>");
        G.p(text, "text");
        G.p(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            L(fileOutputStream, text, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static /* synthetic */ void j(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C5013e.f218326b;
        }
        i(file, str, charset);
    }

    @Xc.f
    public static final BufferedReader k(File file, Charset charset, int i10) {
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i10);
    }

    public static /* synthetic */ BufferedReader l(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i10);
    }

    @Xc.f
    public static final BufferedWriter m(File file, Charset charset, int i10) {
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i10);
    }

    public static /* synthetic */ BufferedWriter n(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i10);
    }

    @NotNull
    public static ByteBuffer o(int i10, @NotNull CharsetEncoder encoder) {
        G.p(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        G.o(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void p(@NotNull File file, int i10, @NotNull ed.p<? super byte[], ? super Integer, L0> action) throws IOException {
        G.p(file, "<this>");
        G.p(action, "action");
        if (i10 < 512) {
            i10 = 512;
        }
        ?? r22 = new byte[i10];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(r22);
                if (i11 <= 0) {
                    fileInputStream.close();
                    return;
                }
                action.invoke(r22, Integer.valueOf(i11));
            } finally {
            }
        }
    }

    public static final void q(@NotNull File file, @NotNull ed.p<? super byte[], ? super Integer, L0> action) throws IOException {
        G.p(file, "<this>");
        G.p(action, "action");
        p(file, 4096, action);
    }

    public static final void r(@NotNull File file, @NotNull Charset charset, @NotNull ed.l<? super String, L0> action) throws IOException {
        G.p(file, "<this>");
        G.p(charset, "charset");
        G.p(action, "action");
        u.h(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void s(File file, Charset charset, ed.l lVar, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        r(file, charset, lVar);
    }

    @Xc.f
    public static final FileInputStream t(File file) {
        G.p(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder u(@NotNull Charset charset) {
        G.p(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Xc.f
    public static final FileOutputStream v(File file) {
        G.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @Xc.f
    public static final PrintWriter w(File file, Charset charset) {
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    public static /* synthetic */ PrintWriter x(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        G.p(file, "<this>");
        G.p(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @NotNull
    public static final byte[] y(@NotNull File file) throws IOException {
        G.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > LruCacheKt.f86729a) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrCopyOf = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrCopyOf, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12);
                G.o(bArrCopyOf, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    f fVar = new f(8193);
                    fVar.write(i14);
                    a.l(fileInputStream, fVar, 0, 2, null);
                    int size = fVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrD = fVar.d();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    G.o(bArrCopyOf, "copyOf(...)");
                    C4875q.v0(bArrD, bArrCopyOf, i10, 0, fVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final List<String> z(@NotNull File file, @NotNull Charset charset) throws IOException {
        G.p(file, "<this>");
        G.p(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        r(file, charset, new ed.l() { // from class: kotlin.io.k
            @Override // ed.l
            public final Object invoke(Object obj) {
                return l.B(arrayList, (String) obj);
            }
        });
        return arrayList;
    }
}
