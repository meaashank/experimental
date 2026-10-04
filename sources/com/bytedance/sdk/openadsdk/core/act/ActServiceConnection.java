package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.a;
import v.f;

/* JADX INFO: loaded from: classes3.dex */
public class ActServiceConnection extends f {
    private NOt mConnectionCallback;

    public ActServiceConnection(NOt nOt) {
        this.mConnectionCallback = nOt;
    }

    @Override // v.f
    public void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull a aVar) {
        NOt nOt = this.mConnectionCallback;
        if (nOt != null) {
            nOt.ZRu(aVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        NOt nOt = this.mConnectionCallback;
        if (nOt != null) {
            nOt.ZRu();
        }
    }
}
