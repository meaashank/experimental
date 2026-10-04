package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1709v0;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.Scopes;
import e.InterfaceC4335i;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadn extends zzvz implements zzaec {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private int zzE;
    private int zzF;

    @Nullable
    private zznl zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private int zzK;
    private long zzL;
    private zzbv zzM;

    @Nullable
    private zzbv zzN;
    private int zzO;
    private int zzP;

    @Nullable
    private zzaea zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final Context zze;
    private final boolean zzf;
    private final zzaex zzg;
    private final boolean zzh;
    private final zzaed zzi;
    private final zzaeb zzj;
    private final zzadf zzk;

    @Nullable
    private final zzact zzl;
    private final long zzm;

    @Nullable
    private final zzaee zzn;
    private final PriorityQueue zzo;
    private zzadl zzp;
    private boolean zzq;
    private boolean zzr;
    private zzafd zzs;
    private boolean zzt;
    private int zzu;
    private List zzv;

    @Nullable
    private Surface zzw;

    @Nullable
    private zzadp zzx;
    private zzev zzy;
    private boolean zzz;

    public zzadn(zzadk zzadkVar) {
        super(zzadkVar.zze().getApplicationContext(), 2, zzadkVar.zzg(), zzadkVar.zzf(), false, 0.0f);
        Context applicationContext = zzadkVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzs = null;
        this.zzg = new zzaex(zzadkVar.zzh(), zzadkVar.zzi());
        this.zzf = this.zzs == null;
        zzaed zzaedVar = new zzaed(applicationContext, this, 0L);
        this.zzi = zzaedVar;
        zzaedVar.zza(50000L);
        this.zzj = new zzaeb();
        this.zzk = new zzadf(new zzadd() { // from class: com.google.android.gms.internal.ads.zzadm
            @Override // com.google.android.gms.internal.ads.zzadd
            public final /* synthetic */ void zza(float f10) {
                this.zza.zzbq(f10);
            }
        });
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzy = zzev.zza;
        this.zzA = 1;
        this.zzB = 0;
        this.zzM = zzbv.zza;
        this.zzP = 0;
        this.zzN = null;
        this.zzO = -1000;
        this.zzR = -9223372036854775807L;
        this.zzl = new zzact();
        this.zzo = new PriorityQueue();
        this.zzm = -15000L;
        this.zzn = new zzaee(1.0f);
        this.zzG = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzay(com.google.android.gms.internal.ads.zzvs r11, com.google.android.gms.internal.ads.zzv r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.zzay(com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzv):int");
    }

    private final boolean zzbA(zzvs zzvsVar) {
        if (this.zzs != null) {
            return true;
        }
        Surface surface = this.zzw;
        return (surface != null && surface.isValid()) || zzbu(zzvsVar) || zzaE(zzvsVar);
    }

    @Nullable
    private final Surface zzbB(zzvs zzvsVar) {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            return zzafdVar.zzk();
        }
        Surface surface = this.zzw;
        if (surface != null) {
            return surface;
        }
        if (zzbu(zzvsVar)) {
            return null;
        }
        zzguk.zzi(zzaE(zzvsVar));
        zzadp zzadpVar = this.zzx;
        if (zzadpVar != null) {
            if (zzadpVar.zza != zzvsVar.zzf) {
                zzbC();
            }
        }
        if (this.zzx == null) {
            this.zzx = zzadp.zzb(this.zze, zzvsVar.zzf);
        }
        return this.zzx;
    }

    private final void zzbC() {
        zzadp zzadpVar = this.zzx;
        if (zzadpVar != null) {
            zzadpVar.release();
            this.zzx = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* JADX INFO: renamed from: zzbD, reason: merged with bridge method [inline-methods] */
    public final void zzbr() {
        this.zzg.zzg(this.zzw);
        this.zzz = true;
    }

    private final void zzbE() {
        zzbv zzbvVar = this.zzN;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    public static int zzbo(zzvs zzvsVar, zzv zzvVar) {
        int i10 = zzvVar.zzq;
        if (i10 == -1) {
            return zzay(zzvsVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzbt(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.zzbt(java.lang.String):boolean");
    }

    public static final boolean zzbu(zzvs zzvsVar) {
        return Build.VERSION.SDK_INT >= 35 && zzvsVar.zzh;
    }

    private static List zzbv(Context context, zzwb zzwbVar, zzv zzvVar, boolean z10, boolean z11) throws zzwd {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgxm.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadj.zza(context)) {
            List listZzd = zzwl.zzd(zzwbVar, zzvVar, z10, z11);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzwl.zzc(zzwbVar, zzvVar, z10, z11);
    }

    private final void zzbw(@Nullable Object obj) throws zzjn {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzw == surface) {
            if (surface != null) {
                zzbE();
                Surface surface2 = this.zzw;
                if (surface2 == null || !this.zzz) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzw = surface;
        if (this.zzs == null) {
            this.zzi.zze(surface);
        }
        this.zzz = false;
        int iZze = zze();
        zzvp zzvpVarZzaK = zzaK();
        if (zzvpVarZzaK != null && this.zzs == null) {
            zzvs zzvsVarZzaN = zzaN();
            zzvsVarZzaN.getClass();
            if (!zzbA(zzvsVarZzaN) || this.zzq) {
                zzaO();
                zzaG();
            } else {
                Surface surfaceZzbB = zzbB(zzvsVarZzaN);
                if (surfaceZzbB != null) {
                    zzvpVarZzaK.zzn(surfaceZzbB);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvpVarZzaK.zzo();
                }
            }
        }
        if (surface != null) {
            zzbE();
        } else {
            this.zzN = null;
            zzafd zzafdVar = this.zzs;
            if (zzafdVar != null) {
                zzafdVar.zzq();
            }
        }
        if (iZze == 2) {
            zzafd zzafdVar2 = this.zzs;
            if (zzafdVar2 != null) {
                zzafdVar2.zzw(true);
            } else {
                this.zzi.zzk(true);
            }
        }
    }

    private final boolean zzbx(zziy zziyVar) {
        if (zzcW() || zziyVar.zzd() || zzP() == -9223372036854775807L) {
            return true;
        }
        return zzP() - (zziyVar.zzd - zzbi()) <= 100000;
    }

    private final boolean zzby(zziy zziyVar) {
        return zziyVar.zzd < zzH();
    }

    private final void zzbz(long j10, long j11, zzv zzvVar) {
        zzaea zzaeaVar = this.zzQ;
        if (zzaeaVar != null) {
            zzaeaVar.zzcS(j10, j11, zzvVar, zzaM());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void zzA(long j10, boolean z10, boolean z11) throws zzjn {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null && !z10) {
            zzafdVar.zzg(true);
        }
        if (z11) {
            this.zzH = j10;
        }
        super.zzA(j10, z10, z11);
        if (this.zzs == null) {
            this.zzi.zzm();
        }
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
        if (z10) {
            zzafd zzafdVar2 = this.zzs;
            if (zzafdVar2 != null) {
                zzafdVar2.zzw(false);
            } else {
                this.zzi.zzk(false);
            }
        }
        this.zzE = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzB() {
        this.zzD = 0;
        this.zzC = zzM().zzb();
        this.zzJ = 0L;
        this.zzK = 0;
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zza();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzC() {
        if (this.zzD > 0) {
            long jZzb = zzM().zzb();
            this.zzg.zzd(this.zzD, jZzb - this.zzC);
            this.zzD = 0;
            this.zzC = jZzb;
        }
        int i10 = this.zzK;
        if (i10 != 0) {
            this.zzg.zze(this.zzJ, i10);
            this.zzJ = 0L;
            this.zzK = 0;
        }
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzb();
        } else {
            this.zzi.zzd();
        }
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void zzD() {
        this.zzN = null;
        this.zzz = false;
        this.zzI = true;
        try {
            super.zzD();
        } finally {
            zzaex zzaexVar = this.zzg;
            zzaexVar.zzi(((zzvz) this).zza);
            zzaexVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzt = false;
            this.zzR = -9223372036854775807L;
            zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzF() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null || !this.zzf) {
            return;
        }
        zzafdVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final String zzV() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzne
    public final boolean zzX(long j10) {
        if (zzbh() == -9223372036854775807L || j10 < this.zzH) {
            return false;
        }
        long jZzba = zzba();
        return jZzba == -9223372036854775807L || j10 > jZzba;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzne
    public final void zzY(float f10, float f11) throws zzjn {
        super.zzY(f10, f11);
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzm(f10);
        } else {
            this.zzi.zzo(f10);
        }
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzc(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzne
    public final void zzZ() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null) {
            this.zzi.zzi();
            return;
        }
        int i10 = this.zzu;
        if (i10 == 0 || i10 == 1) {
            this.zzu = 0;
        } else {
            zzafdVar.zzt();
        }
    }

    public final void zzaA(zzvp zzvpVar, int i10, long j10) {
        Trace.beginSection("dropVideoBuffer");
        zzvpVar.zzc(i10, false);
        Trace.endSection();
        zzaB(0, 1);
    }

    public final void zzaB(int i10, int i11) {
        zzje zzjeVar = ((zzvz) this).zza;
        zzjeVar.zzh += i10;
        int i12 = i10 + i11;
        zzjeVar.zzg += i12;
        this.zzD += i12;
        int i13 = this.zzE + i12;
        this.zzE = i13;
        zzjeVar.zzi = Math.max(i13, zzjeVar.zzi);
    }

    public final void zzaC(long j10) {
        zzje zzjeVar = ((zzvz) this).zza;
        zzjeVar.zzk += j10;
        zzjeVar.zzl++;
        this.zzJ += j10;
        this.zzK++;
    }

    public final void zzaD(zzvp zzvpVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzvpVar.zzd(i10, j11);
        Trace.endSection();
        ((zzvz) this).zza.zze++;
        this.zzE = 0;
        if (this.zzs == null) {
            zzbv zzbvVar = this.zzM;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzN)) {
                this.zzN = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzg() || this.zzw == null) {
                return;
            }
            zzbr();
        }
    }

    public final boolean zzaE(zzvs zzvsVar) {
        if (zzbt(zzvsVar.zza)) {
            return false;
        }
        return !zzvsVar.zzf || zzadp.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzaI(zzvs zzvsVar) {
        return zzbA(zzvsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzaQ() {
        zzvs zzvsVarZzaN = zzaN();
        if (this.zzs != null && zzvsVarZzaN != null) {
            String str = zzvsVarZzaN.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.zzaQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaR() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzv r0 = r12.zzaL()
            long r1 = r12.zzP()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r8 = r8 + r1
            long r10 = r12.zzbi()
            long r10 = r10 + r1
            long r1 = r12.zzaS()
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zznl r2 = r12.zzG
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzI
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzr
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzbg()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.zzaR():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @InterfaceC4335i
    public final void zzaT() {
        super.zzaT();
        this.zzo.clear();
        this.zzF = 0;
        this.zzT = 0;
        this.zzI = false;
        zzact zzactVar = this.zzl;
        if (zzactVar != null) {
            zzactVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvr zzaV(Throwable th, @Nullable zzvs zzvsVar) {
        return new zzadg(th, zzvsVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @InterfaceC4335i
    public final boolean zzaW(zzv zzvVar) throws zzjn {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null || zzafdVar.zze()) {
            return true;
        }
        try {
            zzafdVar.zzd(zzvVar);
            return true;
        } catch (zzafc e10) {
            throw zzQ(e10, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @InterfaceC4335i
    public final void zzaX(zziy zziyVar) throws zzjn {
        ByteBuffer byteBuffer;
        zzi zziVar;
        zzvs zzvsVarZzaN = zzaN();
        zzvsVarZzaN.getClass();
        if (zzvsVarZzaN.zzb.equals("video/av01") && (byteBuffer = zziyVar.zzc) != null) {
            zzv zzvVarZzaL = zzaL();
            if (zzvVarZzaL != null && (zziVar = zzvVarZzaL.zzG) != null && zziVar.zzf > 8) {
                zzacs.zza(byteBuffer);
            }
            zzact zzactVar = this.zzl;
            if (zzactVar != null && zziyVar.zzc()) {
                zzactVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int iZzaY = zzaY(zziyVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaY & 32) == 0) {
            this.zzF++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final int zzaY(zziy zziyVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzG == null || !zzby(zziyVar) || zzbx(zziyVar)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaZ(com.google.android.gms.internal.ads.zziy r9) {
        /*
            r8 = this;
            boolean r0 = r8.zzbx(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.zzby(r9)
            com.google.android.gms.internal.ads.zzaee r2 = r8.zzn
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.zzd
            long r4 = r2.zzb(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.zzm
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.zze()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.zzf()
            if (r2 == 0) goto L40
            r9.zza()
        L3e:
            r1 = r3
            goto L96
        L40:
            com.google.android.gms.internal.ads.zzact r2 = r8.zzl
            if (r2 == 0) goto L96
            com.google.android.gms.internal.ads.zzvs r4 = r8.zzaN()
            r4.getClass()
            java.lang.String r4 = r4.zzb
            java.lang.String r5 = "video/av01"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L96
            java.nio.ByteBuffer r4 = r9.zzc
            if (r4 == 0) goto L96
            if (r0 != 0) goto L5f
            int r5 = r8.zzT
            if (r5 > 0) goto L61
        L5f:
            r5 = r3
            goto L62
        L61:
            r5 = r1
        L62:
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()
            r4.flip()
            int r2 = r2.zza(r4, r5)
            if (r2 != 0) goto L73
            r9.zza()
            goto L3e
        L73:
            int r5 = r4.limit()
            if (r2 == r5) goto L96
            com.google.android.gms.internal.ads.zzadl r5 = r8.zzp
            r5.getClass()
            int r5 = r5.zzc
            int r5 = r5 + r2
            int r4 = r4.capacity()
            if (r5 >= r4) goto L96
            boolean r4 = r9.zzk()
            if (r4 != 0) goto L96
            java.nio.ByteBuffer r1 = r9.zzc
            r1.getClass()
            r1.position(r2)
            goto L3e
        L96:
            if (r1 == 0) goto Lb2
            if (r0 == 0) goto La2
            com.google.android.gms.internal.ads.zzje r0 = r8.zza
            int r2 = r0.zzd
            int r2 = r2 + r3
            r0.zzd = r2
            goto La7
        La2:
            int r0 = r8.zzT
            int r0 = r0 + r3
            r8.zzT = r0
        La7:
            java.util.PriorityQueue r0 = r8.zzo
            long r2 = r9.zzd
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r0.add(r9)
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.zzaZ(com.google.android.gms.internal.ads.zziy):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    @InterfaceC4335i
    public final void zzaa(long j10, long j11) throws Throwable {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            try {
                zzafdVar.zzv(j10, j11);
            } catch (zzafc e10) {
                throw zzQ(e10, e10.zza, false, 7001);
            }
        }
        super.zzaa(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean zzab() {
        boolean zZzbc = zzbc();
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            return zzafdVar.zzh(zZzbc);
        }
        if (zZzbc && zzaK() == null) {
            return true;
        }
        return this.zzi.zzj(zZzbc);
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean zzac() {
        if (!super.zzac()) {
            return false;
        }
        zzafd zzafdVar = this.zzs;
        return zzafdVar == null || zzafdVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final int zzaf(zzwb zzwbVar, zzv zzvVar) throws zzwd {
        boolean z10;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i10 = 0;
        boolean z11 = zzvVar.zzt != null;
        List listZzbv = zzbv(context, zzwbVar, zzvVar, z11, false);
        if (z11 && listZzbv.isEmpty()) {
            listZzbv = zzbv(context, zzwbVar, zzvVar, false, false);
        }
        if (listZzbv.isEmpty()) {
            return 129;
        }
        if (!zzvz.zzbl(zzvVar)) {
            return 130;
        }
        zzvs zzvsVar = (zzvs) listZzbv.get(0);
        boolean zZzc = zzvsVar.zzc(context, zzvVar);
        if (zZzc) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listZzbv.size(); i11++) {
                zzvs zzvsVar2 = (zzvs) listZzbv.get(i11);
                if (zzvsVar2.zzc(context, zzvVar)) {
                    zZzc = true;
                    z10 = false;
                    zzvsVar = zzvsVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = true != zZzc ? 3 : 4;
        int i13 = true != zzvsVar.zze(zzvVar) ? 8 : 16;
        int i14 = true != zzvsVar.zzg ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadj.zza(context)) {
            i15 = 256;
        }
        if (zZzc) {
            List listZzbv2 = zzbv(context, zzwbVar, zzvVar, z11, true);
            if (!listZzbv2.isEmpty()) {
                zzvs zzvsVar3 = (zzvs) zzwl.zze(context, listZzbv2, zzvVar).get(0);
                if (zzvsVar3.zzc(context, zzvVar) && zzvsVar3.zze(zzvVar)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final List zzag(zzwb zzwbVar, zzv zzvVar, boolean z10) throws zzwd {
        Context context = this.zze;
        return zzwl.zze(context, zzbv(context, zzwbVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzai(zzvs zzvsVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f10) {
        zzadl zzadlVar;
        Point pointZzi;
        int i10;
        int i11;
        int i12;
        boolean z10;
        zzv[] zzvVarArr;
        byte b10;
        boolean z11;
        Pair pairZze;
        int iZzay;
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbo = zzbo(zzvsVar, zzvVar);
        int i13 = zzvVar.zzx;
        int i14 = zzvVar.zzw;
        if (length == 1) {
            if (iZzbo != -1 && (iZzay = zzay(zzvsVar, zzvVar)) != -1) {
                iZzbo = Math.min((int) (iZzbo * 1.5f), iZzay);
            }
            zzadlVar = new zzadl(i14, i13, iZzbo);
        } else {
            int iMax = i13;
            int iMax2 = i14;
            int i15 = 0;
            boolean z12 = false;
            while (i15 < length) {
                zzv zzvVarZzQ = zzvVarArrZzJ[i15];
                zzi zziVar = zzvVar.zzG;
                if (zziVar != null && zzvVarZzQ.zzG == null) {
                    zzt zztVarZza = zzvVarZzQ.zza();
                    zztVarZza.zzF(zziVar);
                    zzvVarZzQ = zztVarZza.zzQ();
                }
                if (zzvsVar.zzf(zzvVar, zzvVarZzQ).zzd != 0) {
                    int i16 = zzvVarZzQ.zzw;
                    b10 = -1;
                    if (i16 != -1) {
                        zzvVarArr = zzvVarArrZzJ;
                        if (zzvVarZzQ.zzx != -1) {
                            z11 = false;
                        }
                        z12 |= z11;
                        iMax2 = Math.max(iMax2, i16);
                        iMax = Math.max(iMax, zzvVarZzQ.zzx);
                        iZzbo = Math.max(iZzbo, zzbo(zzvsVar, zzvVarZzQ));
                    } else {
                        zzvVarArr = zzvVarArrZzJ;
                    }
                    z11 = true;
                    z12 |= z11;
                    iMax2 = Math.max(iMax2, i16);
                    iMax = Math.max(iMax, zzvVarZzQ.zzx);
                    iZzbo = Math.max(iZzbo, zzbo(zzvsVar, zzvVarZzQ));
                } else {
                    zzvVarArr = zzvVarArrZzJ;
                    b10 = -1;
                }
                i15++;
                zzvVarArrZzJ = zzvVarArr;
            }
            if (z12) {
                zzeh.zzc("MediaCodecVideoRenderer", C1709v0.a(new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length()), "Resolutions unknown. Codec max resolution: ", iMax2, "x", iMax));
                boolean z13 = i13 > i14;
                int i17 = z13 ? i13 : i14;
                int i18 = true != z13 ? i13 : i14;
                int[] iArr = zzb;
                int i19 = 0;
                while (i19 < 9) {
                    float f11 = i18;
                    float f12 = i17;
                    int i20 = iArr[i19];
                    int i21 = i19;
                    float f13 = i20;
                    if (i20 <= i17 || (i10 = (int) (f13 * (f11 / f12))) <= i18) {
                        break;
                    }
                    int i22 = i17;
                    if (true != z13) {
                        i11 = i18;
                        i12 = i20;
                    } else {
                        i11 = i18;
                        i12 = i10;
                    }
                    if (true != z13) {
                        i20 = i10;
                    }
                    pointZzi = zzvsVar.zzi(i12, i20);
                    float f14 = zzvVar.zzA;
                    if (pointZzi != null) {
                        z10 = z13;
                        if (zzvsVar.zzg(pointZzi.x, pointZzi.y, f14)) {
                            break;
                        }
                    } else {
                        z10 = z13;
                    }
                    i19 = i21 + 1;
                    i17 = i22;
                    i18 = i11;
                    z13 = z10;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzv(iMax2);
                    zztVarZza2.zzw(iMax);
                    iZzbo = Math.max(iZzbo, zzay(zzvsVar, zztVarZza2.zzQ()));
                    zzeh.zzc("MediaCodecVideoRenderer", C1709v0.a(new StringBuilder(com.google.android.gms.ads.internal.client.b.a(iMax2, 35) + String.valueOf(iMax).length()), "Codec max resolution adjusted to: ", iMax2, "x", iMax));
                }
            }
            zzadlVar = new zzadl(iMax2, iMax, iZzbo);
        }
        String str = zzvsVar.zzc;
        this.zzp = zzadlVar;
        boolean z14 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(InMobiNetworkValues.WIDTH, i14);
        mediaFormat.setInteger(InMobiNetworkValues.HEIGHT, i13);
        zzek.zza(mediaFormat, zzvVar.zzs);
        float f15 = zzvVar.zzA;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzek.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzG;
        if (zziVar2 != null) {
            zzek.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzek.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzek.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (pairZze = zzdr.zze(zzvVar)) != null) {
            zzek.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzadlVar.zza);
        mediaFormat.setInteger("max-height", zzadlVar.zzb);
        zzek.zzb(mediaFormat, "max-input-size", zzadlVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z14) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzO));
        }
        zzbk(mediaFormat);
        Surface surfaceZzbB = zzbB(zzvsVar);
        if (this.zzs != null && !zzfm.zzW(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzvm.zzb(zzvsVar, mediaFormat, zzvVar, surfaceZzbB, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzjf zzaj(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z10) {
        int i10;
        int i11;
        int i12;
        zzjf zzjfVarZzf = zzvsVar.zzf(zzvVar, zzvVar2);
        int i13 = zzjfVarZzf.zze;
        zzadl zzadlVar = this.zzp;
        zzadlVar.getClass();
        if (zzvVar2.zzw > zzadlVar.zza || zzvVar2.zzx > zzadlVar.zzb) {
            i13 |= 256;
        }
        if (zzbo(zzvsVar, zzvVar2) > zzadlVar.zzc) {
            i13 |= 64;
        }
        if (this.zzB != Integer.MIN_VALUE && (i12 = Build.VERSION.SDK_INT) < 31 && (i12 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f10 = zzvVar.zzA;
            if (f10 != -1.0f) {
                float f11 = zzvVar2.zzA;
                if (f11 != -1.0f && (!zzvsVar.zzf || !z10)) {
                    if (Math.abs((Math.max(f11, f10) / Math.min(f11, f10)) - Math.round(r12)) > 0.01f) {
                        i13 |= 65536;
                    }
                }
            }
        }
        String str = zzvsVar.zza;
        if (i13 != 0) {
            i11 = 0;
            i10 = i13;
        } else {
            i10 = 0;
            i11 = zzjfVarZzf.zzd;
        }
        return new zzjf(str, zzvVar, zzvVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final float zzal(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        zzvs zzvsVarZzaN;
        float fZzc = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f11 = zzvVar2.zzA;
            if (f11 != -1.0f) {
                fZzc = Math.max(fZzc, f11);
            }
        }
        if (fZzc == -1.0f && zzaK() != null) {
            if (this.zzk.zzc() != -9223372036854775807L) {
                fZzc = 1.0E9f / r10.zzc();
            }
        }
        float f12 = fZzc == -1.0f ? -1.0f : fZzc * f10;
        if (this.zzG == null || (zzvsVarZzaN = zzaN()) == null) {
            return f12;
        }
        float fZzh = zzvsVarZzaN.zzh(zzvVar.zzw, zzvVar.zzx);
        return f12 != -1.0f ? Math.max(f12, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzam(String str, zzvm zzvmVar, long j10, long j11) {
        this.zzg.zzb(str, j10, j11);
        this.zzq = zzbt(str);
        zzvs zzvsVarZzaN = zzaN();
        zzvsVarZzaN.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzvsVarZzaN.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzvsVarZzaN.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.zzr = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzan(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @Nullable
    public final zzjf zzap(zzma zzmaVar) throws zzjn {
        zzjf zzjfVarZzap = super.zzap(zzmaVar);
        zzv zzvVar = zzmaVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzjfVarZzap);
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
        return zzjfVarZzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzaq(zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        zzvp zzvpVarZzaK = zzaK();
        if (zzvpVarZzaK != null) {
            zzvpVarZzaK.zzq(this.zzA);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(InMobiNetworkValues.WIDTH);
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(InMobiNetworkValues.HEIGHT);
        float f10 = zzvVar.zzD;
        int i10 = zzvVar.zzB;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzM = new zzbv(integer, integer2, f10);
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null || !this.zzS) {
            this.zzk.zza(zzvVar.zzA);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzv(integer);
            zztVarZza.zzw(integer2);
            zztVarZza.zzC(f10);
            zzv zzvVarZzQ = zztVarZza.zzQ();
            int i12 = this.zzu;
            List listZzi = this.zzv;
            if (listZzi == null) {
                listZzi = zzgxm.zzi();
            }
            zzafdVar.zzs(1, zzvVarZzQ, zzbj(), i12, listZzi);
            this.zzu = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final boolean zzar(long j10, long j11, long j12, boolean z10, boolean z11) throws zzjn {
        int iZzS;
        if (this.zzs != null && this.zzf) {
            j11 -= -this.zzR;
        }
        if (j10 >= -500000 || z10 || (iZzS = zzS(j11)) == 0) {
            return false;
        }
        this.zzH = j11;
        Iterator it = this.zzo.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() >= zzH()) {
                i10++;
            }
        }
        if (z11) {
            zzje zzjeVar = ((zzvz) this).zza;
            int i11 = zzjeVar.zzd + iZzS;
            zzjeVar.zzf += this.zzF;
            zzjeVar.zzd = i11 + i10;
        } else {
            ((zzvz) this).zza.zzj++;
            zzaB(iZzS + i10, this.zzF);
        }
        zzaP();
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzas() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzi();
            long jZzbj = this.zzR;
            if (jZzbj == -9223372036854775807L) {
                jZzbj = zzbj();
                this.zzR = jZzbj;
            }
            this.zzs.zzo(-jZzbj);
        } else {
            this.zzi.zzb(2);
        }
        this.zzS = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzat(long r20, long r22, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzvp r24, @androidx.annotation.Nullable java.nio.ByteBuffer r25, int r26, int r27, int r28, long r29, boolean r31, boolean r32, com.google.android.gms.internal.ads.zzv r33) throws com.google.android.gms.internal.ads.zzjn {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.zzat(long, long, com.google.android.gms.internal.ads.zzvp, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzau(zzjc zzjcVar) {
        this.zzg.zzk(zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzav() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzi();
        } else if (zzbg() != -9223372036854775807L) {
            zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @TargetApi(29)
    public final void zzax(zziy zziyVar) throws zzjn {
        if (this.zzr) {
            ByteBuffer byteBuffer = zziyVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvp zzvpVarZzaK = zzaK();
                        zzvpVarZzaK.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvpVarZzaK.zzp(bundle);
                    }
                }
            }
        }
    }

    public final void zzaz(zzvp zzvpVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzvpVar.zzc(i10, false);
        Trace.endSection();
        ((zzvz) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @InterfaceC4335i
    public final void zzbb(long j10) {
        super.zzbb(j10);
        this.zzF--;
    }

    public final /* synthetic */ void zzbq(float f10) {
        this.zzi.zzf(f10);
        zzbf();
    }

    public final /* synthetic */ Surface zzbs() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public final void zzx(int i10, @Nullable Object obj) throws zzjn {
        if (i10 == 1) {
            zzbw(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            zzaea zzaeaVar = (zzaea) obj;
            this.zzQ = zzaeaVar;
            zzafd zzafdVar = this.zzs;
            if (zzafdVar != null) {
                zzafdVar.zzl(zzaeaVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzP != iIntValue) {
                this.zzP = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzA = iIntValue2;
            zzvp zzvpVarZzaK = zzaK();
            if (zzvpVarZzaK != null) {
                zzvpVarZzaK.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzB = iIntValue3;
            zzafd zzafdVar2 = this.zzs;
            if (zzafdVar2 != null) {
                zzafdVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzn(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzafd zzafdVar3 = this.zzs;
                if (zzafdVar3 == null || !zzafdVar3.zze()) {
                    return;
                }
                zzafdVar3.zzf();
                return;
            }
            this.zzv = list;
            zzafd zzafdVar4 = this.zzs;
            if (zzafdVar4 != null) {
                zzafdVar4.zzn(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            zzev zzevVar = (zzev) obj;
            if (zzevVar.zza() == 0 || zzevVar.zzb() == 0) {
                return;
            }
            this.zzy = zzevVar;
            zzafd zzafdVar5 = this.zzs;
            if (zzafdVar5 != null) {
                Surface surface = this.zzw;
                surface.getClass();
                zzafdVar5.zzp(surface, zzevVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.zzO = ((Integer) obj).intValue();
                zzvp zzvpVarZzaK2 = zzaK();
                if (zzvpVarZzaK2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzO));
                    zzvpVarZzaK2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzw;
                zzbw(null);
                obj.getClass();
                ((zzadn) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z10 = this.zzG != null;
                zznl zznlVar = (zznl) obj;
                this.zzG = zznlVar;
                if (z10 != (zznlVar != null)) {
                    zzbf();
                }
                break;
            default:
                super.zzx(i10, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void zzy(boolean z10, boolean z11) throws zzjn {
        super.zzy(z10, z11);
        zzK();
        this.zzg.zza(((zzvz) this).zza);
        if (!this.zzt) {
            if (this.zzv != null && this.zzs == null) {
                zzadr zzadrVar = new zzadr(this.zze, this.zzi);
                zzadrVar.zza(true);
                zzadrVar.zzc(-this.zzm);
                zzadrVar.zzb(zzM());
                zzadz zzadzVarZzd = zzadrVar.zzd();
                zzadzVarZzd.zza(1);
                this.zzs = zzadzVarZzd.zzb(0);
            }
            this.zzt = true;
        }
        int i10 = !z11 ? 1 : 0;
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null) {
            zzaed zzaedVar = this.zzi;
            zzaedVar.zzh(zzM());
            zzaedVar.zzb(i10);
            return;
        }
        zzafdVar.zzc(new zzadh(this), zzhdp.zza());
        zzaea zzaeaVar = this.zzQ;
        if (zzaeaVar != null) {
            this.zzs.zzl(zzaeaVar);
        }
        if (this.zzw != null && !this.zzy.equals(zzev.zza)) {
            this.zzs.zzp(this.zzw, this.zzy);
        }
        this.zzs.zzr(this.zzB);
        this.zzs.zzm(zzbd());
        List list = this.zzv;
        if (list != null) {
            this.zzs.zzn(list);
        }
        this.zzu = i10;
        zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void zzz(zzv[] zzvVarArr, long j10, long j11, zzxo zzxoVar) throws zzjn {
        super.zzz(zzvVarArr, j10, j11, zzxoVar);
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
    }
}
