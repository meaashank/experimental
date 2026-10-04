package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtc implements ServiceConnection {
    final /* synthetic */ zzgti zza;

    public /* synthetic */ zzgtc(zzgti zzgtiVar, byte[] bArr) {
        Objects.requireNonNull(zzgtiVar);
        this.zza = zzgtiVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Object[] objArr = {componentName};
        zzgti zzgtiVar = this.zza;
        zzgtiVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        zzgtiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgtb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface iInterfaceZzm;
                zzgrm zzgrmVarZza = zzgrl.zza(iBinder);
                zzgtc zzgtcVar = this.zza;
                zzgti zzgtiVar2 = zzgtcVar.zza;
                zzgtiVar2.zzn(zzgrmVarZza);
                zzgtiVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    iInterfaceZzm = zzgtiVar2.zzm();
                } catch (RemoteException e10) {
                    zzgtcVar.zza.zzi().zzd(e10, "linkToDeath failed", new Object[0]);
                }
                if (iInterfaceZzm == null) {
                    throw null;
                }
                iInterfaceZzm.asBinder().linkToDeath(zzgtiVar2.zzl(), 0);
                zzgti zzgtiVar3 = zzgtcVar.zza;
                zzgtiVar3.zzk(false);
                synchronized (zzgtiVar3.zzj()) {
                    try {
                        Iterator it = zzgtiVar3.zzj().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzgtiVar3.zzj().clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        zzgti zzgtiVar = this.zza;
        zzgtiVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        zzgtiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgti zzgtiVar2 = this.zza.zza;
                zzgtiVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgtiVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgtiVar2.zzl(), 0);
                zzgtiVar2.zzn(null);
                zzgtiVar2.zzk(false);
            }
        });
    }
}
