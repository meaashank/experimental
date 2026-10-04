package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.io.path.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4935u implements InterfaceC4933t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f217833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f217834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ed.p<? super Path, ? super IOException, ? extends FileVisitResult> f217835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ed.p<? super Path, ? super IOException, ? extends FileVisitResult> f217836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f217837e;

    @Override // kotlin.io.path.InterfaceC4933t
    public void a(@NotNull ed.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.G.p(function, "function");
        f();
        g(this.f217835c, "onVisitFileFailed");
        this.f217835c = function;
    }

    @Override // kotlin.io.path.InterfaceC4933t
    public void b(@NotNull ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.G.p(function, "function");
        f();
        g(this.f217833a, "onPreVisitDirectory");
        this.f217833a = function;
    }

    @Override // kotlin.io.path.InterfaceC4933t
    public void c(@NotNull ed.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.G.p(function, "function");
        f();
        g(this.f217836d, "onPostVisitDirectory");
        this.f217836d = function;
    }

    @Override // kotlin.io.path.InterfaceC4933t
    public void d(@NotNull ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.G.p(function, "function");
        f();
        g(this.f217834b, "onVisitFile");
        this.f217834b = function;
    }

    @NotNull
    public final FileVisitor<Path> e() {
        f();
        this.f217837e = true;
        return C4910h.a(new C4939w(this.f217833a, this.f217834b, this.f217835c, this.f217836d));
    }

    public final void f() {
        if (this.f217837e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final void g(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(androidx.compose.runtime.changelist.j.a(str, " was already defined"));
        }
    }
}
