package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface X {
    @NotNull
    Typeface a(@NotNull P p10, @NotNull L l10, int i10);

    @NotNull
    Typeface b(@NotNull L l10, int i10);

    @Nullable
    Typeface c(@NotNull String str, @NotNull L l10, int i10, @NotNull K.e eVar, @NotNull Context context);
}
