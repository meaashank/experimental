package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.OCA;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface om<T> {

    public interface NOt {
        void ZRu(int i10, String str);

        void ZRu(OCA.NOt nOt);
    }

    public interface ZRu {
        void ZRu(int i10, String str);

        void ZRu(com.bytedance.sdk.openadsdk.core.model.ZRu zRu, com.bytedance.sdk.openadsdk.core.model.NOt nOt);
    }

    com.bytedance.sdk.openadsdk.uR.TFq NOt(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu ZRu();

    com.bytedance.sdk.openadsdk.uR.TFq ZRu(JSONObject jSONObject, String str, boolean z10);

    JSONObject ZRu(JSONObject jSONObject);

    void ZRu(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.OCA oca, int i10, ZRu zRu);

    void ZRu(String str);

    void ZRu(String str, List<FilterWord> list, String str2, String str3, String str4);

    void ZRu(JSONObject jSONObject, NOt nOt);

    void ZRu(JSONObject jSONObject, String str);
}
