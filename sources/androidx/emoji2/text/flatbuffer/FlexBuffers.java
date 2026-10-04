package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.H0;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes2.dex */
public class FlexBuffers {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f113363A = 26;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f113364B = 36;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p f113365C = new androidx.emoji2.text.flatbuffer.a(new byte[]{0}, 1);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ boolean f113366D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f113367a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f113368b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f113369c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f113370d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f113371e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f113372f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f113373g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f113374h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f113375i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f113376j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f113377k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f113378l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f113379m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f113380n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f113381o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f113382p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f113383q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f113384r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f113385s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f113386t = 19;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f113387u = 20;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f113388v = 21;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f113389w = 22;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f113390x = 23;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f113391y = 24;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f113392z = 25;

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class a extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f113393e = new a(FlexBuffers.f113365C, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ boolean f113394f = false;

        public a(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static a d() {
            return f113393e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f113398a.h(this.f113399b, b()));
            sb2.append('\"');
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public int b() {
            return this.f113407d;
        }

        public ByteBuffer c() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f113398a.data());
            byteBufferWrap.position(this.f113399b);
            byteBufferWrap.limit(b() + this.f113399b);
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i10) {
            return this.f113398a.get(this.f113399b + i10);
        }

        public byte[] f() {
            int iB = b();
            byte[] bArr = new byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr[i10] = this.f113398a.get(this.f113399b + i10);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            return this.f113398a.h(this.f113399b, b());
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f113395d = new b(FlexBuffers.f113365C, 0, 0);

        public b(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static b d() {
            return f113395d;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        public int c(byte[] bArr) {
            byte b10;
            byte b11;
            int i10 = this.f113399b;
            int i11 = 0;
            do {
                b10 = this.f113398a.get(i10);
                b11 = bArr[i11];
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
                if (i11 == bArr.length) {
                    return b10 - b11;
                }
            } while (b10 == b11);
            return b10 - b11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f113399b == this.f113399b && bVar.f113400c == this.f113400c;
        }

        public int hashCode() {
            return this.f113399b ^ this.f113400c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            int i10 = this.f113399b;
            while (this.f113398a.get(i10) != 0) {
                i10++;
            }
            int i11 = this.f113399b;
            return this.f113398a.h(i11, i10 - i11);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f113396a;

        public c(h hVar) {
            this.f113396a = hVar;
        }

        public b a(int i10) {
            if (i10 >= b()) {
                return b.f113395d;
            }
            h hVar = this.f113396a;
            int i11 = (i10 * hVar.f113400c) + hVar.f113399b;
            h hVar2 = this.f113396a;
            p pVar = hVar2.f113398a;
            return new b(pVar, FlexBuffers.i(pVar, i11, hVar2.f113400c), 1);
        }

        public int b() {
            return this.f113396a.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i10 = 0; i10 < this.f113396a.b(); i10++) {
                this.f113396a.d(i10).z(sb2);
                if (i10 != this.f113396a.b() - 1) {
                    sb2.append(U6.j.f68738d);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class d extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f113397f = new d(FlexBuffers.f113365C, 1, 1);

        public d(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static d g() {
            return f113397f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j, androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("{ ");
            c cVarJ = j();
            int iB = b();
            j jVarK = k();
            for (int i10 = 0; i10 < iB; i10++) {
                sb2.append('\"');
                sb2.append(cVarJ.a(i10).toString());
                sb2.append("\" : ");
                sb2.append(jVarK.d(i10).toString());
                if (i10 != iB - 1) {
                    sb2.append(U6.j.f68738d);
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public final int f(c cVar, byte[] bArr) {
            int iB = cVar.b() - 1;
            int i10 = 0;
            while (i10 <= iB) {
                int i11 = (i10 + iB) >>> 1;
                int iC = cVar.a(i11).c(bArr);
                if (iC < 0) {
                    i10 = i11 + 1;
                } else {
                    if (iC <= 0) {
                        return i11;
                    }
                    iB = i11 - 1;
                }
            }
            return -(i10 + 1);
        }

        public f h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public f i(byte[] bArr) {
            c cVarJ = j();
            int iB = cVarJ.f113396a.b();
            int iF = f(cVarJ, bArr);
            return (iF < 0 || iF >= iB) ? f.f113401f : d(iF);
        }

        public c j() {
            int i10 = this.f113399b - (this.f113400c * 3);
            p pVar = this.f113398a;
            int i11 = FlexBuffers.i(pVar, i10, this.f113400c);
            p pVar2 = this.f113398a;
            int i12 = this.f113400c;
            return new c(new h(pVar, i11, (int) FlexBuffers.o(pVar2, i10 + i12, i12), 4));
        }

        public j k() {
            return new j(this.f113398a, this.f113399b, this.f113400c);
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f113398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f113399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f113400c;

        public e(p pVar, int i10, int i11) {
            this.f113398a = pVar;
            this.f113399b = i10;
            this.f113400c = i11;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f113401f = new f(FlexBuffers.f113365C, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f113402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f113403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f113404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f113405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f113406e;

        public f(p pVar, int i10, int i11, int i12) {
            this(pVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            p pVar = this.f113402a;
            return new a(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
        }

        public boolean c() {
            return n() ? this.f113402a.get(this.f113403b) != 0 : j() != 0;
        }

        public double d() {
            int i10 = this.f113406e;
            if (i10 == 3) {
                return FlexBuffers.m(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 1) {
                return (int) FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 != 2) {
                if (i10 == 5) {
                    return Double.parseDouble(i());
                }
                if (i10 == 6) {
                    p pVar = this.f113402a;
                    return (int) FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
                }
                if (i10 == 7) {
                    p pVar2 = this.f113402a;
                    return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f113403b, this.f113404c), this.f113405d);
                }
                if (i10 == 8) {
                    p pVar3 = this.f113402a;
                    return FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f113403b, this.f113404c), this.f113405d);
                }
                if (i10 == 10) {
                    return k().b();
                }
                if (i10 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.p(this.f113402a, this.f113403b, this.f113404c);
        }

        public int e() {
            int i10 = this.f113406e;
            if (i10 == 1) {
                return (int) FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 2) {
                return (int) FlexBuffers.p(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 3) {
                return (int) FlexBuffers.m(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 5) {
                return Integer.parseInt(i());
            }
            if (i10 == 6) {
                p pVar = this.f113402a;
                return (int) FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
            }
            if (i10 == 7) {
                p pVar2 = this.f113402a;
                return (int) FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f113403b, this.f113404c), this.f113404c);
            }
            if (i10 == 8) {
                p pVar3 = this.f113402a;
                return (int) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f113403b, this.f113404c), this.f113405d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0;
            }
            return (int) FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
        }

        public b f() {
            if (!r()) {
                return b.d();
            }
            p pVar = this.f113402a;
            return new b(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
        }

        public long g() {
            int i10 = this.f113406e;
            if (i10 == 1) {
                return FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 2) {
                return FlexBuffers.p(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 3) {
                return (long) FlexBuffers.m(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i10 == 6) {
                p pVar = this.f113402a;
                return FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
            }
            if (i10 == 7) {
                p pVar2 = this.f113402a;
                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f113403b, this.f113404c), this.f113404c);
            }
            if (i10 == 8) {
                p pVar3 = this.f113402a;
                return (long) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f113403b, this.f113404c), this.f113405d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0L;
            }
            return (int) FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
        }

        public d h() {
            if (!s()) {
                return d.g();
            }
            p pVar = this.f113402a;
            return new d(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
        }

        public String i() {
            if (v()) {
                int i10 = FlexBuffers.i(this.f113402a, this.f113403b, this.f113404c);
                p pVar = this.f113402a;
                int i11 = this.f113405d;
                return this.f113402a.h(i10, (int) FlexBuffers.p(pVar, i10 - i11, i11));
            }
            if (!r()) {
                return "";
            }
            int i12 = FlexBuffers.i(this.f113402a, this.f113403b, this.f113405d);
            int i13 = i12;
            while (this.f113402a.get(i13) != 0) {
                i13++;
            }
            return this.f113402a.h(i12, i13 - i12);
        }

        public long j() {
            int i10 = this.f113406e;
            if (i10 == 2) {
                return FlexBuffers.p(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 1) {
                return FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 3) {
                return (long) FlexBuffers.m(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 == 26) {
                return (int) FlexBuffers.o(this.f113402a, this.f113403b, this.f113404c);
            }
            if (i10 == 5) {
                return Long.parseLong(i());
            }
            if (i10 == 6) {
                p pVar = this.f113402a;
                return FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
            }
            if (i10 == 7) {
                p pVar2 = this.f113402a;
                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f113403b, this.f113404c), this.f113405d);
            }
            if (i10 != 8) {
                return 0L;
            }
            p pVar3 = this.f113402a;
            return (long) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f113403b, this.f113404c), this.f113404c);
        }

        public j k() {
            if (y()) {
                p pVar = this.f113402a;
                return new j(pVar, FlexBuffers.i(pVar, this.f113403b, this.f113404c), this.f113405d);
            }
            int i10 = this.f113406e;
            if (i10 == 15) {
                p pVar2 = this.f113402a;
                return new h(pVar2, FlexBuffers.i(pVar2, this.f113403b, this.f113404c), this.f113405d, 4);
            }
            if (!FlexBuffers.k(i10)) {
                return j.c();
            }
            p pVar3 = this.f113402a;
            return new h(pVar3, FlexBuffers.i(pVar3, this.f113403b, this.f113404c), this.f113405d, this.f113406e - 10);
        }

        public int l() {
            return this.f113406e;
        }

        public boolean m() {
            return this.f113406e == 25;
        }

        public boolean n() {
            return this.f113406e == 26;
        }

        public boolean o() {
            int i10 = this.f113406e;
            return i10 == 3 || i10 == 8;
        }

        public boolean p() {
            int i10 = this.f113406e;
            return i10 == 1 || i10 == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f113406e == 4;
        }

        public boolean s() {
            return this.f113406e == 9;
        }

        public boolean t() {
            return this.f113406e == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f113406e == 5;
        }

        public boolean w() {
            return FlexBuffers.k(this.f113406e);
        }

        public boolean x() {
            int i10 = this.f113406e;
            return i10 == 2 || i10 == 7;
        }

        public boolean y() {
            int i10 = this.f113406e;
            return i10 == 10 || i10 == 9;
        }

        public StringBuilder z(StringBuilder sb2) {
            int i10 = this.f113406e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(g());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(j());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(d());
                        return sb2;
                    case 4:
                        b bVarF = f();
                        sb2.append('\"');
                        StringBuilder sbA = bVarF.a(sb2);
                        sbA.append('\"');
                        return sbA;
                    case 5:
                        sb2.append('\"');
                        sb2.append(i());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return h().a(sb2);
                    case 10:
                        return k().a(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f113406e);
                    case 25:
                        return b().a(sb2);
                    case 26:
                        sb2.append(c());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(k());
            return sb2;
        }

        public f(p pVar, int i10, int i11, int i12, int i13) {
            this.f113402a = pVar;
            this.f113403b = i10;
            this.f113404c = i11;
            this.f113405d = i12;
            this.f113406e = i13;
        }
    }

    public static abstract class g extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f113407d;

        public g(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
            this.f113407d = (int) FlexBuffers.o(pVar, i10 - i11, i11);
        }

        public int b() {
            return this.f113407d;
        }
    }

    public static class h extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h f113408g = new h(FlexBuffers.f113365C, 1, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f113409f;

        public h(p pVar, int i10, int i11, int i12) {
            super(pVar, i10, i11);
            this.f113409f = i12;
        }

        public static h f() {
            return f113408g;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j
        public f d(int i10) {
            if (i10 >= b()) {
                return f.f113401f;
            }
            return new f(this.f113398a, (i10 * this.f113400c) + this.f113399b, this.f113400c, 1, this.f113409f);
        }

        public int g() {
            return this.f113409f;
        }

        public boolean h() {
            return this == f113408g;
        }
    }

    public static class i {
        public static int a(byte b10) {
            return b10 & 255;
        }

        public static long b(int i10) {
            return ((long) i10) & ZipKt.f225990j;
        }

        public static int c(short s10) {
            return s10 & H0.f217455d;
        }
    }

    public static class j extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f113410e = new j(FlexBuffers.f113365C, 1, 1);

        public j(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static j c() {
            return f113410e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                d(i10).z(sb2);
                if (i10 != iB - 1) {
                    sb2.append(U6.j.f68738d);
                }
            }
            sb2.append(" ]");
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public int b() {
            return this.f113407d;
        }

        public f d(int i10) {
            long jB = b();
            long j10 = i10;
            if (j10 >= jB) {
                return f.f113401f;
            }
            return new f(this.f113398a, (i10 * this.f113400c) + this.f113399b, this.f113400c, this.f113398a.get((int) ((jB * ((long) this.f113400c)) + ((long) this.f113399b) + j10)) & 255);
        }

        public boolean e() {
            return this == f113410e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static int b(p pVar, int i10, int i11) {
        return (int) o(pVar, i10, i11);
    }

    public static f g(p pVar) {
        int iLimit = pVar.limit();
        byte b10 = pVar.get(iLimit - 1);
        int i10 = iLimit - 2;
        return new f(pVar, i10 - b10, b10, pVar.get(i10) & 255);
    }

    @Deprecated
    public static f h(ByteBuffer byteBuffer) {
        return g(byteBuffer.hasArray() ? new androidx.emoji2.text.flatbuffer.a(byteBuffer.array(), byteBuffer.limit()) : new androidx.emoji2.text.flatbuffer.d(byteBuffer));
    }

    public static int i(p pVar, int i10, int i11) {
        return (int) (((long) i10) - p(pVar, i10, i11));
    }

    public static boolean j(int i10) {
        return i10 <= 3 || i10 == 26;
    }

    public static boolean k(int i10) {
        return (i10 >= 11 && i10 <= 15) || i10 == 36;
    }

    public static boolean l(int i10) {
        return (i10 >= 1 && i10 <= 4) || i10 == 26;
    }

    public static double m(p pVar, int i10, int i11) {
        if (i11 == 4) {
            return pVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return pVar.getDouble(i10);
    }

    public static int n(p pVar, int i10, int i11) {
        return (int) o(pVar, i10, i11);
    }

    public static long o(p pVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = pVar.get(i10);
        } else if (i11 == 2) {
            i12 = pVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return pVar.getLong(i10);
            }
            i12 = pVar.getInt(i10);
        }
        return i12;
    }

    public static long p(p pVar, int i10, int i11) {
        if (i11 == 1) {
            return pVar.get(i10) & 255;
        }
        if (i11 == 2) {
            return pVar.getShort(i10) & H0.f217455d;
        }
        if (i11 == 4) {
            return ((long) pVar.getInt(i10)) & ZipKt.f225990j;
        }
        if (i11 != 8) {
            return -1L;
        }
        return pVar.getLong(i10);
    }

    public static int q(int i10, int i11) {
        if (i11 == 0) {
            return i10 + 10;
        }
        if (i11 == 2) {
            return i10 + 15;
        }
        if (i11 == 3) {
            return i10 + 18;
        }
        if (i11 != 4) {
            return 0;
        }
        return i10 + 21;
    }

    public static int r(int i10) {
        return i10 - 10;
    }
}
