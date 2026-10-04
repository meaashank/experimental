package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbf zzb = zzhbf.zzb(0, 2, 1);
    private static final zzhbf zzc = zzhbf.zzc(0, 2, 1, 3, 4);
    private static final zzhbf zzd = zzhbf.zzd(0, 2, 1, 5, 3, 4);
    private static final zzhbf zze = zzhbf.zze(0, 2, 1, 6, 5, 3, 4);
    private static final zzhbf zzf = zzhbf.zze(0, 2, 1, 7, 5, 6, 3, 4);

    @Nullable
    public static zzhbf zza(int i10) {
        if (i10 == 3) {
            return zzb;
        }
        if (i10 == 5) {
            return zzc;
        }
        if (i10 == 6) {
            return zzd;
        }
        if (i10 == 7) {
            return zze;
        }
        if (i10 != 8) {
            return null;
        }
        return zzf;
    }

    @Nullable
    public static zzap zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = zzfm.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzeh.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzajn.zzb(new zzeu(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    zzeh.zzd("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzakj(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }
}
