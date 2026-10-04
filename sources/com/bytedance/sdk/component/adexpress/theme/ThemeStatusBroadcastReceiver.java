package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<ZRu> ZRu;

    public void ZRu(ZRu zRu) {
        this.ZRu = new WeakReference<>(zRu);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<ZRu> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().onThemeChanged(intExtra);
    }
}
