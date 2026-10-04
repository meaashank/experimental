package kotlin.io.path;

import com.android.launcher3.IconCache;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptySet;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1195:1\n1#2:1196\n1915#3,2:1197\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n415#1:1197,2\n*E\n"})
public class p1 extends PathsKt__PathRecursiveFunctionsKt {
    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path A0(Path path, FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateFile, "createFile(...)");
        return pathCreateFile;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path A1(Path path, Path target, CopyOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        kotlin.jvm.internal.G.p(options, "options");
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(pathMove, "move(...)");
        return pathMove;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path B0(Path path, Path target) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        Path pathCreateLink = Files.createLink(path, target);
        kotlin.jvm.internal.G.o(pathCreateLink, "createLink(...)");
        return pathCreateLink;
    }

    public static /* synthetic */ Path B1(Path path, Path target, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.G.o(pathMove, "move(...)");
        return pathMove;
    }

    @InterfaceC4887e0(version = "1.9")
    @NotNull
    public static final Path C0(@NotNull Path path, @NotNull FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                kotlin.jvm.internal.G.o(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(...)");
                return path;
            } catch (FileAlreadyExistsException e10) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e10;
                }
            }
        }
        return path;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean C1(Path path, LinkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path D0(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateSymbolicLink, "createSymbolicLink(...)");
        return pathCreateSymbolicLink;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <A extends BasicFileAttributes> A D1(Path path, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path E0(String str, FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Map<String, Object> E1(Path path, String attributes, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attributes, "attributes");
        kotlin.jvm.internal.G.p(options, "options");
        Map<String, Object> attributes2 = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(attributes2, "readAttributes(...)");
        return attributes2;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final Path F0(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.G.o(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path F1(Path path) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        kotlin.jvm.internal.G.o(symbolicLink, "readSymbolicLink(...)");
        return symbolicLink;
    }

    public static /* synthetic */ Path G0(String str, FileAttribute[] attributes, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final Path G1(@NotNull Path path, @NotNull Path base) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(base, "base");
        try {
            return G.f217781a.a(path, base);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e10);
        }
    }

    public static /* synthetic */ Path H0(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return F0(path, str, fileAttributeArr);
    }

    @InterfaceC4887e0(version = "1.5")
    @Nullable
    public static final Path H1(@NotNull Path path, @NotNull Path base) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(base, "base");
        try {
            return G.f217781a.a(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path I0(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final Path I1(@NotNull Path path, @NotNull Path base) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(base, "base");
        Path pathH1 = H1(path, base);
        return pathH1 == null ? path : pathH1;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final Path J0(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.G.o(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path J1(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attribute, "attribute");
        kotlin.jvm.internal.G.p(options, "options");
        Path attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(attribute2, "setAttribute(...)");
        return attribute2;
    }

    public static /* synthetic */ Path K0(String str, String str2, FileAttribute[] attributes, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path K1(Path path, FileTime value) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, value);
        kotlin.jvm.internal.G.o(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path L0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return J0(path, str, str2, fileAttributeArr);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path L1(Path path, UserPrincipal value) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        Path owner = Files.setOwner(path, value);
        kotlin.jvm.internal.G.o(owner, "setOwner(...)");
        return owner;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final void M0(Path path) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        Files.delete(path);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path M1(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, value);
        kotlin.jvm.internal.G.o(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean N0(Path path) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path N1(URI uri) {
        kotlin.jvm.internal.G.p(uri, "<this>");
        Path path = Paths.get(uri);
        kotlin.jvm.internal.G.o(path, "get(...)");
        return path;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path O0(Path path, String other) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Path pathResolve = path.resolve(other);
        kotlin.jvm.internal.G.o(pathResolve, "resolve(...)");
        return pathResolve;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <T> T O1(Path path, String glob, ed.l<? super InterfaceC5000m<? extends Path>, ? extends T> block) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(glob, "glob");
        kotlin.jvm.internal.G.p(block, "block");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = C4930r0.a(directoryStreamNewDirectoryStream);
            kotlin.jvm.internal.G.m(directoryStreamA);
            T tInvoke = block.invoke(kotlin.collections.U.E1(directoryStreamA));
            kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
            return tInvoke;
        } finally {
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path P0(Path path, Path other) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Path pathResolve = path.resolve(other);
        kotlin.jvm.internal.G.o(pathResolve, "resolve(...)");
        return pathResolve;
    }

    public static /* synthetic */ Object P1(Path path, String glob, ed.l block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            glob = "*";
        }
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(glob, "glob");
        kotlin.jvm.internal.G.p(block, "block");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = C4930r0.a(directoryStreamNewDirectoryStream);
            kotlin.jvm.internal.G.m(directoryStreamA);
            Object objInvoke = block.invoke(kotlin.collections.U.E1(directoryStreamA));
            kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
            return objInvoke;
        } finally {
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean Q0(Path path, LinkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC4887e0(version = "2.1")
    @kotlin.O0(markerClass = {InterfaceC4931s.class})
    public static final void Q1(@NotNull Path path, int i10, boolean z10, @NotNull ed.l<? super InterfaceC4933t, kotlin.L0> builderAction) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        R1(path, W0(builderAction), i10, z10);
    }

    @InterfaceC4850b0
    @NotNull
    public static final Void R0(@NotNull Path path, @NotNull Class<?> attributeViewClass) {
        kotlin.jvm.internal.G.p(path, "path");
        kotlin.jvm.internal.G.p(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    @InterfaceC4887e0(version = "2.1")
    @kotlin.O0(markerClass = {InterfaceC4931s.class})
    public static final void R1(@NotNull Path path, @NotNull FileVisitor<Path> visitor, int i10, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(visitor, "visitor");
        Files.walkFileTree(path, z10 ? kotlin.collections.x0.f(FileVisitOption.FOLLOW_LINKS) : EmptySet.f217512a, i10, visitor);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <V extends FileAttributeView> V S0(Path path, LinkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static /* synthetic */ void S1(Path path, int i10, boolean z10, ed.l lVar, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        Q1(path, i10, z10, lVar);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <V extends FileAttributeView> V T0(Path path, LinkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static /* synthetic */ void T1(Path path, FileVisitor fileVisitor, int i10, boolean z10, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        R1(path, fileVisitor, i10, z10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final long U0(Path path) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.size(path);
    }

    @InterfaceC4887e0(version = "2.1")
    @kotlin.O0(markerClass = {InterfaceC4931s.class})
    @NotNull
    public static final InterfaceC5000m<Path> U1(@NotNull Path path, @NotNull PathWalkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return new PathTreeWalk(path, options);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final FileStore V0(Path path) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        kotlin.jvm.internal.G.o(fileStore, "getFileStore(...)");
        return fileStore;
    }

    @InterfaceC4887e0(version = "2.1")
    @kotlin.O0(markerClass = {InterfaceC4931s.class})
    @NotNull
    public static final FileVisitor<Path> W0(@NotNull ed.l<? super InterfaceC4933t, kotlin.L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        C4935u c4935u = new C4935u();
        builderAction.invoke(c4935u);
        return c4935u.e();
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final void X0(Path path, String glob, ed.l<? super Path, kotlin.L0> action) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(glob, "glob");
        kotlin.jvm.internal.G.p(action, "action");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = C4930r0.a(directoryStreamNewDirectoryStream);
            kotlin.jvm.internal.G.m(directoryStreamA);
            Iterator it = directoryStreamA.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void Y0(Path path, String glob, ed.l action, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            glob = "*";
        }
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(glob, "glob");
        kotlin.jvm.internal.G.p(action, "action");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = C4930r0.a(directoryStreamNewDirectoryStream);
            kotlin.jvm.internal.G.m(directoryStreamA);
            Iterator it = directoryStreamA.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Object Z0(Path path, String attribute, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attribute, "attribute");
        kotlin.jvm.internal.G.p(options, "options");
        return Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @NotNull
    public static final String a1(@NotNull Path path) {
        String string;
        kotlin.jvm.internal.G.p(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null) ? "" : kotlin.text.M.Q5(string, '.', "");
    }

    @InterfaceC4887e0(version = "1.5")
    public static /* synthetic */ void b1(Path path) {
    }

    public static final String c1(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return e1(path);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @InterfaceC4931s
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @InterfaceC4852c0(expression = "invariantSeparatorsPathString", imports = {}))
    public static /* synthetic */ void d1(Path path) {
    }

    @NotNull
    public static final String e1(@NotNull Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (kotlin.jvm.internal.G.g(separator, RemoteSettings.FORWARD_SLASH_STRING)) {
            return path.toString();
        }
        String string = path.toString();
        kotlin.jvm.internal.G.m(separator);
        return kotlin.text.F.B2(string, separator, RemoteSettings.FORWARD_SLASH_STRING, false, 4, null);
    }

    @InterfaceC4887e0(version = "1.5")
    public static /* synthetic */ void f1(Path path) {
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final FileTime g1(Path path, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    @NotNull
    public static final String h1(@NotNull Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    @InterfaceC4887e0(version = "1.5")
    public static /* synthetic */ void i1(Path path) {
    }

    @NotNull
    public static final String j1(@NotNull Path path) {
        String string;
        kotlin.jvm.internal.G.p(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null) ? "" : kotlin.text.M.b6(string, IconCache.EMPTY_CLASS_NAME, null, 2, null);
    }

    @InterfaceC4887e0(version = "1.5")
    public static /* synthetic */ void k1(Path path) {
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final UserPrincipal l1(Path path, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    public static final String m1(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return path.toString();
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static /* synthetic */ void n1(Path path) {
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Set<PosixFilePermission> o1(Path path, LinkOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean p1(Path path, LinkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean q1(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.isExecutable(path);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path r0(String path) {
        kotlin.jvm.internal.G.p(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        kotlin.jvm.internal.G.o(path2, "get(...)");
        return path2;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean r1(Path path) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.isHidden(path);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path s0(String base, String... subpaths) {
        kotlin.jvm.internal.G.p(base, "base");
        kotlin.jvm.internal.G.p(subpaths, "subpaths");
        Path path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        kotlin.jvm.internal.G.o(path, "get(...)");
        return path;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean s1(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.isReadable(path);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path t0(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.G.o(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean t1(Path path, LinkOption... options) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String u0(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean u1(Path path, Path other) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        return Files.isSameFile(path, other);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path v0(Path path, Path target, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.G.o(pathCopy, "copy(...)");
        return pathCopy;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean v1(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path w0(Path path, Path target, CopyOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        kotlin.jvm.internal.G.p(options, "options");
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(pathCopy, "copy(...)");
        return pathCopy;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean w1(Path path) {
        kotlin.jvm.internal.G.p(path, "<this>");
        return Files.isWritable(path);
    }

    public static /* synthetic */ Path x0(Path path, Path target, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.G.o(pathCopy, "copy(...)");
        return pathCopy;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final List<Path> x1(@NotNull Path path, @NotNull String glob) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = C4930r0.a(directoryStreamNewDirectoryStream);
            kotlin.jvm.internal.G.m(directoryStreamA);
            List<Path> listA6 = kotlin.collections.U.a6(directoryStreamA);
            kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
            return listA6;
        } finally {
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path y0(Path path, FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateDirectories, "createDirectories(...)");
        return pathCreateDirectories;
    }

    public static /* synthetic */ List y1(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return x1(path, str);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path z0(Path path, FileAttribute<?>... attributes) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(attributes, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.G.o(pathCreateDirectory, "createDirectory(...)");
        return pathCreateDirectory;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final Path z1(Path path, Path target, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.G.o(pathMove, "move(...)");
        return pathMove;
    }
}
