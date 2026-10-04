package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface A {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull A a10) {
            return true;
        }

        @Deprecated
        public static boolean b(@NotNull A a10) {
            return true;
        }

        @Deprecated
        public static boolean c(@NotNull A a10) {
            return false;
        }

        @Deprecated
        public static boolean d(@NotNull A a10) {
            return false;
        }
    }

    @Nullable
    Object a(@NotNull MutatePriority mutatePriority, @NotNull ed.p<? super w, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar);

    float b(float f10);

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();
}
