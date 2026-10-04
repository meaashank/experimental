package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C2035h0 extends Q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RenderEffect f101123b;

    public C2035h0(@NotNull RenderEffect renderEffect) {
        this.f101123b = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.Q2
    @NotNull
    public RenderEffect b() {
        return this.f101123b;
    }

    @NotNull
    public final RenderEffect d() {
        return this.f101123b;
    }
}
