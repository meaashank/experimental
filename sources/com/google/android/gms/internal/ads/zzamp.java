package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamp implements zzagh {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private zzagk zzE;
    private zzamo[] zzF;

    @Nullable
    private long[][] zzG;
    private int zzH;
    private final zzanx zzb;
    private final int zzc;
    private final zzeu zzd;
    private final zzeu zze;
    private final zzeu zzf;
    private final zzeu zzg;
    private final ArrayDeque zzh;
    private final zzamt zzi;
    private final List zzj;
    private final List zzk;
    private final List zzl;
    private zzgxm zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;

    @Nullable
    private zzeu zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private long zzz;

    @Deprecated
    public zzamp() {
        this(zzanx.zza, 16);
    }

    public static /* synthetic */ long zzh(zzamz zzamzVar, long j10, long j11) {
        int iZzl = zzl(zzamzVar, j10);
        return iZzl == -1 ? j11 : Math.min(zzamzVar.zzc[iZzl], j11);
    }

    private final void zzj() {
        this.zzn = 0;
        this.zzq = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(long r46) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamp.zzk(long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzamz zzamzVar, long j10) {
        int iZzb = zzamzVar.zzb(j10);
        return iZzb == -1 ? zzamzVar.zzc(j10) : iZzb;
    }

    private static int zzm(int i10) {
        return i10 != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzaho zzahoVarZzb = zzamu.zzb(zzagiVar);
        this.zzm = zzahoVarZzb != null ? zzgxm.zzj(zzahoVarZzb) : zzgxm.zzi();
        return zzahoVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ List zzb() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        if ((this.zzc & 16) == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.zzb);
        }
        this.zzE = zzagkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x045d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
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
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagi r43, com.google.android.gms.internal.ads.zzahh r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamp.zzd(com.google.android.gms.internal.ads.zzagi, com.google.android.gms.internal.ads.zzahh):int");
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        this.zzh.clear();
        this.zzq = 0;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzk.clear();
        this.zzl.clear();
        if (j10 == 0) {
            if (this.zzn != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzamo zzamoVar : this.zzF) {
            zzamz zzamzVar = zzamoVar.zzb;
            int iZzb = zzamzVar.zzb(j11);
            if (iZzb == -1) {
                iZzb = zzamzVar.zzc(j11);
            }
            zzamoVar.zze = iZzb;
            zzahu zzahuVar = zzamoVar.zzd;
            if (zzahuVar != null) {
                zzahuVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }

    public zzamp(zzanx zzanxVar, int i10) {
        this.zzb = zzanxVar;
        this.zzc = i10;
        this.zzm = zzgxm.zzi();
        this.zzn = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzamt();
        this.zzj = new ArrayList();
        this.zzg = new zzeu(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzeu(zzgr.zza);
        this.zze = new zzeu(6);
        this.zzf = new zzeu();
        this.zzs = -1;
        this.zzE = zzagk.zza;
        this.zzF = new zzamo[0];
        this.zzk = new ArrayList();
        this.zzl = new ArrayList();
    }
}
