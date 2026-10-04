package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbgr implements Comparator {
    public zzbgr(zzbgs zzbgsVar) {
        Objects.requireNonNull(zzbgsVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbgh zzbghVar = (zzbgh) obj;
        zzbgh zzbghVar2 = (zzbgh) obj2;
        if (zzbghVar.zzb() < zzbghVar2.zzb()) {
            return -1;
        }
        if (zzbghVar.zzb() > zzbghVar2.zzb()) {
            return 1;
        }
        if (zzbghVar.zza() < zzbghVar2.zza()) {
            return -1;
        }
        if (zzbghVar.zza() > zzbghVar2.zza()) {
            return 1;
        }
        float fZzd = (zzbghVar.zzd() - zzbghVar.zzb()) * (zzbghVar.zzc() - zzbghVar.zza());
        float fZzd2 = (zzbghVar2.zzd() - zzbghVar2.zzb()) * (zzbghVar2.zzc() - zzbghVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
