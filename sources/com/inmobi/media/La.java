package com.inmobi.media;

import androidx.compose.animation.core.C1618x;

/* JADX INFO: loaded from: classes5.dex */
public final class La {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152195b;

    public La(int i10, int i11) {
        this.f152194a = i10;
        this.f152195b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof La)) {
            return false;
        }
        La la2 = (La) obj;
        return this.f152194a == la2.f152194a && this.f152195b == la2.f152195b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return C1618x.a(1.0d) + ((this.f152195b + (this.f152194a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryPolicy(maxNoOfRetries=");
        sb2.append(this.f152194a);
        sb2.append(", delayInMillis=");
        return android.support.v4.media.d.a(sb2, this.f152195b, ", delayFactor=1.0)");
    }
}
