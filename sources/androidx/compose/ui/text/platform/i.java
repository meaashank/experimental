package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import e.InterfaceC4345t;
import e.T;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(26)
@InterfaceC4982o(message = "Only used by deprecated APIs in this file, remove with them.")
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f104919a = new i();

    @T(26)
    @InterfaceC4345t
    @NotNull
    public final Typeface a(@NotNull Context context, int i10) {
        return context.getResources().getFont(i10);
    }
}
