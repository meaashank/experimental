package androidx.compose.ui.focus;

import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,82:1\n735#2,2:83\n728#2,2:85\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n58#1:83,2\n60#1:85,2\n*E\n"})
final class FocusRequesterElement extends W<G> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FocusRequester f100599c;

    public FocusRequesterElement(@NotNull FocusRequester focusRequester) {
        this.f100599c = focusRequester;
    }

    public static FocusRequesterElement k(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            focusRequester = focusRequesterElement.f100599c;
        }
        focusRequesterElement.getClass();
        return new FocusRequesterElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && kotlin.jvm.internal.G.g(this.f100599c, ((FocusRequesterElement) obj).f100599c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "focusRequester";
        c2278s0.f103929c.c("focusRequester", this.f100599c);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f100599c.hashCode();
    }

    @NotNull
    public final FocusRequester i() {
        return this.f100599c;
    }

    @NotNull
    public final FocusRequesterElement j(@NotNull FocusRequester focusRequester) {
        return new FocusRequesterElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public G c() {
        return new G(this.f100599c);
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull G g10) {
        g10.f100627o.f100595a.h0(g10);
        FocusRequester focusRequester = this.f100599c;
        g10.f100627o = focusRequester;
        focusRequester.f100595a.b(g10);
    }

    @NotNull
    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f100599c + ')';
    }

    @NotNull
    public final FocusRequester u0() {
        return this.f100599c;
    }
}
