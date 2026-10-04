package W2;

import W2.c;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends IInterface {
    void J0(String tag, c callback) throws RemoteException;

    void N(c callback) throws RemoteException;

    void T2(String name, c callback) throws RemoteException;

    void a5(String id2, c callback) throws RemoteException;

    void l2(byte[] request, c callback) throws RemoteException;

    void s4(byte[] request, c callback) throws RemoteException;

    void x0(byte[] request, c callback) throws RemoteException;

    void y5(byte[] request, c callback) throws RemoteException;

    /* JADX INFO: renamed from: W2.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0133b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76531a = "androidx.work.multiprocess.IWorkManagerImpl";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f76532b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76533c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f76534d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f76535e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f76536f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f76537g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f76538h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f76539i = 8;

        /* JADX INFO: renamed from: W2.b$b$a */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static b f76540b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f76541a;

            public a(IBinder remote) {
                this.f76541a = remote;
            }

            @Override // W2.b
            public void J0(String tag, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeString(tag);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(4, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.J0(tag, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // W2.b
            public void N(c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(6, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.N(callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // W2.b
            public void T2(String name, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeString(name);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(5, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.T2(name, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String U0() {
                return AbstractBinderC0133b.f76531a;
            }

            @Override // W2.b
            public void a5(String id2, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeString(id2);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(3, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.a5(id2, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f76541a;
            }

            @Override // W2.b
            public void l2(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(1, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.l2(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // W2.b
            public void s4(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(8, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.s4(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // W2.b
            public void x0(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(7, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.x0(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // W2.b
            public void y5(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0133b.f76531a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f76541a.transact(2, parcelObtain, null, 1) || AbstractBinderC0133b.h2() == null) {
                        parcelObtain.recycle();
                    } else {
                        f76540b.y5(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC0133b() {
            attachInterface(this, f76531a);
        }

        public static b U0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f76531a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(obj) : (b) iInterfaceQueryLocalInterface;
        }

        public static b h2() {
            return a.f76540b;
        }

        public static boolean v5(b impl) {
            if (a.f76540b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f76540b = impl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1598968902) {
                reply.writeString(f76531a);
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface(f76531a);
                    l2(data.createByteArray(), c.b.U0(data.readStrongBinder()));
                    return true;
                case 2:
                    data.enforceInterface(f76531a);
                    y5(data.createByteArray(), c.b.U0(data.readStrongBinder()));
                    return true;
                case 3:
                    data.enforceInterface(f76531a);
                    a5(data.readString(), c.b.U0(data.readStrongBinder()));
                    return true;
                case 4:
                    data.enforceInterface(f76531a);
                    J0(data.readString(), c.b.U0(data.readStrongBinder()));
                    return true;
                case 5:
                    data.enforceInterface(f76531a);
                    T2(data.readString(), c.b.U0(data.readStrongBinder()));
                    return true;
                case 6:
                    data.enforceInterface(f76531a);
                    N(c.b.U0(data.readStrongBinder()));
                    return true;
                case 7:
                    data.enforceInterface(f76531a);
                    x0(data.createByteArray(), c.b.U0(data.readStrongBinder()));
                    return true;
                case 8:
                    data.enforceInterface(f76531a);
                    s4(data.createByteArray(), c.b.U0(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // W2.b
        public void N(c callback) throws RemoteException {
        }

        @Override // W2.b
        public void J0(String tag, c callback) throws RemoteException {
        }

        @Override // W2.b
        public void T2(String name, c callback) throws RemoteException {
        }

        @Override // W2.b
        public void a5(String id2, c callback) throws RemoteException {
        }

        @Override // W2.b
        public void l2(byte[] request, c callback) throws RemoteException {
        }

        @Override // W2.b
        public void s4(byte[] request, c callback) throws RemoteException {
        }

        @Override // W2.b
        public void x0(byte[] request, c callback) throws RemoteException {
        }

        @Override // W2.b
        public void y5(byte[] request, c callback) throws RemoteException {
        }
    }
}
