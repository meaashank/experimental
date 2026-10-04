package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class W1 extends F1 {
    public W1() {
        super("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        Long asLong = contentValues.getAsLong(CampaignEx.JSON_KEY_ST_TS);
        Long asLong2 = contentValues.getAsLong("created_ts");
        Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
        Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
        String asString2 = contentValues.getAsString("track_extras");
        HashMap map = new HashMap();
        if (asString2 != null) {
            try {
                map.putAll(a(new JSONObject(asString2)));
            } catch (JSONException | Exception unused) {
            }
        }
        kotlin.jvm.internal.G.m(asInteger);
        int iIntValue = asInteger.intValue();
        kotlin.jvm.internal.G.m(asString);
        kotlin.jvm.internal.G.m(asBoolean);
        boolean zBooleanValue = asBoolean.booleanValue();
        kotlin.jvm.internal.G.m(asBoolean2);
        boolean zBooleanValue2 = asBoolean2.booleanValue();
        kotlin.jvm.internal.G.m(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        kotlin.jvm.internal.G.m(asLong);
        long jLongValue = asLong.longValue();
        kotlin.jvm.internal.G.m(asLong2);
        return new V1(iIntValue, asString, map, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue());
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        V1 click = (V1) obj;
        kotlin.jvm.internal.G.p(click, "click");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(click.f152500a));
        contentValues.put("url", click.f152501b);
        contentValues.put("pending_attempts", Integer.valueOf(click.f152505f));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(click.f152506g));
        contentValues.put("created_ts", Long.valueOf(click.f152507h));
        contentValues.put("follow_redirect", Boolean.valueOf(click.f152503d));
        contentValues.put("ping_in_webview", Boolean.valueOf(click.f152504e));
        Map map = click.f152502c;
        if (map != null && !map.isEmpty()) {
            Map map2 = click.f152502c;
            kotlin.jvm.internal.G.n(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            contentValues.put("track_extras", new JSONObject(map2).toString());
        }
        return contentValues;
    }

    public final ArrayList a(int i10, int i11) {
        if (F1.a((F1) this) == 0) {
            return new ArrayList();
        }
        ArrayList arrayListA = F1.a(this, null, null, CampaignEx.JSON_KEY_ST_TS, "ts < " + (System.currentTimeMillis() - ((long) i11)), "ts ASC ", -1 == i10 ? null : Integer.valueOf(i10), 3);
        ArrayList arrayList = new ArrayList();
        int size = arrayListA.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListA.get(i12);
            i12++;
            V1 v12 = (V1) obj;
            if (v12 != null) {
                arrayList.add(v12);
            }
        }
        return arrayList;
    }

    public static HashMap a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.G.m(next);
            Object obj = jSONObject.get(next);
            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlin.String");
            map.put(next, (String) obj);
        }
        return map;
    }
}
