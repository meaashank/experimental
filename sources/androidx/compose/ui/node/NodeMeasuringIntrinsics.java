package androidx.compose.ui.node;

import androidx.compose.ui.graphics.InterfaceC2008b2;
import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.layout.C2159c;
import androidx.compose.ui.layout.C2186v;
import androidx.compose.ui.layout.InterfaceC2157b;
import androidx.compose.ui.layout.InterfaceC2165f;
import androidx.compose.ui.layout.InterfaceC2183s;
import androidx.compose.ui.layout.InterfaceC2185u;
import k0.C4811b;
import k0.C4812c;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class NodeMeasuringIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final NodeMeasuringIntrinsics f102964a = new NodeMeasuringIntrinsics();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102965b = 0;

    public enum IntrinsicMinMax {
        Min,
        Max
    }

    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    public interface a {
        @NotNull
        androidx.compose.ui.layout.T a(@NotNull InterfaceC2165f interfaceC2165f, @NotNull androidx.compose.ui.layout.O o10, long j10);
    }

    public static final class b implements androidx.compose.ui.layout.O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InterfaceC2183s f102966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final IntrinsicMinMax f102967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final IntrinsicWidthHeight f102968c;

        public b(@NotNull InterfaceC2183s interfaceC2183s, @NotNull IntrinsicMinMax intrinsicMinMax, @NotNull IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f102966a = interfaceC2183s;
            this.f102967b = intrinsicMinMax;
            this.f102968c = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.O
        @NotNull
        public androidx.compose.ui.layout.v0 B0(long j10) {
            if (this.f102968c == IntrinsicWidthHeight.Width) {
                return new c(this.f102967b == IntrinsicMinMax.Max ? this.f102966a.z0(C4811b.n(j10)) : this.f102966a.w0(C4811b.n(j10)), C4811b.h(j10) ? C4811b.n(j10) : 32767);
            }
            return new c(C4811b.i(j10) ? C4811b.o(j10) : 32767, this.f102967b == IntrinsicMinMax.Max ? this.f102966a.h0(C4811b.o(j10)) : this.f102966a.r0(C4811b.o(j10)));
        }

        @NotNull
        public final InterfaceC2183s a() {
            return this.f102966a;
        }

        @NotNull
        public final IntrinsicMinMax b() {
            return this.f102967b;
        }

        @NotNull
        public final IntrinsicWidthHeight c() {
            return this.f102968c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        @Nullable
        public Object g() {
            return this.f102966a.g();
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int h0(int i10) {
            return this.f102966a.h0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int r0(int i10) {
            return this.f102966a.r0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int w0(int i10) {
            return this.f102966a.w0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC2183s
        public int z0(int i10) {
            return this.f102966a.z0(i10);
        }
    }

    public interface d {
        @NotNull
        androidx.compose.ui.layout.T g(@NotNull androidx.compose.ui.layout.V v10, @NotNull androidx.compose.ui.layout.O o10, long j10);
    }

    public final int a(@NotNull a aVar, @NotNull InterfaceC2157b interfaceC2157b, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return aVar.a(new C2159c(interfaceC2157b, interfaceC2157b.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), C4812c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(@NotNull d dVar, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return dVar.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), C4812c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int c(@NotNull a aVar, @NotNull InterfaceC2157b interfaceC2157b, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return aVar.a(new C2159c(interfaceC2157b, interfaceC2157b.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), C4812c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int d(@NotNull d dVar, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return dVar.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), C4812c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int e(@NotNull a aVar, @NotNull InterfaceC2157b interfaceC2157b, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return aVar.a(new C2159c(interfaceC2157b, interfaceC2157b.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), C4812c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int f(@NotNull d dVar, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return dVar.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), C4812c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int g(@NotNull a aVar, @NotNull InterfaceC2157b interfaceC2157b, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return aVar.a(new C2159c(interfaceC2157b, interfaceC2157b.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), C4812c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int h(@NotNull d dVar, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return dVar.g(new C2186v(interfaceC2185u, interfaceC2185u.getLayoutDirection()), new b(interfaceC2183s, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), C4812c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static final class c extends androidx.compose.ui.layout.v0 {
        public c(int i10, int i11) {
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
