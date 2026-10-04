package com.prism.gaia.client;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final String f164239b3 = "com.prism.gaia.client.IGProcessClient";

    /* JADX INFO: renamed from: com.prism.gaia.client.a$a, reason: collision with other inner class name */
    public static class C0667a implements a {
        @Override // com.prism.gaia.client.a
        public void J3(String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.client.a
        public IBinder N2() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.client.a
        public String R1() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.client.a
        public int c() throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.client.a
        public IBinder h1() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.client.a
        public String p3() throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f164240a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f164241b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f164242c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f164243d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f164244e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f164245f = 6;

        /* JADX INFO: renamed from: com.prism.gaia.client.a$b$a, reason: collision with other inner class name */
        public static class C0668a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f164246a;

            public C0668a(IBinder iBinder) {
                this.f164246a = iBinder;
            }

            @Override // com.prism.gaia.client.a
            public void J3(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f164239b3);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f164246a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.client.a
            public IBinder N2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f164239b3);
                    this.f164246a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.client.a
            public String R1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f164239b3);
                    this.f164246a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return a.f164239b3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f164246a;
            }

            @Override // com.prism.gaia.client.a
            public int c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f164239b3);
                    this.f164246a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.client.a
            public IBinder h1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f164239b3);
                    this.f164246a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.client.a
            public String p3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f164239b3);
                    this.f164246a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f164239b3);
        }

        public static a U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f164239b3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0668a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f164239b3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f164239b3);
                return true;
            }
            switch (i10) {
                case 1:
                    String strP3 = p3();
                    parcel2.writeNoException();
                    parcel2.writeString(strP3);
                    return true;
                case 2:
                    IBinder iBinderN2 = N2();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderN2);
                    return true;
                case 3:
                    IBinder iBinderH1 = h1();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderH1);
                    return true;
                case 4:
                    int iC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 5:
                    String strR1 = R1();
                    parcel2.writeNoException();
                    parcel2.writeString(strR1);
                    return true;
                case 6:
                    J3(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
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

    void J3(String str, Bundle bundle) throws RemoteException;

    IBinder N2() throws RemoteException;

    String R1() throws RemoteException;

    int c() throws RemoteException;

    IBinder h1() throws RemoteException;

    String p3() throws RemoteException;
}
