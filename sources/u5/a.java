package U5;

import android.content.Context;
import com.google.ads.mediation.inmobi.InMobiConsent;
import com.inmobi.sdk.InMobiSdk;
import com.prism.fusionadsdkbase.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68527a = b.j(a.class.getSimpleName());

    public static void a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, true);
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "1");
        } catch (JSONException unused) {
        }
        InMobiConsent.updateGDPRConsent(jSONObject);
    }
}
