package androidx.compose.foundation;

import androidx.compose.runtime.T1;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.L0;
import md.C5229e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar) {
        return androidx.compose.ui.semantics.o.e(pVar, true, new ed.l<androidx.compose.ui.semantics.u, L0>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            public final void e(@NotNull androidx.compose.ui.semantics.u uVar) {
                androidx.compose.ui.semantics.h.f104121d.getClass();
                SemanticsPropertiesKt.B1(uVar, androidx.compose.ui.semantics.h.f104123f);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.semantics.u uVar) {
                e(uVar);
                return L0.f217464a;
            }
        });
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, final float f10, @NotNull final md.f<Float> fVar, @e.D(from = 0) final int i10) {
        return androidx.compose.ui.semantics.o.e(pVar, true, new ed.l<androidx.compose.ui.semantics.u, L0>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull androidx.compose.ui.semantics.u uVar) {
                SemanticsPropertiesKt.B1(uVar, new androidx.compose.ui.semantics.h(((Number) md.u.P(Float.valueOf(f10), fVar)).floatValue(), fVar, i10));
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.semantics.u uVar) {
                e(uVar);
                return L0.f217464a;
            }
        });
    }

    public static androidx.compose.ui.p c(androidx.compose.ui.p pVar, float f10, md.f fVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = new C5229e(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b(pVar, f10, fVar, i10);
    }
}
