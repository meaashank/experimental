package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: loaded from: classes3.dex */
public class oK {
    private boolean NOt;
    private final com.bytedance.sdk.openadsdk.utils.ZRu ZRu = new com.bytedance.sdk.openadsdk.utils.ZRu();

    public static class ZRu {
        private static final oK ZRu = new oK();
    }

    public static oK ZRu() {
        return ZRu.ZRu;
    }

    public void NOt() {
        try {
            Context contextZRu = WMI.ZRu();
            if (contextZRu instanceof Application) {
                ((Application) contextZRu).registerActivityLifecycleCallbacks(this.ZRu);
                this.NOt = true;
            } else {
                if (contextZRu == null || contextZRu.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextZRu.getApplicationContext()).registerActivityLifecycleCallbacks(this.ZRu);
                this.NOt = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public com.bytedance.sdk.openadsdk.utils.ZRu TFq() {
        return this.ZRu;
    }

    public boolean mZ() {
        return this.NOt;
    }

    public boolean uR() {
        return this.ZRu.ZRu();
    }

    public boolean ZRu(boolean z10) {
        return this.ZRu.ZRu(z10);
    }
}
