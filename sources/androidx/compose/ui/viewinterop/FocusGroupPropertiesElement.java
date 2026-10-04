package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusGroupPropertiesElement extends W<FocusGroupPropertiesNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FocusGroupPropertiesElement f105590c = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // androidx.compose.ui.node.W
    public p.d c() {
        return new FocusGroupPropertiesNode();
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "FocusGroupProperties";
    }

    @Override // androidx.compose.ui.node.W
    public /* bridge */ /* synthetic */ void h(p.d dVar) {
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return -1929324230;
    }

    @NotNull
    public FocusGroupPropertiesNode i() {
        return new FocusGroupPropertiesNode();
    }

    public void j(@NotNull FocusGroupPropertiesNode focusGroupPropertiesNode) {
    }
}
