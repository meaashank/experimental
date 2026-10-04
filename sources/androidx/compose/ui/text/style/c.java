package androidx.compose.ui.text.style;

import androidx.compose.animation.C1571b;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.Y2;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Y2 f104957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f104958c;

    public c(@NotNull Y2 y22, float f10) {
        this.f104957b = y22;
        this.f104958c = f10;
    }

    public static c i(c cVar, Y2 y22, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y22 = cVar.f104957b;
        }
        if ((i10 & 2) != 0) {
            f10 = cVar.f104958c;
        }
        cVar.getClass();
        return new c(y22, f10);
    }

    @Override // androidx.compose.ui.text.style.m
    public long a() {
        K0.f100733b.getClass();
        return K0.f100746o;
    }

    @Override // androidx.compose.ui.text.style.m
    public /* synthetic */ m b(InterfaceC4376a interfaceC4376a) {
        return TextForegroundStyle$CC.b(this, interfaceC4376a);
    }

    @Override // androidx.compose.ui.text.style.m
    public /* synthetic */ m c(m mVar) {
        return TextForegroundStyle$CC.a(this, mVar);
    }

    @Override // androidx.compose.ui.text.style.m
    @NotNull
    public AbstractC2131z0 d() {
        return this.f104957b;
    }

    @NotNull
    public final Y2 e() {
        return this.f104957b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return G.g(this.f104957b, cVar.f104957b) && Float.compare(this.f104958c, cVar.f104958c) == 0;
    }

    @Override // androidx.compose.ui.text.style.m
    public float f() {
        return this.f104958c;
    }

    public final float g() {
        return this.f104958c;
    }

    @NotNull
    public final c h(@NotNull Y2 y22, float f10) {
        return new c(y22, f10);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f104958c) + (this.f104957b.hashCode() * 31);
    }

    @NotNull
    public final Y2 j() {
        return this.f104957b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f104957b);
        sb2.append(", alpha=");
        return C1571b.a(sb2, this.f104958c, ')');
    }
}
