package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapr implements zzanz {
    private final zzeu zza = new zzeu();
    private final zzapi zzb = new zzapi();

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i10, int i11, zzany zzanyVar, zzdu zzduVar) {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i11 + i10);
        zzeuVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzeuVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzeuVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzeuVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzeuVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b10 = -1;
                int iZzg2 = 0;
                while (b10 == -1) {
                    iZzg2 = zzeuVar.zzg();
                    String strZzN2 = zzeuVar.zzN(StandardCharsets.UTF_8);
                    b10 = strZzN2 == null ? (byte) 0 : "STYLE".equals(strZzN2) ? (byte) 2 : strZzN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                }
                zzeuVar.zzh(iZzg2);
                if (b10 == 0) {
                    zzant.zza(new zzapu(arrayList2), zzanyVar, zzduVar);
                    return;
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b10 != 2) {
                    zzapk zzapkVarZza = zzapq.zza(zzeuVar, arrayList);
                    if (zzapkVarZza != null) {
                        arrayList2.add(zzapkVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzeuVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzeuVar));
                }
            }
        } catch (zzat e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
