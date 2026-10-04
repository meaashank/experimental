package com.inmobi.media;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p8.C5397a;

/* JADX INFO: renamed from: com.inmobi.media.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3650n4 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f153187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3650n4(Looper looper) {
        super(looper);
        kotlin.jvm.internal.G.p(looper, "looper");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Context contextD;
        kotlin.jvm.internal.G.p(msg, "msg");
        int i10 = msg.what;
        if (i10 == 1) {
            sendEmptyMessage(3);
            return;
        }
        if (i10 == 2) {
            removeMessages(3);
            return;
        }
        if (i10 != 3) {
            return;
        }
        if (this.f153187a) {
            sendEmptyMessage(2);
            return;
        }
        sd sdVar = sd.f153370a;
        sd.f153371b = C3657nb.d();
        Looper looperMyLooper = Looper.myLooper();
        synchronized (sdVar) {
            try {
                if (sd.f153372c == null && (contextD = C3657nb.d()) != null) {
                    Object systemService = contextD.getSystemService(C5397a.f226370e);
                    WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
                    if (wifiManager != null && wifiManager.isWifiEnabled()) {
                        kotlin.jvm.internal.G.m(looperMyLooper);
                        Handler handler = new Handler(looperMyLooper);
                        sd.f153372c = handler;
                        handler.postDelayed(sd.f153376g, 10000L);
                        if (!sd.f153373d) {
                            sd.f153373d = true;
                            Context context = sd.f153371b;
                            if (context != null) {
                                context.registerReceiver(sd.f153377h, sd.f153374e, null, sd.f153372c);
                            }
                        }
                        wifiManager.startScan();
                    }
                }
            } finally {
            }
        }
        sendEmptyMessageDelayed(3, C3740tb.a().getSampleInterval() * 1000);
    }
}
