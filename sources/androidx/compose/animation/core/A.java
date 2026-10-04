package androidx.compose.animation.core;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.C2096q0;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,172:1\n33#2,7:173\n48#3:180\n54#3:182\n22#4:181\n22#4:183\n71#5,16:184\n*S KotlinDebug\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n*L\n115#1:173,7\n120#1:180\n121#1:182\n120#1:181\n121#1:183\n149#1:184,16\n*E\n"})
public final class A implements G {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87564g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f87566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f87567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f87568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f87569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f87570f;

    public A(float f10, float f11, float f12, float f13) {
        this.f87565a = f10;
        this.f87566b = f11;
        this.f87567c = f12;
        this.f87568d = f13;
        if ((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true) {
            long jE = C2096q0.e(0.0f, f11, f13, 1.0f, new float[5], 0);
            this.f87569e = Float.intBitsToFloat((int) (jE >> 32));
            this.f87570f = Float.intBitsToFloat((int) (jE & ZipKt.f225990j));
            return;
        }
        C1602o0.d("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + U6.j.f68738d + f11 + U6.j.f68738d + f12 + U6.j.f68738d + f13 + '.');
        throw null;
    }

    @Override // androidx.compose.animation.core.G
    public float a(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float fV = C2096q0.v(0.0f - f10, this.f87565a - f10, this.f87567c - f10, 1.0f - f10);
        if (Float.isNaN(fV)) {
            b(f10);
            throw null;
        }
        float fN = C2096q0.n(this.f87566b, this.f87568d, fV);
        float f11 = this.f87569e;
        float f12 = this.f87570f;
        if (fN < f11) {
            fN = f11;
        }
        return fN > f12 ? f12 : fN;
    }

    public final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f87565a + U6.j.f68738d + this.f87566b + U6.j.f68738d + this.f87567c + U6.j.f68738d + this.f87568d + ") has no solution at " + f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f87565a == a10.f87565a && this.f87566b == a10.f87566b && this.f87567c == a10.f87567c && this.f87568d == a10.f87568d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f87568d) + androidx.compose.animation.B.a(this.f87567c, androidx.compose.animation.B.a(this.f87566b, Float.floatToIntBits(this.f87565a) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f87565a);
        sb2.append(", b=");
        sb2.append(this.f87566b);
        sb2.append(", c=");
        sb2.append(this.f87567c);
        sb2.append(", d=");
        return C1571b.a(sb2, this.f87568d, ')');
    }
}
