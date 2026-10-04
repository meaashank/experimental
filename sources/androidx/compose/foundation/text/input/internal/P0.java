package androidx.compose.foundation.text.input.internal;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class P0 {
    public static final int a(int i10, int i11, @NotNull InterfaceC4376a<Integer> interfaceC4376a) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? interfaceC4376a.invoke().intValue() : i12;
    }

    public static final float b(long j10, P.j jVar) {
        if (androidx.compose.foundation.text.selection.w.d(jVar, j10)) {
            return 0.0f;
        }
        float fN = P.g.n(P.g.u(jVar.E(), j10));
        if (fN >= Float.MAX_VALUE) {
            fN = Float.MAX_VALUE;
        }
        float fN2 = P.g.n(P.g.u(jVar.F(), j10));
        if (fN2 < fN) {
            fN = fN2;
        }
        float fN3 = P.g.n(P.g.u(jVar.m(), j10));
        if (fN3 < fN) {
            fN = fN3;
        }
        float fN4 = P.g.n(P.g.u(jVar.n(), j10));
        return fN4 < fN ? fN4 : fN;
    }

    public static final int c(long j10, @NotNull P.j jVar, @NotNull P.j jVar2) {
        float fB = b(j10, jVar);
        float fB2 = b(j10, jVar2);
        if (fB == fB2) {
            return 0;
        }
        return fB < fB2 ? -1 : 1;
    }

    public static final int d(int i10, int i11, @NotNull InterfaceC4376a<Integer> interfaceC4376a) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? interfaceC4376a.invoke().intValue() : i12;
    }
}
