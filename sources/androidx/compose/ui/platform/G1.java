package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nViewConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,76:1\n149#2:77\n*S KotlinDebug\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n*L\n62#1:77\n*E\n"})
public interface G1 {

    public static final class a {
        @Deprecated
        public static float a(@NotNull G1 g12) {
            return 16.0f;
        }

        @Deprecated
        public static float b(@NotNull G1 g12) {
            return 2.0f;
        }

        @Deprecated
        public static float c(@NotNull G1 g12) {
            return Float.MAX_VALUE;
        }

        @Deprecated
        public static long d(@NotNull G1 g12) {
            return F1.d(g12);
        }
    }

    long a();

    float b();

    float c();

    float d();

    long e();

    long f();

    long g();

    float h();
}
