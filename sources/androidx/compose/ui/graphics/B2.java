package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B2 {
    public static /* synthetic */ int a(PathIterator pathIterator, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return pathIterator.h2(z10);
    }

    public static /* synthetic */ PathSegment.Type b(PathIterator pathIterator, float[] fArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pathIterator.X0(fArr, i10);
    }
}
