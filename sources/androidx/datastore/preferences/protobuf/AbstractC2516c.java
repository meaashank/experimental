package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2516c {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c$a */
    public static class a extends AbstractC2516c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f112828a;

        public a(ByteBuffer byteBuffer) {
            this.f112828a = byteBuffer;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public byte[] a() {
            return this.f112828a.array();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int b() {
            return this.f112828a.arrayOffset();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public boolean c() {
            return this.f112828a.hasArray();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public boolean d() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int e() {
            return this.f112828a.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public ByteBuffer f() {
            return this.f112828a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int g() {
            return this.f112828a.position();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public AbstractC2516c h(int i10) {
            this.f112828a.position(i10);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int i() {
            return this.f112828a.remaining();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c$b */
    public static class b extends AbstractC2516c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f112830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f112831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f112832d;

        public b(byte[] bArr, int i10, int i11) {
            this.f112830b = bArr;
            this.f112831c = i10;
            this.f112832d = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public byte[] a() {
            return this.f112830b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int b() {
            return this.f112831c;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public boolean c() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public boolean d() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int e() {
            return this.f112832d;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int g() {
            return this.f112829a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public AbstractC2516c h(int i10) {
            if (i10 < 0 || i10 > this.f112832d) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid position: ", i10));
            }
            this.f112829a = i10;
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2516c
        public int i() {
            return this.f112832d - this.f112829a;
        }
    }

    public static AbstractC2516c j(ByteBuffer byteBuffer) {
        V.e(byteBuffer, "buffer");
        return new a(byteBuffer);
    }

    public static AbstractC2516c k(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static AbstractC2516c l(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        return new b(bArr, i10, i11);
    }

    public static AbstractC2516c m(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract AbstractC2516c h(int i10);

    public abstract int i();
}
