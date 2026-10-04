package com.prism.gaia.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface e0 extends IInterface {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final String f167349t3 = "com.prism.gaia.server.IStaticBroadcastProxy";

    public static class a implements e0 {
        @Override // com.prism.gaia.server.e0
        public void V3() throws RemoteException {
        }

        @Override // com.prism.gaia.server.e0
        public void Z0() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167350a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f167351b = 2;

        public static class a implements e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f167352a;

            public a(IBinder iBinder) {
                this.f167352a = iBinder;
            }

            public String U0() {
                return e0.f167349t3;
            }

            @Override // com.prism.gaia.server.e0
            public void V3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e0.f167349t3);
                    this.f167352a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.e0
            public void Z0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e0.f167349t3);
                    this.f167352a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f167352a;
            }
        }

        public b() {
            attachInterface(this, e0.f167349t3);
        }

        public static e0 U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e0.f167349t3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e0)) ? new a(iBinder) : (e0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(e0.f167349t3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(e0.f167349t3);
                return true;
            }
            if (i10 == 1) {
                V3();
                parcel2.writeNoException();
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Z0();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void V3() throws RemoteException;

    void Z0() throws RemoteException;
}
