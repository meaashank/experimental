package kotlin.io.path;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Exception> f217831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Path f217832d;

    public r() {
        this(0, 1, null);
    }

    public final void a(@NotNull Exception exception) {
        kotlin.jvm.internal.G.p(exception, "exception");
        this.f217830b++;
        if (this.f217831c.size() < this.f217829a) {
            if (this.f217832d != null) {
                C4928q.a();
                Throwable thInitCause = C4926p.a(String.valueOf(this.f217832d)).initCause(exception);
                kotlin.jvm.internal.G.n(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = C4924o.a(thInitCause);
            }
            this.f217831c.add(exception);
        }
    }

    public final void b(@NotNull Path name) {
        kotlin.jvm.internal.G.p(name, "name");
        Path path = this.f217832d;
        this.f217832d = path != null ? path.resolve(name) : null;
    }

    public final void c(@NotNull Path name) {
        kotlin.jvm.internal.G.p(name, "name");
        Path path = this.f217832d;
        if (!name.equals(path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path2 = this.f217832d;
        this.f217832d = path2 != null ? path2.getParent() : null;
    }

    @NotNull
    public final List<Exception> d() {
        return this.f217831c;
    }

    @Nullable
    public final Path e() {
        return this.f217832d;
    }

    public final int f() {
        return this.f217830b;
    }

    public final void g(@Nullable Path path) {
        this.f217832d = path;
    }

    public r(int i10) {
        this.f217829a = i10;
        this.f217831c = new ArrayList();
    }

    public /* synthetic */ r(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 64 : i10);
    }
}
