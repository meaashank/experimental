package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabd {
    public final zzbg zza;
    public final int[] zzb;

    public zzabd(zzbg zzbgVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzeh.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
