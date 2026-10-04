package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f113471b;

    public void a() {
        b(0, null);
    }

    public void b(int i10, ByteBuffer byteBuffer) {
        this.f113471b = byteBuffer;
        if (byteBuffer != null) {
            this.f113470a = i10;
        } else {
            this.f113470a = 0;
        }
    }
}
