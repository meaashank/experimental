package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<b> f116135a;

    public a(@NotNull List<b> topics) {
        G.p(topics, "topics");
        this.f116135a = topics;
    }

    @NotNull
    public final List<b> a() {
        return this.f116135a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f116135a.size() != aVar.f116135a.size()) {
            return false;
        }
        return new HashSet(this.f116135a).equals(new HashSet(aVar.f116135a));
    }

    public int hashCode() {
        return Objects.hash(this.f116135a);
    }

    @NotNull
    public String toString() {
        return "Topics=" + this.f116135a;
    }
}
