package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.io.path.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4945z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f217847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f217848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C4945z f217849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Iterator<C4945z> f217850d;

    public C4945z(@NotNull Path path, @Nullable Object obj, @Nullable C4945z c4945z) {
        kotlin.jvm.internal.G.p(path, "path");
        this.f217847a = path;
        this.f217848b = obj;
        this.f217849c = c4945z;
    }

    @Nullable
    public final Iterator<C4945z> a() {
        return this.f217850d;
    }

    @Nullable
    public final Object b() {
        return this.f217848b;
    }

    @Nullable
    public final C4945z c() {
        return this.f217849c;
    }

    @NotNull
    public final Path d() {
        return this.f217847a;
    }

    public final void e(@Nullable Iterator<C4945z> it) {
        this.f217850d = it;
    }
}
