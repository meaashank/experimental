package com.prism.gaia.server;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.bugreport.commons.ParcelableException;

/* JADX INFO: loaded from: classes6.dex */
public interface Q extends IInterface {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final String f166265j3 = "com.prism.gaia.server.IBugReporter";

    public static class a implements Q {
        @Override // com.prism.gaia.server.Q
        public void S4() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.Q
        public void b5(ParcelableException parcelableException, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Q
        public void x2(String str) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166266a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166267b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166268c = 3;

        public static class a implements Q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166269a;

            public a(IBinder iBinder) {
                this.f166269a = iBinder;
            }

            @Override // com.prism.gaia.server.Q
            public void S4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Q.f166265j3);
                    this.f166269a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return Q.f166265j3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166269a;
            }

            @Override // com.prism.gaia.server.Q
            public void b5(ParcelableException parcelableException, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Q.f166265j3);
                    c.d(parcelObtain, parcelableException, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    c.d(parcelObtain, bundle, 0);
                    this.f166269a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Q
            public void x2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Q.f166265j3);
                    parcelObtain.writeString(str);
                    this.f166269a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, Q.f166265j3);
        }

        public static Q U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Q.f166265j3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Q)) ? new a(iBinder) : (Q) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(Q.f166265j3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(Q.f166265j3);
                return true;
            }
            if (i10 == 1) {
                b5((ParcelableException) c.c(parcel, ParcelableException.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i10 == 2) {
                x2(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                S4();
                parcel2.writeNoException();
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

    void S4() throws RemoteException;

    void b5(ParcelableException parcelableException, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    void x2(String str) throws RemoteException;
}
