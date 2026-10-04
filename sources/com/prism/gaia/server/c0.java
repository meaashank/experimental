package com.prism.gaia.server;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.os.ParceledListSliceG;
import com.prism.gaia.remote.ComponentEnabledSettingG;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.PermissionGroup;
import com.prism.gaia.remote.PropertyG;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface c0 extends IInterface {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final String f167004r3 = "com.prism.gaia.server.IPackageManager";

    public static class a implements c0 {
        @Override // com.prism.gaia.server.c0
        public List<PermissionGroupInfo> A0(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public GuestAppInfo A4(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG B0(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG D3(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public PackageInfo D5(String str, int i10, int i11, boolean z10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public int G3(ComponentName componentName, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.c0
        public PermissionInfo H(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public boolean H5(String str, boolean z10, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.c0
        public PermissionGroupInfo I4(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public int K0(String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG K3(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public String L1(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public List<GuestAppInfo> M() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public List<PermissionGroup> O2(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public String[] P0(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public String Q2(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public void R(String str, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // com.prism.gaia.server.c0
        public String R2(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ResolveInfo T0(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public int T1(String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.c0
        public ActivityInfo U3(ComponentName componentName, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ProviderInfo V(ComponentName componentName, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG V1(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public boolean V2(ComponentName componentName, Intent intent, String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG Y2(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ActivityInfo Z(ComponentName componentName, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public String a4(int i10) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParcelFileDescriptor c2(String str, boolean z10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ServiceInfo d2(ComponentName componentName, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public boolean g3(String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.c0
        public String i0(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG i1(int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ResolveInfo j0(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public int j3(String str, String str2, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.c0
        public boolean k2(String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.c0
        public ApplicationInfo k4(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public void o0(List<ComponentEnabledSettingG> list, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.c0
        public String[] o5(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ResolveInfo p0(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public boolean q4(String str, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.c0
        public List<String> r(String str, String str2, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG r5(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG t(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ApplicationInfo t5(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public PropertyG u0(String str, String str2, String str3, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public int u2(String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.c0
        public ParcelFileDescriptor[] v0(String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG w2(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public void y1(String str, String str2, List<String> list, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG y2(Intent intent, String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ParceledListSliceG y4(int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public ProviderInfo z(String str, int i10, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.c0
        public List<PropertyG> z3(String str, int i10, int i11) throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements c0 {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f167005A = 27;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f167006B = 28;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int f167007C = 29;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int f167008D = 30;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int f167009E = 31;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int f167010F = 32;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final int f167011G = 33;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final int f167012H = 34;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final int f167013I = 35;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final int f167014J = 36;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final int f167015K = 37;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final int f167016L = 38;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final int f167017M = 39;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final int f167018N = 40;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final int f167019O = 41;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final int f167020P = 42;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final int f167021Q = 43;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final int f167022R = 44;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final int f167023S = 45;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final int f167024T = 46;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final int f167025U = 47;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final int f167026V = 48;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public static final int f167027W = 49;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final int f167028X = 50;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final int f167029Y = 51;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final int f167030Z = 52;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167031a = 1;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final int f167032a0 = 53;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f167033b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f167034c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f167035d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f167036e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f167037f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f167038g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f167039h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f167040i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f167041j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f167042k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f167043l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f167044m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f167045n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f167046o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f167047p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f167048q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f167049r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f167050s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f167051t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f167052u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f167053v = 22;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f167054w = 23;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f167055x = 24;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f167056y = 25;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f167057z = 26;

        public static class a implements c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f167058a;

            public a(IBinder iBinder) {
                this.f167058a = iBinder;
            }

            @Override // com.prism.gaia.server.c0
            public List<PermissionGroupInfo> A0(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PermissionGroupInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public GuestAppInfo A4(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GuestAppInfo) c.d(parcelObtain2, GuestAppInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG B0(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG D3(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public PackageInfo D5(String str, int i10, int i11, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f167058a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PackageInfo) c.d(parcelObtain2, PackageInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public int G3(ComponentName componentName, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public PermissionInfo H(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PermissionInfo) c.d(parcelObtain2, PermissionInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public boolean H5(String str, boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public PermissionGroupInfo I4(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PermissionGroupInfo) c.d(parcelObtain2, PermissionGroupInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public int K0(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG K3(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String L1(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f167058a.transact(52, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public List<GuestAppInfo> M() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    this.f167058a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(GuestAppInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public List<PermissionGroup> O2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PermissionGroup.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String[] P0(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String Q2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public void R(String str, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f167058a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String R2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ResolveInfo T0(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ResolveInfo) c.d(parcelObtain2, ResolveInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public int T1(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return c0.f167004r3;
            }

            @Override // com.prism.gaia.server.c0
            public ActivityInfo U3(ComponentName componentName, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ActivityInfo) c.d(parcelObtain2, ActivityInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ProviderInfo V(ComponentName componentName, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ProviderInfo) c.d(parcelObtain2, ProviderInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG V1(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public boolean V2(ComponentName componentName, Intent intent, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, componentName, 0);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG Y2(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ActivityInfo Z(ComponentName componentName, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ActivityInfo) c.d(parcelObtain2, ActivityInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String a4(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f167058a;
            }

            @Override // com.prism.gaia.server.c0
            public ParcelFileDescriptor c2(String str, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f167058a.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) c.d(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ServiceInfo d2(ComponentName componentName, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ServiceInfo) c.d(parcelObtain2, ServiceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public boolean g3(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String i0(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG i1(int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ResolveInfo j0(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ResolveInfo) c.d(parcelObtain2, ResolveInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public int j3(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public boolean k2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ApplicationInfo k4(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ApplicationInfo) c.d(parcelObtain2, ApplicationInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public void o0(List<ComponentEnabledSettingG> list, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.e(parcelObtain, list, 0);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public String[] o5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ResolveInfo p0(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ResolveInfo) c.d(parcelObtain2, ResolveInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public boolean q4(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public List<String> r(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG r5(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG t(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ApplicationInfo t5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ApplicationInfo) c.d(parcelObtain2, ApplicationInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public PropertyG u0(String str, String str2, String str3, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PropertyG) c.d(parcelObtain2, PropertyG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public int u2(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParcelFileDescriptor[] v0(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    this.f167058a.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor[]) parcelObtain2.createTypedArray(ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG w2(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public void y1(String str, String str2, List<String> list, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(i10);
                    this.f167058a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG y2(Intent intent, String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ParceledListSliceG y4(int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public ProviderInfo z(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ProviderInfo) c.d(parcelObtain2, ProviderInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.c0
            public List<PropertyG> z3(String str, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.f167004r3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f167058a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PropertyG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c0.f167004r3);
        }

        public static c0 U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c0.f167004r3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c0)) ? new a(iBinder) : (c0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(c0.f167004r3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(c0.f167004r3);
                return true;
            }
            switch (i10) {
                case 1:
                    boolean zG3 = g3(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zG3 ? 1 : 0);
                    return true;
                case 2:
                    int iJ3 = j3(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iJ3);
                    return true;
                case 3:
                    int iU2 = u2(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iU2);
                    return true;
                case 4:
                    String strI0 = i0(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strI0);
                    return true;
                case 5:
                    PackageInfo packageInfoD5 = D5(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    c.f(parcel2, packageInfoD5, 1);
                    return true;
                case 6:
                    ActivityInfo activityInfoU3 = U3((ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, activityInfoU3, 1);
                    return true;
                case 7:
                    ActivityInfo activityInfoZ = Z((ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, activityInfoZ, 1);
                    return true;
                case 8:
                    ServiceInfo serviceInfoD2 = d2((ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, serviceInfoD2, 1);
                    return true;
                case 9:
                    PropertyG propertyGU0 = u0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, propertyGU0, 1);
                    return true;
                case 10:
                    List<PropertyG> listZ3 = z3(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.e(parcel2, listZ3, 1);
                    return true;
                case 11:
                    ProviderInfo providerInfoV = V((ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, providerInfoV, 1);
                    return true;
                case 12:
                    ParceledListSliceG parceledListSliceGB0 = B0(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGB0, 1);
                    return true;
                case 13:
                    ParceledListSliceG parceledListSliceGT = t(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGT, 1);
                    return true;
                case 14:
                    ParceledListSliceG parceledListSliceGW2 = w2(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGW2, 1);
                    return true;
                case 15:
                    ParceledListSliceG parceledListSliceGY2 = Y2(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGY2, 1);
                    return true;
                case 16:
                    boolean zV2 = V2((ComponentName) c.d(parcel, ComponentName.CREATOR), (Intent) c.d(parcel, Intent.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zV2 ? 1 : 0);
                    return true;
                case 17:
                    ResolveInfo resolveInfoJ0 = j0((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, resolveInfoJ0, 1);
                    return true;
                case 18:
                    ResolveInfo resolveInfoP0 = p0((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, resolveInfoP0, 1);
                    return true;
                case 19:
                    ResolveInfo resolveInfoT0 = T0((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, resolveInfoT0, 1);
                    return true;
                case 20:
                    ProviderInfo providerInfoZ = z(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, providerInfoZ, 1);
                    return true;
                case 21:
                    ParceledListSliceG parceledListSliceGV1 = V1((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGV1, 1);
                    return true;
                case 22:
                    ParceledListSliceG parceledListSliceGK3 = K3((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGK3, 1);
                    return true;
                case 23:
                    ParceledListSliceG parceledListSliceGR5 = r5((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGR5, 1);
                    return true;
                case 24:
                    ParceledListSliceG parceledListSliceGY22 = y2((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGY22, 1);
                    return true;
                case 25:
                    ParceledListSliceG parceledListSliceGD3 = D3(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGD3, 1);
                    return true;
                case 26:
                    int iG3 = G3((ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iG3);
                    return true;
                case 27:
                    o0(parcel.createTypedArrayList(ComponentEnabledSettingG.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 28:
                    R(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    List<String> listR = r(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStringList(listR);
                    return true;
                case 30:
                    y1(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 31:
                    int iT1 = T1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iT1);
                    return true;
                case 32:
                    boolean zH5 = H5(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zH5 ? 1 : 0);
                    return true;
                case 33:
                    boolean zQ4 = q4(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ4 ? 1 : 0);
                    return true;
                case 34:
                    boolean zK2 = k2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zK2 ? 1 : 0);
                    return true;
                case 35:
                    GuestAppInfo guestAppInfoA4 = A4(parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, guestAppInfoA4, 1);
                    return true;
                case 36:
                    List<GuestAppInfo> listM = M();
                    parcel2.writeNoException();
                    c.e(parcel2, listM, 1);
                    return true;
                case 37:
                    ParceledListSliceG parceledListSliceGY4 = y4(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGY4, 1);
                    return true;
                case 38:
                    ApplicationInfo applicationInfoK4 = k4(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, applicationInfoK4, 1);
                    return true;
                case 39:
                    ParceledListSliceG parceledListSliceGI1 = i1(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGI1, 1);
                    return true;
                case 40:
                    List<PermissionGroup> listO2 = O2(parcel.readString());
                    parcel2.writeNoException();
                    c.e(parcel2, listO2, 1);
                    return true;
                case 41:
                    PermissionInfo permissionInfoH = H(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, permissionInfoH, 1);
                    return true;
                case 42:
                    PermissionGroupInfo permissionGroupInfoI4 = I4(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, permissionGroupInfoI4, 1);
                    return true;
                case 43:
                    List<PermissionGroupInfo> listA0 = A0(parcel.readInt());
                    parcel2.writeNoException();
                    c.e(parcel2, listA0, 1);
                    return true;
                case 44:
                    int iK0 = K0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iK0);
                    return true;
                case 45:
                    String strA4 = a4(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(strA4);
                    return true;
                case 46:
                    String[] strArrP0 = P0(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(strArrP0);
                    return true;
                case 47:
                    ParcelFileDescriptor parcelFileDescriptorC2 = c2(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    c.f(parcel2, parcelFileDescriptorC2, 1);
                    return true;
                case 48:
                    ParcelFileDescriptor[] parcelFileDescriptorArrV0 = v0(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(parcelFileDescriptorArrV0, 1);
                    return true;
                case 49:
                    String[] strArrO5 = o5(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(strArrO5);
                    return true;
                case 50:
                    ApplicationInfo applicationInfoT5 = t5(parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, applicationInfoT5, 1);
                    return true;
                case 51:
                    String strR2 = R2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strR2);
                    return true;
                case 52:
                    String strL1 = L1(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strL1);
                    return true;
                case 53:
                    String strQ2 = Q2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strQ2);
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

    List<PermissionGroupInfo> A0(int i10) throws RemoteException;

    GuestAppInfo A4(String str) throws RemoteException;

    ParceledListSliceG B0(String str, int i10, int i11) throws RemoteException;

    ParceledListSliceG D3(String str, int i10, int i11) throws RemoteException;

    PackageInfo D5(String str, int i10, int i11, boolean z10) throws RemoteException;

    int G3(ComponentName componentName, int i10) throws RemoteException;

    PermissionInfo H(String str, int i10) throws RemoteException;

    boolean H5(String str, boolean z10, int i10) throws RemoteException;

    PermissionGroupInfo I4(String str, int i10) throws RemoteException;

    int K0(String str, int i10) throws RemoteException;

    ParceledListSliceG K3(Intent intent, String str, int i10, int i11) throws RemoteException;

    String L1(String str, String str2) throws RemoteException;

    List<GuestAppInfo> M() throws RemoteException;

    List<PermissionGroup> O2(String str) throws RemoteException;

    String[] P0(int i10) throws RemoteException;

    String Q2(String str) throws RemoteException;

    void R(String str, int i10, int i11, int i12) throws RemoteException;

    String R2(String str) throws RemoteException;

    ResolveInfo T0(Intent intent, String str, int i10, int i11) throws RemoteException;

    int T1(String str, int i10) throws RemoteException;

    ActivityInfo U3(ComponentName componentName, int i10, int i11) throws RemoteException;

    ProviderInfo V(ComponentName componentName, int i10, int i11) throws RemoteException;

    ParceledListSliceG V1(Intent intent, String str, int i10, int i11) throws RemoteException;

    boolean V2(ComponentName componentName, Intent intent, String str) throws RemoteException;

    ParceledListSliceG Y2(String str, int i10, int i11) throws RemoteException;

    ActivityInfo Z(ComponentName componentName, int i10, int i11) throws RemoteException;

    String a4(int i10) throws RemoteException;

    ParcelFileDescriptor c2(String str, boolean z10) throws RemoteException;

    ServiceInfo d2(ComponentName componentName, int i10, int i11) throws RemoteException;

    boolean g3(String str) throws RemoteException;

    String i0(String str) throws RemoteException;

    ParceledListSliceG i1(int i10, int i11) throws RemoteException;

    ResolveInfo j0(Intent intent, String str, int i10, int i11) throws RemoteException;

    int j3(String str, String str2, int i10) throws RemoteException;

    boolean k2(String str) throws RemoteException;

    ApplicationInfo k4(String str, int i10, int i11) throws RemoteException;

    void o0(List<ComponentEnabledSettingG> list, int i10) throws RemoteException;

    String[] o5(String str) throws RemoteException;

    ResolveInfo p0(Intent intent, String str, int i10, int i11) throws RemoteException;

    boolean q4(String str, int i10) throws RemoteException;

    List<String> r(String str, String str2, int i10) throws RemoteException;

    ParceledListSliceG r5(Intent intent, String str, int i10, int i11) throws RemoteException;

    ParceledListSliceG t(String str, int i10, int i11) throws RemoteException;

    ApplicationInfo t5(String str) throws RemoteException;

    PropertyG u0(String str, String str2, String str3, int i10) throws RemoteException;

    int u2(String str, int i10) throws RemoteException;

    ParcelFileDescriptor[] v0(String str) throws RemoteException;

    ParceledListSliceG w2(String str, int i10, int i11) throws RemoteException;

    void y1(String str, String str2, List<String> list, int i10) throws RemoteException;

    ParceledListSliceG y2(Intent intent, String str, int i10, int i11) throws RemoteException;

    ParceledListSliceG y4(int i10, int i11) throws RemoteException;

    ProviderInfo z(String str, int i10, int i11) throws RemoteException;

    List<PropertyG> z3(String str, int i10, int i11) throws RemoteException;
}
