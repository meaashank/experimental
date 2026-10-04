package androidx.compose.foundation.text.input;

import androidx.compose.foundation.L;
import androidx.compose.foundation.text.input.j;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final void a(@NotNull j jVar, int i10, int i11) {
        jVar.getClass();
        jVar.q(i10, i11, "", 0, "".length());
    }

    public static final void b(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull ed.r<? super Integer, ? super Integer, ? super Integer, ? super Integer, L0> rVar) {
        int i10;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i11 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i10 = 0;
        } else {
            int i12 = 0;
            i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i11 == 0) {
                    if (charSequence.charAt(i12) == charSequence2.charAt(i10)) {
                        i12++;
                        i10++;
                    } else {
                        i11 = 1;
                    }
                }
                if (!z10) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z10 = true;
                    }
                }
                if (i12 >= length || i10 >= length2 || (i11 != 0 && z10)) {
                    break;
                }
            }
            i11 = i12;
        }
        if (i11 < length || i10 < length2) {
            rVar.x(Integer.valueOf(i11), Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(length2));
        }
    }

    @L
    public static final void c(@NotNull j.a aVar, @NotNull ed.p<? super Z, ? super Z, L0> pVar) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            pVar.invoke(Z.b(aVar.c(i10)), new Z(aVar.b(i10)));
        }
    }

    @L
    public static final void d(@NotNull j.a aVar, @NotNull ed.p<? super Z, ? super Z, L0> pVar) {
        for (int iA = aVar.a() - 1; iA >= 0; iA--) {
            pVar.invoke(Z.b(aVar.c(iA)), new Z(aVar.b(iA)));
        }
    }

    public static final void e(@NotNull j jVar, int i10, @NotNull String str) {
        jVar.p(i10, i10, str);
    }

    public static final void f(@NotNull j jVar) {
        jVar.o(jVar.f94354c.c());
    }

    public static final void g(@NotNull j jVar) {
        jVar.v(a0.b(0, jVar.f94354c.c()));
    }
}
