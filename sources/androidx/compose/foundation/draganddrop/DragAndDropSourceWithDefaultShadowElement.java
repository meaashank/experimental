package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.L;
import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import ed.p;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
final class DragAndDropSourceWithDefaultShadowElement extends W<DragSourceNodeWithDefaultPainter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p<c, e<? super L0>, Object> f89093c;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceWithDefaultShadowElement(@NotNull p<? super c, ? super e<? super L0>, ? extends Object> pVar) {
        this.f89093c = pVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DragAndDropSourceWithDefaultShadowElement) {
            return G.g(this.f89093c, ((DragAndDropSourceWithDefaultShadowElement) obj).f89093c);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "dragSourceWithDefaultPainter";
        c2278s0.f103929c.c("dragAndDropSourceHandler", this.f89093c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((DragSourceNodeWithDefaultPainter) dVar).f89098r = this.f89093c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f89093c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public DragSourceNodeWithDefaultPainter c() {
        return new DragSourceNodeWithDefaultPainter(this.f89093c);
    }

    @NotNull
    public final ed.p<c, e<? super L0>, Object> j() {
        return this.f89093c;
    }

    public void k(@NotNull DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.f89098r = this.f89093c;
    }
}
