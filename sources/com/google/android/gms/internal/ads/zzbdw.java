package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdw {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(t1.b.f238816R4)) {
            return null;
        }
        final zzhdr zzhdrVarZze = zzhdr.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdv
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhdr zzhdrVar = zzhdrVarZze;
                if (list2 == null) {
                    zzhdrVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksumA = Y.a(list2.get(i10));
                        if (apkChecksumA.getType() == 8) {
                            zzhdrVar.zza(zzbcj.zza(apkChecksumA.getValue()));
                            return;
                        }
                    }
                    zzhdrVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhdrVar.zza((Object) null);
                }
            }
        });
        return (String) zzhdrVarZze.get();
    }
}
