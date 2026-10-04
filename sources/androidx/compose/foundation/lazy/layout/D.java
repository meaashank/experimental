package androidx.compose.foundation.lazy.layout;

import k0.C4812c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f91543a = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f91544b = C4812c.b(0, 0, 0, 0, 5, null);

    @androidx.compose.foundation.L
    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @Nullable C c10) {
        androidx.compose.ui.p pVarP0;
        return (c10 == null || (pVarP0 = pVar.P0(new TraversablePrefetchStateModifierElement(c10))) == null) ? pVar : pVarP0;
    }
}
