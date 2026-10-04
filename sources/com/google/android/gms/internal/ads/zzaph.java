package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaph implements zzanz {
    private final zzeu zza = new zzeu();

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i10, int i11, zzany zzanyVar, zzdu zzduVar) {
        zzcy zzcyVarZzr;
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i11 + i10);
        zzeuVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.zzd() > 0) {
            zzguk.zzb(zzeuVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzeuVar.zzB() - 8;
            if (zzeuVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcx zzcxVarZzb = null;
                while (iZzB > 0) {
                    zzguk.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzeuVar.zzB();
                    int iZzB3 = zzeuVar.zzB();
                    int i12 = iZzB - 8;
                    int i13 = iZzB2 - 8;
                    String strZzk = zzfm.zzk(zzeuVar.zzi(), zzeuVar.zzg(), i13);
                    zzeuVar.zzk(i13);
                    if (iZzB3 == 1937011815) {
                        zzcxVarZzb = zzapq.zzb(strZzk);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzapq.zzc(null, strZzk.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i12 - i13;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzcxVarZzb != null) {
                    zzcxVarZzb.zza(charSequenceZzc);
                    zzcyVarZzr = zzcxVarZzb.zzr();
                } else {
                    Pattern pattern = zzapq.zza;
                    zzapp zzappVar = new zzapp();
                    zzappVar.zzc = charSequenceZzc;
                    zzcyVarZzr = zzappVar.zza().zzr();
                }
                arrayList.add(zzcyVarZzr);
            } else {
                zzeuVar.zzk(iZzB);
            }
        }
        zzduVar.zza(new zzanr(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
