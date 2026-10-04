package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzfy implements zzji {
    private final zzfx zza;

    private zzfy(zzfx zzfxVar) {
        this.zza = zzfxVar;
        zzfxVar.zza = this;
    }

    public static zzfy zza(zzfx zzfxVar) {
        Object obj = zzfxVar.zza;
        return obj != null ? (zzfy) obj : new zzfy(zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzA(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhj)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z10) {
            while (i11 < zzhjVar.size()) {
                this.zza.zzj(i10, zzhjVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhjVar.size(); i15++) {
            zzhjVar.zze(i15);
            i14 += 8;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzhjVar.size()) {
            zzfxVar2.zzk(zzhjVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzC(int i10, int i11) throws IOException {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzfx zzfxVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzfxVar.zzt(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzfx zzfxVar2 = this.zza;
            zzfxVar2.zzs(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzy += zzfx.zzy((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzfxVar2.zzu(iZzy);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzfxVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z10) {
            while (i11 < zzgqVar.size()) {
                zzfx zzfxVar3 = this.zza;
                int iZze = zzgqVar.zze(i11);
                zzfxVar3.zzt(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        zzfx zzfxVar4 = this.zza;
        zzfxVar4.zzs(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzgqVar.size(); i13++) {
            int iZze2 = zzgqVar.zze(i13);
            iZzy2 += zzfx.zzy((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzfxVar4.zzu(iZzy2);
        while (i11 < zzgqVar.size()) {
            int iZze3 = zzgqVar.zze(i11);
            zzfxVar4.zzu((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzE(int i10, long j10) throws IOException {
        this.zza.zzv(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzF(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhj)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzfx zzfxVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzfxVar.zzv(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzfx zzfxVar2 = this.zza;
            zzfxVar2.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzz += zzfx.zzz((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzfxVar2.zzu(iZzz);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzfxVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z10) {
            while (i11 < zzhjVar.size()) {
                zzfx zzfxVar3 = this.zza;
                long jZze = zzhjVar.zze(i11);
                zzfxVar3.zzv(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        zzfx zzfxVar4 = this.zza;
        zzfxVar4.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhjVar.size(); i13++) {
            long jZze2 = zzhjVar.zze(i13);
            iZzz2 += zzfx.zzz((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzfxVar4.zzu(iZzz2);
        while (i11 < zzhjVar.size()) {
            long jZze3 = zzhjVar.zze(i11);
            zzfxVar4.zzw((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    @Deprecated
    public final void zzG(int i10) throws IOException {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzH(int i10, String str) throws IOException {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzI(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhd)) {
            while (i11 < list.size()) {
                this.zza.zzq(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzhd zzhdVar = (zzhd) list;
        while (i11 < list.size()) {
            Object objZza = zzhdVar.zza();
            if (objZza instanceof String) {
                this.zza.zzq(i10, (String) objZza);
            } else {
                this.zza.zzf(i10, (zzfp) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzJ(int i10, int i11) throws IOException {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzfx.zzy(((Integer) list.get(i12)).intValue());
            }
            zzfxVar.zzu(iZzy);
            while (i11 < list.size()) {
                zzfxVar.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z10) {
            while (i11 < zzgqVar.size()) {
                this.zza.zzt(i10, zzgqVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzgqVar.size(); i13++) {
            iZzy2 += zzfx.zzy(zzgqVar.zze(i13));
        }
        zzfxVar2.zzu(iZzy2);
        while (i11 < zzgqVar.size()) {
            zzfxVar2.zzu(zzgqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzL(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzM(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhj)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfx.zzz(((Long) list.get(i12)).longValue());
            }
            zzfxVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfxVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z10) {
            while (i11 < zzhjVar.size()) {
                this.zza.zzv(i10, zzhjVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhjVar.size(); i13++) {
            iZzz2 += zzfx.zzz(zzhjVar.zze(i13));
        }
        zzfxVar2.zzu(iZzz2);
        while (i11 < zzhjVar.size()) {
            zzfxVar2.zzw(zzhjVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzff)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzff zzffVar = (zzff) list;
        if (!z10) {
            while (i11 < zzffVar.size()) {
                this.zza.zzd(i10, zzffVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzffVar.size(); i15++) {
            zzffVar.zzf(i15);
            i14++;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzffVar.size()) {
            zzfxVar2.zzb(zzffVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzd(int i10, zzfp zzfpVar) throws IOException {
        this.zza.zzf(i10, zzfpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzf(i10, (zzfp) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzfz zzfzVar = (zzfz) list;
        if (!z10) {
            while (i11 < zzfzVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzfzVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzfzVar.size(); i15++) {
            zzfzVar.zze(i15);
            i14 += 8;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzfzVar.size()) {
            zzfxVar2.zzk(Double.doubleToRawLongBits(zzfzVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfx.zzz(((Integer) list.get(i12)).intValue());
            }
            zzfxVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfxVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z10) {
            while (i11 < zzgqVar.size()) {
                this.zza.zzl(i10, zzgqVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzgqVar.size(); i13++) {
            iZzz2 += zzfx.zzz(zzgqVar.zze(i13));
        }
        zzfxVar2.zzu(iZzz2);
        while (i11 < zzgqVar.size()) {
            zzfxVar2.zzm(zzgqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z10) {
            while (i11 < zzgqVar.size()) {
                this.zza.zzh(i10, zzgqVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgqVar.size(); i15++) {
            zzgqVar.zze(i15);
            i14 += 4;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzgqVar.size()) {
            zzfxVar2.zzi(zzgqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhj)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z10) {
            while (i11 < zzhjVar.size()) {
                this.zza.zzj(i10, zzhjVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhjVar.size(); i15++) {
            zzhjVar.zze(i15);
            i14 += 8;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzhjVar.size()) {
            zzfxVar2.zzk(zzhjVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgj)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzgj zzgjVar = (zzgj) list;
        if (!z10) {
            while (i11 < zzgjVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzgjVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgjVar.size(); i15++) {
            zzgjVar.zze(i15);
            i14 += 4;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzgjVar.size()) {
            zzfxVar2.zzi(Float.floatToRawIntBits(zzgjVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzq(int i10, Object obj, zzib zzibVar) throws IOException {
        zzfx zzfxVar = this.zza;
        zzfxVar.zzs(i10, 3);
        zzibVar.zzi((zzfa) obj, this);
        zzfxVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfx.zzz(((Integer) list.get(i12)).intValue());
            }
            zzfxVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfxVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z10) {
            while (i11 < zzgqVar.size()) {
                this.zza.zzl(i10, zzgqVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzgqVar.size(); i13++) {
            iZzz2 += zzfx.zzz(zzgqVar.zze(i13));
        }
        zzfxVar2.zzu(iZzz2);
        while (i11 < zzgqVar.size()) {
            zzfxVar2.zzm(zzgqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhj)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfx.zzz(((Long) list.get(i12)).longValue());
            }
            zzfxVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfxVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z10) {
            while (i11 < zzhjVar.size()) {
                this.zza.zzv(i10, zzhjVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhjVar.size(); i13++) {
            iZzz2 += zzfx.zzz(zzhjVar.zze(i13));
        }
        zzfxVar2.zzu(iZzz2);
        while (i11 < zzhjVar.size()) {
            zzfxVar2.zzw(zzhjVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzv(int i10, zzhk zzhkVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            zzfxVar.zzu(zzhl.zzb(zzhkVar, entry.getKey(), entry.getValue()));
            zzhl.zze(zzfxVar, zzhkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzw(int i10, Object obj, zzib zzibVar) throws IOException {
        zzfx zzfxVar = this.zza;
        zzfa zzfaVar = (zzfa) obj;
        zzfxVar.zzs(i10, 2);
        zzfxVar.zzu(zzfaVar.zzi(zzibVar));
        zzibVar.zzi(zzfaVar, this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzx(int i10, Object obj) throws IOException {
        if (obj instanceof zzfp) {
            this.zza.zzp(i10, (zzfp) obj);
        } else {
            this.zza.zzo(i10, (zzhr) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzy(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzfxVar.zzu(i12);
            while (i11 < list.size()) {
                zzfxVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z10) {
            while (i11 < zzgqVar.size()) {
                this.zza.zzh(i10, zzgqVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgqVar.size(); i15++) {
            zzgqVar.zze(i15);
            i14 += 4;
        }
        zzfxVar2.zzu(i14);
        while (i11 < zzgqVar.size()) {
            zzfxVar2.zzi(zzgqVar.zze(i11));
            i11++;
        }
    }
}
