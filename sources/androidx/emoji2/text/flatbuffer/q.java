package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface q extends p {
    boolean a(int i10);

    void b(int i10, byte b10);

    int c();

    void d(byte b10);

    void e(int i10, boolean z10);

    void f(int i10, int i11);

    void g(int i10, byte[] bArr, int i11, int i12);

    void i(int i10, short s10);

    void j(byte[] bArr, int i10, int i11);

    @Override // androidx.emoji2.text.flatbuffer.p
    int limit();

    void m(int i10, float f10);

    void p(int i10, double d10);

    void putBoolean(boolean z10);

    void putDouble(double d10);

    void putFloat(float f10);

    void putInt(int i10);

    void putLong(long j10);

    void putShort(short s10);

    void u(int i10, long j10);
}
