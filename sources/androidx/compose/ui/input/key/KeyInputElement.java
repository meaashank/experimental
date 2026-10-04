package androidx.compose.ui.input.key;

import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import ed.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends W<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final l<c, Boolean> f101805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final l<c, Boolean> f101806d;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(@Nullable l<? super c, Boolean> lVar, @Nullable l<? super c, Boolean> lVar2) {
        this.f101805c = lVar;
        this.f101806d = lVar2;
    }

    public static KeyInputElement l(KeyInputElement keyInputElement, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = keyInputElement.f101805c;
        }
        if ((i10 & 2) != 0) {
            lVar2 = keyInputElement.f101806d;
        }
        keyInputElement.getClass();
        return new KeyInputElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return G.g(this.f101805c, keyInputElement.f101805c) && G.g(this.f101806d, keyInputElement.f101806d);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        l<c, Boolean> lVar = this.f101805c;
        if (lVar != null) {
            c2278s0.f103927a = "onKeyEvent";
            c2278s0.f103929c.c("onKeyEvent", lVar);
        }
        l<c, Boolean> lVar2 = this.f101806d;
        if (lVar2 != null) {
            c2278s0.f103927a = "onPreviewKeyEvent";
            c2278s0.f103929c.c("onPreviewKeyEvent", lVar2);
        }
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        l<c, Boolean> lVar = this.f101805c;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<c, Boolean> lVar2 = this.f101806d;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Nullable
    public final l<c, Boolean> i() {
        return this.f101805c;
    }

    @Nullable
    public final l<c, Boolean> j() {
        return this.f101806d;
    }

    @NotNull
    public final KeyInputElement k(@Nullable l<? super c, Boolean> lVar, @Nullable l<? super c, Boolean> lVar2) {
        return new KeyInputElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h c() {
        return new h(this.f101805c, this.f101806d);
    }

    @Nullable
    public final l<c, Boolean> n() {
        return this.f101805c;
    }

    @Nullable
    public final l<c, Boolean> o() {
        return this.f101806d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull h hVar) {
        hVar.f102106o = this.f101805c;
        hVar.f102107p = this.f101806d;
    }

    @NotNull
    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f101805c + ", onPreKeyEvent=" + this.f101806d + ')';
    }
}
