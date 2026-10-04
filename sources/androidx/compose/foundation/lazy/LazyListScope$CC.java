package androidx.compose.foundation.lazy;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LazyListScope$CC {
    public static void b(x xVar, @Nullable Object obj, @Nullable Object obj2, @NotNull ed.q qVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    public static void c(x xVar, int i10, @Nullable ed.l lVar, @NotNull ed.l lVar2, @NotNull ed.r rVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static /* synthetic */ void d(x xVar, int i10, ed.l lVar, ed.r rVar) {
        xVar.f(i10, lVar, LazyListScope$items$2.f91111d, rVar);
    }

    public static /* synthetic */ void f(x xVar, Object obj, Object obj2, ed.q qVar) {
        b(xVar, obj, obj2, qVar);
        throw null;
    }

    public static /* synthetic */ void g(x xVar, int i10, ed.l lVar, ed.l lVar2, ed.r rVar) {
        c(xVar, i10, lVar, lVar2, rVar);
        throw null;
    }

    public static /* synthetic */ void i(x xVar, Object obj, ed.q qVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        xVar.c(obj, qVar);
    }

    public static /* synthetic */ void j(x xVar, Object obj, Object obj2, ed.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        xVar.b(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(x xVar, int i10, ed.l lVar, ed.l lVar2, ed.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = new ed.l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
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
        xVar.f(i10, lVar, lVar2, rVar);
    }

    public static /* synthetic */ void l(x xVar, int i10, ed.l lVar, ed.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        xVar.e(i10, lVar, rVar);
    }

    public static /* synthetic */ void m(x xVar, Object obj, Object obj2, ed.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        xVar.a(obj, obj2, qVar);
    }
}
