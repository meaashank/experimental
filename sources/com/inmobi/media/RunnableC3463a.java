package com.inmobi.media;

import android.os.Debug;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3463a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3477b f152661a;

    public RunnableC3463a(C3477b c3477b) {
        this.f152661a = c3477b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f152661a.f152716d.get()) {
            if (this.f152661a.f152718f.hasMessages(2023)) {
                this.f152661a.f152718f.removeMessages(2023);
                this.f152661a.getClass();
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f152661a.f152717e.get()) {
                    StackTraceElement[] stackTraceElementArrA = C3477b.a(this.f152661a);
                    InterfaceC3551g3 interfaceC3551g3 = this.f152661a.f152969a;
                    kotlin.jvm.internal.G.m(stackTraceElementArrA);
                    ((C3579i3) interfaceC3551g3).a(new ed(stackTraceElementArrA));
                }
            }
            this.f152661a.f152717e.getAndSet(true);
            this.f152661a.f152718f.sendEmptyMessage(2023);
        }
    }
}
