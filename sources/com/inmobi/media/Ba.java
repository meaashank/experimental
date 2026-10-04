package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f151795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f151798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f151799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f151800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f151801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f151802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F0 f151803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ea f151804j;

    public Ba(J placement, String markupType, String telemetryMetadataBlob, int i10, String creativeType, String creativeId, boolean z10, int i11, F0 adUnitTelemetryData, Ea renderViewTelemetryData) {
        kotlin.jvm.internal.G.p(placement, "placement");
        kotlin.jvm.internal.G.p(markupType, "markupType");
        kotlin.jvm.internal.G.p(telemetryMetadataBlob, "telemetryMetadataBlob");
        kotlin.jvm.internal.G.p(creativeType, "creativeType");
        kotlin.jvm.internal.G.p(creativeId, "creativeId");
        kotlin.jvm.internal.G.p(adUnitTelemetryData, "adUnitTelemetryData");
        kotlin.jvm.internal.G.p(renderViewTelemetryData, "renderViewTelemetryData");
        this.f151795a = placement;
        this.f151796b = markupType;
        this.f151797c = telemetryMetadataBlob;
        this.f151798d = i10;
        this.f151799e = creativeType;
        this.f151800f = creativeId;
        this.f151801g = z10;
        this.f151802h = i11;
        this.f151803i = adUnitTelemetryData;
        this.f151804j = renderViewTelemetryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ba)) {
            return false;
        }
        Ba ba2 = (Ba) obj;
        return kotlin.jvm.internal.G.g(this.f151795a, ba2.f151795a) && kotlin.jvm.internal.G.g(this.f151796b, ba2.f151796b) && kotlin.jvm.internal.G.g(this.f151797c, ba2.f151797c) && this.f151798d == ba2.f151798d && kotlin.jvm.internal.G.g(this.f151799e, ba2.f151799e) && kotlin.jvm.internal.G.g(this.f151800f, ba2.f151800f) && this.f151801g == ba2.f151801g && this.f151802h == ba2.f151802h && kotlin.jvm.internal.G.g(this.f151803i, ba2.f151803i) && kotlin.jvm.internal.G.g(this.f151804j, ba2.f151804j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    public final int hashCode() {
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f151800f, androidx.compose.foundation.text.modifiers.l.a(this.f151799e, (this.f151798d + androidx.compose.foundation.text.modifiers.l.a(this.f151797c, androidx.compose.foundation.text.modifiers.l.a(this.f151796b, this.f151795a.hashCode() * 31, 31), 31)) * 31, 31), 31);
        boolean z10 = this.f151801g;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        return this.f151804j.f151908a + ((this.f151803i.hashCode() + ((this.f151802h + ((iA + r22) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f151795a + ", markupType=" + this.f151796b + ", telemetryMetadataBlob=" + this.f151797c + ", internetAvailabilityAdRetryCount=" + this.f151798d + ", creativeType=" + this.f151799e + ", creativeId=" + this.f151800f + ", isRewarded=" + this.f151801g + ", adIndex=" + this.f151802h + ", adUnitTelemetryData=" + this.f151803i + ", renderViewTelemetryData=" + this.f151804j + ')';
    }
}
