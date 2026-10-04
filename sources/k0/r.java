package k0;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
@InterfaceC1924k0
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface r {
    @T1
    float k(long j10);

    float m0();

    @T1
    long s(float f10);

    public static final class a {
        @T1
        @Deprecated
        public static float b(@NotNull r rVar, long j10) {
            return q.a(rVar, j10);
        }

        @T1
        @Deprecated
        public static long c(@NotNull r rVar, float f10) {
            return q.b(rVar, f10);
        }

        @T1
        public static /* synthetic */ void a() {
        }
    }
}
