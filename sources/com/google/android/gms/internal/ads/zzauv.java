package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class zzauv extends zzats {
    private final Object zza;

    @Nullable
    @InterfaceC4326A("mLock")
    private final zzatx zzb;

    public zzauv(int i10, String str, zzatx zzatxVar, @Nullable zzatw zzatwVar) {
        super(i10, str, zzatwVar);
        this.zza = new Object();
        this.zzb = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final zzaty zzr(zzato zzatoVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzatoVar.zzb;
            Map map = zzatoVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzatoVar.zzb);
        }
        return zzaty.zza(str, zzaup.zza(zzatoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzats
    /* JADX INFO: renamed from: zzz */
    public void zzs(String str) {
        zzatx zzatxVar;
        synchronized (this.zza) {
            zzatxVar = this.zzb;
        }
        zzatxVar.zza(str);
    }
}
