package androidx.compose.runtime;

import ed.InterfaceC4376a;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: renamed from: androidx.compose.runtime.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1946s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f99968a = a.f99969a;

    /* JADX INFO: renamed from: androidx.compose.runtime.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f99969a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Object f99970b = new C0243a();

        /* JADX INFO: renamed from: androidx.compose.runtime.s$a$a, reason: collision with other inner class name */
        public static final class C0243a {
            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        @NotNull
        public final Object a() {
            return f99970b;
        }

        @InterfaceC1939p0
        public final void b(@NotNull J j10) {
            C1968u.f100214a = j10;
        }
    }

    @InterfaceC1935o
    boolean A(boolean z10);

    @InterfaceC1935o
    boolean B(short s10);

    @InterfaceC1935o
    boolean C(float f10);

    @InterfaceC1935o
    void D();

    @InterfaceC1935o
    boolean E(int i10);

    @InterfaceC1935o
    boolean F(long j10);

    @InterfaceC1935o
    boolean G(byte b10);

    @InterfaceC1935o
    boolean H(char c10);

    @InterfaceC1935o
    boolean I(double d10);

    boolean J();

    @InterfaceC1935o
    void K();

    @InterfaceC1935o
    @NotNull
    InterfaceC1946s L(int i10);

    @NotNull
    InterfaceC1908f<?> M();

    @InterfaceC1935o
    @Nullable
    InterfaceC1948s1 N();

    @InterfaceC1935o
    @NotNull
    Object O(@Nullable Object obj, @Nullable Object obj2);

    @InterfaceC1935o
    void P();

    @InterfaceC1936o0
    <T> T Q(@NotNull A<T> a10);

    @TestOnly
    @NotNull
    kotlin.coroutines.i R();

    @InterfaceC1935o
    void S(@Nullable Object obj);

    @InterfaceC1935o
    void T();

    @InterfaceC1936o0
    void U(@NotNull C1984z0<?> c1984z0, @Nullable Object obj);

    @TestOnly
    void V();

    void W();

    @Nullable
    InterfaceC1906e1 X();

    @InterfaceC1935o
    void Y();

    @InterfaceC1935o
    void Z(int i10);

    int a();

    @InterfaceC1935o
    @Nullable
    Object a0();

    @InterfaceC1935o
    void b(boolean z10);

    @NotNull
    androidx.compose.runtime.tooling.b b0();

    boolean c();

    @InterfaceC1935o
    boolean c0(@Nullable Object obj);

    @InterfaceC1936o0
    void d(@NotNull List<Pair<B0, B0>> list);

    @InterfaceC1936o0
    void d0(@NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a);

    @InterfaceC1935o
    <V, T> void e(V v10, @NotNull ed.p<? super T, ? super V, kotlin.L0> pVar);

    @InterfaceC1935o
    void e0();

    @InterfaceC1935o
    void f(int i10);

    @InterfaceC1935o
    void f0(int i10, @Nullable Object obj);

    @NotNull
    D g();

    @InterfaceC1935o
    void g0();

    @InterfaceC1935o
    void h();

    @InterfaceC1936o0
    void h0(@NotNull C1888b1<?> c1888b1);

    @InterfaceC1936o0
    void i();

    @InterfaceC1936o0
    void i0();

    @InterfaceC1935o
    void j();

    int j0();

    @InterfaceC1935o
    void k();

    @InterfaceC1935o
    void k0();

    @InterfaceC1935o
    void l(int i10, @Nullable Object obj);

    @InterfaceC1935o
    void l0();

    @Nullable
    Object m();

    void n(@NotNull String str);

    @InterfaceC1935o
    void o();

    @InterfaceC1935o
    <T> void p(@NotNull InterfaceC4376a<? extends T> interfaceC4376a);

    void q(int i10, @NotNull String str);

    @TestOnly
    @NotNull
    L r();

    boolean s();

    @InterfaceC1936o0
    void t(@NotNull InterfaceC1906e1 interfaceC1906e1);

    @InterfaceC1935o
    void u();

    @InterfaceC1936o0
    @NotNull
    AbstractC1974w v();

    void w();

    @InterfaceC1935o
    boolean x(@Nullable Object obj);

    @InterfaceC1935o
    void y(int i10);

    @InterfaceC1936o0
    void z(@NotNull C1888b1<?>[] c1888b1Arr);
}
