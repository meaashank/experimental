package androidx.compose.foundation.relocation;

import androidx.compose.foundation.L;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
final class BringIntoViewRequesterElement extends W<g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f92546c;

    public BringIntoViewRequesterElement(@NotNull c cVar) {
        this.f92546c = cVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewRequesterElement) && G.g(this.f92546c, ((BringIntoViewRequesterElement) obj).f92546c);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "bringIntoViewRequester";
        c2278s0.f103929c.c("bringIntoViewRequester", this.f92546c);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f92546c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g c() {
        return new g(this.f92546c);
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull g gVar) {
        gVar.f3(this.f92546c);
    }
}
