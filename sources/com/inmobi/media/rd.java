package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.List;
import p8.C5397a;

/* JADX INFO: loaded from: classes5.dex */
public final class rd extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(intent, "intent");
        Context context2 = sd.f153371b;
        Object systemService = context2 != null ? context2.getSystemService(C5397a.f226370e) : null;
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        sd.f153370a.a();
        List<ScanResult> scanResults = ((WifiManager) systemService).getScanResults();
        boolean z10 = (C3740tb.a().getWifiFlag() & 2) == 2;
        ArrayList arrayList = new ArrayList();
        if (scanResults != null) {
            for (ScanResult scanResult : scanResults) {
                String str = scanResult.SSID;
                if (z10 || str == null || !kotlin.text.F.d2(str, "_nomap", false, 2, null)) {
                    pd pdVar = new pd();
                    String BSSID = scanResult.BSSID;
                    kotlin.jvm.internal.G.o(BSSID, "BSSID");
                    pdVar.f153280a = qd.a(BSSID);
                    arrayList.add(pdVar);
                }
            }
        }
        sd.f153375f = arrayList;
    }
}
