package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import okio.V;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@IgnoreJRERequirement
public final class O extends D {
    @Override // okio.D, okio.AbstractC5368s
    @Nullable
    public r D(@NotNull V path) {
        kotlin.jvm.internal.G.p(path, "path");
        Path pathD = path.D();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathD, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathD) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            V vI = symbolicLink != null ? V.a.i(V.f225882b, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lP = fileTimeCreationTime != null ? P(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lP2 = fileTimeLastModifiedTime != null ? P(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new r(zIsRegularFile, zIsDirectory, vI, lValueOf, lP, lP2, fileTimeLastAccessTime != null ? P(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public final Long P(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.D, okio.AbstractC5368s
    public void g(@NotNull V source, @NotNull V target) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(target, "target");
        try {
            Files.move(source.D(), target.D(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // okio.D, okio.AbstractC5368s
    public void p(@NotNull V source, @NotNull V target) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(target, "target");
        Files.createSymbolicLink(source.D(), target.D(), new FileAttribute[0]);
    }

    @Override // okio.D
    @NotNull
    public String toString() {
        return "NioSystemFileSystem";
    }
}
