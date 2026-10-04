package Id;

import dd.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.G;
import okio.Q;
import okio.c0;
import okio.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0057a f53049a = C0057a.f53051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    @NotNull
    public static final a f53050b = new C0057a.C0058a();

    /* JADX INFO: renamed from: Id.a$a, reason: collision with other inner class name */
    public static final class C0057a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0057a f53051a = new C0057a();

        /* JADX INFO: renamed from: Id.a$a$a, reason: collision with other inner class name */
        public static final class C0058a implements a {
            @Override // Id.a
            public void a(@NotNull File directory) throws IOException {
                G.p(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(G.C("not a readable directory: ", directory));
                }
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file = fileArrListFiles[i10];
                    i10++;
                    if (file.isDirectory()) {
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(G.C("failed to delete ", file));
                    }
                }
            }

            @Override // Id.a
            public void b(@NotNull File from, @NotNull File to) throws IOException {
                G.p(from, "from");
                G.p(to, "to");
                c(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // Id.a
            public void c(@NotNull File file) throws IOException {
                G.p(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(G.C("failed to delete ", file));
                }
            }

            @Override // Id.a
            public boolean d(@NotNull File file) {
                G.p(file, "file");
                return file.exists();
            }

            @Override // Id.a
            @NotNull
            public c0 e(@NotNull File file) throws FileNotFoundException {
                G.p(file, "file");
                try {
                    return Q.b(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Q.b(file);
                }
            }

            @Override // Id.a
            public long f(@NotNull File file) {
                G.p(file, "file");
                return file.length();
            }

            @Override // Id.a
            @NotNull
            public e0 g(@NotNull File file) throws FileNotFoundException {
                G.p(file, "file");
                return Q.r(file);
            }

            @Override // Id.a
            @NotNull
            public c0 h(@NotNull File file) throws FileNotFoundException {
                G.p(file, "file");
                try {
                    return Q.q(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Q.q(file, false, 1, null);
                }
            }

            @NotNull
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }

    void a(@NotNull File file) throws IOException;

    void b(@NotNull File file, @NotNull File file2) throws IOException;

    void c(@NotNull File file) throws IOException;

    boolean d(@NotNull File file);

    @NotNull
    c0 e(@NotNull File file) throws FileNotFoundException;

    long f(@NotNull File file);

    @NotNull
    e0 g(@NotNull File file) throws FileNotFoundException;

    @NotNull
    c0 h(@NotNull File file) throws FileNotFoundException;
}
