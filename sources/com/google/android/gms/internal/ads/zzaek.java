package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaek {
    private final Context zza;

    @Nullable
    private zzaeg zzb;
    private boolean zzc;

    @Nullable
    private Surface zzd;
    private float zze;
    private float zzf;
    private float zzg = 1.0f;
    private int zzh = 0;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public zzaek(Context context) {
        this.zza = context;
    }

    private final void zzi() {
        this.zzn = -1L;
        this.zzk = -1L;
        this.zzm = -9223372036854775807L;
        this.zzi = 0L;
        this.zzj = 0L;
    }

    private final void zzj(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zzd) == null || this.zzh == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzc) {
            float f11 = this.zze;
            if (f11 != -1.0f) {
                f10 = this.zzg * f11;
            }
        }
        if (z10 || this.zzf != f10) {
            this.zzf = f10;
            zzaef.zza(this.zzd, f10);
        }
    }

    private final void zzk() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zzd) == null || this.zzh == Integer.MIN_VALUE || this.zzf == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzf = 0.0f;
        zzaef.zza(this.zzd, 0.0f);
    }

    public final void zza(int i10) {
        if (this.zzh == i10) {
            return;
        }
        this.zzh = i10;
        zzj(true);
    }

    public final void zzb() {
        this.zzc = true;
        zzi();
        DisplayManager displayManager = (DisplayManager) this.zza.getSystemService("display");
        zzaeg zzaejVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzaejVar = Build.VERSION.SDK_INT >= 33 ? new zzaej(choreographer, displayManager, null) : new zzaeh(choreographer, displayManager, null);
            } catch (RuntimeException e10) {
                zzeh.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        this.zzb = zzaejVar;
        if (zzaejVar != null) {
            zzaejVar.zza();
        }
        zzj(false);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zzd == surface) {
            return;
        }
        zzk();
        this.zzd = surface;
        zzj(true);
    }

    public final void zzd() {
        zzi();
    }

    public final void zze(float f10) {
        this.zzg = f10;
        zzj(false);
    }

    public final void zzf(float f10) {
        if (this.zze == f10) {
            return;
        }
        this.zze = f10;
        zzj(false);
    }

    public final void zzg() {
        this.zzc = false;
        zzaeg zzaegVar = this.zzb;
        if (zzaegVar != null) {
            zzaegVar.zzb();
        }
        zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzh(long r19, long r21, long r23, long r25) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r3 = r25
            long r5 = r0.zzm
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L1a
            long r7 = r0.zzk
            r0.zzn = r7
            long r7 = r0.zzl
            r0.zzo = r7
            r0.zzp = r5
            long r5 = r0.zzj
            r0.zzi = r5
        L1a:
            long r5 = r0.zzn
            r7 = -1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L52
            int r7 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r7 == 0) goto L35
            long r5 = r3 - r5
            float r7 = r0.zzg
            long r5 = r5 * r23
        L31:
            float r5 = (float) r5
            float r5 = r5 / r7
            long r5 = (long) r5
            goto L3f
        L35:
            long r5 = r0.zzp
            long r5 = r1 - r5
            float r7 = r0.zzg
            r10 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r10
            goto L31
        L3f:
            long r10 = r0.zzo
            long r10 = r10 + r5
            long r5 = r19 - r10
            long r5 = java.lang.Math.abs(r5)
            r12 = 20000000(0x1312d00, double:9.881313E-317)
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L54
            r0.zzi()
        L52:
            r10 = r19
        L54:
            r0.zzk = r3
            r0.zzl = r10
            r0.zzm = r1
            com.google.android.gms.internal.ads.zzaeg r1 = r0.zzb
            if (r1 != 0) goto L60
            goto Lc3
        L60:
            long r1 = r1.zzc
            com.google.android.gms.internal.ads.zzaeg r3 = r0.zzb
            long r3 = r3.zzd
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 == 0) goto Lc3
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto Lc3
            long r5 = r10 - r1
            long r5 = r5 / r3
            long r5 = r5 * r3
            long r5 = r5 + r1
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 > 0) goto L7a
            long r1 = r5 - r3
            goto L81
        L7a:
            long r1 = r5 + r3
            r16 = r5
            r5 = r1
            r1 = r16
        L81:
            r7 = 2
            long r7 = r3 / r7
            long r12 = r5 - r10
            long r10 = r10 - r1
            long r14 = r12 - r10
            long r14 = java.lang.Math.abs(r14)
            int r7 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r7 >= 0) goto Lb1
            r7 = 4
            long r7 = r3 / r7
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 >= 0) goto Lae
            r19 = 0
            long r14 = r0.zzi
            int r9 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r9 == 0) goto La5
        La2:
            r0.zzj = r14
            goto Lb4
        La5:
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 >= 0) goto Laa
            long r7 = -r7
        Laa:
            r0.zzj = r7
            r14 = r7
            goto Lb4
        Lae:
            r7 = 0
            goto Laa
        Lb1:
            long r14 = r0.zzi
            goto La2
        Lb4:
            long r12 = r12 + r14
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 >= 0) goto Lba
            goto Lbb
        Lba:
            r5 = r1
        Lbb:
            r1 = 80
            long r3 = r3 * r1
            r1 = 100
            long r3 = r3 / r1
            long r5 = r5 - r3
            return r5
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaek.zzh(long, long, long, long):long");
    }
}
