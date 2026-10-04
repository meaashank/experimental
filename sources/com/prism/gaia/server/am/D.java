package com.prism.gaia.server.am;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.prism.commons.exception.BadStrEncodeException;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3860y;
import com.prism.commons.utils.P;
import com.prism.commons.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class D {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f166664p = 37;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f166665q = "#@#";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f166666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f166669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f166670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f166671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent[] f166672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f166673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f166674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f166675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f166676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f166677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f166678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IBinder f166679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PendingIntent f166680o;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Intent f166681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f166682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IBinder f166683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f166684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f166685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f166686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f166687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Bundle f166688h;

        public String toString() {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a("(");
            U6.j.F(sbA, "requestCode", Integer.valueOf(this.f166685e));
            U6.j.F(sbA, "requestWho", this.f166684d);
            U6.j.F(sbA, "resultTo", this.f166683c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public D(int i10, int i11, String str, String str2, int i12, Intent[] intentArr, String[] strArr, int i13) {
        this.f166667b = i10;
        this.f166668c = i11;
        this.f166669d = str;
        this.f166670e = str2;
        this.f166671f = i12;
        intentArr = (intentArr == null || intentArr.length <= 0) ? null : intentArr;
        this.f166672g = intentArr;
        strArr = (strArr == null || strArr.length <= 0) ? null : strArr;
        this.f166673h = strArr;
        this.f166674i = intentArr != null ? intentArr[intentArr.length - 1] : null;
        this.f166675j = strArr != null ? strArr[strArr.length - 1] : null;
        this.f166676k = i13;
        int iHashCode = ((((851 + i13) * 37) + i12) * 37) + i11;
        iHashCode = str2 != null ? (iHashCode * 37) + str2.hashCode() : iHashCode;
        Intent intent = this.f166674i;
        iHashCode = intent != null ? (iHashCode * 37) + intent.filterHashCode() : iHashCode;
        String str3 = this.f166675j;
        int iHashCode2 = (str3 != null ? (iHashCode * 37) + str3.hashCode() : iHashCode) * 37;
        String str4 = this.f166669d;
        this.f166677l = ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.f166667b;
        String strA = android.support.v4.media.d.a(androidx.compose.runtime.changelist.a.a(android.support.v4.media.d.a(androidx.compose.runtime.changelist.a.a(android.support.v4.media.d.a(new StringBuilder(f166665q), this.f166676k, f166665q)), this.f166671f, f166665q)), this.f166668c, f166665q);
        if (this.f166670e != null) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA);
            sbA.append(this.f166671f);
            strA = sbA.toString();
        }
        String strA2 = androidx.compose.runtime.changelist.j.a(strA, f166665q);
        if (this.f166674i != null) {
            StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(strA2);
            sbA2.append(this.f166674i.getAction());
            StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(sbA2.toString());
            sbA3.append(this.f166674i.getDataString());
            StringBuilder sbA4 = androidx.compose.runtime.changelist.a.a(sbA3.toString());
            sbA4.append(this.f166674i.getType());
            String string = sbA4.toString();
            if (C3841e.w()) {
                StringBuilder sbA5 = androidx.compose.runtime.changelist.a.a(string);
                sbA5.append(this.f166674i.getIdentifier());
                string = sbA5.toString();
            }
            StringBuilder sbA6 = androidx.compose.runtime.changelist.a.a(string);
            sbA6.append(this.f166674i.getPackage());
            String string2 = sbA6.toString();
            ComponentName component = this.f166674i.getComponent();
            StringBuilder sbA7 = androidx.compose.runtime.changelist.a.a(string2);
            sbA7.append(component == null ? "" : component.toString());
            StringBuilder sbA8 = androidx.compose.runtime.changelist.a.a(sbA7.toString());
            sbA8.append(StringUtils.e(this.f166674i.getCategories()));
            strA2 = sbA8.toString();
        }
        String strA3 = androidx.compose.runtime.changelist.j.a(strA2, f166665q);
        if (this.f166675j != null) {
            StringBuilder sbA9 = androidx.compose.runtime.changelist.a.a(strA3);
            sbA9.append(this.f166675j);
            strA3 = sbA9.toString();
        }
        String strA4 = androidx.compose.runtime.changelist.j.a(strA3, f166665q);
        if (this.f166669d != null) {
            StringBuilder sbA10 = androidx.compose.runtime.changelist.a.a(strA4);
            sbA10.append(this.f166669d);
            strA4 = sbA10.toString();
        }
        String strA5 = android.support.v4.media.d.a(androidx.compose.runtime.changelist.a.a(androidx.compose.runtime.changelist.j.a(strA4, f166665q)), this.f166667b, f166665q);
        try {
            this.f166666a = C3860y.r(strA5);
        } catch (BadStrEncodeException unused) {
            this.f166666a = strA5;
        }
    }

    public void a() {
        PendingIntent pendingIntent = this.f166680o;
        if (pendingIntent != null) {
            pendingIntent.cancel();
        }
    }

    public IBinder b() {
        return this.f166679n;
    }

    public String c() {
        return this.f166678m;
    }

    public Intent d() {
        return this.f166672g[r0.length - 1];
    }

    public int e() {
        return this.f166676k;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f166667b != d10.f166667b || this.f166668c != d10.f166668c || !P.a(this.f166669d, d10.f166669d) || !P.a(this.f166670e, d10.f166670e) || this.f166671f != d10.f166671f) {
            return false;
        }
        Intent intent = this.f166674i;
        Intent intent2 = d10.f166674i;
        return (intent == intent2 || intent == null || intent.filterEquals(intent2)) && P.a(this.f166675j, d10.f166675j) && this.f166676k == d10.f166676k;
    }

    public Intent[] f() {
        return this.f166672g;
    }

    public String g() {
        return this.f166669d;
    }

    public PendingIntent h() {
        return this.f166680o;
    }

    public int hashCode() {
        return this.f166677l;
    }

    public int i() {
        return this.f166671f;
    }

    public Intent j() {
        return this.f166674i;
    }

    public String k() {
        return this.f166675j;
    }

    public String[] l() {
        return this.f166673h;
    }

    public String m() {
        return this.f166670e;
    }

    public int n() {
        return this.f166667b;
    }

    public int o() {
        return this.f166668c;
    }

    public String p() {
        return this.f166666a;
    }

    public void q(IBinder iBinder) {
        this.f166679n = iBinder;
    }

    public void r(String str) {
        this.f166678m = str;
    }

    public void s(PendingIntent pendingIntent) {
        this.f166680o = pendingIntent;
    }

    public void t(String str) {
        this.f166666a = str;
    }

    @NonNull
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uuid", this.f166666a);
            jSONObject.put("type", this.f166667b);
            jSONObject.put("userId", this.f166668c);
            jSONObject.put("pkgName", this.f166669d);
            jSONObject.put("requestCode", this.f166671f);
            jSONObject.put("resultWho", this.f166670e);
            jSONObject.put("resolvedType", this.f166675j);
            jSONObject.put("flags", this.f166676k);
            String string = "(null)";
            if (this.f166674i == null) {
                jSONObject.put("intent", "(null)");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", this.f166674i.getAction());
                jSONObject2.put("type", this.f166674i.getType());
                jSONObject2.put("data", this.f166674i.getDataString());
                if (C3841e.w()) {
                    jSONObject2.put("identifier", this.f166674i.getIdentifier());
                }
                jSONObject2.put("pkg", this.f166674i.getPackage());
                ComponentName component = this.f166674i.getComponent();
                if (component != null) {
                    string = component.toString();
                }
                jSONObject2.put("component", string);
                jSONObject2.put("categories", this.f166674i.getCategories());
                jSONObject.put("intent", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
