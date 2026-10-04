package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzcab;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzccn;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbt extends zzbev implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzY(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbh zzbfVar = null;
        zzcs zzcqVar = null;
        zzbk zzbiVar = null;
        zzdq zzdoVar = null;
        zzby zzbwVar = null;
        zzcp zzcpVar = null;
        zzbe zzbcVar = null;
        zzcl zzcjVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperZza = zza();
                parcel2.writeNoException();
                zzbew.zze(parcel2, iObjectWrapperZza);
                return true;
            case 2:
                zzb();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzc = zzc();
                parcel2.writeNoException();
                int i12 = zzbew.zza;
                parcel2.writeInt(zZzc ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzbew.zzb(parcel, zzm.CREATOR);
                zzbew.zzh(parcel);
                boolean zZzd = zzd(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 5:
                zze();
                parcel2.writeNoException();
                return true;
            case 6:
                zzf();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzbew.zzh(parcel);
                zzg(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcjVar = iInterfaceQueryLocalInterface2 instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface2 : new zzcj(strongBinder2);
                }
                zzbew.zzh(parcel);
                zzdU(zzcjVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzk();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzl();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarZzm = zzm();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzrVarZzm);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                zzbew.zzh(parcel);
                zzn(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzcac zzcacVarZza = zzcab.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzo(zzcacVarZza);
                parcel2.writeNoException();
                return true;
            case 15:
                zzcaf zzcafVarZza = zzcae.zza(parcel.readStrongBinder());
                String string = parcel.readString();
                zzbew.zzh(parcel);
                zzp(zzcafVarZza, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 19:
                zzbkb zzbkbVarZza = zzbka.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzw(zzbkbVarZza);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface3 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface3 : new zzbc(strongBinder3);
                }
                zzbew.zzh(parcel);
                zzx(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface4 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface4 : new zzcp(strongBinder4);
                }
                zzbew.zzh(parcel);
                zzX(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZza = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzy(zZza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i13 = zzbew.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 24:
                zzccn zzccnVarZza = zzccm.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzB(zzccnVarZza);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzbew.zzh(parcel);
                zzC(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzeaVarZzE = zzE();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzeaVarZzE);
                return true;
            case 29:
                zzfw zzfwVar = (zzfw) zzbew.zzb(parcel, zzfw.CREATOR);
                zzbew.zzh(parcel);
                zzF(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzee zzeeVar = (zzee) zzbew.zzb(parcel, zzee.CREATOR);
                zzbew.zzh(parcel);
                zzG(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 32:
                zzcl zzclVarZzu = zzu();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzclVarZzu);
                return true;
            case 33:
                zzbh zzbhVarZzv = zzv();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzbhVarZzv);
                return true;
            case 34:
                boolean zZza2 = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzJ(zZza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface5 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface5 : new zzbw(strongBinder5);
                }
                zzbew.zzh(parcel);
                zzi(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzj = zzj();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, bundleZzj);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzbew.zzh(parcel);
                zzD(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzbew.zzb(parcel, zzx.CREATOR);
                zzbew.zzh(parcel);
                zzH(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbhc zzbhcVarZzd = zzbhb.zzd(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzI(zzbhcVarZzd);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzdxVarZzs = zzs();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzdxVarZzs);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdoVar = iInterfaceQueryLocalInterface6 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface6 : new zzdo(strongBinder6);
                }
                zzbew.zzh(parcel);
                zzO(zzdoVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzbew.zzb(parcel, zzm.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface7 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface7 : new zzbi(strongBinder7);
                }
                zzbew.zzh(parcel);
                zzP(zzmVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzQ(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcqVar = iInterfaceQueryLocalInterface8 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface8 : new zzcq(strongBinder8);
                }
                zzbew.zzh(parcel);
                zzR(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzz = zzz();
                parcel2.writeNoException();
                int i14 = zzbew.zza;
                parcel2.writeInt(zZzz ? 1 : 0);
                return true;
            case 47:
                long jZzT = zzT();
                parcel2.writeNoException();
                parcel2.writeLong(jZzT);
                return true;
            case 48:
                long j10 = parcel.readLong();
                zzbew.zzh(parcel);
                zzS(j10);
                parcel2.writeNoException();
                return true;
        }
    }
}
