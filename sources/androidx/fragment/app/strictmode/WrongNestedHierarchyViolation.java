package androidx.fragment.app.strictmode;

import android.support.v4.media.d;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WrongNestedHierarchyViolation extends Violation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Fragment f113895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113896c;

    public WrongNestedHierarchyViolation(@NotNull Fragment fragment, @NotNull Fragment expectedParentFragment, int i10) {
        G.p(fragment, "fragment");
        G.p(expectedParentFragment, "expectedParentFragment");
        StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
        sb2.append(fragment);
        sb2.append(" within the view of parent fragment ");
        sb2.append(expectedParentFragment);
        sb2.append(" via container with ID ");
        super(fragment, d.a(sb2, i10, " without using parent's childFragmentManager"));
        this.f113895b = expectedParentFragment;
        this.f113896c = i10;
    }

    public final int g() {
        return this.f113896c;
    }

    @NotNull
    public final Fragment h() {
        return this.f113895b;
    }
}
