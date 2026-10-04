package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzara implements zzarw {
    private final zzaqh zza;
    private final zzet zzb = new zzet(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfj zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzara(zzaqh zzaqhVar) {
        this.zza = zzaqhVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzeu zzeuVar, @Nullable byte[] bArr, int i10) {
        int iMin = Math.min(zzeuVar.zzd(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzeuVar.zzk(iMin);
        } else {
            zzeuVar.zzm(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.zze = zzfjVar;
        this.zza.zzb(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzc(zzeu zzeuVar, int i10) throws zzat {
        int i11;
        int i12;
        long jZze;
        long j10;
        this.zze.getClass();
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i16);
                        sb2.append(" more bytes");
                        zzeh.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zzf();
                } else {
                    zzeh.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (zzeuVar.zze() == 0) {
                this.zza.zzn();
            }
            zze(1);
        }
        int i17 = i10;
        while (zzeuVar.zzd() > 0) {
            int i18 = this.zzc;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != i14) {
                        int iZzd = zzeuVar.zzd();
                        int i19 = this.zzj;
                        int i20 = i19 != i13 ? iZzd - i19 : 0;
                        if (i20 > 0) {
                            iZzd -= i20;
                            zzeuVar.zzf(zzeuVar.zzg() + iZzd);
                        }
                        zzaqh zzaqhVar = this.zza;
                        zzaqhVar.zzd(zzeuVar);
                        int i21 = this.zzj;
                        if (i21 != i13) {
                            int i22 = i21 - iZzd;
                            this.zzj = i22;
                            if (i22 == 0) {
                                zzaqhVar.zzf();
                                zze(1);
                            }
                        }
                    } else {
                        int iMin = Math.min(10, this.zzi);
                        zzet zzetVar = this.zzb;
                        if (zzf(zzeuVar, zzetVar.zza, iMin) && zzf(zzeuVar, null, this.zzi)) {
                            zzetVar.zzf(0);
                            if (this.zzf) {
                                zzetVar.zzh(4);
                                long jZzj = zzetVar.zzj(3);
                                zzetVar.zzh(1);
                                int iZzj = zzetVar.zzj(15) << 15;
                                zzetVar.zzh(1);
                                long jZzj2 = zzetVar.zzj(15);
                                zzetVar.zzh(1);
                                if (this.zzh || !this.zzg) {
                                    j10 = jZzj;
                                } else {
                                    zzetVar.zzh(4);
                                    j10 = jZzj;
                                    long jZzj3 = ((long) zzetVar.zzj(3)) << 30;
                                    zzetVar.zzh(1);
                                    int iZzj2 = zzetVar.zzj(15) << 15;
                                    zzetVar.zzh(1);
                                    long jZzj4 = zzetVar.zzj(15);
                                    zzetVar.zzh(1);
                                    this.zze.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                                    this.zzh = true;
                                }
                                jZze = this.zze.zze(jZzj2 | (j10 << 30) | ((long) iZzj));
                            } else {
                                jZze = -9223372036854775807L;
                            }
                            i17 |= true != this.zzk ? 0 : 4;
                            this.zza.zzc(jZze, i17);
                            zze(3);
                            i13 = -1;
                            i14 = 2;
                        }
                    }
                    i11 = i14;
                } else {
                    zzet zzetVar2 = this.zzb;
                    if (zzf(zzeuVar, zzetVar2.zza, 9)) {
                        zzetVar2.zzf(0);
                        int iZzj3 = zzetVar2.zzj(24);
                        if (iZzj3 != 1) {
                            B.a(new StringBuilder(String.valueOf(iZzj3).length() + 30), "Unexpected start code prefix: ", iZzj3, "PesReader");
                            i13 = -1;
                            this.zzj = -1;
                            i12 = 0;
                            i11 = 2;
                        } else {
                            zzetVar2.zzh(8);
                            int iZzj4 = zzetVar2.zzj(16);
                            zzetVar2.zzh(5);
                            this.zzk = zzetVar2.zzi();
                            i11 = 2;
                            zzetVar2.zzh(2);
                            this.zzf = zzetVar2.zzi();
                            this.zzg = zzetVar2.zzi();
                            zzetVar2.zzh(6);
                            int iZzj5 = zzetVar2.zzj(8);
                            this.zzi = iZzj5;
                            if (iZzj4 == 0) {
                                this.zzj = -1;
                                i13 = -1;
                            } else {
                                int i23 = (iZzj4 - 3) - iZzj5;
                                this.zzj = i23;
                                if (i23 < 0) {
                                    B.a(new StringBuilder(String.valueOf(i23).length() + 36), "Found negative packet payload size: ", i23, "PesReader");
                                    i13 = -1;
                                    this.zzj = -1;
                                } else {
                                    i13 = -1;
                                }
                            }
                            i12 = 2;
                        }
                        zze(i12);
                    } else {
                        i13 = -1;
                        i11 = 2;
                    }
                }
            } else {
                i11 = i14;
                zzeuVar.zzk(zzeuVar.zzd());
            }
            i14 = i11;
        }
    }

    public final boolean zzd(boolean z10) {
        int i10 = this.zzc;
        if (i10 == 3) {
            if (this.zzj != -1) {
                return false;
            }
        } else if (i10 != 1) {
            return false;
        }
        return true;
    }
}
