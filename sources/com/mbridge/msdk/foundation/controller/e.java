package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f156006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f156007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f156008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f156009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f156010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f156011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f156012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SharedPreferences f156013p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f155998a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f155999b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f156000c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f156001d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f156002e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f156003f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f156004g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f156005h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<String> f156014q = Arrays.asList("IABTCF_gdprApplies", "IABTCF_TCString", "IABTCF_VendorConsents", "IABTCF_PurposeConsents", "IABTCF_AddtlConsent", "IABTCF_DisclosedVendors", "IABTCF_PolicyVersion");

    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f156013p = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f156013p;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            b(this.f156013p.getInt("IABTCF_gdprApplies", 0));
            c(this.f156013p.getString("IABTCF_PurposeConsents", ""));
            e(this.f156013p.getString("IABTCF_VendorConsents", ""));
            b(this.f156013p.getString("IABTCF_AddtlConsent", ""));
            a(this.f156013p.getInt("IABTCF_PolicyVersion", 0));
            f(this.f156013p.getString("IABTCF_DisclosedVendors", ""));
        }
    }

    public String b() {
        return this.f155998a;
    }

    public void c(String str) {
        this.f156006i = a(str, 1);
        this.f156007j = a(str, 2);
        this.f155999b = str;
    }

    public void d(String str) {
        this.f155998a = str;
    }

    public void e(String str) {
        this.f156008k = a(str, 867);
        this.f156000c = str;
    }

    public void f(String str) {
        this.f156011n = a(str, 867);
        this.f156002e = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.e.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public void b(int i10) {
        this.f156003f = i10;
    }

    public void b(String str) {
        this.f156001d = str;
        if (TextUtils.isEmpty(str)) {
            this.f156009l = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f156010m = false;
            return;
        }
        this.f156010m = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f156009l = false;
                } else {
                    this.f156009l = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            q0.b("TCStringManager", th.getMessage());
        }
    }

    public boolean c() {
        if (this.f156003f == 0) {
            a(true);
            return this.f156005h;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f156008k || (this.f156010m && this.f156009l)) && this.f156006i && this.f156007j);
        } else if (this.f156004g >= 5) {
            a(this.f156011n && this.f156008k && this.f156006i && this.f156007j);
        } else {
            a(this.f156008k && this.f156006i && this.f156007j);
        }
        return this.f156005h;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f156012o = aVar;
        }
    }

    public void a(int i10) {
        this.f156004g = i10;
    }

    public void a(boolean z10) {
        this.f156005h = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
