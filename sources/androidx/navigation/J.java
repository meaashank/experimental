package androidx.navigation;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class J {
    @NotNull
    public static final NavOptions a(@NotNull ed.l<? super NavOptionsBuilder, L0> optionsBuilder) {
        kotlin.jvm.internal.G.p(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        return navOptionsBuilder.b();
    }
}
