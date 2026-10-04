package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(26)
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final J f103601a = new J();

    @e.T(26)
    @InterfaceC4345t
    @NotNull
    public final Typeface a(@NotNull Context context, int i10) {
        return context.getResources().getFont(i10);
    }
}
