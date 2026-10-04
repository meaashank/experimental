package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Fragment f113890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(@NotNull Fragment fragment, @NotNull Fragment targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        G.p(fragment, "fragment");
        G.p(targetFragment, "targetFragment");
        this.f113890b = targetFragment;
        this.f113891c = i10;
    }

    public final int g() {
        return this.f113891c;
    }

    @NotNull
    public final Fragment h() {
        return this.f113890b;
    }
}
