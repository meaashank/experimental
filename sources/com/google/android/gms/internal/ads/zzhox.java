package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhox {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzhox() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzhox zza(zzhna zzhnaVar) throws GeneralSecurityException {
        zzhoz zzhozVar = new zzhoz(zzhnaVar.zzb(), zzhnaVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhozVar)) {
            map.put(zzhozVar, zzhnaVar);
            return this;
        }
        zzhna zzhnaVar2 = (zzhna) map.get(zzhozVar);
        if (zzhnaVar2.equals(zzhnaVar) && zzhnaVar.equals(zzhnaVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhozVar.toString()));
    }

    public final zzhox zzb(zzhmx zzhmxVar) throws GeneralSecurityException {
        zzhoy zzhoyVar = new zzhoy(zzhmxVar.zzc(), zzhmxVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzhoyVar)) {
            map.put(zzhoyVar, zzhmxVar);
            return this;
        }
        zzhmx zzhmxVar2 = (zzhmx) map.get(zzhoyVar);
        if (zzhmxVar2.equals(zzhmxVar) && zzhmxVar.equals(zzhmxVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhoyVar.toString()));
    }

    public final zzhox zzc(zzhod zzhodVar) throws GeneralSecurityException {
        zzhoz zzhozVar = new zzhoz(zzhodVar.zzb(), zzhodVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzhozVar)) {
            map.put(zzhozVar, zzhodVar);
            return this;
        }
        zzhod zzhodVar2 = (zzhod) map.get(zzhozVar);
        if (zzhodVar2.equals(zzhodVar) && zzhodVar.equals(zzhodVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhozVar.toString()));
    }

    public final zzhox zzd(zzhoa zzhoaVar) throws GeneralSecurityException {
        zzhoy zzhoyVar = new zzhoy(zzhoaVar.zzc(), zzhoaVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzhoyVar)) {
            map.put(zzhoyVar, zzhoaVar);
            return this;
        }
        zzhoa zzhoaVar2 = (zzhoa) map.get(zzhoyVar);
        if (zzhoaVar2.equals(zzhoaVar) && zzhoaVar.equals(zzhoaVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhoyVar.toString()));
    }

    public final /* synthetic */ Map zze() {
        return this.zza;
    }

    public final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public zzhox(zzhpa zzhpaVar) {
        this.zza = new HashMap(zzhpaVar.zzg());
        this.zzb = new HashMap(zzhpaVar.zzh());
        this.zzc = new HashMap(zzhpaVar.zzi());
        this.zzd = new HashMap(zzhpaVar.zzj());
    }
}
