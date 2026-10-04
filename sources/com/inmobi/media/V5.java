package com.inmobi.media;

import androidx.compose.animation.C1636p;

/* JADX INFO: loaded from: classes5.dex */
public final class V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152519c;

    public V5(boolean z10, String landingScheme, boolean z11) {
        kotlin.jvm.internal.G.p(landingScheme, "landingScheme");
        this.f152517a = z10;
        this.f152518b = landingScheme;
        this.f152519c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V5)) {
            return false;
        }
        V5 v52 = (V5) obj;
        return this.f152517a == v52.f152517a && kotlin.jvm.internal.G.g(this.f152518b, v52.f152518b) && this.f152519c == v52.f152519c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final int hashCode() {
        boolean z10 = this.f152517a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f152518b, r02 * 31, 31);
        boolean z11 = this.f152519c;
        return iA + (z11 ? 1 : z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingPageState(isInAppBrowser=");
        sb2.append(this.f152517a);
        sb2.append(", landingScheme=");
        sb2.append(this.f152518b);
        sb2.append(", isCCTEnabled=");
        return C1636p.a(sb2, this.f152519c, ')');
    }
}
