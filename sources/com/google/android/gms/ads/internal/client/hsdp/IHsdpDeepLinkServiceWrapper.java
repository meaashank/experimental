package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IHsdpDeepLinkServiceWrapper extends IInterface {

    public static abstract class Stub extends zzbev implements IHsdpDeepLinkServiceWrapper {

        public static class Proxy extends zzbeu implements IHsdpDeepLinkServiceWrapper {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                zzbew.zze(parcelZzcZ, iObjectWrapper);
                parcelZzcZ.writeString(str);
                zzdb(2, parcelZzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                zzbew.zze(parcelZzcZ, iObjectWrapper);
                parcelZzcZ.writeString(str);
                parcelZzcZ.writeString(str2);
                zzbew.zzc(parcelZzcZ, bundle);
                parcelZzcZ.writeInt(z10 ? 1 : 0);
                zzbew.zze(parcelZzcZ, iHsdpServiceCallback);
                zzdb(3, parcelZzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                zzbew.zze(parcelZzcZ, iObjectWrapper);
                parcelZzcZ.writeTypedList(list);
                zzbew.zze(parcelZzcZ, iHsdpPrewarmServiceCallback);
                zzdb(1, parcelZzcZ);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        }

        @NonNull
        public static IHsdpDeepLinkServiceWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            return iInterfaceQueryLocalInterface instanceof IHsdpDeepLinkServiceWrapper ? (IHsdpDeepLinkServiceWrapper) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        public boolean dispatchTransaction(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallbackAsInterface = IHsdpPrewarmServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                prewarm(iObjectWrapperAsInterface, arrayListCreateTypedArrayList, iHsdpPrewarmServiceCallbackAsInterface);
            } else if (i10 == 2) {
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                zzbew.zzh(parcel);
                endSession(iObjectWrapperAsInterface2, string);
            } else {
                if (i10 != 3) {
                    return false;
                }
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                boolean zZza = zzbew.zza(parcel);
                IHsdpServiceCallback iHsdpServiceCallbackAsInterface = IHsdpServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                open(iObjectWrapperAsInterface3, string2, string3, bundle, zZza, iHsdpServiceCallbackAsInterface);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException;

    void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException;

    void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException;
}
