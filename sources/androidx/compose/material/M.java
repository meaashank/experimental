package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.b;
import androidx.compose.foundation.interaction.c;
import androidx.compose.foundation.interaction.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final M f96475a = new M();

    @Nullable
    public final InterfaceC1587h<k0.i> a(@NotNull androidx.compose.foundation.interaction.d dVar) {
        if ((dVar instanceof i.b) || (dVar instanceof a.b) || (dVar instanceof c.a) || (dVar instanceof b.a)) {
            return N.f96616a;
        }
        return null;
    }

    @Nullable
    public final InterfaceC1587h<k0.i> b(@NotNull androidx.compose.foundation.interaction.d dVar) {
        if (!(dVar instanceof i.b) && !(dVar instanceof a.b)) {
            if (dVar instanceof c.a) {
                return N.f96618c;
            }
            if (dVar instanceof b.a) {
                return N.f96617b;
            }
            return null;
        }
        return N.f96617b;
    }
}
