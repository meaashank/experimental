package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.lib_google_billing.q;
import e.T;
import t7.C5617a;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile b f154433f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f154434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TelephonyManager f154435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154436c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f154437d = q.f194113a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f154438e = 0;

    @T(api = 31)
    public final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        public a() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType == 1 || overrideNetworkType == 2) {
                b.this.f154436c = 4;
                return;
            }
            if (overrideNetworkType == 3) {
                b bVar = b.this;
                bVar.f154436c = 5;
                bVar.f154437d = "5G NSA";
            } else {
                if (overrideNetworkType != 5) {
                    return;
                }
                b bVar2 = b.this;
                bVar2.f154436c = 5;
                bVar2.f154437d = "5G+";
            }
        }
    }

    private b() {
        a();
    }

    public static b e() {
        if (f154433f == null) {
            synchronized (b.class) {
                try {
                    if (f154433f == null) {
                        f154433f = new b();
                    }
                } finally {
                }
            }
        }
        return f154433f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i10 = Build.VERSION.SDK_INT;
        NetworkCapabilities networkCapabilities = this.f154434a.getNetworkCapabilities(this.f154434a.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                this.f154436c = 9;
                this.f154437d = "WIFI";
            }
            if (networkCapabilities.hasTransport(0)) {
                if (i10 >= 24) {
                    this.f154436c = c();
                } else {
                    this.f154436c = d();
                }
            }
            this.f154438e = networkCapabilities.hasTransport(4) ? 1 : g();
        }
    }

    public void b() {
        a();
        com.mbridge.msdk.foundation.same.threadpool.a.d().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f154449a.f();
            }
        });
    }

    @T(api = 24)
    @SuppressLint({"MissingPermission"})
    public int c() {
        try {
            TelephonyManager telephonyManager = this.f154435b;
            if (telephonyManager == null) {
                return 0;
            }
            int dataNetworkType = telephonyManager.getDataNetworkType();
            this.f154437d = String.valueOf(dataNetworkType);
            return a(dataNetworkType);
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    @SuppressLint({"MissingPermission"})
    public int d() {
        try {
            TelephonyManager telephonyManager = this.f154435b;
            if (telephonyManager == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            this.f154437d = String.valueOf(networkType);
            return a(networkType);
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    public int g() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? 0 : 2;
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    private int a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    private void a() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            this.f154436c = 0;
            this.f154437d = q.f194113a;
            this.f154438e = 0;
            return;
        }
        ConnectivityManager connectivityManager = this.f154434a;
        if (connectivityManager == null || this.f154435b == null) {
            if (connectivityManager == null) {
                this.f154434a = (ConnectivityManager) contextD.getSystemService(C5617a.f239212e);
            }
            if (this.f154435b == null) {
                TelephonyManager telephonyManager = (TelephonyManager) contextD.getSystemService("phone");
                this.f154435b = telephonyManager;
                if (Build.VERSION.SDK_INT < 31 || telephonyManager == null) {
                    return;
                }
                this.f154435b.registerTelephonyCallback(com.mbridge.msdk.foundation.same.threadpool.a.d(), new a());
            }
        }
    }
}
