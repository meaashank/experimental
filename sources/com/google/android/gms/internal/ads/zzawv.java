package com.google.android.gms.internal.ads;

import androidx.compose.material.C1846b;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawv {
    public final zzavq zza;
    public final zzawr zzb;
    public final zzawo zzc;
    public final zzawj zzd;

    public zzawv(zzavq zzavqVar, zzawr zzawrVar, zzawj zzawjVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        this.zza = zzavqVar;
        this.zzb = zzawrVar;
        this.zzd = zzawjVar;
        this.zzc = new zzawo(C1846b.a((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16) ^ (i17 % 454333378));
    }

    public final Optional zza() {
        zzavk zzavkVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzawn();
            }
            zzawl zzawlVar = (zzawl) arrayDeque.pop();
            long j10 = zzawlVar.zza;
            long j11 = zzawlVar.zzb;
            long j12 = zzawlVar.zzc;
            zzawr zzawrVar = this.zzb;
            if (zzawrVar.zzb < j11) {
                return Optional.of(zzavk.zzG);
            }
            this.zzd.zza(j10);
            if (j12 == 0) {
                while (zzawrVar.zzb > j11) {
                    zzawrVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzawh e10) {
            e = e10;
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawi e11) {
            e = e11;
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawn unused) {
            zzavkVar = zzavk.zzw;
            return Optional.of(zzavkVar);
        } catch (zzawp unused2) {
            zzavkVar = zzavk.zzG;
            return Optional.of(zzavkVar);
        }
    }
}
