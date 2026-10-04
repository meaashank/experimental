package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class FileSystemException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f217704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f217705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f217706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(e.b(file, file2, str));
        G.p(file, "file");
        this.f217704a = file;
        this.f217705b = file2;
        this.f217706c = str;
    }

    @NotNull
    public final File d() {
        return this.f217704a;
    }

    @Nullable
    public final File g() {
        return this.f217705b;
    }

    @Nullable
    public final String h() {
        return this.f217706c;
    }

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i10, C4969v c4969v) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
