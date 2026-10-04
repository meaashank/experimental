package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzpu {
    private final zzbd zza;
    private zzgxm zzb = zzgxm.zzi();
    private zzgxp zzc = zzgxp.zza();

    @Nullable
    private zzxo zzd;
    private zzxo zze;
    private zzxo zzf;

    public zzpu(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgxo zzgxoVar = new zzgxo();
        if (this.zzb.isEmpty()) {
            zzk(zzgxoVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgxoVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgxoVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzgxoVar, (zzxo) this.zzb.get(i10), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgxoVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgxoVar.zzc();
    }

    private final void zzk(zzgxo zzgxoVar, @Nullable zzxo zzxoVar, zzbf zzbfVar) {
        if (zzxoVar == null) {
            return;
        }
        if (zzbfVar.zze(zzxoVar.zza) != -1) {
            zzgxoVar.zza(zzxoVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzxoVar);
        if (zzbfVar2 != null) {
            zzgxoVar.zza(zzxoVar, zzbfVar2);
        }
    }

    @Nullable
    private static zzxo zzl(zzbb zzbbVar, zzgxm zzgxmVar, @Nullable zzxo zzxoVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = -1;
        if (!zzbbVar.zzx() && !zzbfVarZzq.zzg()) {
            iZzf = zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzfm.zzt(zzbbVar.zzu()));
        }
        int i10 = iZzf;
        for (int i11 = 0; i11 < zzgxmVar.size(); i11++) {
            zzxo zzxoVar2 = (zzxo) zzgxmVar.get(i11);
            if (zzm(zzxoVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i10)) {
                return zzxoVar2;
            }
        }
        if (zzgxmVar.isEmpty() && zzxoVar != null && zzm(zzxoVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i10)) {
            return zzxoVar;
        }
        return null;
    }

    private static boolean zzm(zzxo zzxoVar, @Nullable Object obj, boolean z10, int i10, int i11, int i12) {
        if (zzxoVar.zza.equals(obj)) {
            return z10 ? zzxoVar.zzb == i10 && zzxoVar.zzc == i11 : zzxoVar.zzb == -1 && zzxoVar.zze == i12;
        }
        return false;
    }

    @Nullable
    public final zzxo zza() {
        return this.zzd;
    }

    @Nullable
    public final zzxo zzb() {
        return this.zze;
    }

    @Nullable
    public final zzxo zzc() {
        return this.zzf;
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
    @Nullable
    public final zzxo zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (androidx.activity.D.a(list)) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzxo) objLast;
    }

    @Nullable
    public final zzbf zze(zzxo zzxoVar) {
        return (zzbf) this.zzc.get(zzxoVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, @Nullable zzxo zzxoVar, zzbb zzbbVar) {
        this.zzb = zzgxm.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzxo) list.get(0);
            zzxoVar.getClass();
            this.zzf = zzxoVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    public final /* synthetic */ zzgxm zzi() {
        return this.zzb;
    }
}
