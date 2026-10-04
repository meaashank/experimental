package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes4.dex */
final class zzyu implements zzxm, zzagk, zzaca, zzacf, zzze {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyt zzB;
    private zzahk zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhs zze;
    private final zzus zzf;
    private final zzxy zzg;
    private final zzun zzh;
    private final zzym zzi;
    private final zzabp zzj;
    private final long zzk;
    private final long zzl;
    private final zzyh zzn;

    @Nullable
    private zzxl zzs;

    @Nullable
    private zzajo zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzaci zzm = new zzaci("ProgressiveMediaPeriod");
    private final zzdt zzo = new zzdt(zzdp.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyq
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfm.zzd(null);
    private zzys[] zzw = new zzys[0];
    private zzzf[] zzv = new zzzf[0];
    private zzyk[] zzu = new zzyk[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzQ();
    }

    public zzyu(Uri uri, zzhs zzhsVar, zzyh zzyhVar, zzus zzusVar, zzun zzunVar, zzabz zzabzVar, zzxy zzxyVar, zzym zzymVar, zzabp zzabpVar, @Nullable String str, int i10, boolean z10, int i11, @Nullable zzv zzvVar, long j10, @Nullable zzaco zzacoVar) {
        this.zzd = uri;
        this.zze = zzhsVar;
        this.zzf = zzusVar;
        this.zzh = zzunVar;
        this.zzg = zzxyVar;
        this.zzi = zzymVar;
        this.zzj = zzabpVar;
        this.zzk = i10;
        this.zzn = zzyhVar;
        this.zzl = j10;
    }

    private final void zzR(int i10) {
        zzaa();
        zzyt zzytVar = this.zzB;
        boolean[] zArr = zzytVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzv zzvVarZza = zzytVar.zza.zza(i10).zza(0);
        this.zzg.zzh(new zzxk(1, zzas.zzf(zzvVarZza.zzp), zzvVarZza, 0, null, zzfm.zzs(this.zzL), -9223372036854775807L));
        zArr[i10] = true;
    }

    private final void zzS(int i10) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i10]) && !this.zzv[i10].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzzf zzzfVar : this.zzv) {
                    zzzfVar.zzg(false);
                }
                zzxl zzxlVar = this.zzs;
                zzxlVar.getClass();
                zzxlVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzaht zzU(zzys zzysVar) {
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzysVar.equals(this.zzw[i10])) {
                return this.zzv[i10];
            }
        }
        if (this.zzx) {
            int i11 = zzysVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i11);
            sb2.append(") after finishing tracks.");
            zzeh.zzc("ProgressiveMediaPeriod", sb2.toString());
            return new zzage();
        }
        zzzf zzzfVar = new zzzf(this.zzj, this.zzf, this.zzh);
        zzyk zzykVar = new zzyk(zzzfVar);
        zzzfVar.zzz(this);
        int i12 = length + 1;
        zzys[] zzysVarArr = (zzys[]) Arrays.copyOf(this.zzw, i12);
        zzysVarArr[length] = zzysVar;
        String str = zzfm.zza;
        this.zzw = zzysVarArr;
        zzzf[] zzzfVarArr = (zzzf[]) Arrays.copyOf(this.zzv, i12);
        zzzfVarArr[length] = zzzfVar;
        this.zzv = zzzfVarArr;
        zzyk[] zzykVarArr = (zzyk[]) Arrays.copyOf(this.zzu, i12);
        zzykVarArr[length] = zzykVar;
        this.zzu = zzykVarArr;
        return zzykVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i10;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzzf zzzfVar : this.zzv) {
            if (zzzfVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            zzv zzvVarZzo = this.zzv[i13].zzo();
            zzvVarZzo.getClass();
            int iZzf = zzas.zzf(zzvVarZzo.zzp);
            int iZzab = zzab(iZzf);
            int iZzab2 = zzab(i11);
            if (iZzab > iZzab2) {
                i11 = iZzf;
            }
            if (iZzab > iZzab2) {
                i12 = i13;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i14 = 0; i14 < length; i14++) {
            zzv zzvVarZzo2 = this.zzv[i14].zzo();
            zzvVarZzo2.getClass();
            String str = zzvVarZzo2.zzp;
            boolean zZza = zzas.zza(str);
            boolean z10 = zZza || zzas.zzb(str);
            zArr[i14] = z10;
            this.zzz = z10 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzajo zzajoVar = this.zzt;
            if (zzajoVar != null) {
                if (zZza || this.zzw[i14].zzb) {
                    zzap zzapVar = zzvVarZzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzajoVar) : zzapVar.zzg(zzajoVar);
                    zzt zztVarZza = zzvVarZzo2.zza();
                    zztVarZza.zzl(zzapVar2);
                    zzvVarZzo2 = zztVarZza.zzQ();
                }
                if (zZza && zzvVarZzo2.zzh == -1 && zzvVarZzo2.zzi == -1 && (i10 = zzajoVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzo2.zza();
                    zztVarZza2.zzi(i10);
                    zzvVarZzo2 = zztVarZza2.zzQ();
                }
            }
            zzv zzvVarZzb = zzvVarZzo2.zzb(this.zzf.zzb(zzvVarZzo2));
            if (i14 != i12) {
                zzt zztVarZza3 = zzvVarZzb.zza();
                zztVarZza3.zzm(Integer.toString(i12));
                zzvVarZzb = zztVarZza3.zzQ();
            }
            zzbgVarArr[i14] = new zzbg(Integer.toString(i14), zzvVarZzb);
            this.zzI = zzvVarZzb.zzv | this.zzI;
            this.zzv[i14].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyt(new zzzr(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzyi(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzxl zzxlVar = this.zzs;
        zzxlVar.getClass();
        zzxlVar.zzp(this);
    }

    private final void zzW() {
        zzyl zzylVar = new zzyl(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzguk.zzi(zzZ());
            long j10 = this.zzD;
            if (j10 != -9223372036854775807L && this.zzM > j10) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzahk zzahkVar = this.zzC;
            zzahkVar.getClass();
            zzylVar.zzd(zzahkVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzzf zzzfVar : this.zzv) {
                zzzfVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzylVar, this, zzabz.zza(this.zzF));
    }

    private final int zzX() {
        int iZzj = 0;
        for (zzzf zzzfVar : this.zzv) {
            iZzj += zzzfVar.zzj();
        }
        return iZzj;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzY(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzzf[] r3 = r5.zzv
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzyt r4 = r5.zzB
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzp()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzY(boolean):long");
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzguk.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ void zzA(zzace zzaceVar, long j10, long j11, boolean z10) {
        zzyl zzylVar = (zzyl) zzaceVar;
        zzip zzipVarZzf = zzylVar.zzf();
        zzxf zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzipVarZzf.zzg(), zzipVarZzf.zzh(), j10, j11, zzipVarZzf.zzf());
        zzylVar.zze();
        this.zzg.zzf(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)));
        if (z10) {
            return;
        }
        for (zzzf zzzfVar : this.zzv) {
            zzzfVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzxl zzxlVar = this.zzs;
            zzxlVar.getClass();
            zzxlVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ void zzB(zzace zzaceVar, long j10, long j11) {
        zzyl zzylVar = (zzyl) zzaceVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j12 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j12;
            this.zzi.zzb(j12, this.zzC, this.zzE);
        }
        zzip zzipVarZzf = zzylVar.zzf();
        zzxf zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzipVarZzf.zzg(), zzipVarZzf.zzh(), j10, j11, zzipVarZzf.zzf());
        zzylVar.zze();
        this.zzg.zze(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)));
        this.zzP = true;
        zzxl zzxlVar = this.zzs;
        zzxlVar.getClass();
        zzxlVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ void zzC(zzace zzaceVar, long j10, long j11, int i10) {
        zzxf zzxfVar;
        zzyl zzylVar = (zzyl) zzaceVar;
        zzip zzipVarZzf = zzylVar.zzf();
        if (i10 == 0) {
            long jZze = zzylVar.zze();
            zzhw zzhwVarZzh = zzylVar.zzh();
            zzxfVar = new zzxf(jZze, zzhwVarZzh, zzhwVarZzh.zza, Collections.EMPTY_MAP, j10, 0L, 0L);
        } else {
            zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzipVarZzf.zzg(), zzipVarZzf.zzh(), j10, j11, zzipVarZzf.zzf());
        }
        this.zzg.zzd(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)), i10);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzxl zzxlVar = this.zzs;
        zzxlVar.getClass();
        zzxlVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzahk zzahkVar) {
        this.zzC = this.zzt == null ? zzahkVar : new zzahj(-9223372036854775807L, 0L);
        this.zzD = zzahkVar.zza();
        boolean z10 = false;
        if (!this.zzK && zzahkVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzE = z10;
        this.zzF = true == z10 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzahkVar, z10);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    public final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    public final /* synthetic */ long zzI(boolean z10) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzk;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    public final /* synthetic */ zzajo zzO() {
        return this.zzt;
    }

    public final /* synthetic */ void zzP(zzajo zzajoVar) {
        this.zzt = zzajoVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzzf zzzfVar : this.zzv) {
                zzzfVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzyt zzytVar = this.zzB;
                if (zzytVar.zzb[i10] && zzytVar.zzc[i10] && !this.zzv[i10].zzq()) {
                    jZzY = Math.min(jZzY, this.zzv[i10].zzp());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzL : jZzY;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        if (this.zzP) {
            return false;
        }
        zzaci zzaciVar = this.zzm;
        if (zzaciVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzaciVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzg() {
        for (zzzf zzzfVar : this.zzv) {
            zzzfVar.zzf();
        }
        this.zzn.zzb();
    }

    public final boolean zzh(int i10) {
        return !zzT() && this.zzv[i10].zzr(this.zzP);
    }

    public final void zzi(int i10) throws IOException {
        this.zzv[i10].zzl();
        zzj();
    }

    public final void zzj() throws IOException {
        this.zzm.zzh(zzabz.zza(this.zzF));
    }

    public final int zzk(int i10, zzma zzmaVar, zziy zziyVar, int i11) {
        if (zzT()) {
            return -3;
        }
        zzR(i10);
        int iZzs = this.zzv[i10].zzs(zzmaVar, zziyVar, i11, this.zzP);
        if (iZzs == -3) {
            zzS(i10);
        }
        return iZzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(zzxl zzxlVar, long j10) {
        this.zzs = zzxlVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() throws IOException {
        zzj();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzo(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j10) {
        zzabe zzabeVar;
        zzaa();
        zzyt zzytVar = this.zzB;
        zzzr zzzrVar = zzytVar.zza;
        boolean[] zArr3 = zzytVar.zzc;
        int i10 = this.zzJ;
        int i11 = 0;
        for (int i12 = 0; i12 < zzabeVarArr.length; i12++) {
            zzzg zzzgVar = zzzgVarArr[i12];
            if (zzzgVar != null && (zzabeVarArr[i12] == null || !zArr[i12])) {
                int iZze = ((zzyr) zzzgVar).zze();
                zzguk.zzi(zArr3[iZze]);
                this.zzJ--;
                zArr3[iZze] = false;
                zzzgVarArr[i12] = null;
            }
        }
        boolean z10 = !this.zzG ? j10 == 0 || this.zzA : i10 != 0;
        for (int i13 = 0; i13 < zzabeVarArr.length; i13++) {
            if (zzzgVarArr[i13] == null && (zzabeVar = zzabeVarArr[i13]) != null) {
                zzguk.zzi(zzabeVar.zze() == 1);
                zzguk.zzi(zzabeVar.zzf(0) == 0);
                int iZzb = zzzrVar.zzb(zzabeVar.zza());
                zzguk.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzabeVar.zzc().zzv | this.zzI;
                zzzgVarArr[i13] = new zzyr(this, iZzb);
                zArr2[i13] = true;
                if (!z10) {
                    zzzf zzzfVar = this.zzv[iZzb];
                    z10 = (zzzfVar.zzn() == 0 || zzzfVar.zzu(j10, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzaci zzaciVar = this.zzm;
            if (zzaciVar.zze()) {
                zzzf[] zzzfVarArr = this.zzv;
                int length = zzzfVarArr.length;
                while (i11 < length) {
                    zzzfVarArr[i11].zzy();
                    i11++;
                }
                zzaciVar.zzf();
            } else {
                this.zzP = false;
                for (zzzf zzzfVar2 : this.zzv) {
                    zzzfVar2.zzg(false);
                }
            }
        } else if (z10) {
            j10 = zzt(j10);
            while (i11 < zzzgVarArr.length) {
                if (zzzgVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.zzG = true;
        return j10;
    }

    public final int zzp(int i10, long j10) {
        if (zzT()) {
            return 0;
        }
        zzR(i10);
        zzzf zzzfVar = this.zzv[i10];
        int iZzv = zzzfVar.zzv(j10, this.zzP);
        zzzfVar.zzw(iZzv);
        if (iZzv != 0) {
            return iZzv;
        }
        zzS(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j10, boolean z10) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzv[i10].zzx(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht zzs(int i10, int i11) {
        return zzU(new zzys(i10, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzt(long r9) {
        /*
            r8 = this;
            r8.zzaa()
            com.google.android.gms.internal.ads.zzyt r0 = r8.zzB
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzahk r1 = r8.zzC
            boolean r1 = r1.zzb()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.zzH = r1
            long r2 = r8.zzL
            r8.zzL = r9
            boolean r4 = r8.zzZ()
            if (r4 == 0) goto L22
            r8.zzM = r9
            return r9
        L22:
            int r4 = r8.zzF
            r5 = 7
            if (r4 == r5) goto L73
            boolean r4 = r8.zzP
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.zzaci r4 = r8.zzm
            boolean r4 = r4.zze()
            if (r4 == 0) goto L73
        L33:
            com.google.android.gms.internal.ads.zzzf[] r4 = r8.zzv
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto La5
            com.google.android.gms.internal.ads.zzzf[] r6 = r8.zzv
            r6 = r6[r5]
            com.google.android.gms.internal.ads.zzyk[] r7 = r8.zzu
            r7 = r7[r5]
            boolean r7 = r7.zzf()
            if (r7 != 0) goto L48
            goto L70
        L48:
            int r7 = r6.zzn()
            if (r7 != 0) goto L52
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L70
        L52:
            boolean r7 = r8.zzA
            if (r7 == 0) goto L5f
            int r7 = r6.zzm()
            boolean r6 = r6.zzt(r7)
            goto L65
        L5f:
            boolean r7 = r8.zzP
            boolean r6 = r6.zzu(r9, r7)
        L65:
            if (r6 != 0) goto L70
            boolean r6 = r0[r5]
            if (r6 != 0) goto L73
            boolean r6 = r8.zzz
            if (r6 != 0) goto L70
            goto L73
        L70:
            int r5 = r5 + 1
            goto L37
        L73:
            r8.zzN = r1
            r8.zzM = r9
            r8.zzP = r1
            r8.zzI = r1
            com.google.android.gms.internal.ads.zzaci r0 = r8.zzm
            boolean r2 = r0.zze()
            if (r2 == 0) goto L94
            com.google.android.gms.internal.ads.zzzf[] r2 = r8.zzv
            int r3 = r2.length
        L86:
            if (r1 >= r3) goto L90
            r4 = r2[r1]
            r4.zzy()
            int r1 = r1 + 1
            goto L86
        L90:
            r0.zzf()
            return r9
        L94:
            r0.zzc()
            com.google.android.gms.internal.ads.zzzf[] r0 = r8.zzv
            int r2 = r0.length
            r3 = r1
        L9b:
            if (r3 >= r2) goto La5
            r4 = r0[r3]
            r4.zzg(r1)
            int r3 = r3 + 1
            goto L9b
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzt(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzu(long r13, com.google.android.gms.internal.ads.zznm r15) {
        /*
            r12 = this;
            r12.zzaa()
            com.google.android.gms.internal.ads.zzahk r0 = r12.zzC
            boolean r0 = r0.zzb()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            com.google.android.gms.internal.ads.zzahk r0 = r12.zzC
            com.google.android.gms.internal.ads.zzahi r0 = r0.zzc(r13)
            com.google.android.gms.internal.ads.zzahl r3 = r0.zza
            com.google.android.gms.internal.ads.zzahl r0 = r0.zzb
            long r4 = r15.zzd
            int r15 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r15 != 0) goto L1f
            return r13
        L1f:
            java.lang.String r15 = com.google.android.gms.internal.ads.zzfm.zza
            long r6 = r13 - r4
            long r4 = r4 ^ r13
            long r8 = r13 ^ r6
            int r15 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r15 < 0) goto L2e
            r15 = r8
            goto L2f
        L2e:
            r15 = r9
        L2f:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L35
            r1 = r8
            goto L36
        L35:
            r1 = r9
        L36:
            r15 = r15 | r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r15 == 0) goto L40
            r4 = r6
            goto L48
        L40:
            r15 = 63
            long r4 = r6 >>> r15
            r10 = 1
            long r4 = r4 ^ r10
            long r4 = r4 + r1
        L48:
            r10 = -9223372036854775808
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 != 0) goto L56
            int r15 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r15 != 0) goto L54
            r6 = r10
            goto L56
        L54:
            r4 = r10
            goto L60
        L56:
            int r15 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r15 != 0) goto L60
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 == 0) goto L5f
            goto L54
        L5f:
            r4 = r1
        L60:
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 != 0) goto L67
            if (r15 != 0) goto L70
            goto L68
        L67:
            r10 = r13
        L68:
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 != 0) goto L6f
            int r15 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            goto L70
        L6f:
            r1 = r13
        L70:
            long r6 = r3.zzb
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 > 0) goto L7c
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 > 0) goto L7c
            r15 = r8
            goto L7d
        L7c:
            r15 = r9
        L7d:
            long r10 = r0.zzb
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L88
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L88
            goto L89
        L88:
            r8 = r9
        L89:
            if (r15 == 0) goto L9e
            if (r8 == 0) goto L9e
            long r0 = r6 - r13
            long r13 = r10 - r13
            long r0 = java.lang.Math.abs(r0)
            long r13 = java.lang.Math.abs(r13)
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 > 0) goto La3
            goto La0
        L9e:
            if (r15 == 0) goto La1
        La0:
            return r6
        La1:
            if (r8 == 0) goto La4
        La3:
            return r10
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzu(long, com.google.android.gms.internal.ads.zznm):long");
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzw(final zzahk zzahkVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzahkVar);
            }
        });
    }

    public final zzaht zzx() {
        return zzU(new zzys(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ zzacc zzz(zzace zzaceVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zzacc zzaccVarZza;
        zzahk zzahkVar;
        zzyl zzylVar = (zzyl) zzaceVar;
        zzip zzipVarZzf = zzylVar.zzf();
        zzxf zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzipVarZzf.zzg(), zzipVarZzf.zzh(), j10, j11, zzipVarZzf.zzf());
        zzylVar.zzg();
        String str = zzfm.zza;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzig) || (cause instanceof zzach) || ((cause instanceof zzht) && ((zzht) cause).zza == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzaccVarZza = zzaci.zzb;
        } else {
            int iZzX = zzX();
            boolean z10 = iZzX > this.zzO;
            if (this.zzK || !((zzahkVar = this.zzC) == null || zzahkVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z11 = this.zzy;
                if (!z11 || zzT()) {
                    this.zzH = z11;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzzf zzzfVar : this.zzv) {
                        zzzfVar.zzg(false);
                    }
                    zzylVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzaccVarZza = zzaci.zza;
                }
            }
            zzaccVarZza = zzaci.zza(z10, jMin);
        }
        boolean zZza = zzaccVarZza.zza();
        this.zzg.zzg(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)), iOException, !zZza);
        if (!zZza) {
            zzylVar.zze();
        }
        return zzaccVarZza;
    }
}
