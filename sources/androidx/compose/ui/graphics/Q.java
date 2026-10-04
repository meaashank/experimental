package androidx.compose.ui.graphics;

import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    @NotNull
    public static final X1 a(@NotNull ViewGroup viewGroup) {
        return new O(viewGroup);
    }

    public static final boolean b(@NotNull X1 x12) {
        kotlin.jvm.internal.G.n(x12, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidGraphicsContext");
        return ((O) x12).l();
    }

    public static final boolean c() {
        return false;
    }
}
