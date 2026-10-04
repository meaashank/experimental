package androidx.emoji2.text.flatbuffer;

import androidx.collection.LruCacheKt;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f113444h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f113445i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f113446j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f113447k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f113448l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f113449m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f113450n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f113451o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f113452p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f113453q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ boolean f113454r = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f113455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f113456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Integer> f113457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, Integer> f113458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Comparator<b> f113461g;

    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f113468e;
            int i11 = bVar2.f113468e;
            do {
                b10 = j.this.f113455a.get(i10);
                b11 = j.this.f113455a.get(i11);
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    public j(int i10) {
        this(new androidx.emoji2.text.flatbuffer.a(i10), 1);
    }

    public static int E(long j10) {
        if (j10 <= 255) {
            return 0;
        }
        if (j10 <= 65535) {
            return 1;
        }
        return j10 <= (((long) (-1)) & ZipKt.f225990j) ? 2 : 3;
    }

    public final void A(String str, long j10) {
        this.f113456b.add(b.w(u(str), j10));
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f113456b.size();
    }

    public int D() {
        return this.f113456b.size();
    }

    public final void F(b bVar, int i10) {
        int i11 = bVar.f113464a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                H(bVar.f113466c, i10);
                return;
            } else if (i11 != 26) {
                J(bVar.f113467d, i10);
                return;
            }
        }
        I(bVar.f113467d, i10);
    }

    public final b G(int i10, byte[] bArr, int i11, boolean z10) {
        int iE = E(bArr.length);
        I(bArr.length, b(iE));
        int iC = this.f113455a.c();
        this.f113455a.j(bArr, 0, bArr.length);
        if (z10) {
            this.f113455a.d((byte) 0);
        }
        return b.f(i10, iC, i11, iE);
    }

    public final void H(double d10, int i10) {
        if (i10 == 4) {
            this.f113455a.putFloat((float) d10);
        } else if (i10 == 8) {
            this.f113455a.putDouble(d10);
        }
    }

    public final void I(long j10, int i10) {
        if (i10 == 1) {
            this.f113455a.d((byte) j10);
            return;
        }
        if (i10 == 2) {
            this.f113455a.putShort((short) j10);
        } else if (i10 == 4) {
            this.f113455a.putInt((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            this.f113455a.putLong(j10);
        }
    }

    public final void J(long j10, int i10) {
        I((int) (((long) this.f113455a.c()) - j10), i10);
    }

    public final b K(int i10, String str) {
        return G(i10, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public final int b(int i10) {
        int i11 = 1 << i10;
        int iQ = b.q(this.f113455a.c(), i11);
        while (true) {
            int i12 = iQ - 1;
            if (iQ == 0) {
                return i11;
            }
            this.f113455a.d((byte) 0);
            iQ = i12;
        }
    }

    public final b c(int i10, int i11) {
        long j10 = i11;
        int iMax = Math.max(0, E(j10));
        int i12 = i10;
        while (i12 < this.f113456b.size()) {
            int i13 = i12 + 1;
            iMax = Math.max(iMax, b.i(4, 0, this.f113456b.get(i12).f113468e, this.f113455a.c(), i13));
            i12 = i13;
        }
        int iB = b(iMax);
        I(j10, iB);
        int iC = this.f113455a.c();
        while (i10 < this.f113456b.size()) {
            int i14 = this.f113456b.get(i10).f113468e;
            J(this.f113456b.get(i10).f113468e, iB);
            i10++;
        }
        return new b(-1, FlexBuffers.q(4, 0), iMax, iC);
    }

    public final b d(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iQ;
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, E(j10));
        if (bVar != null) {
            iMax = Math.max(iMax, bVar.h(this.f113455a.c(), 0));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i15 = 4;
        int iMax2 = iMax;
        for (int i16 = i11; i16 < this.f113456b.size(); i16++) {
            iMax2 = Math.max(iMax2, this.f113456b.get(i16).h(this.f113455a.c(), i16 + i13));
            if (z10 && i16 == i11) {
                i15 = this.f113456b.get(i16).f113464a;
                if (!FlexBuffers.l(i15)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i11;
        int iB = b(iMax2);
        if (bVar != null) {
            J(bVar.f113467d, iB);
            I(1 << bVar.f113465b, iB);
        }
        if (!z11) {
            I(j10, iB);
        }
        int iC = this.f113455a.c();
        for (int i18 = i17; i18 < this.f113456b.size(); i18++) {
            F(this.f113456b.get(i18), iB);
        }
        if (!z10) {
            while (i17 < this.f113456b.size()) {
                this.f113455a.d(this.f113456b.get(i17).s(iMax2));
                i17++;
            }
        }
        if (bVar != null) {
            iQ = 9;
        } else if (z10) {
            if (!z11) {
                i14 = 0;
            }
            iQ = FlexBuffers.q(i15, i14);
        } else {
            iQ = 10;
        }
        return new b(i10, iQ, iMax2, iC);
    }

    public int e(String str, int i10) {
        int iU = u(str);
        ArrayList<b> arrayList = this.f113456b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f113461g);
        b bVarD = d(iU, i10, this.f113456b.size() - i10, false, false, c(i10, this.f113456b.size() - i10));
        while (this.f113456b.size() > i10) {
            this.f113456b.remove(r9.size() - 1);
        }
        this.f113456b.add(bVarD);
        return (int) bVarD.f113467d;
    }

    public int f(String str, int i10, boolean z10, boolean z11) {
        b bVarD = d(u(str), i10, this.f113456b.size() - i10, z10, z11, null);
        while (this.f113456b.size() > i10) {
            this.f113456b.remove(r9.size() - 1);
        }
        this.f113456b.add(bVarD);
        return (int) bVarD.f113467d;
    }

    public ByteBuffer g() {
        int iB = b(this.f113456b.get(0).h(this.f113455a.c(), 0));
        F(this.f113456b.get(0), iB);
        this.f113455a.d(this.f113456b.get(0).s(0));
        this.f113455a.d((byte) iB);
        this.f113460f = true;
        return ByteBuffer.wrap(this.f113455a.data(), 0, this.f113455a.c());
    }

    public q h() {
        return this.f113455a;
    }

    public int i(String str, byte[] bArr) {
        b bVarG = G(u(str), bArr, 25, false);
        this.f113456b.add(bVarG);
        return (int) bVarG.f113467d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z10) {
        this.f113456b.add(b.g(u(str), z10));
    }

    public void l(boolean z10) {
        k(null, z10);
    }

    public void m(double d10) {
        o(null, d10);
    }

    public void n(float f10) {
        p(null, f10);
    }

    public void o(String str, double d10) {
        this.f113456b.add(b.k(u(str), d10));
    }

    public void p(String str, float f10) {
        this.f113456b.add(b.j(u(str), f10));
    }

    public void q(int i10) {
        s(null, i10);
    }

    public void r(long j10) {
        t(null, j10);
    }

    public void s(String str, int i10) {
        t(str, i10);
    }

    public void t(String str, long j10) {
        int iU = u(str);
        if (-128 <= j10 && j10 <= 127) {
            this.f113456b.add(b.o(iU, (int) j10));
            return;
        }
        if (-32768 <= j10 && j10 <= 32767) {
            this.f113456b.add(b.l(iU, (int) j10));
        } else if (-2147483648L > j10 || j10 > LruCacheKt.f86729a) {
            this.f113456b.add(b.n(iU, j10));
        } else {
            this.f113456b.add(b.m(iU, (int) j10));
        }
    }

    public final int u(String str) {
        if (str == null) {
            return -1;
        }
        int iC = this.f113455a.c();
        if ((this.f113459e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f113455a.j(bytes, 0, bytes.length);
            this.f113455a.d((byte) 0);
            this.f113457c.put(str, Integer.valueOf(iC));
            return iC;
        }
        Integer num = this.f113457c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f113455a.j(bytes2, 0, bytes2.length);
        this.f113455a.d((byte) 0);
        this.f113457c.put(str, Integer.valueOf(iC));
        return iC;
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int iU = u(str);
        if ((this.f113459e & 2) == 0) {
            b bVarK = K(iU, str2);
            this.f113456b.add(bVarK);
            return (int) bVarK.f113467d;
        }
        Integer num = this.f113458d.get(str2);
        if (num != null) {
            this.f113456b.add(b.f(iU, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b bVarK2 = K(iU, str2);
        this.f113458d.put(str2, Integer.valueOf((int) bVarK2.f113467d));
        this.f113456b.add(bVarK2);
        return (int) bVarK2.f113467d;
    }

    public void x(int i10) {
        z(null, i10);
    }

    public void y(long j10) {
        z(null, j10);
    }

    public final void z(String str, long j10) {
        int iU = u(str);
        int iE = E(j10);
        this.f113456b.add(iE == 0 ? b.x(iU, (int) j10) : iE == 1 ? b.u(iU, (int) j10) : iE == 2 ? b.v(iU, (int) j10) : b.w(iU, j10));
    }

    public j() {
        this(256);
    }

    @Deprecated
    public j(ByteBuffer byteBuffer, int i10) {
        this(new androidx.emoji2.text.flatbuffer.a(byteBuffer.array()), i10);
    }

    public j(q qVar, int i10) {
        this.f113456b = new ArrayList<>();
        this.f113457c = new HashMap<>();
        this.f113458d = new HashMap<>();
        this.f113460f = false;
        this.f113461g = new a();
        this.f113455a = qVar;
        this.f113459e = i10;
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ boolean f113463f = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f113466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f113467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f113468e;

        public b(int i10, int i11, int i12, long j10) {
            this.f113468e = i10;
            this.f113464a = i11;
            this.f113465b = i12;
            this.f113467d = j10;
            this.f113466c = Double.MIN_VALUE;
        }

        public static byte c(b bVar) {
            return bVar.s(0);
        }

        public static b f(int i10, int i11, int i12, int i13) {
            return new b(i10, i12, i13, i11);
        }

        public static b g(int i10, boolean z10) {
            return new b(i10, 26, 0, z10 ? 1L : 0L);
        }

        public static int i(int i10, int i11, long j10, int i12, int i13) {
            if (FlexBuffers.j(i10)) {
                return i11;
            }
            for (int i14 = 1; i14 <= 32; i14 *= 2) {
                int iE = j.E((int) (((long) ((i13 * i14) + (q(i12, i14) + i12))) - j10));
                if ((1 << iE) == i14) {
                    return iE;
                }
            }
            return 3;
        }

        public static b j(int i10, float f10) {
            return new b(i10, 3, 2, f10);
        }

        public static b k(int i10, double d10) {
            return new b(i10, 3, 3, d10);
        }

        public static b l(int i10, int i11) {
            return new b(i10, 1, 1, i11);
        }

        public static b m(int i10, int i11) {
            return new b(i10, 1, 2, i11);
        }

        public static b n(int i10, long j10) {
            return new b(i10, 1, 3, j10);
        }

        public static b o(int i10, int i11) {
            return new b(i10, 1, 0, i11);
        }

        public static byte p(int i10, int i11) {
            return (byte) (i10 | (i11 << 2));
        }

        public static int q(int i10, int i11) {
            return ((~i10) + 1) & (i11 - 1);
        }

        public static b u(int i10, int i11) {
            return new b(i10, 2, 1, i11);
        }

        public static b v(int i10, int i11) {
            return new b(i10, 2, 2, i11);
        }

        public static b w(int i10, long j10) {
            return new b(i10, 2, 3, j10);
        }

        public static b x(int i10, int i11) {
            return new b(i10, 2, 0, i11);
        }

        public final int h(int i10, int i11) {
            return i(this.f113464a, this.f113465b, this.f113467d, i10, i11);
        }

        public final byte r() {
            return s(0);
        }

        public final byte s(int i10) {
            return p(t(i10), this.f113464a);
        }

        public final int t(int i10) {
            return FlexBuffers.j(this.f113464a) ? Math.max(this.f113465b, i10) : this.f113465b;
        }

        public b(int i10, int i11, int i12, double d10) {
            this.f113468e = i10;
            this.f113464a = i11;
            this.f113465b = i12;
            this.f113466c = d10;
            this.f113467d = Long.MIN_VALUE;
        }
    }

    public j(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
