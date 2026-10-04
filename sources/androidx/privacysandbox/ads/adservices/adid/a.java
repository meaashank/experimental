package androidx.privacysandbox.ads.adservices.adid;

import androidx.compose.animation.C1635o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f116019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116020b;

    public a(@NotNull String adId, boolean z10) {
        G.p(adId, "adId");
        this.f116019a = adId;
        this.f116020b = z10;
    }

    @NotNull
    public final String a() {
        return this.f116019a;
    }

    public final boolean b() {
        return this.f116020b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f116019a, aVar.f116019a) && this.f116020b == aVar.f116020b;
    }

    public int hashCode() {
        return C1635o.a(this.f116020b) + (this.f116019a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AdId: adId=" + this.f116019a + ", isLimitAdTrackingEnabled=" + this.f116020b;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}
