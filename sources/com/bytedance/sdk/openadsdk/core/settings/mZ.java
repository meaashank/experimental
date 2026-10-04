package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.VdW;
import e.g0;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private static final ConcurrentHashMap<String, NOt> ZRu = new ConcurrentHashMap<>();

    @NonNull
    private static HashMap<String, NOt> NOt(JSONArray jSONArray) {
        HashMap<String, NOt> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                NOt nOtZRu = ZRu(jSONArray.getJSONObject(i10));
                if (nOtZRu != null) {
                    map.put(nOtZRu.ZRu, nOtZRu);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @g0
    public static void ZRu(boolean z10) {
        File fileNOt = NOt();
        try {
            if (!fileNOt.exists()) {
                String strNOt = com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_settings", "ad_slot_conf", null) : VdW.ZRu("tt_sdk_settings", WMI.ZRu()).ZRu("ad_slot_conf", (String) null);
                if (TextUtils.isEmpty(strNOt)) {
                    return;
                }
                HashMap<String, NOt> mapNOt = NOt(new JSONArray(strNOt));
                if (mapNOt.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, NOt> concurrentHashMap = ZRu;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(mapNOt);
                return;
            }
            HashMap<String, NOt> mapNOt2 = NOt(new JSONArray(new String(com.bytedance.sdk.component.utils.Ht.uR(fileNOt))));
            if (mapNOt2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, NOt> entry : mapNOt2.entrySet()) {
                String key = entry.getKey();
                NOt value = entry.getValue();
                if (!value.Cox || z10) {
                    ZRu.put(key, value);
                } else {
                    NOt nOt = ZRu.get(key);
                    if (nOt != null) {
                        nOt.Hvv = value.Qg;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @NonNull
    private static File NOt() {
        return new File(WMI.ZRu().getFilesDir(), "tt_ads_conf");
    }

    private static NOt NOt(String str) {
        return new NOt(str, 1);
    }

    private static NOt ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new NOt(jSONObject);
    }

    @NonNull
    public static NOt ZRu(String str) {
        NOt nOt = ZRu.get(str);
        return nOt == null ? NOt(str) : nOt;
    }

    @g0
    public static void ZRu(JSONArray jSONArray) throws Throwable {
        FileWriter fileWriter;
        if (jSONArray == null) {
            return;
        }
        File fileNOt = NOt();
        File file = new File(fileNOt.getParent(), fileNOt.getName() + ".tmp");
        FileWriter fileWriter2 = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileWriter = new FileWriter(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            fileWriter.write(jSONArray.toString());
            file.renameTo(fileNOt);
            VdW.ZRu("tt_sdk_settings", WMI.ZRu()).ZRu("ad_slot_conf");
            if (file.exists()) {
                file.delete();
            }
            com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileWriter);
        } catch (Exception e11) {
            e = e11;
            fileWriter2 = fileWriter;
            Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
            if (file.exists()) {
                file.delete();
            }
            com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileWriter2);
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (file.exists()) {
                file.delete();
            }
            com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileWriter2);
            throw th;
        }
        HashMap<String, NOt> mapNOt = NOt(jSONArray);
        if (mapNOt.isEmpty()) {
            return;
        }
        for (Map.Entry<String, NOt> entry : mapNOt.entrySet()) {
            String key = entry.getKey();
            NOt value = entry.getValue();
            if (value.Cox) {
                NOt nOt = ZRu.get(key);
                if (nOt != null) {
                    nOt.Hvv = value.Qg;
                }
            } else {
                ZRu.put(key, value);
            }
        }
    }

    public static void ZRu() {
        File fileNOt = NOt();
        if (fileNOt.exists()) {
            fileNOt.delete();
        }
    }
}
