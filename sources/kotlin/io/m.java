package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class m extends l {
    @NotNull
    public static final h O(@NotNull File file, @NotNull FileWalkDirection direction) {
        G.p(file, "<this>");
        G.p(direction, "direction");
        return new h(file, direction);
    }

    public static /* synthetic */ h P(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return O(file, fileWalkDirection);
    }

    @NotNull
    public static final h Q(@NotNull File file) {
        G.p(file, "<this>");
        return O(file, FileWalkDirection.BOTTOM_UP);
    }

    @NotNull
    public static final h R(@NotNull File file) {
        G.p(file, "<this>");
        return O(file, FileWalkDirection.TOP_DOWN);
    }
}
