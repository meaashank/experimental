package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@j
public interface m {

    public static final class a {
        @Deprecated
        public static long c(@NotNull m mVar) {
            return l.a(mVar);
        }
    }

    long Y();

    void a(@NotNull float[] fArr);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void d(@NotNull Path path, int i10);

    long e();

    void f(float f10, float f11, long j10);

    void g(float f10, long j10);

    void h(float f10, float f11, float f12, float f13);
}
