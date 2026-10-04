package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Y0 extends W0<X0, X0> {
    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public X0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(X0 x02) {
        return x02.f();
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(X0 x02) {
        return x02.g();
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public X0 k(X0 x02, X0 x03) {
        return x03.equals(X0.f112772g) ? x02 : X0.o(x02, x03);
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public X0 n() {
        return new X0();
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, X0 x02) {
        p(obj, x02);
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, X0 x02) {
        ((GeneratedMessageLite) obj).unknownFields = x02;
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public X0 r(X0 x02) {
        x02.f112777e = false;
        return x02;
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(X0 x02, Writer writer) throws IOException {
        x02.t(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(X0 x02, Writer writer) throws IOException {
        x02.w(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    public void j(Object obj) {
        g(obj).f112777e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    public boolean q(F0 f02) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(X0 x02, int i10, int i11) {
        x02.r((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(X0 x02, int i10, long j10) {
        x02.r((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(X0 x02, int i10, X0 x03) {
        x02.r((i10 << 3) | 3, x03);
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(X0 x02, int i10, ByteString byteString) {
        x02.r((i10 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(X0 x02, int i10, long j10) {
        x02.r(i10 << 3, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.W0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public X0 f(Object obj) {
        X0 x0G = g(obj);
        if (x0G != X0.f112772g) {
            return x0G;
        }
        X0 x02 = new X0();
        p(obj, x02);
        return x02;
    }
}
