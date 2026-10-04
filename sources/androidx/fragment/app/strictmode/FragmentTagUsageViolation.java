package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ViewGroup f113889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(@NotNull Fragment fragment, @Nullable ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        G.p(fragment, "fragment");
        this.f113889b = viewGroup;
    }

    @Nullable
    public final ViewGroup g() {
        return this.f113889b;
    }
}
