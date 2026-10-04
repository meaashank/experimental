package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgjn extends zzgka {
    private final zzgei zza;

    public zzgjn(zzaya zzayaVar, zzgiw zzgiwVar, zzgei zzgeiVar, zzgrh zzgrhVar) {
        super("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", zzayaVar, zzgiwVar, zzgrhVar.zza(116));
        this.zza = zzgeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzd());
        objArr.getClass();
        synchronized (zzayaVar) {
            zzayaVar.zzb((String) objArr[0]);
            zzayaVar.zzaa((String) objArr[1]);
        }
    }
}
