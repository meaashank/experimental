package androidx.compose.ui.graphics;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface C0 {

    public static final class a {
        @Deprecated
        public static void c(@NotNull C0 c02, @NotNull P.j jVar, int i10) {
            B0.a(c02, jVar, i10);
        }

        @Deprecated
        public static void e(@NotNull C0 c02, @NotNull P.j jVar, float f10, float f11, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
            B0.b(c02, jVar, f10, f11, z10, interfaceC2105s2);
        }

        @Deprecated
        public static void f(@NotNull C0 c02, @NotNull P.j jVar, float f10, float f11, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
            B0.c(c02, jVar, f10, f11, z10, interfaceC2105s2);
        }

        @Deprecated
        public static void h(@NotNull C0 c02, @NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2) {
            B0.d(c02, jVar, interfaceC2105s2);
        }

        @Deprecated
        public static void i(@NotNull C0 c02, @NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2) {
            B0.e(c02, jVar, interfaceC2105s2);
        }

        @Deprecated
        public static void k(@NotNull C0 c02, float f10, float f11) {
            B0.f(c02, f10, f11);
        }
    }

    void A();

    void B(@NotNull float[] fArr);

    void C(@NotNull Path path, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void D(long j10, float f10, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void E(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void d(@NotNull Path path, int i10);

    void e(int i10, @NotNull List<P.g> list, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void f(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void g(int i10, @NotNull float[] fArr, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void h(@NotNull Vertices vertices, int i10, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void i(@NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void j(@NotNull P.j jVar, float f10, float f11, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void k(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void l(@NotNull P.j jVar, int i10);

    void m();

    void n(float f10, float f11);

    void o(float f10, float f11, float f12, float f13, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void p(float f10, float f11, float f12, float f13, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void q(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void r();

    void s(@NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void t();

    void u(@NotNull P.j jVar, float f10, float f11, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void v(@NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void w(long j10, long j11, @NotNull InterfaceC2105s2 interfaceC2105s2);

    void x(float f10, float f11);

    void y(float f10);

    void z(float f10, float f11);
}
