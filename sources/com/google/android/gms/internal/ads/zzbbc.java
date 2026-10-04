package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbc extends zzbbb {
    private zzbbc(Context context, zzbba zzbbaVar) {
        super(context, zzbbaVar);
    }

    public static zzbbc zzt(Context context, zzaxc zzaxcVar) {
        zzbba zzbbaVar = new zzbba(zzaxcVar);
        zzbbb.zzo(context, zzbbaVar);
        return new zzbbc(context, zzbbaVar);
    }
}
