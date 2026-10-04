package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InterfaceC1587h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.animation.core.G0<k0.i> f96616a = new androidx.compose.animation.core.G0<>(120, 0, androidx.compose.animation.core.P.d(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.animation.core.G0<k0.i> f96617b = new androidx.compose.animation.core.G0<>(150, 0, new androidx.compose.animation.core.A(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.animation.core.G0<k0.i> f96618c = new androidx.compose.animation.core.G0<>(120, 0, new androidx.compose.animation.core.A(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    @Nullable
    public static final Object d(@NotNull Animatable<k0.i, ?> animatable, float f10, @Nullable androidx.compose.foundation.interaction.d dVar, @Nullable androidx.compose.foundation.interaction.d dVar2, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        InterfaceC1587h<k0.i> interfaceC1587hA = dVar2 != null ? M.f96475a.a(dVar2) : dVar != null ? M.f96475a.b(dVar) : null;
        if (interfaceC1587hA != null) {
            Object objI = Animatable.i(animatable, new k0.i(f10), interfaceC1587hA, null, null, eVar, 12, null);
            return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : kotlin.L0.f217464a;
        }
        Object objC = animatable.C(new k0.i(f10), eVar);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : kotlin.L0.f217464a;
    }

    public static /* synthetic */ Object e(Animatable animatable, float f10, androidx.compose.foundation.interaction.d dVar, androidx.compose.foundation.interaction.d dVar2, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            dVar2 = null;
        }
        return d(animatable, f10, dVar, dVar2, eVar);
    }
}
