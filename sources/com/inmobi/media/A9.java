package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class A9 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReferenceA;
        kotlin.jvm.internal.G.p(activity, "activity");
        synchronized (B9.f151792c) {
            try {
                if (B9.f151791b != null && (weakReferenceA = B9.a(B9.f151790a, activity)) != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                    B9.f151793d.remove(weakReferenceA);
                    if (B9.f151793d.isEmpty()) {
                        kotlin.jvm.internal.G.o(B9.d(), "access$getTAG$p(...)");
                        Objects.toString(B9.f151791b);
                        Picasso picasso = B9.f151791b;
                        if (picasso != null) {
                            picasso.shutdown();
                        }
                        B9.f151791b = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }
}
