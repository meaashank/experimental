package androidx.compose.ui.platform;

import android.view.View;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(26)
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final G f103538a = new G();

    @e.T(26)
    @InterfaceC4345t
    public final void a(@NotNull View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
