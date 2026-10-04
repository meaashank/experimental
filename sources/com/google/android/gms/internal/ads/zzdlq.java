package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlq extends zzdjn implements zzbfg {
    private final Map zzb;
    private final Context zzc;
    private final zzfld zzd;

    public zzdlq(Context context, Set set, zzfld zzfldVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfldVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzbfi zzbfiVar = (zzbfi) map.get(view);
            if (zzbfiVar == null) {
                zzbfi zzbfiVar2 = new zzbfi(this.zzc, view);
                zzbfiVar2.zza(this);
                map.put(view, zzbfiVar2);
                zzbfiVar = zzbfiVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcf)).booleanValue()) {
                    zzbfiVar.zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzce)).longValue());
                    return;
                }
            }
            zzbfiVar.zze();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbfi) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void zzdj(final zzbff zzbffVar) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzbfg) obj).zzdj(zzbffVar);
            }
        });
    }
}
