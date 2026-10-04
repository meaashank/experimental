package com.google.android.gms.internal.measurement;

import android.support.v4.media.i;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return i.a("\"", this.zza, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018c A[PHI: r4 r7
      0x018c: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:111:0x018a, B:107:0x0179] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:111:0x018a, B:107:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[PHI: r22
      0x00c4: PHI (r22v8 int) = 
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v0 int)
      (r22v5 int)
      (r22v0 int)
     binds: [B:42:0x00c1, B:94:0x0148, B:90:0x013f, B:86:0x0136, B:82:0x012d, B:78:0x0123, B:74:0x0119, B:70:0x010f, B:66:0x0105, B:62:0x00fb, B:58:0x00f0, B:54:0x00e5, B:50:0x00da, B:97:0x014d, B:46:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0151  */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r24, com.google.android.gms.internal.measurement.zzh r25, java.util.List<com.google.android.gms.internal.measurement.zzaq> r26) {
        /*
            Method dump skipped, instruction units count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }
}
