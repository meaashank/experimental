package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends W<NestedScrollNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f102119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final NestedScrollDispatcher f102120d;

    public NestedScrollElement(@NotNull b bVar, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        this.f102119c = bVar;
        this.f102120d = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return G.g(nestedScrollElement.f102119c, this.f102119c) && G.g(nestedScrollElement.f102120d, this.f102120d);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "nestedScroll";
        c2278s0.f103929c.c("connection", this.f102119c);
        c2278s0.f103929c.c("dispatcher", this.f102120d);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        int iHashCode = this.f102119c.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.f102120d;
        return iHashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public NestedScrollNode c() {
        return new NestedScrollNode(this.f102119c, this.f102120d);
    }

    @NotNull
    public final b j() {
        return this.f102119c;
    }

    @Nullable
    public final NestedScrollDispatcher k() {
        return this.f102120d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull NestedScrollNode nestedScrollNode) {
        nestedScrollNode.n3(this.f102119c, this.f102120d);
    }
}
