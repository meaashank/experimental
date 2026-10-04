package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class X {
    @NotNull
    public static final AnnotatedString a(@NotNull TextFieldValue textFieldValue) {
        return textFieldValue.f104741a.t(textFieldValue.f104742b);
    }

    @NotNull
    public static final AnnotatedString b(@NotNull TextFieldValue textFieldValue, int i10) {
        return textFieldValue.f104741a.subSequence(androidx.compose.ui.text.Z.k(textFieldValue.f104742b), Math.min(androidx.compose.ui.text.Z.k(textFieldValue.f104742b) + i10, textFieldValue.f104741a.f104196a.length()));
    }

    @NotNull
    public static final AnnotatedString c(@NotNull TextFieldValue textFieldValue, int i10) {
        return textFieldValue.f104741a.subSequence(Math.max(0, androidx.compose.ui.text.Z.l(textFieldValue.f104742b) - i10), androidx.compose.ui.text.Z.l(textFieldValue.f104742b));
    }
}
