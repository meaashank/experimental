package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgay implements Closeable {
    public static zzgbk zza() {
        return new zzgbk();
    }

    public static zzgbk zzb(zzgvc<Integer> zzgvcVar, zzgvc<Integer> zzgvcVar2, zzgba zzgbaVar) {
        return new zzgbk(zzgvcVar, zzgvcVar2, zzgbaVar);
    }

    public static zzgbk zzc(final int i10, zzgba zzgbaVar) {
        return new zzgbk(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgax
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        }, zzgaw.zza, zzgbaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
