package com.inmobi.media;

import androidx.compose.animation.core.C1618x;

/* JADX INFO: loaded from: classes5.dex */
public final class M4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3568h6 f152221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f152222b;

    public M4(EnumC3568h6 logLevel, double d10) {
        kotlin.jvm.internal.G.p(logLevel, "logLevel");
        this.f152221a = logLevel;
        this.f152222b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M4)) {
            return false;
        }
        M4 m42 = (M4) obj;
        return this.f152221a == m42.f152221a && Double.compare(this.f152222b, m42.f152222b) == 0;
    }

    public final int hashCode() {
        return C1618x.a(this.f152222b) + (this.f152221a.hashCode() * 31);
    }

    public final String toString() {
        return "LoggerConfiguration(logLevel=" + this.f152221a + ", samplingFactor=" + this.f152222b + ')';
    }
}
