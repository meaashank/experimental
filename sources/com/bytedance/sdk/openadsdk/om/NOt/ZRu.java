package com.bytedance.sdk.openadsdk.om.NOt;

import android.text.TextUtils;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private List<C0467ZRu> NOt;
    private String ZRu;
    private List<C0467ZRu> mZ;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.om.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0467ZRu {
        private String NOt;
        private String ZRu;
        private int mZ;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0467ZRu)) {
                return super.equals(obj);
            }
            String str2 = this.ZRu;
            if (str2 != null) {
                C0467ZRu c0467ZRu = (C0467ZRu) obj;
                if (str2.equals(c0467ZRu.ZRu) && (str = this.NOt) != null && str.equals(c0467ZRu.NOt)) {
                    return true;
                }
            }
            return false;
        }

        public static C0467ZRu ZRu(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0467ZRu c0467ZRu = new C0467ZRu();
            c0467ZRu.ZRu = jSONObject.optString("url");
            c0467ZRu.NOt = jSONObject.optString(FileResponse.FIELD_MD5);
            c0467ZRu.mZ = jSONObject.optInt("type");
            return c0467ZRu;
        }

        public String ZRu() {
            return this.ZRu;
        }
    }

    public void NOt(List<C0467ZRu> list) {
        this.mZ = list;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public List<C0467ZRu> mZ() {
        return this.mZ;
    }

    public List<C0467ZRu> NOt() {
        return this.NOt;
    }

    public void ZRu(List<C0467ZRu> list) {
        this.NOt = list;
    }

    public static ZRu NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ZRu zRu = new ZRu();
            zRu.ZRu(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0467ZRu c0467ZRuZRu = C0467ZRu.ZRu(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0467ZRuZRu != null) {
                        if (c0467ZRuZRu.mZ != 1) {
                            if (c0467ZRuZRu.mZ == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0467ZRuZRu);
                            }
                        } else {
                            arrayList.add(c0467ZRuZRu);
                        }
                    }
                }
            }
            zRu.ZRu(arrayList);
            zRu.NOt(arrayList2);
            return zRu;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String ZRu() {
        return this.ZRu;
    }
}
