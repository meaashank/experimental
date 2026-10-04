package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.InterfaceC2203g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractC2206j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public InterfaceC2203g f88915r;

    public Z(@NotNull InterfaceC2203g interfaceC2203g) {
        this.f88915r = interfaceC2203g;
        e3(interfaceC2203g);
    }

    public final void p3(@NotNull InterfaceC2203g interfaceC2203g) {
        l3(this.f88915r);
        this.f88915r = interfaceC2203g;
        e3(interfaceC2203g);
    }
}
