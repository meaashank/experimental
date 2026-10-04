package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.request.WebRequest;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ScarRequestHandler {
    public void makeUploadRequest(String str, BiddingSignals biddingSignals, String str2) throws Exception {
        HashMap map = new HashMap();
        map.put("Content-Type", Collections.singletonList("application/json"));
        WebRequest webRequest = new WebRequest(str2, "POST", map);
        HashMap map2 = new HashMap();
        map2.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        map2.put(ScarConstants.TOKEN_ID_KEY, str);
        map2.putAll(biddingSignals.getMap());
        webRequest.setBody(new JSONObject(map2).toString());
        webRequest.makeRequest();
    }
}
