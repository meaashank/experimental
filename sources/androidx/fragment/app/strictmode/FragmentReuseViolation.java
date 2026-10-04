package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentReuseViolation extends Violation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f113880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        G.p(fragment, "fragment");
        G.p(previousFragmentId, "previousFragmentId");
        this.f113880b = previousFragmentId;
    }

    @NotNull
    public final String g() {
        return this.f113880b;
    }
}
