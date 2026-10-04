package W2;

import W2.c;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {
    void E3(byte[] request, c callback) throws RemoteException;

    void b3(byte[] request, c callback) throws RemoteException;

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76526a = "androidx.work.multiprocess.IListenableWorkerImpl";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76527b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76528c = 2;

        /* JADX INFO: renamed from: W2.a$b$a, reason: collision with other inner class name */
        public static class C0132a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static a f76529b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f76530a;

            public C0132a(IBinder remote) {
                this.f76530a = remote;
            }

            @Override // W2.a
            public void E3(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f76526a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76530a.transact(1, parcelObtain, null, 1) || b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76529b.E3(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String U0() {
                return b.f76526a;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f76530a;
            }

            @Override // W2.a
            public void b3(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f76526a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76530a.transact(2, parcelObtain, null, 1) || b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76529b.b3(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public b() {
            attachInterface(this, f76526a);
        }

        public static a U0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f76526a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0132a(obj) : (a) iInterfaceQueryLocalInterface;
        }

        public static a h2() {
            return C0132a.f76529b;
        }

        public static boolean v5(a impl) {
            if (C0132a.f76529b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            C0132a.f76529b = impl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface(f76526a);
                E3(data.createByteArray(), c.b.U0(data.readStrongBinder()));
                return true;
            }
            if (code == 2) {
                data.enforceInterface(f76526a);
                b3(data.createByteArray(), c.b.U0(data.readStrongBinder()));
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(f76526a);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: W2.a$a, reason: collision with other inner class name */
    public static class C0131a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // W2.a
        public void E3(byte[] request, c callback) throws RemoteException {
        }

        @Override // W2.a
        public void b3(byte[] request, c callback) throws RemoteException {
        }
    }
}
