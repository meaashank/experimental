package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene ZRu;

    public to(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.ZRu = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        xY.ZRu(1, this.ZRu, i10);
        return com.bytedance.sdk.component.utils.ZRu.ZRu(jSONObject);
    }
}
