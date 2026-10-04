package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e.InterfaceC4335i;

/* JADX INFO: loaded from: classes4.dex */
public class zzgbp extends Handler {
    public zzgbp() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @InterfaceC4335i
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzgbp(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
