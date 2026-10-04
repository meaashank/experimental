package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.LruCacheKt;
import androidx.compose.foundation.layout.C1713x0;
import androidx.compose.foundation.text.C1758e;
import com.google.common.base.Ascii;
import com.prism.commons.utils.C3860y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.C4875q;
import kotlin.text.C5013e;
import okhttp3.internal.connection.RealConnection;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5360j implements InterfaceC5362l, InterfaceC5361k, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @Nullable
    public a0 f226050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f226051b;

    /* JADX INFO: renamed from: okio.j$a */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @Nullable
        public C5360j f226052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dd.g
        public boolean f226053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public a0 f226054c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dd.g
        @Nullable
        public byte[] f226056e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dd.g
        public long f226055d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dd.g
        public int f226057f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dd.g
        public int f226058g = -1;

        public final long a(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("minByteCount <= 0: ", i10).toString());
            }
            if (i10 > 8192) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("minByteCount > Segment.SIZE: ", i10).toString());
            }
            C5360j c5360j = this.f226052a;
            if (c5360j == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f226053b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j10 = c5360j.f226051b;
            a0 a0VarQ3 = c5360j.q3(i10);
            int i11 = 8192 - a0VarQ3.f225916c;
            a0VarQ3.f225916c = 8192;
            long j11 = i11;
            c5360j.f226051b = j10 + j11;
            this.f226054c = a0VarQ3;
            this.f226055d = j10;
            this.f226056e = a0VarQ3.f225914a;
            this.f226057f = 8192 - i11;
            this.f226058g = 8192;
            return j11;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f226052a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f226052a = null;
            this.f226054c = null;
            this.f226055d = -1L;
            this.f226056e = null;
            this.f226057f = -1;
            this.f226058g = -1;
        }

        @Nullable
        public final a0 d() {
            return this.f226054c;
        }

        public final int k() {
            long j10 = this.f226055d;
            C5360j c5360j = this.f226052a;
            kotlin.jvm.internal.G.m(c5360j);
            if (j10 == c5360j.f226051b) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f226055d;
            return m(j11 == -1 ? 0L : j11 + ((long) (this.f226058g - this.f226057f)));
        }

        public final long l(long j10) {
            C5360j c5360j = this.f226052a;
            if (c5360j == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f226053b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j11 = c5360j.f226051b;
            if (j10 <= j11) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(androidx.collection.Q.a("newSize < 0: ", j10).toString());
                }
                long j12 = j11 - j10;
                while (true) {
                    if (j12 <= 0) {
                        break;
                    }
                    a0 a0Var = c5360j.f226050a;
                    kotlin.jvm.internal.G.m(a0Var);
                    a0 a0Var2 = a0Var.f225920g;
                    kotlin.jvm.internal.G.m(a0Var2);
                    int i10 = a0Var2.f225916c;
                    long j13 = i10 - a0Var2.f225915b;
                    if (j13 > j12) {
                        a0Var2.f225916c = i10 - ((int) j12);
                        break;
                    }
                    c5360j.f226050a = a0Var2.b();
                    b0.d(a0Var2);
                    j12 -= j13;
                }
                this.f226054c = null;
                this.f226055d = j10;
                this.f226056e = null;
                this.f226057f = -1;
                this.f226058g = -1;
            } else if (j10 > j11) {
                long j14 = j10 - j11;
                int i11 = 1;
                boolean z10 = true;
                for (long j15 = 0; j14 > j15; j15 = 0) {
                    a0 a0VarQ3 = c5360j.q3(i11);
                    int iMin = (int) Math.min(j14, 8192 - a0VarQ3.f225916c);
                    int i12 = a0VarQ3.f225916c + iMin;
                    a0VarQ3.f225916c = i12;
                    j14 -= (long) iMin;
                    if (z10) {
                        this.f226054c = a0VarQ3;
                        this.f226055d = j11;
                        this.f226056e = a0VarQ3.f225914a;
                        this.f226057f = i12 - iMin;
                        this.f226058g = i12;
                        z10 = false;
                    }
                    i11 = 1;
                }
            }
            c5360j.f226051b = j10;
            return j11;
        }

        public final int m(long j10) {
            a0 a0Var;
            C5360j c5360j = this.f226052a;
            if (c5360j == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 >= -1) {
                long j11 = c5360j.f226051b;
                if (j10 <= j11) {
                    if (j10 == -1 || j10 == j11) {
                        this.f226054c = null;
                        this.f226055d = j10;
                        this.f226056e = null;
                        this.f226057f = -1;
                        this.f226058g = -1;
                        return -1;
                    }
                    a0 a0Var2 = c5360j.f226050a;
                    a0 a0Var3 = this.f226054c;
                    long j12 = 0;
                    if (a0Var3 != null) {
                        long j13 = this.f226055d;
                        int i10 = this.f226057f;
                        kotlin.jvm.internal.G.m(a0Var3);
                        long j14 = j13 - ((long) (i10 - a0Var3.f225915b));
                        if (j14 > j10) {
                            a0Var = a0Var2;
                            a0Var2 = this.f226054c;
                            j11 = j14;
                        } else {
                            a0Var = this.f226054c;
                            j12 = j14;
                        }
                    } else {
                        a0Var = a0Var2;
                    }
                    if (j11 - j10 > j10 - j12) {
                        while (true) {
                            kotlin.jvm.internal.G.m(a0Var);
                            int i11 = a0Var.f225916c;
                            int i12 = a0Var.f225915b;
                            if (j10 < ((long) (i11 - i12)) + j12) {
                                break;
                            }
                            j12 += (long) (i11 - i12);
                            a0Var = a0Var.f225919f;
                        }
                    } else {
                        while (j11 > j10) {
                            kotlin.jvm.internal.G.m(a0Var2);
                            a0Var2 = a0Var2.f225920g;
                            kotlin.jvm.internal.G.m(a0Var2);
                            j11 -= (long) (a0Var2.f225916c - a0Var2.f225915b);
                        }
                        a0Var = a0Var2;
                        j12 = j11;
                    }
                    if (this.f226053b) {
                        kotlin.jvm.internal.G.m(a0Var);
                        if (a0Var.f225917d) {
                            a0 a0VarF = a0Var.f();
                            if (c5360j.f226050a == a0Var) {
                                c5360j.f226050a = a0VarF;
                            }
                            a0Var.c(a0VarF);
                            a0 a0Var4 = a0VarF.f225920g;
                            kotlin.jvm.internal.G.m(a0Var4);
                            a0Var4.b();
                            a0Var = a0VarF;
                        }
                    }
                    this.f226054c = a0Var;
                    this.f226055d = j10;
                    kotlin.jvm.internal.G.m(a0Var);
                    this.f226056e = a0Var.f225914a;
                    int i13 = a0Var.f225915b + ((int) (j10 - j12));
                    this.f226057f = i13;
                    int i14 = a0Var.f225916c;
                    this.f226058g = i14;
                    return i14 - i13;
                }
            }
            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("offset=", j10, " > size=");
            sbA.append(c5360j.f226051b);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }

        public final void n(@Nullable a0 a0Var) {
            this.f226054c = a0Var;
        }
    }

    /* JADX INFO: renamed from: okio.j$c */
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @NotNull
        public String toString() {
            return C5360j.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C5360j.this.Y3(i10);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] data, int i10, int i11) {
            kotlin.jvm.internal.G.p(data, "data");
            C5360j.this.X3(data, i10, i11);
        }
    }

    public static /* synthetic */ C5360j C0(C5360j c5360j, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = c5360j.f226051b - j12;
        }
        c5360j.s(outputStream, j12, j11);
        return c5360j;
    }

    public static a F2(C5360j c5360j, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = l0.f226063a;
        }
        return c5360j.z2(aVar);
    }

    public static /* synthetic */ C5360j L0(C5360j c5360j, C5360j c5360j2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c5360j.u(c5360j2, j10);
        return c5360j;
    }

    public static /* synthetic */ C5360j N0(C5360j c5360j, C5360j c5360j2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c5360j.y(c5360j2, j10, j11);
        return c5360j;
    }

    public static a c2(C5360j c5360j, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = l0.f226063a;
        }
        return c5360j.Y1(aVar);
    }

    public static /* synthetic */ C5360j l4(C5360j c5360j, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = c5360j.f226051b;
        }
        c5360j.k4(outputStream, j10);
        return c5360j;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k A0(long j10) {
        e4(j10);
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public String A2(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        byte b10 = (byte) 10;
        long jW2 = w2(b10, 0L, j11);
        if (jW2 != -1) {
            return okio.internal.d.j0(this, jW2);
        }
        if (j11 < this.f226051b && f1(j11 - 1) == ((byte) 13) && f1(j11) == b10) {
            return okio.internal.d.j0(this, j11);
        }
        C5360j c5360j = new C5360j();
        y(c5360j, 0L, Math.min(32, this.f226051b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f226051b, j10) + " content=" + c5360j.s1(c5360j.f226051b).A() + kotlin.text.X.f218288F);
    }

    @NotNull
    public final ByteString B1(@NotNull ByteString key) {
        kotlin.jvm.internal.G.p(key, "key");
        return h1("HmacSHA1", key);
    }

    @NotNull
    public final ByteString C1(@NotNull ByteString key) {
        kotlin.jvm.internal.G.p(key, "key");
        return h1("HmacSHA256", key);
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k C3(String str, Charset charset) {
        i4(str, charset);
        return this;
    }

    @Override // okio.InterfaceC5362l
    public long D0(@NotNull ByteString bytes) throws IOException {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        return x(bytes, 0L);
    }

    @Override // okio.InterfaceC5362l
    public int F3() throws EOFException {
        return l0.o(readInt());
    }

    @NotNull
    public final ByteString G1(@NotNull ByteString key) {
        kotlin.jvm.internal.G.p(key, "key");
        return h1("HmacSHA512", key);
    }

    @Override // okio.InterfaceC5362l
    public long H0(byte b10, long j10) {
        return w2(b10, j10, Long.MAX_VALUE);
    }

    @Override // okio.InterfaceC5362l
    public long I0(@NotNull ByteString targetBytes) {
        kotlin.jvm.internal.G.p(targetBytes, "targetBytes");
        return j1(targetBytes, 0L);
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k I1(int i10) {
        g4(i10);
        return this;
    }

    public final void J2(long j10) {
        this.f226051b = j10;
    }

    @NotNull
    public C5360j J3(@NotNull e0 source, long j10) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        while (j10 > 0) {
            long jL3 = source.L3(this, j10);
            if (jL3 == -1) {
                throw new EOFException();
            }
            j10 -= jL3;
        }
        return this;
    }

    @Override // okio.InterfaceC5362l
    @Nullable
    public String K0() throws EOFException {
        long jM1 = m1((byte) 10);
        if (jM1 != -1) {
            return okio.internal.d.j0(this, jM1);
        }
        long j10 = this.f226051b;
        if (j10 != 0) {
            return b2(j10, C5013e.f218326b);
        }
        return null;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k K2(String str) {
        m4(str);
        return this;
    }

    @Override // okio.e0
    public long L3(@NotNull C5360j sink, long j10) {
        kotlin.jvm.internal.G.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f226051b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.O2(this, j10);
        return j10;
    }

    @NotNull
    public final ByteString M1() {
        return O0("MD5");
    }

    @dd.k
    @NotNull
    public final a N1() {
        return c2(this, null, 1, null);
    }

    public final ByteString O0(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        a0 a0Var = this.f226050a;
        if (a0Var != null) {
            byte[] bArr = a0Var.f225914a;
            int i10 = a0Var.f225915b;
            messageDigest.update(bArr, i10, a0Var.f225916c - i10);
            a0 a0Var2 = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var2);
            while (a0Var2 != a0Var) {
                byte[] bArr2 = a0Var2.f225914a;
                int i11 = a0Var2.f225915b;
                messageDigest.update(bArr2, i11, a0Var2.f225916c - i11);
                a0Var2 = a0Var2.f225919f;
                kotlin.jvm.internal.G.m(a0Var2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.G.o(bArrDigest, "messageDigest.digest()");
        return new ByteString(bArrDigest);
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public String O1(@NotNull Charset charset) {
        kotlin.jvm.internal.G.p(charset, "charset");
        return b2(this.f226051b, charset);
    }

    @Override // okio.c0
    public void O2(@NotNull C5360j source, long j10) {
        a0 a0Var;
        kotlin.jvm.internal.G.p(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        l0.e(source.f226051b, 0L, j10);
        while (j10 > 0) {
            a0 a0Var2 = source.f226050a;
            kotlin.jvm.internal.G.m(a0Var2);
            int i10 = a0Var2.f225916c;
            kotlin.jvm.internal.G.m(source.f226050a);
            if (j10 < i10 - r1.f225915b) {
                a0 a0Var3 = this.f226050a;
                if (a0Var3 != null) {
                    kotlin.jvm.internal.G.m(a0Var3);
                    a0Var = a0Var3.f225920g;
                } else {
                    a0Var = null;
                }
                if (a0Var != null && a0Var.f225918e) {
                    if ((((long) a0Var.f225916c) + j10) - ((long) (a0Var.f225917d ? 0 : a0Var.f225915b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        a0 a0Var4 = source.f226050a;
                        kotlin.jvm.internal.G.m(a0Var4);
                        a0Var4.g(a0Var, (int) j10);
                        source.f226051b -= j10;
                        this.f226051b += j10;
                        return;
                    }
                }
                a0 a0Var5 = source.f226050a;
                kotlin.jvm.internal.G.m(a0Var5);
                source.f226050a = a0Var5.e((int) j10);
            }
            a0 a0Var6 = source.f226050a;
            kotlin.jvm.internal.G.m(a0Var6);
            long j11 = a0Var6.f225916c - a0Var6.f225915b;
            source.f226050a = a0Var6.b();
            a0 a0Var7 = this.f226050a;
            if (a0Var7 == null) {
                this.f226050a = a0Var6;
                a0Var6.f225920g = a0Var6;
                a0Var6.f225919f = a0Var6;
            } else {
                kotlin.jvm.internal.G.m(a0Var7);
                a0 a0Var8 = a0Var7.f225920g;
                kotlin.jvm.internal.G.m(a0Var8);
                a0Var8.c(a0Var6);
                a0Var6.a();
            }
            source.f226051b -= j11;
            this.f226051b += j11;
            j10 -= j11;
        }
    }

    @NotNull
    public C5360j Q0() {
        return this;
    }

    @Override // okio.InterfaceC5361k
    public long Q2(@NotNull e0 source) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        long j10 = 0;
        while (true) {
            long jL3 = source.L3(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jL3 == -1) {
                return j10;
            }
            j10 += jL3;
        }
    }

    @Override // okio.InterfaceC5362l
    public int R1() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f226051b == 0) {
            throw new EOFException();
        }
        byte bF1 = f1(0L);
        if ((bF1 & 128) == 0) {
            i10 = bF1 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bF1 & 224) == 192) {
            i10 = bF1 & Ascii.US;
            i11 = 2;
            i12 = 128;
        } else if ((bF1 & 240) == 224) {
            i10 = bF1 & Ascii.SI;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bF1 & 248) != 240) {
                skip(1L);
                return h0.f225964c;
            }
            i10 = bF1 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (this.f226051b < j10) {
            StringBuilder sbA = android.support.v4.media.a.a("size < ", i11, ": ");
            sbA.append(this.f226051b);
            sbA.append(" (to read code point prefixed 0x");
            sbA.append(l0.u(bF1));
            sbA.append(')');
            throw new EOFException(sbA.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bF12 = f1(j11);
            if ((bF12 & t1.b.f239010o7) != 128) {
                skip(j11);
                return h0.f225964c;
            }
            i10 = (i10 << 6) | (bF12 & h0.f225962a);
        }
        skip(j10);
        return i10 > 1114111 ? h0.f225964c : ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : h0.f225964c;
    }

    @NotNull
    public final ByteString R2() {
        return O0(C3860y.f162169b);
    }

    @Override // okio.InterfaceC5362l
    public boolean S0(long j10, @NotNull ByteString bytes) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        return U2(j10, bytes, 0, bytes.y());
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k S1(long j10) {
        a4(j10);
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public String S2() throws EOFException {
        return A2(Long.MAX_VALUE);
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public C5360j T() {
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public ByteString T1() {
        return s1(this.f226051b);
    }

    @Override // okio.InterfaceC5362l
    public boolean U2(long j10, @NotNull ByteString bytes, int i10, int i11) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f226051b - j10 < i11 || bytes.y() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f1(((long) i12) + j10) != bytes.M(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public C5360j U3(@NotNull byte[] source) {
        kotlin.jvm.internal.G.p(source, "source");
        X3(source, 0, source.length);
        return this;
    }

    @NotNull
    public final ByteString V2() {
        return O0("SHA-256");
    }

    @Override // okio.InterfaceC5361k
    @NotNull
    public OutputStream V3() {
        return new c();
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k W1(e0 e0Var, long j10) throws IOException {
        J3(e0Var, j10);
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public byte[] W2(long j10) throws EOFException {
        if (j10 < 0 || j10 > LruCacheKt.f86729a) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount: ", j10).toString());
        }
        if (this.f226051b < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.InterfaceC5362l
    public int W3(@NotNull T options) throws EOFException {
        kotlin.jvm.internal.G.p(options, "options");
        int iM0 = okio.internal.d.m0(this, options, false, 2, null);
        if (iM0 == -1) {
            return -1;
        }
        skip(options.f225878c[iM0].y());
        return iM0;
    }

    @NotNull
    public C5360j X0() {
        return this;
    }

    @NotNull
    public C5360j X3(@NotNull byte[] source, int i10, int i11) {
        kotlin.jvm.internal.G.p(source, "source");
        long j10 = i11;
        l0.e(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a0 a0VarQ3 = q3(1);
            int iMin = Math.min(i12 - i10, 8192 - a0VarQ3.f225916c);
            int i13 = i10 + iMin;
            C4875q.v0(source, a0VarQ3.f225914a, a0VarQ3.f225916c, i10, i13);
            a0VarQ3.f225916c += iMin;
            i10 = i13;
        }
        this.f226051b += j10;
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k Y0(String str, int i10, int i11) {
        n4(str, i10, i11);
        return this;
    }

    @dd.k
    @NotNull
    public final a Y1(@NotNull a unsafeCursor) {
        kotlin.jvm.internal.G.p(unsafeCursor, "unsafeCursor");
        return okio.internal.d.s(this, unsafeCursor);
    }

    @NotNull
    public C5360j Y3(int i10) {
        a0 a0VarQ3 = q3(1);
        byte[] bArr = a0VarQ3.f225914a;
        int i11 = a0VarQ3.f225916c;
        a0VarQ3.f225916c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f226051b++;
        return this;
    }

    @NotNull
    public final ByteString Z2() {
        return O0("SHA-512");
    }

    @NotNull
    public C5360j Z3(long j10) {
        boolean z10;
        if (j10 == 0) {
            Y3(48);
            return this;
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                m4("-9223372036854775808");
                return this;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < RealConnection.f225578w ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        a0 a0VarQ3 = q3(i10);
        byte[] bArr = a0VarQ3.f225914a;
        int i11 = a0VarQ3.f225916c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = okio.internal.d.g0()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = (byte) 45;
        }
        a0VarQ3.f225916c += i10;
        this.f226051b += (long) i10;
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public String a2() {
        return b2(this.f226051b, C5013e.f218326b);
    }

    @NotNull
    public C5360j a4(long j10) {
        if (j10 == 0) {
            Y3(48);
            return this;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        a0 a0VarQ3 = q3(i10);
        byte[] bArr = a0VarQ3.f225914a;
        int i11 = a0VarQ3.f225916c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = okio.internal.d.g0()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        a0VarQ3.f225916c += i10;
        this.f226051b += (long) i10;
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public String b2(long j10, @NotNull Charset charset) throws EOFException {
        kotlin.jvm.internal.G.p(charset, "charset");
        if (j10 < 0 || j10 > LruCacheKt.f86729a) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount: ", j10).toString());
        }
        if (this.f226051b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225915b;
        if (((long) i10) + j10 > a0Var.f225916c) {
            return new String(W2(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(a0Var.f225914a, i10, i11, charset);
        int i12 = a0Var.f225915b + i11;
        a0Var.f225915b = i12;
        this.f226051b -= j10;
        if (i12 == a0Var.f225916c) {
            this.f226050a = a0Var.b();
            b0.d(a0Var);
        }
        return str;
    }

    @NotNull
    public C5360j b4(int i10) {
        a0 a0VarQ3 = q3(4);
        byte[] bArr = a0VarQ3.f225914a;
        int i11 = a0VarQ3.f225916c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        a0VarQ3.f225916c = i11 + 4;
        this.f226051b += 4;
        return this;
    }

    @NotNull
    public C5360j c4(int i10) {
        b4(l0.o(i10));
        return this;
    }

    public Object clone() {
        return p();
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final ByteString d3() {
        long j10 = this.f226051b;
        if (j10 <= LruCacheKt.f86729a) {
            return k3((int) j10);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f226051b).toString());
    }

    @NotNull
    public C5360j d4(long j10) {
        a0 a0VarQ3 = q3(8);
        byte[] bArr = a0VarQ3.f225914a;
        int i10 = a0VarQ3.f225916c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        a0VarQ3.f225916c = i10 + 8;
        this.f226051b += 8;
        return this;
    }

    @Override // okio.InterfaceC5362l
    public short e1() throws EOFException {
        return l0.q(readShort());
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k e2(ByteString byteString) {
        v3(byteString);
        return this;
    }

    @NotNull
    public C5360j e4(long j10) {
        d4(l0.p(j10));
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5360j)) {
            return false;
        }
        long j10 = this.f226051b;
        C5360j c5360j = (C5360j) obj;
        if (j10 != c5360j.f226051b) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        a0 a0Var2 = c5360j.f226050a;
        kotlin.jvm.internal.G.m(a0Var2);
        int i10 = a0Var.f225915b;
        int i11 = a0Var2.f225915b;
        long j11 = 0;
        while (j11 < this.f226051b) {
            long jMin = Math.min(a0Var.f225916c - i10, a0Var2.f225916c - i11);
            long j12 = 0;
            while (j12 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (a0Var.f225914a[i10] != a0Var2.f225914a[i11]) {
                    return false;
                }
                j12++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == a0Var.f225916c) {
                a0Var = a0Var.f225919f;
                kotlin.jvm.internal.G.m(a0Var);
                i10 = a0Var.f225915b;
            }
            if (i11 == a0Var2.f225916c) {
                a0Var2 = a0Var2.f225919f;
                kotlin.jvm.internal.G.m(a0Var2);
                i11 = a0Var2.f225915b;
            }
            j11 += jMin;
        }
        return true;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @InterfaceC4852c0(expression = "this[index]", imports = {}))
    @dd.j(name = "-deprecated_getByte")
    public final byte f(long j10) {
        return f1(j10);
    }

    @dd.j(name = "getByte")
    public final byte f1(long j10) {
        l0.e(this.f226051b, j10, 1L);
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            kotlin.jvm.internal.G.m(null);
            throw null;
        }
        long j11 = this.f226051b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                a0Var = a0Var.f225920g;
                kotlin.jvm.internal.G.m(a0Var);
                j11 -= (long) (a0Var.f225916c - a0Var.f225915b);
            }
            return a0Var.f225914a[(int) ((((long) a0Var.f225915b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = a0Var.f225916c;
            int i11 = a0Var.f225915b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return a0Var.f225914a[(int) ((((long) i11) + j10) - j12)];
            }
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j12 = j13;
        }
    }

    @NotNull
    public C5360j f4(int i10) {
        a0 a0VarQ3 = q3(2);
        byte[] bArr = a0VarQ3.f225914a;
        int i11 = a0VarQ3.f225916c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        a0VarQ3.f225916c = i11 + 2;
        this.f226051b += 2;
        return this;
    }

    @Override // okio.InterfaceC5361k, okio.c0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.InterfaceC5362l
    public long g1() throws EOFException {
        return l0.p(readLong());
    }

    @Override // okio.InterfaceC5362l
    public long g2(@NotNull c0 sink) throws IOException {
        kotlin.jvm.internal.G.p(sink, "sink");
        long j10 = this.f226051b;
        if (j10 > 0) {
            sink.O2(this, j10);
        }
        return j10;
    }

    @NotNull
    public C5360j g4(int i10) {
        f4(l0.q((short) i10));
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public C5360j getBuffer() {
        return this;
    }

    public final ByteString h1(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.L(), str));
            a0 a0Var = this.f226050a;
            if (a0Var != null) {
                byte[] bArr = a0Var.f225914a;
                int i10 = a0Var.f225915b;
                mac.update(bArr, i10, a0Var.f225916c - i10);
                a0 a0Var2 = a0Var.f225919f;
                kotlin.jvm.internal.G.m(a0Var2);
                while (a0Var2 != a0Var) {
                    byte[] bArr2 = a0Var2.f225914a;
                    int i11 = a0Var2.f225915b;
                    mac.update(bArr2, i11, a0Var2.f225916c - i11);
                    a0Var2 = a0Var2.f225919f;
                    kotlin.jvm.internal.G.m(a0Var2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.G.o(bArrDoFinal, "mac.doFinal()");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NotNull
    public final C5360j h2(@NotNull InputStream input) throws IOException {
        kotlin.jvm.internal.G.p(input, "input");
        n2(input, Long.MAX_VALUE, true);
        return this;
    }

    @NotNull
    public C5360j h4(@NotNull String string, int i10, int i11, @NotNull Charset charset) {
        kotlin.jvm.internal.G.p(string, "string");
        kotlin.jvm.internal.G.p(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("beginIndex < 0: ", i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbA = android.support.v4.media.a.a("endIndex > string.length: ", i11, " > ");
            sbA.append(string.length());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (charset.equals(C5013e.f218326b)) {
            n4(string, i10, i11);
            return this;
        }
        String strSubstring = string.substring(i10, i11);
        kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
        X3(bytes, 0, bytes.length);
        return this;
    }

    public int hashCode() {
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = a0Var.f225916c;
            for (int i12 = a0Var.f225915b; i12 < i11; i12++) {
                i10 = (i10 * 31) + a0Var.f225914a[i12];
            }
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
        } while (a0Var != this.f226050a);
        return i10;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k i1(String str, int i10, int i11, Charset charset) {
        h4(str, i10, i11, charset);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[EDGE_INSN: B:43:0x0094->B:37:0x0094 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // okio.InterfaceC5362l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i2() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.f226051b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9b
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.a0 r6 = r14.f226050a
            kotlin.jvm.internal.G.m(r6)
            byte[] r7 = r6.f225914a
            int r8 = r6.f225915b
            int r9 = r6.f225916c
        L16:
            if (r8 >= r9) goto L80
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L41
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L36
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L36
        L31:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L41
        L36:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L6c
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L6c
            goto L31
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L51:
            okio.j r0 = new okio.j
            r0.<init>()
            r0.a4(r4)
            r0.Y3(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.a2()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L80
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = okio.l0.u(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L80:
            if (r8 != r9) goto L8c
            okio.a0 r7 = r6.b()
            r14.f226050a = r7
            okio.b0.d(r6)
            goto L8e
        L8c:
            r6.f225915b = r8
        L8e:
            if (r1 != 0) goto L94
            okio.a0 r6 = r14.f226050a
            if (r6 != 0) goto Lb
        L94:
            long r1 = r14.f226051b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f226051b = r1
            return r4
        L9b:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C5360j.i2():long");
    }

    @Override // okio.InterfaceC5362l
    public void i3(long j10) throws EOFException {
        if (this.f226051b < j10) {
            throw new EOFException();
        }
    }

    @NotNull
    public C5360j i4(@NotNull String string, @NotNull Charset charset) {
        kotlin.jvm.internal.G.p(string, "string");
        kotlin.jvm.internal.G.p(charset, "charset");
        h4(string, 0, string.length(), charset);
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.InterfaceC5362l
    public long j1(@NotNull ByteString targetBytes, long j10) {
        kotlin.jvm.internal.G.p(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("fromIndex < 0: ", j10).toString());
        }
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            return -1L;
        }
        long j12 = this.f226051b;
        if (j12 - j10 < j10) {
            while (j12 > j10) {
                a0Var = a0Var.f225920g;
                kotlin.jvm.internal.G.m(a0Var);
                j12 -= (long) (a0Var.f225916c - a0Var.f225915b);
            }
            if (targetBytes.y() == 2) {
                byte bM = targetBytes.M(0);
                byte bM2 = targetBytes.M(1);
                while (j12 < this.f226051b) {
                    byte[] bArr = a0Var.f225914a;
                    int i10 = a0Var.f225916c;
                    for (int i11 = (int) ((((long) a0Var.f225915b) + j10) - j12); i11 < i10; i11++) {
                        byte b10 = bArr[i11];
                        if (b10 == bM || b10 == bM2) {
                            return ((long) (i11 - a0Var.f225915b)) + j12;
                        }
                    }
                    j12 += (long) (a0Var.f225916c - a0Var.f225915b);
                    a0Var = a0Var.f225919f;
                    kotlin.jvm.internal.G.m(a0Var);
                    j10 = j12;
                }
            } else {
                byte[] bArrL = targetBytes.L();
                while (j12 < this.f226051b) {
                    byte[] bArr2 = a0Var.f225914a;
                    int i12 = a0Var.f225916c;
                    for (int i13 = (int) ((((long) a0Var.f225915b) + j10) - j12); i13 < i12; i13++) {
                        byte b11 = bArr2[i13];
                        for (byte b12 : bArrL) {
                            if (b11 == b12) {
                                return ((long) (i13 - a0Var.f225915b)) + j12;
                            }
                        }
                    }
                    j12 += (long) (a0Var.f225916c - a0Var.f225915b);
                    a0Var = a0Var.f225919f;
                    kotlin.jvm.internal.G.m(a0Var);
                    j10 = j12;
                }
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (a0Var.f225916c - a0Var.f225915b)) + j11;
            if (j13 > j10) {
                break;
            }
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j11 = j13;
        }
        if (targetBytes.y() == 2) {
            byte bM3 = targetBytes.M(0);
            byte bM4 = targetBytes.M(1);
            while (j11 < this.f226051b) {
                byte[] bArr3 = a0Var.f225914a;
                int i14 = a0Var.f225916c;
                for (int i15 = (int) ((((long) a0Var.f225915b) + j10) - j11); i15 < i14; i15++) {
                    byte b13 = bArr3[i15];
                    if (b13 == bM3 || b13 == bM4) {
                        return ((long) (i15 - a0Var.f225915b)) + j11;
                    }
                }
                j11 += (long) (a0Var.f225916c - a0Var.f225915b);
                a0Var = a0Var.f225919f;
                kotlin.jvm.internal.G.m(a0Var);
                j10 = j11;
            }
        } else {
            byte[] bArrL2 = targetBytes.L();
            while (j11 < this.f226051b) {
                byte[] bArr4 = a0Var.f225914a;
                int i16 = a0Var.f225916c;
                for (int i17 = (int) ((((long) a0Var.f225915b) + j10) - j11); i17 < i16; i17++) {
                    byte b14 = bArr4[i17];
                    for (byte b15 : bArrL2) {
                        if (b14 == b15) {
                            return ((long) (i17 - a0Var.f225915b)) + j11;
                        }
                    }
                }
                j11 += (long) (a0Var.f225916c - a0Var.f225915b);
                a0Var = a0Var.f225919f;
                kotlin.jvm.internal.G.m(a0Var);
                j10 = j11;
            }
        }
        return -1L;
    }

    @dd.k
    @NotNull
    public final C5360j j4(@NotNull OutputStream out) throws IOException {
        kotlin.jvm.internal.G.p(out, "out");
        l4(this, out, 0L, 2, null);
        return this;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = X3.i.f76775k, imports = {}))
    @dd.j(name = "-deprecated_size")
    public final long k() {
        return this.f226051b;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k k1(long j10) {
        Z3(j10);
        return this;
    }

    @NotNull
    public final ByteString k3(int i10) {
        if (i10 == 0) {
            return ByteString.f225867e;
        }
        l0.e(this.f226051b, 0L, i10);
        a0 a0Var = this.f226050a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.G.m(a0Var);
            int i14 = a0Var.f225916c;
            int i15 = a0Var.f225915b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            a0Var = a0Var.f225919f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        a0 a0Var2 = this.f226050a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.G.m(a0Var2);
            bArr[i16] = a0Var2.f225914a;
            i11 += a0Var2.f225916c - a0Var2.f225915b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = a0Var2.f225915b;
            a0Var2.f225917d = true;
            i16++;
            a0Var2 = a0Var2.f225919f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @dd.k
    @NotNull
    public final C5360j k4(@NotNull OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.G.p(out, "out");
        l0.e(this.f226051b, 0L, j10);
        a0 a0Var = this.f226050a;
        long j11 = j10;
        while (j11 > 0) {
            kotlin.jvm.internal.G.m(a0Var);
            int iMin = (int) Math.min(j11, a0Var.f225916c - a0Var.f225915b);
            out.write(a0Var.f225914a, a0Var.f225915b, iMin);
            int i10 = a0Var.f225915b + iMin;
            a0Var.f225915b = i10;
            long j12 = iMin;
            this.f226051b -= j12;
            j11 -= j12;
            if (i10 == a0Var.f225916c) {
                a0 a0VarB = a0Var.b();
                this.f226050a = a0VarB;
                b0.d(a0Var);
                a0Var = a0VarB;
            }
        }
        return this;
    }

    public final void l() throws EOFException {
        skip(this.f226051b);
    }

    @NotNull
    public C5360j m() {
        return p();
    }

    @Override // okio.InterfaceC5362l
    public long m1(byte b10) {
        return w2(b10, 0L, Long.MAX_VALUE);
    }

    @NotNull
    public final C5360j m2(@NotNull InputStream input, long j10) throws IOException {
        kotlin.jvm.internal.G.p(input, "input");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j10).toString());
        }
        n2(input, j10, false);
        return this;
    }

    @NotNull
    public C5360j m4(@NotNull String string) {
        kotlin.jvm.internal.G.p(string, "string");
        n4(string, 0, string.length());
        return this;
    }

    public final long n() {
        long j10 = this.f226051b;
        if (j10 == 0) {
            return 0L;
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        a0 a0Var2 = a0Var.f225920g;
        kotlin.jvm.internal.G.m(a0Var2);
        int i10 = a0Var2.f225916c;
        return (i10 >= 8192 || !a0Var2.f225918e) ? j10 : j10 - ((long) (i10 - a0Var2.f225915b));
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public String n1(long j10) throws EOFException {
        return b2(j10, C5013e.f218326b);
    }

    public final void n2(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            a0 a0VarQ3 = q3(1);
            int i10 = inputStream.read(a0VarQ3.f225914a, a0VarQ3.f225916c, (int) Math.min(j10, 8192 - a0VarQ3.f225916c));
            if (i10 == -1) {
                if (a0VarQ3.f225915b == a0VarQ3.f225916c) {
                    this.f226050a = a0VarQ3.b();
                    b0.d(a0VarQ3);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            a0VarQ3.f225916c += i10;
            long j11 = i10;
            this.f226051b += j11;
            j10 -= j11;
        }
    }

    @NotNull
    public C5360j n4(@NotNull String string, int i10, int i11) {
        char cCharAt;
        kotlin.jvm.internal.G.p(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("beginIndex < 0: ", i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbA = android.support.v4.media.a.a("endIndex > string.length: ", i11, " > ");
            sbA.append(string.length());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                a0 a0VarQ3 = q3(1);
                byte[] bArr = a0VarQ3.f225914a;
                int i12 = a0VarQ3.f225916c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = a0VarQ3.f225916c;
                int i15 = (i12 + i10) - i14;
                a0VarQ3.f225916c = i14 + i15;
                this.f226051b += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    a0 a0VarQ32 = q3(2);
                    byte[] bArr2 = a0VarQ32.f225914a;
                    int i16 = a0VarQ32.f225916c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    a0VarQ32.f225916c = i16 + 2;
                    this.f226051b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    a0 a0VarQ33 = q3(3);
                    byte[] bArr3 = a0VarQ33.f225914a;
                    int i17 = a0VarQ33.f225916c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    a0VarQ33.f225916c = i17 + 3;
                    this.f226051b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Y3(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        a0 a0VarQ34 = q3(4);
                        byte[] bArr4 = a0VarQ34.f225914a;
                        int i20 = a0VarQ34.f225916c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        a0VarQ34.f225916c = i20 + 4;
                        this.f226051b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @NotNull
    public C5360j o4(int i10) {
        if (i10 < 128) {
            Y3(i10);
            return this;
        }
        if (i10 < 2048) {
            a0 a0VarQ3 = q3(2);
            byte[] bArr = a0VarQ3.f225914a;
            int i11 = a0VarQ3.f225916c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            a0VarQ3.f225916c = i11 + 2;
            this.f226051b += 2;
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            Y3(63);
            return this;
        }
        if (i10 < 65536) {
            a0 a0VarQ32 = q3(3);
            byte[] bArr2 = a0VarQ32.f225914a;
            int i12 = a0VarQ32.f225916c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            a0VarQ32.f225916c = i12 + 3;
            this.f226051b += 3;
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(l0.v(i10)));
        }
        a0 a0VarQ33 = q3(4);
        byte[] bArr3 = a0VarQ33.f225914a;
        int i13 = a0VarQ33.f225916c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        a0VarQ33.f225916c = i13 + 4;
        this.f226051b += 4;
        return this;
    }

    @NotNull
    public final C5360j p() {
        C5360j c5360j = new C5360j();
        if (this.f226051b == 0) {
            return c5360j;
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        a0 a0VarD = a0Var.d();
        c5360j.f226050a = a0VarD;
        a0VarD.f225920g = a0VarD;
        a0VarD.f225919f = a0VarD;
        for (a0 a0Var2 = a0Var.f225919f; a0Var2 != a0Var; a0Var2 = a0Var2.f225919f) {
            a0 a0Var3 = a0VarD.f225920g;
            kotlin.jvm.internal.G.m(a0Var3);
            kotlin.jvm.internal.G.m(a0Var2);
            a0Var3.c(a0Var2.d());
        }
        c5360j.f226051b = this.f226051b;
        return c5360j;
    }

    @dd.k
    @NotNull
    public final a p2() {
        return F2(this, null, 1, null);
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public InterfaceC5362l peek() {
        return S.c(new W(this));
    }

    @dd.k
    @NotNull
    public final C5360j q(@NotNull OutputStream out) throws IOException {
        kotlin.jvm.internal.G.p(out, "out");
        C0(this, out, 0L, 0L, 6, null);
        return this;
    }

    @Override // okio.InterfaceC5361k
    public InterfaceC5361k q2() {
        return this;
    }

    @NotNull
    public final a0 q3(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            a0 a0VarE = b0.e();
            this.f226050a = a0VarE;
            a0VarE.f225920g = a0VarE;
            a0VarE.f225919f = a0VarE;
            return a0VarE;
        }
        kotlin.jvm.internal.G.m(a0Var);
        a0 a0Var2 = a0Var.f225920g;
        kotlin.jvm.internal.G.m(a0Var2);
        if (a0Var2.f225916c + i10 <= 8192 && a0Var2.f225918e) {
            return a0Var2;
        }
        a0 a0VarE2 = b0.e();
        a0Var2.c(a0VarE2);
        return a0VarE2;
    }

    @dd.k
    @NotNull
    public final C5360j r(@NotNull OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.G.p(out, "out");
        C0(this, out, j10, 0L, 4, null);
        return this;
    }

    @Override // okio.InterfaceC5362l
    public boolean r3() {
        return this.f226051b == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.G.p(sink, "sink");
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), a0Var.f225916c - a0Var.f225915b);
        sink.put(a0Var.f225914a, a0Var.f225915b, iMin);
        int i10 = a0Var.f225915b + iMin;
        a0Var.f225915b = i10;
        this.f226051b -= (long) iMin;
        if (i10 == a0Var.f225916c) {
            this.f226050a = a0Var.b();
            b0.d(a0Var);
        }
        return iMin;
    }

    @Override // okio.InterfaceC5362l
    public byte readByte() throws EOFException {
        if (this.f226051b == 0) {
            throw new EOFException();
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225915b;
        int i11 = a0Var.f225916c;
        int i12 = i10 + 1;
        byte b10 = a0Var.f225914a[i10];
        this.f226051b--;
        if (i12 != i11) {
            a0Var.f225915b = i12;
            return b10;
        }
        this.f226050a = a0Var.b();
        b0.d(a0Var);
        return b10;
    }

    @Override // okio.InterfaceC5362l
    public void readFully(@NotNull byte[] sink) throws EOFException {
        kotlin.jvm.internal.G.p(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // okio.InterfaceC5362l
    public int readInt() throws EOFException {
        if (this.f226051b < 4) {
            throw new EOFException();
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225915b;
        int i11 = a0Var.f225916c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = a0Var.f225914a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f226051b -= 4;
        if (i14 != i11) {
            a0Var.f225915b = i14;
            return i15;
        }
        this.f226050a = a0Var.b();
        b0.d(a0Var);
        return i15;
    }

    @Override // okio.InterfaceC5362l
    public long readLong() throws EOFException {
        if (this.f226051b < 8) {
            throw new EOFException();
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225915b;
        int i11 = a0Var.f225916c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & ZipKt.f225990j) << 32) | (ZipKt.f225990j & ((long) readInt()));
        }
        byte[] bArr = a0Var.f225914a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        this.f226051b -= 8;
        if (i13 != i11) {
            a0Var.f225915b = i13;
            return j11;
        }
        this.f226050a = a0Var.b();
        b0.d(a0Var);
        return j11;
    }

    @Override // okio.InterfaceC5362l
    public short readShort() throws EOFException {
        if (this.f226051b < 2) {
            throw new EOFException();
        }
        a0 a0Var = this.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225915b;
        int i11 = a0Var.f225916c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = a0Var.f225914a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f226051b -= 2;
        if (i14 == i11) {
            this.f226050a = a0Var.b();
            b0.d(a0Var);
        } else {
            a0Var.f225915b = i14;
        }
        return (short) i15;
    }

    @Override // okio.InterfaceC5362l
    public boolean request(long j10) {
        return this.f226051b >= j10;
    }

    @dd.k
    @NotNull
    public final C5360j s(@NotNull OutputStream out, long j10, long j11) throws IOException {
        kotlin.jvm.internal.G.p(out, "out");
        long j12 = j10;
        l0.e(this.f226051b, j12, j11);
        if (j11 != 0) {
            a0 a0Var = this.f226050a;
            while (true) {
                kotlin.jvm.internal.G.m(a0Var);
                int i10 = a0Var.f225916c;
                int i11 = a0Var.f225915b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                a0Var = a0Var.f225919f;
            }
            a0 a0Var2 = a0Var;
            long j13 = j11;
            while (j13 > 0) {
                kotlin.jvm.internal.G.m(a0Var2);
                int i12 = (int) (((long) a0Var2.f225915b) + j12);
                int iMin = (int) Math.min(a0Var2.f225916c - i12, j13);
                out.write(a0Var2.f225914a, i12, iMin);
                j13 -= (long) iMin;
                a0Var2 = a0Var2.f225919f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public ByteString s1(long j10) throws EOFException {
        if (j10 < 0 || j10 > LruCacheKt.f86729a) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount: ", j10).toString());
        }
        if (this.f226051b < j10) {
            throw new EOFException();
        }
        if (j10 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(W2(j10));
        }
        ByteString byteStringK3 = k3((int) j10);
        skip(j10);
        return byteStringK3;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k s2(int i10) {
        o4(i10);
        return this;
    }

    @dd.j(name = X3.i.f76775k)
    public final long size() {
        return this.f226051b;
    }

    @Override // okio.InterfaceC5362l
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            a0 a0Var = this.f226050a;
            if (a0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, a0Var.f225916c - a0Var.f225915b);
            long j11 = iMin;
            this.f226051b -= j11;
            j10 -= j11;
            int i10 = a0Var.f225915b + iMin;
            a0Var.f225915b = i10;
            if (i10 == a0Var.f225916c) {
                this.f226050a = a0Var.b();
                b0.d(a0Var);
            }
        }
    }

    @Override // okio.e0
    @NotNull
    public g0 timeout() {
        return g0.f225946e;
    }

    @NotNull
    public String toString() {
        return d3().toString();
    }

    @NotNull
    public final C5360j u(@NotNull C5360j out, long j10) {
        kotlin.jvm.internal.G.p(out, "out");
        y(out, j10, this.f226051b - j10);
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k u1(ByteString byteString, int i10, int i11) {
        x3(byteString, i10, i11);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r1 = new okio.C5360j();
        r1.Z3(r8);
        r1.Y3(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r2 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.a2()));
     */
    @Override // okio.InterfaceC5362l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long u3() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C5360j.u3():long");
    }

    @Override // okio.InterfaceC5362l
    public void v2(@NotNull C5360j sink, long j10) throws EOFException {
        kotlin.jvm.internal.G.p(sink, "sink");
        long j11 = this.f226051b;
        if (j11 >= j10) {
            sink.O2(this, j10);
        } else {
            sink.O2(this, j11);
            throw new EOFException();
        }
    }

    @NotNull
    public C5360j v3(@NotNull ByteString byteString) {
        kotlin.jvm.internal.G.p(byteString, "byteString");
        byteString.u0(this, 0, byteString.y());
        return this;
    }

    @Override // okio.InterfaceC5362l
    @NotNull
    public byte[] w1() {
        return W2(this.f226051b);
    }

    @Override // okio.InterfaceC5362l
    public long w2(byte b10, long j10, long j11) {
        a0 a0Var;
        long j12 = j10;
        long j13 = j11;
        long j14 = 0;
        if (0 > j12 || j12 > j13) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f226051b);
            C1713x0.a(sb2, " fromIndex=", j12, " toIndex=");
            sb2.append(j13);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j15 = this.f226051b;
        if (j13 > j15) {
            j13 = j15;
        }
        long j16 = -1;
        if (j12 == j13 || (a0Var = this.f226050a) == null) {
            return -1L;
        }
        if (j15 - j12 < j12) {
            while (j15 > j12) {
                a0Var = a0Var.f225920g;
                kotlin.jvm.internal.G.m(a0Var);
                j15 -= (long) (a0Var.f225916c - a0Var.f225915b);
            }
            while (j15 < j13) {
                byte[] bArr = a0Var.f225914a;
                long j17 = j16;
                int iMin = (int) Math.min(a0Var.f225916c, (((long) a0Var.f225915b) + j13) - j15);
                for (int i10 = (int) ((((long) a0Var.f225915b) + j12) - j15); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - a0Var.f225915b)) + j15;
                    }
                }
                j15 += (long) (a0Var.f225916c - a0Var.f225915b);
                a0Var = a0Var.f225919f;
                kotlin.jvm.internal.G.m(a0Var);
                j16 = j17;
                j12 = j15;
            }
            return j16;
        }
        while (true) {
            long j18 = ((long) (a0Var.f225916c - a0Var.f225915b)) + j14;
            if (j18 > j12) {
                break;
            }
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j14 = j18;
        }
        while (j14 < j13) {
            byte[] bArr2 = a0Var.f225914a;
            int iMin2 = (int) Math.min(a0Var.f225916c, (((long) a0Var.f225915b) + j13) - j14);
            for (int i11 = (int) ((((long) a0Var.f225915b) + j12) - j14); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10) {
                    return ((long) (i11 - a0Var.f225915b)) + j14;
                }
            }
            j14 += (long) (a0Var.f225916c - a0Var.f225915b);
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j12 = j14;
        }
        return -1L;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k write(byte[] bArr) {
        U3(bArr);
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k writeByte(int i10) {
        Y3(i10);
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k writeInt(int i10) {
        b4(i10);
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k writeLong(long j10) {
        d4(j10);
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k writeShort(int i10) {
        f4(i10);
        return this;
    }

    @Override // okio.InterfaceC5362l
    public long x(@NotNull ByteString bytes, long j10) throws IOException {
        long j11 = j10;
        kotlin.jvm.internal.G.p(bytes, "bytes");
        if (bytes.y() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("fromIndex < 0: ", j11).toString());
        }
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            return -1L;
        }
        long j13 = this.f226051b;
        if (j13 - j11 < j11) {
            while (j13 > j11) {
                a0Var = a0Var.f225920g;
                kotlin.jvm.internal.G.m(a0Var);
                j13 -= (long) (a0Var.f225916c - a0Var.f225915b);
            }
            byte[] bArrL = bytes.L();
            byte b10 = bArrL[0];
            int iY = bytes.y();
            long j14 = (this.f226051b - ((long) iY)) + 1;
            while (j13 < j14) {
                byte[] bArr = a0Var.f225914a;
                long j15 = j11;
                int iMin = (int) Math.min(a0Var.f225916c, (((long) a0Var.f225915b) + j14) - j13);
                for (int i10 = (int) ((((long) a0Var.f225915b) + j15) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10 && okio.internal.d.i0(a0Var, i10 + 1, bArrL, 1, iY)) {
                        return ((long) (i10 - a0Var.f225915b)) + j13;
                    }
                }
                j13 += (long) (a0Var.f225916c - a0Var.f225915b);
                a0Var = a0Var.f225919f;
                kotlin.jvm.internal.G.m(a0Var);
                j11 = j13;
            }
            return -1L;
        }
        while (true) {
            long j16 = ((long) (a0Var.f225916c - a0Var.f225915b)) + j12;
            if (j16 > j11) {
                break;
            }
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j12 = j16;
        }
        byte[] bArrL2 = bytes.L();
        byte b11 = bArrL2[0];
        int iY2 = bytes.y();
        long j17 = (this.f226051b - ((long) iY2)) + 1;
        while (j12 < j17) {
            byte[] bArr2 = a0Var.f225914a;
            int iMin2 = (int) Math.min(a0Var.f225916c, (((long) a0Var.f225915b) + j17) - j12);
            for (int i11 = (int) ((((long) a0Var.f225915b) + j11) - j12); i11 < iMin2; i11++) {
                if (bArr2[i11] == b11 && okio.internal.d.i0(a0Var, i11 + 1, bArrL2, 1, iY2)) {
                    return ((long) (i11 - a0Var.f225915b)) + j12;
                }
            }
            j12 += (long) (a0Var.f225916c - a0Var.f225915b);
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j11 = j12;
        }
        return -1L;
    }

    @Override // okio.InterfaceC5361k
    public InterfaceC5361k x2() {
        return this;
    }

    @NotNull
    public C5360j x3(@NotNull ByteString byteString, int i10, int i11) {
        kotlin.jvm.internal.G.p(byteString, "byteString");
        byteString.u0(this, i10, i11);
        return this;
    }

    @NotNull
    public final C5360j y(@NotNull C5360j out, long j10, long j11) {
        kotlin.jvm.internal.G.p(out, "out");
        long j12 = j10;
        l0.e(this.f226051b, j12, j11);
        if (j11 != 0) {
            out.f226051b += j11;
            a0 a0Var = this.f226050a;
            while (true) {
                kotlin.jvm.internal.G.m(a0Var);
                int i10 = a0Var.f225916c;
                int i11 = a0Var.f225915b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                a0Var = a0Var.f225919f;
            }
            a0 a0Var2 = a0Var;
            long j13 = j11;
            while (j13 > 0) {
                kotlin.jvm.internal.G.m(a0Var2);
                a0 a0VarD = a0Var2.d();
                int i12 = a0VarD.f225915b + ((int) j12);
                a0VarD.f225915b = i12;
                a0VarD.f225916c = Math.min(i12 + ((int) j13), a0VarD.f225916c);
                a0 a0Var3 = out.f226050a;
                if (a0Var3 == null) {
                    a0VarD.f225920g = a0VarD;
                    a0VarD.f225919f = a0VarD;
                    out.f226050a = a0VarD;
                } else {
                    kotlin.jvm.internal.G.m(a0Var3);
                    a0 a0Var4 = a0Var3.f225920g;
                    kotlin.jvm.internal.G.m(a0Var4);
                    a0Var4.c(a0VarD);
                }
                j13 -= (long) (a0VarD.f225916c - a0VarD.f225915b);
                a0Var2 = a0Var2.f225919f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k y1(int i10) {
        c4(i10);
        return this;
    }

    @dd.k
    @NotNull
    public final a z2(@NotNull a unsafeCursor) {
        kotlin.jvm.internal.G.p(unsafeCursor, "unsafeCursor");
        return okio.internal.d.F(this, unsafeCursor);
    }

    @Override // okio.InterfaceC5361k
    public /* bridge */ /* synthetic */ InterfaceC5361k write(byte[] bArr, int i10, int i11) {
        X3(bArr, i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: okio.j$b */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C5360j.this.f226051b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C5360j c5360j = C5360j.this;
            if (c5360j.f226051b > 0) {
                return c5360j.readByte() & 255;
            }
            return -1;
        }

        @NotNull
        public String toString() {
            return C5360j.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] sink, int i10, int i11) {
            kotlin.jvm.internal.G.p(sink, "sink");
            return C5360j.this.read(sink, i10, i11);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            a0 a0VarQ3 = q3(1);
            int iMin = Math.min(i10, 8192 - a0VarQ3.f225916c);
            source.get(a0VarQ3.f225914a, a0VarQ3.f225916c, iMin);
            i10 -= iMin;
            a0VarQ3.f225916c += iMin;
        }
        this.f226051b += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.InterfaceC5362l
    public int read(@NotNull byte[] sink) {
        kotlin.jvm.internal.G.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.InterfaceC5362l
    public int read(@NotNull byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.G.p(sink, "sink");
        l0.e(sink.length, i10, i11);
        a0 a0Var = this.f226050a;
        if (a0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, a0Var.f225916c - a0Var.f225915b);
        byte[] bArr = a0Var.f225914a;
        int i12 = a0Var.f225915b;
        C4875q.v0(bArr, sink, i10, i12, i12 + iMin);
        int i13 = a0Var.f225915b + iMin;
        a0Var.f225915b = i13;
        this.f226051b -= (long) iMin;
        if (i13 == a0Var.f225916c) {
            this.f226050a = a0Var.b();
            b0.d(a0Var);
        }
        return iMin;
    }
}
