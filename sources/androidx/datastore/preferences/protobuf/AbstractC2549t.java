package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.a1;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2549t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112943f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f112944g = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f112945h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2551u f112949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112950e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    public static final class b extends AbstractC2549t {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f112951i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f112952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f112953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f112954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f112955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f112956n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f112957o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f112958p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f112959q;

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            this.f112959q = Integer.MAX_VALUE;
            this.f112951i = bArr;
            this.f112953k = i11 + i10;
            this.f112955m = i10;
            this.f112956n = i10;
            this.f112952j = z10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T D(int i10, InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            T tO = interfaceC2560y0.o(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void E(int i10, MessageLite.Builder builder, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            builder.mergeFrom(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T H(InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            T tO = interfaceC2560y0.o(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void I(MessageLite.Builder builder, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            builder.mergeFrom(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte J() throws IOException {
            int i10 = this.f112955m;
            if (i10 == this.f112953k) {
                throw InvalidProtocolBufferException.q();
            }
            byte[] bArr = this.f112951i;
            this.f112955m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] K(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f112953k;
                int i12 = this.f112955m;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f112955m = i13;
                    return Arrays.copyOfRange(this.f112951i, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.q();
            }
            if (i10 == 0) {
                return V.f112722d;
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int L() throws IOException {
            int i10 = this.f112955m;
            if (this.f112953k - i10 < 4) {
                throw InvalidProtocolBufferException.q();
            }
            byte[] bArr = this.f112951i;
            this.f112955m = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long M() throws IOException {
            int i10 = this.f112955m;
            if (this.f112953k - i10 < 8) {
                throw InvalidProtocolBufferException.q();
            }
            byte[] bArr = this.f112951i;
            this.f112955m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int N() throws IOException {
            int i10;
            int i11 = this.f112955m;
            int i12 = this.f112953k;
            if (i12 != i11) {
                byte[] bArr = this.f112951i;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f112955m = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << Ascii.SO) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << Ascii.NAK);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << Ascii.FS)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f112955m = i14;
                    return i10;
                }
            }
            return (int) R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long Q() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f112955m;
            int i11 = this.f112953k;
            if (i11 != i10) {
                byte[] bArr = this.f112951i;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f112955m = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f112955m = i13;
                    return j10;
                }
            }
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int U() throws IOException {
            return AbstractC2549t.b(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long V() throws IOException {
            return AbstractC2549t.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String W() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f112953k;
                int i11 = this.f112955m;
                if (iN <= i10 - i11) {
                    String str = new String(this.f112951i, i11, iN, V.f112719a);
                    this.f112955m += iN;
                    return str;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String X() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f112953k;
                int i11 = this.f112955m;
                if (iN <= i10 - i11) {
                    String strH = Utf8.h(this.f112951i, i11, iN);
                    this.f112955m += iN;
                    return strH;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Y() throws IOException {
            if (i()) {
                this.f112957o = 0;
                return 0;
            }
            int iN = N();
            this.f112957o = iN;
            if ((iN >>> 3) != 0) {
                return iN;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f112957o != i10) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        @Deprecated
        public void b0(int i10, MessageLite.Builder builder) throws IOException {
            E(i10, builder, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void c0() {
            this.f112956n = this.f112955m;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void e(boolean z10) {
            this.f112958p = z10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int f() {
            int i10 = this.f112959q;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int g() {
            return this.f112957o;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean g0(int i10) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                n0();
                return true;
            }
            if (i11 == 1) {
                k0(8);
                return true;
            }
            if (i11 == 2) {
                k0(N());
                return true;
            }
            if (i11 == 3) {
                i0();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            k0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int h() {
            return this.f112955m - this.f112956n;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                long jQ = Q();
                codedOutputStream.h2(i10);
                codedOutputStream.i2(jQ);
                return true;
            }
            if (i11 == 1) {
                long jM = M();
                codedOutputStream.h2(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (i11 == 2) {
                ByteString byteStringX = x();
                codedOutputStream.h2(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (i11 == 3) {
                codedOutputStream.h2(i10);
                j0(codedOutputStream);
                int i12 = ((i10 >>> 3) << 3) | 4;
                a(i12);
                codedOutputStream.h2(i12);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            int iL = L();
            codedOutputStream.h2(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean i() throws IOException {
            return this.f112955m == this.f112953k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void k0(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f112953k;
                int i12 = this.f112955m;
                if (i10 <= i11 - i12) {
                    this.f112955m = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.q();
            }
            throw InvalidProtocolBufferException.l();
        }

        public final void m0() {
            int i10 = this.f112953k + this.f112954l;
            this.f112953k = i10;
            int i11 = i10 - this.f112956n;
            int i12 = this.f112959q;
            if (i11 <= i12) {
                this.f112954l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f112954l = i13;
            this.f112953k = i10 - i13;
        }

        public final void n0() throws IOException {
            if (this.f112953k - this.f112955m >= 10) {
                o0();
            } else {
                p0();
            }
        }

        public final void o0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f112951i;
                int i11 = this.f112955m;
                this.f112955m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        public final void p0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void s(int i10) {
            this.f112959q = i10;
            m0();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int iH = h() + i10;
            int i11 = this.f112959q;
            if (iH > i11) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112959q = iH;
            m0();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteBuffer w() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f112953k;
                int i11 = this.f112955m;
                if (iN <= i10 - i11) {
                    ByteBuffer byteBufferWrap = (this.f112952j || !this.f112958p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f112951i, i11, i11 + iN)) : ByteBuffer.wrap(this.f112951i, i11, iN).slice();
                    this.f112955m += iN;
                    return byteBufferWrap;
                }
            }
            if (iN == 0) {
                return V.f112723e;
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteString x() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f112953k;
                int i11 = this.f112955m;
                if (iN <= i10 - i11) {
                    ByteString byteStringI0 = (this.f112952j && this.f112958p) ? ByteString.i0(this.f112951i, i11, iN) : ByteString.y(this.f112951i, i11, iN);
                    this.f112955m += iN;
                    return byteStringI0;
                }
            }
            return iN == 0 ? ByteString.f112510e : ByteString.h0(K(iN));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int z() throws IOException {
            return N();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static final class c extends AbstractC2549t {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Iterable<ByteBuffer> f112960i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Iterator<ByteBuffer> f112961j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ByteBuffer f112962k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f112963l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f112964m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f112965n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f112966o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f112967p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f112968q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f112969r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f112970s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f112971t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f112972u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f112973v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f112974w;

        public c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            this.f112967p = Integer.MAX_VALUE;
            this.f112965n = i10;
            this.f112960i = iterable;
            this.f112961j = iterable.iterator();
            this.f112963l = z10;
            this.f112969r = 0;
            this.f112970s = 0;
            if (i10 != 0) {
                t0();
                return;
            }
            this.f112962k = V.f112723e;
            this.f112971t = 0L;
            this.f112972u = 0L;
            this.f112974w = 0L;
            this.f112973v = 0L;
        }

        private void p0() {
            int i10 = this.f112965n + this.f112966o;
            this.f112965n = i10;
            int i11 = i10 - this.f112970s;
            int i12 = this.f112967p;
            if (i11 <= i12) {
                this.f112966o = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f112966o = i13;
            this.f112965n = i10 - i13;
        }

        private void r0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T D(int i10, InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            T tO = interfaceC2560y0.o(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void E(int i10, MessageLite.Builder builder, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            builder.mergeFrom(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T H(InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            T tO = interfaceC2560y0.o(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void I(MessageLite.Builder builder, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            builder.mergeFrom(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte J() throws IOException {
            if (m0() == 0) {
                n0();
            }
            long j10 = this.f112971t;
            this.f112971t = 1 + j10;
            return a1.y(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] K(int i10) throws IOException {
            if (i10 >= 0) {
                long j10 = i10;
                if (j10 <= m0()) {
                    byte[] bArr = new byte[i10];
                    a1.n(this.f112971t, bArr, 0L, j10);
                    this.f112971t += j10;
                    return bArr;
                }
            }
            if (i10 >= 0 && i10 <= q0()) {
                byte[] bArr2 = new byte[i10];
                o0(bArr2, 0, i10);
                return bArr2;
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.q();
            }
            if (i10 == 0) {
                return V.f112722d;
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int L() throws IOException {
            if (m0() < 4) {
                return (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24);
            }
            long j10 = this.f112971t;
            this.f112971t = 4 + j10;
            int iY = a1.y(j10) & 255;
            a1.e eVar = a1.f112800f;
            return ((eVar.f(j10 + 3) & 255) << 24) | iY | ((eVar.f(1 + j10) & 255) << 8) | ((eVar.f(2 + j10) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long M() throws IOException {
            char c10;
            long J10;
            byte bJ;
            if (m0() >= 8) {
                long j10 = this.f112971t;
                this.f112971t = 8 + j10;
                long jY = ((long) a1.y(j10)) & 255;
                a1.e eVar = a1.f112800f;
                c10 = '8';
                J10 = jY | ((((long) eVar.f(j10 + 1)) & 255) << 8) | ((((long) eVar.f(j10 + 2)) & 255) << 16) | ((((long) eVar.f(3 + j10)) & 255) << 24) | ((((long) eVar.f(4 + j10)) & 255) << 32) | ((((long) eVar.f(5 + j10)) & 255) << 40) | ((((long) eVar.f(6 + j10)) & 255) << 48);
                bJ = eVar.f(j10 + 7);
            } else {
                c10 = '8';
                J10 = (((long) J()) & 255) | ((((long) J()) & 255) << 8) | ((((long) J()) & 255) << 16) | ((((long) J()) & 255) << 24) | ((((long) J()) & 255) << 32) | ((((long) J()) & 255) << 40) | ((((long) J()) & 255) << 48);
                bJ = J();
            }
            return J10 | ((((long) bJ) & 255) << c10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int N() throws IOException {
            int i10;
            long j10 = this.f112971t;
            if (this.f112974w != j10) {
                long j11 = j10 + 1;
                byte bY = a1.y(j10);
                if (bY >= 0) {
                    this.f112971t++;
                    return bY;
                }
                if (this.f112974w - this.f112971t >= 10) {
                    long j12 = 2 + j10;
                    a1.e eVar = a1.f112800f;
                    int iF = (eVar.f(j11) << 7) ^ bY;
                    if (iF < 0) {
                        i10 = iF ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iF2 = (eVar.f(j12) << Ascii.SO) ^ iF;
                        if (iF2 >= 0) {
                            i10 = iF2 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int iF3 = iF2 ^ (eVar.f(j13) << Ascii.NAK);
                            if (iF3 < 0) {
                                i10 = (-2080896) ^ iF3;
                            } else {
                                j13 = 5 + j10;
                                byte bF = eVar.f(j14);
                                int i11 = (iF3 ^ (bF << Ascii.FS)) ^ 266354560;
                                if (bF < 0) {
                                    j14 = 6 + j10;
                                    if (eVar.f(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (eVar.f(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (eVar.f(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (eVar.f(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (eVar.f(j13) >= 0) {
                                                        i10 = i11;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                i10 = i11;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.f112971t = j12;
                    return i10;
                }
            }
            return (int) R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long Q() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13 = this.f112971t;
            if (this.f112974w != j13) {
                long j14 = j13 + 1;
                byte bY = a1.y(j13);
                if (bY >= 0) {
                    this.f112971t++;
                    return bY;
                }
                if (this.f112974w - this.f112971t >= 10) {
                    long j15 = 2 + j13;
                    a1.e eVar = a1.f112800f;
                    int iF = (eVar.f(j14) << 7) ^ bY;
                    if (iF < 0) {
                        j10 = iF ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int iF2 = (eVar.f(j15) << Ascii.SO) ^ iF;
                        if (iF2 >= 0) {
                            j10 = iF2 ^ 16256;
                            j15 = j16;
                        } else {
                            long j17 = 4 + j13;
                            int iF3 = iF2 ^ (eVar.f(j16) << Ascii.NAK);
                            if (iF3 < 0) {
                                j10 = (-2080896) ^ iF3;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long jF = (((long) eVar.f(j17)) << 28) ^ ((long) iF3);
                                if (jF >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j19 = 6 + j13;
                                    long jF2 = jF ^ (((long) eVar.f(j18)) << 35);
                                    if (jF2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        jF = jF2 ^ (((long) eVar.f(j19)) << 42);
                                        if (jF >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j13;
                                            jF2 = jF ^ (((long) eVar.f(j18)) << 49);
                                            if (jF2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long jF3 = (jF2 ^ (((long) eVar.f(j19)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (eVar.f(j18) >= 0) {
                                                        j15 = j20;
                                                        j10 = jF3;
                                                    }
                                                } else {
                                                    j10 = jF3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jF2;
                                    j15 = j19;
                                }
                                j10 = j12 ^ jF;
                                j15 = j18;
                            }
                        }
                    }
                    this.f112971t = j15;
                    return j10;
                }
            }
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int U() throws IOException {
            return AbstractC2549t.b(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long V() throws IOException {
            return AbstractC2549t.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String W() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                long j11 = this.f112974w;
                long j12 = this.f112971t;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[iN];
                    a1.n(j12, bArr, 0L, j10);
                    String str = new String(bArr, V.f112719a);
                    this.f112971t += j10;
                    return str;
                }
            }
            if (iN > 0 && iN <= q0()) {
                byte[] bArr2 = new byte[iN];
                o0(bArr2, 0, iN);
                return new String(bArr2, V.f112719a);
            }
            if (iN == 0) {
                return "";
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String X() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                long j11 = this.f112974w;
                long j12 = this.f112971t;
                if (j10 <= j11 - j12) {
                    String strG = Utf8.g(this.f112962k, (int) (j12 - this.f112972u), iN);
                    this.f112971t += j10;
                    return strG;
                }
            }
            if (iN >= 0 && iN <= q0()) {
                byte[] bArr = new byte[iN];
                o0(bArr, 0, iN);
                return Utf8.h(bArr, 0, iN);
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Y() throws IOException {
            if (i()) {
                this.f112968q = 0;
                return 0;
            }
            int iN = N();
            this.f112968q = iN;
            if ((iN >>> 3) != 0) {
                return iN;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f112968q != i10) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        @Deprecated
        public void b0(int i10, MessageLite.Builder builder) throws IOException {
            E(i10, builder, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void c0() {
            this.f112970s = (int) ((((long) this.f112969r) + this.f112971t) - this.f112972u);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void e(boolean z10) {
            this.f112964m = z10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int f() {
            int i10 = this.f112967p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int g() {
            return this.f112968q;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean g0(int i10) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                r0();
                return true;
            }
            if (i11 == 1) {
                k0(8);
                return true;
            }
            if (i11 == 2) {
                k0(N());
                return true;
            }
            if (i11 == 3) {
                i0();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            k0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int h() {
            return (int) ((((long) (this.f112969r - this.f112970s)) + this.f112971t) - this.f112972u);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                long jQ = Q();
                codedOutputStream.h2(i10);
                codedOutputStream.i2(jQ);
                return true;
            }
            if (i11 == 1) {
                long jM = M();
                codedOutputStream.h2(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (i11 == 2) {
                ByteString byteStringX = x();
                codedOutputStream.h2(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (i11 == 3) {
                codedOutputStream.h2(i10);
                j0(codedOutputStream);
                int i12 = ((i10 >>> 3) << 3) | 4;
                a(i12);
                codedOutputStream.h2(i12);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            int iL = L();
            codedOutputStream.h2(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean i() throws IOException {
            return (((long) this.f112969r) + this.f112971t) - this.f112972u == ((long) this.f112965n);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void k0(int i10) throws IOException {
            if (i10 < 0 || i10 > (((long) (this.f112965n - this.f112969r)) - this.f112971t) + this.f112972u) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.q();
                }
                throw InvalidProtocolBufferException.l();
            }
            while (i10 > 0) {
                if (m0() == 0) {
                    n0();
                }
                int iMin = Math.min(i10, (int) m0());
                i10 -= iMin;
                this.f112971t += (long) iMin;
            }
        }

        public final long m0() {
            return this.f112974w - this.f112971t;
        }

        public final void n0() throws InvalidProtocolBufferException {
            if (!this.f112961j.hasNext()) {
                throw InvalidProtocolBufferException.q();
            }
            t0();
        }

        public final void o0(byte[] bArr, int i10, int i11) throws IOException {
            if (i11 < 0 || i11 > q0()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.q();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.l();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (m0() == 0) {
                    n0();
                }
                int iMin = Math.min(i12, (int) m0());
                long j10 = iMin;
                a1.n(this.f112971t, bArr, (i11 - i12) + i10, j10);
                i12 -= iMin;
                this.f112971t += j10;
            }
        }

        public final int q0() {
            return (int) ((((long) (this.f112965n - this.f112969r)) - this.f112971t) + this.f112972u);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void s(int i10) {
            this.f112967p = i10;
            p0();
        }

        public final ByteBuffer s0(int i10, int i11) throws IOException {
            int iPosition = this.f112962k.position();
            int iLimit = this.f112962k.limit();
            try {
                try {
                    this.f112962k.position(i10);
                    this.f112962k.limit(i11);
                    return this.f112962k.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.q();
                }
            } finally {
                this.f112962k.position(iPosition);
                this.f112962k.limit(iLimit);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int iH = h() + i10;
            int i11 = this.f112967p;
            if (iH > i11) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112967p = iH;
            p0();
            return i11;
        }

        public final void t0() {
            ByteBuffer next = this.f112961j.next();
            this.f112962k = next;
            this.f112969r += (int) (this.f112971t - this.f112972u);
            long jPosition = next.position();
            this.f112971t = jPosition;
            this.f112972u = jPosition;
            this.f112974w = this.f112962k.limit();
            long jI = a1.i(this.f112962k);
            this.f112973v = jI;
            this.f112971t += jI;
            this.f112972u += jI;
            this.f112974w += jI;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteBuffer w() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                if (j10 <= m0()) {
                    if (this.f112963l || !this.f112964m) {
                        byte[] bArr = new byte[iN];
                        a1.n(this.f112971t, bArr, 0L, j10);
                        this.f112971t += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.f112971t + j10;
                    this.f112971t = j11;
                    long j12 = this.f112973v;
                    return s0((int) ((j11 - j12) - j10), (int) (j11 - j12));
                }
            }
            if (iN > 0 && iN <= q0()) {
                byte[] bArr2 = new byte[iN];
                o0(bArr2, 0, iN);
                return ByteBuffer.wrap(bArr2);
            }
            if (iN == 0) {
                return V.f112723e;
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteString x() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                long j11 = this.f112974w;
                long j12 = this.f112971t;
                if (j10 <= j11 - j12) {
                    if (this.f112963l && this.f112964m) {
                        int i10 = (int) (j12 - this.f112973v);
                        ByteString byteStringG0 = ByteString.g0(s0(i10, iN + i10));
                        this.f112971t += j10;
                        return byteStringG0;
                    }
                    byte[] bArr = new byte[iN];
                    a1.n(j12, bArr, 0L, j10);
                    this.f112971t += j10;
                    return ByteString.h0(bArr);
                }
            }
            if (iN > 0 && iN <= q0()) {
                byte[] bArr2 = new byte[iN];
                o0(bArr2, 0, iN);
                return ByteString.h0(bArr2);
            }
            if (iN == 0) {
                return ByteString.f112510e;
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int z() throws IOException {
            return N();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    public static final class d extends AbstractC2549t {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final InputStream f112975i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f112976j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f112977k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f112978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f112979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f112980n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f112981o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f112982p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public a f112983q;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d$a */
        public interface a {
            void a();
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d$b */
        public class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f112984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public ByteArrayOutputStream f112985b;

            public b() {
                this.f112984a = d.this.f112979m;
            }

            @Override // androidx.datastore.preferences.protobuf.AbstractC2549t.d.a
            public void a() {
                if (this.f112985b == null) {
                    this.f112985b = new ByteArrayOutputStream();
                }
                ByteArrayOutputStream byteArrayOutputStream = this.f112985b;
                d dVar = d.this;
                byte[] bArr = dVar.f112976j;
                int i10 = this.f112984a;
                byteArrayOutputStream.write(bArr, i10, dVar.f112979m - i10);
                this.f112984a = 0;
            }

            public ByteBuffer b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f112985b;
                if (byteArrayOutputStream != null) {
                    d dVar = d.this;
                    byteArrayOutputStream.write(dVar.f112976j, this.f112984a, dVar.f112979m);
                    return ByteBuffer.wrap(this.f112985b.toByteArray());
                }
                d dVar2 = d.this;
                byte[] bArr = dVar2.f112976j;
                int i10 = this.f112984a;
                return ByteBuffer.wrap(bArr, i10, dVar2.f112979m - i10);
            }
        }

        public d(InputStream inputStream, int i10) {
            this.f112982p = Integer.MAX_VALUE;
            this.f112983q = null;
            V.e(inputStream, "input");
            this.f112975i = inputStream;
            this.f112976j = new byte[i10];
            this.f112977k = 0;
            this.f112979m = 0;
            this.f112981o = 0;
        }

        private void s0() {
            int i10 = this.f112977k + this.f112978l;
            this.f112977k = i10;
            int i11 = this.f112981o + i10;
            int i12 = this.f112982p;
            if (i11 <= i12) {
                this.f112978l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f112978l = i13;
            this.f112977k = i10 - i13;
        }

        private void v0() throws IOException {
            if (this.f112977k - this.f112979m >= 10) {
                w0();
            } else {
                x0();
            }
        }

        private void w0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f112976j;
                int i11 = this.f112979m;
                this.f112979m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        private void x0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T D(int i10, InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            T tO = interfaceC2560y0.o(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void E(int i10, MessageLite.Builder builder, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            builder.mergeFrom(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T H(InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            T tO = interfaceC2560y0.o(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void I(MessageLite.Builder builder, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            builder.mergeFrom(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte J() throws IOException {
            if (this.f112979m == this.f112977k) {
                t0(1);
            }
            byte[] bArr = this.f112976j;
            int i10 = this.f112979m;
            this.f112979m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] K(int i10) throws IOException {
            int i11 = this.f112979m;
            if (i10 > this.f112977k - i11 || i10 <= 0) {
                return p0(i10, false);
            }
            int i12 = i10 + i11;
            this.f112979m = i12;
            return Arrays.copyOfRange(this.f112976j, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int L() throws IOException {
            int i10 = this.f112979m;
            if (this.f112977k - i10 < 4) {
                t0(4);
                i10 = this.f112979m;
            }
            byte[] bArr = this.f112976j;
            this.f112979m = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long M() throws IOException {
            int i10 = this.f112979m;
            if (this.f112977k - i10 < 8) {
                t0(8);
                i10 = this.f112979m;
            }
            byte[] bArr = this.f112976j;
            this.f112979m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int N() throws IOException {
            int i10;
            int i11 = this.f112979m;
            int i12 = this.f112977k;
            if (i12 != i11) {
                byte[] bArr = this.f112976j;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f112979m = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << Ascii.SO) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << Ascii.NAK);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << Ascii.FS)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f112979m = i14;
                    return i10;
                }
            }
            return (int) R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long Q() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f112979m;
            int i11 = this.f112977k;
            if (i11 != i10) {
                byte[] bArr = this.f112976j;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f112979m = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f112979m = i13;
                    return j10;
                }
            }
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int U() throws IOException {
            return AbstractC2549t.b(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long V() throws IOException {
            return AbstractC2549t.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String W() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f112977k;
                int i11 = this.f112979m;
                if (iN <= i10 - i11) {
                    String str = new String(this.f112976j, i11, iN, V.f112719a);
                    this.f112979m += iN;
                    return str;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN > this.f112977k) {
                return new String(p0(iN, false), V.f112719a);
            }
            t0(iN);
            String str2 = new String(this.f112976j, this.f112979m, iN, V.f112719a);
            this.f112979m += iN;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String X() throws IOException {
            byte[] bArrP0;
            int iN = N();
            int i10 = this.f112979m;
            int i11 = this.f112977k;
            if (iN <= i11 - i10 && iN > 0) {
                bArrP0 = this.f112976j;
                this.f112979m = i10 + iN;
            } else {
                if (iN == 0) {
                    return "";
                }
                i10 = 0;
                if (iN <= i11) {
                    t0(iN);
                    bArrP0 = this.f112976j;
                    this.f112979m = iN;
                } else {
                    bArrP0 = p0(iN, false);
                }
            }
            return Utf8.h(bArrP0, i10, iN);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Y() throws IOException {
            if (i()) {
                this.f112980n = 0;
                return 0;
            }
            int iN = N();
            this.f112980n = iN;
            if ((iN >>> 3) != 0) {
                return iN;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f112980n != i10) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        @Deprecated
        public void b0(int i10, MessageLite.Builder builder) throws IOException {
            E(i10, builder, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void c0() {
            this.f112981o = -this.f112979m;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void e(boolean z10) {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int f() {
            int i10 = this.f112982p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f112981o + this.f112979m);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int g() {
            return this.f112980n;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean g0(int i10) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                v0();
                return true;
            }
            if (i11 == 1) {
                k0(8);
                return true;
            }
            if (i11 == 2) {
                k0(N());
                return true;
            }
            if (i11 == 3) {
                i0();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            k0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int h() {
            return this.f112981o + this.f112979m;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                long jQ = Q();
                codedOutputStream.h2(i10);
                codedOutputStream.i2(jQ);
                return true;
            }
            if (i11 == 1) {
                long jM = M();
                codedOutputStream.h2(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (i11 == 2) {
                ByteString byteStringX = x();
                codedOutputStream.h2(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (i11 == 3) {
                codedOutputStream.h2(i10);
                j0(codedOutputStream);
                int i12 = ((i10 >>> 3) << 3) | 4;
                a(i12);
                codedOutputStream.h2(i12);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            int iL = L();
            codedOutputStream.h2(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean i() throws IOException {
            return this.f112979m == this.f112977k && !y0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void k0(int i10) throws IOException {
            int i11 = this.f112977k;
            int i12 = this.f112979m;
            if (i10 > i11 - i12 || i10 < 0) {
                u0(i10);
            } else {
                this.f112979m = i12 + i10;
            }
        }

        public final ByteString o0(int i10) throws IOException {
            byte[] bArrQ0 = q0(i10);
            if (bArrQ0 != null) {
                return ByteString.x(bArrQ0);
            }
            int i11 = this.f112979m;
            int i12 = this.f112977k;
            int length = i12 - i11;
            this.f112981o += i12;
            this.f112979m = 0;
            this.f112977k = 0;
            List<byte[]> listR0 = r0(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f112976j, i11, bArr, 0, length);
            ArrayList arrayList = (ArrayList) listR0;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.h0(bArr);
        }

        public final byte[] p0(int i10, boolean z10) throws IOException {
            byte[] bArrQ0 = q0(i10);
            if (bArrQ0 != null) {
                return z10 ? (byte[]) bArrQ0.clone() : bArrQ0;
            }
            int i11 = this.f112979m;
            int i12 = this.f112977k;
            int length = i12 - i11;
            this.f112981o += i12;
            this.f112979m = 0;
            this.f112977k = 0;
            List<byte[]> listR0 = r0(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f112976j, i11, bArr, 0, length);
            ArrayList arrayList = (ArrayList) listR0;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] q0(int i10) throws IOException {
            if (i10 == 0) {
                return V.f112722d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f112981o;
            int i12 = this.f112979m;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f112948c > 0) {
                throw InvalidProtocolBufferException.p();
            }
            int i14 = this.f112982p;
            if (i13 > i14) {
                k0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.q();
            }
            int i15 = this.f112977k - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f112975i.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f112976j, this.f112979m, bArr, 0, i15);
            this.f112981o += this.f112977k;
            this.f112979m = 0;
            this.f112977k = 0;
            while (i15 < i10) {
                int i17 = this.f112975i.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.q();
                }
                this.f112981o += i17;
                i15 += i17;
            }
            return bArr;
        }

        public final List<byte[]> r0(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f112975i.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.q();
                    }
                    this.f112981o += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void s(int i10) {
            this.f112982p = i10;
            s0();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f112981o + this.f112979m + i10;
            int i12 = this.f112982p;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112982p = i11;
            s0();
            return i12;
        }

        public final void t0(int i10) throws IOException {
            if (y0(i10)) {
                return;
            }
            if (i10 <= (this.f112948c - this.f112981o) - this.f112979m) {
                throw InvalidProtocolBufferException.q();
            }
            throw InvalidProtocolBufferException.p();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean u() throws IOException {
            return Q() != 0;
        }

        public final void u0(int i10) throws IOException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f112981o;
            int i12 = this.f112979m;
            int i13 = i11 + i12 + i10;
            int i14 = this.f112982p;
            if (i13 > i14) {
                k0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.q();
            }
            int i15 = 0;
            if (this.f112983q == null) {
                this.f112981o = i11 + i12;
                int i16 = this.f112977k - i12;
                this.f112977k = 0;
                this.f112979m = 0;
                i15 = i16;
                while (i15 < i10) {
                    try {
                        long j10 = i10 - i15;
                        long jSkip = this.f112975i.skip(j10);
                        if (jSkip < 0 || jSkip > j10) {
                            throw new IllegalStateException(this.f112975i.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i15 += (int) jSkip;
                        }
                    } finally {
                        this.f112981o += i15;
                        s0();
                    }
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i17 = this.f112977k;
            int i18 = i17 - this.f112979m;
            this.f112979m = i17;
            t0(1);
            while (true) {
                int i19 = i10 - i18;
                int i20 = this.f112977k;
                if (i19 <= i20) {
                    this.f112979m = i19;
                    return;
                } else {
                    i18 += i20;
                    this.f112979m = i20;
                    t0(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] v() throws IOException {
            int iN = N();
            int i10 = this.f112977k;
            int i11 = this.f112979m;
            if (iN > i10 - i11 || iN <= 0) {
                return p0(iN, false);
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f112976j, i11, i11 + iN);
            this.f112979m += iN;
            return bArrCopyOfRange;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteBuffer w() throws IOException {
            int iN = N();
            int i10 = this.f112977k;
            int i11 = this.f112979m;
            if (iN > i10 - i11 || iN <= 0) {
                return iN == 0 ? V.f112723e : ByteBuffer.wrap(p0(iN, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f112976j, i11, i11 + iN));
            this.f112979m += iN;
            return byteBufferWrap;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteString x() throws IOException {
            int iN = N();
            int i10 = this.f112977k;
            int i11 = this.f112979m;
            if (iN > i10 - i11 || iN <= 0) {
                return iN == 0 ? ByteString.f112510e : o0(iN);
            }
            ByteString byteStringY = ByteString.y(this.f112976j, i11, iN);
            this.f112979m += iN;
            return byteStringY;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        public final boolean y0(int i10) throws IOException {
            int i11 = this.f112979m;
            if (i11 + i10 <= this.f112977k) {
                throw new IllegalStateException(androidx.collection.N0.a("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
            int i12 = this.f112948c;
            int i13 = this.f112981o;
            if (i10 > (i12 - i13) - i11 || i13 + i11 + i10 > this.f112982p) {
                return false;
            }
            a aVar = this.f112983q;
            if (aVar != null) {
                aVar.a();
            }
            int i14 = this.f112979m;
            if (i14 > 0) {
                int i15 = this.f112977k;
                if (i15 > i14) {
                    byte[] bArr = this.f112976j;
                    System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                }
                this.f112981o += i14;
                this.f112977k -= i14;
                this.f112979m = 0;
            }
            InputStream inputStream = this.f112975i;
            byte[] bArr2 = this.f112976j;
            int i16 = this.f112977k;
            int i17 = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f112948c - this.f112981o) - i16));
            if (i17 == 0 || i17 < -1 || i17 > this.f112976j.length) {
                throw new IllegalStateException(this.f112975i.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f112977k += i17;
            s0();
            if (this.f112977k >= i10) {
                return true;
            }
            return y0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int z() throws IOException {
            return N();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$e */
    public static final class e extends AbstractC2549t {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ByteBuffer f112987i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f112988j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f112989k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f112990l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f112991m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f112992n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f112993o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f112994p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f112995q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f112996r;

        public e(ByteBuffer byteBuffer, boolean z10) {
            this.f112996r = Integer.MAX_VALUE;
            this.f112987i = byteBuffer;
            long jI = a1.i(byteBuffer);
            this.f112989k = jI;
            this.f112990l = ((long) byteBuffer.limit()) + jI;
            long jPosition = jI + ((long) byteBuffer.position());
            this.f112991m = jPosition;
            this.f112992n = jPosition;
            this.f112988j = z10;
        }

        public static boolean n0() {
            return a1.T();
        }

        private void o0() {
            long j10 = this.f112990l + ((long) this.f112993o);
            this.f112990l = j10;
            int i10 = (int) (j10 - this.f112992n);
            int i11 = this.f112996r;
            if (i10 <= i11) {
                this.f112993o = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f112993o = i12;
            this.f112990l = j10 - ((long) i12);
        }

        private int p0() {
            return (int) (this.f112990l - this.f112991m);
        }

        private void q0() throws IOException {
            if (p0() >= 10) {
                r0();
            } else {
                s0();
            }
        }

        private void r0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f112991m;
                this.f112991m = 1 + j10;
                if (a1.y(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        private void s0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T D(int i10, InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            T tO = interfaceC2560y0.o(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void E(int i10, MessageLite.Builder builder, H h10) throws IOException {
            int i11 = this.f112946a;
            if (i11 >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            this.f112946a = i11 + 1;
            builder.mergeFrom(this, h10);
            a((i10 << 3) | 4);
            this.f112946a--;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public <T extends MessageLite> T H(InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            T tO = interfaceC2560y0.o(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
            return tO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void I(MessageLite.Builder builder, H h10) throws IOException {
            int iN = N();
            if (this.f112946a >= this.f112947b) {
                throw InvalidProtocolBufferException.n();
            }
            int iT = t(iN);
            this.f112946a++;
            builder.mergeFrom(this, h10);
            a(0);
            this.f112946a--;
            s(iT);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte J() throws IOException {
            long j10 = this.f112991m;
            if (j10 == this.f112990l) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112991m = 1 + j10;
            return a1.y(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] K(int i10) throws IOException {
            if (i10 < 0 || i10 > p0()) {
                if (i10 > 0) {
                    throw InvalidProtocolBufferException.q();
                }
                if (i10 == 0) {
                    return V.f112722d;
                }
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = new byte[i10];
            long j10 = this.f112991m;
            long j11 = i10;
            t0(j10, j10 + j11).get(bArr);
            this.f112991m += j11;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int L() throws IOException {
            long j10 = this.f112991m;
            if (this.f112990l - j10 < 4) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112991m = 4 + j10;
            int iY = a1.y(j10) & 255;
            a1.e eVar = a1.f112800f;
            return ((eVar.f(j10 + 3) & 255) << 24) | iY | ((eVar.f(1 + j10) & 255) << 8) | ((eVar.f(2 + j10) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long M() throws IOException {
            long j10 = this.f112991m;
            if (this.f112990l - j10 < 8) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112991m = 8 + j10;
            long jY = ((long) a1.y(j10)) & 255;
            a1.e eVar = a1.f112800f;
            return ((((long) eVar.f(j10 + 7)) & 255) << 56) | jY | ((((long) eVar.f(1 + j10)) & 255) << 8) | ((((long) eVar.f(2 + j10)) & 255) << 16) | ((((long) eVar.f(3 + j10)) & 255) << 24) | ((((long) eVar.f(4 + j10)) & 255) << 32) | ((((long) eVar.f(5 + j10)) & 255) << 40) | ((((long) eVar.f(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        
            if (r9.f(r3) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f112991m
                long r2 = r10.f112990l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L90
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.datastore.preferences.protobuf.a1.y(r0)
                if (r4 < 0) goto L16
                r10.f112991m = r2
                return r4
            L16:
                long r5 = r10.f112990l
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L90
            L21:
                r5 = 2
                long r5 = r5 + r0
                androidx.datastore.preferences.protobuf.a1$e r9 = androidx.datastore.preferences.protobuf.a1.f112800f
                byte r2 = r9.f(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L9a
            L33:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = r9.f(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L43
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r5 = r3
                goto L9a
            L43:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = r9.f(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L54
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L9a
            L54:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = r9.f(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L98
                r5 = 6
                long r5 = r5 + r0
                byte r3 = r9.f(r3)
                if (r3 >= 0) goto L96
                r3 = 7
                long r3 = r3 + r0
                byte r5 = r9.f(r5)
                if (r5 >= 0) goto L98
                r5 = 8
                long r5 = r5 + r0
                byte r3 = r9.f(r3)
                if (r3 >= 0) goto L96
                long r3 = r0 + r7
                byte r5 = r9.f(r5)
                if (r5 >= 0) goto L98
                r5 = 10
                long r5 = r5 + r0
                byte r0 = r9.f(r3)
                if (r0 >= 0) goto L96
            L90:
                long r0 = r10.R()
                int r0 = (int) r0
                return r0
            L96:
                r0 = r2
                goto L9a
            L98:
                r0 = r2
                goto L41
            L9a:
                r10.f112991m = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC2549t.e.N():int");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long Q() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f112991m;
            if (this.f112990l != j13) {
                long j14 = 1 + j13;
                byte bY = a1.y(j13);
                if (bY >= 0) {
                    this.f112991m = j14;
                    return bY;
                }
                if (this.f112990l - j14 >= 9) {
                    long j15 = 2 + j13;
                    a1.e eVar = a1.f112800f;
                    int iF = (eVar.f(j14) << 7) ^ bY;
                    if (iF >= 0) {
                        long j16 = 3 + j13;
                        int iF2 = iF ^ (eVar.f(j15) << Ascii.SO);
                        if (iF2 >= 0) {
                            j10 = iF2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iF3 = iF2 ^ (eVar.f(j16) << Ascii.NAK);
                            if (iF3 < 0) {
                                i10 = (-2080896) ^ iF3;
                            } else {
                                long j17 = 5 + j13;
                                long jF = ((long) iF3) ^ (((long) eVar.f(j15)) << 28);
                                if (jF >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jF2 = jF ^ (((long) eVar.f(j17)) << 35);
                                    if (jF2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jF = jF2 ^ (((long) eVar.f(j18)) << 42);
                                        if (jF >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jF2 = jF ^ (((long) eVar.f(j17)) << 49);
                                            if (jF2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = 9 + j13;
                                                long jF3 = (jF2 ^ (((long) eVar.f(j18)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (eVar.f(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jF3;
                                                    }
                                                } else {
                                                    j10 = jF3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jF2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jF;
                                j15 = j17;
                            }
                        }
                        this.f112991m = j15;
                        return j10;
                    }
                    i10 = iF ^ (-128);
                    j10 = i10;
                    this.f112991m = j15;
                    return j10;
                }
            }
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int U() throws IOException {
            return AbstractC2549t.b(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long V() throws IOException {
            return AbstractC2549t.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String W() throws IOException {
            int iN = N();
            if (iN <= 0 || iN > p0()) {
                if (iN == 0) {
                    return "";
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.q();
            }
            byte[] bArr = new byte[iN];
            long j10 = iN;
            a1.n(this.f112991m, bArr, 0L, j10);
            String str = new String(bArr, V.f112719a);
            this.f112991m += j10;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public String X() throws IOException {
            int iN = N();
            if (iN > 0 && iN <= p0()) {
                String strG = Utf8.g(this.f112987i, (int) (this.f112991m - this.f112989k), iN);
                this.f112991m += (long) iN;
                return strG;
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Y() throws IOException {
            if (i()) {
                this.f112994p = 0;
                return 0;
            }
            int iN = N();
            this.f112994p = iN;
            if ((iN >>> 3) != 0) {
                return iN;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f112994p != i10) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        @Deprecated
        public void b0(int i10, MessageLite.Builder builder) throws IOException {
            E(i10, builder, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void c0() {
            this.f112992n = this.f112991m;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void e(boolean z10) {
            this.f112995q = z10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int f() {
            int i10 = this.f112996r;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int g() {
            return this.f112994p;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean g0(int i10) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                q0();
                return true;
            }
            if (i11 == 1) {
                k0(8);
                return true;
            }
            if (i11 == 2) {
                k0(N());
                return true;
            }
            if (i11 == 3) {
                i0();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            k0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int h() {
            return (int) (this.f112991m - this.f112992n);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int i11 = i10 & 7;
            if (i11 == 0) {
                long jQ = Q();
                codedOutputStream.h2(i10);
                codedOutputStream.i2(jQ);
                return true;
            }
            if (i11 == 1) {
                long jM = M();
                codedOutputStream.h2(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (i11 == 2) {
                ByteString byteStringX = x();
                codedOutputStream.h2(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (i11 == 3) {
                codedOutputStream.h2(i10);
                j0(codedOutputStream);
                int i12 = ((i10 >>> 3) << 3) | 4;
                a(i12);
                codedOutputStream.h2(i12);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            int iL = L();
            codedOutputStream.h2(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean i() throws IOException {
            return this.f112991m == this.f112990l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void k0(int i10) throws IOException {
            if (i10 >= 0 && i10 <= p0()) {
                this.f112991m += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.q();
                }
                throw InvalidProtocolBufferException.l();
            }
        }

        public final int m0(long j10) {
            return (int) (j10 - this.f112989k);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public void s(int i10) {
            this.f112996r = i10;
            o0();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int iH = h() + i10;
            int i11 = this.f112996r;
            if (iH > i11) {
                throw InvalidProtocolBufferException.q();
            }
            this.f112996r = iH;
            o0();
            return i11;
        }

        public final ByteBuffer t0(long j10, long j11) throws IOException {
            int iPosition = this.f112987i.position();
            int iLimit = this.f112987i.limit();
            try {
                try {
                    this.f112987i.position((int) (j10 - this.f112989k));
                    this.f112987i.limit((int) (j11 - this.f112989k));
                    return this.f112987i.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.q();
                }
            } finally {
                this.f112987i.position(iPosition);
                this.f112987i.limit(iLimit);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteBuffer w() throws IOException {
            int iN = N();
            if (iN <= 0 || iN > p0()) {
                if (iN == 0) {
                    return V.f112723e;
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.q();
            }
            if (this.f112988j || !this.f112995q) {
                byte[] bArr = new byte[iN];
                long j10 = iN;
                a1.n(this.f112991m, bArr, 0L, j10);
                this.f112991m += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.f112991m;
            long j12 = iN;
            ByteBuffer byteBufferT0 = t0(j11, j11 + j12);
            this.f112991m += j12;
            return byteBufferT0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public ByteString x() throws IOException {
            int iN = N();
            if (iN <= 0 || iN > p0()) {
                if (iN == 0) {
                    return ByteString.f112510e;
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.q();
            }
            if (this.f112988j && this.f112995q) {
                long j10 = this.f112991m;
                long j11 = iN;
                ByteBuffer byteBufferT0 = t0(j10, j10 + j11);
                this.f112991m += j11;
                return ByteString.g0(byteBufferT0);
            }
            byte[] bArr = new byte[iN];
            long j12 = iN;
            a1.n(this.f112991m, bArr, 0L, j12);
            this.f112991m += j12;
            return ByteString.h0(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2549t
        public int z() throws IOException {
            return N();
        }
    }

    public static int O(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.q();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.q();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.k();
    }

    public static int P(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return O(i10, inputStream);
        }
        throw InvalidProtocolBufferException.q();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2549t j(InputStream inputStream) {
        return k(inputStream, 4096);
    }

    public static AbstractC2549t k(InputStream inputStream, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new d(inputStream, i10);
        }
        byte[] bArr = V.f112722d;
        return r(bArr, 0, bArr.length, false);
    }

    public static AbstractC2549t l(Iterable<ByteBuffer> iterable) {
        return !a1.T() ? k(new W(iterable), 4096) : m(iterable, false);
    }

    public static AbstractC2549t m(Iterable<ByteBuffer> iterable, boolean z10) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new c(iterable, iRemaining, z10) : k(new W(iterable), 4096);
    }

    public static AbstractC2549t n(ByteBuffer byteBuffer) {
        return o(byteBuffer, false);
    }

    public static AbstractC2549t o(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return r(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && a1.T()) {
            return new e(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return r(bArr, 0, iRemaining, true);
    }

    public static AbstractC2549t p(byte[] bArr) {
        return r(bArr, 0, bArr.length, false);
    }

    public static AbstractC2549t q(byte[] bArr, int i10, int i11) {
        return r(bArr, i10, i11, false);
    }

    public static AbstractC2549t r(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.t(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract float C() throws IOException;

    public abstract <T extends MessageLite> T D(int i10, InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException;

    public abstract void E(int i10, MessageLite.Builder builder, H h10) throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract <T extends MessageLite> T H(InterfaceC2560y0<T> interfaceC2560y0, H h10) throws IOException;

    public abstract void I(MessageLite.Builder builder, H h10) throws IOException;

    public abstract byte J() throws IOException;

    public abstract byte[] K(int i10) throws IOException;

    public abstract int L() throws IOException;

    public abstract long M() throws IOException;

    public abstract int N() throws IOException;

    public abstract long Q() throws IOException;

    public abstract long R() throws IOException;

    public abstract int S() throws IOException;

    public abstract long T() throws IOException;

    public abstract int U() throws IOException;

    public abstract long V() throws IOException;

    public abstract String W() throws IOException;

    public abstract String X() throws IOException;

    public abstract int Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract long a0() throws IOException;

    @Deprecated
    public abstract void b0(int i10, MessageLite.Builder builder) throws IOException;

    public abstract void c0();

    public final void d() {
        this.f112950e = true;
    }

    public final int d0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Recursion limit cannot be negative: ", i10));
        }
        int i11 = this.f112947b;
        this.f112947b = i10;
        return i11;
    }

    public abstract void e(boolean z10);

    public final int e0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Size limit cannot be negative: ", i10));
        }
        int i11 = this.f112948c;
        this.f112948c = i10;
        return i11;
    }

    public abstract int f();

    public final boolean f0() {
        return this.f112950e;
    }

    public abstract int g();

    public abstract boolean g0(int i10) throws IOException;

    public abstract int h();

    @Deprecated
    public abstract boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException;

    public abstract boolean i() throws IOException;

    public abstract void i0() throws IOException;

    public abstract void j0(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void k0(int i10) throws IOException;

    public final void l0() {
        this.f112950e = false;
    }

    public abstract void s(int i10);

    public abstract int t(int i10) throws InvalidProtocolBufferException;

    public abstract boolean u() throws IOException;

    public abstract byte[] v() throws IOException;

    public abstract ByteBuffer w() throws IOException;

    public abstract ByteString x() throws IOException;

    public abstract double y() throws IOException;

    public abstract int z() throws IOException;

    public AbstractC2549t() {
        this.f112947b = 100;
        this.f112948c = Integer.MAX_VALUE;
        this.f112950e = false;
    }
}
