package f3;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.U;
import e.InterfaceC4337k;
import f3.InterfaceC4386a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class f implements InterfaceC4386a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f200580A = "f";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f200581B = 4096;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f200582C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f200583D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f200584E = 4;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f200585F = 255;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @InterfaceC4337k
    public static final int f200586G = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4337k
    public int[] f200587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4337k
    public final int[] f200588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4386a.InterfaceC0731a f200589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f200590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f200591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f200592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f200593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f200594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f200595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f200596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InterfaceC4337k
    public int[] f200597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f200598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f200599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f200600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f200601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f200602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f200603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f200604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Boolean f200606y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public Bitmap.Config f200607z;

    public f(@NonNull InterfaceC4386a.InterfaceC0731a interfaceC0731a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0731a, cVar, byteBuffer, 1);
    }

    @Override // f3.InterfaceC4386a
    public void a(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f200607z = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // f3.InterfaceC4386a
    public void advance() {
        this.f200598q = (this.f200598q + 1) % this.f200599r.f200545c;
    }

    @Override // f3.InterfaceC4386a
    @Deprecated
    public int b() {
        int i10 = this.f200599r.f200555m;
        if (i10 == -1) {
            return 1;
        }
        return i10;
    }

    @Override // f3.InterfaceC4386a
    public void c() {
        this.f200598q = -1;
    }

    @Override // f3.InterfaceC4386a
    public void clear() {
        this.f200599r = null;
        byte[] bArr = this.f200596o;
        if (bArr != null) {
            this.f200589h.e(bArr);
        }
        int[] iArr = this.f200597p;
        if (iArr != null) {
            this.f200589h.f(iArr);
        }
        Bitmap bitmap = this.f200600s;
        if (bitmap != null) {
            this.f200589h.c(bitmap);
        }
        this.f200600s = null;
        this.f200590i = null;
        this.f200606y = null;
        byte[] bArr2 = this.f200591j;
        if (bArr2 != null) {
            this.f200589h.e(bArr2);
        }
    }

    @Override // f3.InterfaceC4386a
    public int d() {
        return this.f200598q;
    }

    @Override // f3.InterfaceC4386a
    public synchronized void e(@NonNull c cVar, @NonNull byte[] bArr) {
        l(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // f3.InterfaceC4386a
    public synchronized void f(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f200602u = 0;
            this.f200599r = cVar;
            this.f200598q = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f200590i = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f200590i.order(ByteOrder.LITTLE_ENDIAN);
            this.f200601t = false;
            Iterator<b> it = cVar.f200547e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f200536g == 3) {
                    this.f200601t = true;
                    break;
                }
            }
            this.f200603v = iHighestOneBit;
            int i11 = cVar.f200548f;
            this.f200605x = i11 / iHighestOneBit;
            int i12 = cVar.f200549g;
            this.f200604w = i12 / iHighestOneBit;
            this.f200596o = this.f200589h.a(i11 * i12);
            this.f200597p = this.f200589h.d(this.f200605x * this.f200604w);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f3.InterfaceC4386a
    public int g() {
        return (this.f200597p.length * 4) + this.f200590i.limit() + this.f200596o.length;
    }

    @Override // f3.InterfaceC4386a
    @NonNull
    public ByteBuffer getData() {
        return this.f200590i;
    }

    @Override // f3.InterfaceC4386a
    public int getHeight() {
        return this.f200599r.f200549g;
    }

    @Override // f3.InterfaceC4386a
    public int getStatus() {
        return this.f200602u;
    }

    @Override // f3.InterfaceC4386a
    public int getWidth() {
        return this.f200599r.f200548f;
    }

    @Override // f3.InterfaceC4386a
    @Nullable
    public synchronized Bitmap h() {
        try {
            if (this.f200599r.f200545c <= 0 || this.f200598q < 0) {
                String str = f200580A;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f200599r.f200545c + ", framePointer=" + this.f200598q);
                }
                this.f200602u = 1;
            }
            int i10 = this.f200602u;
            if (i10 != 1 && i10 != 2) {
                this.f200602u = 0;
                if (this.f200591j == null) {
                    this.f200591j = this.f200589h.a(255);
                }
                b bVar = this.f200599r.f200547e.get(this.f200598q);
                int i11 = this.f200598q - 1;
                b bVar2 = i11 >= 0 ? this.f200599r.f200547e.get(i11) : null;
                int[] iArr = bVar.f200540k;
                if (iArr == null) {
                    iArr = this.f200599r.f200543a;
                }
                this.f200587f = iArr;
                if (iArr == null) {
                    String str2 = f200580A;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f200598q);
                    }
                    this.f200602u = 1;
                    return null;
                }
                if (bVar.f200535f) {
                    System.arraycopy(iArr, 0, this.f200588g, 0, iArr.length);
                    int[] iArr2 = this.f200588g;
                    this.f200587f = iArr2;
                    iArr2[bVar.f200537h] = 0;
                    if (bVar.f200536g == 2 && this.f200598q == 0) {
                        this.f200606y = Boolean.TRUE;
                    }
                }
                return w(bVar, bVar2);
            }
            String str3 = f200580A;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f200602u);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f3.InterfaceC4386a
    public int i() {
        return this.f200599r.f200545c;
    }

    @Override // f3.InterfaceC4386a
    public int j(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f200599r;
        if (i10 < cVar.f200545c) {
            return cVar.f200547e.get(i10).f200538i;
        }
        return -1;
    }

    @Override // f3.InterfaceC4386a
    public int k() {
        int i10 = this.f200599r.f200555m;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // f3.InterfaceC4386a
    public synchronized void l(@NonNull c cVar, @NonNull ByteBuffer byteBuffer) {
        f(cVar, byteBuffer, 1);
    }

    @Override // f3.InterfaceC4386a
    public int m() {
        int i10;
        if (this.f200599r.f200545c <= 0 || (i10 = this.f200598q) < 0) {
            return 0;
        }
        return j(i10);
    }

    @Override // f3.InterfaceC4386a
    public int n() {
        return this.f200599r.f200555m;
    }

    @InterfaceC4337k
    public final int o(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f200603v + i10; i18++) {
            byte[] bArr = this.f200596o;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f200587f[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f200603v + i20; i21++) {
            byte[] bArr2 = this.f200596o;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f200587f[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    public final void p(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f200597p;
        int i14 = bVar.f200533d;
        int i15 = this.f200603v;
        int i16 = i14 / i15;
        int i17 = bVar.f200531b / i15;
        int i18 = bVar.f200532c / i15;
        int i19 = bVar.f200530a / i15;
        boolean z10 = this.f200598q == 0;
        int i20 = this.f200605x;
        int i21 = this.f200604w;
        byte[] bArr = this.f200596o;
        int[] iArr2 = this.f200587f;
        Boolean bool = this.f200606y;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f200534e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f200532c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int iO = o(i32, i36, bVar.f200532c);
                        if (iO != 0) {
                            iArr3[i37] = iO;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f200606y == null) {
            this.f200606y = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    public final void q(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f200597p;
        int i10 = bVar2.f200533d;
        int i11 = bVar2.f200531b;
        int i12 = bVar2.f200532c;
        int i13 = bVar2.f200530a;
        boolean z10 = this.f200598q == 0;
        int i14 = this.f200605x;
        byte[] bArr = this.f200596o;
        int[] iArr2 = this.f200587f;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f200532c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f200606y;
        this.f200606y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f200606y == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void r(b bVar) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        f fVar = this;
        if (bVar != null) {
            fVar.f200590i.position(bVar.f200539j);
        }
        if (bVar == null) {
            c cVar = fVar.f200599r;
            i10 = cVar.f200548f;
            i11 = cVar.f200549g;
        } else {
            i10 = bVar.f200532c;
            i11 = bVar.f200533d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = fVar.f200596o;
        if (bArr2 == null || bArr2.length < i12) {
            fVar.f200596o = fVar.f200589h.a(i12);
        }
        byte[] bArr3 = fVar.f200596o;
        if (fVar.f200593l == null) {
            fVar.f200593l = new short[4096];
        }
        short[] sArr = fVar.f200593l;
        if (fVar.f200594m == null) {
            fVar.f200594m = new byte[4096];
        }
        byte[] bArr4 = fVar.f200594m;
        if (fVar.f200595n == null) {
            fVar.f200595n = new byte[U.f113740I];
        }
        byte[] bArr5 = fVar.f200595n;
        int iV = fVar.v();
        int i13 = 1 << iV;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iV + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = fVar.f200591j;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iU = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (iU == 0) {
                iU = fVar.u();
                if (iU <= 0) {
                    fVar.f200602u = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & 255) << i24;
            i23++;
            iU--;
            int i30 = i24 + 8;
            int i31 = i20;
            int i32 = i19;
            int i33 = i29;
            short[] sArr2 = sArr;
            int i34 = i27;
            while (true) {
                bArr = bArr4;
                if (i30 < i32) {
                    i20 = i31;
                    i27 = i34;
                    break;
                }
                int i35 = i25 & i21;
                i25 >>= i32;
                i30 -= i32;
                if (i35 == i13) {
                    i32 = i16;
                    i31 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i33 = -1;
                } else {
                    if (i35 == i14) {
                        i27 = i34;
                        i20 = i31;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i33 == -1) {
                        bArr3[i26] = bArr[i35];
                        i26++;
                        i22++;
                        i33 = i35;
                        i34 = i33;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i35 >= i31) {
                            bArr7[i28] = (byte) i34;
                            i28++;
                            s10 = i33;
                        } else {
                            s10 = i35;
                        }
                        while (s10 >= i13) {
                            bArr7[i28] = bArr[s10];
                            i28++;
                            s10 = sArr2[s10];
                        }
                        int i36 = bArr[s10] & 255;
                        byte b11 = (byte) i36;
                        bArr3[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr3[i26] = bArr7[i28];
                        }
                        if (i31 < 4096) {
                            sArr2[i31] = (short) i33;
                            bArr[i31] = b11;
                            i31++;
                            if ((i31 & i21) == 0 && i31 < 4096) {
                                i32++;
                                i21 += i31;
                            }
                        }
                        i33 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i34 = i36;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i29 = i33;
            i19 = i32;
            fVar = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    @Override // f3.InterfaceC4386a
    public int read(@Nullable InputStream inputStream, int i10) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10 > 0 ? i10 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 16384);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e10) {
                Log.w(f200580A, "Error reading data from stream", e10);
            }
        } else {
            this.f200602u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                Log.w(f200580A, "Error closing stream", e11);
            }
        }
        return this.f200602u;
    }

    @NonNull
    public final d s() {
        if (this.f200592k == null) {
            this.f200592k = new d();
        }
        return this.f200592k;
    }

    public final Bitmap t() {
        Boolean bool = this.f200606y;
        Bitmap bitmapB = this.f200589h.b(this.f200605x, this.f200604w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f200607z);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    public final int u() {
        int iV = v();
        if (iV <= 0) {
            return iV;
        }
        ByteBuffer byteBuffer = this.f200590i;
        byteBuffer.get(this.f200591j, 0, Math.min(iV, byteBuffer.remaining()));
        return iV;
    }

    public final int v() {
        return this.f200590i.get() & 255;
    }

    public final Bitmap w(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f200597p;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f200600s;
            if (bitmap2 != null) {
                this.f200589h.c(bitmap2);
            }
            this.f200600s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f200536g == 3 && this.f200600s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f200536g) > 0) {
            if (i11 == 2) {
                if (!bVar.f200535f) {
                    c cVar = this.f200599r;
                    int i13 = cVar.f200554l;
                    if (bVar.f200540k == null || cVar.f200552j != bVar.f200537h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f200533d;
                int i15 = this.f200603v;
                int i16 = i14 / i15;
                int i17 = bVar2.f200531b / i15;
                int i18 = bVar2.f200532c / i15;
                int i19 = bVar2.f200530a / i15;
                int i20 = this.f200605x;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f200605x;
                }
            } else if (i11 == 3 && (bitmap = this.f200600s) != null) {
                int i25 = this.f200605x;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f200604w);
            }
        }
        r(bVar);
        if (bVar.f200534e || this.f200603v != 1) {
            p(bVar);
        } else {
            q(bVar);
        }
        if (this.f200601t && ((i10 = bVar.f200536g) == 0 || i10 == 1)) {
            if (this.f200600s == null) {
                this.f200600s = t();
            }
            Bitmap bitmap3 = this.f200600s;
            int i26 = this.f200605x;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f200604w);
        }
        Bitmap bitmapT = t();
        int i27 = this.f200605x;
        bitmapT.setPixels(iArr, 0, i27, 0, 0, i27, this.f200604w);
        return bitmapT;
    }

    public f(@NonNull InterfaceC4386a.InterfaceC0731a interfaceC0731a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0731a);
        f(cVar, byteBuffer, i10);
    }

    public f(@NonNull InterfaceC4386a.InterfaceC0731a interfaceC0731a) {
        this.f200588g = new int[256];
        this.f200607z = Bitmap.Config.ARGB_8888;
        this.f200589h = interfaceC0731a;
        this.f200599r = new c();
    }

    @Override // f3.InterfaceC4386a
    public synchronized int read(@Nullable byte[] bArr) {
        try {
            c cVarD = s().r(bArr).d();
            this.f200599r = cVarD;
            if (bArr != null) {
                e(cVarD, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f200602u;
    }
}
