package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewGroup f113894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(@NotNull Fragment fragment, @NotNull ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        G.p(fragment, "fragment");
        G.p(container, "container");
        this.f113894b = container;
    }

    @NotNull
    public final ViewGroup g() {
        return this.f113894b;
    }
}
