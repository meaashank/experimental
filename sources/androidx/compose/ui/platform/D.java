package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.C2135b;
import androidx.compose.ui.input.pointer.C2136c;
import androidx.compose.ui.input.pointer.InterfaceC2154v;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(24)
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final D f103524a = new D();

    @e.T(24)
    @InterfaceC4345t
    public final void a(@NotNull View view, @Nullable InterfaceC2154v interfaceC2154v) {
        PointerIcon systemIcon = interfaceC2154v instanceof C2135b ? ((C2135b) interfaceC2154v).f102279b : interfaceC2154v instanceof C2136c ? PointerIcon.getSystemIcon(view.getContext(), ((C2136c) interfaceC2154v).f102281b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (kotlin.jvm.internal.G.g(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
