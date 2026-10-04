package I9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.remote.AppProceedInfo;
import com.prism.gaia.remote.GuestAppInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public static final String f52955B2 = "com.prism.gaia.server.interfaces.IAppObserver";

    public static class c {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, list.get(i11), i10);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void b(AppProceedInfo appProceedInfo) throws RemoteException;

    void d(String str) throws RemoteException;

    void e(AppProceedInfo appProceedInfo) throws RemoteException;

    void f(GuestAppInfo guestAppInfo) throws RemoteException;

    void g(GuestAppInfo guestAppInfo) throws RemoteException;

    void v4(List<GuestAppInfo> list, List<AppProceedInfo> list2) throws RemoteException;

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f52956a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f52957b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f52958c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f52959d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f52960e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f52961f = 6;

        /* JADX INFO: renamed from: I9.a$b$a, reason: collision with other inner class name */
        public static class C0055a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f52962a;

            public C0055a(IBinder iBinder) {
                this.f52962a = iBinder;
            }

            public String U0() {
                return a.f52955B2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f52962a;
            }

            @Override // I9.a
            public void b(AppProceedInfo appProceedInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f52955B2);
                    c.f(parcelObtain, appProceedInfo, 0);
                    this.f52962a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // I9.a
            public void d(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f52955B2);
                    parcelObtain.writeString(str);
                    this.f52962a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // I9.a
            public void e(AppProceedInfo appProceedInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f52955B2);
                    c.f(parcelObtain, appProceedInfo, 0);
                    this.f52962a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // I9.a
            public void f(GuestAppInfo guestAppInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f52955B2);
                    c.f(parcelObtain, guestAppInfo, 0);
                    this.f52962a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // I9.a
            public void g(GuestAppInfo guestAppInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f52955B2);
                    c.f(parcelObtain, guestAppInfo, 0);
                    this.f52962a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // I9.a
            public void v4(List<GuestAppInfo> list, List<AppProceedInfo> list2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f52955B2);
                    c.e(parcelObtain, list, 0);
                    c.e(parcelObtain, list2, 0);
                    this.f52962a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f52955B2);
        }

        public static a U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f52955B2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0055a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f52955B2);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f52955B2);
                return true;
            }
            switch (i10) {
                case 1:
                    v4(parcel.createTypedArrayList(GuestAppInfo.CREATOR), parcel.createTypedArrayList(AppProceedInfo.CREATOR));
                    return true;
                case 2:
                    b((AppProceedInfo) c.d(parcel, AppProceedInfo.CREATOR));
                    return true;
                case 3:
                    e((AppProceedInfo) c.d(parcel, AppProceedInfo.CREATOR));
                    return true;
                case 4:
                    g((GuestAppInfo) c.d(parcel, GuestAppInfo.CREATOR));
                    return true;
                case 5:
                    f((GuestAppInfo) c.d(parcel, GuestAppInfo.CREATOR));
                    return true;
                case 6:
                    d(parcel.readString());
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: I9.a$a, reason: collision with other inner class name */
    public static class C0054a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // I9.a
        public void b(AppProceedInfo appProceedInfo) throws RemoteException {
        }

        @Override // I9.a
        public void d(String str) throws RemoteException {
        }

        @Override // I9.a
        public void e(AppProceedInfo appProceedInfo) throws RemoteException {
        }

        @Override // I9.a
        public void f(GuestAppInfo guestAppInfo) throws RemoteException {
        }

        @Override // I9.a
        public void g(GuestAppInfo guestAppInfo) throws RemoteException {
        }

        @Override // I9.a
        public void v4(List<GuestAppInfo> list, List<AppProceedInfo> list2) throws RemoteException {
        }
    }
}
