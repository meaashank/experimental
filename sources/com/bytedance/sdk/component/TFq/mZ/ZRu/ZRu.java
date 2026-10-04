package com.bytedance.sdk.component.TFq.mZ.ZRu;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.prism.gaia.download.o;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements com.bytedance.sdk.component.TFq.NOt, Cloneable {
    private static volatile com.bytedance.sdk.component.TFq.NOt Ht;
    private int NOt;
    private File TFq;
    private long ZRu;
    private boolean mZ;
    private boolean uR;

    public ZRu(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    private static long FA() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static com.bytedance.sdk.component.TFq.NOt Mm() {
        return Ht;
    }

    @Override // com.bytedance.sdk.component.TFq.NOt
    public boolean Ht() {
        return true;
    }

    @Override // com.bytedance.sdk.component.TFq.NOt
    public int NOt() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.TFq.NOt
    public File TFq() {
        return this.TFq;
    }

    @Override // com.bytedance.sdk.component.TFq.NOt
    public long ZRu() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.TFq.NOt
    public boolean mZ() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.component.TFq.NOt
    public boolean uR() {
        return this.uR;
    }

    public ZRu(int i10, long j10, boolean z10, boolean z11, File file) {
        this.ZRu = j10;
        this.NOt = i10;
        this.mZ = z10;
        this.uR = z11;
        this.TFq = file;
    }

    public static void ZRu(Context context, com.bytedance.sdk.component.TFq.NOt nOt) {
        if (nOt != null) {
            Ht = nOt;
        } else {
            Ht = ZRu(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.TFq.NOt ZRu(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (Ht == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(FA() / 16, 41943040L);
        } else {
            iMin = Math.min(Ht.NOt() / 2, 31457280);
            jMin = Math.min(Ht.ZRu() / 2, 41943040L);
        }
        return new ZRu(Math.max(iMin, 26214400), Math.max(jMin, o.f164815i), file);
    }
}
