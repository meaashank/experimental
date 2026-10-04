package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W0<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(B b10, int i10, T t10);

    public abstract void d(B b10, int i10, ByteString byteString);

    public abstract void e(B b10, int i10, long j10);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract T k(T t10, T t11);

    public final void l(B b10, F0 f02) throws IOException {
        while (f02.p() != Integer.MAX_VALUE && m(b10, f02)) {
        }
    }

    public final boolean m(B b10, F0 f02) throws IOException {
        int tag = f02.getTag();
        int i10 = tag >>> 3;
        int i11 = tag & 7;
        if (i11 == 0) {
            e(b10, i10, f02.w());
            return true;
        }
        if (i11 == 1) {
            b(b10, i10, f02.y());
            return true;
        }
        if (i11 == 2) {
            d(b10, i10, f02.g());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.j();
            }
            a(b10, i10, f02.J());
            return true;
        }
        B bN = n();
        int i12 = 4 | (i10 << 3);
        l(bN, f02);
        if (i12 != f02.getTag()) {
            throw InvalidProtocolBufferException.g();
        }
        c(b10, i10, r(bN));
        return true;
    }

    public abstract B n();

    public abstract void o(Object obj, B b10);

    public abstract void p(Object obj, T t10);

    public abstract boolean q(F0 f02);

    public abstract T r(B b10);

    public abstract void s(T t10, Writer writer) throws IOException;

    public abstract void t(T t10, Writer writer) throws IOException;
}
