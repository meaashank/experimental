package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
final class zzibv extends ThreadLocal {
    final /* synthetic */ zzibw zza;

    public zzibv(zzibw zzibwVar) {
        Objects.requireNonNull(zzibwVar);
        this.zza = zzibwVar;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzibh zzibhVar = zzibh.zzb;
            zzibw zzibwVar = this.zza;
            Mac mac = (Mac) zzibhVar.zzb(zzibwVar.zzb());
            mac.init(zzibwVar.zzc());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
