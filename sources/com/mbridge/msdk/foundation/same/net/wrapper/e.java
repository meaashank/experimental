package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.X;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f156510c = "e";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f156511d = "h";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f156512e = "i";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f156513f = "coppa";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f156514g = "d";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f156515h = "e";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f156516i = "a";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f156517j = "f";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f156518k = "g";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> f156519a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f156520b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            q0.b(f156510c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f156520b.put(str, str2);
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f156520b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(X.f218302d);
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append("=");
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f156520b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f156519a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            q0.b(f156510c, e10.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f156520b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(X.f218302d);
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(SignatureVisitor.INSTANCEOF);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f156519a.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(X.f218302d);
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb2.append(SignatureVisitor.INSTANCEOF);
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e10) {
            q0.b(f156510c, e10.getMessage());
        }
        return sb2.toString();
    }

    public Map<String, String> a() {
        return this.f156520b;
    }

    public void a(String str) {
        this.f156520b.remove(str);
        this.f156519a.remove(str);
    }
}
