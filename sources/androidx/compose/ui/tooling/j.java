package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.c0;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(26)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f105424a = new j();

    @InterfaceC4345t
    @NotNull
    public final Typeface a(@NotNull Context context, @NotNull c0 c0Var) {
        return context.getResources().getFont(c0Var.f104607c);
    }
}
