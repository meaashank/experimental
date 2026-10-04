package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class V0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f152497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f152498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f152499c;

    public V0(Context context) {
        this.f152499c = context;
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.G.o(mainLooper, "getMainLooper(...)");
        this.f152497a = new T0(mainLooper);
    }

    public static final void a(Context context, V0 this$0) {
        kotlin.jvm.internal.G.p(context, "$context");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (W0.a(W0.f152538a, context) || this$0.f152498b != null) {
            return;
        }
        this$0.f152497a.sendEmptyMessageDelayed(1001, androidx.appcompat.widget.e0.f86341n);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        WeakReference weakReference = this.f152498b;
        if (!kotlin.jvm.internal.G.g(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f152498b = new WeakReference(activity);
        }
        this.f152497a.removeMessages(1001);
        this.f152497a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        WeakReference weakReference = this.f152498b;
        if (!kotlin.jvm.internal.G.g(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f152498b = new WeakReference(activity);
        }
        this.f152497a.removeMessages(1001);
        this.f152497a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        WeakReference weakReference = this.f152498b;
        if (kotlin.jvm.internal.G.g(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f152497a.sendEmptyMessageDelayed(1001, androidx.appcompat.widget.e0.f86341n);
        } else if (this.f152498b == null) {
            final Context context = this.f152499c;
            C3657nb.a(new Runnable() { // from class: F5.C0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.V0.a(context, this);
                }
            });
        }
    }
}
