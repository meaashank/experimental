package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface y0 {
    void a();

    @Nullable
    String b();

    void dismiss();

    @NotNull
    SnackbarDuration getDuration();

    @NotNull
    String getMessage();
}
