package p6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface e extends IInterface {

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public static final String f226356I3 = "com.prism.commons.ipc.IActivityLifecycle";

    void e3(String str, int i10) throws RemoteException;

    int n3(String str, int i10) throws RemoteException;

    public static abstract class b extends Binder implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f226357a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f226358b = 2;

        public static class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f226359a;

            public a(IBinder iBinder) {
                this.f226359a = iBinder;
            }

            public String U0() {
                return e.f226356I3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f226359a;
            }

            @Override // p6.e
            public void e3(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f226356I3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f226359a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // p6.e
            public int n3(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f226356I3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f226359a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, e.f226356I3);
        }

        public static e U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e.f226356I3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(e.f226356I3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(e.f226356I3);
                return true;
            }
            if (i10 == 1) {
                e3(parcel.readString(), parcel.readInt());
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                int iN3 = n3(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iN3);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements e {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // p6.e
        public int n3(String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // p6.e
        public void e3(String str, int i10) throws RemoteException {
        }
    }
}
