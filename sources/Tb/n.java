package tb;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f239254e = new n(null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f239258d;

    public n(String str, String str2, String str3, String str4) {
        this.f239255a = str;
        this.f239256b = str2;
        this.f239258d = str3;
        if (str4 == null || str4.charAt(0) != '/') {
            this.f239257c = str4;
        } else {
            this.f239257c = str4.substring(1);
        }
    }

    public static String a(n[] nVarArr) {
        JSONArray jSONArray = new JSONArray();
        for (n nVar : nVarArr) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", nVar.f239255a);
                jSONObject.put("bucket", nVar.f239256b);
                jSONObject.put("prefix", nVar.f239257c);
                jSONObject.put("region", nVar.f239258d);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray.toString();
    }

    public n[] b() {
        return new n[]{this};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return TextUtils.equals(this.f239255a, nVar.f239255a) && TextUtils.equals(this.f239256b, nVar.f239256b) && TextUtils.equals(this.f239257c, nVar.f239257c) && TextUtils.equals(this.f239258d, nVar.f239258d);
    }

    public static n[] c(n... nVarArr) {
        return nVarArr;
    }
}
