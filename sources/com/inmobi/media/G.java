package com.inmobi.media;

import androidx.activity.C1477d;

/* JADX INFO: loaded from: classes5.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0 f151952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f151954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f151956e;

    public G(G0 adUnitTelemetry, String str, Boolean bool, String str2, byte b10) {
        kotlin.jvm.internal.G.p(adUnitTelemetry, "adUnitTelemetry");
        this.f151952a = adUnitTelemetry;
        this.f151953b = str;
        this.f151954c = bool;
        this.f151955d = str2;
        this.f151956e = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.G.g(this.f151952a, g10.f151952a) && kotlin.jvm.internal.G.g(this.f151953b, g10.f151953b) && kotlin.jvm.internal.G.g(this.f151954c, g10.f151954c) && kotlin.jvm.internal.G.g(this.f151955d, g10.f151955d) && this.f151956e == g10.f151956e;
    }

    public final int hashCode() {
        int iHashCode = this.f151952a.hashCode() * 31;
        String str = this.f151953b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f151954c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f151955d;
        return this.f151956e + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdNotReadyMetadata(adUnitTelemetry=");
        sb2.append(this.f151952a);
        sb2.append(", creativeType=");
        sb2.append(this.f151953b);
        sb2.append(", isRewarded=");
        sb2.append(this.f151954c);
        sb2.append(", markupType=");
        sb2.append(this.f151955d);
        sb2.append(", adState=");
        return C1477d.a(sb2, this.f151956e, ')');
    }
}
