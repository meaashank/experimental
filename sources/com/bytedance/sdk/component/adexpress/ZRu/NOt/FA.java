package com.bytedance.sdk.component.adexpress.ZRu.NOt;

import com.bytedance.sdk.component.utils.lp;
import com.prism.commons.utils.C3843g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private static com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu ZRu;

    public static synchronized com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu NOt() {
        return ZRu;
    }

    public static void ZRu() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = new File(TFq.FA(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu ZRu2 = com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu.ZRu(new JSONObject(new String(bArr, C3843g.f162098b)));
                        if (ZRu2 != null) {
                            ZRu = ZRu2;
                            ZRu2.mZ();
                        }
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            lp.ZRu("Version", "version init error", th);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th = th4;
            }
        } catch (IOException unused2) {
        }
    }

    public static void mZ() {
        mZ.ZRu(TFq.FA(), NOt(), "temp_pkg_info.json");
    }

    public static void uR() {
        mZ.NOt(TFq.FA(), NOt(), "temp_pkg_info.json");
        ZRu = null;
    }

    public static boolean NOt(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu) {
        return mZ.mZ(NOt(), zRu);
    }

    public static synchronized void ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu) {
        if (zRu != null) {
            if (zRu.Mm()) {
                ZRu = zRu;
            }
        }
    }

    public static boolean ZRu(String str) {
        return mZ.ZRu(NOt(), str);
    }
}
