package androidx.compose.ui.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.layout.v0;
import java.util.Map;
import k0.C4813d;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,134:1\n341#2:135\n342#2:141\n345#2:143\n42#3,5:136\n48#3:142\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n*L\n79#1:135\n79#1:141\n79#1:143\n79#1:136,5\n79#1:142\n*E\n"})
@W
public interface V extends InterfaceC2185u {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull V v10) {
            return false;
        }

        @Deprecated
        @NotNull
        public static T b(@NotNull V v10, int i10, int i11, @NotNull Map<AbstractC2155a, Integer> map, @NotNull ed.l<? super v0.a, L0> lVar) {
            return v10.F0(i10, i11, map, null, lVar);
        }

        @Deprecated
        @NotNull
        public static T c(@NotNull V v10, int i10, int i11, @NotNull Map<AbstractC2155a, Integer> map, @Nullable ed.l<? super B0, L0> lVar, @NotNull ed.l<? super v0.a, L0> lVar2) {
            return U.b(v10, i10, i11, map, lVar, lVar2);
        }

        @T1
        @Deprecated
        public static int f(@NotNull V v10, long j10) {
            return C4813d.a(v10, j10);
        }

        @T1
        @Deprecated
        public static int g(@NotNull V v10, float f10) {
            return C4813d.b(v10, f10);
        }

        @T1
        @Deprecated
        public static float h(@NotNull V v10, long j10) {
            return k0.o.a(v10, j10);
        }

        @T1
        @Deprecated
        public static float i(@NotNull V v10, float f10) {
            return f10 / v10.a();
        }

        @T1
        @Deprecated
        public static float j(@NotNull V v10, int i10) {
            return C4813d.d(v10, i10);
        }

        @T1
        @Deprecated
        public static long k(@NotNull V v10, long j10) {
            return C4813d.e(v10, j10);
        }

        @T1
        @Deprecated
        public static float l(@NotNull V v10, long j10) {
            return C4813d.f(v10, j10);
        }

        @T1
        @Deprecated
        public static float m(@NotNull V v10, float f10) {
            return v10.a() * f10;
        }

        @T1
        @Deprecated
        @NotNull
        public static P.j n(@NotNull V v10, @NotNull k0.l lVar) {
            return C4813d.h(v10, lVar);
        }

        @T1
        @Deprecated
        public static long o(@NotNull V v10, long j10) {
            return C4813d.i(v10, j10);
        }

        @T1
        @Deprecated
        public static long p(@NotNull V v10, float f10) {
            return k0.o.b(v10, f10);
        }

        @T1
        @Deprecated
        public static long q(@NotNull V v10, float f10) {
            return C4813d.j(v10, f10);
        }

        @T1
        @Deprecated
        public static long r(@NotNull V v10, int i10) {
            return C4813d.k(v10, i10);
        }
    }

    @NotNull
    T F0(int i10, int i11, @NotNull Map<AbstractC2155a, Integer> map, @Nullable ed.l<? super B0, L0> lVar, @NotNull ed.l<? super v0.a, L0> lVar2);

    @NotNull
    T H1(int i10, int i11, @NotNull Map<AbstractC2155a, Integer> map, @NotNull ed.l<? super v0.a, L0> lVar);
}
