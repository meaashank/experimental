package com.bytedance.sdk.component.ZRu;

import Ib.b;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class FA {
    private lp ZRu;

    private FA(lp lpVar) {
        this.ZRu = lpVar;
    }

    public static FA ZRu(lp lpVar) {
        return new FA(lpVar);
    }

    public <T> T ZRu(String str, Type type) throws JSONException {
        ZRu(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.ZRu.ZRu(str, type);
    }

    public <T> String ZRu(T t10) {
        String string;
        if (t10 == null) {
            return b.f53002g;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.ZRu.ZRu(t10);
        } else {
            string = t10.toString();
        }
        ZRu(string);
        return string;
    }

    private static void ZRu(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        Vor.ZRu(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
