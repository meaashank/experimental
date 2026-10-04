package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J3 f152457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152458b;

    public T8(J3 errorCode, String str) {
        kotlin.jvm.internal.G.p(errorCode, "errorCode");
        this.f152457a = errorCode;
        this.f152458b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T8)) {
            return false;
        }
        T8 t82 = (T8) obj;
        return this.f152457a == t82.f152457a && kotlin.jvm.internal.G.g(this.f152458b, t82.f152458b);
    }

    public final int hashCode() {
        int iHashCode = this.f152457a.hashCode() * 31;
        String str = this.f152458b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkError(errorCode=");
        sb2.append(this.f152457a);
        sb2.append(", errorMessage=");
        return androidx.compose.runtime.R0.a(sb2, this.f152458b, ')');
    }
}
