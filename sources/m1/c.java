package m1;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AbstractC5195a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f221082c;

    public c(@Nullable AbstractC5195a abstractC5195a, File file) {
        super(abstractC5195a);
        this.f221082c = file;
    }

    public static boolean w(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zW = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zW &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zW = false;
                }
            }
        }
        return zW;
    }

    public static String x(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // m1.AbstractC5195a
    public boolean a() {
        return this.f221082c.canRead();
    }

    @Override // m1.AbstractC5195a
    public boolean b() {
        return this.f221082c.canWrite();
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public AbstractC5195a c(String str) {
        File file = new File(this.f221082c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public AbstractC5195a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = androidx.concurrent.futures.a.a(str2, IconCache.EMPTY_CLASS_NAME, extensionFromMimeType);
        }
        File file = new File(this.f221082c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e10) {
            Log.w("DocumentFile", "Failed to createFile: " + e10);
            return null;
        }
    }

    @Override // m1.AbstractC5195a
    public boolean e() {
        w(this.f221082c);
        return this.f221082c.delete();
    }

    @Override // m1.AbstractC5195a
    public boolean f() {
        return this.f221082c.exists();
    }

    @Override // m1.AbstractC5195a
    public String k() {
        return this.f221082c.getName();
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public String m() {
        if (this.f221082c.isDirectory()) {
            return null;
        }
        return x(this.f221082c.getName());
    }

    @Override // m1.AbstractC5195a
    public Uri n() {
        return Uri.fromFile(this.f221082c);
    }

    @Override // m1.AbstractC5195a
    public boolean o() {
        return this.f221082c.isDirectory();
    }

    @Override // m1.AbstractC5195a
    public boolean q() {
        return this.f221082c.isFile();
    }

    @Override // m1.AbstractC5195a
    public boolean r() {
        return false;
    }

    @Override // m1.AbstractC5195a
    public long s() {
        return this.f221082c.lastModified();
    }

    @Override // m1.AbstractC5195a
    public long t() {
        return this.f221082c.length();
    }

    @Override // m1.AbstractC5195a
    public AbstractC5195a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f221082c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (AbstractC5195a[]) arrayList.toArray(new AbstractC5195a[arrayList.size()]);
    }

    @Override // m1.AbstractC5195a
    public boolean v(String str) {
        File file = new File(this.f221082c.getParentFile(), str);
        if (!this.f221082c.renameTo(file)) {
            return false;
        }
        this.f221082c = file;
        return true;
    }
}
