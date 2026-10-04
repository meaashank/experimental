package com.unity3d.services.ads.gmascar.handlers;

import Nb.b;
import Nb.e;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class BiddingSignalsHandler implements b {
    private final IBiddingSignalsListener listener;

    public BiddingSignalsHandler(IBiddingSignalsListener iBiddingSignalsListener) {
        this.listener = iBiddingSignalsListener;
    }

    private String getSignalFromJson(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    private BiddingSignals getSignals(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new BiddingSignals(getSignalFromJson(jSONObject, e.f64931a), getSignalFromJson(jSONObject, e.f64932b));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // Nb.b
    public void onSignalsCollected(String str) {
        this.listener.onSignalsReady(getSignals(str));
    }

    @Override // Nb.b
    public void onSignalsCollectionFailed(String str) {
        this.listener.onSignalsFailure(str);
    }
}
