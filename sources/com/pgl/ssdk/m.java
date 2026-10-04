package com.pgl.ssdk;

/* JADX INFO: loaded from: classes5.dex */
public final class m<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f161879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f161880b;

    public m(A a10, B b10) {
        this.f161879a = a10;
        this.f161880b = b10;
    }

    public static <A, B> m<A, B> a(A a10, B b10) {
        return new m<>(a10, b10);
    }

    public B b() {
        return this.f161880b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        A a10 = this.f161879a;
        if (a10 == null) {
            if (mVar.f161879a != null) {
                return false;
            }
        } else if (!a10.equals(mVar.f161879a)) {
            return false;
        }
        B b10 = this.f161880b;
        if (b10 == null) {
            if (mVar.f161880b != null) {
                return false;
            }
        } else if (!b10.equals(mVar.f161880b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f161879a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f161880b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public A a() {
        return this.f161879a;
    }
}
