package androidx.multidex;

import U6.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.foundation.layout.C1713x0;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiDexExtractor implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f114841g = "MultiDex";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f114842h = "classes";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f114843i = ".dex";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f114844j = ".classes";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f114845k = ".zip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f114846l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f114847m = "multidex.version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f114848n = "timestamp";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f114849o = "crc";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f114850p = "dex.number";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f114851q = "dex.crc.";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f114852r = "dex.time.";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f114853s = 16384;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f114854t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f114855u = "MultiDex.lock";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f114856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f114858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f114859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FileChannel f114860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FileLock f114861f;

    public static class ExtractedDex extends File {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f114862a;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.f114862a = -1L;
        }
    }

    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(MultiDexExtractor.f114855u);
        }
    }

    public MultiDexExtractor(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + j.f68738d + file2.getPath() + ")");
        this.f114856a = file;
        this.f114858c = file2;
        this.f114857b = l(file);
        File file3 = new File(file2, f114855u);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f114859d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f114860e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f114861f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                e(this.f114860e);
                throw e;
            } catch (Error e11) {
                e = e11;
                e(this.f114860e);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                e(this.f114860e);
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            e(this.f114859d);
            throw e;
        } catch (Error e14) {
            e = e14;
            e(this.f114859d);
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            e(this.f114859d);
            throw e;
        }
    }

    public static void e(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void f(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(y.a("tmp-", str), f114845k, file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    e(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            e(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences(f114847m, 4);
    }

    public static long k(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long l(File file) throws IOException {
        long jC = f.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean m(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesG = g(context);
        if (sharedPreferencesG.getLong(str + "timestamp", -1L) != k(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f114849o);
        return sharedPreferencesG.getLong(sb2.toString(), -1L) != j10;
    }

    public static void q(Context context, String str, long j10, long j11, List<ExtractedDex> list) {
        SharedPreferences.Editor editorEdit = g(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(android.support.v4.media.e.a(new StringBuilder(), str, f114849o), j11);
        editorEdit.putInt(str + f114850p, list.size() + 1);
        int i10 = 2;
        for (ExtractedDex extractedDex : list) {
            editorEdit.putLong(str + f114851q + i10, extractedDex.f114862a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            editorEdit.putLong(d.a(sb2, f114852r, i10), extractedDex.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f114861f.release();
        this.f114860e.close();
        this.f114859d.close();
    }

    public final void d() {
        File[] fileArrListFiles = this.f114858c.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f114858c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    public List<? extends File> n(Context context, String str, boolean z10) throws IOException {
        List<ExtractedDex> listP;
        List<ExtractedDex> listO;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f114856a.getPath() + j.f68738d + z10 + j.f68738d + str + ")");
        if (!this.f114861f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !m(context, this.f114856a, this.f114857b, str)) {
            try {
                listO = o(context, str);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listP = p();
                q(context, str, k(this.f114856a), this.f114857b, listP);
                listO = listP;
            }
            Log.i("MultiDex", "load found " + listO.size() + " secondary dex files");
            return listO;
        }
        if (z10) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listP = p();
        q(context, str, k(this.f114856a), this.f114857b, listP);
        listO = listP;
        Log.i("MultiDex", "load found " + listO.size() + " secondary dex files");
        return listO;
    }

    public final List<ExtractedDex> o(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f114856a.getName() + f114844j;
        SharedPreferences sharedPreferencesG = g(context);
        int i10 = sharedPreferencesG.getInt(str + f114850p, 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            ExtractedDex extractedDex = new ExtractedDex(this.f114858c, str2 + i11 + f114845k);
            if (!extractedDex.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
            extractedDex.f114862a = l(extractedDex);
            long j10 = sharedPreferencesG.getLong(str + f114851q + i11, -1L);
            long j11 = sharedPreferencesG.getLong(str + f114852r + i11, -1L);
            long jLastModified = extractedDex.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesG;
                if (j10 == extractedDex.f114862a) {
                    arrayList.add(extractedDex);
                    i11++;
                    sharedPreferencesG = sharedPreferences;
                    str2 = str3;
                }
            }
            StringBuilder sb2 = new StringBuilder("Invalid extracted dex: ");
            sb2.append(extractedDex);
            sb2.append(" (key \"");
            sb2.append(str);
            sb2.append("\"), expected modification time: ");
            sb2.append(j11);
            C1713x0.a(sb2, ", modification time: ", jLastModified, ", expected crc: ");
            sb2.append(j10);
            sb2.append(", file crc: ");
            sb2.append(extractedDex.f114862a);
            throw new IOException(sb2.toString());
        }
        return arrayList;
    }

    public final List<ExtractedDex> p() throws IOException {
        String str = this.f114856a.getName() + f114844j;
        d();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f114856a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f114858c, str + i10 + f114845k);
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i11 = 0;
                boolean z10 = false;
                while (i11 < 3 && !z10) {
                    i11++;
                    f(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.f114862a = l(extractedDex);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(extractedDex.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(extractedDex.length());
                    sb2.append(" - crc: ");
                    sb2.append(extractedDex.f114862a);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                }
                if (!z10) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry(f114842h + i10 + f114843i);
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
        }
    }
}
