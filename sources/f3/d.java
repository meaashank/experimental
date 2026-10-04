package f3;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1545m0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f200556e = "GifHeaderParser";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f200557f = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f200558g = 44;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f200559h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f200560i = 59;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f200561j = 249;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f200562k = 255;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f200563l = 254;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f200564m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f200565n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f200566o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f200567p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f200568q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f200569r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f200570s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f200571t = 128;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f200572u = 7;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f200573v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f200574w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f200575x = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f200577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f200578c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f200576a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f200579d = 0;

    public void a() {
        this.f200577b = null;
        this.f200578c = null;
    }

    public final boolean b() {
        return this.f200578c.f200544b != 0;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f200578c.f200545c > 1;
    }

    @NonNull
    public c d() {
        if (this.f200577b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f200578c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f200578c;
            if (cVar.f200545c < 0) {
                cVar.f200544b = 1;
            }
        }
        return this.f200578c;
    }

    public final int e() {
        try {
            return this.f200577b.get() & 255;
        } catch (Exception unused) {
            this.f200578c.f200544b = 1;
            return 0;
        }
    }

    public final void f() {
        this.f200578c.f200546d.f200530a = this.f200577b.getShort();
        this.f200578c.f200546d.f200531b = this.f200577b.getShort();
        this.f200578c.f200546d.f200532c = this.f200577b.getShort();
        this.f200578c.f200546d.f200533d = this.f200577b.getShort();
        int iE = e();
        boolean z10 = (iE & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iE & 7) + 1);
        b bVar = this.f200578c.f200546d;
        bVar.f200534e = (iE & 64) != 0;
        if (z10) {
            bVar.f200540k = h(iPow);
        } else {
            bVar.f200540k = null;
        }
        this.f200578c.f200546d.f200539j = this.f200577b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f200578c;
        cVar.f200545c++;
        cVar.f200547e.add(cVar.f200546d);
    }

    public final void g() {
        int iE = e();
        this.f200579d = iE;
        if (iE <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f200579d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f200577b.get(this.f200576a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable(f200556e, 3)) {
                    StringBuilder sbA = C1545m0.a("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                    sbA.append(this.f200579d);
                    Log.d(f200556e, sbA.toString(), e10);
                }
                this.f200578c.f200544b = 1;
                return;
            }
        }
    }

    @Nullable
    public final int[] h(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f200577b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable(f200556e, 3)) {
                Log.d(f200556e, "Format Error Reading Color Table", e10);
            }
            this.f200578c.f200544b = 1;
            return iArr;
        }
    }

    public final void i() {
        j(Integer.MAX_VALUE);
    }

    public final void j(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f200578c.f200545c <= i10) {
            int iE = e();
            if (iE == 33) {
                int iE2 = e();
                if (iE2 == 1) {
                    s();
                } else if (iE2 == 249) {
                    this.f200578c.f200546d = new b();
                    k();
                } else if (iE2 == 254) {
                    s();
                } else if (iE2 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f200576a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (iE == 44) {
                c cVar = this.f200578c;
                if (cVar.f200546d == null) {
                    cVar.f200546d = new b();
                }
                f();
            } else if (iE != 59) {
                this.f200578c.f200544b = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void k() {
        e();
        int iE = e();
        b bVar = this.f200578c.f200546d;
        int i10 = (iE & 28) >> 2;
        bVar.f200536g = i10;
        if (i10 == 0) {
            bVar.f200536g = 1;
        }
        bVar.f200535f = (iE & 1) != 0;
        short s10 = this.f200577b.getShort();
        if (s10 < 2) {
            s10 = 10;
        }
        b bVar2 = this.f200578c.f200546d;
        bVar2.f200538i = s10 * 10;
        bVar2.f200537h = e();
        e();
    }

    public final void l() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) e());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f200578c.f200544b = 1;
            return;
        }
        m();
        if (!this.f200578c.f200550h || b()) {
            return;
        }
        c cVar = this.f200578c;
        cVar.f200543a = h(cVar.f200551i);
        c cVar2 = this.f200578c;
        cVar2.f200554l = cVar2.f200543a[cVar2.f200552j];
    }

    public final void m() {
        this.f200578c.f200548f = this.f200577b.getShort();
        this.f200578c.f200549g = this.f200577b.getShort();
        int iE = e();
        c cVar = this.f200578c;
        cVar.f200550h = (iE & 128) != 0;
        cVar.f200551i = (int) Math.pow(2.0d, (iE & 7) + 1);
        this.f200578c.f200552j = e();
        this.f200578c.f200553k = e();
    }

    public final void n() {
        do {
            g();
            byte[] bArr = this.f200576a;
            if (bArr[0] == 1) {
                this.f200578c.f200555m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f200579d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int o() {
        return this.f200577b.getShort();
    }

    public final void p() {
        this.f200577b = null;
        Arrays.fill(this.f200576a, (byte) 0);
        this.f200578c = new c();
        this.f200579d = 0;
    }

    public d q(@NonNull ByteBuffer byteBuffer) {
        p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f200577b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f200577b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@Nullable byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f200577b = null;
        this.f200578c.f200544b = 2;
        return this;
    }

    public final void s() {
        int iE;
        do {
            iE = e();
            this.f200577b.position(Math.min(this.f200577b.position() + iE, this.f200577b.limit()));
        } while (iE > 0);
    }

    public final void t() {
        e();
        s();
    }
}
