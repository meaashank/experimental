package Z9;

import B0.C0923g;
import android.util.Log;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.remote.AppProceedInfo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import w.y;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84431a = "GuestBundleInstaller";

    public static void a() {
        c(h());
    }

    public static void b(File file, File file2) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 <= 0) {
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                        return;
                    }
                    bufferedOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void c(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        file.delete();
    }

    public static List<File> d(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return arrayList;
                }
                if (!nextEntry.isDirectory()) {
                    String name = new File(nextEntry.getName()).getName();
                    if (name.toLowerCase(Locale.ROOT).endsWith(".apk")) {
                        File file3 = new File(file2, name);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                        while (true) {
                            try {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 <= 0) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, i10);
                            } finally {
                            }
                        }
                        bufferedOutputStream.close();
                        arrayList.add(file3);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                zipInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static AppProceedInfo e(String str) throws IOException {
        return f(g(str));
    }

    public static AppProceedInfo f(File file) {
        return C5842a.m().j(file.getAbsolutePath(), 0);
    }

    public static File g(String str) throws IOException {
        File file;
        File file2 = new File(str);
        if (!file2.isFile()) {
            throw new FileNotFoundException(y.a("bundle not found: ", str));
        }
        File fileH = h();
        c(fileH);
        if (!fileH.mkdirs()) {
            throw new IOException(C0923g.a("mkdir failed: ", fileH));
        }
        File file3 = new File(fileH, "base.apk");
        if (str.toLowerCase(Locale.ROOT).endsWith(".apk")) {
            b(file2, file3);
            return file3;
        }
        ArrayList arrayList = (ArrayList) d(file2, fileH);
        if (arrayList.isEmpty()) {
            throw new IOException("no apk found in bundle: ".concat(str));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                file = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            file = (File) obj;
            if (PkgUtils.g(file.getAbsolutePath()) == null) {
                break;
            }
        }
        if (file == null) {
            file = (File) arrayList.get(0);
        }
        if (!file.equals(file3)) {
            file3.delete();
            if (!file.renameTo(file3)) {
                throw new IOException(C0923g.a("cannot name base as base.apk: ", file));
            }
        }
        StringBuilder sb2 = new StringBuilder("install_bundle: base=");
        sb2.append(PkgUtils.f(file3.getAbsolutePath()));
        sb2.append(", splits=");
        sb2.append(arrayList.size() - 1);
        Log.i(f84431a, sb2.toString());
        return file3;
    }

    public static File h() {
        return new File(GaiaContext.j().n().getCacheDir(), "bundle_stage");
    }
}
