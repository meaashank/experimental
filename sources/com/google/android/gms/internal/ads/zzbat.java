package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbat implements zzfzy {
    final /* synthetic */ zzfyd zza;

    public zzbat(zzbav zzbavVar, zzfyd zzfydVar) {
        this.zza = zzfydVar;
        Objects.requireNonNull(zzbavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
