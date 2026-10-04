package X6;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.client.stub.r;
import com.prism.gaia.remote.GuestProcessInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface w extends IInterface {

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public static final String f78724H2 = "com.prism.gaia.client.IGuestAppClient";

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

    IBinder H4(ProviderInfo providerInfo) throws RemoteException;

    void I1(Intent intent) throws RemoteException;

    void J5(IBinder iBinder) throws RemoteException;

    void M2(int i10, String[] strArr) throws RemoteException;

    void h0(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException;

    void i3(GuestProcessInfo guestProcessInfo) throws RemoteException;

    void l5(IBinder iBinder, Intent intent) throws RemoteException;

    void n(IBinder iBinder, ServiceInfo serviceInfo) throws RemoteException;

    void n1(Intent intent, ActivityInfo activityInfo, int i10, String str, Bundle bundle, boolean z10, int i11) throws RemoteException;

    int n2(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException;

    void n4(IBinder iBinder) throws RemoteException;

    void p2(String str, IBinder iBinder, Intent intent, Bundle bundle) throws RemoteException;

    void s5(IBinder iBinder, Intent intent, boolean z10) throws RemoteException;

    void v1(IBinder iBinder, ServiceInfo serviceInfo, int i10, int i11, Intent intent, Bundle bundle) throws RemoteException;

    int z1(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle) throws RemoteException;

    public static abstract class b extends Binder implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f78725a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f78726b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f78727c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f78728d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f78729e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f78730f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f78731g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f78732h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f78733i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f78734j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f78735k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f78736l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f78737m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f78738n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f78739o = 15;

        public static class a implements w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f78740a;

            public a(IBinder iBinder) {
                this.f78740a = iBinder;
            }

            @Override // X6.w
            public IBinder H4(ProviderInfo providerInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    c.d(parcelObtain, providerInfo, 0);
                    this.f78740a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void I1(Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    c.d(parcelObtain, intent, 0);
                    this.f78740a.transact(15, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void J5(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f78740a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void M2(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f78740a.transact(14, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return w.f78724H2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f78740a;
            }

            @Override // X6.w
            public void h0(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    c.d(parcelObtain, intent, 0);
                    parcelObtain.writeStrongInterface(rVar);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f78740a.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void i3(GuestProcessInfo guestProcessInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    c.d(parcelObtain, guestProcessInfo, 0);
                    this.f78740a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void l5(IBinder iBinder, Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, intent, 0);
                    this.f78740a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void n(IBinder iBinder, ServiceInfo serviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, serviceInfo, 0);
                    this.f78740a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void n1(Intent intent, ActivityInfo activityInfo, int i10, String str, Bundle bundle, boolean z10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    c.d(parcelObtain, intent, 0);
                    c.d(parcelObtain, activityInfo, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f78740a.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public int n2(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeTypedArray(intentArr, 0);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, bundle, 0);
                    this.f78740a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void n4(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f78740a.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void p2(String str, IBinder iBinder, Intent intent, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, intent, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f78740a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void s5(IBinder iBinder, Intent intent, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, intent, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f78740a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public void v1(IBinder iBinder, ServiceInfo serviceInfo, int i10, int i11, Intent intent, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, serviceInfo, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    c.d(parcelObtain, intent, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f78740a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // X6.w
            public int z1(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.f78724H2);
                    c.d(parcelObtain, intent, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f78740a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, w.f78724H2);
        }

        public static w U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(w.f78724H2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w)) ? new a(iBinder) : (w) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            boolean z10;
            Bundle bundle;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(w.f78724H2);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(w.f78724H2);
                return true;
            }
            switch (i10) {
                case 1:
                    i3((GuestProcessInfo) c.c(parcel, GuestProcessInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    int iZ1 = z1((Intent) c.c(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iZ1);
                    return true;
                case 3:
                    int iN2 = n2((Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readStrongBinder(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iN2);
                    return true;
                case 4:
                    p2(parcel.readString(), parcel.readStrongBinder(), (Intent) c.c(parcel, Intent.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 5:
                    J5(parcel.readStrongBinder());
                    return true;
                case 6:
                    n(parcel.readStrongBinder(), (ServiceInfo) c.c(parcel, ServiceInfo.CREATOR));
                    return true;
                case 7:
                    v1(parcel.readStrongBinder(), (ServiceInfo) c.c(parcel, ServiceInfo.CREATOR), parcel.readInt(), parcel.readInt(), (Intent) c.c(parcel, Intent.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    s5(parcel.readStrongBinder(), (Intent) c.c(parcel, Intent.CREATOR), parcel.readInt() != 0);
                    return true;
                case 9:
                    l5(parcel.readStrongBinder(), (Intent) c.c(parcel, Intent.CREATOR));
                    return true;
                case 10:
                    n4(parcel.readStrongBinder());
                    return true;
                case 11:
                    IBinder iBinderH4 = H4((ProviderInfo) c.c(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderH4);
                    return true;
                case 12:
                    n1((Intent) c.c(parcel, Intent.CREATOR), (ActivityInfo) c.c(parcel, ActivityInfo.CREATOR), parcel.readInt(), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case 13:
                    Intent intent = (Intent) c.c(parcel, Intent.CREATOR);
                    com.prism.gaia.client.stub.r rVarU0 = r.b.U0(parcel.readStrongBinder());
                    int i12 = parcel.readInt();
                    String string = parcel.readString();
                    Bundle bundle2 = (Bundle) c.c(parcel, Bundle.CREATOR);
                    boolean z11 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        bundle = bundle2;
                        z10 = true;
                    } else {
                        z10 = false;
                        bundle = bundle2;
                    }
                    h0(intent, rVarU0, i12, string, bundle, z11, z10, parcel.readInt());
                    return true;
                case 14:
                    M2(parcel.readInt(), parcel.createStringArray());
                    return true;
                case 15:
                    I1((Intent) c.c(parcel, Intent.CREATOR));
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

    public static class a implements w {
        @Override // X6.w
        public IBinder H4(ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // X6.w
        public int n2(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // X6.w
        public int z1(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // X6.w
        public void I1(Intent intent) throws RemoteException {
        }

        @Override // X6.w
        public void J5(IBinder iBinder) throws RemoteException {
        }

        @Override // X6.w
        public void i3(GuestProcessInfo guestProcessInfo) throws RemoteException {
        }

        @Override // X6.w
        public void n4(IBinder iBinder) throws RemoteException {
        }

        @Override // X6.w
        public void M2(int i10, String[] strArr) throws RemoteException {
        }

        @Override // X6.w
        public void l5(IBinder iBinder, Intent intent) throws RemoteException {
        }

        @Override // X6.w
        public void n(IBinder iBinder, ServiceInfo serviceInfo) throws RemoteException {
        }

        @Override // X6.w
        public void s5(IBinder iBinder, Intent intent, boolean z10) throws RemoteException {
        }

        @Override // X6.w
        public void p2(String str, IBinder iBinder, Intent intent, Bundle bundle) throws RemoteException {
        }

        @Override // X6.w
        public void h0(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
        }

        @Override // X6.w
        public void v1(IBinder iBinder, ServiceInfo serviceInfo, int i10, int i11, Intent intent, Bundle bundle) throws RemoteException {
        }

        @Override // X6.w
        public void n1(Intent intent, ActivityInfo activityInfo, int i10, String str, Bundle bundle, boolean z10, int i11) throws RemoteException {
        }
    }
}
