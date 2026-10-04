package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import ed.InterfaceC4376a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3731t2 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3731t2 f153378a = new C3731t2();

    public C3731t2() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        HandlerThread handlerThread = new HandlerThread(C3773w2.b());
        W3.a(handlerThread, C3773w2.b());
        Looper looper = handlerThread.getLooper();
        kotlin.jvm.internal.G.o(looper, "getLooper(...)");
        return new HandlerC3690q2(looper);
    }
}
