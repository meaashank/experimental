package com.prism.gaia.download;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface p {
    void a(Intent intent);

    void b(Thread thread);

    boolean c();

    long currentTimeMillis();

    NetworkInfo d(int i10);

    Long e();

    Long f();

    void g(long j10);

    void h(long j10, Notification notification);

    PendingIntent i(Context context, int i10, Intent intent, int i11);

    boolean j(int i10, String str) throws PackageManager.NameNotFoundException;

    void k();
}
