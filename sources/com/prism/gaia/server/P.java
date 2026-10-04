package com.prism.gaia.server;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface P extends IInterface {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final String f166261i3 = "com.prism.gaia.server.IBinderDelegateService";

    public static class a implements P {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.P
        public ComponentName f5() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.P
        public IBinder getService() throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166262a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166263b = 2;

        public static class a implements P {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166264a;

            public a(IBinder iBinder) {
                this.f166264a = iBinder;
            }

            public String U0() {
                return P.f166261i3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166264a;
            }

            @Override // com.prism.gaia.server.P
            public ComponentName f5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P.f166261i3);
                    this.f166264a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ComponentName) c.c(parcelObtain2, ComponentName.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.P
            public IBinder getService() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P.f166261i3);
                    this.f166264a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, P.f166261i3);
        }

        public static P U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(P.f166261i3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof P)) ? new a(iBinder) : (P) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(P.f166261i3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(P.f166261i3);
                return true;
            }
            if (i10 == 1) {
                ComponentName componentNameF5 = f5();
                parcel2.writeNoException();
                c.d(parcel2, componentNameF5, 1);
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                IBinder service = getService();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(service);
            }
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

    ComponentName f5() throws RemoteException;

    IBinder getService() throws RemoteException;
}
