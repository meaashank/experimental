package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzceu implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcex zza;
    private final String zzb;

    public zzceu(zzcex zzcexVar, String str) {
        Objects.requireNonNull(zzcexVar);
        this.zza = zzcexVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcex zzcexVar = this.zza;
        synchronized (zzcexVar) {
            try {
                Iterator it = zzcexVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzcev) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
