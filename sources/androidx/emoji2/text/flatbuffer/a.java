package androidx.emoji2.text.flatbuffer;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f113412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113413b;

    public a() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean a(int i10) {
        byte[] bArr = this.f113412a;
        if (bArr.length > i10) {
            return true;
        }
        int length = bArr.length;
        this.f113412a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void b(int i10, byte b10) {
        a(i10 + 1);
        this.f113412a[i10] = b10;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int c() {
        return this.f113413b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void d(byte b10) {
        b(this.f113413b, b10);
        this.f113413b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] data() {
        return this.f113412a;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void e(int i10, boolean z10) {
        b(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void f(int i10, int i11) {
        a(i10 + 4);
        byte[] bArr = this.f113412a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(int i10, byte[] bArr, int i11, int i12) {
        a((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f113412a, i10, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i10) {
        return this.f113412a[i10];
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i10) {
        byte[] bArr = this.f113412a;
        return (bArr[i10] & 255) | (bArr[i10 + 3] << Ascii.CAN) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i10) {
        byte[] bArr = this.f113412a;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        return (((long) bArr[i10 + 7]) << 56) | j10 | ((255 & ((long) bArr[i10 + 6])) << 48);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i10) {
        byte[] bArr = this.f113412a;
        return (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String h(int i10, int i11) {
        return Utf8Safe.g(this.f113412a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void i(int i10, short s10) {
        a(i10 + 2);
        byte[] bArr = this.f113412a;
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void j(byte[] bArr, int i10, int i11) {
        g(this.f113413b, bArr, i10, i11);
        this.f113413b += i11;
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int limit() {
        return this.f113413b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void m(int i10, float f10) {
        a(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this.f113412a;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        bArr[i10 + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i10 + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i10 + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void p(int i10, double d10) {
        a(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f113412a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putBoolean(boolean z10) {
        e(this.f113413b, z10);
        this.f113413b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putDouble(double d10) {
        p(this.f113413b, d10);
        this.f113413b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putFloat(float f10) {
        m(this.f113413b, f10);
        this.f113413b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putInt(int i10) {
        f(this.f113413b, i10);
        this.f113413b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putLong(long j10) {
        u(this.f113413b, j10);
        this.f113413b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putShort(short s10) {
        i(this.f113413b, s10);
        this.f113413b += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean r(int i10) {
        return this.f113412a[i10] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void u(int i10, long j10) {
        a(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f113412a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (j10 >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    public a(int i10) {
        this(new byte[i10]);
    }

    public a(byte[] bArr) {
        this.f113412a = bArr;
        this.f113413b = 0;
    }

    public a(byte[] bArr, int i10) {
        this.f113412a = bArr;
        this.f113413b = i10;
    }
}
