package l2;

import androidx.privacysandbox.ads.adservices.customaudience.CustomAudience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CustomAudience f220912a;

    public F(@NotNull CustomAudience customAudience) {
        kotlin.jvm.internal.G.p(customAudience, "customAudience");
        this.f220912a = customAudience;
    }

    @NotNull
    public final CustomAudience a() {
        return this.f220912a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return kotlin.jvm.internal.G.g(this.f220912a, ((F) obj).f220912a);
        }
        return false;
    }

    public int hashCode() {
        return this.f220912a.hashCode();
    }

    @NotNull
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.f220912a;
    }
}
