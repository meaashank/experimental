package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.runtime.changelist.j;
import com.prism.gaia.server.accounts.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.Ht$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static final class ZRu implements Comparator<File> {
        private ZRu() {
        }

        private int ZRu(long j10, long j11) {
            if (j10 < j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }

        public /* synthetic */ ZRu(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return ZRu(file.lastModified(), file2.lastModified());
        }
    }

    private static void Ht(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static String NOt(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    private static void TFq(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j10;
        long length = file.length();
        if (length == 0) {
            Ht(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j10 = length - 1;
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(j10);
            byte b10 = randomAccessFile.readByte();
            randomAccessFile.seek(j10);
            randomAccessFile.write(b10);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    public static File ZRu(Context context, boolean z10, String str, String str2) {
        String strNOt = NOt(context);
        if (z10) {
            str = ZRu(context) + com.prism.gaia.download.a.f164606q + str;
        }
        if (strNOt != null) {
            String str3 = File.separator;
            if (!strNOt.endsWith(str3)) {
                strNOt = j.a(strNOt, str3);
            }
        }
        String strA = j.a(strNOt, str);
        File file = new File(strA);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strA, str2);
    }

    public static void mZ(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        mZ(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    public static byte[] uR(File file) {
        FileInputStream fileInputStream;
        long length;
        Long lValueOf;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                length = file.length();
                lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[lValueOf.intValue()];
                if (fileInputStream.read(bArr) == length) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    return bArr;
                }
            } catch (Throwable unused3) {
                if (fileInputStream != null) {
                }
                return null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    public static void NOt(File file) throws IOException {
        if (file.exists()) {
            lp.ZRu("splashLoadAd", "update file modify time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            TFq(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File ZRu(Context context, boolean z10, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z10) {
            str = ZRu(context) + com.prism.gaia.download.a.f164606q + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = j.a(absolutePath, str2);
            }
        }
        File file = new File(j.a(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> ZRu(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new ZRu(null));
        return listAsList;
    }

    public static String ZRu(Context context) {
        String strZRu = qF.ZRu(context);
        return (TextUtils.isEmpty(strZRu) || !strZRu.contains(b.f166434b0)) ? strZRu : strZRu.replace(b.f166434b0, com.prism.gaia.download.a.f164606q);
    }
}
