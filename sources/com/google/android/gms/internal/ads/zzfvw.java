package com.google.android.gms.internal.ads;

import H2.t;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzfvw implements t.b {
    final /* synthetic */ zzfvy zza;

    public zzfvw(zzfvy zzfvyVar) {
        Objects.requireNonNull(zzfvyVar);
        this.zza = zzfvyVar;
    }

    @Override // H2.t.b
    public final void onPostMessage(WebView webView, H2.o oVar, Uri uri, boolean z10, H2.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject(oVar.c());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfvj.zza.getClass();
            }
        } catch (JSONException e10) {
            zzfxh.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
