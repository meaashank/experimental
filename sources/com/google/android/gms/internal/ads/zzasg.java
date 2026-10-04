package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzasg {
    public final int zza;
    public final long zzb;

    private zzasg(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzasg zza(zzagi zzagiVar, zzeu zzeuVar) throws IOException {
        zzagiVar.zzi(zzeuVar.zzi(), 0, 8);
        zzeuVar.zzh(0);
        return new zzasg(zzeuVar.zzB(), zzeuVar.zzA());
    }
}
