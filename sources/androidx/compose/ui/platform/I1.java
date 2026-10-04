package androidx.compose.ui.platform;

import android.view.View;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(28)
public final class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final I1 f103586a = new I1();

    @InterfaceC4345t
    public final void a(@NotNull View view, int i10) {
        view.setOutlineAmbientShadowColor(i10);
    }

    @InterfaceC4345t
    public final void b(@NotNull View view, int i10) {
        view.setOutlineSpotShadowColor(i10);
    }
}
