package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
public final class T0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(Looper looper) {
        super(looper);
        kotlin.jvm.internal.G.p(looper, "looper");
        this.f152447a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.G.p(msg, "msg");
        if (W0.f152540c) {
            return;
        }
        int i10 = msg.what;
        if (i10 == 1001 && this.f152447a) {
            this.f152447a = false;
            W0.a(W0.f152538a, false);
            kotlin.jvm.internal.G.o(W0.b(), "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f152447a) {
                return;
            }
            this.f152447a = true;
            W0.a(W0.f152538a, true);
            kotlin.jvm.internal.G.o(W0.b(), "access$getTAG$p(...)");
        }
    }
}
