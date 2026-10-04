package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxo {
    private JSONObject zza;
    private final zzfxx zzb;

    public zzfxo(zzfxx zzfxxVar) {
        this.zzb = zzfxxVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfya(this, hashSet, jSONObject, j10));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfxz(this, hashSet, jSONObject, j10));
    }

    public final void zzc() {
        this.zzb.zza(new zzfxy(this));
    }

    @e.f0
    public final JSONObject zzd() {
        return this.zza;
    }

    @e.f0
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
