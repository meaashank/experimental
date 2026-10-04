package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Fc {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f151944h = kotlin.collections.I.Q("image/jpeg", "image/png", "image/jpg");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151946b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151948d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f151951g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f151947c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f151949e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f151950f = new ArrayList();

    public Fc(int i10, int i11, String str) {
        this.f151945a = i10;
        this.f151946b = i11;
        this.f151948d = str;
    }

    public final ArrayList a(int i10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f151949e;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            Ec ec2 = (Ec) obj;
            if (ec2.f151909a == i10) {
                arrayList.add(ec2);
            }
        }
        return arrayList;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f151948d;
            if (str != null) {
                jSONObject.put("id", str);
            }
            jSONObject.put(InMobiNetworkValues.WIDTH, this.f151945a);
            jSONObject.put(InMobiNetworkValues.HEIGHT, this.f151946b);
            jSONObject.put("clickThroughUrl", this.f151947c);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f151949e;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                jSONArray.put(((Ec) obj).toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = this.f151950f;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                jSONArray2.put(((C3542f8) obj2).toString());
            }
            jSONObject.put("trackers", jSONArray2);
            String string = jSONObject.toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
            return "";
        }
    }

    public final ArrayList a(String trackerEventType) {
        kotlin.jvm.internal.G.p(trackerEventType, "trackerEventType");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f151950f;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            C3542f8 c3542f8 = (C3542f8) obj;
            if (kotlin.jvm.internal.G.g(c3542f8.f152923c, trackerEventType)) {
                arrayList.add(c3542f8);
            }
        }
        return arrayList;
    }
}
