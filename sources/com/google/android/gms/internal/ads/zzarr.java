package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import k0.C4812c;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarr implements zzagh {
    private final int zza;
    private final List zzb;
    private final zzeu zzc;
    private final SparseIntArray zzd;
    private final zzaru zze;
    private final zzanx zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzarn zzj;
    private zzarm zzk;
    private zzagk zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzarr() {
        this(1, 1, zzanx.zza, new zzfj(0L), new zzaqe(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzagi r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzeu r0 = r6.zzc
            byte[] r0 = r0.zzi()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzi(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.zzf(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarr.zza(com.google.android.gms.internal.ads.zzagi):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        if (this.zza == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.zzf);
        }
        this.zzl = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        long j10;
        long j11;
        long jZzo = zzagiVar.zzo();
        if (this.zzn) {
            if (jZzo != -1) {
                zzarn zzarnVar = this.zzj;
                if (!zzarnVar.zza()) {
                    return zzarnVar.zzb(zzagiVar, zzahhVar, this.zzr);
                }
            }
            if (this.zzo) {
                j10 = -1;
                j11 = 0;
            } else {
                this.zzo = true;
                zzarn zzarnVar2 = this.zzj;
                if (zzarnVar2.zzc() != -9223372036854775807L) {
                    j10 = -1;
                    j11 = 0;
                    zzarm zzarmVar = new zzarm(zzarnVar2.zzd(), zzarnVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzarmVar;
                    this.zzl.zzw(zzarmVar.zza());
                } else {
                    j10 = -1;
                    j11 = 0;
                    this.zzl.zzw(new zzahj(zzarnVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j11, j11);
                if (zzagiVar.zzn() != j11) {
                    zzahhVar.zza = j11;
                    return 1;
                }
            }
            zzarm zzarmVar2 = this.zzk;
            if (zzarmVar2 != null && zzarmVar2.zzc()) {
                return zzarmVar2.zzd(zzagiVar, zzahhVar);
            }
        } else {
            j10 = -1;
        }
        zzeu zzeuVar = this.zzc;
        byte[] bArrZzi = zzeuVar.zzi();
        if (9400 - zzeuVar.zzg() < 188) {
            int iZzd = zzeuVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzeuVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzeuVar.zzb(bArrZzi, iZzd);
        }
        while (zzeuVar.zzd() < 188) {
            int iZze = zzeuVar.zze();
            int iZza = zzagiVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzarw zzarwVar = (zzarw) sparseArray.valueAt(i10);
                    if (zzarwVar instanceof zzara) {
                        zzara zzaraVar = (zzara) zzarwVar;
                        if (zzaraVar.zzd(false)) {
                            zzaraVar.zzc(new zzeu(), 1);
                        }
                    }
                    i10++;
                }
            } else {
                zzeuVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzeuVar.zzg();
        int iZze2 = zzeuVar.zze();
        int iZza2 = zzarx.zza(zzeuVar.zzi(), iZzg, iZze2);
        zzeuVar.zzh(iZza2);
        int i11 = iZza2 + Opcodes.NEWARRAY;
        if (i11 > iZze2) {
            this.zzq = (iZza2 - iZzg) + this.zzq;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzeuVar.zze();
        if (i11 > iZze3) {
            return 0;
        }
        int iZzB = zzeuVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzeuVar.zzh(i11);
            return 0;
        }
        int i12 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i13 = iZzB & 32;
        int i14 = iZzB & 16;
        int i15 = (iZzB >> 8) & C4812c.f214302r;
        zzarw zzarwVar2 = i14 != 0 ? (zzarw) this.zzg.get(i15) : null;
        if (zzarwVar2 == null) {
            zzeuVar.zzh(i11);
            return 0;
        }
        int i16 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i17 = sparseIntArray.get(i15, i16 - 1);
        sparseIntArray.put(i15, i16);
        if (i17 == i16) {
            zzeuVar.zzh(i11);
            return 0;
        }
        if (i16 != ((i17 + 1) & 15)) {
            zzarwVar2.zzb();
        }
        if (i13 != 0) {
            int iZzs = zzeuVar.zzs();
            i12 |= (zzeuVar.zzs() & 64) != 0 ? 2 : 0;
            zzeuVar.zzk(iZzs - 1);
        }
        boolean z10 = this.zzn;
        if (z10 || !this.zzi.get(i15, false)) {
            zzeuVar.zzf(i11);
            zzarwVar2.zzc(zzeuVar, i12);
            zzeuVar.zzf(iZze3);
        }
        if (!z10 && this.zzn && jZzo != j10) {
            this.zzp = true;
        }
        zzeuVar.zzh(i11);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.zzb
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L35
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.zzfj r4 = (com.google.android.gms.internal.ads.zzfj) r4
            long r5 = r4.zzc()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.zza()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.zzd(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L40
            com.google.android.gms.internal.ads.zzarm r10 = r9.zzk
            if (r10 == 0) goto L40
            r10.zzb(r12)
        L40:
            com.google.android.gms.internal.ads.zzeu r10 = r9.zzc
            r10.zza(r0)
            android.util.SparseIntArray r10 = r9.zzd
            r10.clear()
            r10 = r0
        L4b:
            android.util.SparseArray r11 = r9.zzg
            int r12 = r11.size()
            if (r10 >= r12) goto L5f
            java.lang.Object r11 = r11.valueAt(r10)
            com.google.android.gms.internal.ads.zzarw r11 = (com.google.android.gms.internal.ads.zzarw) r11
            r11.zzb()
            int r10 = r10 + 1
            goto L4b
        L5f:
            r9.zzq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarr.zze(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }

    public final /* synthetic */ List zzh() {
        return this.zzb;
    }

    public final /* synthetic */ zzaru zzi() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    public final /* synthetic */ zzagk zzm() {
        return this.zzl;
    }

    public final /* synthetic */ int zzn() {
        return this.zzm;
    }

    public final /* synthetic */ void zzo(int i10) {
        this.zzm = i10;
    }

    public final /* synthetic */ void zzp(boolean z10) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzq(int i10) {
        this.zzr = i10;
    }

    public zzarr(int i10, int i11, zzanx zzanxVar, zzfj zzfjVar, zzaru zzaruVar, int i12) {
        this.zze = zzaruVar;
        this.zza = i11;
        this.zzf = zzanxVar;
        this.zzb = Collections.singletonList(zzfjVar);
        this.zzc = new zzeu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzarn(112800);
        this.zzl = zzagk.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzaruVar.zza();
        int size = sparseArrayZza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArrayZza.keyAt(i13), (zzarw) sparseArrayZza.valueAt(i13));
        }
        this.zzg.put(0, new zzari(new zzaro(this)));
    }
}
