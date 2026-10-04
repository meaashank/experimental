package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends b {
    public l f(int i10, ByteBuffer byteBuffer) {
        b(i10, 4, byteBuffer);
        return this;
    }

    public int g(int i10) {
        return this.f113417d.getInt(a(i10));
    }

    public long h(int i10) {
        return ((long) g(i10)) & ZipKt.f225990j;
    }
}
