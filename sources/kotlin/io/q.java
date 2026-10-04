package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f217852a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f217853b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static CharsetDecoder f217854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f217855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final byte[] f217856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final char[] f217857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ByteBuffer f217858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final CharBuffer f217859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final StringBuilder f217860i;

    static {
        byte[] bArr = new byte[32];
        f217856e = bArr;
        char[] cArr = new char[32];
        f217857f = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        G.o(byteBufferWrap, "wrap(...)");
        f217858g = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        G.o(charBufferWrap, "wrap(...)");
        f217859h = charBufferWrap;
        f217860i = new StringBuilder();
    }

    public final int a() {
        ByteBuffer byteBuffer = f217858g;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    public final int b(boolean z10) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f217854c;
            if (charsetDecoder == null) {
                G.S("decoder");
                throw null;
            }
            ByteBuffer byteBuffer = f217858g;
            CharBuffer charBuffer = f217859h;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
            G.o(coderResultDecode, "decode(...)");
            if (coderResultDecode.isError()) {
                e();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb2 = f217860i;
            char[] cArr = f217857f;
            int i10 = iPosition - 1;
            sb2.append(cArr, 0, i10);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i10]);
        }
    }

    public final int c(int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBuffer = f217858g;
        byteBuffer.limit(i10);
        f217859h.position(i11);
        int iB = b(true);
        CharsetDecoder charsetDecoder = f217854c;
        if (charsetDecoder == null) {
            G.S("decoder");
            throw null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r10 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        r0 = kotlin.io.q.f217857f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r0[r10 - 1] != '\n') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r1 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r0[r10 - 2] != '\r') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r10 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r0 = kotlin.io.q.f217860i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r0.length() != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        return new java.lang.String(kotlin.io.q.f217857f, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r0.append(kotlin.io.q.f217857f, 0, r10);
        r10 = r0.toString();
        kotlin.jvm.internal.G.o(r10, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r0.length() <= 32) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        return r10;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String d(@org.jetbrains.annotations.NotNull java.io.InputStream r10, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.G.p(r10, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.G.p(r11, r0)     // Catch: java.lang.Throwable -> L1d
            java.nio.charset.CharsetDecoder r0 = kotlin.io.q.f217854c     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L26
            if (r0 == 0) goto L20
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L1d
            boolean r0 = kotlin.jvm.internal.G.g(r0, r11)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L29
            goto L26
        L1d:
            r10 = move-exception
            goto Lc5
        L20:
            java.lang.String r10 = "decoder"
            kotlin.jvm.internal.G.S(r10)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L26:
            r9.g(r11)     // Catch: java.lang.Throwable -> L1d
        L29:
            r11 = 0
            r0 = r11
            r2 = r0
        L2c:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L1d
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L4a
            java.lang.StringBuilder r10 = kotlin.io.q.f217860i     // Catch: java.lang.Throwable -> L1d
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L1d
            if (r10 != 0) goto L45
            if (r0 != 0) goto L45
            if (r2 != 0) goto L45
            monitor-exit(r9)
            return r1
        L45:
            int r10 = r9.c(r0, r2)     // Catch: java.lang.Throwable -> L1d
            goto L78
        L4a:
            byte[] r5 = kotlin.io.q.f217856e     // Catch: java.lang.Throwable -> L1d
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L1d
            r5[r0] = r8     // Catch: java.lang.Throwable -> L1d
            if (r3 == r6) goto L5c
            if (r7 == r4) goto L5c
            boolean r0 = kotlin.io.q.f217855d     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L5a
            goto L5c
        L5a:
            r0 = r7
            goto L2c
        L5c:
            java.nio.ByteBuffer r0 = kotlin.io.q.f217858g     // Catch: java.lang.Throwable -> L1d
            r0.limit(r7)     // Catch: java.lang.Throwable -> L1d
            java.nio.CharBuffer r3 = kotlin.io.q.f217859h     // Catch: java.lang.Throwable -> L1d
            r3.position(r2)     // Catch: java.lang.Throwable -> L1d
            int r2 = r9.b(r11)     // Catch: java.lang.Throwable -> L1d
            if (r2 <= 0) goto Lbf
            char[] r3 = kotlin.io.q.f217857f     // Catch: java.lang.Throwable -> L1d
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L1d
            if (r3 != r6) goto Lbf
            r0.position(r11)     // Catch: java.lang.Throwable -> L1d
            r10 = r2
        L78:
            if (r10 <= 0) goto L92
            char[] r0 = kotlin.io.q.f217857f     // Catch: java.lang.Throwable -> L1d
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L1d
            if (r1 != r6) goto L92
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L91
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L1d
            r2 = 13
            if (r0 != r2) goto L91
            int r10 = r10 + (-2)
            goto L92
        L91:
            r10 = r1
        L92:
            java.lang.StringBuilder r0 = kotlin.io.q.f217860i     // Catch: java.lang.Throwable -> L1d
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto La3
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L1d
            char[] r1 = kotlin.io.q.f217857f     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r9)
            return r0
        La3:
            char[] r1 = kotlin.io.q.f217857f     // Catch: java.lang.Throwable -> L1d
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.G.o(r10, r1)     // Catch: java.lang.Throwable -> L1d
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r1 <= r4) goto Lba
            r9.f()     // Catch: java.lang.Throwable -> L1d
        Lba:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r9)
            return r10
        Lbf:
            int r0 = r9.a()     // Catch: java.lang.Throwable -> L1d
            goto L2c
        Lc5:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L1d
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.q.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    public final void e() {
        CharsetDecoder charsetDecoder = f217854c;
        if (charsetDecoder == null) {
            G.S("decoder");
            throw null;
        }
        charsetDecoder.reset();
        f217858g.position(0);
        f217860i.setLength(0);
    }

    public final void f() {
        StringBuilder sb2 = f217860i;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    public final void g(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        G.o(charsetDecoderNewDecoder, "newDecoder(...)");
        f217854c = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = f217858g;
        byteBuffer.clear();
        CharBuffer charBuffer = f217859h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f217854c;
        if (charsetDecoder == null) {
            G.S("decoder");
            throw null;
        }
        boolean z10 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z10 = true;
        }
        f217855d = z10;
        e();
    }
}
