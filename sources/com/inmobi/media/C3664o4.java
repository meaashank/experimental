package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3664o4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f153224b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerC3650n4 f153225a;

    public C3664o4() {
        HandlerThread handlerThread = new HandlerThread("DataCollectionHandler");
        W3.a(handlerThread, "DataCollectionHandler");
        Looper looper = handlerThread.getLooper();
        kotlin.jvm.internal.G.o(looper, "getLooper(...)");
        this.f153225a = new HandlerC3650n4(looper);
    }

    public final synchronized void a() {
        if (qd.a()) {
            HandlerC3650n4 handlerC3650n4 = this.f153225a;
            handlerC3650n4.f153187a = false;
            if (!handlerC3650n4.hasMessages(3)) {
                this.f153225a.removeMessages(2);
                this.f153225a.sendEmptyMessage(1);
            }
        }
    }
}
