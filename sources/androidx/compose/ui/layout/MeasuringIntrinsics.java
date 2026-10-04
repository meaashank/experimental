package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.InterfaceC2008b2;
import k0.C4811b;
import k0.C4812c;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class MeasuringIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MeasuringIntrinsics f102482a = new MeasuringIntrinsics();

    public enum IntrinsicMinMax {
        Min,
        Max
    }

    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    public static final class a implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InterfaceC2183s f102483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final IntrinsicMinMax f102484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final IntrinsicWidthHeight f102485c;

        public a(@NotNull InterfaceC2183s interfaceC2183s, @NotNull IntrinsicMinMax intrinsicMinMax, @NotNull IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f102483a = interfaceC2183s;
            this.f102484b = intrinsicMinMax;
            this.f102485c = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.O
        @NotNull
        public v0 B0(long j10) {
            if (this.f102485c == IntrinsicWidthHeight.Width) {
                return new b(this.f102484b == IntrinsicMinMax.Max ? this.f102483a.z0(C4811b.n(j10)) : this.f102483a.w0(C4811b.n(j10)), C4811b.h(j10) ? C4811b.n(j10) : 32767);
            }
            return new b(C4811b.i(j10) ? C4811b.o(j10) : 32767, this.f102484b == IntrinsicMinMax.Max ? this.f102483a.h0(C4811b.o(j10)) : this.f102483a.r0(C4811b.o(j10)));
        }

        @NotNull
        public final InterfaceC2183s a() {
            return this.f102483a;
        }

        @NotNull
        public final IntrinsicMinMax b() {
            return this.f102484b;
        }

        @NotNull
        public final IntrinsicWidthHeight c() {
            return this.f102485c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        @Nullable
        public Object g() {
            return this.f102483a.g();
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int h0(int i10) {
            return this.f102483a.h0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int r0(int i10) {
            return this.f102483a.r0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int w0(int i10) {
            return this.f102483a.w0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int z0(int i10) {
            return this.f102483a.z0(i10);
        }
    }

    public final int a(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return f10.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new a(interfaceC2183s, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), C4812c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return f10.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new a(interfaceC2183s, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), C4812c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return f10.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new a(interfaceC2183s, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), C4812c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return f10.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new a(interfaceC2183s, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), C4812c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static final class b extends v0 {
        public b(int i10, int i11) {
            g1(k0.y.a(i10, i11));
        }

        @Override // androidx.compose.ui.layout.Y
        public int M(@NotNull AbstractC2155a abstractC2155a) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.v0
        public void d1(long j10, float f10, @Nullable ed.l<? super InterfaceC2008b2, L0> lVar) {
        }
    }
}
