package e2;

import androidx.palette.graphics.Palette;
import androidx.palette.graphics.Target;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4356a {
    @Nullable
    public static final Palette.d a(@NotNull Palette receiver, @NotNull Target target) {
        G.q(receiver, "$receiver");
        G.q(target, "target");
        return receiver.y(target);
    }
}
