package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgup extends zzgui {
    private final Object zza;

    public zzgup(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgup) {
            return this.zza.equals(((zzgup) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgui zzb(zzgub zzgubVar) {
        Object objApply = zzgubVar.apply(this.zza);
        zzguk.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgup(objApply);
    }
}
