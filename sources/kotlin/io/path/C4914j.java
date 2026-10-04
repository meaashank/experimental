package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.C4871m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.io.path.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
public final class C4914j extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4945z f217827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public C4871m<C4945z> f217828c = new C4871m<>();

    public C4914j(boolean z10) {
        this.f217826a = z10;
    }

    public final boolean a() {
        return this.f217826a;
    }

    @NotNull
    public FileVisitResult b(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        kotlin.jvm.internal.G.p(dir, "dir");
        kotlin.jvm.internal.G.p(attrs, "attrs");
        this.f217828c.addLast(new C4945z(dir, attrs.fileKey(), this.f217827b));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.G.o(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @NotNull
    public final List<C4945z> c(@NotNull C4945z directoryNode) throws IOException {
        kotlin.jvm.internal.G.p(directoryNode, "directoryNode");
        this.f217827b = directoryNode;
        Files.walkFileTree(directoryNode.f217847a, C4943y.f217842a.b(this.f217826a), 1, C4910h.a(this));
        this.f217828c.removeFirst();
        C4871m<C4945z> c4871m = this.f217828c;
        this.f217828c = new C4871m<>();
        return c4871m;
    }

    @NotNull
    public FileVisitResult d(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        kotlin.jvm.internal.G.p(file, "file");
        kotlin.jvm.internal.G.p(attrs, "attrs");
        this.f217828c.addLast(new C4945z(file, null, this.f217827b));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.G.o(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(C4908g.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(C4908g.a(obj), basicFileAttributes);
    }
}
