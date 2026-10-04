package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtx extends zzgtv {
    static final int zza = Integer.numberOfLeadingZeros(31);
    static final zzgty zzb = new zzgtx();

    public zzgtx() {
        super("CharMatcher.whitespace()");
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    public final boolean zzb(char c10) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> zza) == c10;
    }
}
