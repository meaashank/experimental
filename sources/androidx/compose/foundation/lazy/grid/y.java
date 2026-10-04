package androidx.compose.foundation.lazy.grid;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(z zVar, Object obj, ed.l lVar, Object obj2, ed.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        zVar.h(obj, lVar, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(z zVar, int i10, ed.l lVar, ed.p pVar, ed.l lVar2, ed.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        if ((i11 & 8) != 0) {
            lVar2 = new ed.l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1
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
        zVar.g(i10, lVar, pVar, lVar2, rVar);
    }
}
