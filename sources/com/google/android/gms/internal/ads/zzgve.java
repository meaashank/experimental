package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgve implements zzgvc {
    private final zzgvi zza = new zzgvi();
    private volatile zzgvc zzb;
    private Object zzc;

    public zzgve(zzgvc zzgvcVar) {
        this.zzb = zzgvcVar;
    }

    public final String toString() {
        Object objA = this.zzb;
        if (objA == null) {
            String strValueOf = String.valueOf(this.zzc);
            objA = androidx.compose.animation.core.E0.a(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String string = objA.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                try {
                    if (this.zzb != null) {
                        Object objZza = this.zzb.zza();
                        this.zzc = objZza;
                        this.zzb = null;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
