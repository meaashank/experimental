package com.prism.gaia.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface V extends IInterface {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final String f166326n3 = "com.prism.gaia.server.IGaiaGuestCrashService";

    public static class a implements V {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.V
        public void l(GGuestUncaughtException gGuestUncaughtException, boolean z10) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements V {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166327a = 1;

        public static class a implements V {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166328a;

            public a(IBinder iBinder) {
                this.f166328a = iBinder;
            }

            public String U0() {
                return V.f166326n3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166328a;
            }

            @Override // com.prism.gaia.server.V
            public void l(GGuestUncaughtException gGuestUncaughtException, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(V.f166326n3);
                    c.d(parcelObtain, gGuestUncaughtException, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166328a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, V.f166326n3);
        }

        public static V U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(V.f166326n3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof V)) ? new a(iBinder) : (V) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(V.f166326n3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(V.f166326n3);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            l((GGuestUncaughtException) c.c(parcel, GGuestUncaughtException.CREATOR), parcel.readInt() != 0);
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

    void l(GGuestUncaughtException gGuestUncaughtException, boolean z10) throws RemoteException;
}
