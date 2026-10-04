package com.prism.commons.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final String f161977a3 = "com.prism.commons.ipc.IGServiceProvider";

    /* JADX INFO: renamed from: com.prism.commons.ipc.a$a, reason: collision with other inner class name */
    public static class C0659a implements a {
        @Override // com.prism.commons.ipc.a
        public IBinder C5(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.commons.ipc.a
        public String V4() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f161978a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f161979b = 2;

        /* JADX INFO: renamed from: com.prism.commons.ipc.a$b$a, reason: collision with other inner class name */
        public static class C0660a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f161980a;

            public C0660a(IBinder iBinder) {
                this.f161980a = iBinder;
            }

            @Override // com.prism.commons.ipc.a
            public IBinder C5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f161977a3);
                    parcelObtain.writeString(str);
                    this.f161980a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return a.f161977a3;
            }

            @Override // com.prism.commons.ipc.a
            public String V4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f161977a3);
                    this.f161980a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f161980a;
            }
        }

        public b() {
            attachInterface(this, a.f161977a3);
        }

        public static a U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f161977a3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0660a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f161977a3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f161977a3);
                return true;
            }
            if (i10 == 1) {
                String strV4 = V4();
                parcel2.writeNoException();
                parcel2.writeString(strV4);
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                IBinder iBinderC5 = C5(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderC5);
            }
            return true;
        }
    }

    IBinder C5(String str) throws RemoteException;

    String V4() throws RemoteException;
}
