package androidx.compose.foundation.text;

import androidx.activity.C1477d;
import androidx.collection.C1545m0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.e0;
import androidx.compose.ui.text.input.g0;
import e.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.ui.text.input.L f93552a;

    static {
        androidx.compose.ui.text.input.L.f104710a.getClass();
        f93552a = new U(L.a.f104712b, 0, 0);
    }

    @NotNull
    public static final e0 c(@NotNull g0 g0Var, @NotNull AnnotatedString annotatedString) {
        e0 e0VarA = g0Var.a(annotatedString);
        f(e0VarA, annotatedString.f104196a.length(), 0, 2, null);
        return new e0(e0VarA.f104794a, new U(e0VarA.f104795b, annotatedString.f104196a.length(), e0VarA.f104794a.f104196a.length()));
    }

    @NotNull
    public static final androidx.compose.ui.text.input.L d() {
        return f93552a;
    }

    @f0
    public static final void e(@NotNull e0 e0Var, int i10, int i11) {
        int length = e0Var.f104794a.f104196a.length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            g(e0Var.f104795b.b(i12), length, i12);
        }
        g(e0Var.f104795b.b(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            h(e0Var.f104795b.a(i13), i10, i13);
        }
        h(e0Var.f104795b.a(length), i10, length);
    }

    public static /* synthetic */ void f(e0 e0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(e0Var, i10, i11);
    }

    public static final void g(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(C1477d.a(C1545m0.a("OffsetMapping.originalToTransformed returned invalid mapping: ", i12, " -> ", i10, " is not in range of transformed text [0, "), i11, ']').toString());
        }
    }

    public static final void h(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(C1477d.a(C1545m0.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", i12, " -> ", i10, " is not in range of original text [0, "), i11, ']').toString());
        }
    }
}
