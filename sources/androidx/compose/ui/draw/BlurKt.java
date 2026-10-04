package androidx.compose.ui.draw;

import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.InterfaceC2008b2;
import androidx.compose.ui.graphics.P2;
import androidx.compose.ui.graphics.R2;
import androidx.compose.ui.graphics.Z1;
import androidx.compose.ui.graphics.c3;
import androidx.compose.ui.graphics.i3;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,154:1\n149#2:155\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:155\n*E\n"})
public final class BlurKt {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, final float f10, final float f11, @NotNull final c3 c3Var) {
        int i10;
        final boolean z10;
        if (c3Var != null) {
            i3.f101130b.getClass();
            i10 = i3.f101131c;
            z10 = true;
        } else {
            i3.f101130b.getClass();
            i10 = i3.f101134f;
            z10 = false;
        }
        final int i11 = i10;
        float f12 = 0;
        return ((Float.compare(f10, f12) <= 0 || Float.compare(f11, f12) <= 0) && !z10) ? pVar : Z1.a(pVar, new ed.l<InterfaceC2008b2, L0>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull InterfaceC2008b2 interfaceC2008b2) {
                float fL2 = interfaceC2008b2.l2(f10);
                float fL22 = interfaceC2008b2.l2(f11);
                interfaceC2008b2.w((fL2 <= 0.0f || fL22 <= 0.0f) ? null : R2.a(fL2, fL22, i11));
                c3 c3Var2 = c3Var;
                if (c3Var2 == null) {
                    c3Var2 = P2.f100788a;
                }
                interfaceC2008b2.k1(c3Var2);
                interfaceC2008b2.L(z10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(InterfaceC2008b2 interfaceC2008b2) {
                e(interfaceC2008b2);
                return L0.f217464a;
            }
        });
    }

    public static androidx.compose.ui.p b(androidx.compose.ui.p pVar, float f10, float f11, b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            b.f100512b.getClass();
            bVar = new b(b.f100513c);
        }
        return a(pVar, f10, f11, bVar.f100515a);
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, float f10, @NotNull c3 c3Var) {
        return a(pVar, f10, f10, c3Var);
    }

    public static androidx.compose.ui.p d(androidx.compose.ui.p pVar, float f10, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            b.f100512b.getClass();
            bVar = new b(b.f100513c);
        }
        return a(pVar, f10, f10, bVar.f100515a);
    }
}
