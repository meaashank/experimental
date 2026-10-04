package com.bytedance.sdk.openadsdk.core.Vor.ZRu;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements Application.ActivityLifecycleCallbacks {
    private static volatile ZRu ZRu;
    private final NOt NOt;

    private ZRu(Application application) {
        this.NOt = NOt.ZRu(application);
    }

    public static ZRu ZRu(Application application) {
        if (ZRu == null) {
            synchronized (ZRu.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new ZRu(application);
                        application.registerActivityLifecycleCallbacks(ZRu);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        NOt nOt = this.NOt;
        if (nOt != null) {
            nOt.ZRu(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        NOt nOt = this.NOt;
        if (nOt != null) {
            nOt.NOt(activity);
        }
    }

    public String ZRu(String str, long j10, int i10) {
        NOt nOt = this.NOt;
        if (nOt != null) {
            return nOt.ZRu(str, j10, i10);
        }
        return "null";
    }
}
