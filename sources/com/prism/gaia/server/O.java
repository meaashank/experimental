package com.prism.gaia.server;

import I9.a;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.remote.AppProceedInfo;
import com.prism.gaia.remote.GInstallProgress;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.GuestAppSizeG;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface O extends IInterface {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final String f166240h3 = "com.prism.gaia.server.IAppManager";

    public static abstract class b extends Binder implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166241a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166242b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166243c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166244d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166245e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166246f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166247g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166248h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166249i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f166250j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f166251k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f166252l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f166253m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f166254n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f166255o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f166256p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f166257q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f166258r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f166259s = 19;

        public static class a implements O {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166260a;

            public a(IBinder iBinder) {
                this.f166260a = iBinder;
            }

            @Override // com.prism.gaia.server.O
            public AppProceedInfo B(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (AppProceedInfo) c.d(parcelObtain2, AppProceedInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public void D2(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166260a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public boolean E0(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166260a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public int[] F5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createIntArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public AppProceedInfo H1(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166260a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (AppProceedInfo) c.d(parcelObtain2, AppProceedInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public List<GuestAppInfo> I0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    this.f166260a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(GuestAppInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public GuestAppInfo I3(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GuestAppInfo) c.d(parcelObtain2, GuestAppInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public void M5(I9.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f166260a.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public GInstallProgress O4(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GInstallProgress) c.d(parcelObtain2, GInstallProgress.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public boolean S(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166260a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public boolean S2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return O.f166240h3;
            }

            @Override // com.prism.gaia.server.O
            public int W0(GInstallProgress gInstallProgress) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    c.f(parcelObtain, gInstallProgress, 0);
                    this.f166260a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public GuestAppSizeG W4(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166260a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GuestAppSizeG) c.d(parcelObtain2, GuestAppSizeG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166260a;
            }

            @Override // com.prism.gaia.server.O
            public boolean d0(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166260a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public void h5(I9.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f166260a.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public AppProceedInfo m(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (AppProceedInfo) c.d(parcelObtain2, AppProceedInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public void t0(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    this.f166260a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public AppProceedInfo z2(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166260a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (AppProceedInfo) c.d(parcelObtain2, AppProceedInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.O
            public void z4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(O.f166240h3);
                    this.f166260a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, O.f166240h3);
        }

        public static O T5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(O.f166240h3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof O)) ? new a(iBinder) : (O) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(O.f166240h3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(O.f166240h3);
                return true;
            }
            switch (i10) {
                case 1:
                    AppProceedInfo appProceedInfoB = B(parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, appProceedInfoB, 1);
                    return true;
                case 2:
                    z4();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    AppProceedInfo appProceedInfoH1 = H1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, appProceedInfoH1, 1);
                    return true;
                case 4:
                    AppProceedInfo appProceedInfoZ2 = z2(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, appProceedInfoZ2, 1);
                    return true;
                case 5:
                    boolean zS2 = S2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zS2 ? 1 : 0);
                    return true;
                case 6:
                    AppProceedInfo appProceedInfoM = m(parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, appProceedInfoM, 1);
                    return true;
                case 7:
                    boolean zD0 = d0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zD0 ? 1 : 0);
                    return true;
                case 8:
                    D2(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    GuestAppInfo guestAppInfoI3 = I3(parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, guestAppInfoI3, 1);
                    return true;
                case 10:
                    int[] iArrF5 = F5(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeIntArray(iArrF5);
                    return true;
                case 11:
                    List<GuestAppInfo> listI0 = I0();
                    parcel2.writeNoException();
                    c.e(parcel2, listI0, 1);
                    return true;
                case 12:
                    h5(a.b.U0(parcel.readStrongBinder()));
                    return true;
                case 13:
                    M5(a.b.U0(parcel.readStrongBinder()));
                    return true;
                case 14:
                    GInstallProgress gInstallProgressO4 = O4(parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, gInstallProgressO4, 1);
                    return true;
                case 15:
                    int iW0 = W0((GInstallProgress) c.d(parcel, GInstallProgress.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iW0);
                    return true;
                case 16:
                    t0(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    GuestAppSizeG guestAppSizeGW4 = W4(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, guestAppSizeGW4, 1);
                    return true;
                case 18:
                    boolean zE0 = E0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zE0 ? 1 : 0);
                    return true;
                case 19:
                    boolean zS = S(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

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

    AppProceedInfo B(String str) throws RemoteException;

    void D2(String str, String str2) throws RemoteException;

    boolean E0(String str, int i10) throws RemoteException;

    int[] F5(String str) throws RemoteException;

    AppProceedInfo H1(String str, int i10) throws RemoteException;

    List<GuestAppInfo> I0() throws RemoteException;

    GuestAppInfo I3(String str) throws RemoteException;

    void M5(I9.a aVar) throws RemoteException;

    GInstallProgress O4(String str) throws RemoteException;

    boolean S(String str, int i10) throws RemoteException;

    boolean S2(String str) throws RemoteException;

    int W0(GInstallProgress gInstallProgress) throws RemoteException;

    GuestAppSizeG W4(String str, int i10) throws RemoteException;

    boolean d0(String str, int i10) throws RemoteException;

    void h5(I9.a aVar) throws RemoteException;

    AppProceedInfo m(String str) throws RemoteException;

    void t0(String str) throws RemoteException;

    AppProceedInfo z2(String str, int i10) throws RemoteException;

    void z4() throws RemoteException;

    public static class a implements O {
        @Override // com.prism.gaia.server.O
        public AppProceedInfo B(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public void D2(String str, String str2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.O
        public boolean E0(String str, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.O
        public int[] F5(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public AppProceedInfo H1(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public List<GuestAppInfo> I0() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public GuestAppInfo I3(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public GInstallProgress O4(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public boolean S(String str, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.O
        public boolean S2(String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.O
        public int W0(GInstallProgress gInstallProgress) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.O
        public GuestAppSizeG W4(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public boolean d0(String str, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.O
        public AppProceedInfo m(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public void t0(String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.O
        public AppProceedInfo z2(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.O
        public void z4() throws RemoteException {
        }

        @Override // com.prism.gaia.server.O
        public void M5(I9.a aVar) throws RemoteException {
        }

        @Override // com.prism.gaia.server.O
        public void h5(I9.a aVar) throws RemoteException {
        }
    }
}
