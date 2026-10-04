package com.prism.gaia.server;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.os.UserInfoG;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface f0 extends IInterface {

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final String f167353u3 = "com.prism.gaia.server.IUserManager";

    public static class a implements f0 {
        @Override // com.prism.gaia.server.f0
        public boolean K5() throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.f0
        public boolean L3(int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.f0
        public Bitmap M1(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.f0
        public int Q5(int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.f0
        public boolean T(int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.f0
        public void W3(int i10, Bitmap bitmap) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.f0
        public void g2(boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.f0
        public UserInfoG i5(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.f0
        public UserInfoG k(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.f0
        public int k5(int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.f0
        public void w5(int i10, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.f0
        public List<UserInfoG> z5(boolean z10) throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167354a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f167355b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f167356c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f167357d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f167358e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f167359f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f167360g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f167361h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f167362i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f167363j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f167364k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f167365l = 12;

        public static class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f167366a;

            public a(IBinder iBinder) {
                this.f167366a = iBinder;
            }

            @Override // com.prism.gaia.server.f0
            public boolean K5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    this.f167366a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public boolean L3(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public Bitmap M1(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bitmap) c.d(parcelObtain2, Bitmap.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public int Q5(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public boolean T(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return f0.f167353u3;
            }

            @Override // com.prism.gaia.server.f0
            public void W3(int i10, Bitmap bitmap) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bitmap, 0);
                    this.f167366a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f167366a;
            }

            @Override // com.prism.gaia.server.f0
            public void g2(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f167366a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public UserInfoG i5(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (UserInfoG) c.d(parcelObtain2, UserInfoG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public UserInfoG k(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (UserInfoG) c.d(parcelObtain2, UserInfoG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public int k5(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    this.f167366a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public void w5(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f167366a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.f0
            public List<UserInfoG> z5(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f167353u3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f167366a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(UserInfoG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f0.f167353u3);
        }

        public static f0 U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f0.f167353u3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f0)) ? new a(iBinder) : (f0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(f0.f167353u3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(f0.f167353u3);
                return true;
            }
            switch (i10) {
                case 1:
                    List<UserInfoG> listZ5 = z5(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    c.e(parcel2, listZ5, 1);
                    return true;
                case 2:
                    UserInfoG userInfoGK = k(parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, userInfoGK, 1);
                    return true;
                case 3:
                    boolean zL3 = L3(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zL3 ? 1 : 0);
                    return true;
                case 4:
                    int iK5 = k5(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iK5);
                    return true;
                case 5:
                    int iQ5 = Q5(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iQ5);
                    return true;
                case 6:
                    Bitmap bitmapM1 = M1(parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, bitmapM1, 1);
                    return true;
                case 7:
                    w5(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    W3(parcel.readInt(), (Bitmap) c.d(parcel, Bitmap.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    UserInfoG userInfoGI5 = i5(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, userInfoGI5, 1);
                    return true;
                case 10:
                    boolean zT = T(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zT ? 1 : 0);
                    return true;
                case 11:
                    boolean zK5 = K5();
                    parcel2.writeNoException();
                    parcel2.writeInt(zK5 ? 1 : 0);
                    return true;
                case 12:
                    g2(parcel.readInt() != 0);
                    parcel2.writeNoException();
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

    boolean K5() throws RemoteException;

    boolean L3(int i10) throws RemoteException;

    Bitmap M1(int i10) throws RemoteException;

    int Q5(int i10) throws RemoteException;

    boolean T(int i10) throws RemoteException;

    void W3(int i10, Bitmap bitmap) throws RemoteException;

    void g2(boolean z10) throws RemoteException;

    UserInfoG i5(String str, int i10) throws RemoteException;

    UserInfoG k(int i10) throws RemoteException;

    int k5(int i10) throws RemoteException;

    void w5(int i10, String str) throws RemoteException;

    List<UserInfoG> z5(boolean z10) throws RemoteException;
}
