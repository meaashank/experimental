package com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq;

import androidx.compose.runtime.changelist.j;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static File NOt(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, j.a(str2, ".temp"));
    }

    public static long ZRu(String str, String str2) {
        File fileMZ = mZ(str, str2);
        if (fileMZ.exists()) {
            return fileMZ.length();
        }
        File fileNOt = NOt(str, str2);
        if (fileNOt.exists()) {
            return fileNOt.length();
        }
        return 0L;
    }

    public static File mZ(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void ZRu(RandomAccessFile randomAccessFile, byte[] bArr, int i10, int i11, String str) throws IOException {
        try {
            randomAccessFile.seek(i10);
            randomAccessFile.write(bArr, 0, i11);
        } catch (Throwable unused) {
        }
    }
}
