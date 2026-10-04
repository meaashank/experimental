package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzdrn implements zzbmi {
    final /* synthetic */ zzdso zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdrn(zzdso zzdsoVar, ViewGroup viewGroup) {
        this.zza = zzdsoVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zza() {
        zzgxm zzgxmVar = zzdrm.zza;
        zzdso zzdsoVar = this.zza;
        Map mapZzi = zzdsoVar.zzi();
        if (mapZzi == null) {
            return;
        }
        int size = zzgxmVar.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapZzi.get((String) zzgxmVar.get(i10));
            i10++;
            if (obj != null) {
                zzdsoVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final JSONObject zzc() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final JSONObject zzd() {
        return this.zza.zzo();
    }
}
