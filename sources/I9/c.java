package I9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public static final String f52968E2 = "com.prism.gaia.server.interfaces.IServiceFetcher";

    public static class a implements c {
        @Override // I9.c
        public String P2(String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // I9.c
        public IBinder y(String str) throws RemoteException {
            return null;
        }
    }

    String P2(String str) throws RemoteException;

    IBinder y(String str) throws RemoteException;

    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f52969a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f52970b = 2;

        public static class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f52971a;

            public a(IBinder iBinder) {
                this.f52971a = iBinder;
            }

            @Override // I9.c
            public String P2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f52968E2);
                    parcelObtain.writeString(str);
                    this.f52971a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return c.f52968E2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f52971a;
            }

            @Override // I9.c
            public IBinder y(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f52968E2);
                    parcelObtain.writeString(str);
                    this.f52971a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.f52968E2);
        }

        public static c U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f52968E2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(c.f52968E2);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(c.f52968E2);
                return true;
            }
            if (i10 == 1) {
                IBinder iBinderY = y(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderY);
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                String strP2 = P2(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strP2);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
