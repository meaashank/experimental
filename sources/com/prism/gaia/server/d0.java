package com.prism.gaia.server;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface d0 extends IInterface {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final String f167344s3 = "com.prism.gaia.server.IStaticBroadcastProcessor";

    public static class a implements d0 {
        @Override // com.prism.gaia.server.d0
        public void P4(Intent intent) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167345a = 1;

        public static class a implements d0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f167346a;

            public a(IBinder iBinder) {
                this.f167346a = iBinder;
            }

            @Override // com.prism.gaia.server.d0
            public void P4(Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.f167344s3);
                    c.d(parcelObtain, intent, 0);
                    this.f167346a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return d0.f167344s3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f167346a;
            }
        }

        public b() {
            attachInterface(this, d0.f167344s3);
        }

        public static d0 U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d0.f167344s3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d0)) ? new a(iBinder) : (d0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(d0.f167344s3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(d0.f167344s3);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            P4((Intent) c.c(parcel, Intent.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class c {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void P4(Intent intent) throws RemoteException;
}
