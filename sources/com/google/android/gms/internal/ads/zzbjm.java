package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjm {
    public static final void zza(zzbjl zzbjlVar, @Nullable zzbjj zzbjjVar) {
        if (zzbjjVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbjjVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbjlVar.zza(zzbjjVar.zzb(), zzbjjVar.zzc(), zzbjjVar.zza(), zzbjjVar.zzd());
    }
}
