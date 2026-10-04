package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.Q2;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final J1 f103602a = new J1();

    @InterfaceC4345t
    public final void a(@NotNull View view, @Nullable Q2 q22) {
        view.setRenderEffect(q22 != null ? q22.a() : null);
    }
}
