package androidx.compose.ui;

import androidx.compose.animation.C1571b;
import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class ZIndexElement extends W<ZIndexNode> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100374d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100375c;

    public ZIndexElement(float f10) {
        this.f100375c = f10;
    }

    public static ZIndexElement k(ZIndexElement zIndexElement, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = zIndexElement.f100375c;
        }
        zIndexElement.getClass();
        return new ZIndexElement(f10);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f100375c, ((ZIndexElement) obj).f100375c) == 0;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "zIndex";
        c2278s0.f103929c.c("zIndex", Float.valueOf(this.f100375c));
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((ZIndexNode) dVar).f100377o = this.f100375c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return Float.floatToIntBits(this.f100375c);
    }

    public final float i() {
        return this.f100375c;
    }

    @NotNull
    public final ZIndexElement j(float f10) {
        return new ZIndexElement(f10);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ZIndexNode c() {
        return new ZIndexNode(this.f100375c);
    }

    public final float m() {
        return this.f100375c;
    }

    public void n(@NotNull ZIndexNode zIndexNode) {
        zIndexNode.f100377o = this.f100375c;
    }

    @NotNull
    public String toString() {
        return C1571b.a(new StringBuilder("ZIndexElement(zIndex="), this.f100375c, ')');
    }
}
