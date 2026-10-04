package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import e.InterfaceC4335i;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzf implements zzaht {

    @Nullable
    private zzv zzC;
    private boolean zzE;
    private final zzza zza;

    @Nullable
    private final zzus zzd;

    @Nullable
    private final zzun zze;

    @Nullable
    private zzze zzf;

    @Nullable
    private zzv zzg;

    @Nullable
    private zzul zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzz;
    private final zzzb zzb = new zzzb();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzahs[] zzo = new zzahs[1000];
    private final zzzm zzc = new zzzm(zzzc.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private long zzw = Long.MIN_VALUE;
    private boolean zzB = true;
    private boolean zzA = true;
    private boolean zzD = true;
    private long zzu = Long.MIN_VALUE;
    private int zzx = -1;
    private int zzy = -1;

    public zzzf(zzabp zzabpVar, @Nullable zzus zzusVar, @Nullable zzun zzunVar) {
        this.zzd = zzusVar;
        this.zze = zzunVar;
        this.zza = new zzza(zzabpVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzC(zzma zzmaVar, zziy zziyVar, boolean z10, boolean z11, zzzb zzzbVar) {
        try {
            int i10 = this.zzq + this.zzs;
            int i11 = this.zzx;
            boolean z12 = false;
            if (i11 != -1 && i10 >= i11) {
                z12 = true;
            }
            if (!zzI() || zzJ() || z12) {
                if (!z11 && !this.zzz && !z12) {
                    zzv zzvVar = this.zzC;
                    if (zzvVar != null && (z10 || zzvVar != this.zzg)) {
                        zzK(zzvVar, zzmaVar);
                        return -5;
                    }
                }
                zziyVar.zzg(4);
                zziyVar.zzd = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzzd) this.zzc.zza(i10)).zza;
            if (!z10 && zzvVar2 == this.zzg) {
                int iZzO = zzO(this.zzs);
                if (zzL(iZzO)) {
                    zziyVar.zzg(this.zzm[iZzO]);
                    if (this.zzs == this.zzp - 1 && (z11 || this.zzz)) {
                        zziyVar.zzh(536870912);
                    }
                    zziyVar.zzd = this.zzn[iZzO];
                    zzzbVar.zza = this.zzl[iZzO];
                    zzzbVar.zzb = this.zzk[iZzO];
                    zzzbVar.zzc = this.zzo[iZzO];
                    return -4;
                }
            }
            zzK(zzvVar2, zzmaVar);
            return -5;
            return -3;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzD(zzv zzvVar) {
        try {
            this.zzB = false;
            if (Objects.equals(zzvVar, this.zzC)) {
                return false;
            }
            zzzm zzzmVar = this.zzc;
            if (zzzmVar.zzf() || !((zzzd) zzzmVar.zzc()).zza.equals(zzvVar)) {
                this.zzC = zzvVar;
            } else {
                this.zzC = ((zzzd) zzzmVar.zzc()).zza;
            }
            boolean z10 = this.zzD;
            zzv zzvVar2 = this.zzC;
            String str = zzvVar2.zzp;
            this.zzD = z10 & (zzas.zzf(str) == 1 && zzas.zzd(str, zzvVar2.zzk));
            this.zzE = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized long zzE(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzp     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzn     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzr     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzs     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzM(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzN(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzf.zzE(long, boolean, boolean):long");
    }

    private final synchronized long zzF() {
        int i10 = this.zzp;
        if (i10 == 0) {
            return -1L;
        }
        return zzN(i10);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j10, int i10, long j11, int i11, @Nullable zzahs zzahsVar) {
        int i12;
        try {
            int i13 = this.zzp;
            if (i13 > 0) {
                int iZzO = zzO(i13 - 1);
                zzguk.zza(this.zzk[iZzO] + ((long) this.zzl[iZzO]) <= j11);
            }
            int i14 = 536870912 & i10;
            this.zzz = i14 != 0;
            this.zzw = Math.max(this.zzw, j10);
            int i15 = this.zzq;
            int i16 = this.zzp;
            int i17 = i15 + i16;
            long j12 = this.zzu;
            if (j12 != Long.MIN_VALUE && this.zzx == -1) {
                if (j10 >= j12) {
                    int i18 = this.zzy;
                    if (i18 == -1) {
                        this.zzy = i17;
                        i18 = i17;
                    }
                    int i19 = (i17 - i18) + 1;
                    int i20 = i10 & 1;
                    zzv zzvVar = this.zzC;
                    int i21 = 16;
                    if (zzvVar != null && (i12 = zzvVar.zzr) != -1) {
                        i21 = i12;
                    }
                    if (i19 >= i21 + 1 || i20 != 0 || i14 != 0) {
                        this.zzx = i18;
                        this.zzy = -1;
                    }
                } else {
                    this.zzy = -1;
                }
            }
            int iZzO2 = zzO(i16);
            this.zzn[iZzO2] = j10;
            this.zzk[iZzO2] = j11;
            this.zzl[iZzO2] = i11;
            this.zzm[iZzO2] = i10;
            this.zzo[iZzO2] = zzahsVar;
            this.zzj[iZzO2] = 0;
            zzzm zzzmVar = this.zzc;
            if (zzzmVar.zzf() || !((zzzd) zzzmVar.zzc()).zza.equals(this.zzC)) {
                zzv zzvVar2 = this.zzC;
                if (zzvVar2 == null) {
                    throw null;
                }
                zzzmVar.zzb(this.zzq + this.zzp, new zzzd(zzvVar2, zzur.zzb, null));
            }
            int i22 = this.zzp + 1;
            this.zzp = i22;
            int i23 = this.zzi;
            if (i22 == i23) {
                int i24 = i23 + 1000;
                long[] jArr = new long[i24];
                long[] jArr2 = new long[i24];
                long[] jArr3 = new long[i24];
                int[] iArr = new int[i24];
                int[] iArr2 = new int[i24];
                zzahs[] zzahsVarArr = new zzahs[i24];
                int i25 = this.zzr;
                int i26 = i23 - i25;
                System.arraycopy(this.zzk, i25, jArr2, 0, i26);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i26);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i26);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i26);
                System.arraycopy(this.zzo, this.zzr, zzahsVarArr, 0, i26);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i26);
                int i27 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i26, i27);
                System.arraycopy(this.zzn, 0, jArr3, i26, i27);
                System.arraycopy(this.zzm, 0, iArr, i26, i27);
                System.arraycopy(this.zzl, 0, iArr2, i26, i27);
                System.arraycopy(this.zzo, 0, zzahsVarArr, i26, i27);
                System.arraycopy(this.zzj, 0, jArr, i26, i27);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzahsVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i24;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final boolean zzJ() {
        int i10;
        return this.zzx == -1 && (i10 = this.zzy) != -1 && this.zzq + this.zzs >= i10;
    }

    private final void zzK(zzv zzvVar, zzma zzmaVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzt;
        zzus zzusVar = this.zzd;
        zzmaVar.zzb = zzvVar.zzb(zzusVar.zzb(zzvVar));
        zzmaVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzul zzulVarZza = zzusVar.zza(this.zze, zzvVar);
            this.zzh = zzulVarZza;
            zzmaVar.zza = zzulVarZza;
        }
    }

    private final boolean zzL(int i10) {
        if (this.zzh == null) {
            return true;
        }
        int i11 = this.zzm[i10];
        return false;
    }

    private final int zzM(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzn[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzm[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.zzi) {
                i10 = 0;
            }
        }
        return i12;
    }

    @InterfaceC4326A("this")
    private final long zzN(int i10) {
        long j10 = this.zzv;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzO = zzO(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzn[iZzO]);
                if ((this.zzm[iZzO] & 1) != 0) {
                    break;
                }
                iZzO--;
                if (iZzO == -1) {
                    iZzO = this.zzi - 1;
                }
            }
        }
        this.zzv = Math.max(j10, jMax);
        this.zzp -= i10;
        int i12 = this.zzq + i10;
        this.zzq = i12;
        int i13 = this.zzr + i10;
        this.zzr = i13;
        int i14 = this.zzi;
        if (i13 >= i14) {
            this.zzr = i13 - i14;
        }
        int i15 = this.zzs - i10;
        this.zzs = i15;
        if (i15 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i12);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i16 = this.zzr;
        if (i16 == 0) {
            i16 = this.zzi;
        }
        int i17 = i16 - 1;
        return this.zzk[i17] + ((long) this.zzl[i17]);
    }

    private final int zzO(int i10) {
        int i11 = this.zzr + i10;
        int i12 = this.zzi;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzA(zzv zzvVar) {
        boolean zZzD = zzD(zzvVar);
        zzze zzzeVar = this.zzf;
        if (zzzeVar == null || !zZzD) {
            return;
        }
        zzzeVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ void zzP(long j10) {
        A.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return A.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zzg(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ void zzc(zzeu zzeuVar, int i10) {
        A.c(this, zzeuVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzd(zzeu zzeuVar, int i10, int i11) {
        this.zza.zzh(zzeuVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzahs zzahsVar) {
        if (this.zzA) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzA = false;
            }
        }
        if (this.zzD) {
            if (j10 < this.zzt) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzE) {
                    zzeh.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzC)));
                    this.zzE = true;
                }
                i10 |= 1;
            }
        }
        int i13 = i10;
        zzH(j10, i13, (this.zza.zzf() - ((long) i11)) - ((long) i12), i11, zzahsVar);
    }

    @InterfaceC4335i
    public final void zzf() {
        zzg(true);
        zzG();
    }

    @InterfaceC4335i
    public final void zzg(boolean z10) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = -1;
        this.zzy = -1;
        this.zzA = true;
        this.zzt = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = Long.MIN_VALUE;
        this.zzz = false;
        this.zzc.zze();
        if (z10) {
            this.zzC = null;
            this.zzB = true;
            this.zzD = true;
        }
    }

    public final void zzh(long j10) {
        this.zzt = j10;
    }

    public final synchronized void zzi(long j10) {
        if (this.zzu == Long.MIN_VALUE) {
            return;
        }
        this.zzu = Long.MIN_VALUE;
        this.zzx = -1;
        this.zzy = -1;
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    @InterfaceC4335i
    public final void zzk() {
        zzy();
        zzG();
    }

    @InterfaceC4335i
    public final void zzl() throws IOException {
        zzul zzulVar = this.zzh;
        if (zzulVar != null) {
            throw zzulVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    @Nullable
    public final synchronized zzv zzo() {
        if (this.zzB) {
            return null;
        }
        return this.zzC;
    }

    public final synchronized long zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq() {
        return this.zzz;
    }

    @InterfaceC4335i
    public final synchronized boolean zzr(boolean z10) {
        int i10 = this.zzq + this.zzs;
        int i11 = this.zzx;
        boolean z11 = true;
        if (i11 != -1 && i10 >= i11) {
            return true;
        }
        if (zzI() && !zzJ()) {
            if (((zzzd) this.zzc.zza(i10)).zza != this.zzg) {
                return true;
            }
            return zzL(zzO(this.zzs));
        }
        if (!z10 && !this.zzz) {
            zzv zzvVar = this.zzC;
            if (zzvVar == null) {
                z11 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    @InterfaceC4335i
    public final int zzs(zzma zzmaVar, zziy zziyVar, int i10, boolean z10) {
        boolean z11 = (i10 & 2) != 0;
        zzzb zzzbVar = this.zzb;
        int iZzC = zzC(zzmaVar, zziyVar, z11, z10, zzzbVar);
        if (iZzC != -4) {
            return iZzC;
        }
        if (!zziyVar.zzb()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.zza.zzd(zziyVar, zzzbVar);
                    return -4;
                }
                this.zza.zzc(zziyVar, zzzbVar);
            } else if (i11 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzt(int i10) {
        int i11;
        int i12;
        zzB();
        int i13 = this.zzq;
        if (i10 >= i13 && i10 <= this.zzp + i13 && (((i11 = this.zzx) == -1 || i10 < i11) && ((i12 = this.zzy) == -1 || i10 < i12))) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i10 - i13;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzu(long j10, boolean z10) throws Throwable {
        Throwable th;
        long jMin;
        zzzf zzzfVar;
        long j11;
        int iZzM;
        try {
            try {
                zzB();
                int iZzO = zzO(this.zzs);
                long j12 = this.zzu;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(this.zzw, j12);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    jMin = this.zzw;
                }
                if (zzI() && j10 >= this.zzn[iZzO]) {
                    if (j10 > jMin) {
                        if (z10) {
                            z10 = true;
                        }
                    }
                    if (this.zzD) {
                        iZzM = this.zzp - this.zzs;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= iZzM) {
                                zzzfVar = this;
                                j11 = j10;
                                if (!z10) {
                                    iZzM = -1;
                                }
                            } else {
                                if (this.zzn[iZzO] >= j10) {
                                    j11 = j10;
                                    iZzM = i10;
                                    zzzfVar = this;
                                    break;
                                }
                                iZzO++;
                                if (iZzO == this.zzi) {
                                    iZzO = 0;
                                }
                                i10++;
                            }
                        }
                    } else {
                        zzzfVar = this;
                        j11 = j10;
                        iZzM = zzzfVar.zzM(iZzO, this.zzp - this.zzs, j11, true);
                    }
                    if (iZzM != -1) {
                        zzzfVar.zzt = j11;
                        zzzfVar.zzs += iZzM;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int zzv(long j10, boolean z10) {
        Throwable th;
        try {
            try {
                int i10 = this.zzs;
                int iZzO = zzO(i10);
                if (!zzI() || j10 < this.zzn[iZzO]) {
                    return 0;
                }
                if (j10 <= this.zzw || !z10) {
                    int iZzM = zzM(iZzO, this.zzp - i10, j10, true);
                    if (iZzM == -1) {
                        return 0;
                    }
                    return iZzM;
                }
                try {
                    return this.zzp - i10;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public final synchronized void zzw(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzs + i10 <= this.zzp) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzguk.zza(z10);
        this.zzs += i10;
    }

    public final void zzx(long j10, boolean z10, boolean z11) {
        this.zza.zze(zzE(j10, false, z11));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(@Nullable zzze zzzeVar) {
        this.zzf = zzzeVar;
    }
}
