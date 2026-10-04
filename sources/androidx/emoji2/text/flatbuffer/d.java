package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f113418a;

    public d(ByteBuffer byteBuffer) {
        this.f113418a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean a(int i10) {
        return i10 <= this.f113418a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void b(int i10, byte b10) {
        a(i10 + 1);
        this.f113418a.put(i10, b10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int c() {
        return this.f113418a.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void d(byte b10) {
        this.f113418a.put(b10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] data() {
        return this.f113418a.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void e(int i10, boolean z10) {
        b(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void f(int i10, int i11) {
        a(i10 + 4);
        this.f113418a.putInt(i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(int i10, byte[] bArr, int i11, int i12) {
        a((i12 - i11) + i10);
        int iPosition = this.f113418a.position();
        this.f113418a.position(i10);
        this.f113418a.put(bArr, i11, i12);
        this.f113418a.position(iPosition);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i10) {
        return this.f113418a.get(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i10) {
        return this.f113418a.getDouble(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i10) {
        return this.f113418a.getFloat(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i10) {
        return this.f113418a.getInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i10) {
        return this.f113418a.getLong(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i10) {
        return this.f113418a.getShort(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String h(int i10, int i11) {
        return Utf8Safe.h(this.f113418a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void i(int i10, short s10) {
        a(i10 + 2);
        this.f113418a.putShort(i10, s10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void j(byte[] bArr, int i10, int i11) {
        this.f113418a.put(bArr, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int limit() {
        return this.f113418a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void m(int i10, float f10) {
        a(i10 + 4);
        this.f113418a.putFloat(i10, f10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void p(int i10, double d10) {
        a(i10 + 8);
        this.f113418a.putDouble(i10, d10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putBoolean(boolean z10) {
        this.f113418a.put(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putDouble(double d10) {
        this.f113418a.putDouble(d10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putFloat(float f10) {
        this.f113418a.putFloat(f10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putInt(int i10) {
        this.f113418a.putInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putLong(long j10) {
        this.f113418a.putLong(j10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void putShort(short s10) {
        this.f113418a.putShort(s10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean r(int i10) {
        return get(i10) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void u(int i10, long j10) {
        a(i10 + 8);
        this.f113418a.putLong(i10, j10);
    }
}
