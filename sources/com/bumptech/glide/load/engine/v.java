package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f139790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f139791b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f139792a = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((s) message.obj).a();
            return true;
        }
    }

    public synchronized void a(s<?> sVar, boolean z10) {
        try {
            if (this.f139790a || z10) {
                this.f139791b.obtainMessage(1, sVar).sendToTarget();
            } else {
                this.f139790a = true;
                sVar.a();
                this.f139790a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
