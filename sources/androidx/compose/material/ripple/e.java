package androidx.compose.material.ripple;

import androidx.compose.animation.B;
import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f98867e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f98868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f98869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f98870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f98871d;

    public e(float f10, float f11, float f12, float f13) {
        this.f98868a = f10;
        this.f98869b = f11;
        this.f98870c = f12;
        this.f98871d = f13;
    }

    public final float a() {
        return this.f98868a;
    }

    public final float b() {
        return this.f98869b;
    }

    public final float c() {
        return this.f98870c;
    }

    public final float d() {
        return this.f98871d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f98868a == eVar.f98868a && this.f98869b == eVar.f98869b && this.f98870c == eVar.f98870c && this.f98871d == eVar.f98871d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f98871d) + B.a(this.f98870c, B.a(this.f98869b, Float.floatToIntBits(this.f98868a) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f98868a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f98869b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f98870c);
        sb2.append(", pressedAlpha=");
        return C1571b.a(sb2, this.f98871d, ')');
    }
}
