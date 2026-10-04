package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgae {

    @e.f0
    final zzgah zza;

    @e.f0
    final boolean zzb;

    private zzgae(zzgah zzgahVar) {
        this.zza = zzgahVar;
        this.zzb = zzgahVar != null;
    }

    public static zzgae zzb(Context context, String str, String str2) {
        zzgah zzgafVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzgafVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzgafVar = iInterfaceQueryLocalInterface instanceof zzgah ? (zzgah) iInterfaceQueryLocalInterface : new zzgaf(iBinderInstantiate);
                    }
                    zzgafVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzgae(zzgafVar);
                } catch (Exception e10) {
                    throw new zzfzh(e10);
                }
            } catch (RemoteException | zzfzh | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzgae(new zzgai());
            }
        } catch (Exception e11) {
            throw new zzfzh(e11);
        }
    }

    public static zzgae zzc() {
        zzgai zzgaiVar = new zzgai();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzgae(zzgaiVar);
    }

    public final zzgad zza(byte[] bArr) {
        return new zzgad(this, bArr, null);
    }
}
