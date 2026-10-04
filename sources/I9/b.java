package I9;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public static final String f52963D2 = "com.prism.gaia.server.interfaces.IIntentFilterObserver";

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

    void B2(IBinder iBinder) throws RemoteException;

    Intent D1(Intent intent) throws RemoteException;

    IBinder O() throws RemoteException;

    /* JADX INFO: renamed from: I9.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0056b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f52964a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f52965b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f52966c = 3;

        /* JADX INFO: renamed from: I9.b$b$a */
        public static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f52967a;

            public a(IBinder iBinder) {
                this.f52967a = iBinder;
            }

            @Override // I9.b
            public void B2(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f52963D2);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f52967a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // I9.b
            public Intent D1(Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f52963D2);
                    c.d(parcelObtain, intent, 0);
                    this.f52967a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Intent) c.c(parcelObtain2, Intent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // I9.b
            public IBinder O() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f52963D2);
                    this.f52967a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return b.f52963D2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f52967a;
            }
        }

        public AbstractBinderC0056b() {
            attachInterface(this, b.f52963D2);
        }

        public static b U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f52963D2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(b.f52963D2);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(b.f52963D2);
                return true;
            }
            if (i10 == 1) {
                Intent intentD1 = D1((Intent) c.c(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                c.d(parcel2, intentD1, 1);
            } else if (i10 == 2) {
                B2(parcel.readStrongBinder());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                IBinder iBinderO = O();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderO);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements b {
        @Override // I9.b
        public Intent D1(Intent intent) throws RemoteException {
            return null;
        }

        @Override // I9.b
        public IBinder O() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // I9.b
        public void B2(IBinder iBinder) throws RemoteException {
        }
    }
}
