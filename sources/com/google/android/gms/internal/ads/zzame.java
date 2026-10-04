package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzame implements zzaho {
    public static final zzame zza = new zzame(true);
    public static final zzame zzb = new zzame(false);
    public final boolean zzc;

    private zzame(boolean z10) {
        this.zzc = z10;
    }

    public final String toString() {
        boolean z10 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
