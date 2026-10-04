package com.bytedance.sdk.component.utils;

import Da.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private ZRu ZRu;

    public interface ZRu {
        void NOt();

        void ZRu();
    }

    public void ZRu(ZRu zRu) {
        this.ZRu = zRu;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: ".concat(String.valueOf(action)));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: ".concat(String.valueOf(stringExtra)));
                if (b.a.f23037c.equals(stringExtra)) {
                    Log.i("HomeReceiver", b.a.f23037c);
                    ZRu zRu = this.ZRu;
                    if (zRu != null) {
                        zRu.ZRu();
                        return;
                    }
                    return;
                }
                if (!b.a.f23036b.equals(stringExtra)) {
                    if ("assist".equals(stringExtra)) {
                        Log.i("HomeReceiver", "assist");
                    }
                } else {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    ZRu zRu2 = this.ZRu;
                    if (zRu2 != null) {
                        zRu2.NOt();
                    }
                }
            }
        } catch (Throwable unused) {
            lp.ZRu("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }
}
