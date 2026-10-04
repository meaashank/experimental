package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemv {
    private final String zzc;

    @Nullable
    private zzflg zzd = null;

    @Nullable
    private zzfld zze = null;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzemv(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfld zzfldVar, int i10) {
        Map map = this.zzb;
        String strZzl = zzl(zzfldVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfldVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfldVar.zzE, 0L, null, bundle, zzfldVar.zzF, zzfldVar.zzG, zzfldVar.zzH, zzfldVar.zzI);
        try {
            this.zza.add(i10, zzvVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzfld zzfldVar, long j10, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        Map map = this.zzb;
        String strZzl = zzl(zzfldVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfldVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j10;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhP)).booleanValue() && z10) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfld zzfldVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue() ? zzfldVar.zzap : zzfldVar.zzw;
    }

    public final void zza(zzflg zzflgVar) {
        this.zzd = zzflgVar;
    }

    public final void zzb(zzfld zzfldVar) {
        zzj(zzfldVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfld) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzd(zzfld zzfldVar, long j10, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfldVar, j10, null, true);
    }

    public final void zze(zzfld zzfldVar, long j10, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfldVar, j10, zzeVar, false);
    }

    public final zzddi zzf() {
        return new zzddi(this.zze, "", this, this.zzd, this.zzc);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfld zzfldVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfldVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
