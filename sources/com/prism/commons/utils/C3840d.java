package com.prism.commons.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: com.prism.commons.utils.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3840d {
    @SuppressLint({"WrongConstant"})
    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (C3841e.s()) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @SuppressLint({"WrongConstant"})
    public static void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (C3841e.s()) {
            context.registerReceiver(broadcastReceiver, intentFilter, str, handler, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
    }
}
