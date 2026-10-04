package androidx.compose.ui.input.pointer;

import androidx.compose.animation.C1635o;
import androidx.compose.animation.C1636p;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class PointerHoverIconModifierElement extends W<PointerHoverIconModifierNode> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102200e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC2154v f102201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f102202d;

    public PointerHoverIconModifierElement(@NotNull InterfaceC2154v interfaceC2154v, boolean z10) {
        this.f102201c = interfaceC2154v;
        this.f102202d = z10;
    }

    public static PointerHoverIconModifierElement l(PointerHoverIconModifierElement pointerHoverIconModifierElement, InterfaceC2154v interfaceC2154v, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2154v = pointerHoverIconModifierElement.f102201c;
        }
        if ((i10 & 2) != 0) {
            z10 = pointerHoverIconModifierElement.f102202d;
        }
        pointerHoverIconModifierElement.getClass();
        return new PointerHoverIconModifierElement(interfaceC2154v, z10);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return kotlin.jvm.internal.G.g(this.f102201c, pointerHoverIconModifierElement.f102201c) && this.f102202d == pointerHoverIconModifierElement.f102202d;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "pointerHoverIcon";
        c2278s0.f103929c.c("icon", this.f102201c);
        c2278s0.f103929c.c("overrideDescendants", Boolean.valueOf(this.f102202d));
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1635o.a(this.f102202d) + (this.f102201c.hashCode() * 31);
    }

    @NotNull
    public final InterfaceC2154v i() {
        return this.f102201c;
    }

    public final boolean j() {
        return this.f102202d;
    }

    @NotNull
    public final PointerHoverIconModifierElement k(@NotNull InterfaceC2154v interfaceC2154v, boolean z10) {
        return new PointerHoverIconModifierElement(interfaceC2154v, z10);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public PointerHoverIconModifierNode c() {
        return new PointerHoverIconModifierNode(this.f102201c, this.f102202d);
    }

    @NotNull
    public final InterfaceC2154v n() {
        return this.f102201c;
    }

    public final boolean o() {
        return this.f102202d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.s3(this.f102201c);
        pointerHoverIconModifierNode.t3(this.f102202d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb2.append(this.f102201c);
        sb2.append(", overrideDescendants=");
        return C1636p.a(sb2, this.f102202d, ')');
    }

    public /* synthetic */ PointerHoverIconModifierElement(InterfaceC2154v interfaceC2154v, boolean z10, int i10, C4969v c4969v) {
        this(interfaceC2154v, (i10 & 2) != 0 ? false : z10);
    }
}
