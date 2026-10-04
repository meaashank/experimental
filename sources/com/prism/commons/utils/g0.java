package com.prism.commons.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162103a = l0.b(g0.class.getSimpleName());

    public static Intent a(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str + "&referrer=utm_source%3Dprism%26utm_campaign%3Dproduct"));
    }

    public static Intent b(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(c(str)));
    }

    public static String c(String str) {
        return android.support.v4.media.i.a("https://play.google.com/store/apps/details?id=", str, "&referrer=utm_source%3Dprism%26utm_campaign%3Dproduct");
    }

    public static String d() {
        return "referrer=utm_source%3Dprism%26utm_campaign%3Dproduct";
    }

    public static void e(Context context, String str, boolean z10) {
        try {
            a(str);
            Intent intent = new Intent[]{b(str)}[0];
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    public static void f(Context context, String str, boolean z10) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                context.startActivity(launchIntentForPackage);
            } else {
                e(context, str, z10);
            }
        } catch (Exception e10) {
            Log.e(f162103a, "launchOrJumpToStore error ", e10);
        }
    }
}
