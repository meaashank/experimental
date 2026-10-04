package ad;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.C4875q;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ad.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1473d
public final class C1472c extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InputStream f84828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Base64 f84829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final byte[] f84832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final byte[] f84833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final byte[] f84834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84836i;

    public C1472c(@NotNull InputStream input, @NotNull Base64 base64) {
        G.p(input, "input");
        G.p(base64, "base64");
        this.f84828a = input;
        this.f84829b = base64;
        this.f84832e = new byte[1];
        this.f84833f = new byte[1024];
        this.f84834g = new byte[1024];
    }

    public final void a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f84834g;
        int i12 = this.f84835h;
        C4875q.v0(bArr2, bArr, i10, i12, i12 + i11);
        this.f84835h += i11;
        l();
    }

    public final int b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.f84836i;
        this.f84836i = i13 + this.f84829b.p(this.f84833f, this.f84834g, i13, 0, i12);
        int iMin = Math.min(d(), i11 - i10);
        a(bArr, i10, iMin);
        m();
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f84830c) {
            return;
        }
        this.f84830c = true;
        this.f84828a.close();
    }

    public final int d() {
        return this.f84836i - this.f84835h;
    }

    public final int e(int i10) throws IOException {
        this.f84833f[i10] = Base64.f217719k;
        if ((i10 & 3) != 2) {
            return i10 + 1;
        }
        int iK = k();
        if (iK >= 0) {
            this.f84833f[i10 + 1] = (byte) iK;
        }
        return i10 + 2;
    }

    public final int k() throws IOException {
        int i10;
        if (!this.f84829b.f217727b) {
            return this.f84828a.read();
        }
        do {
            i10 = this.f84828a.read();
            if (i10 == -1) {
                break;
            }
        } while (!C1471b.e(i10));
        return i10;
    }

    public final void l() {
        if (this.f84835h == this.f84836i) {
            this.f84835h = 0;
            this.f84836i = 0;
        }
    }

    public final void m() {
        byte[] bArr = this.f84834g;
        int length = bArr.length;
        int i10 = this.f84836i;
        if ((this.f84833f.length / 4) * 3 > length - i10) {
            C4875q.v0(bArr, bArr, 0, this.f84835h, i10);
            this.f84836i -= this.f84835h;
            this.f84835h = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f84835h;
        if (i10 < this.f84836i) {
            int i11 = this.f84834g[i10] & 255;
            this.f84835h = i10 + 1;
            l();
            return i11;
        }
        int i12 = read(this.f84832e, 0, 1);
        if (i12 == -1) {
            return -1;
        }
        if (i12 == 1) {
            return this.f84832e[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (r3 != r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r4 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        return r3 - r11;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(@org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.G.p(r10, r0)
            if (r11 < 0) goto L86
            if (r12 < 0) goto L86
            int r0 = r11 + r12
            int r1 = r10.length
            if (r0 > r1) goto L86
            boolean r1 = r9.f84830c
            if (r1 != 0) goto L7e
            boolean r1 = r9.f84831d
            r2 = -1
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            if (r12 != 0) goto L1c
            return r1
        L1c:
            int r3 = r9.d()
            if (r3 < r12) goto L26
            r9.a(r10, r11, r12)
            return r12
        L26:
            int r3 = r9.d()
            int r12 = r12 - r3
            int r12 = r12 + 2
            int r12 = r12 / 3
            int r12 = r12 * 4
            r3 = r11
        L32:
            boolean r4 = r9.f84831d
            if (r4 != 0) goto L77
            if (r12 <= 0) goto L77
            byte[] r4 = r9.f84833f
            int r4 = r4.length
            int r4 = java.lang.Math.min(r4, r12)
            r5 = r1
        L40:
            boolean r6 = r9.f84831d
            if (r6 != 0) goto L63
            if (r5 >= r4) goto L63
            int r6 = r9.k()
            r7 = 1
            if (r6 == r2) goto L60
            r8 = 61
            if (r6 == r8) goto L59
            byte[] r7 = r9.f84833f
            byte r6 = (byte) r6
            r7[r5] = r6
            int r5 = r5 + 1
            goto L40
        L59:
            int r5 = r9.e(r5)
            r9.f84831d = r7
            goto L40
        L60:
            r9.f84831d = r7
            goto L40
        L63:
            if (r6 != 0) goto L70
            if (r5 != r4) goto L68
            goto L70
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)
            throw r10
        L70:
            int r12 = r12 - r5
            int r4 = r9.b(r10, r3, r0, r5)
            int r3 = r3 + r4
            goto L32
        L77:
            if (r3 != r11) goto L7c
            if (r4 == 0) goto L7c
            return r2
        L7c:
            int r3 = r3 - r11
            return r3
        L7e:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "The input stream is closed."
            r10.<init>(r11)
            throw r10
        L86:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = ", length: "
            java.lang.String r2 = ", buffer size: "
            java.lang.String r3 = "offset: "
            java.lang.StringBuilder r11 = androidx.collection.C1545m0.a(r3, r11, r1, r12, r2)
            int r10 = r10.length
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.C1472c.read(byte[], int, int):int");
    }
}
