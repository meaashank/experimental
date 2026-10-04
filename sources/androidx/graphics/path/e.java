package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import dd.j;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@j(name = "PathUtilities")
public final class e {
    @NotNull
    public static final PathIterator a(@NotNull Path path) {
        G.p(path, "<this>");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    @NotNull
    public static final PathIterator b(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
        G.p(path, "<this>");
        G.p(conicEvaluation, "conicEvaluation");
        return new PathIterator(path, conicEvaluation, f10);
    }

    public static /* synthetic */ PathIterator c(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return b(path, conicEvaluation, f10);
    }
}
