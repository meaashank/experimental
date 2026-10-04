package com.prism.gaia.server;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.commons.notification.NotificationBundle;
import com.prism.gaia.os.ParceledListSliceG;

/* JADX INFO: loaded from: classes6.dex */
public interface Z extends IInterface {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final String f166345q3 = "com.prism.gaia.server.INotificationManager";

    public static class a implements Z {
        @Override // com.prism.gaia.server.Z
        public NotificationChannel A1(String str, String str2, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public void B5(String str, ParceledListSliceG parceledListSliceG, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Z
        public void G4(String str, String str2, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Z
        public void K4(String str, int i10, String str2, int i11) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Z
        public int L(String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.Z
        public void W2(String str, ParceledListSliceG parceledListSliceG, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Z
        public ParceledListSliceG X2(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public NotificationChannel Z2(String str, String str2, String str3, boolean z10, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public void Z3(String str, int i10) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public int d3(String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.Z
        public void d5(String str, NotificationChannel notificationChannel, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Z
        public NotificationChannelGroup e1(String str, String str2, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public void g1(int i10, String str, Notification notification) throws RemoteException {
        }

        @Override // com.prism.gaia.server.Z
        public NotificationBundle l1(String str, String str2, int i10, String str3, Notification notification, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public ParceledListSliceG q3(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public ParceledListSliceG r2(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.Z
        public void z0(String str, String str2, int i10) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166346a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166347b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166348c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166349d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166350e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166351f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166352g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166353h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166354i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f166355j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f166356k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f166357l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f166358m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f166359n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f166360o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f166361p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f166362q = 17;

        public static class a implements Z {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166363a;

            public a(IBinder iBinder) {
                this.f166363a = iBinder;
            }

            @Override // com.prism.gaia.server.Z
            public NotificationChannel A1(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return androidx.core.app.B.a(c.c(parcelObtain2, NotificationChannel.CREATOR));
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void B5(String str, ParceledListSliceG parceledListSliceG, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, parceledListSliceG, 0);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void G4(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void K4(String str, int i10, String str2, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i11);
                    this.f166363a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public int L(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return Z.f166345q3;
            }

            @Override // com.prism.gaia.server.Z
            public void W2(String str, ParceledListSliceG parceledListSliceG, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, parceledListSliceG, 0);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public ParceledListSliceG X2(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.c(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public NotificationChannel Z2(String str, String str2, String str3, boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return androidx.core.app.B.a(c.c(parcelObtain2, NotificationChannel.CREATOR));
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void Z3(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166363a;
            }

            @Override // com.prism.gaia.server.Z
            public int d3(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void d5(String str, NotificationChannel notificationChannel, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, notificationChannel, 0);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public NotificationChannelGroup e1(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return androidx.core.app.L.a(c.c(parcelObtain2, NotificationChannelGroup.CREATOR));
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void g1(int i10, String str, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, notification, 0);
                    this.f166363a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public NotificationBundle l1(String str, String str2, int i10, String str3, Notification notification, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str3);
                    c.d(parcelObtain, notification, 0);
                    parcelObtain.writeInt(i11);
                    this.f166363a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (NotificationBundle) c.c(parcelObtain2, NotificationBundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public ParceledListSliceG q3(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.c(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public ParceledListSliceG r2(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.c(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.Z
            public void z0(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Z.f166345q3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f166363a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, Z.f166345q3);
        }

        public static Z U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Z.f166345q3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Z)) ? new a(iBinder) : (Z) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(Z.f166345q3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(Z.f166345q3);
                return true;
            }
            switch (i10) {
                case 1:
                    NotificationBundle notificationBundleL1 = l1(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) c.c(parcel, Notification.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, notificationBundleL1, 1);
                    return true;
                case 2:
                    g1(parcel.readInt(), parcel.readString(), (Notification) c.c(parcel, Notification.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    K4(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    Z3(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    ParceledListSliceG parceledListSliceGX2 = X2(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, parceledListSliceGX2, 1);
                    return true;
                case 6:
                    W2(parcel.readString(), (ParceledListSliceG) c.c(parcel, ParceledListSliceG.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    B5(parcel.readString(), (ParceledListSliceG) c.c(parcel, ParceledListSliceG.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    G4(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    z0(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    d5(parcel.readString(), androidx.core.app.B.a(c.c(parcel, NotificationChannel.CREATOR)), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    ParceledListSliceG parceledListSliceGQ3 = q3(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, parceledListSliceGQ3, 1);
                    return true;
                case 12:
                    ParceledListSliceG parceledListSliceGR2 = r2(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, parceledListSliceGR2, 1);
                    return true;
                case 13:
                    int iD3 = d3(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iD3);
                    return true;
                case 14:
                    int iL = L(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iL);
                    return true;
                case 15:
                    NotificationChannelGroup notificationChannelGroupE1 = e1(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, notificationChannelGroupE1, 1);
                    return true;
                case 16:
                    NotificationChannel notificationChannelA1 = A1(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, notificationChannelA1, 1);
                    return true;
                case 17:
                    NotificationChannel notificationChannelZ2 = Z2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, notificationChannelZ2, 1);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

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

    NotificationChannel A1(String str, String str2, int i10) throws RemoteException;

    void B5(String str, ParceledListSliceG parceledListSliceG, int i10) throws RemoteException;

    void G4(String str, String str2, int i10) throws RemoteException;

    void K4(String str, int i10, String str2, int i11) throws RemoteException;

    int L(String str, int i10) throws RemoteException;

    void W2(String str, ParceledListSliceG parceledListSliceG, int i10) throws RemoteException;

    ParceledListSliceG X2(String str, int i10) throws RemoteException;

    NotificationChannel Z2(String str, String str2, String str3, boolean z10, int i10) throws RemoteException;

    void Z3(String str, int i10) throws RemoteException;

    int d3(String str, int i10) throws RemoteException;

    void d5(String str, NotificationChannel notificationChannel, int i10) throws RemoteException;

    NotificationChannelGroup e1(String str, String str2, int i10) throws RemoteException;

    void g1(int i10, String str, Notification notification) throws RemoteException;

    NotificationBundle l1(String str, String str2, int i10, String str3, Notification notification, int i11) throws RemoteException;

    ParceledListSliceG q3(String str, int i10) throws RemoteException;

    ParceledListSliceG r2(String str, int i10) throws RemoteException;

    void z0(String str, String str2, int i10) throws RemoteException;
}
