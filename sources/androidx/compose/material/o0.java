package androidx.compose.material;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/ResistanceConfig\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,909:1\n71#2,16:910\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/ResistanceConfig\n*L\n712#1:910,16\n*E\n"})
@InterfaceC4982o(message = SwipeableKt.f97668a)
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f98660d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f98661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f98662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f98663c;

    public o0(float f10, float f11, float f12) {
        this.f98661a = f10;
        this.f98662b = f11;
        this.f98663c = f12;
    }

    public final float a(float f10) {
        float f11 = f10 < 0.0f ? this.f98662b : this.f98663c;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f98661a;
        float f13 = f10 / f12;
        if (f13 < -1.0f) {
            f13 = -1.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return (f12 / f11) * ((float) Math.sin((f13 * 3.1415927f) / 2));
    }

    public final float b() {
        return this.f98661a;
    }

    public final float c() {
        return this.f98663c;
    }

    public final float d() {
        return this.f98662b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f98661a == o0Var.f98661a && this.f98662b == o0Var.f98662b && this.f98663c == o0Var.f98663c;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f98663c) + androidx.compose.animation.B.a(this.f98662b, Float.floatToIntBits(this.f98661a) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResistanceConfig(basis=");
        sb2.append(this.f98661a);
        sb2.append(", factorAtMin=");
        sb2.append(this.f98662b);
        sb2.append(", factorAtMax=");
        return C1571b.a(sb2, this.f98663c, ')');
    }

    public /* synthetic */ o0(float f10, float f11, float f12, int i10, C4969v c4969v) {
        this(f10, (i10 & 2) != 0 ? 10.0f : f11, (i10 & 4) != 0 ? 10.0f : f12);
    }
}
