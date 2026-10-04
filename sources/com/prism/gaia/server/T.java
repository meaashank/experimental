package com.prism.gaia.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.remote.GuestProcessInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface T extends IInterface {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final String f166303l3 = "com.prism.gaia.server.IGProcessSupervisor";

    public static class a implements T {
        @Override // com.prism.gaia.server.T
        public boolean I5(String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.T
        public boolean J(int i10, String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.T
        public String L2() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.T
        public void W1(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.T
        public void a2(int i10, String str) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.T
        public void h4(int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.T
        public void u5() throws RemoteException {
        }

        @Override // com.prism.gaia.server.T
        public GuestProcessInfo x1(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.T
        public IBinder y0(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166304a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166305b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166306c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166307d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166308e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166309f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166310g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166311h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166312i = 9;

        public static class a implements T {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166313a;

            public a(IBinder iBinder) {
                this.f166313a = iBinder;
            }

            @Override // com.prism.gaia.server.T
            public boolean I5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeString(str);
                    this.f166313a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.T
            public boolean J(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f166313a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.T
            public String L2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    this.f166313a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return T.f166303l3;
            }

            @Override // com.prism.gaia.server.T
            public void W1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166313a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.T
            public void a2(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f166313a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166313a;
            }

            @Override // com.prism.gaia.server.T
            public void h4(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeInt(i10);
                    this.f166313a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.T
            public void u5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    this.f166313a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.T
            public GuestProcessInfo x1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166313a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GuestProcessInfo) c.c(parcelObtain2, GuestProcessInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.T
            public IBinder y0(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(T.f166303l3);
                    parcelObtain.writeString(str);
                    this.f166313a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, T.f166303l3);
        }

        public static T U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(T.f166303l3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof T)) ? new a(iBinder) : (T) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(T.f166303l3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(T.f166303l3);
                return true;
            }
            switch (i10) {
                case 1:
                    GuestProcessInfo guestProcessInfoX1 = x1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.d(parcel2, guestProcessInfoX1, 1);
                    return true;
                case 2:
                    W1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    String strL2 = L2();
                    parcel2.writeNoException();
                    parcel2.writeString(strL2);
                    return true;
                case 4:
                    IBinder iBinderY0 = y0(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderY0);
                    return true;
                case 5:
                    boolean zJ = J(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zJ ? 1 : 0);
                    return true;
                case 6:
                    h4(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    u5();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    boolean zI5 = I5(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zI5 ? 1 : 0);
                    return true;
                case 9:
                    a2(parcel.readInt(), parcel.readString());
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
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

    boolean I5(String str) throws RemoteException;

    boolean J(int i10, String str) throws RemoteException;

    String L2() throws RemoteException;

    void W1(IBinder iBinder) throws RemoteException;

    void a2(int i10, String str) throws RemoteException;

    void h4(int i10) throws RemoteException;

    void u5() throws RemoteException;

    GuestProcessInfo x1(IBinder iBinder) throws RemoteException;

    IBinder y0(String str) throws RemoteException;
}
