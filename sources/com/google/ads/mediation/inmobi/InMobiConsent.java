package com.google.ads.mediation.inmobi;

import com.inmobi.sdk.InMobiSdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class InMobiConsent {
    private static JSONObject consentObj = new JSONObject();

    private InMobiConsent() {
    }

    public static JSONObject getConsentObj() {
        return consentObj;
    }

    public static void updateGDPRConsent(JSONObject jSONObject) {
        if (InMobiSdk.isSDKInitialized()) {
            InMobiSdk.updateGDPRConsent(jSONObject);
        }
        consentObj = jSONObject;
    }
}
