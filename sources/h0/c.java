package H0;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import e.InterfaceC4337k;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    @NotNull
    public static final ColorDrawable a(@InterfaceC4337k int i10) {
        return new ColorDrawable(i10);
    }

    @T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorDrawable b(@NotNull Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
