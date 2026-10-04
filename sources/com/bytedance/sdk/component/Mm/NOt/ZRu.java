package com.bytedance.sdk.component.Mm.NOt;

import android.text.TextUtils;
import androidx.compose.runtime.changelist.j;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.inmobi.unification.sdk.InitializationStatus;
import com.prism.gaia.download.a;
import com.tonyodev.fetch2core.b;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends mZ {
    public File NOt;
    public File ZRu;
    private volatile boolean aT;

    public ZRu(ZH zh) {
        super(zh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long Ht(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Mm(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean TFq(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get(b.f194469d), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get(b.f194478m);
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uR() {
        try {
            this.ZRu.delete();
        } catch (Throwable unused) {
        }
        try {
            this.NOt.delete();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.Mm.NOt.mZ
    public void NOt() {
        this.aT = true;
        super.NOt();
    }

    public void ZRu(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.ZRu = new File(str, str2);
        this.NOt = new File(str, j.a(str2, ".temp"));
    }

    public void ZRu(final com.bytedance.sdk.component.Mm.ZRu.ZRu zRu) {
        File file = this.ZRu;
        if (file == null || this.NOt == null) {
            if (zRu != null) {
                zRu.ZRu(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.ZRu.length() != 0 && zRu != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.Mm.NOt nOt = new com.bytedance.sdk.component.Mm.NOt(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            nOt.ZRu(this.ZRu);
            zRu.ZRu(this, nOt);
            return;
        }
        long length = this.NOt.length();
        final long j10 = length >= 0 ? length : 0L;
        sAl.ZRu zRu2 = new sAl.ZRu();
        zRu2.ZRu((Object) mZ());
        NOt("Range", "bytes=" + j10 + a.f164606q);
        if (TextUtils.isEmpty(this.FA)) {
            zRu.ZRu(this, new IOException("Url is Empty"));
            return;
        }
        try {
            zRu2.NOt(this.FA);
            if (!TextUtils.isEmpty(this.TFq)) {
                zRu2.ZRu(this.TFq);
            }
            int i10 = this.Ht;
            if (i10 > 0) {
                zRu2.ZRu(i10);
            }
            ZRu(zRu2);
            this.mZ.ZRu(zRu2.ZRu().NOt()).ZRu(new com.bytedance.sdk.component.NOt.ZRu.mZ() { // from class: com.bytedance.sdk.component.Mm.NOt.ZRu.1
                @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
                public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt2, IOException iOException) {
                    com.bytedance.sdk.component.Mm.ZRu.ZRu zRu3 = zRu;
                    if (zRu3 != null) {
                        zRu3.ZRu(ZRu.this, iOException);
                    }
                    ZRu.this.uR();
                }

                /* JADX WARN: Removed duplicated region for block: B:127:0x017f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x014f A[Catch: all -> 0x013b, TryCatch #6 {all -> 0x013b, blocks: (B:44:0x0122, B:46:0x0130, B:48:0x0134, B:51:0x013e, B:52:0x0145, B:54:0x014f, B:56:0x015b, B:59:0x016c, B:62:0x0177, B:63:0x017e, B:58:0x0163, B:65:0x0181, B:67:0x0189, B:70:0x0195, B:72:0x019f, B:74:0x01ab, B:76:0x01b7, B:77:0x01c6, B:78:0x01d3, B:81:0x01ed), top: B:120:0x0122 }] */
                @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt r21, com.bytedance.sdk.component.NOt.ZRu.oK r22) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 567
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Mm.NOt.ZRu.AnonymousClass1.ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt, com.bytedance.sdk.component.NOt.ZRu.oK):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            zRu.ZRu(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[PHI: r10
      0x0130: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:38:0x00f6, B:41:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.Mm.NOt ZRu() {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Mm.NOt.ZRu.ZRu():com.bytedance.sdk.component.Mm.NOt");
    }
}
