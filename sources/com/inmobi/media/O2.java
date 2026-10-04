package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public abstract class O2 {
    public static JSONArray a(N2 it, List skipList) {
        kotlin.jvm.internal.G.p(it, "it");
        kotlin.jvm.internal.G.p(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = N2.f152268j;
        if (!skipList.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(it.f152269a);
        }
        if (!skipList.contains(BidResponsed.KEY_BID_ID)) {
            jSONArray.put(it.f152270b);
        }
        if (!skipList.contains("its")) {
            jSONArray.put(it.f152271c);
        }
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.f152272d);
        }
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f152273e);
        }
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f152274f);
        }
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.f152275g);
        }
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f152276h);
        }
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f152277i);
        }
        return jSONArray;
    }
}
