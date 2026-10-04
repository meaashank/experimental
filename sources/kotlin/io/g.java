package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f217738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<File> f217739b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull File root, @NotNull List<? extends File> segments) {
        G.p(root, "root");
        G.p(segments, "segments");
        this.f217738a = root;
        this.f217739b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g d(g gVar, File file, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = gVar.f217738a;
        }
        if ((i10 & 2) != 0) {
            list = gVar.f217739b;
        }
        return gVar.c(file, list);
    }

    @NotNull
    public final File a() {
        return this.f217738a;
    }

    @NotNull
    public final List<File> b() {
        return this.f217739b;
    }

    @NotNull
    public final g c(@NotNull File root, @NotNull List<? extends File> segments) {
        G.p(root, "root");
        G.p(segments, "segments");
        return new g(root, segments);
    }

    @NotNull
    public final File e() {
        return this.f217738a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return G.g(this.f217738a, gVar.f217738a) && G.g(this.f217739b, gVar.f217739b);
    }

    @NotNull
    public final String f() {
        String path = this.f217738a.getPath();
        G.o(path, "getPath(...)");
        return path;
    }

    @NotNull
    public final List<File> g() {
        return this.f217739b;
    }

    public final int h() {
        return this.f217739b.size();
    }

    public int hashCode() {
        return this.f217739b.hashCode() + (this.f217738a.hashCode() * 31);
    }

    public final boolean i() {
        String path = this.f217738a.getPath();
        G.o(path, "getPath(...)");
        return path.length() > 0;
    }

    @NotNull
    public final File j(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f217739b.size()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.f217739b.subList(i10, i11);
        String separator = File.separator;
        G.o(separator, "separator");
        return new File(U.r3(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public String toString() {
        return "FilePathComponents(root=" + this.f217738a + ", segments=" + this.f217739b + ')';
    }
}
