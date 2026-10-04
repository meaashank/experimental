package l2;

import android.net.Uri;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f220915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f220916b;

    public H(@NotNull Uri trustedBiddingUri, @NotNull List<String> trustedBiddingKeys) {
        kotlin.jvm.internal.G.p(trustedBiddingUri, "trustedBiddingUri");
        kotlin.jvm.internal.G.p(trustedBiddingKeys, "trustedBiddingKeys");
        this.f220915a = trustedBiddingUri;
        this.f220916b = trustedBiddingKeys;
    }

    @NotNull
    public final List<String> a() {
        return this.f220916b;
    }

    @NotNull
    public final Uri b() {
        return this.f220915a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return kotlin.jvm.internal.G.g(this.f220915a, h10.f220915a) && kotlin.jvm.internal.G.g(this.f220916b, h10.f220916b);
    }

    public int hashCode() {
        return this.f220916b.hashCode() + (this.f220915a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.f220915a + " trustedBiddingKeys=" + this.f220916b;
    }
}
