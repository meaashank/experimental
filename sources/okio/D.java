package okio;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import okio.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class D extends AbstractC5368s {
    @Override // okio.AbstractC5368s
    @Nullable
    public r D(@NotNull V path) {
        kotlin.jvm.internal.G.p(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new r(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public AbstractC5367q E(@NotNull V file) {
        kotlin.jvm.internal.G.p(file, "file");
        return new C(false, new RandomAccessFile(file.toFile(), CampaignEx.JSON_KEY_AD_R));
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public AbstractC5367q G(@NotNull V file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.G.p(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z10) {
            N(file);
        }
        if (z11) {
            O(file);
        }
        return new C(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public c0 J(@NotNull V file, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(file, "file");
        if (z10) {
            N(file);
        }
        return Q.q(file.toFile(), false, 1, null);
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public e0 L(@NotNull V file) {
        kotlin.jvm.internal.G.p(file, "file");
        return Q.r(file.toFile());
    }

    public final List<V> M(V v10, boolean z10) throws IOException {
        File file = v10.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z10) {
                return null;
            }
            if (file.exists()) {
                throw new IOException("failed to list " + v10);
            }
            throw new FileNotFoundException("no such file: " + v10);
        }
        ArrayList arrayList = new ArrayList();
        for (String it : list) {
            kotlin.jvm.internal.G.o(it, "it");
            arrayList.add(v10.u(it));
        }
        kotlin.collections.M.o0(arrayList);
        return arrayList;
    }

    public final void N(V v10) throws IOException {
        if (w(v10)) {
            throw new IOException(v10 + " already exists.");
        }
    }

    public final void O(V v10) throws IOException {
        if (w(v10)) {
            return;
        }
        throw new IOException(v10 + " doesn't exist.");
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public c0 e(@NotNull V file, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(file, "file");
        if (z10) {
            O(file);
        }
        return Q.m(file.toFile(), true);
    }

    @Override // okio.AbstractC5368s
    public void g(@NotNull V source, @NotNull V target) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public V h(@NotNull V path) throws IOException {
        kotlin.jvm.internal.G.p(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            return V.a.g(V.f225882b, canonicalFile, false, 1, null);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // okio.AbstractC5368s
    public void n(@NotNull V dir, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        r rVarD = D(dir);
        if (rVarD == null || !rVarD.f226088b) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exist.");
        }
    }

    @Override // okio.AbstractC5368s
    public void p(@NotNull V source, @NotNull V target) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.AbstractC5368s
    public void r(@NotNull V path, boolean z10) throws IOException {
        kotlin.jvm.internal.G.p(path, "path");
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.AbstractC5368s
    @NotNull
    public List<V> x(@NotNull V dir) throws IOException {
        kotlin.jvm.internal.G.p(dir, "dir");
        List<V> listM = M(dir, true);
        kotlin.jvm.internal.G.m(listM);
        return listM;
    }

    @Override // okio.AbstractC5368s
    @Nullable
    public List<V> y(@NotNull V dir) {
        kotlin.jvm.internal.G.p(dir, "dir");
        return M(dir, false);
    }
}
