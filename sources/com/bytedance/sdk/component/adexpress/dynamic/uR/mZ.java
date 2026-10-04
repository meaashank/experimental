package com.bytedance.sdk.component.adexpress.dynamic.uR;

import android.text.TextUtils;
import com.android.launcher3.IconCache;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private JSONObject NOt;
    private HashMap<String, Object> ZRu = new HashMap<>();

    public mZ(JSONObject jSONObject) {
        this.NOt = jSONObject;
    }

    public boolean NOt(String str) {
        return this.ZRu.containsKey(str);
    }

    public Object ZRu(String str) {
        if (this.ZRu.containsKey(str)) {
            return this.ZRu.get(str);
        }
        return null;
    }

    public void ZRu() {
        Iterator<String> itKeys = this.NOt.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.NOt.opt(next);
            int i10 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i10 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.ZRu.put(next + IconCache.EMPTY_CLASS_NAME + i10 + IconCache.EMPTY_CLASS_NAME + next2, objOpt2);
                                }
                            }
                            i10++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i11 = 0; i11 < ((JSONArray) objOpt3).length(); i11++) {
                                    this.ZRu.put(next + IconCache.EMPTY_CLASS_NAME + next3 + IconCache.EMPTY_CLASS_NAME + i11, ((JSONArray) objOpt3).opt(i11));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, FirebaseAnalytics.Param.COUPON)) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.ZRu.put(next + IconCache.EMPTY_CLASS_NAME + next3 + IconCache.EMPTY_CLASS_NAME + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                ZRu(next, next3, objOpt3);
                            } else {
                                this.ZRu.put(next + IconCache.EMPTY_CLASS_NAME + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                this.ZRu.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.ZRu.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.ZRu.put(next + IconCache.EMPTY_CLASS_NAME + next5, objOpt5);
                }
            }
        }
    }

    private void ZRu(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i10 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i10 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.ZRu.put(str + IconCache.EMPTY_CLASS_NAME + str2 + IconCache.EMPTY_CLASS_NAME + next + IconCache.EMPTY_CLASS_NAME + i10 + IconCache.EMPTY_CLASS_NAME + next2, objOpt2);
                        }
                        i10++;
                    }
                }
            } else {
                this.ZRu.put(str + IconCache.EMPTY_CLASS_NAME + str2 + IconCache.EMPTY_CLASS_NAME + next, objOpt);
            }
        }
    }
}
