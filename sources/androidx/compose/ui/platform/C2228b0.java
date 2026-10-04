package androidx.compose.ui.platform;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2228b0 {
    @androidx.compose.ui.i
    @Nullable
    public static final Uri a(@NotNull Z z10) {
        int itemCount = z10.f103771a.getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = z10.f103771a.getItemAt(i10).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
