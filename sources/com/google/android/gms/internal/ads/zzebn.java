package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebn {
    public final long zza;
    public final int[] zzb;

    private zzebn(long j10, int[] iArr) {
        this.zza = j10;
        this.zzb = iArr;
    }

    public static zzgxm zza(JsonReader jsonReader) throws IOException {
        int i10 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgxm zzgxmVarZzi = zzgxm.zzi();
            jsonReader.beginObject();
            zzebn zzebnVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgxj zzgxjVar2 = new zzgxj();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgxjVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgxmVarZzi = zzgxjVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgxmVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgxmVarZzi.size()];
                for (int i11 = 0; i11 < zzgxmVarZzi.size(); i11++) {
                    iArr[i11] = ((Integer) zzgxmVarZzi.get(i11)).intValue();
                }
                zzebnVar = new zzebn(jLongValue, iArr);
            }
            if (zzebnVar != null) {
                zzgxjVar.zzf(zzebnVar);
            }
        }
        jsonReader.endArray();
        return zzgxjVar.zzi();
    }
}
