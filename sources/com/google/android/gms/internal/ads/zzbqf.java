package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbqf implements zzbqh {
    static final /* synthetic */ zzbqf zza = new zzbqf();

    private /* synthetic */ zzbqf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmy zzcmyVar = (zzcmy) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzcmyVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z10 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            map2.put(str2, boolValueOf);
            StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb2.append("/canOpenURLs;");
            sb2.append(str2);
            sb2.append(";");
            sb2.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        ((zzbte) zzcmyVar).zze("openableURLs", map2);
    }
}
