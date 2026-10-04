package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C1837v;
import androidx.compose.foundation.text.selection.l;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.S;
import androidx.compose.ui.text.Z;
import ed.InterfaceC4376a;
import kotlin.G;
import kotlin.I;
import kotlin.LazyThreadSafetyMode;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    public static final l e(u uVar, InterfaceC1831b interfaceC1831b) {
        boolean z10 = uVar.d() == CrossStatus.CROSSED;
        return new l(f(uVar.h(), z10, true, uVar.i(), interfaceC1831b), f(uVar.g(), z10, false, uVar.k(), interfaceC1831b), z10);
    }

    public static final l.a f(k kVar, boolean z10, boolean z11, int i10, InterfaceC1831b interfaceC1831b) {
        int i11 = z11 ? kVar.f94990c : kVar.f94991d;
        if (i10 != kVar.f94989b) {
            return kVar.a(i11);
        }
        long jA = interfaceC1831b.a(kVar, i11);
        return kVar.a(z10 ^ z11 ? Z.n(jA) : Z.i(jA));
    }

    public static final l.a g(l.a aVar, k kVar, int i10) {
        return l.a.e(aVar, kVar.f94993f.f104309b.c(i10), i10, 0L, 4, null);
    }

    @NotNull
    public static final l h(@NotNull l lVar, @NotNull u uVar) {
        if (SelectionLayoutKt.d(lVar, uVar)) {
            return (uVar.getSize() > 1 || uVar.e() == null || uVar.c().c().length() == 0) ? lVar : i(lVar, uVar);
        }
        return lVar;
    }

    public static final l i(l lVar, u uVar) {
        k kVarC = uVar.c();
        String strC = kVarC.c();
        int i10 = kVarC.f94990c;
        int length = strC.length();
        if (i10 == 0) {
            int iA = C1837v.a(strC, 0);
            return uVar.a() ? l.e(lVar, g(lVar.f94995a, kVarC, iA), null, true, 2, null) : l.e(lVar, null, g(lVar.f94996b, kVarC, iA), false, 1, null);
        }
        if (i10 == length) {
            int iB = C1837v.b(strC, length);
            return uVar.a() ? l.e(lVar, g(lVar.f94995a, kVarC, iB), null, false, 2, null) : l.e(lVar, null, g(lVar.f94996b, kVarC, iB), true, 1, null);
        }
        l lVarE = uVar.e();
        boolean z10 = lVarE != null && lVarE.f94997c;
        int iB2 = uVar.a() ^ z10 ? C1837v.b(strC, i10) : C1837v.a(strC, i10);
        return uVar.a() ? l.e(lVar, g(lVar.f94995a, kVarC, iB2), null, z10, 2, null) : l.e(lVar, null, g(lVar.f94996b, kVarC, iB2), z10, 1, null);
    }

    public static final boolean j(k kVar, int i10, boolean z10) {
        int i11 = kVar.f94992e;
        if (i11 == -1) {
            return true;
        }
        if (i10 == i11) {
            return false;
        }
        return z10 ^ (kVar.d() == CrossStatus.CROSSED) ? i10 < kVar.f94992e : i10 > kVar.f94992e;
    }

    public static final l.a k(k kVar, int i10, int i11, int i12, boolean z10, boolean z11) {
        int iV;
        long jI = kVar.f94993f.f104309b.I(i11);
        if (kVar.f94993f.f104309b.q(Z.n(jI)) == i10) {
            iV = (int) (jI >> 32);
        } else {
            MultiParagraph multiParagraph = kVar.f94993f.f104309b;
            int i13 = multiParagraph.f104270f;
            iV = i10 >= i13 ? multiParagraph.v(i13 - 1) : multiParagraph.v(i10);
        }
        S s10 = kVar.f94993f;
        int iQ = (int) (jI & ZipKt.f225990j);
        if (s10.f104309b.q(iQ) != i10) {
            S s11 = kVar.f94993f;
            int i14 = s11.f104309b.f104270f;
            iQ = i10 >= i14 ? S.q(s11, i14 - 1, false, 2, null) : S.q(s11, i10, false, 2, null);
        }
        if (iV == i12) {
            return kVar.a(iQ);
        }
        if (iQ == i12) {
            return kVar.a(iV);
        }
        if (!(z10 ^ z11) ? i11 >= iV : i11 > iQ) {
            iV = iQ;
        }
        return kVar.a(iV);
    }

    public static final l.a l(final u uVar, final k kVar, l.a aVar) {
        final int i10 = uVar.a() ? kVar.f94990c : kVar.f94991d;
        if ((uVar.a() ? uVar.i() : uVar.k()) != kVar.f94989b) {
            return kVar.a(i10);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final G gC = I.c(lazyThreadSafetyMode, new InterfaceC4376a<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                S s10 = kVar.f94993f;
                return Integer.valueOf(s10.f104309b.q(i10));
            }
        });
        final int i11 = uVar.a() ? kVar.f94991d : kVar.f94990c;
        G gC2 = I.c(lazyThreadSafetyMode, new InterfaceC4376a<l.a>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final l.a invoke() {
                return SelectionAdjustmentKt.k(kVar, SelectionAdjustmentKt.m(gC), i10, i11, uVar.a(), uVar.d() == CrossStatus.CROSSED);
            }
        });
        if (kVar.f94988a != aVar.f95001c) {
            return (l.a) gC2.getValue();
        }
        int i12 = kVar.f94992e;
        if (i10 == i12) {
            return aVar;
        }
        if (((Number) gC.getValue()).intValue() != kVar.f94993f.f104309b.q(i12)) {
            return (l.a) gC2.getValue();
        }
        int i13 = aVar.f95000b;
        long jI = kVar.f94993f.f104309b.I(i13);
        return !j(kVar, i10, uVar.a()) ? kVar.a(i10) : (i13 == Z.n(jI) || i13 == ((int) (jI & ZipKt.f225990j))) ? (l.a) gC2.getValue() : kVar.a(i10);
    }

    public static final int m(G<Integer> g10) {
        return g10.getValue().intValue();
    }

    public static final l.a n(G<l.a> g10) {
        return g10.getValue();
    }
}
