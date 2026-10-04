package androidx.compose.ui.input.key;

import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import ed.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class SoftKeyboardInterceptionElement extends W<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final l<c, Boolean> f101807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final l<c, Boolean> f101808d;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(@Nullable l<? super c, Boolean> lVar, @Nullable l<? super c, Boolean> lVar2) {
        this.f101807c = lVar;
        this.f101808d = lVar2;
    }

    public static SoftKeyboardInterceptionElement l(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = softKeyboardInterceptionElement.f101807c;
        }
        if ((i10 & 2) != 0) {
            lVar2 = softKeyboardInterceptionElement.f101808d;
        }
        softKeyboardInterceptionElement.getClass();
        return new SoftKeyboardInterceptionElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return G.g(this.f101807c, softKeyboardInterceptionElement.f101807c) && G.g(this.f101808d, softKeyboardInterceptionElement.f101808d);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        l<c, Boolean> lVar = this.f101807c;
        if (lVar != null) {
            c2278s0.f103927a = "onKeyToSoftKeyboardInterceptedEvent";
            c2278s0.f103929c.c("onKeyToSoftKeyboardInterceptedEvent", lVar);
        }
        l<c, Boolean> lVar2 = this.f101808d;
        if (lVar2 != null) {
            c2278s0.f103927a = "onPreKeyToSoftKeyboardInterceptedEvent";
            c2278s0.f103929c.c("onPreKeyToSoftKeyboardInterceptedEvent", lVar2);
        }
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        l<c, Boolean> lVar = this.f101807c;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<c, Boolean> lVar2 = this.f101808d;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Nullable
    public final l<c, Boolean> i() {
        return this.f101807c;
    }

    @Nullable
    public final l<c, Boolean> j() {
        return this.f101808d;
    }

    @NotNull
    public final SoftKeyboardInterceptionElement k(@Nullable l<? super c, Boolean> lVar, @Nullable l<? super c, Boolean> lVar2) {
        return new SoftKeyboardInterceptionElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a c() {
        return new a(this.f101807c, this.f101808d);
    }

    @Nullable
    public final l<c, Boolean> n() {
        return this.f101807c;
    }

    @Nullable
    public final l<c, Boolean> o() {
        return this.f101808d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull a aVar) {
        aVar.f101809o = this.f101807c;
        aVar.f101810p = this.f101808d;
    }

    @NotNull
    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.f101807c + ", onPreKeyEvent=" + this.f101808d + ')';
    }
}
