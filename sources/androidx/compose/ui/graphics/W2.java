package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final W2 f100889a = new W2();

    @InterfaceC4345t
    @NotNull
    public final RenderEffect a(@Nullable Q2 q22, float f10, float f11, int i10) {
        return q22 == null ? RenderEffect.createBlurEffect(f10, f11, C2051l0.b(i10)) : RenderEffect.createBlurEffect(f10, f11, q22.a(), C2051l0.b(i10));
    }

    @InterfaceC4345t
    @NotNull
    public final RenderEffect b(@Nullable Q2 q22, long j10) {
        return q22 == null ? RenderEffect.createOffsetEffect(P.g.p(j10), P.g.r(j10)) : RenderEffect.createOffsetEffect(P.g.p(j10), P.g.r(j10), q22.a());
    }
}
