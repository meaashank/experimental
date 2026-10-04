package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvk implements zzbqy {
    private final zzcgo zza;

    public zzbvk(zzbvm zzbvmVar, zzcgo zzcgoVar) {
        Objects.requireNonNull(zzbvmVar);
        this.zza = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzb(@Nullable String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbup());
            } else {
                this.zza.zzd(new zzbup(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
