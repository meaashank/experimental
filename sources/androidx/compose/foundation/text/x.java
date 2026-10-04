package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnnotatedString.Builder f95048a;

    public x(@NotNull AnnotatedString.Builder builder) {
        this.f95048a = builder;
    }

    public final void a(@NotNull androidx.compose.ui.text.I i10, int i11, int i12) {
        this.f95048a.addStyle(i10, i11, i12);
    }
}
