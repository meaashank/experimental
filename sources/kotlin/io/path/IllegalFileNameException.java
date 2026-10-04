package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class IllegalFileNameException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(@NotNull Path file, @Nullable Path path, @Nullable String str) {
        super(file.toString(), path != null ? path.toString() : null, str);
        kotlin.jvm.internal.G.p(file, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(@NotNull Path file) {
        this(file, null, null);
        kotlin.jvm.internal.G.p(file, "file");
    }
}
