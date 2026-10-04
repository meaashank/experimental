package androidx.graphics.path;

import androidx.graphics.path.PathSegment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PathSegment.Type[] f113928a = PathSegment.Type.values();

    public static final PathSegment.Type c(int i10) {
        switch (i10) {
            case 0:
                return PathSegment.Type.Move;
            case 1:
                return PathSegment.Type.Line;
            case 2:
                return PathSegment.Type.Quadratic;
            case 3:
                return PathSegment.Type.Conic;
            case 4:
                return PathSegment.Type.Cubic;
            case 5:
                return PathSegment.Type.Close;
            case 6:
                return PathSegment.Type.Done;
            default:
                throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown path segment type ", i10));
        }
    }
}
