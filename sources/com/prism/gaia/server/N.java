package com.prism.gaia.server;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.client.stub.r;
import com.prism.gaia.client.stub.s;
import com.prism.gaia.os.ParceledListSliceG;
import com.prism.gaia.remote.BadgerInfo;
import com.prism.gaia.remote.GaiaTaskInfo;
import com.prism.gaia.remote.GuestProcessInfo;
import com.prism.gaia.remote.PendingIntentInfoG;
import com.prism.gaia.remote.ProviderPlacementG;
import com.prism.gaia.remote.RunningProcessInfo;
import com.prism.gaia.remote.StubProcessInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface N extends IInterface {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f166168g3 = "com.prism.gaia.server.IActivityManager";

    public static class a implements N {
        @Override // com.prism.gaia.server.N
        public ComponentName A2(IBinder iBinder, Intent intent, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void B4(String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void C1() throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void D0(String str, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public boolean E4(IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public String F3(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void F4(IBinder iBinder, Intent intent, String str, IBinder iBinder2, String str2, int i10, int i11, int i12, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public GuestProcessInfo G(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public GaiaTaskInfo H2(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public boolean H3(int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public void J1(IBinder iBinder, IBinder iBinder2, IBinder iBinder3) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public PendingIntent K(int i10, int i11, String str, String str2, int i12, Intent[] intentArr, String[] strArr, int i13, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public int L5(IBinder iBinder, Intent intent) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public String N0(IBinder iBinder, String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void N5(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void O1(IBinder iBinder, Intent intent, IBinder iBinder2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public StubProcessInfo O3(String str, String str2, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void P(IBinder iBinder, String[] strArr, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public List<String> P1() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void R5(String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public String S1(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public List<ActivityManager.RunningAppProcessInfo> S5(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public String U2(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public boolean V0(ComponentName componentName, IBinder iBinder, int i10, int i11) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public IBinder W(int i10, ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public ParceledListSliceG X(int i10, int i11, int i12) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public String X1(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void Y3(BadgerInfo badgerInfo) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public ProviderPlacementG Z1(int i10, ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void Z4(IBinder iBinder, Intent intent, boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void a3(IBinder iBinder) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public int b0(IBinder iBinder, Intent intent, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public void b1(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void d4(IBinder iBinder, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public int e0(IBinder iBinder, IBinder iBinder2, Intent intent, com.prism.gaia.client.stub.s sVar, int i10, String str, int i11) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public void e5(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void f0(Intent intent, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public String f2(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public List<RunningProcessInfo> g0() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public boolean g5(com.prism.gaia.client.stub.s sVar) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public void i2(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void i4(String str, IBinder iBinder, int i10, Intent intent) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void j(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public int j1(IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public void j4(IBinder iBinder, Intent intent) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public String k1(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void l0(String str, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public void m0(String str, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public String m1(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public int m2(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public Intent m4(Intent intent, String str, boolean z10, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public int m5(int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public IBinder n0(Intent intent, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public List<String> n5() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public ComponentName o(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void o1(com.prism.gaia.client.stub.r rVar) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public int o2(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public int p1(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle, int i11) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public int q(IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public boolean q5(IBinder iBinder, int i10, String str, Bundle bundle, boolean z10, int i11) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public List<String> r0(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public ComponentName r1(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void s2(IBinder iBinder) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public boolean t4(IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public boolean u(IBinder iBinder, boolean z10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.N
        public PendingIntentInfoG u3(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public int u4(Intent intent, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.N
        public Intent v2(IBinder iBinder, com.prism.gaia.client.stub.r rVar, IntentFilter intentFilter, String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.N
        public void x(IBinder iBinder, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // com.prism.gaia.server.N
        public int x4(Intent intent, IBinder iBinder, String str, int i10, IBinder iBinder2, Bundle bundle, int i11) throws RemoteException {
            return 0;
        }
    }

    public static abstract class b extends Binder implements N {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f166169A = 27;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f166170B = 28;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int f166171C = 29;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int f166172D = 30;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int f166173E = 31;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int f166174F = 32;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final int f166175G = 33;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final int f166176H = 34;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final int f166177I = 35;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final int f166178J = 36;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final int f166179K = 37;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final int f166180L = 38;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final int f166181M = 39;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final int f166182N = 40;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final int f166183O = 41;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final int f166184P = 42;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final int f166185Q = 43;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final int f166186R = 44;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final int f166187S = 45;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final int f166188T = 46;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final int f166189U = 47;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final int f166190V = 48;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public static final int f166191W = 49;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final int f166192X = 50;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final int f166193Y = 51;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final int f166194Z = 52;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166195a = 1;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final int f166196a0 = 53;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166197b = 2;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final int f166198b0 = 54;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166199c = 3;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final int f166200c0 = 55;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166201d = 4;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final int f166202d0 = 56;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166203e = 5;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public static final int f166204e0 = 57;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166205f = 6;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public static final int f166206f0 = 58;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166207g = 7;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public static final int f166208g0 = 59;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166209h = 8;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public static final int f166210h0 = 60;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166211i = 9;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public static final int f166212i0 = 61;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f166213j = 10;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public static final int f166214j0 = 62;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f166215k = 11;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static final int f166216k0 = 63;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f166217l = 12;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static final int f166218l0 = 64;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f166219m = 13;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final int f166220m0 = 65;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f166221n = 14;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final int f166222n0 = 66;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f166223o = 15;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final int f166224o0 = 67;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f166225p = 16;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f166226p0 = 68;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f166227q = 17;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f166228q0 = 69;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f166229r = 18;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f166230r0 = 70;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f166231s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f166232t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f166233u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f166234v = 22;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f166235w = 23;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f166236x = 24;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f166237y = 25;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f166238z = 26;

        public static class a implements N {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166239a;

            public a(IBinder iBinder) {
                this.f166239a = iBinder;
            }

            @Override // com.prism.gaia.server.N
            public ComponentName A2(IBinder iBinder, Intent intent, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ComponentName) c.d(parcelObtain2, ComponentName.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void B4(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    this.f166239a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void C1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    this.f166239a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void D0(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean E4(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(60, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String F3(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void F4(IBinder iBinder, Intent intent, String str, IBinder iBinder2, String str2, int i10, int i11, int i12, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder2);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    c.f(parcelObtain, bundle, 0);
                    this.f166239a.transact(58, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public GuestProcessInfo G(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GuestProcessInfo) c.d(parcelObtain2, GuestProcessInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public GaiaTaskInfo H2(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GaiaTaskInfo) c.d(parcelObtain2, GaiaTaskInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean H3(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void J1(IBinder iBinder, IBinder iBinder2, IBinder iBinder3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeStrongBinder(iBinder2);
                    parcelObtain.writeStrongBinder(iBinder3);
                    this.f166239a.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public PendingIntent K(int i10, int i11, String str, String str2, int i12, Intent[] intentArr, String[] strArr, int i13, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeTypedArray(intentArr, 0);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i13);
                    c.f(parcelObtain, bundle, 0);
                    this.f166239a.transact(56, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PendingIntent) c.d(parcelObtain2, PendingIntent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int L5(IBinder iBinder, Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    this.f166239a.transact(57, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String N0(IBinder iBinder, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    this.f166239a.transact(64, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void N5(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void O1(IBinder iBinder, Intent intent, IBinder iBinder2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeStrongBinder(iBinder2);
                    this.f166239a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public StubProcessInfo O3(String str, String str2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (StubProcessInfo) c.d(parcelObtain2, StubProcessInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void P(IBinder iBinder, String[] strArr, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public List<String> P1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    this.f166239a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void R5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    this.f166239a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String S1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(67, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public List<ActivityManager.RunningAppProcessInfo> S5(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return N.f166168g3;
            }

            @Override // com.prism.gaia.server.N
            public String U2(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(63, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean V0(ComponentName componentName, IBinder iBinder, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f166239a.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public IBinder W(int i10, ProviderInfo providerInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, providerInfo, 0);
                    this.f166239a.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public ParceledListSliceG X(int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f166239a.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.d(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String X1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void Y3(BadgerInfo badgerInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, badgerInfo, 0);
                    this.f166239a.transact(69, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public ProviderPlacementG Z1(int i10, ProviderInfo providerInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, providerInfo, 0);
                    this.f166239a.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ProviderPlacementG) c.d(parcelObtain2, ProviderPlacementG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void Z4(IBinder iBinder, Intent intent, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166239a.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void a3(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166239a;
            }

            @Override // com.prism.gaia.server.N
            public int b0(IBinder iBinder, Intent intent, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void b1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(59, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void d4(IBinder iBinder, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int e0(IBinder iBinder, IBinder iBinder2, Intent intent, com.prism.gaia.client.stub.s sVar, int i10, String str, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeStrongBinder(iBinder2);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeStrongInterface(sVar);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    this.f166239a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void e5(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(70, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void f0(Intent intent, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(54, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String f2(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public List<RunningProcessInfo> g0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    this.f166239a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(RunningProcessInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean g5(com.prism.gaia.client.stub.s sVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongInterface(sVar);
                    this.f166239a.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void i2(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(68, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void i4(String str, IBinder iBinder, int i10, Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, intent, 0);
                    this.f166239a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void j(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int j1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(62, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void j4(IBinder iBinder, Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, intent, 0);
                    this.f166239a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String k1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(65, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void l0(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void m0(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(66, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public String m1(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int m2(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeStrongInterface(rVar);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f166239a.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public Intent m4(Intent intent, String str, boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Intent) c.d(parcelObtain2, Intent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int m5(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public IBinder n0(Intent intent, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public List<String> n5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    this.f166239a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public ComponentName o(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ComponentName) c.d(parcelObtain2, ComponentName.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void o1(com.prism.gaia.client.stub.r rVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongInterface(rVar);
                    this.f166239a.transact(52, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int o2(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeTypedArray(intentArr, 0);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int p1(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(i11);
                    this.f166239a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int q(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean q5(IBinder iBinder, int i10, String str, Bundle bundle, boolean z10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f166239a.transact(55, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public List<String> r0(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public ComponentName r1(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ComponentName) c.d(parcelObtain2, ComponentName.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void s2(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean t4(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public boolean u(IBinder iBinder, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166239a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public PendingIntentInfoG u3(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f166239a.transact(61, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PendingIntentInfoG) c.d(parcelObtain2, PendingIntentInfoG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int u4(Intent intent, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeInt(i10);
                    this.f166239a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public Intent v2(IBinder iBinder, com.prism.gaia.client.stub.r rVar, IntentFilter intentFilter, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeStrongInterface(rVar);
                    c.f(parcelObtain, intentFilter, 0);
                    parcelObtain.writeString(str);
                    this.f166239a.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Intent) c.d(parcelObtain2, Intent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public void x(IBinder iBinder, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f166239a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.N
            public int x4(Intent intent, IBinder iBinder, String str, int i10, IBinder iBinder2, Bundle bundle, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(N.f166168g3);
                    c.f(parcelObtain, intent, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder2);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(i11);
                    this.f166239a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, N.f166168g3);
        }

        public static N U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(N.f166168g3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof N)) ? new a(iBinder) : (N) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            boolean z10;
            Parcel parcel3;
            com.prism.gaia.client.stub.r rVar;
            Bundle bundle;
            boolean z11;
            boolean z12;
            Bundle bundle2;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(N.f166168g3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(N.f166168g3);
                return true;
            }
            switch (i10) {
                case 1:
                    C1();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zH3 = H3(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zH3 ? 1 : 0);
                    return true;
                case 3:
                    int iM5 = m5(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iM5);
                    return true;
                case 4:
                    String strM1 = m1(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(strM1);
                    return true;
                case 5:
                    String strF2 = f2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(strF2);
                    return true;
                case 6:
                    List<String> listR0 = r0(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStringList(listR0);
                    return true;
                case 7:
                    List<ActivityManager.RunningAppProcessInfo> listS5 = S5(parcel.readInt());
                    parcel2.writeNoException();
                    c.e(parcel2, listS5, 1);
                    return true;
                case 8:
                    GuestProcessInfo guestProcessInfoG = G(parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, guestProcessInfoG, 1);
                    return true;
                case 9:
                    StubProcessInfo stubProcessInfoO3 = O3(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, stubProcessInfoO3, 1);
                    return true;
                case 10:
                    R5(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    B4(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    List<String> listP1 = P1();
                    parcel2.writeNoException();
                    parcel2.writeStringList(listP1);
                    return true;
                case 13:
                    List<RunningProcessInfo> listG0 = g0();
                    parcel2.writeNoException();
                    c.e(parcel2, listG0, 1);
                    return true;
                case 14:
                    D0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    l0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    j4(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    List<String> listN5 = n5();
                    parcel2.writeNoException();
                    parcel2.writeStringList(listN5);
                    return true;
                case 18:
                    int iX4 = x4((Intent) c.d(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.d(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iX4);
                    return true;
                case 19:
                    P(parcel.readStrongBinder(), parcel.createStringArray(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    int iU4 = u4((Intent) c.d(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iU4);
                    return true;
                case 21:
                    int iP1 = p1((Intent) c.d(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iP1);
                    return true;
                case 22:
                    int iO2 = o2((Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readStrongBinder(), (Bundle) c.d(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iO2);
                    return true;
                case 23:
                    i4(parcel.readString(), parcel.readStrongBinder(), parcel.readInt(), (Intent) c.d(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    N5(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    j(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    s2(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    d4(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 28:
                    a3(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    boolean zU = u(parcel.readStrongBinder(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zU ? 1 : 0);
                    return true;
                case 30:
                    GaiaTaskInfo gaiaTaskInfoH2 = H2(parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, gaiaTaskInfoH2, 1);
                    return true;
                case 31:
                    int iQ = q(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(iQ);
                    return true;
                case 32:
                    String strX1 = X1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeString(strX1);
                    return true;
                case 33:
                    ComponentName componentNameO = o(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.f(parcel2, componentNameO, 1);
                    return true;
                case 34:
                    String strF3 = F3(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeString(strF3);
                    return true;
                case 35:
                    ComponentName componentNameR1 = r1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.f(parcel2, componentNameR1, 1);
                    return true;
                case 36:
                    boolean zT4 = t4(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(zT4 ? 1 : 0);
                    return true;
                case 37:
                    Intent intentM4 = m4((Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, intentM4, 1);
                    return true;
                case 38:
                    ComponentName componentNameA2 = A2(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, componentNameA2, 1);
                    return true;
                case 39:
                    int iB0 = b0(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iB0);
                    return true;
                case 40:
                    boolean zV0 = V0((ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zV0 ? 1 : 0);
                    return true;
                case 41:
                    int iE0 = e0(parcel.readStrongBinder(), parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR), s.b.U0(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iE0);
                    return true;
                case 42:
                    boolean zG5 = g5(s.b.U0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG5 ? 1 : 0);
                    return true;
                case 43:
                    Z4(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    x(parcel.readStrongBinder(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    O1(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    J1(parcel.readStrongBinder(), parcel.readStrongBinder(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 47:
                    IBinder iBinderN0 = n0((Intent) c.d(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderN0);
                    return true;
                case 48:
                    ParceledListSliceG parceledListSliceGX = X(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, parceledListSliceGX, 1);
                    return true;
                case 49:
                    ProviderPlacementG providerPlacementGZ1 = Z1(parcel.readInt(), (ProviderInfo) c.d(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    c.f(parcel2, providerPlacementGZ1, 1);
                    return true;
                case 50:
                    IBinder iBinderW = W(parcel.readInt(), (ProviderInfo) c.d(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderW);
                    return true;
                case 51:
                    Intent intentV2 = v2(parcel.readStrongBinder(), r.b.U0(parcel.readStrongBinder()), (IntentFilter) c.d(parcel, IntentFilter.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    c.f(parcel2, intentV2, 1);
                    return true;
                case 52:
                    o1(r.b.U0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    Intent intent = (Intent) c.d(parcel, Intent.CREATOR);
                    com.prism.gaia.client.stub.r rVarU0 = r.b.U0(parcel.readStrongBinder());
                    int i12 = parcel.readInt();
                    boolean z13 = false;
                    String string = parcel.readString();
                    Bundle bundle3 = (Bundle) c.d(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z10 = false;
                        z13 = true;
                    } else {
                        z10 = false;
                    }
                    if (parcel.readInt() != 0) {
                        parcel3 = parcel;
                        rVar = rVarU0;
                        bundle = bundle3;
                        z11 = true;
                    } else {
                        parcel3 = parcel;
                        rVar = rVarU0;
                        bundle = bundle3;
                        z11 = z10;
                    }
                    int iM2 = m2(intent, rVar, i12, string, bundle, z13, z11, parcel3.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iM2);
                    return true;
                case 54:
                    f0((Intent) c.d(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 55:
                    IBinder strongBinder = parcel.readStrongBinder();
                    int i13 = parcel.readInt();
                    String string2 = parcel.readString();
                    Bundle bundle4 = (Bundle) c.d(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        bundle2 = bundle4;
                        z12 = true;
                    } else {
                        z12 = false;
                        bundle2 = bundle4;
                    }
                    boolean zQ5 = q5(strongBinder, i13, string2, bundle2, z12, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ5 ? 1 : 0);
                    return true;
                case 56:
                    PendingIntent pendingIntentK = K(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.f(parcel2, pendingIntentK, 1);
                    return true;
                case 57:
                    int iL5 = L5(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iL5);
                    return true;
                case 58:
                    F4(parcel.readStrongBinder(), (Intent) c.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 59:
                    b1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 60:
                    boolean zE4 = E4(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(zE4 ? 1 : 0);
                    return true;
                case 61:
                    PendingIntentInfoG pendingIntentInfoGU3 = u3(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.f(parcel2, pendingIntentInfoGU3, 1);
                    return true;
                case 62:
                    int iJ1 = j1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(iJ1);
                    return true;
                case 63:
                    String strU2 = U2(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeString(strU2);
                    return true;
                case 64:
                    String strN0 = N0(parcel.readStrongBinder(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strN0);
                    return true;
                case 65:
                    String strK1 = k1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeString(strK1);
                    return true;
                case 66:
                    m0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 67:
                    String strS1 = S1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeString(strS1);
                    return true;
                case 68:
                    i2(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 69:
                    Y3((BadgerInfo) c.d(parcel, BadgerInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 70:
                    e5(parcel.readStrongBinder());
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

    ComponentName A2(IBinder iBinder, Intent intent, int i10) throws RemoteException;

    void B4(String str) throws RemoteException;

    void C1() throws RemoteException;

    void D0(String str, int i10) throws RemoteException;

    boolean E4(IBinder iBinder) throws RemoteException;

    String F3(IBinder iBinder) throws RemoteException;

    void F4(IBinder iBinder, Intent intent, String str, IBinder iBinder2, String str2, int i10, int i11, int i12, Bundle bundle) throws RemoteException;

    GuestProcessInfo G(int i10) throws RemoteException;

    GaiaTaskInfo H2(int i10) throws RemoteException;

    boolean H3(int i10) throws RemoteException;

    void J1(IBinder iBinder, IBinder iBinder2, IBinder iBinder3) throws RemoteException;

    PendingIntent K(int i10, int i11, String str, String str2, int i12, Intent[] intentArr, String[] strArr, int i13, Bundle bundle) throws RemoteException;

    int L5(IBinder iBinder, Intent intent) throws RemoteException;

    String N0(IBinder iBinder, String str) throws RemoteException;

    void N5(IBinder iBinder) throws RemoteException;

    void O1(IBinder iBinder, Intent intent, IBinder iBinder2) throws RemoteException;

    StubProcessInfo O3(String str, String str2, int i10) throws RemoteException;

    void P(IBinder iBinder, String[] strArr, int i10) throws RemoteException;

    List<String> P1() throws RemoteException;

    void R5(String str) throws RemoteException;

    String S1(IBinder iBinder) throws RemoteException;

    List<ActivityManager.RunningAppProcessInfo> S5(int i10) throws RemoteException;

    String U2(IBinder iBinder) throws RemoteException;

    boolean V0(ComponentName componentName, IBinder iBinder, int i10, int i11) throws RemoteException;

    IBinder W(int i10, ProviderInfo providerInfo) throws RemoteException;

    ParceledListSliceG X(int i10, int i11, int i12) throws RemoteException;

    String X1(IBinder iBinder) throws RemoteException;

    void Y3(BadgerInfo badgerInfo) throws RemoteException;

    ProviderPlacementG Z1(int i10, ProviderInfo providerInfo) throws RemoteException;

    void Z4(IBinder iBinder, Intent intent, boolean z10) throws RemoteException;

    void a3(IBinder iBinder) throws RemoteException;

    int b0(IBinder iBinder, Intent intent, int i10) throws RemoteException;

    void b1(IBinder iBinder) throws RemoteException;

    void d4(IBinder iBinder, int i10) throws RemoteException;

    int e0(IBinder iBinder, IBinder iBinder2, Intent intent, com.prism.gaia.client.stub.s sVar, int i10, String str, int i11) throws RemoteException;

    void e5(IBinder iBinder) throws RemoteException;

    void f0(Intent intent, int i10) throws RemoteException;

    String f2(int i10) throws RemoteException;

    List<RunningProcessInfo> g0() throws RemoteException;

    boolean g5(com.prism.gaia.client.stub.s sVar) throws RemoteException;

    void i2(IBinder iBinder) throws RemoteException;

    void i4(String str, IBinder iBinder, int i10, Intent intent) throws RemoteException;

    void j(IBinder iBinder) throws RemoteException;

    int j1(IBinder iBinder) throws RemoteException;

    void j4(IBinder iBinder, Intent intent) throws RemoteException;

    String k1(IBinder iBinder) throws RemoteException;

    void l0(String str, int i10) throws RemoteException;

    void m0(String str, int i10) throws RemoteException;

    String m1(int i10) throws RemoteException;

    int m2(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException;

    Intent m4(Intent intent, String str, boolean z10, int i10) throws RemoteException;

    int m5(int i10) throws RemoteException;

    IBinder n0(Intent intent, int i10) throws RemoteException;

    List<String> n5() throws RemoteException;

    ComponentName o(IBinder iBinder) throws RemoteException;

    void o1(com.prism.gaia.client.stub.r rVar) throws RemoteException;

    int o2(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, int i10) throws RemoteException;

    int p1(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle, int i11) throws RemoteException;

    int q(IBinder iBinder) throws RemoteException;

    boolean q5(IBinder iBinder, int i10, String str, Bundle bundle, boolean z10, int i11) throws RemoteException;

    List<String> r0(int i10) throws RemoteException;

    ComponentName r1(IBinder iBinder) throws RemoteException;

    void s2(IBinder iBinder) throws RemoteException;

    boolean t4(IBinder iBinder) throws RemoteException;

    boolean u(IBinder iBinder, boolean z10) throws RemoteException;

    PendingIntentInfoG u3(IBinder iBinder) throws RemoteException;

    int u4(Intent intent, int i10) throws RemoteException;

    Intent v2(IBinder iBinder, com.prism.gaia.client.stub.r rVar, IntentFilter intentFilter, String str) throws RemoteException;

    void x(IBinder iBinder, int i10, int i11, int i12) throws RemoteException;

    int x4(Intent intent, IBinder iBinder, String str, int i10, IBinder iBinder2, Bundle bundle, int i11) throws RemoteException;
}
