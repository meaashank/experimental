package androidx.compose.ui.graphics.drawscope;

import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,179:1\n37#1:180\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:180\n*E\n"})
public final class n {
    public static final void a(@NotNull m mVar, float f10) {
        mVar.h(f10, f10, f10, f10);
    }

    public static final void b(@NotNull m mVar, float f10, float f11) {
        mVar.h(f10, f11, f10, f11);
    }

    public static /* synthetic */ void c(m mVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        mVar.h(f10, f11, f10, f11);
    }

    public static final void d(@NotNull m mVar, float f10, long j10) {
        mVar.g(f10 * 57.29578f, j10);
    }

    public static void e(m mVar, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = mVar.Y();
        }
        mVar.g(f10 * 57.29578f, j10);
    }

    public static final void f(@NotNull m mVar, float f10, long j10) {
        mVar.f(f10, f10, j10);
    }

    public static /* synthetic */ void g(m mVar, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = mVar.Y();
        }
        mVar.f(f10, f10, j10);
    }
}
