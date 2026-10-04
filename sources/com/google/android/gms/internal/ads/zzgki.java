package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.prism.commons.utils.C3860y;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgki implements zzgkh {
    private final Context zza;
    private final zzgrh zzb;
    private final zzgid zzc;
    private final String zzd;
    private final boolean zze;

    public zzgki(Context context, zzgrh zzgrhVar, zzgid zzgidVar, zzgei zzgeiVar) {
        this.zza = context;
        this.zzb = zzgrhVar;
        this.zzc = zzgidVar;
        this.zzd = zzgeiVar.zzd();
        this.zze = zzgeiVar.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgkh
    public final String zza(boolean z10, long j10) {
        String strEncodeToString = t1.b.f238825S4;
        try {
            this.zzb.zza(55).zza();
            zzazl zzazlVarZza = zzazm.zza();
            zzazlVarZza.zzb(this.zzd);
            zzazlVarZza.zza("0.904631200");
            Context context = this.zza;
            zzazlVarZza.zzd(context.getPackageName());
            zzazlVarZza.zzc(System.currentTimeMillis() / 1000);
            zzazlVarZza.zzf((System.currentTimeMillis() - j10) / 1000);
            if (this.zze) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance(C3860y.f162169b).digest(signatureArr[0].toByteArray());
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : bArrDigest) {
                            String hexString = Integer.toHexString(b10 & 255);
                            if (hexString.length() == 1) {
                                sb2.append('0');
                            }
                            sb2.append(hexString);
                        }
                        strEncodeToString = Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                zzazlVarZza.zzg(strEncodeToString);
            }
            try {
                Context context2 = this.zza;
                zzazlVarZza.zze(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused2) {
                zzazlVarZza.zze(-1L);
            }
            zzgid zzgidVar = this.zzc;
            if (!zzgidVar.zzc()) {
                zzgidVar.zza();
            }
            zzazs zzazsVarZzf = zzgidVar.zzf(((zzazm) zzazlVarZza.zzbu()).zzaN(), null);
            zzazsVarZzf.zzc(5);
            zzazsVarZzf.zzd(2);
            return zzgfd.zza(((zzazt) zzazsVarZzf.zzbu()).zzaN(), true);
        } finally {
        }
    }
}
