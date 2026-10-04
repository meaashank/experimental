package com.mbridge.msdk.videocommon.entity;

import Jb.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f161580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f161581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f161582c;

    public b(int i10, int i11, a aVar) {
        this.f161580a = i10;
        this.f161581b = i11;
        this.f161582c = aVar;
    }

    public int a() {
        return this.f161580a;
    }

    public int b() {
        return this.f161581b;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    int iOptInt = jSONObjectOptJSONObject.optInt("id");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt(d.f58184l);
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
                    arrayList.add(new b(iOptInt, iOptInt2, jSONObjectOptJSONObject2 != null ? a.a(jSONObjectOptJSONObject2) : null));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
