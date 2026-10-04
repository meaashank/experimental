package androidx.compose.animation.core;

import P.g;
import P.j;
import P.n;
import java.util.Map;
import k0.i;
import k0.k;
import k0.t;
import k0.x;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n169#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88092a = 0.1f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88093b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final P.j f88094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<H0<?, ?>, Float> f88095d;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f88094c = new P.j(0.5f, 0.5f, 0.5f, 0.5f);
        H0<Integer, C1595l> h0J = VectorConvertersKt.j(kotlin.jvm.internal.E.f217875a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = new Pair(h0J, fValueOf2);
        Pair pair2 = new Pair(VectorConvertersKt.f88019h, fValueOf2);
        Pair pair3 = new Pair(VectorConvertersKt.f88018g, fValueOf2);
        Pair pair4 = new Pair(VectorConvertersKt.f88012a, Float.valueOf(0.01f));
        Pair pair5 = new Pair(VectorConvertersKt.f88020i, fValueOf);
        Pair pair6 = new Pair(VectorConvertersKt.f88016e, fValueOf);
        Pair pair7 = new Pair(VectorConvertersKt.f88017f, fValueOf);
        H0<k0.i, C1595l> h02 = VectorConvertersKt.f88014c;
        Float fValueOf3 = Float.valueOf(0.1f);
        f88095d = kotlin.collections.n0.W(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(h02, fValueOf3), new Pair(VectorConvertersKt.f88015d, fValueOf3));
    }

    public static final float a(@NotNull i.a aVar) {
        return 0.1f;
    }

    public static final int b(@NotNull kotlin.jvm.internal.E e10) {
        return 1;
    }

    public static final long c(@NotNull g.a aVar) {
        return P.h.a(0.5f, 0.5f);
    }

    public static final long d(@NotNull n.a aVar) {
        return P.o.a(0.5f, 0.5f);
    }

    public static final long e(@NotNull k.a aVar) {
        return k0.j.a(0.1f, 0.1f);
    }

    public static final long f(@NotNull t.a aVar) {
        return k0.u.a(1, 1);
    }

    public static final long g(@NotNull x.a aVar) {
        return k0.y.a(1, 1);
    }

    @NotNull
    public static final P.j h(@NotNull j.a aVar) {
        return f88094c;
    }

    @NotNull
    public static final Map<H0<?, ?>, Float> i() {
        return f88095d;
    }
}
