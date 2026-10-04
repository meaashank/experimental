package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2516c;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2542p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2542p f112931a = new a();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p$a */
    public static class a extends AbstractC2542p {
        @Override // androidx.datastore.preferences.protobuf.AbstractC2542p
        public AbstractC2516c a(int i10) {
            return AbstractC2516c.j(ByteBuffer.allocateDirect(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2542p
        public AbstractC2516c b(int i10) {
            return new AbstractC2516c.b(new byte[i10], 0, i10);
        }
    }

    public static AbstractC2542p c() {
        return f112931a;
    }

    public abstract AbstractC2516c a(int i10);

    public abstract AbstractC2516c b(int i10);
}
