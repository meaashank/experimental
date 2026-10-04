package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.G1;
import k0.C4813d;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.k
public interface InterfaceC2138e extends InterfaceC4814e {

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.e$a */
    public static final class a {
        @Deprecated
        public static long b(@NotNull InterfaceC2138e interfaceC2138e) {
            return C2137d.a(interfaceC2138e);
        }

        @T1
        @Deprecated
        public static int c(@NotNull InterfaceC2138e interfaceC2138e, long j10) {
            return C4813d.a(interfaceC2138e, j10);
        }

        @T1
        @Deprecated
        public static int d(@NotNull InterfaceC2138e interfaceC2138e, float f10) {
            return C4813d.b(interfaceC2138e, f10);
        }

        @T1
        @Deprecated
        public static float e(@NotNull InterfaceC2138e interfaceC2138e, long j10) {
            return k0.o.a(interfaceC2138e, j10);
        }

        @T1
        @Deprecated
        public static float f(@NotNull InterfaceC2138e interfaceC2138e, float f10) {
            return f10 / interfaceC2138e.a();
        }

        @T1
        @Deprecated
        public static float g(@NotNull InterfaceC2138e interfaceC2138e, int i10) {
            return C4813d.d(interfaceC2138e, i10);
        }

        @T1
        @Deprecated
        public static long h(@NotNull InterfaceC2138e interfaceC2138e, long j10) {
            return C4813d.e(interfaceC2138e, j10);
        }

        @T1
        @Deprecated
        public static float i(@NotNull InterfaceC2138e interfaceC2138e, long j10) {
            return C4813d.f(interfaceC2138e, j10);
        }

        @T1
        @Deprecated
        public static float j(@NotNull InterfaceC2138e interfaceC2138e, float f10) {
            return interfaceC2138e.a() * f10;
        }

        @T1
        @Deprecated
        @NotNull
        public static P.j k(@NotNull InterfaceC2138e interfaceC2138e, @NotNull k0.l lVar) {
            return C4813d.h(interfaceC2138e, lVar);
        }

        @T1
        @Deprecated
        public static long l(@NotNull InterfaceC2138e interfaceC2138e, long j10) {
            return C4813d.i(interfaceC2138e, j10);
        }

        @T1
        @Deprecated
        public static long m(@NotNull InterfaceC2138e interfaceC2138e, float f10) {
            return k0.o.b(interfaceC2138e, f10);
        }

        @T1
        @Deprecated
        public static long n(@NotNull InterfaceC2138e interfaceC2138e, float f10) {
            return C4813d.j(interfaceC2138e, f10);
        }

        @T1
        @Deprecated
        public static long o(@NotNull InterfaceC2138e interfaceC2138e, int i10) {
            return C4813d.k(interfaceC2138e, i10);
        }

        @Deprecated
        @Nullable
        public static <T> Object p(@NotNull InterfaceC2138e interfaceC2138e, long j10, @NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
            return pVar.invoke(interfaceC2138e, eVar);
        }

        @Deprecated
        @Nullable
        public static <T> Object q(@NotNull InterfaceC2138e interfaceC2138e, long j10, @NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
            return pVar.invoke(interfaceC2138e, eVar);
        }
    }

    @Nullable
    <T> Object T0(long j10, @NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar);

    @Nullable
    Object T1(@NotNull PointerEventPass pointerEventPass, @NotNull kotlin.coroutines.e<? super C2150q> eVar);

    @NotNull
    C2150q U1();

    long b();

    @NotNull
    G1 c();

    long i0();

    @Nullable
    <T> Object y0(long j10, @NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar);
}
