package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f152640a;

    public static final String a(Context context) {
        if (context == null || f152640a != null) {
            return f152640a;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            kotlin.jvm.internal.G.o(listQueryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(v.e.f239707c);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    String packageName = resolveInfo.activityInfo.packageName;
                    kotlin.jvm.internal.G.o(packageName, "packageName");
                    arrayList.add(packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f152640a = null;
            } else if (arrayList.size() == 1) {
                f152640a = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !a(context, intent) && kotlin.collections.U.a2(arrayList, str)) {
                f152640a = str;
            } else if (arrayList.contains(U6.m.f68751h)) {
                f152640a = U6.m.f68751h;
            } else if (arrayList.contains("com.chrome.beta")) {
                f152640a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f152640a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f152640a = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f152640a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            kotlin.jvm.internal.G.o(listQueryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("Z2", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
