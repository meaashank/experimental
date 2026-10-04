package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.io.path.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4943y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4943y f217842a = new C4943y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final LinkOption[] f217843b = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final LinkOption[] f217844c = new LinkOption[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Set<FileVisitOption> f217845d = EmptySet.f217512a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Set<FileVisitOption> f217846e = kotlin.collections.x0.f(FileVisitOption.FOLLOW_LINKS);

    @NotNull
    public final LinkOption[] a(boolean z10) {
        return z10 ? f217844c : f217843b;
    }

    @NotNull
    public final Set<FileVisitOption> b(boolean z10) {
        return z10 ? f217846e : f217845d;
    }
}
