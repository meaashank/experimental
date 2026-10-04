package F;

import e.D;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,201:1\n149#2:202\n149#2:203\n149#2:204\n149#2:205\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n148#1:202\n149#1:203\n150#1:204\n151#1:205\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f33920a = c(50);

    @NotNull
    public static final n a(float f10) {
        m mVar = new m(f10);
        return new n(mVar, mVar, mVar, mVar);
    }

    @NotNull
    public static final n b(float f10, float f11, float f12, float f13) {
        return new n(new m(f10), new m(f11), new m(f12), new m(f13));
    }

    @NotNull
    public static final n c(int i10) {
        f fVarB = g.b(i10);
        return new n(fVarB, fVarB, fVarB, fVarB);
    }

    @NotNull
    public static final n d(@D(from = 0, to = 100) int i10, @D(from = 0, to = 100) int i11, @D(from = 0, to = 100) int i12, @D(from = 0, to = 100) int i13) {
        return new n(g.b(i10), g.b(i11), g.b(i12), g.b(i13));
    }

    @NotNull
    public static final n e(@NotNull f fVar) {
        return new n(fVar, fVar, fVar, fVar);
    }

    public static /* synthetic */ n f(float f10, float f11, float f12, float f13, int i10, Object obj) {
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

    public static /* synthetic */ n g(int i10, int i11, int i12, int i13, int i14, Object obj) {
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
    public static final n h(float f10) {
        j jVar = new j(f10);
        return new n(jVar, jVar, jVar, jVar);
    }

    @NotNull
    public static final n i(float f10, float f11, float f12, float f13) {
        return new n(new j(f10), new j(f11), new j(f12), new j(f13));
    }

    public static n j(float f10, float f11, float f12, float f13, int i10, Object obj) {
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

    @NotNull
    public static final n k() {
        return f33920a;
    }
}
