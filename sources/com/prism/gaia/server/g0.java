package com.prism.gaia.server;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface g0 extends IInterface {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final String f167372v3 = "com.prism.gaia.server.IVpnRouter";

    public static class a implements g0 {
        @Override // com.prism.gaia.server.g0
        public ParcelFileDescriptor H0(int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.g0
        public boolean N3() throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.g0
        public ParcelFileDescriptor O0(int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.g0
        public void P5(int i10, String str) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.g0
        public boolean k0(int i10, String str, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.g0
        public Bundle s0() throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167373a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f167374b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f167375c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f167376d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f167377e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f167378f = 6;

        public static class a implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f167379a;

            public a(IBinder iBinder) {
                this.f167379a = iBinder;
            }

            @Override // com.prism.gaia.server.g0
            public ParcelFileDescriptor H0(int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g0.f167372v3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167379a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) c.c(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.g0
            public boolean N3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g0.f167372v3);
                    this.f167379a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.g0
            public ParcelFileDescriptor O0(int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g0.f167372v3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167379a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) c.c(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.g0
            public void P5(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g0.f167372v3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f167379a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return g0.f167372v3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f167379a;
            }

            @Override // com.prism.gaia.server.g0
            public boolean k0(int i10, String str, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g0.f167372v3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, parcelFileDescriptor, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f167379a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.g0
            public Bundle s0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g0.f167372v3);
                    this.f167379a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, g0.f167372v3);
        }

        public static g0 U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(g0.f167372v3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g0)) ? new a(iBinder) : (g0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(g0.f167372v3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(g0.f167372v3);
                return true;
            }
            switch (i10) {
                case 1:
                    boolean zK0 = k0(parcel.readInt(), parcel.readString(), (ParcelFileDescriptor) c.c(parcel, ParcelFileDescriptor.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zK0 ? 1 : 0);
                    return true;
                case 2:
                    P5(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean zN3 = N3();
                    parcel2.writeNoException();
                    parcel2.writeInt(zN3 ? 1 : 0);
                    return true;
                case 4:
                    Bundle bundleS0 = s0();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleS0, 1);
                    return true;
                case 5:
                    ParcelFileDescriptor parcelFileDescriptorH0 = H0(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, parcelFileDescriptorH0, 1);
                    return true;
                case 6:
                    ParcelFileDescriptor parcelFileDescriptorO0 = O0(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, parcelFileDescriptorO0, 1);
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

    ParcelFileDescriptor H0(int i10, int i11) throws RemoteException;

    boolean N3() throws RemoteException;

    ParcelFileDescriptor O0(int i10, int i11) throws RemoteException;

    void P5(int i10, String str) throws RemoteException;

    boolean k0(int i10, String str, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle) throws RemoteException;

    Bundle s0() throws RemoteException;
}
