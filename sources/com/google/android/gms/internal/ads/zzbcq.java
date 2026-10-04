package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbcq extends zzbdt {
    private final Activity zzh;
    private final View zzi;

    public zzbcq(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i10, int i11, View view, Activity activity) {
        super(zzbcgVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzayaVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdD);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            try {
                zzayaVar.zzS(((Long) objArr[0]).longValue());
                zzayaVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzayaVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
