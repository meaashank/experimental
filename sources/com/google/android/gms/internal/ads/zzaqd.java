package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqd implements zzaqh {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaht zzi;
    private zzaht zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaht zzw;
    private long zzx;
    private final zzet zzc = new zzet(new byte[7], 7);
    private final zzeu zzd = new zzeu(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaqd(boolean z10, @Nullable String str, int i10, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzi();
    }

    public static boolean zze(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzeu zzeuVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzeuVar.zzd(), i10 - this.zzl);
        zzeuVar.zzm(bArr, this.zzl, iMin);
        int i11 = this.zzl + iMin;
        this.zzl = i11;
        return i11 == i10;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaht zzahtVar, long j10, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzahtVar;
        this.zzx = j10;
        this.zzu = i11;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zze((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzeu zzeuVar, byte[] bArr, int i10) {
        if (zzeuVar.zzd() < i10) {
            return false;
        }
        zzeuVar.zzm(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzh = zzarvVar.zzc();
        zzaht zzahtVarZzs = zzagkVar.zzs(zzarvVar.zzb(), 1);
        this.zzi = zzahtVarZzs;
        this.zzw = zzahtVarZzs;
        if (!this.zzb) {
            this.zzj = new zzage();
            return;
        }
        zzarvVar.zza();
        zzaht zzahtVarZzs2 = zzagkVar.zzs(zzarvVar.zzb(), 5);
        this.zzj = zzahtVarZzs2;
        zzt zztVar = new zzt();
        zztVar.zza(zzarvVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo("application/id3");
        zzahtVarZzs2.zzA(zztVar.zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j10, int i10) {
        this.zzv = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025b, code lost:
    
        r18.zzk = 1;
        r18.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0261, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0264, code lost:
    
        r19.zzh(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0247, code lost:
    
        r18.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0250, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0252, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0254, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0255, code lost:
    
        r18.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0259, code lost:
    
        if (r18.zzo != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0247 A[EDGE_INSN: B:143:0x0247->B:94:0x0247 BREAK  A[LOOP:1: B:48:0x01a0->B:169:0x01a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzeu r19) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqd.zzd(com.google.android.gms.internal.ads.zzeu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public /* synthetic */ void zzf() {
        G.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public /* synthetic */ void zzn() {
        G.b(this);
    }
}
