package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzcgo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbk extends zzats {
    private final zzcgo zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcgo zzcgoVar) {
        super(0, str, new zzbj(zzcgoVar));
        this.zza = zzcgoVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final zzaty zzr(zzato zzatoVar) {
        return zzaty.zza(zzatoVar, zzaup.zza(zzatoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzato zzatoVar = (zzato) obj;
        Map map = zzatoVar.zzc;
        int i10 = zzatoVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i10);
        byte[] bArr = zzatoVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzatoVar);
    }
}
