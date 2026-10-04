package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PathIterator extends Iterator<PathSegment>, InterfaceC4418a {

    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    float C0();

    @NotNull
    ConicEvaluation N0();

    @NotNull
    PathSegment.Type X0(@NotNull float[] fArr, int i10);

    @NotNull
    Path getPath();

    int h2(boolean z10);

    @Override // java.util.Iterator
    boolean hasNext();

    @Override // java.util.Iterator
    @NotNull
    PathSegment next();
}
