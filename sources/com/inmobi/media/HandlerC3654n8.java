package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3654n8 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f153201a;

    public HandlerC3654n8(C3668o8 controller) {
        kotlin.jvm.internal.G.p(controller, "controller");
        this.f153201a = new WeakReference(controller);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        C3765v8 c3765v8;
        kotlin.jvm.internal.G.p(msg, "msg");
        if (msg.what != 2) {
            super.handleMessage(msg);
            return;
        }
        C3668o8 c3668o8 = (C3668o8) this.f153201a.get();
        if (c3668o8 != null) {
            C3765v8 c3765v82 = c3668o8.f153232d;
            if (c3765v82 != null) {
                int currentPosition = c3765v82.getCurrentPosition();
                int duration = c3765v82.getDuration();
                if (duration != 0) {
                    c3668o8.f153236h.setProgress((currentPosition * 100) / duration);
                }
            }
            if (c3668o8.f153233e && (c3765v8 = c3668o8.f153232d) != null && c3765v8.isPlaying()) {
                Message messageObtainMessage = obtainMessage(2);
                kotlin.jvm.internal.G.o(messageObtainMessage, "obtainMessage(...)");
                sendMessageDelayed(messageObtainMessage, 200L);
            }
        }
    }
}
