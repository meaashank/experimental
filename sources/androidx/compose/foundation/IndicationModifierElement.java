package androidx.compose.foundation;

import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends androidx.compose.ui.node.W<Z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.interaction.e f88745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a0 f88746d;

    public IndicationModifierElement(@NotNull androidx.compose.foundation.interaction.e eVar, @NotNull a0 a0Var) {
        this.f88745c = eVar;
        this.f88746d = a0Var;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return kotlin.jvm.internal.G.g(this.f88745c, indicationModifierElement.f88745c) && kotlin.jvm.internal.G.g(this.f88746d, indicationModifierElement.f88746d);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "indication";
        c2278s0.f103929c.c("interactionSource", this.f88745c);
        c2278s0.f103929c.c("indication", this.f88746d);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f88746d.hashCode() + (this.f88745c.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Z c() {
        return new Z(this.f88746d.a(this.f88745c));
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull Z z10) {
        z10.p3(this.f88746d.a(this.f88745c));
    }
}
