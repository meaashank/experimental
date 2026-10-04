package com.github.ahmadaghazadeh.editor.document.commons;

import C4.q;
import androidx.annotation.NonNull;
import com.android.launcher3.IconCache;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.net.URI;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
public class FileObject extends File {
    public FileObject(@NonNull String str) {
        super(str);
    }

    public void d() {
        FileObject[] fileObjectArrListFiles;
        if (isDirectory() && (fileObjectArrListFiles = listFiles()) != null) {
            for (FileObject fileObject : fileObjectArrListFiles) {
                fileObject.d();
            }
        }
        delete();
    }

    public final FileObject[] e(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        FileObject[] fileObjectArr = new FileObject[length];
        for (int i10 = 0; i10 < length; i10++) {
            fileObjectArr[i10] = new FileObject(this, strArr[i10]);
        }
        return fileObjectArr;
    }

    public String g() {
        return FilenameUtils.getExtension(getName());
    }

    public String h() {
        return new SimpleDateFormat("dd/MM/yyyy EEE HH:mm", Locale.getDefault()).format(Long.valueOf(lastModified()));
    }

    public String i() {
        long length = length();
        if (length <= 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        double d10 = length;
        int iLog10 = (int) (Math.log10(d10) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d10 / Math.pow(1024.0d, iLog10)) + q.f17581a + new String[]{"B", "KB", "MB", "GB", "TB"}[iLog10];
    }

    @Override // java.io.File
    public boolean isHidden() {
        return getName().startsWith(IconCache.EMPTY_CLASS_NAME);
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public FileObject[] listFiles() {
        return e(list());
    }

    public FileObject(String str, @NonNull String str2) {
        super(str, str2);
    }

    public FileObject(File file, @NonNull String str) {
        super(file, str);
    }

    public FileObject(@NonNull URI uri) {
        super(uri);
    }
}
