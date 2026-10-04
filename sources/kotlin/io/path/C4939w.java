package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.io.path.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4939w extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ed.p<Path, BasicFileAttributes, FileVisitResult> f217838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ed.p<Path, BasicFileAttributes, FileVisitResult> f217839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.p<Path, IOException, FileVisitResult> f217840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ed.p<Path, IOException, FileVisitResult> f217841d;

    /* JADX WARN: Multi-variable type inference failed */
    public C4939w(@Nullable ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @Nullable ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @Nullable ed.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @Nullable ed.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f217838a = pVar;
        this.f217839b = pVar2;
        this.f217840c = pVar3;
        this.f217841d = pVar4;
    }

    @NotNull
    public FileVisitResult a(@NotNull Path dir, @Nullable IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        kotlin.jvm.internal.G.p(dir, "dir");
        ed.p<Path, IOException, FileVisitResult> pVar = this.f217841d;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(dir, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        kotlin.jvm.internal.G.o(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @NotNull
    public FileVisitResult b(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        kotlin.jvm.internal.G.p(dir, "dir");
        kotlin.jvm.internal.G.p(attrs, "attrs");
        ed.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f217838a;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(dir, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.G.o(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @NotNull
    public FileVisitResult c(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        kotlin.jvm.internal.G.p(file, "file");
        kotlin.jvm.internal.G.p(attrs, "attrs");
        ed.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f217839b;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(file, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.G.o(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @NotNull
    public FileVisitResult d(@NotNull Path file, @NotNull IOException exc) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        kotlin.jvm.internal.G.p(file, "file");
        kotlin.jvm.internal.G.p(exc, "exc");
        ed.p<Path, IOException, FileVisitResult> pVar = this.f217840c;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(file, exc)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        kotlin.jvm.internal.G.o(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return a(C4908g.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(C4908g.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return c(C4908g.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return d(C4908g.a(obj), iOException);
    }
}
