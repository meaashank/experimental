package androidx.compose.ui.layout;

import androidx.compose.runtime.T1;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
@kotlin.jvm.internal.V({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,167:1\n151#2,3:168\n33#2,4:171\n154#2,2:175\n38#2:177\n156#2:178\n151#2,3:179\n33#2,4:182\n154#2,2:186\n38#2:188\n156#2:189\n151#2,3:190\n33#2,4:193\n154#2,2:197\n38#2:199\n156#2:200\n151#2,3:201\n33#2,4:204\n154#2,2:208\n38#2:210\n156#2:211\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n106#1:168,3\n106#1:171,4\n106#1:175,2\n106#1:177\n106#1:178\n124#1:179,3\n124#1:182,4\n124#1:186,2\n124#1:188\n124#1:189\n141#1:190,3\n141#1:193,4\n141#1:197,2\n141#1:199\n141#1:200\n158#1:201,3\n158#1:204,4\n158#1:208,2\n158#1:210\n158#1:211\n*E\n"})
public interface Q {

    public static final class a {
        @Deprecated
        public static int a(@NotNull Q q10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            return P.a(q10, interfaceC2185u, list, i10);
        }

        @Deprecated
        public static int b(@NotNull Q q10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            return P.b(q10, interfaceC2185u, list, i10);
        }

        @Deprecated
        public static int c(@NotNull Q q10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            return P.c(q10, interfaceC2185u, list, i10);
        }

        @Deprecated
        public static int d(@NotNull Q q10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            return P.d(q10, interfaceC2185u, list, i10);
        }
    }

    @NotNull
    T a(@NotNull V v10, @NotNull List<? extends O> list, long j10);

    int b(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10);

    int c(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10);

    int d(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10);

    int e(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10);
}
