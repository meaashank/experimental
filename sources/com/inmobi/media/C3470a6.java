package com.inmobi.media;

import androidx.collection.C1550p;

/* JADX INFO: renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3470a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f152697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f152699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f152700i;

    public C3470a6(long j10, String impressionId, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z10, String landingScheme) {
        kotlin.jvm.internal.G.p(impressionId, "impressionId");
        kotlin.jvm.internal.G.p(placementType, "placementType");
        kotlin.jvm.internal.G.p(adType, "adType");
        kotlin.jvm.internal.G.p(markupType, "markupType");
        kotlin.jvm.internal.G.p(creativeType, "creativeType");
        kotlin.jvm.internal.G.p(metaDataBlob, "metaDataBlob");
        kotlin.jvm.internal.G.p(landingScheme, "landingScheme");
        this.f152692a = j10;
        this.f152693b = impressionId;
        this.f152694c = placementType;
        this.f152695d = adType;
        this.f152696e = markupType;
        this.f152697f = creativeType;
        this.f152698g = metaDataBlob;
        this.f152699h = z10;
        this.f152700i = landingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3470a6)) {
            return false;
        }
        C3470a6 c3470a6 = (C3470a6) obj;
        return this.f152692a == c3470a6.f152692a && kotlin.jvm.internal.G.g(this.f152693b, c3470a6.f152693b) && kotlin.jvm.internal.G.g(this.f152694c, c3470a6.f152694c) && kotlin.jvm.internal.G.g(this.f152695d, c3470a6.f152695d) && kotlin.jvm.internal.G.g(this.f152696e, c3470a6.f152696e) && kotlin.jvm.internal.G.g(this.f152697f, c3470a6.f152697f) && kotlin.jvm.internal.G.g(this.f152698g, c3470a6.f152698g) && this.f152699h == c3470a6.f152699h && kotlin.jvm.internal.G.g(this.f152700i, c3470a6.f152700i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f152698g, androidx.compose.foundation.text.modifiers.l.a(this.f152697f, androidx.compose.foundation.text.modifiers.l.a(this.f152696e, androidx.compose.foundation.text.modifiers.l.a(this.f152695d, androidx.compose.foundation.text.modifiers.l.a(this.f152694c, androidx.compose.foundation.text.modifiers.l.a(this.f152693b, C1550p.a(this.f152692a) * 31, 31), 31), 31), 31), 31), 31);
        boolean z10 = this.f152699h;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        return this.f152700i.hashCode() + ((iA + r22) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingPageTelemetryMetaData(placementId=");
        sb2.append(this.f152692a);
        sb2.append(", impressionId=");
        sb2.append(this.f152693b);
        sb2.append(", placementType=");
        sb2.append(this.f152694c);
        sb2.append(", adType=");
        sb2.append(this.f152695d);
        sb2.append(", markupType=");
        sb2.append(this.f152696e);
        sb2.append(", creativeType=");
        sb2.append(this.f152697f);
        sb2.append(", metaDataBlob=");
        sb2.append(this.f152698g);
        sb2.append(", isRewarded=");
        sb2.append(this.f152699h);
        sb2.append(", landingScheme=");
        return androidx.compose.runtime.R0.a(sb2, this.f152700i, ')');
    }
}
