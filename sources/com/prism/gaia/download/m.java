package com.prism.gaia.download;

import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.prism.commons.utils.C3836a;
import t7.C5617a;

/* JADX INFO: loaded from: classes6.dex */
public class m implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164807c = "asdf-".concat(m.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NotificationManager f164809b;

    public m(Context context) {
        this.f164808a = context;
        this.f164809b = (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.prism.gaia.download.p
    public void a(Intent intent) {
        this.f164808a.sendBroadcast(intent);
    }

    @Override // com.prism.gaia.download.p
    public void b(Thread thread) {
        thread.start();
    }

    @Override // com.prism.gaia.download.p
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f164808a.getSystemService(C5617a.f239212e);
        boolean z10 = false;
        if (connectivityManager == null) {
            Log.w(a.f164590a, "couldn't get connectivity manager");
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
        TelephonyManager telephonyManager = (TelephonyManager) this.f164808a.getSystemService("phone");
        if (z11 && telephonyManager.isNetworkRoaming()) {
            z10 = true;
        }
        if (a.f164589J && z10) {
            Log.v(a.f164590a, "network is roaming");
        }
        return z10;
    }

    @Override // com.prism.gaia.download.p
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.prism.gaia.download.p
    public NetworkInfo d(int i10) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f164808a.getSystemService(C5617a.f239212e);
        if (connectivityManager == null) {
            Log.w(a.f164590a, "couldn't get connectivity manager");
            return null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null && a.f164589J) {
            Log.v(a.f164590a, "network is not available");
        }
        return activeNetworkInfo;
    }

    @Override // com.prism.gaia.download.p
    public Long e() {
        return DownloadManager.getRecommendedMaxBytesOverMobile(this.f164808a);
    }

    @Override // com.prism.gaia.download.p
    public Long f() {
        return DownloadManager.getMaxBytesOverMobile(this.f164808a);
    }

    @Override // com.prism.gaia.download.p
    public void g(long j10) {
        this.f164809b.cancel((int) j10);
    }

    @Override // com.prism.gaia.download.p
    public void h(long j10, Notification notification) {
        this.f164809b.notify((int) j10, notification);
    }

    @Override // com.prism.gaia.download.p
    public PendingIntent i(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, i10, intent, C3836a.b.a(i11));
    }

    @Override // com.prism.gaia.download.p
    public boolean j(int i10, String str) throws PackageManager.NameNotFoundException {
        return this.f164808a.getPackageManager().getApplicationInfo(str, 0).uid == i10;
    }

    @Override // com.prism.gaia.download.p
    public void k() {
        this.f164809b.cancelAll();
    }
}
