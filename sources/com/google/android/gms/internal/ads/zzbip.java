package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbip implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object zza = new Object();

    @Nullable
    private SharedPreferences zzb = null;
    private JSONObject zzc = new JSONObject();

    private final void zzg(@Nullable final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new JSONObject((String) zzbji.zza(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzbio
                    @Override // com.google.android.gms.internal.ads.zzgvc
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", Ib.b.f53002g);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @Nullable String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            try {
                if (this.zzb != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                com.google.android.gms.ads.internal.client.zzba.zza();
                SharedPreferences sharedPreferencesZza = zzbiz.zza(context);
                this.zzb = sharedPreferencesZza;
                zzg(sharedPreferencesZza);
                if (!((Boolean) zzblh.zzb.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzb(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(String str, long j10) {
        return !str.startsWith("adapter:") ? j10 : this.zzc.optLong(str, j10);
    }

    public final int zzd(String str, int i10) {
        return !str.startsWith("adapter:") ? i10 : this.zzc.optInt(str, i10);
    }

    public final float zze(String str, float f10) {
        return !str.startsWith("adapter:") ? f10 : (float) this.zzc.optDouble(str, f10);
    }

    public final boolean zzf(String str, boolean z10) {
        return !str.startsWith("adapter:") ? z10 : this.zzc.optBoolean(str, z10);
    }
}
