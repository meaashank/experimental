package com.mbridge.msdk.video.bt.component;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f160209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f160210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f160211c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static c f160212a = new c();
    }

    public static c a() {
        return b.f160212a;
    }

    private c() {
        this.f160209a = "handlerNativeResult";
        this.f160210b = 0;
        this.f160211c = 1;
    }

    public void a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String strOptString = jSONObject.optString("uniqueIdentifier");
                    String strOptString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(R9.c.f67796d);
                        int iOptInt = 0;
                        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.toString())) {
                            iOptInt = jSONObjectOptJSONObject.optInt("type", 0);
                        }
                        a(this.f160210b, "receivedMessage", obj);
                        if (strOptString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.Report.a.a().a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                            return;
                        } else {
                            if (strOptString.equalsIgnoreCase("MediaPlayer")) {
                                com.mbridge.msdk.video.bt.component.b.a().a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                                return;
                            }
                            return;
                        }
                    }
                    a(this.f160211c, "module or method is null", obj);
                    return;
                }
            } catch (Exception e10) {
                q0.a("HandlerH5MessageManager", e10.getMessage());
                a(this.f160211c, e10.getMessage(), obj);
                return;
            } catch (Throwable th) {
                q0.a("HandlerH5MessageManager", th.getMessage());
                a(this.f160211c, th.getMessage(), obj);
                return;
            }
        }
        a(this.f160211c, "params is null", obj);
    }

    public void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Z3.f.f79422s, i10);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            q0.a("HandlerH5MessageManager", e10.getMessage());
        } catch (Throwable th) {
            q0.a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
