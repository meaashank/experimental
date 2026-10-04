package F;

import e.D;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,196:1\n149#2:197\n149#2:198\n149#2:199\n149#2:200\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n143#1:197\n144#1:198\n145#1:199\n146#1:200\n*E\n"})
public final class d {
    @NotNull
    public static final c a(float f10) {
        m mVar = new m(f10);
        return new c(mVar, mVar, mVar, mVar);
    }

    @NotNull
    public static final c b(float f10, float f11, float f12, float f13) {
        return new c(new m(f10), new m(f11), new m(f12), new m(f13));
    }

    @NotNull
    public static final c c(int i10) {
        f fVarB = g.b(i10);
        return new c(fVarB, fVarB, fVarB, fVarB);
    }

    @NotNull
    public static final c d(@D(from = 0, to = 100) int i10, @D(from = 0, to = 100) int i11, @D(from = 0, to = 100) int i12, @D(from = 0, to = 100) int i13) {
        return new c(g.b(i10), g.b(i11), g.b(i12), g.b(i13));
    }

    @NotNull
    public static final c e(@NotNull f fVar) {
        return new c(fVar, fVar, fVar, fVar);
    }

    public static /* synthetic */ c f(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return b(f10, f11, f12, f13);
    }

    public static /* synthetic */ c g(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return d(i10, i11, i12, i13);
    }

    @NotNull
    public static final c h(float f10) {
        j jVar = new j(f10);
        return new c(jVar, jVar, jVar, jVar);
    }

    @NotNull
    public static final c i(float f10, float f11, float f12, float f13) {
        return new c(new j(f10), new j(f11), new j(f12), new j(f13));
    }

    public static c j(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return i(f10, f11, f12, f13);
    }
}
