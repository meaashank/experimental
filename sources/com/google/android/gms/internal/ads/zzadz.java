package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzadz implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzafd zze;
    private final zzdp zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzaee zzi;
    private zzfi zzj = new zzfi(10);
    private zzv zzk;
    private zzea zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzadz(zzadr zzadrVar, byte[] bArr) {
        this.zza = zzadrVar.zze();
        zzbs zzbsVarZzg = zzadrVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgxm.zzi();
        this.zzd = zzadrVar.zzh();
        zzdp zzdpVarZzi = zzadrVar.zzi();
        this.zzf = zzdpVarZzi;
        this.zzh = -zzadrVar.zzj();
        zzaee zzaeeVarZzk = zzadrVar.zzk();
        this.zzi = zzaeeVarZzk;
        this.zze = new zzadc(zzadrVar.zzf(), zzaeeVarZzk, zzdpVarZzi);
        new zzadq(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzQ();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(@Nullable zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j10) {
        this.zzq = j10;
    }

    public final void zza(int i10) {
        this.zzr = 1;
    }

    public final zzafd zzb(int i10) {
        SparseArray sparseArray = this.zzc;
        if (zzfm.zza(sparseArray, 0)) {
            return (zzafd) sparseArray.get(0);
        }
        zzadt zzadtVar = new zzadt(this, this.zza, 0);
        this.zzg.add(zzadtVar);
        sparseArray.put(0, zzadtVar);
        return zzadtVar;
    }

    public final void zzc(Surface surface, zzev zzevVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzev) this.zzm.second).equals(zzevVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzevVar);
        zzevVar.zza();
        zzevVar.zzb();
    }

    public final void zzd() {
        zzev zzevVar = zzev.zza;
        zzevVar.zza();
        zzevVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzea zzeaVar = this.zzl;
        if (zzeaVar != null) {
            zzeaVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: zzdx -> 0x0033, TRY_LEAVE, TryCatch #1 {zzdx -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0064), top: B:40:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r11, int r12) throws com.google.android.gms.internal.ads.zzafc {
        /*
            r10 = this;
            int r12 = r10.zzo
            r0 = 0
            r1 = 1
            if (r12 != 0) goto L8
            r12 = r1
            goto L9
        L8:
            r12 = r0
        L9:
            com.google.android.gms.internal.ads.zzguk.zzi(r12)
            com.google.android.gms.internal.ads.zzi r12 = r11.zzG
            com.google.android.gms.internal.ads.zzi r12 = zzC(r12)
            int r2 = r12.zzd     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r3 = 7
            if (r2 != r3) goto L36
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r4 = 34
            if (r2 >= r4) goto L23
            boolean r2 = com.google.android.gms.internal.ads.zzdy.zzd()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            if (r2 != 0) goto L25
        L23:
            r2 = r3
            goto L36
        L25:
            com.google.android.gms.internal.ads.zzh r12 = r12.zzd()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r0 = 6
            r12.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            com.google.android.gms.internal.ads.zzi r12 = r12.zzg()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
        L31:
            r2 = r12
            goto L67
        L33:
            r0 = move-exception
            r12 = r0
            goto L95
        L36:
            boolean r3 = com.google.android.gms.internal.ads.zzdy.zzc(r2)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            if (r3 != 0) goto L5d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r4 = 29
            if (r3 >= r4) goto L43
            goto L5d
        L43:
            java.lang.String r12 = "PlaybackVidGraphWrapper"
            java.lang.String r3 = "Color transfer %d is not supported. Falling back to OpenGl tone mapping."
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r1[r0] = r2     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfm.zza     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.util.Locale r0 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.lang.String r0 = java.lang.String.format(r0, r3, r1)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            com.google.android.gms.internal.ads.zzeh.zzc(r12, r0)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            com.google.android.gms.internal.ads.zzi r12 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            goto L31
        L5d:
            r0 = 2
            if (r2 == r0) goto L64
            r0 = 10
            if (r2 != r0) goto L31
        L64:
            com.google.android.gms.internal.ads.zzi r12 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            goto L31
        L67:
            com.google.android.gms.internal.ads.zzdp r12 = r10.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r9 = 0
            com.google.android.gms.internal.ads.zzea r12 = r12.zzd(r0, r9)
            r10.zzl = r12
            com.google.android.gms.internal.ads.zzbs r0 = r10.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            android.content.Context r1 = r10.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            com.google.android.gms.internal.ads.zzl r3 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            java.util.Objects.requireNonNull(r12)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            com.google.android.gms.internal.ads.zzads r5 = new com.google.android.gms.internal.ads.zzads     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            r5.<init>()     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            r6 = 0
            r8 = 0
            r4 = r10
            r0.zza(r1, r2, r3, r4, r5, r6, r8)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            throw r9     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
        L8d:
            r0 = move-exception
            r12 = r0
            com.google.android.gms.internal.ads.zzafc r0 = new com.google.android.gms.internal.ads.zzafc
            r0.<init>(r12, r11)
            throw r0
        L95:
            com.google.android.gms.internal.ads.zzafc r0 = new com.google.android.gms.internal.ads.zzafc
            r0.<init>(r12, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadz.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z10) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j10, long j11) throws zzafc {
        this.zze.zzv(j10, j11);
    }

    public final /* synthetic */ void zzm(boolean z10) {
        if (this.zzo == 1) {
            this.zzn++;
            zzafd zzafdVar = this.zze;
            zzafdVar.zzg(z10);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzady zzadyVar = (zzady) this.zzj.zzd();
                zzadyVar.getClass();
                zzafdVar.zzs(1, this.zzk, zzadyVar.zza, zzadyVar.zzb, zzgxm.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z10) {
                this.zzq = -9223372036854775807L;
            }
            zzea zzeaVar = this.zzl;
            zzeaVar.getClass();
            zzeaVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z10) {
        this.zze.zzw(z10);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzaea zzaeaVar) {
        this.zze.zzl(zzaeaVar);
    }

    public final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    public final /* synthetic */ void zzr(int i10) {
        this.zze.zzr(i10);
    }

    public final /* synthetic */ boolean zzs() {
        int i10 = this.zzr;
        return i10 != -1 && i10 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzaee zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzfi zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzfi zzfiVar) {
        this.zzj = zzfiVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
