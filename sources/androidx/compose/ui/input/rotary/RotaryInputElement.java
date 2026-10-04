package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import ed.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends W<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final l<d, Boolean> f102359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final l<d, Boolean> f102360d;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(@Nullable l<? super d, Boolean> lVar, @Nullable l<? super d, Boolean> lVar2) {
        this.f102359c = lVar;
        this.f102360d = lVar2;
    }

    public static RotaryInputElement l(RotaryInputElement rotaryInputElement, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = rotaryInputElement.f102359c;
        }
        if ((i10 & 2) != 0) {
            lVar2 = rotaryInputElement.f102360d;
        }
        rotaryInputElement.getClass();
        return new RotaryInputElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return G.g(this.f102359c, rotaryInputElement.f102359c) && G.g(this.f102360d, rotaryInputElement.f102360d);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        l<d, Boolean> lVar = this.f102359c;
        if (lVar != null) {
            c2278s0.f103927a = "onRotaryScrollEvent";
            c2278s0.f103929c.c("onRotaryScrollEvent", lVar);
        }
        l<d, Boolean> lVar2 = this.f102360d;
        if (lVar2 != null) {
            c2278s0.f103927a = "onPreRotaryScrollEvent";
            c2278s0.f103929c.c("onPreRotaryScrollEvent", lVar2);
        }
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        l<d, Boolean> lVar = this.f102359c;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<d, Boolean> lVar2 = this.f102360d;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Nullable
    public final l<d, Boolean> i() {
        return this.f102359c;
    }

    @Nullable
    public final l<d, Boolean> j() {
        return this.f102360d;
    }

    @NotNull
    public final RotaryInputElement k(@Nullable l<? super d, Boolean> lVar, @Nullable l<? super d, Boolean> lVar2) {
        return new RotaryInputElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c c() {
        return new c(this.f102359c, this.f102360d);
    }

    @Nullable
    public final l<d, Boolean> n() {
        return this.f102360d;
    }

    @Nullable
    public final l<d, Boolean> o() {
        return this.f102359c;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull c cVar) {
        cVar.f102361o = this.f102359c;
        cVar.f102362p = this.f102360d;
    }

    @NotNull
    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f102359c + ", onPreRotaryScrollEvent=" + this.f102360d + ')';
    }
}
