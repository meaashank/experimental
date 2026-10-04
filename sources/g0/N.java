package G0;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class N {
    @NotNull
    public static final PorterDuffColorFilter a(@NotNull PorterDuff.Mode mode, int i10) {
        return new PorterDuffColorFilter(i10, mode);
    }

    @NotNull
    public static final PorterDuffXfermode b(@NotNull PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
