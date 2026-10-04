package com.prism.gaia.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface W extends IInterface {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final String f166329o3 = "com.prism.gaia.server.IGaiaSettingManager";

    public static class a implements W {
        @Override // com.prism.gaia.server.W
        public int B3() throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.W
        public void Q(int i10) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.W
        public int f3() throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.W
        public void q0(boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.W
        public boolean q2() throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.W
        public void r3(int i10) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166330a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166331b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166332c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166333d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166334e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166335f = 6;

        public static class a implements W {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166336a;

            public a(IBinder iBinder) {
                this.f166336a = iBinder;
            }

            @Override // com.prism.gaia.server.W
            public int B3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(W.f166329o3);
                    this.f166336a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.W
            public void Q(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(W.f166329o3);
                    parcelObtain.writeInt(i10);
                    this.f166336a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return W.f166329o3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166336a;
            }

            @Override // com.prism.gaia.server.W
            public int f3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(W.f166329o3);
                    this.f166336a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.W
            public void q0(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(W.f166329o3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166336a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.W
            public boolean q2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(W.f166329o3);
                    this.f166336a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.W
            public void r3(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(W.f166329o3);
                    parcelObtain.writeInt(i10);
                    this.f166336a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, W.f166329o3);
        }

        public static W U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(W.f166329o3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof W)) ? new a(iBinder) : (W) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(W.f166329o3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(W.f166329o3);
                return true;
            }
            switch (i10) {
                case 1:
                    Q(parcel.readInt());
                    return true;
                case 2:
                    int iB3 = B3();
                    parcel2.writeNoException();
                    parcel2.writeInt(iB3);
                    return true;
                case 3:
                    r3(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iF3 = f3();
                    parcel2.writeNoException();
                    parcel2.writeInt(iF3);
                    return true;
                case 5:
                    q0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean zQ2 = q2();
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ2 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    int B3() throws RemoteException;

    void Q(int i10) throws RemoteException;

    int f3() throws RemoteException;

    void q0(boolean z10) throws RemoteException;

    boolean q2() throws RemoteException;

    void r3(int i10) throws RemoteException;
}
