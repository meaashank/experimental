package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzvb extends Handler {
    final /* synthetic */ zzvd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvb(zzvd zzvdVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzvdVar);
        this.zza = zzvdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
