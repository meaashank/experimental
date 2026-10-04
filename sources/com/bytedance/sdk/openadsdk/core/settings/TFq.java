package com.bytedance.sdk.openadsdk.core.settings;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface TFq {
    public static final NOt<JSONObject> ZRu = new NOt<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.TFq.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public JSONObject NOt(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };
    public static final NOt<Set<String>> NOt = new NOt<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.TFq.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public Set<String> NOt(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
                return hashSet;
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("ISettingsDataRepository", "", e10);
                return hashSet;
            }
        }
    };

    public interface NOt<T> {
        T NOt(String str);
    }

    public interface ZRu {
        ZRu ZRu(String str);

        ZRu ZRu(String str, float f10);

        ZRu ZRu(String str, int i10);

        ZRu ZRu(String str, long j10);

        ZRu ZRu(String str, String str2);

        ZRu ZRu(String str, boolean z10);

        void ZRu();
    }

    void ZRu(JSONObject jSONObject);
}
