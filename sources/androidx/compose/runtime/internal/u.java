package androidx.compose.runtime.internal;

import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final int a(@Nullable Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void b(@NotNull InterfaceC1946s interfaceC1946s, @NotNull ed.p<? super InterfaceC1946s, ? super Integer, L0> pVar) {
        G.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        Y.q(pVar, 2);
        pVar.invoke(interfaceC1946s, 1);
    }
}
