package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
final class zzgud extends zzgua implements Serializable {
    private final Pattern zza;

    public zzgud(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgua
    public final zzgtz zza(CharSequence charSequence) {
        return new zzguc(this.zza.matcher(charSequence));
    }
}
