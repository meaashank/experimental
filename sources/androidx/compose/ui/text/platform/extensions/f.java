package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.f0;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    @NotNull
    public static final TtsSpan a(@NotNull d0 d0Var) {
        if (d0Var instanceof f0) {
            return b((f0) d0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final TtsSpan b(@NotNull f0 f0Var) {
        return new TtsSpan.VerbatimBuilder(f0Var.f104427b).build();
    }
}
