package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f113417d;

    public int a(int i10) {
        return (i10 * this.f113416c) + this.f113414a;
    }

    public void b(int i10, int i11, ByteBuffer byteBuffer) {
        this.f113417d = byteBuffer;
        if (byteBuffer != null) {
            this.f113414a = i10;
            this.f113415b = byteBuffer.getInt(i10 - 4);
            this.f113416c = i11;
        } else {
            this.f113414a = 0;
            this.f113415b = 0;
            this.f113416c = 0;
        }
    }

    public int c() {
        return this.f113414a;
    }

    public int d() {
        return this.f113415b;
    }

    public void e() {
        b(0, 0, null);
    }
}
