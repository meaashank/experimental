package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.l;
import androidx.compose.ui.layout.C2189y;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.text.Z;
import e.f0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n33#2,6:1074\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n945#1:1074,6\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final P.j f95032a = new P.j(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95033a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95033a = iArr;
        }
    }

    public static final long c(@NotNull SelectionManager selectionManager, long j10) {
        l lVarI = selectionManager.I();
        if (lVarI == null) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        Handle handleY = selectionManager.y();
        int i10 = handleY == null ? -1 : a.f95033a[handleY.ordinal()];
        if (i10 == -1) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        if (i10 == 1) {
            return f(selectionManager, j10, lVarI.f94995a);
        }
        if (i10 == 2) {
            return f(selectionManager, j10, lVarI.f94996b);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    public static final boolean d(@NotNull P.j jVar, long j10) {
        float f10 = jVar.f65511a;
        float f11 = jVar.f65513c;
        float fP = P.g.p(j10);
        if (f10 > fP || fP > f11) {
            return false;
        }
        float f12 = jVar.f65512b;
        float f13 = jVar.f65514d;
        float fR = P.g.r(j10);
        return f12 <= fR && fR <= f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> e(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : I.Q(U.G2(list), U.u3(list));
    }

    public static final long f(SelectionManager selectionManager, long j10, l.a aVar) {
        float fJ;
        j jVarR = selectionManager.r(aVar);
        if (jVarR == null) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        InterfaceC2188x interfaceC2188x = selectionManager.f94820k;
        if (interfaceC2188x == null) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        InterfaceC2188x interfaceC2188xK = jVarR.K();
        if (interfaceC2188xK == null) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        int i10 = aVar.f95000b;
        if (i10 > jVarR.g()) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        P.g gVarV = selectionManager.v();
        G.m(gVarV);
        float fP = P.g.p(interfaceC2188xK.k0(interfaceC2188x, gVarV.f65507a));
        long jL = jVarR.l(i10);
        if (Z.h(jL)) {
            fJ = jVarR.a(i10);
        } else {
            float fA = jVarR.a((int) (jL >> 32));
            float fC = jVarR.c(((int) (jL & ZipKt.f225990j)) - 1);
            fJ = md.u.J(fP, Math.min(fA, fC), Math.max(fA, fC));
        }
        if (fJ == -1.0f) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        k0.x.f214338b.getClass();
        if (!k0.x.h(j10, k0.x.f214339c) && Math.abs(fP - fJ) > ((int) (j10 >> 32)) / 2) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        float fH = jVarR.h(i10);
        if (fH != -1.0f) {
            return interfaceC2188x.k0(interfaceC2188xK, P.h.a(fJ, fH));
        }
        P.g.f65503b.getClass();
        return P.g.f65506e;
    }

    @f0
    @NotNull
    public static final P.j g(@NotNull List<? extends Pair<? extends j, l>> list, @NotNull InterfaceC2188x interfaceC2188x) {
        int i10;
        InterfaceC2188x interfaceC2188xK;
        int[] iArr;
        if (list.isEmpty()) {
            return f95032a;
        }
        P.j jVar = f95032a;
        float fMin = jVar.f65511a;
        float fMin2 = jVar.f65512b;
        float fMax = jVar.f65513c;
        float fMax2 = jVar.f65514d;
        int size = list.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Pair<? extends j, l> pair = list.get(i11);
            j jVar2 = (j) pair.f217467a;
            l lVar = pair.f217468b;
            int i12 = lVar.f94995a.f95000b;
            int i13 = lVar.f94996b.f95000b;
            if (i12 == i13 || (interfaceC2188xK = jVar2.K()) == null) {
                i10 = size;
            } else {
                int iMin = Math.min(i12, i13);
                int iMax = Math.max(i12, i13) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c10] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c10] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                P.j jVar3 = f95032a;
                float fMin3 = jVar3.f65511a;
                float fMin4 = jVar3.f65512b;
                float fMax3 = jVar3.f65513c;
                float fMax4 = jVar3.f65514d;
                i10 = size;
                int i14 = 0;
                for (int length = iArr.length; i14 < length; length = length) {
                    int i15 = i14;
                    P.j jVarE = jVar2.e(iArr[i15]);
                    fMin3 = Math.min(fMin3, jVarE.f65511a);
                    fMin4 = Math.min(fMin4, jVarE.f65512b);
                    fMax3 = Math.max(fMax3, jVarE.f65513c);
                    fMax4 = Math.max(fMax4, jVarE.f65514d);
                    i14 = i15 + 1;
                }
                long jA = P.h.a(fMin3, fMin4);
                long jA2 = P.h.a(fMax3, fMax4);
                long jK0 = interfaceC2188x.k0(interfaceC2188xK, jA);
                long jK02 = interfaceC2188x.k0(interfaceC2188xK, jA2);
                fMin = Math.min(fMin, P.g.p(jK0));
                fMin2 = Math.min(fMin2, P.g.r(jK0));
                fMax = Math.max(fMax, P.g.p(jK02));
                fMax2 = Math.max(fMax2, P.g.r(jK02));
            }
            i11++;
            size = i10;
            c10 = 0;
        }
        return new P.j(fMin, fMin2, fMax, fMax2);
    }

    @Nullable
    public static final l h(@Nullable l lVar, @Nullable l lVar2) {
        return lVar != null ? lVar.i(lVar2) : lVar2;
    }

    @NotNull
    public static final P.j i(@NotNull InterfaceC2188x interfaceC2188x) {
        P.j jVarC = C2189y.c(interfaceC2188x);
        return P.k.a(interfaceC2188x.o0(jVarC.E()), interfaceC2188x.o0(jVarC.n()));
    }
}
