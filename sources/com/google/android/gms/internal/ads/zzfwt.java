package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfwt extends BroadcastReceiver {
    final /* synthetic */ zzfwu zza;

    public zzfwt(zzfwu zzfwuVar) {
        Objects.requireNonNull(zzfwuVar);
        this.zza = zzfwuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfwu zzfwuVar = this.zza;
            zzfwuVar.zzd(true, zzfwuVar.zzf());
            zzfwuVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfwu zzfwuVar2 = this.zza;
            zzfwuVar2.zzd(false, zzfwuVar2.zzf());
            zzfwuVar2.zze(false);
        }
    }
}
