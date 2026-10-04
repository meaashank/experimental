package I9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface d extends IInterface {

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public static final String f52972F2 = "com.prism.gaia.server.interfaces.IUiCallback";

    void U(String str, int i10) throws RemoteException;

    public static abstract class b extends Binder implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f52973a = 1;

        public static class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f52974a;

            public a(IBinder iBinder) {
                this.f52974a = iBinder;
            }

            @Override // I9.d
            public void U(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f52972F2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f52974a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return d.f52972F2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f52974a;
            }
        }

        public b() {
            attachInterface(this, d.f52972F2);
        }

        public static d U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.f52972F2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(d.f52972F2);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(d.f52972F2);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            U(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // I9.d
        public void U(String str, int i10) throws RemoteException {
        }
    }
}
