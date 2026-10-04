package kotlin.io;

import com.android.launcher3.IconCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.C;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.L0;
import kotlin.collections.U;
import kotlin.io.h;
import kotlin.io.h.b;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,478:1\n1#2:479\n1313#3,3:480\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n352#1:480,3\n*E\n"})
public class p extends m {
    public static /* synthetic */ OnErrorAction S(File file, IOException iOException) {
        W(file, iOException);
        throw null;
    }

    @C
    public static final boolean U(@NotNull File file, @NotNull File target, boolean z10, @NotNull final ed.p<? super File, ? super IOException, ? extends OnErrorAction> onError) throws IOException {
        G.p(file, "<this>");
        G.p(target, "target");
        G.p(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            h.b bVar = m.R(file).k(new ed.p() { // from class: kotlin.io.n
                @Override // ed.p
                public final Object invoke(Object obj, Object obj2) {
                    return p.X(onError, (File) obj, (IOException) obj2);
                }
            }).new b();
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.exists()) {
                    File file2 = new File(target, w0(next, file));
                    if (file2.exists() && (!next.isDirectory() || !file2.isDirectory())) {
                        if (z10) {
                            if (file2.isDirectory()) {
                                if (!e0(file2)) {
                                }
                            } else if (!file2.delete()) {
                            }
                        }
                        if (onError.invoke(file2, new FileAlreadyExistsException(next, file2, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file2.mkdirs();
                    } else {
                        boolean z11 = z10;
                        Z(next, file2, z11, 0, 4, null);
                        if (file2.length() != next.length() && onError.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else if (onError.invoke(next, new NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean V(File file, File file2, boolean z10, ed.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            pVar = new o();
        }
        return U(file, file2, z10, pVar);
    }

    public static final OnErrorAction W(File file, IOException exception) {
        G.p(file, "<unused var>");
        G.p(exception, "exception");
        throw exception;
    }

    public static final L0 X(ed.p pVar, File f10, IOException e10) throws TerminateException {
        G.p(f10, "f");
        G.p(e10, "e");
        if (pVar.invoke(f10, e10) != OnErrorAction.TERMINATE) {
            return L0.f217464a;
        }
        throw new TerminateException(f10);
    }

    @C
    @NotNull
    public static final File Y(@NotNull File file, @NotNull File target, boolean z10, int i10) throws IOException {
        G.p(file, "<this>");
        G.p(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                a.k(fileInputStream, fileOutputStream, i10);
                fileOutputStream.close();
                fileInputStream.close();
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File Z(File file, File file2, boolean z10, int i10, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        Y(file, file2, z10, i10);
        return file2;
    }

    @InterfaceC4982o(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @InterfaceC4984p(errorSince = "2.3", warningSince = "1.4")
    @NotNull
    public static final File a0(@NotNull String prefix, @Nullable String str, @Nullable File file) throws IOException {
        G.p(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ File b0(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return a0(str, str2, file);
    }

    @InterfaceC4982o(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @InterfaceC4984p(errorSince = "2.3", warningSince = "1.4")
    @NotNull
    public static final File c0(@NotNull String prefix, @Nullable String str, @Nullable File file) throws IOException {
        G.p(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        G.o(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File d0(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return c0(str, str2, file);
    }

    @C
    public static final boolean e0(@NotNull File file) {
        G.p(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : m.Q(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static final boolean f0(@NotNull File file, @NotNull File other) {
        G.p(file, "<this>");
        G.p(other, "other");
        g gVarF = j.f(file);
        g gVarF2 = j.f(other);
        if (gVarF2.i()) {
            return file.equals(other);
        }
        int size = gVarF.f217739b.size() - gVarF2.f217739b.size();
        if (size < 0) {
            return false;
        }
        List<File> list = gVarF.f217739b;
        return list.subList(size, list.size()).equals(gVarF2.f217739b);
    }

    public static final boolean g0(@NotNull File file, @NotNull String other) {
        G.p(file, "<this>");
        G.p(other, "other");
        return f0(file, new File(other));
    }

    @NotNull
    public static String h0(@NotNull File file) {
        G.p(file, "<this>");
        String name = file.getName();
        G.o(name, "getName(...)");
        return M.Q5(name, '.', "");
    }

    @NotNull
    public static final String i0(@NotNull File file) {
        G.p(file, "<this>");
        char c10 = File.separatorChar;
        if (c10 != '/') {
            String path = file.getPath();
            G.o(path, "getPath(...)");
            return F.A2(path, c10, '/', false, 4, null);
        }
        String path2 = file.getPath();
        G.o(path2, "getPath(...)");
        return path2;
    }

    @NotNull
    public static String j0(@NotNull File file) {
        G.p(file, "<this>");
        String name = file.getName();
        G.o(name, "getName(...)");
        return M.b6(name, IconCache.EMPTY_CLASS_NAME, null, 2, null);
    }

    @NotNull
    public static final File k0(@NotNull File file) {
        G.p(file, "<this>");
        g gVarF = j.f(file);
        File file2 = gVarF.f217738a;
        List<File> listL0 = l0(gVarF.f217739b);
        String separator = File.separator;
        G.o(separator, "separator");
        return r0(file2, U.r3(listL0, separator, null, null, 0, null, null, 62, null));
    }

    public static final List<File> l0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!G.g(name, IconCache.EMPTY_CLASS_NAME)) {
                if (!G.g(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || G.g(((File) U.u3(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static final g m0(g gVar) {
        return new g(gVar.f217738a, l0(gVar.f217739b));
    }

    @NotNull
    public static final File n0(@NotNull File file, @NotNull File base) {
        G.p(file, "<this>");
        G.p(base, "base");
        return new File(w0(file, base));
    }

    @Nullable
    public static final File o0(@NotNull File file, @NotNull File base) throws IOException {
        G.p(file, "<this>");
        G.p(base, "base");
        String strX0 = x0(file, base);
        if (strX0 != null) {
            return new File(strX0);
        }
        return null;
    }

    @NotNull
    public static final File p0(@NotNull File file, @NotNull File base) throws IOException {
        G.p(file, "<this>");
        G.p(base, "base");
        String strX0 = x0(file, base);
        return strX0 != null ? new File(strX0) : file;
    }

    @NotNull
    public static final File q0(@NotNull File file, @NotNull File relative) {
        G.p(file, "<this>");
        G.p(relative, "relative");
        if (j.d(relative)) {
            return relative;
        }
        String string = file.toString();
        G.o(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!M.u3(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    @NotNull
    public static final File r0(@NotNull File file, @NotNull String relative) {
        G.p(file, "<this>");
        G.p(relative, "relative");
        return q0(file, new File(relative));
    }

    @NotNull
    public static final File s0(@NotNull File file, @NotNull File relative) {
        G.p(file, "<this>");
        G.p(relative, "relative");
        g gVarF = j.f(file);
        return q0(q0(gVarF.f217738a, gVarF.f217739b.size() == 0 ? new File("..") : gVarF.j(0, gVarF.f217739b.size() - 1)), relative);
    }

    @NotNull
    public static final File t0(@NotNull File file, @NotNull String relative) {
        G.p(file, "<this>");
        G.p(relative, "relative");
        return s0(file, new File(relative));
    }

    public static final boolean u0(@NotNull File file, @NotNull File other) {
        G.p(file, "<this>");
        G.p(other, "other");
        g gVarF = j.f(file);
        g gVarF2 = j.f(other);
        if (G.g(gVarF.f217738a, gVarF2.f217738a) && gVarF.f217739b.size() >= gVarF2.f217739b.size()) {
            return gVarF.f217739b.subList(0, gVarF2.f217739b.size()).equals(gVarF2.f217739b);
        }
        return false;
    }

    public static final boolean v0(@NotNull File file, @NotNull String other) {
        G.p(file, "<this>");
        G.p(other, "other");
        return u0(file, new File(other));
    }

    @NotNull
    public static final String w0(@NotNull File file, @NotNull File base) throws IOException {
        G.p(file, "<this>");
        G.p(base, "base");
        String strX0 = x0(file, base);
        if (strX0 != null) {
            return strX0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    public static final String x0(File file, File file2) throws IOException {
        g gVarM0 = m0(j.f(file));
        g gVarM02 = m0(j.f(file2));
        if (!G.g(gVarM0.f217738a, gVarM02.f217738a)) {
            return null;
        }
        int size = gVarM02.f217739b.size();
        int size2 = gVarM0.f217739b.size();
        int iMin = Math.min(size2, size);
        int i10 = 0;
        while (i10 < iMin && G.g(gVarM0.f217739b.get(i10), gVarM02.f217739b.get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = size - 1;
        if (i10 <= i11) {
            while (!G.g(gVarM02.f217739b.get(i11).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < size2) {
            if (i10 < size) {
                sb2.append(File.separatorChar);
            }
            List listG2 = U.g2(gVarM0.f217739b, i10);
            String separator = File.separator;
            G.o(separator, "separator");
            U.p3(listG2, sb2, separator, null, null, 0, null, null, 124, null);
        }
        return sb2.toString();
    }
}
