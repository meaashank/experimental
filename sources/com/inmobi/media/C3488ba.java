package com.inmobi.media;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3488ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f152729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152730b;

    public C3488ba(byte b10, String assetUrl) {
        kotlin.jvm.internal.G.p(assetUrl, "assetUrl");
        this.f152729a = b10;
        this.f152730b = assetUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3488ba)) {
            return false;
        }
        C3488ba c3488ba = (C3488ba) obj;
        return this.f152729a == c3488ba.f152729a && kotlin.jvm.internal.G.g(this.f152730b, c3488ba.f152730b);
    }

    public final int hashCode() {
        return this.f152730b.hashCode() + (this.f152729a * Ascii.US);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RawAsset(mRawAssetType=");
        sb2.append((int) this.f152729a);
        sb2.append(", assetUrl=");
        return androidx.compose.runtime.R0.a(sb2, this.f152730b, ')');
    }
}
