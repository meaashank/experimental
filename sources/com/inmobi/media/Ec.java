package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f151909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151910b;

    public Ec(byte b10, String str) {
        this.f151909a = b10;
        this.f151910b = str;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte b10 = this.f151909a;
            String str = "unknown";
            if (b10 != 0) {
                if (b10 == 1) {
                    str = "static";
                } else if (b10 == 2) {
                    str = "html";
                } else if (b10 == 3) {
                    str = "iframe";
                }
            }
            jSONObject.put("type", str);
            jSONObject.put("content", this.f151910b);
            String string = jSONObject.toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            List list = Fc.f151944h;
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
            return "";
        }
    }
}
