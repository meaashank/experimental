package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3703r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153303b;

    public C3703r2(String url, String accountId) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(accountId, "accountId");
        this.f153302a = url;
        this.f153303b = accountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3703r2)) {
            return false;
        }
        C3703r2 c3703r2 = (C3703r2) obj;
        return kotlin.jvm.internal.G.g(this.f153302a, c3703r2.f153302a) && kotlin.jvm.internal.G.g(this.f153303b, c3703r2.f153303b);
    }

    public final int hashCode() {
        return this.f153303b.hashCode() + (this.f153302a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigIdentifier(url=");
        sb2.append(this.f153302a);
        sb2.append(", accountId=");
        return androidx.compose.runtime.R0.a(sb2, this.f153303b, ')');
    }
}
