package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final <R> R a(@NotNull TransformedTextFieldState transformedTextFieldState, int i10, @NotNull ed.q<? super IndexTransformationType, ? super androidx.compose.ui.text.Z, ? super androidx.compose.ui.text.Z, ? extends R> qVar) {
        long jR = transformedTextFieldState.r(i10);
        long jV = transformedTextFieldState.v(jR);
        return qVar.invoke((androidx.compose.ui.text.Z.h(jR) && androidx.compose.ui.text.Z.h(jV)) ? IndexTransformationType.Untransformed : (androidx.compose.ui.text.Z.h(jR) || androidx.compose.ui.text.Z.h(jV)) ? (!androidx.compose.ui.text.Z.h(jR) || androidx.compose.ui.text.Z.h(jV)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, new androidx.compose.ui.text.Z(jR), new androidx.compose.ui.text.Z(jV));
    }
}
