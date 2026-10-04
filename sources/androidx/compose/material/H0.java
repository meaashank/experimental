package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,522:1\n51#2:523\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n333#1:523\n*E\n"})
public final class H0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96359c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96361b;

    public /* synthetic */ H0(float f10, float f11, C4969v c4969v) {
        this(f10, f11);
    }

    public final float a() {
        return this.f96360a;
    }

    public final float b() {
        return this.f96360a + this.f96361b;
    }

    public final float c() {
        return this.f96361b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return k0.i.l(this.f96360a, h02.f96360a) && k0.i.l(this.f96361b, h02.f96361b);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f96361b) + (Float.floatToIntBits(this.f96360a) * 31);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) k0.i.u(this.f96360a)) + ", right=" + ((Object) k0.i.u(b())) + ", width=" + ((Object) k0.i.u(this.f96361b)) + ')';
    }

    public H0(float f10, float f11) {
        this.f96360a = f10;
        this.f96361b = f11;
    }
}
