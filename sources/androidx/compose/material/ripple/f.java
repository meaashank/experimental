package androidx.compose.material.ripple;

import k0.InterfaceC4814e;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,184:1\n149#2:185\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n179#1:185\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f98872a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98873b = 75;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98874c = 225;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f98875d = 150;

    public static final float a(@NotNull InterfaceC4814e interfaceC4814e, boolean z10, long j10) {
        float fM = P.g.m(P.h.a(P.n.t(j10), P.n.m(j10))) / 2.0f;
        return z10 ? interfaceC4814e.l2(f98872a) + fM : fM;
    }

    public static final float b(long j10) {
        return Math.max(P.n.t(j10), P.n.m(j10)) * 0.3f;
    }
}
