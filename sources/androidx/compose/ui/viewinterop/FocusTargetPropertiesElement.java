package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusTargetPropertiesElement extends W<e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FocusTargetPropertiesElement f105592c = new FocusTargetPropertiesElement();

    private FocusTargetPropertiesElement() {
    }

    @Override // androidx.compose.ui.node.W
    public p.d c() {
        return new e();
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "FocusTargetProperties";
    }

    @Override // androidx.compose.ui.node.W
    public /* bridge */ /* synthetic */ void h(p.d dVar) {
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return -659549572;
    }

    @NotNull
    public e i() {
        return new e();
    }

    public void j(@NotNull e eVar) {
    }
}
