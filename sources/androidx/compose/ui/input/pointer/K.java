package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.G1;
import k0.C4813d;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface K extends InterfaceC4814e {

    public static final class a {
        @Deprecated
        public static long a(@NotNull K k10) {
            return J.a(k10);
        }

        @Deprecated
        public static boolean b(@NotNull K k10) {
            return false;
        }

        public static /* synthetic */ void c() {
        }

        @T1
        @Deprecated
        public static int d(@NotNull K k10, long j10) {
            return C4813d.a(k10, j10);
        }

        @T1
        @Deprecated
        public static int e(@NotNull K k10, float f10) {
            return C4813d.b(k10, f10);
        }

        @Deprecated
        public static void f(@NotNull K k10, boolean z10) {
        }

        @T1
        @Deprecated
        public static float g(@NotNull K k10, long j10) {
            return k0.o.a(k10, j10);
        }

        @T1
        @Deprecated
        public static float h(@NotNull K k10, float f10) {
            return f10 / k10.a();
        }

        @T1
        @Deprecated
        public static float i(@NotNull K k10, int i10) {
            return C4813d.d(k10, i10);
        }

        @T1
        @Deprecated
        public static long j(@NotNull K k10, long j10) {
            return C4813d.e(k10, j10);
        }

        @T1
        @Deprecated
        public static float k(@NotNull K k10, long j10) {
            return C4813d.f(k10, j10);
        }

        @T1
        @Deprecated
        public static float l(@NotNull K k10, float f10) {
            return k10.a() * f10;
        }

        @T1
        @Deprecated
        @NotNull
        public static P.j m(@NotNull K k10, @NotNull k0.l lVar) {
            return C4813d.h(k10, lVar);
        }

        @T1
        @Deprecated
        public static long n(@NotNull K k10, long j10) {
            return C4813d.i(k10, j10);
        }

        @T1
        @Deprecated
        public static long o(@NotNull K k10, float f10) {
            return k0.o.b(k10, f10);
        }

        @T1
        @Deprecated
        public static long p(@NotNull K k10, float f10) {
            return C4813d.j(k10, f10);
        }

        @T1
        @Deprecated
        public static long q(@NotNull K k10, int i10) {
            return C4813d.k(k10, i10);
        }
    }

    @Nullable
    <R> Object J0(@NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super R> eVar);

    void O1(boolean z10);

    long b();

    @NotNull
    G1 c();

    long i0();

    boolean m2();
}
