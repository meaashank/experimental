package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Fragment f113893a;

    public /* synthetic */ Violation(Fragment fragment, String str, int i10, C4969v c4969v) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    @NotNull
    public final Fragment d() {
        return this.f113893a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(@NotNull Fragment fragment, @Nullable String str) {
        super(str);
        G.p(fragment, "fragment");
        this.f113893a = fragment;
    }
}
