package androidx.window.embedding;

import K2.a;
import androidx.compose.animation.C1635o;
import androidx.window.core.d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@d
public final class ActivityRule extends EmbeddingRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f120083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<a> f120084b;

    public ActivityRule(@NotNull Set<a> filters, boolean z10) {
        G.p(filters, "filters");
        this.f120083a = z10;
        this.f120084b = U.f6(filters);
    }

    public final boolean a() {
        return this.f120083a;
    }

    @NotNull
    public final Set<a> b() {
        return this.f120084b;
    }

    @NotNull
    public final ActivityRule c(@NotNull a filter) {
        G.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f120084b);
        linkedHashSet.add(filter);
        return new ActivityRule(U.f6(linkedHashSet), this.f120083a);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return G.g(this.f120084b, activityRule.f120084b) && this.f120083a == activityRule.f120083a;
    }

    public int hashCode() {
        return C1635o.a(this.f120083a) + (this.f120084b.hashCode() * 31);
    }

    public /* synthetic */ ActivityRule(Set set, boolean z10, int i10, C4969v c4969v) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }
}
