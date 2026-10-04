package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgjd extends zzgka {
    private final Activity zza;
    private final View zzb;

    public zzgjd(zzaya zzayaVar, zzgiw zzgiwVar, View view, Activity activity, zzgrh zzgrhVar) {
        super("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", zzayaVar, zzgiwVar, zzgrhVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzayaVar) {
            zzayaVar.zzS(((Long) objArr[0]).longValue());
            zzayaVar.zzT(((Long) objArr[1]).longValue());
            zzayaVar.zzU((String) objArr[2]);
        }
    }
}
