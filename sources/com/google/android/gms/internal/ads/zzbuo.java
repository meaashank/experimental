package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbuo implements zzbtf, zzbun {
    private final zzbun zza;
    private final HashSet zzb = new HashSet();

    public zzbuo(zzbun zzbunVar) {
        this.zza = zzbunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbtq
    public /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        C3298g0.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbtq
    public /* synthetic */ void zzc(String str, String str2) {
        C3298g0.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbte
    public /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        C3298g0.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbte
    public /* synthetic */ void zze(String str, Map map) {
        C3298g0.d(this, str, map);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbqh) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbqh) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzm(String str, zzbqh zzbqhVar) {
        this.zza.zzm(str, zzbqhVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbqhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzn(String str, zzbqh zzbqhVar) {
        this.zza.zzn(str, zzbqhVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbqhVar));
    }
}
