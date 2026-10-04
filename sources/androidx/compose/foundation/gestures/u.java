package androidx.compose.foundation.gestures;

import androidx.compose.runtime.T1;
import k0.C4813d;
import k0.InterfaceC4814e;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface u extends InterfaceC4814e {

    public static final class a {
        @T1
        @Deprecated
        public static int a(@NotNull u uVar, long j10) {
            return C4813d.a(uVar, j10);
        }

        @T1
        @Deprecated
        public static int b(@NotNull u uVar, float f10) {
            return C4813d.b(uVar, f10);
        }

        @T1
        @Deprecated
        public static float c(@NotNull u uVar, long j10) {
            return k0.o.a(uVar, j10);
        }

        @T1
        @Deprecated
        public static float d(@NotNull u uVar, float f10) {
            return f10 / uVar.a();
        }

        @T1
        @Deprecated
        public static float e(@NotNull u uVar, int i10) {
            return C4813d.d(uVar, i10);
        }

        @T1
        @Deprecated
        public static long f(@NotNull u uVar, long j10) {
            return C4813d.e(uVar, j10);
        }

        @T1
        @Deprecated
        public static float g(@NotNull u uVar, long j10) {
            return C4813d.f(uVar, j10);
        }

        @T1
        @Deprecated
        public static float h(@NotNull u uVar, float f10) {
            return uVar.a() * f10;
        }

        @T1
        @Deprecated
        @NotNull
        public static P.j i(@NotNull u uVar, @NotNull k0.l lVar) {
            return C4813d.h(uVar, lVar);
        }

        @T1
        @Deprecated
        public static long j(@NotNull u uVar, long j10) {
            return C4813d.i(uVar, j10);
        }

        @T1
        @Deprecated
        public static long k(@NotNull u uVar, float f10) {
            return k0.o.b(uVar, f10);
        }

        @T1
        @Deprecated
        public static long l(@NotNull u uVar, float f10) {
            return C4813d.j(uVar, f10);
        }

        @T1
        @Deprecated
        public static long m(@NotNull u uVar, int i10) {
            return C4813d.k(uVar, i10);
        }
    }

    @Nullable
    Object J1(@NotNull kotlin.coroutines.e<? super Boolean> eVar);

    @Nullable
    Object b2(@NotNull kotlin.coroutines.e<? super L0> eVar);
}
