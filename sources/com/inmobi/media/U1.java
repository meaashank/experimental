package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class U1 implements U2, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q1 f152473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3502ca f152474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z5 f152475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X2 f152477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f152478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y2 f152479h;

    public U1(String urlToLoad, Context context, Q1 q12, InterfaceC3502ca redirectionValidator, Z5 z52, String api) {
        kotlin.jvm.internal.G.p(urlToLoad, "urlToLoad");
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.G.p(api, "api");
        this.f152472a = urlToLoad;
        this.f152473b = q12;
        this.f152474c = redirectionValidator;
        this.f152475d = z52;
        this.f152476e = api;
        X2 x22 = new X2();
        this.f152477f = x22;
        this.f152479h = new Y2(q12, z52);
        x22.f152583c = this;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.G.o(applicationContext, "getApplicationContext(...)");
        this.f152478g = applicationContext;
        C3657nb.a(context, this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        X2 x22 = this.f152477f;
        Context context = this.f152478g;
        x22.getClass();
        kotlin.jvm.internal.G.p(context, "context");
        V2 v22 = x22.f152582b;
        if (v22 != null) {
            context.unbindService(v22);
            x22.f152581a = null;
        }
        x22.f152582b = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
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
