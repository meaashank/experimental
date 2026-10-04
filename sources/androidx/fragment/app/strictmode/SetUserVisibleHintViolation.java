package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetUserVisibleHintViolation extends Violation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(@NotNull Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        G.p(fragment, "fragment");
        this.f113892b = z10;
    }

    public final boolean g() {
        return this.f113892b;
    }
}
