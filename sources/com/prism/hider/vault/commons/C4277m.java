package com.prism.hider.vault.commons;

import android.app.Activity;
import android.app.ActivityManager;
import android.util.Log;
import t1.C5596a;

/* JADX INFO: renamed from: com.prism.hider.vault.commons.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4277m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f173564c = "m";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityManager.TaskDescription[] f173565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f173566b;

    public C4277m(ActivityManager.TaskDescription taskDescription, ActivityManager.TaskDescription taskDescription2, int i10) {
        this.f173565a = new ActivityManager.TaskDescription[]{taskDescription, taskDescription2};
        this.f173566b = i10;
        C5596a.a("default:", i10, f173564c);
    }

    public void a(Activity activity) {
        this.f173566b = 0;
        c(activity);
        Log.d(f173564c, "switchTo 0 activity:" + activity);
    }

    public void b(Activity activity) {
        this.f173566b = 1;
        c(activity);
        Log.d(f173564c, "switchTo 1 activity:" + activity);
    }

    public void c(Activity activity) {
        Log.d(f173564c, "update " + this.f173566b);
        activity.setTaskDescription(this.f173565a[this.f173566b]);
    }
}
