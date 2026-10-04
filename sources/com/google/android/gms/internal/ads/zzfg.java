package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzfg implements zzdz {

    @Nullable
    private Message zza;

    private zzfg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfh.zzo(this);
    }

    public final zzfg zzb(Message message, zzfh zzfhVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfh.zzo(this);
        return zSendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzfg(byte[] bArr) {
    }
}
