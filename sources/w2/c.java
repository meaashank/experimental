package W2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends IInterface {
    void a(String error) throws RemoteException;

    void e2(byte[] response) throws RemoteException;

    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76542a = "androidx.work.multiprocess.IWorkManagerImplCallback";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76543b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76544c = 2;

        public static class a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static c f76545b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f76546a;

            public a(IBinder remote) {
                this.f76546a = remote;
            }

            public String U0() {
                return b.f76542a;
            }

            @Override // W2.c
            public void a(String error) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f76542a);
                    parcelObtain.writeString(error);
                    if (this.f76546a.transact(2, parcelObtain, null, 1) || b.h2() == null) {
                        return;
                    }
                    f76545b.a(error);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f76546a;
            }

            @Override // W2.c
            public void e2(byte[] response) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f76542a);
                    parcelObtain.writeByteArray(response);
                    if (this.f76546a.transact(1, parcelObtain, null, 1) || b.h2() == null) {
                        return;
                    }
                    f76545b.e2(response);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f76542a);
        }

        public static c U0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f76542a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(obj) : (c) iInterfaceQueryLocalInterface;
        }

        public static c h2() {
            return a.f76545b;
        }

        public static boolean v5(c impl) {
            if (a.f76545b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f76545b = impl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface(f76542a);
                e2(data.createByteArray());
                return true;
            }
            if (code == 2) {
                data.enforceInterface(f76542a);
                a(data.readString());
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(f76542a);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // W2.c
        public void a(String error) throws RemoteException {
        }

        @Override // W2.c
        public void e2(byte[] response) throws RemoteException {
        }
    }
}
