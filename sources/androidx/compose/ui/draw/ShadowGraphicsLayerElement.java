package androidx.compose.ui.draw;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.foundation.C1749o;
import androidx.compose.foundation.C1750p;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.InterfaceC2008b2;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.c3;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.B0;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class ShadowGraphicsLayerElement extends W<BlockGraphicsLayerModifier> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100505h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c3 f100507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f100508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f100509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f100510g;

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, c3 c3Var, boolean z10, long j10, long j11, C4969v c4969v) {
        this(f10, c3Var, z10, j10, j11);
    }

    public static ShadowGraphicsLayerElement o(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f10, c3 c3Var, boolean z10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = shadowGraphicsLayerElement.f100506c;
        }
        if ((i10 & 2) != 0) {
            c3Var = shadowGraphicsLayerElement.f100507d;
        }
        if ((i10 & 4) != 0) {
            z10 = shadowGraphicsLayerElement.f100508e;
        }
        if ((i10 & 8) != 0) {
            j10 = shadowGraphicsLayerElement.f100509f;
        }
        if ((i10 & 16) != 0) {
            j11 = shadowGraphicsLayerElement.f100510g;
        }
        long j12 = j11;
        shadowGraphicsLayerElement.getClass();
        boolean z11 = z10;
        return new ShadowGraphicsLayerElement(f10, c3Var, z11, j10, j12);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return k0.i.l(this.f100506c, shadowGraphicsLayerElement.f100506c) && G.g(this.f100507d, shadowGraphicsLayerElement.f100507d) && this.f100508e == shadowGraphicsLayerElement.f100508e && K0.y(this.f100509f, shadowGraphicsLayerElement.f100509f) && B0.p(this.f100510g, shadowGraphicsLayerElement.f100510g);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "shadow";
        C1750p.a(this.f100506c, c2278s0.f103929c, "elevation");
        c2278s0.f103929c.c("shape", this.f100507d);
        c2278s0.f103929c.c("clip", Boolean.valueOf(this.f100508e));
        c2278s0.f103929c.c("ambientColor", K0.n(this.f100509f));
        c2278s0.f103929c.c("spotColor", new K0(this.f100510g));
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1550p.a(this.f100510g) + ((K0.K(this.f100509f) + ((C1635o.a(this.f100508e) + ((this.f100507d.hashCode() + (Float.floatToIntBits(this.f100506c) * 31)) * 31)) * 31)) * 31);
    }

    public final float i() {
        return this.f100506c;
    }

    @NotNull
    public final c3 j() {
        return this.f100507d;
    }

    public final boolean k() {
        return this.f100508e;
    }

    public final long l() {
        return this.f100509f;
    }

    public final long m() {
        return this.f100510g;
    }

    @NotNull
    public final ShadowGraphicsLayerElement n(float f10, @NotNull c3 c3Var, boolean z10, long j10, long j11) {
        return new ShadowGraphicsLayerElement(f10, c3Var, z10, j10, j11);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public BlockGraphicsLayerModifier c() {
        return new BlockGraphicsLayerModifier(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    public final ed.l<InterfaceC2008b2, L0> q() {
        return new ShadowGraphicsLayerElement$createBlock$1(this);
    }

    public final long r() {
        return this.f100509f;
    }

    public final boolean s() {
        return this.f100508e;
    }

    public final float t() {
        return this.f100506c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        C1749o.a(this.f100506c, sb2, ", shape=");
        sb2.append(this.f100507d);
        sb2.append(", clip=");
        sb2.append(this.f100508e);
        sb2.append(", ambientColor=");
        sb2.append((Object) K0.L(this.f100509f));
        sb2.append(", spotColor=");
        sb2.append((Object) K0.L(this.f100510g));
        sb2.append(')');
        return sb2.toString();
    }

    @NotNull
    public final c3 u() {
        return this.f100507d;
    }

    public final long v() {
        return this.f100510g;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.f100676o = new ShadowGraphicsLayerElement$createBlock$1(this);
        blockGraphicsLayerModifier.f3();
    }

    public ShadowGraphicsLayerElement(float f10, c3 c3Var, boolean z10, long j10, long j11) {
        this.f100506c = f10;
        this.f100507d = c3Var;
        this.f100508e = z10;
        this.f100509f = j10;
        this.f100510g = j11;
    }
}
