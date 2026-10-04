package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzddk {
    @Nullable
    public static final zzcef zza(Context context, VersionInfoParcel versionInfoParcel, zzfld zzfldVar, zzceb zzcebVar) {
        zzcec zzcecVar = zzfldVar.zzA;
        if (zzcecVar == null) {
            return null;
        }
        zzfli zzfliVar = zzfldVar.zzs;
        return new zzcea(context, versionInfoParcel, zzcecVar, zzfliVar != null ? zzfliVar.zzb : null, zzcebVar);
    }
}
