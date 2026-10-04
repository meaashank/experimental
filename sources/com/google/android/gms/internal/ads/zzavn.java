package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavn extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzavn(zzavm zzavmVar, zzavk zzavkVar, long j10) {
        int i10 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i10];
        objArr[0] = Long.valueOf(zzavmVar.zza());
        objArr[1] = Long.valueOf(zzavkVar.zza());
        int i11 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j10);
        objArr[i11] = lValueOf;
        super(String.format(locale, zzawc.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzavkVar);
        Optional.of(lValueOf);
    }

    public zzavn(zzavm zzavmVar, Throwable th) {
        super(String.format(Locale.US, zzawc.zza("bk0="), Long.valueOf(zzavmVar.zza())), th);
        Optional.empty();
        Optional.empty();
    }
}
