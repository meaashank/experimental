package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
final class zzsk {
    private final zzsj zza;
    private final int zzb;
    private final zztj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzsk(AudioTrack audioTrack, zztj zztjVar) {
        this.zza = new zzsj(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zztjVar;
        zzf(0);
    }

    private final void zzf(int i10) {
        this.zzd = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.zzf = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j10;
    }

    private final long zzg(long j10, float f10) {
        zzsj zzsjVar = this.zza;
        return zzh(zzsjVar.zzc(), zzsjVar.zzb(), j10, f10);
    }

    private final long zzh(long j10, long j11, long j12, float f10) {
        long j13 = j12 - j11;
        return zzfm.zzy(j13, f10) + zzfm.zzu(j10, this.zzb);
    }

    public final void zza(long j10, float f10, long j11, boolean z10) {
        boolean z11;
        int i10;
        if (z10 || j10 - this.zzg >= this.zzf) {
            this.zzg = j10;
            zzsj zzsjVar = this.zza;
            boolean zZza = zzsjVar.zza();
            if (zZza) {
                long jZzb = zzsjVar.zzb();
                long jZzg = zzg(j10, f10);
                i10 = 2;
                if (Math.abs(jZzb - j10) > 5000000) {
                    zztj zztjVar = this.zzc;
                    long jZzc = zzsjVar.zzc();
                    long jZzs = ((zzsw) zztjVar).zza.zzs();
                    int length = String.valueOf(jZzc).length();
                    int length2 = String.valueOf(jZzb).length();
                    int length3 = String.valueOf(j10).length();
                    StringBuilder sb2 = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j11).length() + 2 + String.valueOf(jZzs).length());
                    C1713x0.a(sb2, "Spurious audio timestamp (system clock mismatch): ", jZzc, U6.j.f68738d);
                    sb2.append(jZzb);
                    C1713x0.a(sb2, U6.j.f68738d, j10, U6.j.f68738d);
                    sb2.append(j11);
                    sb2.append(U6.j.f68738d);
                    sb2.append(jZzs);
                    zzeh.zzc("AudioTrackAudioOutput", sb2.toString());
                    zzf(4);
                    z11 = zZza;
                } else if (Math.abs(jZzg - j11) > 5000000) {
                    zztj zztjVar2 = this.zzc;
                    long jZzc2 = zzsjVar.zzc();
                    long jZzs2 = ((zzsw) zztjVar2).zza.zzs();
                    int length4 = String.valueOf(jZzc2).length();
                    int length5 = String.valueOf(jZzb).length();
                    int length6 = String.valueOf(j10).length();
                    int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j11).length() + 2;
                    z11 = zZza;
                    StringBuilder sb3 = new StringBuilder(length7 + String.valueOf(jZzs2).length());
                    C1713x0.a(sb3, "Spurious audio timestamp (frame position mismatch): ", jZzc2, U6.j.f68738d);
                    sb3.append(jZzb);
                    C1713x0.a(sb3, U6.j.f68738d, j10, U6.j.f68738d);
                    sb3.append(j11);
                    sb3.append(U6.j.f68738d);
                    sb3.append(jZzs2);
                    zzeh.zzc("AudioTrackAudioOutput", sb3.toString());
                    zzf(4);
                } else {
                    z11 = zZza;
                    if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z11 = zZza;
                i10 = 2;
            }
            int i11 = this.zzd;
            if (i11 == 0) {
                if (!z11) {
                    if (j10 - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzsjVar.zzb() >= this.zze) {
                        this.zzh = zzsjVar.zzc();
                        this.zzi = zzsjVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == i10) {
                    if (z11) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i11 == 3 && z11) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                zzf(0);
                return;
            }
            long jZzc3 = zzsjVar.zzc();
            long j12 = this.zzh;
            if (jZzc3 > j12) {
                if (Math.abs(zzg(j10, f10) - zzh(j12, this.zzi, j10, f10)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j10 - this.zze > 2000000) {
                zzf(3);
            } else {
                this.zzh = zzsjVar.zzc();
                this.zzi = zzsjVar.zzb();
            }
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i10 = this.zzd;
        return i10 == 0 || i10 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j10, float f10) {
        return zzg(j10, f10);
    }
}
