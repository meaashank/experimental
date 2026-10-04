package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B1 {
    public static final double a(@NotNull W w10, @Nullable Object obj, @NotNull kotlin.reflect.n<?> nVar) {
        return w10.getDoubleValue();
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final D0 b(double d10) {
        return ActualAndroid_androidKt.a(d10);
    }

    public static final void c(@NotNull D0 d02, @Nullable Object obj, @NotNull kotlin.reflect.n<?> nVar, double d10) {
        d02.setDoubleValue(d10);
    }
}
