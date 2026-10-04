package com.prism.gaia.client.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class GuestStaticReceiverProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164350a = "asdf-".concat("GuestStaticReceiverProxy");

    public static boolean a(Intent intent) {
        return (intent.getFlags() & 268435456) != 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
