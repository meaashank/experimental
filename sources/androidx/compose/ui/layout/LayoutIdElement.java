package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends androidx.compose.ui.node.W<A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f102410c;

    public LayoutIdElement(@NotNull Object obj) {
        this.f102410c = obj;
    }

    private final Object i() {
        return this.f102410c;
    }

    public static LayoutIdElement k(LayoutIdElement layoutIdElement, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = layoutIdElement.f102410c;
        }
        layoutIdElement.getClass();
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && kotlin.jvm.internal.G.g(this.f102410c, ((LayoutIdElement) obj).f102410c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "layoutId";
        c2278s0.f103928b = this.f102410c;
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((A) dVar).f102374o = this.f102410c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f102410c.hashCode();
    }

    @NotNull
    public final LayoutIdElement j(@NotNull Object obj) {
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public A c() {
        return new A(this.f102410c);
    }

    public void m(@NotNull A a10) {
        a10.f102374o = this.f102410c;
    }

    @NotNull
    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f102410c + ')';
    }
}
