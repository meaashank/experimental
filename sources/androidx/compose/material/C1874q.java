package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.C2027f0;
import androidx.compose.ui.graphics.C2031g0;
import androidx.compose.ui.graphics.E2;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.material.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1874q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f98742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final E2 f98743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Path f98744c;

    public C1874q() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final Path a() {
        return this.f98742a;
    }

    @NotNull
    public final E2 b() {
        return this.f98743b;
    }

    @NotNull
    public final Path c() {
        return this.f98744c;
    }

    public C1874q(@NotNull Path path, @NotNull E2 e22, @NotNull Path path2) {
        this.f98742a = path;
        this.f98743b = e22;
        this.f98744c = path2;
    }

    public /* synthetic */ C1874q(Path path, E2 e22, Path path2, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? C2031g0.a() : path, (i10 & 2) != 0 ? C2027f0.a() : e22, (i10 & 4) != 0 ? C2031g0.a() : path2);
    }
}
