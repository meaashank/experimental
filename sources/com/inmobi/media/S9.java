package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class S9 extends U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152440b;

    public S9(String message, int i10) {
        kotlin.jvm.internal.G.p(message, "message");
        this.f152439a = i10;
        this.f152440b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S9)) {
            return false;
        }
        S9 s92 = (S9) obj;
        return this.f152439a == s92.f152439a && kotlin.jvm.internal.G.g(this.f152440b, s92.f152440b);
    }

    public final int hashCode() {
        return this.f152440b.hashCode() + (this.f152439a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Failure(statusCode=");
        sb2.append(this.f152439a);
        sb2.append(", message=");
        return androidx.compose.runtime.R0.a(sb2, this.f152440b, ')');
    }
}
