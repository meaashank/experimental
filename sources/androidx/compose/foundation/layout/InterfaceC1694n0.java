package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1749o;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public interface InterfaceC1694n0 {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.n0$a */
    @kotlin.jvm.internal.V({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n149#3:486\n149#3:487\n149#3:488\n149#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n208#1:486\n210#1:487\n212#1:488\n214#1:489\n*E\n"})
    @InterfaceC1924k0
    public static final class a implements InterfaceC1694n0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f90935e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f90936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f90937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f90938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f90939d;

        public a(float f10, float f11, float f12, float f13, int i10, C4969v c4969v) {
            this((i10 & 1) != 0 ? 0 : f10, (i10 & 2) != 0 ? 0 : f11, (i10 & 4) != 0 ? 0 : f12, (i10 & 8) != 0 ? 0 : f13);
        }

        @T1
        private static /* synthetic */ void e() {
        }

        @T1
        public static /* synthetic */ void f() {
        }

        @T1
        public static /* synthetic */ void g() {
        }

        @T1
        private static /* synthetic */ void h() {
        }

        @Override // androidx.compose.foundation.layout.InterfaceC1694n0
        public float a() {
            return this.f90939d;
        }

        @Override // androidx.compose.foundation.layout.InterfaceC1694n0
        public float b(@NotNull LayoutDirection layoutDirection) {
            return this.f90936a;
        }

        @Override // androidx.compose.foundation.layout.InterfaceC1694n0
        public float c(@NotNull LayoutDirection layoutDirection) {
            return this.f90938c;
        }

        @Override // androidx.compose.foundation.layout.InterfaceC1694n0
        public float d() {
            return this.f90937b;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k0.i.l(this.f90936a, aVar.f90936a) && k0.i.l(this.f90937b, aVar.f90937b) && k0.i.l(this.f90938c, aVar.f90938c) && k0.i.l(this.f90939d, aVar.f90939d);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f90939d) + androidx.compose.animation.B.a(this.f90938c, androidx.compose.animation.B.a(this.f90937b, Float.floatToIntBits(this.f90936a) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PaddingValues.Absolute(left=");
            C1749o.a(this.f90936a, sb2, ", top=");
            C1749o.a(this.f90937b, sb2, ", right=");
            C1749o.a(this.f90938c, sb2, ", bottom=");
            sb2.append((Object) k0.i.u(this.f90939d));
            sb2.append(')');
            return sb2.toString();
        }

        public /* synthetic */ a(float f10, float f11, float f12, float f13, C4969v c4969v) {
            this(f10, f11, f12, f13);
        }

        public a(float f10, float f11, float f12, float f13) {
            this.f90936a = f10;
            this.f90937b = f11;
            this.f90938c = f12;
            this.f90939d = f13;
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Left padding must be non-negative");
            }
            if (f11 < 0.0f) {
                throw new IllegalArgumentException("Top padding must be non-negative");
            }
            if (f12 < 0.0f) {
                throw new IllegalArgumentException("Right padding must be non-negative");
            }
            if (f13 < 0.0f) {
                throw new IllegalArgumentException("Bottom padding must be non-negative");
            }
        }
    }

    float a();

    float b(@NotNull LayoutDirection layoutDirection);

    float c(@NotNull LayoutDirection layoutDirection);

    float d();
}
