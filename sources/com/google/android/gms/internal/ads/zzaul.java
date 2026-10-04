package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@e.f0
final class zzaul {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzaul(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }

    public static zzaul zza(zzaum zzaumVar) throws IOException {
        if (zzauo.zzi(zzaumVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzauo.zzm(zzaumVar);
        String strZzm2 = zzauo.zzm(zzaumVar);
        long jZzk = zzauo.zzk(zzaumVar);
        long jZzk2 = zzauo.zzk(zzaumVar);
        long jZzk3 = zzauo.zzk(zzaumVar);
        long jZzk4 = zzauo.zzk(zzaumVar);
        int iZzi = zzauo.zzi(zzaumVar);
        if (iZzi < 0) {
            throw new IOException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzi).length() + 20), "readHeaderList size=", iZzi));
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iZzi; i10++) {
            arrayList.add(new zzatk(zzauo.zzm(zzaumVar).intern(), zzauo.zzm(zzaumVar).intern()));
        }
        return new zzaul(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzaul(String str, zzatb zzatbVar) {
        String str2 = zzatbVar.zzb;
        long j10 = zzatbVar.zzc;
        long j11 = zzatbVar.zzd;
        long j12 = zzatbVar.zze;
        long j13 = zzatbVar.zzf;
        ?? arrayList = zzatbVar.zzh;
        if (arrayList == 0) {
            Map map = zzatbVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzatk((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
