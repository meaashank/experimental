package androidx.compose.runtime.snapshots;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface J {

    public static final class a {
        @Deprecated
        @Nullable
        public static L a(@NotNull J j10, @NotNull L l10, @NotNull L l11, @NotNull L l12) {
            return null;
        }
    }

    @NotNull
    L getFirstStateRecord();

    @Nullable
    L mergeRecords(@NotNull L l10, @NotNull L l11, @NotNull L l12);

    void prependStateRecord(@NotNull L l10);
}
