package com.prism.gaia.helper;

import android.support.v4.media.i;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.server.Gaia32bit64bitProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f165035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f165036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f165037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pattern f165038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pattern f165039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f165040g;

    public e(String str, String str2) {
        this.f165034a = str;
        this.f165035b = str2;
        this.f165036c = androidx.concurrent.futures.a.a(str, "com.app.hider.master.promax", str2);
        this.f165037d = androidx.concurrent.futures.a.a(str, "com.app.hider.helper.hider64helper", str2);
        this.f165038e = Pattern.compile(str + "com.app.hider.helper.hider32helper(\\.api)?(\\d*)" + str2);
        this.f165039f = Pattern.compile(str + "com.app.hider.helper.hider64helper(\\.api)?(\\d*)" + str2);
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
        sbA.append(U6.c.d());
        sbA.append(str2);
        this.f165040g = sbA.toString();
    }

    public String a(String str, GUri gUri) {
        return str.replaceFirst(this.f165040g, this.f165034a + q(gUri) + this.f165035b);
    }

    public String b(String str, String str2) {
        return str.replaceFirst(this.f165040g, this.f165034a + str2 + this.f165035b);
    }

    @Nullable
    public String c(String str) {
        if (str.contains(this.f165036c)) {
            return "com.app.hider.master.promax";
        }
        String str2 = this.f165037d;
        if (str2 != null && str.contains(str2)) {
            return "com.app.hider.helper.hider64helper";
        }
        Matcher matcher = this.f165038e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            return (strGroup == null || strGroup2 == null) ? "com.app.hider.helper.hider32helper" : i.a("com.app.hider.helper.hider32helper", strGroup, strGroup2);
        }
        Matcher matcher2 = this.f165039f.matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        String strGroup3 = matcher2.group(1);
        String strGroup4 = matcher2.group(2);
        return (strGroup3 == null || strGroup4 == null) ? "com.app.hider.helper.hider64helper" : i.a("com.app.hider.helper.hider64helper", strGroup3, strGroup4);
    }

    @NonNull
    public String d(String str) {
        String strC = c(str);
        return strC == null ? U6.c.d() : strC;
    }

    @NonNull
    public GUri e(String str) {
        return r(d(str));
    }

    public boolean f(String str) {
        return str.contains(this.f165040g);
    }

    public boolean g(String str) {
        return k(str) || l(str) || h(str);
    }

    public boolean h(String str) {
        return i(str) || j(str);
    }

    public boolean i(String str) {
        return this.f165038e.matcher(str).find();
    }

    public boolean j(String str) {
        return this.f165039f.matcher(str).find();
    }

    public boolean k(String str) {
        return str.contains(this.f165036c);
    }

    public boolean l(String str) {
        String str2 = this.f165037d;
        return str2 != null && str.contains(str2);
    }

    public String m(String str, GUri gUri) {
        return str.replaceFirst(this.f165034a + q(gUri) + this.f165035b, this.f165040g);
    }

    public String n(String str, String str2) {
        return str.replaceFirst(this.f165034a + str2 + this.f165035b, this.f165040g);
    }

    public String o(String str, GUri gUri, GUri gUri2) {
        return str.replaceFirst(this.f165034a + q(gUri) + this.f165035b, this.f165034a + q(gUri2) + this.f165035b);
    }

    public String p(String str, String str2, String str3) {
        return str.replaceFirst(this.f165034a + str2 + this.f165035b, this.f165034a + str3 + this.f165035b);
    }

    public String q(GUri gUri) {
        return Gaia32bit64bitProvider.d(gUri);
    }

    public GUri r(String str) {
        return Gaia32bit64bitProvider.e(str);
    }
}
