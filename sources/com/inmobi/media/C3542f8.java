package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3542f8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f152920g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f152924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f152926f;

    public C3542f8(String url, int i10, String eventType, HashMap map) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(eventType, "eventType");
        this.f152921a = "url_ping";
        this.f152922b = i10;
        this.f152923c = eventType;
        this.f152924d = map;
        int length = url.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            boolean z11 = kotlin.jvm.internal.G.t(url.charAt(!z10 ? i11 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i11++;
            } else {
                z10 = true;
            }
        }
        this.f152925e = R6.a(length, 1, url, i11);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f152921a);
            jSONObject.put("url", this.f152925e);
            jSONObject.put("eventType", this.f152923c);
            jSONObject.put("eventId", this.f152922b);
            boolean z10 = C3473a9.f152704a;
            Map map = this.f152924d;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", C3473a9.a(",", map));
            String string = jSONObject.toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
            return "";
        }
    }
}
