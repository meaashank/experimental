package com.prism.gaia.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface U extends IInterface {

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final String f166314m3 = "com.prism.gaia.server.IGaiaDeviceInfoManager";

    public static class a implements U {
        @Override // com.prism.gaia.server.U
        public String A3() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String A5() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String U4() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String b4() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String d1() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String e4() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String getDeviceId() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String h3() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String k3() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.U
        public String v3() throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166315a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166316b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166317c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166318d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166319e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166320f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166321g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166322h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166323i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f166324j = 10;

        public static class a implements U {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166325a;

            public a(IBinder iBinder) {
                this.f166325a = iBinder;
            }

            @Override // com.prism.gaia.server.U
            public String A3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String A5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return U.f166314m3;
            }

            @Override // com.prism.gaia.server.U
            public String U4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166325a;
            }

            @Override // com.prism.gaia.server.U
            public String b4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String d1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String e4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String getDeviceId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String h3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String k3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.U
            public String v3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(U.f166314m3);
                    this.f166325a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, U.f166314m3);
        }

        public static U U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(U.f166314m3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof U)) ? new a(iBinder) : (U) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(U.f166314m3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(U.f166314m3);
                return true;
            }
            switch (i10) {
                case 1:
                    String strU4 = U4();
                    parcel2.writeNoException();
                    parcel2.writeString(strU4);
                    return true;
                case 2:
                    String strB4 = b4();
                    parcel2.writeNoException();
                    parcel2.writeString(strB4);
                    return true;
                case 3:
                    String strD1 = d1();
                    parcel2.writeNoException();
                    parcel2.writeString(strD1);
                    return true;
                case 4:
                    String strH3 = h3();
                    parcel2.writeNoException();
                    parcel2.writeString(strH3);
                    return true;
                case 5:
                    String strA3 = A3();
                    parcel2.writeNoException();
                    parcel2.writeString(strA3);
                    return true;
                case 6:
                    String deviceId = getDeviceId();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceId);
                    return true;
                case 7:
                    String strA5 = A5();
                    parcel2.writeNoException();
                    parcel2.writeString(strA5);
                    return true;
                case 8:
                    String strK3 = k3();
                    parcel2.writeNoException();
                    parcel2.writeString(strK3);
                    return true;
                case 9:
                    String strE4 = e4();
                    parcel2.writeNoException();
                    parcel2.writeString(strE4);
                    return true;
                case 10:
                    String strV3 = v3();
                    parcel2.writeNoException();
                    parcel2.writeString(strV3);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    String A3() throws RemoteException;

    String A5() throws RemoteException;

    String U4() throws RemoteException;

    String b4() throws RemoteException;

    String d1() throws RemoteException;

    String e4() throws RemoteException;

    String getDeviceId() throws RemoteException;

    String h3() throws RemoteException;

    String k3() throws RemoteException;

    String v3() throws RemoteException;
}
