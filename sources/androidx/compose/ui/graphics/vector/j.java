package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractC1883a;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class j extends AbstractC1883a<i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101700e = 0;

    public j(@NotNull i iVar) {
        super(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC1908f
    public void a(int i10, int i11) {
        o((i) this.f99412c).y(i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC1908f
    public void e(int i10, int i11, int i12) {
        o((i) this.f99412c).x(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public /* bridge */ /* synthetic */ void f(int i10, Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.AbstractC1883a
    public void l() {
        GroupComponent groupComponentO = o((i) this.f99410a);
        groupComponentO.y(0, groupComponentO.f101437d.size());
    }

    public final GroupComponent o(i iVar) {
        if (iVar instanceof GroupComponent) {
            return (GroupComponent) iVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC1908f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void g(int i10, @NotNull i iVar) {
        o((i) this.f99412c).r(i10, iVar);
    }

    public void q(int i10, @NotNull i iVar) {
    }
}
