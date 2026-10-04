package com.bytedance.adsdk.NOt.uR;

import android.util.Pair;
import androidx.multidex.MultiDexExtractor;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Mm {
    private final TFq ZRu;

    public Mm(TFq tFq) {
        this.ZRu = tFq;
    }

    private File NOt(String str) throws FileNotFoundException {
        File file = new File(ZRu(), ZRu(str, mZ.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(ZRu(), ZRu(str, mZ.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    @WorkerThread
    public Pair<mZ, InputStream> ZRu(String str) {
        try {
            File fileNOt = NOt(str);
            if (fileNOt == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileNOt);
            mZ mZVar = fileNOt.getAbsolutePath().endsWith(MultiDexExtractor.f114845k) ? mZ.ZIP : mZ.JSON;
            fileNOt.getAbsolutePath();
            return new Pair<>(mZVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File ZRu(String str, InputStream inputStream, mZ mZVar) throws IOException {
        File file = new File(ZRu(), ZRu(str, mZVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 != -1) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void ZRu(String str, mZ mZVar) {
        File file = new File(ZRu(), ZRu(str, mZVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File ZRu() {
        File fileZRu = this.ZRu.ZRu();
        if (fileZRu.isFile()) {
            fileZRu.delete();
        }
        if (!fileZRu.exists()) {
            fileZRu.mkdirs();
        }
        return fileZRu;
    }

    private static String ZRu(String str, mZ mZVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? mZVar.ZRu() : mZVar.mZ);
        return sb2.toString();
    }
}
