package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.H0;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends b {
    public r f(int i10, ByteBuffer byteBuffer) {
        b(i10, 2, byteBuffer);
        return this;
    }

    public short g(int i10) {
        return this.f113417d.getShort(a(i10));
    }

    public int h(int i10) {
        return g(i10) & H0.f217455d;
    }
}
