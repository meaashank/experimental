package androidx.core.util;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements B {
    @Override // androidx.core.util.B
    public /* synthetic */ B a(B b10) {
        return A.a(this, b10);
    }

    @Override // androidx.core.util.B
    public /* synthetic */ B b(B b10) {
        return A.c(this, b10);
    }

    @Override // androidx.core.util.B
    public B negate() {
        return new z(this);
    }

    @Override // androidx.core.util.B
    public final boolean test(Object obj) {
        return obj == null;
    }
}
