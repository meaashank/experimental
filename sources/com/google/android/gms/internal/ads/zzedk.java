package com.google.android.gms.internal.ads;

import e.InterfaceC4326A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedk {
    private final zzecu zza;
    private final zzdxx zzb;
    private final Object zzc = new Object();

    @InterfaceC4326A("lock")
    private final List zzd = new ArrayList();

    @InterfaceC4326A("lock")
    private boolean zze;

    public zzedk(zzecu zzecuVar, zzdxx zzdxxVar) {
        this.zza = zzecuVar;
        this.zzb = zzdxxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdxw zzdxwVarZzc;
        zzdxw zzdxwVarZzc2;
        zzbyi zzbyiVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbsh zzbshVar = (zzbsh) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkR)).booleanValue() || (zzdxwVarZzc2 = this.zzb.zzc(zzbshVar.zza)) == null || (zzbyiVar = zzdxwVarZzc2.zzc) == null) ? "" : zzbyiVar.toString();
                    String str = string;
                    boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkS)).booleanValue() && (zzdxwVarZzc = this.zzb.zzc(zzbshVar.zza)) != null && zzdxwVarZzc.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbshVar.zza;
                    list2.add(new zzedj(str2, str, this.zzb.zzd(str2), zzbshVar.zzb ? 1 : 0, zzbshVar.zzd, zzbshVar.zzc, z10));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzedi(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzecu zzecuVar = this.zza;
                    if (!zzecuVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzecuVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzedj) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
