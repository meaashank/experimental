package com.bytedance.sdk.openadsdk.tool;

import com.android.launcher3.LauncherSettings;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static String ZRu(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectZRu = ZRu(it.next());
            if (jSONObjectZRu != null) {
                jSONArray.put(jSONObjectZRu);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> ZRu(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                FilterWord filterWordZRu = ZRu(jSONArray.optJSONObject(i10));
                if (filterWordZRu != null && filterWordZRu.isValid()) {
                    arrayList.add(filterWordZRu);
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            lp.ZRu("MaterialMetaTools", e10.getMessage());
            return arrayList;
        }
    }

    private static FilterWord ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(LauncherSettings.Favorites.OPTIONS);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    FilterWord filterWordZRu = ZRu(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (filterWordZRu != null && filterWordZRu.isValid()) {
                        filterWord.addOption(filterWordZRu);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject ZRu(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(ZRu(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(LauncherSettings.Favorites.OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
