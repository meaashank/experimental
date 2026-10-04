package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzibd implements zzibg {
    private final zzibp zza;

    @Override // com.google.android.gms.internal.ads.zzibg
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzibh.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
