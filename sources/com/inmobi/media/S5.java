package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152434b;

    public S5(int i10) {
        this.f152433a = i10;
        this.f152434b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5)) {
            return false;
        }
        S5 s52 = (S5) obj;
        return this.f152433a == s52.f152433a && kotlin.jvm.internal.G.g(this.f152434b, s52.f152434b);
    }

    public final int hashCode() {
        int i10 = this.f152433a * 31;
        Integer num = this.f152434b;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f152433a + ", errorCode=" + this.f152434b + ')';
    }

    public S5(int i10, Integer num) {
        this.f152433a = i10;
        this.f152434b = num;
    }
}
