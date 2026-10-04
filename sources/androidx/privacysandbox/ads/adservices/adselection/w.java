package androidx.privacysandbox.ads.adservices.adselection;

import androidx.collection.C1550p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f116036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f116037b;

    public w(long j10, @NotNull a adSelectionConfig) {
        G.p(adSelectionConfig, "adSelectionConfig");
        this.f116036a = j10;
        this.f116037b = adSelectionConfig;
    }

    @NotNull
    public final a a() {
        return this.f116037b;
    }

    public final long b() {
        return this.f116036a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f116036a == wVar.f116036a && G.g(this.f116037b, wVar.f116037b);
    }

    public int hashCode() {
        return this.f116037b.hashCode() + (C1550p.a(this.f116036a) * 31);
    }

    @NotNull
    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.f116036a + ", adSelectionConfig=" + this.f116037b;
    }
}
