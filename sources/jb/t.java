package Jb;

import U6.b;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "StorageResolverHelper")
public final class t {

    public static final class a extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileOutputStream f58222a;

        public a(FileOutputStream fileOutputStream) throws IOException {
            this.f58222a = fileOutputStream;
            fileOutputStream.getChannel().position(0L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f58222a.close();
        }

        @Override // Jb.r
        public void f(long j10) throws IOException {
            this.f58222a.getChannel().position(j10);
        }

        @Override // Jb.r
        public void flush() throws IOException {
            this.f58222a.flush();
        }

        @Override // Jb.r
        public void write(byte[] byteArray, int i10, int i11) throws IOException {
            G.p(byteArray, "byteArray");
            this.f58222a.write(byteArray, i10, i11);
        }
    }

    public static final void a(@NotNull File file, long j10) throws IOException {
        G.p(file, "file");
        if (!file.exists()) {
            com.tonyodev.fetch2core.b.g(file);
        }
        if (file.length() != j10 && j10 > 0) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(j10);
                randomAccessFile.close();
            } catch (Exception unused) {
                throw new IOException(d.f58171M);
            }
        }
    }

    public static final void b(@NotNull String filePath, long j10, @NotNull Context context) throws IOException {
        G.p(filePath, "filePath");
        G.p(context, "context");
        if (!com.tonyodev.fetch2core.b.G(filePath)) {
            a(new File(filePath), j10);
            return;
        }
        Uri uri = Uri.parse(filePath);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        throw new IOException(d.f58171M);
                    }
                    c(parcelFileDescriptorOpenFileDescriptor, j10);
                    return;
                }
            } else if (scheme.equals(b.h.f68653a)) {
                String path = uri.getPath();
                if (path != null) {
                    filePath = path;
                }
                a(new File(filePath), j10);
                return;
            }
        }
        throw new IOException(d.f58171M);
    }

    public static final void c(@NotNull ParcelFileDescriptor parcelFileDescriptor, long j10) throws IOException {
        G.p(parcelFileDescriptor, "parcelFileDescriptor");
        if (j10 > 0) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                if (fileOutputStream.getChannel().size() == j10) {
                    return;
                }
                fileOutputStream.getChannel().position(j10 - 1);
                fileOutputStream.write(1);
            } catch (Exception unused) {
                throw new IOException(d.f58171M);
            }
        }
    }

    @NotNull
    public static final String d(@NotNull String filePath, boolean z10, @NotNull Context context) throws IOException {
        G.p(filePath, "filePath");
        G.p(context, "context");
        if (!com.tonyodev.fetch2core.b.G(filePath)) {
            return e(filePath, z10);
        }
        Uri uri = Uri.parse(filePath);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        throw new IOException(d.f58179g);
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return filePath;
                }
            } else if (scheme.equals(b.h.f68653a)) {
                String path = uri.getPath();
                if (path != null) {
                    filePath = path;
                }
                return e(filePath, z10);
            }
        }
        throw new IOException(d.f58179g);
    }

    @NotNull
    public static final String e(@NotNull String filePath, boolean z10) throws FileNotFoundException {
        G.p(filePath, "filePath");
        if (!z10) {
            com.tonyodev.fetch2core.b.g(new File(filePath));
            return filePath;
        }
        String absolutePath = com.tonyodev.fetch2core.b.s(filePath).getAbsolutePath();
        G.m(absolutePath);
        return absolutePath;
    }

    public static final boolean f(@NotNull String filePath, @NotNull Context context) {
        G.p(filePath, "filePath");
        G.p(context, "context");
        if (!com.tonyodev.fetch2core.b.G(filePath)) {
            return com.tonyodev.fetch2core.b.h(new File(filePath));
        }
        Uri uri = Uri.parse(filePath);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    return DocumentsContract.isDocumentUri(context, uri) ? DocumentsContract.deleteDocument(context.getContentResolver(), uri) : context.getContentResolver().delete(uri, null, null) > 0;
                }
            } else if (scheme.equals(b.h.f68653a)) {
                File file = new File(String.valueOf(uri.getPath()));
                if (file.canWrite() && file.exists()) {
                    return com.tonyodev.fetch2core.b.h(file);
                }
            }
        }
        return false;
    }

    @NotNull
    public static final r g(@NotNull Uri fileUri, @NotNull ContentResolver contentResolver) throws FileNotFoundException {
        G.p(fileUri, "fileUri");
        G.p(contentResolver, "contentResolver");
        String scheme = fileUri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fileUri, "w");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        return h(parcelFileDescriptorOpenFileDescriptor);
                    }
                    throw new FileNotFoundException(fileUri + " file_not_found");
                }
            } else if (scheme.equals(b.h.f68653a)) {
                File file = new File(String.valueOf(fileUri.getPath()));
                if (file.exists() && file.canWrite()) {
                    return i(file);
                }
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(fileUri, "w");
                if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                    return h(parcelFileDescriptorOpenFileDescriptor2);
                }
                throw new FileNotFoundException(fileUri + " file_not_found");
            }
        }
        throw new FileNotFoundException(fileUri + " file_not_found");
    }

    @NotNull
    public static final r h(@NotNull ParcelFileDescriptor parcelFileDescriptor) {
        G.p(parcelFileDescriptor, "parcelFileDescriptor");
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        G.o(fileDescriptor, "getFileDescriptor(...)");
        return j(fileDescriptor);
    }

    @NotNull
    public static final r i(@NotNull File file) throws FileNotFoundException {
        G.p(file, "file");
        if (file.exists()) {
            return l(new RandomAccessFile(file, "rw"));
        }
        throw new FileNotFoundException(androidx.compose.runtime.changelist.j.a(file.getCanonicalPath(), " file_not_found"));
    }

    @NotNull
    public static final r j(@NotNull FileDescriptor fileDescriptor) {
        G.p(fileDescriptor, "fileDescriptor");
        return k(new FileOutputStream(fileDescriptor));
    }

    @NotNull
    public static final r k(@NotNull FileOutputStream fileOutputStream) {
        G.p(fileOutputStream, "fileOutputStream");
        return new a(fileOutputStream);
    }

    @NotNull
    public static final r l(@NotNull RandomAccessFile randomAccessFile) {
        G.p(randomAccessFile, "randomAccessFile");
        return new b(randomAccessFile);
    }

    @NotNull
    public static final r m(@NotNull String filePath) throws FileNotFoundException {
        G.p(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists()) {
            return i(file);
        }
        throw new FileNotFoundException(file + " file_not_found");
    }

    @NotNull
    public static final r n(@NotNull String filePath, @NotNull ContentResolver contentResolver) {
        G.p(filePath, "filePath");
        G.p(contentResolver, "contentResolver");
        if (!com.tonyodev.fetch2core.b.G(filePath)) {
            return i(new File(filePath));
        }
        Uri uri = Uri.parse(filePath);
        G.o(uri, "parse(...)");
        return g(uri, contentResolver);
    }

    public static final boolean o(@NotNull String oldFile, @NotNull String newFile, @NotNull Context context) {
        G.p(oldFile, "oldFile");
        G.p(newFile, "newFile");
        G.p(context, "context");
        if (!com.tonyodev.fetch2core.b.G(oldFile)) {
            return com.tonyodev.fetch2core.b.H(new File(oldFile), new File(newFile));
        }
        Uri uri = Uri.parse(oldFile);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    if (DocumentsContract.isDocumentUri(context, uri)) {
                        return DocumentsContract.renameDocument(context.getContentResolver(), uri, newFile) != null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("uri", newFile);
                    return context.getContentResolver().update(uri, contentValues, null, null) > 0;
                }
            } else if (scheme.equals(b.h.f68653a)) {
                File file = new File(String.valueOf(uri.getPath()));
                if (file.canWrite() && file.exists()) {
                    return com.tonyodev.fetch2core.b.H(file, new File(newFile));
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("uri", newFile);
                if (context.getContentResolver().update(uri, contentValues2, null, null) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final class b extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RandomAccessFile f58223a;

        public b(RandomAccessFile randomAccessFile) throws IOException {
            this.f58223a = randomAccessFile;
            randomAccessFile.seek(0L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f58223a.close();
        }

        @Override // Jb.r
        public void f(long j10) throws IOException {
            this.f58223a.seek(j10);
        }

        @Override // Jb.r
        public void write(byte[] byteArray, int i10, int i11) throws IOException {
            G.p(byteArray, "byteArray");
            this.f58223a.write(byteArray, i10, i11);
        }

        @Override // Jb.r
        public void flush() {
        }
    }
}
