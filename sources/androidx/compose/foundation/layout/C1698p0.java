package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1749o;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n149#3:486\n149#3:487\n149#3:488\n149#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n303#1:486\n305#1:487\n307#1:488\n309#1:489\n*E\n"})
public final class C1698p0 implements InterfaceC1694n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90941e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f90942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f90943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f90944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f90945d;

    public C1698p0(float f10, float f11, float f12, float f13, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 0 : f10, (i10 & 2) != 0 ? 0 : f11, (i10 & 4) != 0 ? 0 : f12, (i10 & 8) != 0 ? 0 : f13);
    }

    @T1
    public static /* synthetic */ void f() {
    }

    @T1
    public static /* synthetic */ void h() {
    }

    @T1
    public static /* synthetic */ void j() {
    }

    @T1
    public static /* synthetic */ void l() {
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float a() {
        return this.f90945d;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float b(@NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f90942a : this.f90944c;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float c(@NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f90944c : this.f90942a;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float d() {
        return this.f90943b;
    }

    public final float e() {
        return this.f90945d;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1698p0)) {
            return false;
        }
        C1698p0 c1698p0 = (C1698p0) obj;
        return k0.i.l(this.f90942a, c1698p0.f90942a) && k0.i.l(this.f90943b, c1698p0.f90943b) && k0.i.l(this.f90944c, c1698p0.f90944c) && k0.i.l(this.f90945d, c1698p0.f90945d);
    }

    public final float g() {
        return this.f90944c;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f90945d) + androidx.compose.animation.B.a(this.f90944c, androidx.compose.animation.B.a(this.f90943b, Float.floatToIntBits(this.f90942a) * 31, 31), 31);
    }

    public final float i() {
        return this.f90942a;
    }

    public final float k() {
        return this.f90943b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingValues(start=");
        C1749o.a(this.f90942a, sb2, ", top=");
        C1749o.a(this.f90943b, sb2, ", end=");
        C1749o.a(this.f90944c, sb2, ", bottom=");
        sb2.append((Object) k0.i.u(this.f90945d));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ C1698p0(float f10, float f11, float f12, float f13, C4969v c4969v) {
        this(f10, f11, f12, f13);
    }

    public C1698p0(float f10, float f11, float f12, float f13) {
        this.f90942a = f10;
        this.f90943b = f11;
        this.f90944c = f12;
        this.f90945d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }
}
