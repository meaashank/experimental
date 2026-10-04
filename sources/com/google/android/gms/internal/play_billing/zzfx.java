package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfx extends zzfg {
    Object zza;

    private zzfx() {
        throw null;
    }

    public static int zzx(zzhr zzhrVar) {
        int iZzn = zzhrVar.zzn();
        return zzy(iZzn) + iZzn;
    }

    public static int zzy(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzz(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void zzA() {
        if (zza() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zza() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzf(int i10, zzfp zzfpVar) throws IOException;

    public abstract void zzg(zzfp zzfpVar) throws IOException;

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    public abstract void zzn(zzhr zzhrVar) throws IOException;

    public abstract void zzo(int i10, zzhr zzhrVar) throws IOException;

    public abstract void zzp(int i10, zzfp zzfpVar) throws IOException;

    public abstract void zzq(int i10, String str) throws IOException;

    public abstract void zzr(String str) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10, int i11) throws IOException;

    public abstract void zzu(int i10) throws IOException;

    public abstract void zzv(int i10, long j10) throws IOException;

    public abstract void zzw(long j10) throws IOException;

    public /* synthetic */ zzfx(zzfw zzfwVar) {
    }
}
