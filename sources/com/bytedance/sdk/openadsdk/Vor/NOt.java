package com.bytedance.sdk.openadsdk.Vor;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.TFq.ZH;
import com.bytedance.sdk.component.TFq.yBV;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.Yx;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class NOt<T> implements yBV<T> {
    private final String NOt;
    private final long ZRu = SystemClock.elapsedRealtime();
    private final yBV<T> mZ;
    private final qF uR;

    public NOt(qF qFVar, String str, yBV<T> ybv) {
        this.mZ = ybv;
        this.uR = qFVar;
        this.NOt = str;
    }

    @Override // com.bytedance.sdk.component.TFq.yBV
    public void ZRu(ZH<T> zh) {
        yBV<T> ybv = this.mZ;
        if (ybv != null) {
            ybv.ZRu(zh);
        }
        if (this.uR != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ZRu;
            final int iMm = zh.Mm() / 1024;
            final int i10 = zh.Ht() ? 1 : 0;
            com.bytedance.sdk.openadsdk.edo.mZ.ZRu("load_image_success", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.Vor.NOt.1
                @Override // com.bytedance.sdk.openadsdk.edo.NOt
                @Nullable
                public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(x.h.f238399b, jElapsedRealtime);
                    jSONObject.put("url", NOt.this.NOt);
                    jSONObject.put("preload_size", iMm);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", NOt.this.uR.wZ());
                    return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("load_image_success").ZRu(NOt.this.uR.dkT()).NOt(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.TFq.yBV
    public void ZRu(final int i10, final String str, @Nullable Throwable th) {
        yBV<T> ybv = this.mZ;
        if (ybv != null) {
            ybv.ZRu(i10, str, th);
        }
        qF qFVar = this.uR;
        if (qFVar == null || TextUtils.isEmpty(Yx.ZRu(qFVar))) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ZRu;
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu("load_image_error", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.Vor.NOt.2
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(x.h.f238399b, jElapsedRealtime);
                jSONObject.put("url", NOt.this.NOt);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", NOt.this.uR.wZ());
                return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("load_image_error").ZRu(NOt.this.uR.dkT()).NOt(jSONObject.toString());
            }
        });
    }
}
