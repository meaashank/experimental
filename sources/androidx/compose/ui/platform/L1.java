package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface L1 {

    public static final class a {
        @Deprecated
        @Nullable
        public static AbstractComposeView a(@NotNull L1 l12) {
            return null;
        }

        @Deprecated
        @Nullable
        public static View b(@NotNull L1 l12) {
            return null;
        }
    }

    @Nullable
    AbstractComposeView a();

    @Nullable
    View b();
}
