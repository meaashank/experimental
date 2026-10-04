package androidx.compose.foundation.lazy.staggeredgrid;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q {
    public static /* synthetic */ void a(r rVar, Object obj, Object obj2, B b10, ed.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        if ((i10 & 4) != 0) {
            b10 = null;
        }
        rVar.i(obj, obj2, b10, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(r rVar, int i10, ed.l lVar, ed.l lVar2, ed.l lVar3, ed.r rVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = new ed.l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$items$1
                @Nullable
                public final Void e(int i12) {
                    return null;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    ((Number) obj2).intValue();
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            lVar3 = null;
        }
        rVar.d(i10, lVar, lVar2, lVar3, rVar2);
    }
}
