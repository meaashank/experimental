package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class zzs {
    private static zzr zza;

    public static synchronized zzr zza(Intent intent, Context context) {
        try {
            if (zza == null) {
                zzai zzaiVar = new zzai(intent, context.getApplicationContext());
                zzaiVar.zzp();
                zza = zzaiVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
