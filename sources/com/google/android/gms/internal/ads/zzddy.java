package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@e.f0
public final class zzddy extends zzdjn implements zzddt {
    @e.f0
    public zzddy(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzddx
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzdef) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzd(final zzdol zzdolVar) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzddv
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                zzdef zzdefVar = (zzdef) obj;
                String message = zzdolVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdefVar.zzj(zzfmy.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zze() {
        zzs(zzddw.zza);
    }
}
