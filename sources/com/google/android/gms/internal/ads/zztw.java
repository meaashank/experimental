package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zztw implements zzsi {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private float zzH;

    @Nullable
    private ByteBuffer zzI;
    private int zzJ;

    @Nullable
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private boolean zzQ;
    private zze zzR;

    @Nullable
    private AudioDeviceInfo zzS;
    private int zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private Handler zzZ;
    private final zztr zzaa;

    @Nullable
    private final Context zzb;
    private final zztl zzc;
    private final zzui zzd;
    private final zzcw zze;
    private final zzuh zzf;
    private final zzgxm zzg;
    private final ArrayDeque zzh;

    @Nullable
    private zztn zzi;
    private final zztv zzj;
    private final zztv zzk;

    @Nullable
    private zzqj zzl;

    @Nullable
    private zzsf zzm;

    @Nullable
    private zztq zzn;
    private zztq zzo;
    private zzck zzp;
    private final zzrj zzq;
    private zzrg zzr;

    @Nullable
    private zzqz zzs;
    private zzd zzt;

    @Nullable
    private zztu zzu;
    private zztu zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    public /* synthetic */ zztw(zztp zztpVar, byte[] bArr) {
        this.zzb = zztpVar.zzb() == null ? null : zztpVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzaa = zztpVar.zzd();
        this.zzq = zztpVar.zzc();
        zztl zztlVar = new zztl();
        this.zzc = zztlVar;
        zzui zzuiVar = new zzui();
        this.zzd = zzuiVar;
        this.zze = new zzcw();
        this.zzf = new zzuh();
        this.zzg = zzgxm.zzk(zzuiVar, zztlVar);
        this.zzH = 1.0f;
        this.zzP = 0;
        this.zzR = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zztu(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zztv();
        this.zzk = new zztv();
        int iZzai = -1;
        if (Build.VERSION.SDK_INT >= 34 && zztpVar.zzb() != null) {
            iZzai = zzai(zztpVar.zzb().getDeviceId());
        }
        this.zzT = iZzai;
    }

    public static int zzF(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        byte b10;
        int i13;
        int i14;
        if (i10 == 20) {
            return zzgy.zzb(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzahf.zzb(zzfm.zzO(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i15 = iPosition;
                            while (true) {
                                if (i15 > iLimit) {
                                    i14 = -1;
                                } else if ((zzfm.zzO(byteBuffer, i15 + 4) & (-2)) == -126718022) {
                                    i14 = i15 - iPosition;
                                } else {
                                    i15++;
                                }
                            }
                            if (i14 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i14) + ((byteBuffer.get((byteBuffer.position() + i14) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzafk.zzb(new zzet(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 27), "Unexpected audio encoding: ", i10));
                    }
                    break;
            }
            return zzafh.zze(byteBuffer);
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b11 = byteBuffer.get(iPosition3);
        if (b11 != -2) {
            if (b11 == -1) {
                i12 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b10 = byteBuffer.get(iPosition3 + 7);
            } else if (b11 != 31) {
                i12 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                i13 = byteBuffer.get(iPosition3 + 5) & 252;
                i11 = (i13 >> 2) | i12;
            } else {
                i12 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                b10 = byteBuffer.get(iPosition3 + 6);
            }
            i13 = b10 & 60;
            i11 = (i13 >> 2) | i12;
        } else {
            i11 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i11 + 1) * 32;
    }

    public static /* synthetic */ boolean zzI() {
        return zza.get() > 0;
    }

    private final void zzS(long j10) {
        long j11;
        this.zzp = this.zzo.zzk();
        if (j10 == -9223372036854775807L) {
            j11 = 0;
        } else {
            j11 = j10 - this.zzG;
            if (this.zzo.zzl() != zzbf.zza && this.zzo.zzm() != null) {
                this.zzo.zzl().zzo(this.zzo.zzm(), new zzbd());
            }
        }
        zzck zzckVar = this.zzp;
        zzcm zzcmVar = new zzcm();
        zzcmVar.zzb(this.zzo.zzl());
        zzcmVar.zzc(this.zzo.zzm());
        zzcmVar.zza(j11);
        zzckVar.zzb(zzcmVar.zzd());
    }

    private final zzqz zzT(zzri zzriVar) throws zzse {
        try {
            return ((zzti) this.zzq).zzf(zzriVar);
        } catch (zzrf e10) {
            zzse zzseVar = new zzse(0, zzriVar.zzb, zzriVar.zzc, zzriVar.zza, zzriVar.zze, this.zzo.zzf(), false, e10);
            zzsf zzsfVar = this.zzm;
            if (zzsfVar == null) {
                throw zzseVar;
            }
            zzsfVar.zza(zzseVar);
            throw zzseVar;
        }
    }

    private final void zzU(long j10) throws Exception {
        zzX(j10);
        if (this.zzK != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzI;
            if (byteBuffer != null) {
                zzW(byteBuffer);
                zzX(j10);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzp.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzW(byteBufferZze);
                    zzX(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.zzI;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzI);
                    }
                }
            } while (this.zzK == null);
            return;
        }
    }

    private final boolean zzV() throws Exception {
        if (!this.zzp.zzc()) {
            zzX(Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzp.zzf();
        zzU(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzK;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[PHI: r14
      0x00b1: PHI (r14v19 double) = (r14v15 double), (r14v28 double) binds: [B:46:0x00f2, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[PHI: r14
      0x00b7: PHI (r14v16 double) = (r14v15 double), (r14v28 double) binds: [B:46:0x00f2, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[PHI: r11
      0x00db: PHI (r11v16 float) = (r11v11 float), (r11v43 float) binds: [B:56:0x0191, B:41:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[PHI: r11
      0x00e1: PHI (r11v12 float) = (r11v11 float), (r11v43 float) binds: [B:56:0x0191, B:41:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzW(java.nio.ByteBuffer r33) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztw.zzW(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzX(long r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.zzK
            if (r0 != 0) goto L6
            goto Lbb
        L6:
            com.google.android.gms.internal.ads.zztv r0 = r8.zzk
            boolean r0 = r0.zzb()
            if (r0 != 0) goto Lbb
            java.nio.ByteBuffer r0 = r8.zzK
            int r0 = r0.remaining()
            r1 = 0
            r3 = 1
            r4 = 0
            com.google.android.gms.internal.ads.zzqz r5 = r8.zzs     // Catch: com.google.android.gms.internal.ads.zzqy -> L83
            java.nio.ByteBuffer r6 = r8.zzK     // Catch: com.google.android.gms.internal.ads.zzqy -> L83
            int r7 = r8.zzJ     // Catch: com.google.android.gms.internal.ads.zzqy -> L83
            boolean r9 = r5.zzc(r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzqy -> L83
            long r5 = android.os.SystemClock.elapsedRealtime()
            r8.zzU = r5
            com.google.android.gms.internal.ads.zztv r10 = r8.zzk
            r10.zzc()
            com.google.android.gms.internal.ads.zzqz r10 = r8.zzs
            boolean r10 = r10.zzg()
            if (r10 == 0) goto L49
            long r5 = r8.zzB
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L3d
            r8.zzW = r4
        L3d:
            boolean r10 = r8.zzO
            if (r10 == 0) goto L49
            com.google.android.gms.internal.ads.zzsf r10 = r8.zzm
            if (r10 == 0) goto L49
            if (r9 != 0) goto L49
            com.google.android.gms.internal.ads.zzub r10 = (com.google.android.gms.internal.ads.zzub) r10
        L49:
            com.google.android.gms.internal.ads.zztq r10 = r8.zzo
            boolean r10 = r10.zze()
            if (r10 == 0) goto L5e
            long r1 = r8.zzA
            java.nio.ByteBuffer r10 = r8.zzK
            int r10 = r10.remaining()
            int r0 = r0 - r10
            long r5 = (long) r0
            long r1 = r1 + r5
            r8.zzA = r1
        L5e:
            if (r9 == 0) goto Lbb
            com.google.android.gms.internal.ads.zztq r9 = r8.zzo
            boolean r9 = r9.zze()
            if (r9 != 0) goto L7f
            java.nio.ByteBuffer r9 = r8.zzK
            java.nio.ByteBuffer r10 = r8.zzI
            if (r9 != r10) goto L6f
            goto L70
        L6f:
            r3 = r4
        L70:
            com.google.android.gms.internal.ads.zzguk.zzi(r3)
            long r9 = r8.zzB
            int r0 = r8.zzC
            long r0 = (long) r0
            int r2 = r8.zzJ
            long r2 = (long) r2
            long r0 = r0 * r2
            long r0 = r0 + r9
            r8.zzB = r0
        L7f:
            r9 = 0
            r8.zzK = r9
            return
        L83:
            r9 = move-exception
            boolean r10 = r9.zzb
            if (r10 == 0) goto L9d
            long r5 = r8.zzaf()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
            goto L9e
        L91:
            com.google.android.gms.internal.ads.zzqz r0 = r8.zzs
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L9d
            r8.zzY()
            goto L9e
        L9d:
            r3 = r4
        L9e:
            int r9 = r9.zza
            com.google.android.gms.internal.ads.zzsh r0 = new com.google.android.gms.internal.ads.zzsh
            com.google.android.gms.internal.ads.zztq r1 = r8.zzo
            com.google.android.gms.internal.ads.zzv r1 = r1.zzf()
            r0.<init>(r9, r1, r3)
            com.google.android.gms.internal.ads.zzsf r9 = r8.zzm
            if (r9 == 0) goto Lb2
            r9.zza(r0)
        Lb2:
            if (r10 != 0) goto Lba
            com.google.android.gms.internal.ads.zztv r9 = r8.zzk
            r9.zza(r0)
            return
        Lba:
            throw r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztw.zzX(long):void");
    }

    private final void zzY() {
        this.zzo.zzj();
    }

    private final void zzZ() {
        if (zzae()) {
            this.zzs.zzf(this.zzH);
        }
    }

    private final void zzaa() {
        if (this.zzo != null) {
            zztq zztqVar = this.zzn;
            if (zztqVar != null) {
                this.zzo = zztqVar;
                this.zzn = null;
            }
            try {
                this.zzo = this.zzo.zza(this.zzq.zzb(zzag(this.zzo.zzg(), -1)));
            } catch (zzra e10) {
                throw new IllegalStateException(new zzsd(e10, this.zzo.zzf()));
            }
        }
        zzC();
    }

    private final void zzab(zzav zzavVar) {
        zztu zztuVar = new zztu(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzae()) {
            this.zzu = zztuVar;
        } else {
            this.zzv = zztuVar;
        }
    }

    private final void zzac(long j10) {
        zzav zzavVar;
        boolean z10;
        if (zzad()) {
            zztr zztrVar = this.zzaa;
            zzavVar = this.zzw;
            zztrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzad()) {
            zztr zztrVar2 = this.zzaa;
            z10 = this.zzx;
            zztrVar2.zzc(z10);
        } else {
            z10 = false;
        }
        this.zzx = z10;
        this.zzh.add(new zztu(zzavVar2, Math.max(0L, j10), this.zzo.zzc(zzaf()), null));
        zzS(j10);
        zzsf zzsfVar = this.zzm;
        if (zzsfVar != null) {
            ((zzub) zzsfVar).zza.zzaB().zzh(this.zzx);
        }
    }

    private final boolean zzad() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i10 = this.zzo.zzf().zzL;
        return true;
    }

    private final boolean zzae() {
        return this.zzs != null;
    }

    private final long zzaf() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j10 = this.zzA;
        long jZzi = this.zzo.zzi();
        String str = zzfm.zza;
        return ((j10 + jZzi) - 1) / jZzi;
    }

    private final zzrc zzag(zzv zzvVar, int i10) {
        zzrb zzrbVar = new zzrb(zzvVar);
        zzrbVar.zza(this.zzt);
        zzrbVar.zzb(this.zzS);
        zzrbVar.zzc(this.zzP);
        zzrbVar.zze(-1);
        zzrbVar.zzd(this.zzT);
        return new zzrc(zzrbVar, null);
    }

    private final void zzah() {
        if (this.zzM) {
            return;
        }
        this.zzM = true;
        if (this.zzs.zzg()) {
            this.zzN = false;
        }
        this.zzs.zzd();
    }

    private static int zzai(int i10) {
        if (i10 == 0 || i10 == -1) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzA(float f10) {
        if (this.zzH != f10) {
            this.zzH = f10;
            zzZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzB() {
        this.zzO = false;
        if (zzae()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzC() {
        if (zzae()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzW = false;
            this.zzC = 0;
            this.zzv = new zztu(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzM = false;
            this.zzL = false;
            this.zzN = false;
            this.zzd.zzr();
            zzS(-9223372036854775807L);
            this.zzi = null;
            zztq zztqVar = this.zzn;
            if (zztqVar != null) {
                this.zzo = zztqVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzX = 0L;
        this.zzY = 0L;
        Handler handler = this.zzZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzD() {
        zzC();
        zzgxm zzgxmVar = this.zzg;
        int size = zzgxmVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzcp) zzgxmVar.get(i10)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzO = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzE() {
        this.zzq.zze();
    }

    public final /* synthetic */ void zzG() {
        if (this.zzY >= 300000) {
            ((zzub) this.zzm).zza.zzaD(true);
            this.zzY = 0L;
        }
    }

    public final /* synthetic */ void zzH() {
        zzsf zzsfVar = this.zzm;
        if (zzsfVar != null) {
            ((zzub) zzsfVar).zza.zzU();
        }
    }

    public final /* synthetic */ zztn zzK() {
        return this.zzi;
    }

    public final /* synthetic */ zzsf zzL() {
        return this.zzm;
    }

    public final /* synthetic */ zztq zzM() {
        return this.zzo;
    }

    public final /* synthetic */ zzqz zzN() {
        return this.zzs;
    }

    public final /* synthetic */ boolean zzO() {
        return this.zzM;
    }

    public final /* synthetic */ void zzP(boolean z10) {
        this.zzN = true;
    }

    public final /* synthetic */ boolean zzQ() {
        return this.zzO;
    }

    public final /* synthetic */ long zzR() {
        return this.zzU;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zza(zzsf zzsfVar) {
        this.zzm = zzsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzb(@Nullable zzqj zzqjVar) {
        this.zzl = zzqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzc(zzdp zzdpVar) {
        this.zzq.zzd(zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final int zze(zzv zzvVar) {
        boolean z10;
        int i10 = zzvVar.zzL;
        if (!zzfm.zzE(i10) || i10 == 2) {
            z10 = false;
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzK(2);
            zzvVar = zztVarZza.zzQ();
            z10 = true;
        }
        int i11 = this.zzq.zza(zzag(zzvVar, -1)).zzd;
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 2) {
            return 0;
        }
        return z10 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzqw zzf(zzv zzvVar) {
        if (this.zzV) {
            return zzqw.zza;
        }
        zzre zzreVarZza = this.zzq.zza(zzag(zzvVar, -1));
        zzqv zzqvVar = new zzqv();
        zzqvVar.zza(zzreVarZza.zza);
        zzqvVar.zzb(zzreVarZza.zzb);
        zzqvVar.zzc(zzreVarZza.zzc);
        return zzqvVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final long zzg(boolean z10) {
        ArrayDeque arrayDeque;
        long j10;
        if (!zzae() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzs.zzk(), this.zzo.zzc(zzaf()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || jMin < ((zztu) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zztu) arrayDeque.remove();
        }
        zztu zztuVar = this.zzv;
        long j11 = jMin - zztuVar.zzc;
        long jZzy = zzfm.zzy(j11, zztuVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzaa.zzd(j11);
            zztu zztuVar2 = this.zzv;
            j10 = zztuVar2.zzb + jZzd;
            zztuVar2.zzd = jZzd - jZzy;
        } else {
            zztu zztuVar3 = this.zzv;
            j10 = zztuVar3.zzb + jZzy + zztuVar3.zzd;
        }
        long jZze = this.zzaa.zze();
        long jZzc = j10 + this.zzo.zzc(jZze);
        long j12 = this.zzX;
        if (jZze > j12) {
            long jZzc2 = this.zzo.zzc(jZze - j12);
            this.zzX = jZze;
            this.zzY += jZzc2;
            if (this.zzZ == null) {
                this.zzZ = new Handler(Looper.myLooper());
            }
            this.zzZ.removeCallbacksAndMessages(null);
            this.zzZ.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzG();
                }
            }, 100L);
        }
        return jZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzh(zzsb zzsbVar) throws zzsd {
        int i10;
        zzv zzvVar;
        zzck zzckVar;
        int iZzI;
        if (this.zzr == null && this.zzb != null) {
            zzrg zzrgVar = new zzrg() { // from class: com.google.android.gms.internal.ads.zzts
                @Override // com.google.android.gms.internal.ads.zzrg
                public final /* synthetic */ void zza() {
                    this.zza.zzH();
                }
            };
            this.zzr = zzrgVar;
            this.zzq.zzc(zzrgVar);
        }
        zzv zzvVar2 = zzsbVar.zza;
        if ("audio/raw".equals(zzvVar2.zzp)) {
            int i11 = zzvVar2.zzL;
            zzguk.zza(zzfm.zzE(i11));
            int i12 = zzvVar2.zzI;
            int iZzI2 = zzfm.zzI(i11) * i12;
            zzgxj zzgxjVar = new zzgxj();
            zzgxjVar.zzh(this.zzg);
            zzgxjVar.zzf(this.zze);
            zzgxjVar.zzg(this.zzaa.zza());
            zzck zzckVar2 = new zzck(zzgxjVar.zzi());
            if (zzckVar2.equals(this.zzp)) {
                zzckVar2 = this.zzp;
            }
            this.zzd.zzq(zzvVar2.zzM, zzvVar2.zzN);
            this.zzc.zzq(zzsbVar.zzc);
            try {
                zzcl zzclVarZza = zzckVar2.zza(new zzcl(zzvVar2.zzK, i12, i11));
                zzt zztVarZza = zzvVar2.zza();
                int i13 = zzclVarZza.zzd;
                zztVarZza.zzK(i13);
                zztVarZza.zzJ(zzclVarZza.zzb);
                int i14 = zzclVarZza.zzc;
                zztVarZza.zzH(i14);
                zztVarZza.zzI(i14 == zzvVar2.zzI ? zzvVar2.zzJ : -1);
                zzv zzvVarZzQ = zztVarZza.zzQ();
                zzckVar = zzckVar2;
                iZzI = zzfm.zzI(i13) * i14;
                i10 = iZzI2;
                zzvVar = zzvVarZzQ;
            } catch (zzco e10) {
                throw new zzsd(e10, zzvVar2);
            }
        } else {
            i10 = -1;
            zzvVar = zzvVar2;
            zzckVar = new zzck(zzgxm.zzi());
            iZzI = -1;
        }
        zzrc zzrcVarZzag = zzag(zzvVar, -1);
        try {
            zzri zzriVarZzb = this.zzq.zzb(zzrcVarZzag);
            if (zzriVarZzb.zza == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=false)");
                throw new zzsd(sb2.toString(), zzrcVarZzag.zza);
            }
            if (zzriVarZzb.zzc == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=false)");
                throw new zzsd(sb3.toString(), zzrcVarZzag.zza);
            }
            this.zzV = false;
            zzbf zzbfVar = zzsbVar.zzd;
            zzxo zzxoVar = zzsbVar.zze;
            zztq zztqVar = new zztq(zzvVar2, zzvVar, i10, iZzI, zzriVarZzb, zzckVar, zzbfVar, zzxoVar != null ? zzxoVar.zza : null, null);
            if (zzae()) {
                this.zzn = zztqVar;
            } else {
                this.zzo = zztqVar;
            }
        } catch (zzra e11) {
            throw new zzsd(e11, zzvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzi() {
        this.zzO = true;
        if (zzae()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzj() {
        this.zzD = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.google.android.gms.internal.ads.zzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.nio.ByteBuffer r19, long r20, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztw.zzk(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzl() throws zzsh {
        if (!this.zzL && zzae() && zzV()) {
            zzah();
            this.zzL = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzm() {
        if (zzae()) {
            return this.zzL && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzn() {
        if (!zzae()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzN) {
            return false;
        }
        long jZzaf = zzaf();
        long jZzk = this.zzs.zzk();
        zzqz zzqzVar = this.zzs;
        zzqzVar.getClass();
        return jZzaf > zzfm.zzv(jZzk, zzqzVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzo(zzav zzavVar) {
        float f10 = zzavVar.zzb;
        String str = zzfm.zza;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzab(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzq(boolean z10) {
        this.zzx = z10;
        zzab(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    @Nullable
    public final zzql zzs() {
        zzrj zzrjVar = this.zzq;
        if (zzrjVar instanceof zzti) {
            return ((zzti) zzrjVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzt(int i10) {
        if (this.zzQ) {
            if (this.zzP != i10) {
                return;
            } else {
                this.zzQ = false;
            }
        }
        if (this.zzP != i10) {
            this.zzP = i10;
            zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzu(zze zzeVar) {
        if (this.zzR.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i10 = this.zzR.zza;
        }
        this.zzR = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzv(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzS = audioDeviceInfo;
        zzqz zzqzVar = this.zzs;
        if (zzqzVar != null) {
            zzqzVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzw(int i10) {
        int i11 = this.zzT;
        int iZzai = zzai(i10);
        if (i11 == iZzai) {
            return;
        }
        this.zzT = iZzai;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzx(long j10) {
        this.zzG = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final long zzy() {
        if (!zzae()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzagl.zzf(this.zzo.zzj().zza);
        zzguk.zzi(iZzf != -2147483647);
        return zzfm.zzw(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    @e.T(29)
    public final void zzz(int i10, int i11) {
        zzqz zzqzVar = this.zzs;
        if (zzqzVar != null) {
            zzqzVar.zzg();
        }
    }
}
