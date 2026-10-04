package androidx.compose.animation;

import androidx.compose.animation.P;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.layout.InterfaceC2171i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1645z
@InterfaceC1924k0
public final class N implements P.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC2171i f87360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.c f87361c;

    public N(@NotNull InterfaceC2171i interfaceC2171i, @NotNull androidx.compose.ui.c cVar) {
        this.f87360b = interfaceC2171i;
        this.f87361c = cVar;
    }

    @NotNull
    public final androidx.compose.ui.c a() {
        return this.f87361c;
    }

    @NotNull
    public final InterfaceC2171i b() {
        return this.f87360b;
    }
}
