package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfxv extends zzfxw {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfxv(zzfxo zzfxoVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfxoVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
