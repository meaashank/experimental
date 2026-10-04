package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import e.InterfaceC4326A;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzcex {

    @InterfaceC4326A("this")
    private final Map zza = new HashMap();

    @InterfaceC4326A("this")
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcek zzd;

    public zzcex(Context context, zzcek zzcekVar) {
        this.zzc = context;
        this.zzd = zzcekVar;
    }

    public final synchronized void zza(zzcev zzcevVar) {
        this.zzb.add(zzcevVar);
    }

    public final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzceu zzceuVar = new zzceu(this, str);
            map.put(str, zzceuVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceuVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
