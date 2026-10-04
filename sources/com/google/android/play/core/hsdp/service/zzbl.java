package com.google.android.play.core.hsdp.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbl implements ServiceConnection {
    final /* synthetic */ zzbn zza;

    public /* synthetic */ zzbl(zzbn zzbnVar, zzbm zzbmVar) {
        Objects.requireNonNull(zzbnVar);
        this.zza = zzbnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.zza.zzt(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzbj
            @Override // java.lang.Runnable
            public final void run() {
                IInterface iInterface;
                zzbl zzblVar = this.zza;
                zzbn zzbnVar = zzblVar.zza;
                zzbnVar.zzk = (IInterface) zzbnVar.zzh.zza(iBinder);
                Log.i("ServiceConnMgrImpl", "notifyOnConnected");
                zzbn.zzp(zzbnVar);
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "linkToDeath");
                }
                try {
                    iInterface = zzbnVar.zzk;
                } catch (RemoteException e10) {
                    Log.e("ServiceConnMgrImpl", "linkToDeath failed", e10);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(zzbnVar.zzi, 0);
                zzbn zzbnVar2 = zzblVar.zza;
                zzbnVar2.zzf = false;
                synchronized (zzbnVar2.zzd) {
                    try {
                        Iterator it = zzbnVar2.zzd.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzbnVar2.zzd.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        this.zza.zzt(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                zzbn zzbnVar = this.zza.zza;
                if (zzbnVar.zzk != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "unlinkToDeath");
                    }
                    IInterface iInterface = zzbnVar.zzk;
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath(zzbnVar.zzi, 0);
                    zzbnVar.zzk = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    zzbnVar.zzs();
                }
                zzbnVar.zzf = false;
            }
        });
    }
}
