package com.inmobi.media;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3678p4 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", C3671ob.a());
            Boolean boolC = C3672oc.f153249a.c();
            if (boolC != null) {
                map.put("u-id-adt", boolC.booleanValue() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            map.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C3726sb.f153355a.getClass();
            HashMap map2 = new HashMap();
            if (C3726sb.f153359e && (str = C3726sb.f153358d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
        } catch (Exception unused) {
        }
        return map;
    }
}
