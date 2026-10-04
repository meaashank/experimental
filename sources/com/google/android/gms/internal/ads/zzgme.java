package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgme {
    private final File zza;
    private final zzfyd zzb;
    private final zzgrh zzc;

    public zzgme(File file, zzfyd zzfydVar, zzgrh zzgrhVar) {
        this.zza = file;
        this.zzb = zzfydVar;
        this.zzc = zzgrhVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzhat.zzb(file);
            zzhat.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e10) {
            this.zzc.zzd(2027, e10);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
