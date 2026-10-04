package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xY {
    private static final AtomicInteger NOt;
    private static final AtomicInteger ZRu;
    private static final AtomicInteger mZ;
    private static final AtomicInteger uR;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        ZRu = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        NOt = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        mZ = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        uR = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void NOt() {
        final int i10 = ZRu.get();
        final int i11 = NOt.get();
        final int i12 = mZ.get();
        final int i13 = uR.get();
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.core.xY.1
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("crypt_v4_statistics").NOt(jSONObject.toString());
            }
        });
    }

    public static void ZRu() {
        try {
            long jZRu = com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "upload_time_key", 0L);
            if (jZRu <= 0 || System.currentTimeMillis() - jZRu < 86400000) {
                if (jZRu <= 0 || jZRu > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            NOt();
            synchronized (xY.class) {
                ZRu.set(0);
                NOt.set(0);
                mZ.set(0);
                uR.set(0);
                com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void NOt(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(ZRu.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(NOt.incrementAndGet()));
        }
    }

    public static void ZRu(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.core.xY.2
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("crypt_v4_fail").NOt(jSONObject.toString());
            }
        });
    }

    public static synchronized void ZRu(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(mZ.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(mZ.incrementAndGet()));
        }
    }

    public static void ZRu(JSONObject jSONObject) {
        NOt(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
