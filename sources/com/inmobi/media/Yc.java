package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class Yc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f152634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f152635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f152636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f152637d;

    public Yc(dd visibilityTracker, AtomicBoolean isPaused) {
        kotlin.jvm.internal.G.p(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.G.p(isPaused, "isPaused");
        this.f152634a = isPaused;
        this.f152635b = new ArrayList();
        this.f152636c = new ArrayList();
        this.f152637d = new WeakReference(visibilityTracker);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yc.run():void");
    }
}
