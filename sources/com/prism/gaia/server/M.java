package com.prism.gaia.server;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface M extends IInterface {

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final String f166120f3 = "com.prism.gaia.server.IAccountManager";

    public static class a implements M {
        @Override // com.prism.gaia.server.M
        public boolean A(Account account, String str, Bundle bundle, Map map) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.M
        public String C0(Account account) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void C2(IBinder iBinder, Account account, boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void C4(IBinder iBinder, Account account, String[] strArr, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public Account[] D(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public boolean D4(Account account, String str, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.M
        public void E(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public AuthenticatorDescription[] E1(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public Account[] F(String str, int i10, String str2) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void G0(IBinder iBinder, Account account, Bundle bundle, boolean z10, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void G2(IBinder iBinder, Account account, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public Bundle I2(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public boolean K2(Account account, String str, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.M
        public void L0(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void M0(String[] strArr, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void M3(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void M4(IBinder iBinder, String str, boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void N4(IBinder iBinder, Account account, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void Q3(Account account, String str, String str2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public Account[] Q4(String str, int i10, String str2) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public boolean R3(Account account) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.M
        public void S0(Account account, String str, int i10, boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public Map S3(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void T4(IBinder iBinder, Bundle bundle, boolean z10, Bundle bundle2, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public int Y(Account account, String str) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.M
        public String a0(Account account, String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public Account[] b2(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public String c0(Account account) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void c1(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void c5(IBinder iBinder, String str, String str2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public boolean h(Account account) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.M
        public void j5(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public String l3(Account account, String str) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void m3(IBinder iBinder, Account account, String str, boolean z10, boolean z11, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public Map o3(Account account) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public Account[] o4(String str, String str2, String str3) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void p(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public boolean p5(Account account, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.M
        public void q1(Account account, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void r4(Account account) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void s(Account account, String str, String str2) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public Map s1(Account account, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.M
        public void t2(String[] strArr, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void w(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void w1(IBinder iBinder, Account account, boolean z10, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.M
        public void x5(String str, String str2) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements M {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f166121A = 27;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f166122B = 28;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int f166123C = 29;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int f166124D = 30;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int f166125E = 31;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int f166126F = 32;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final int f166127G = 33;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final int f166128H = 34;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final int f166129I = 35;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final int f166130J = 36;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final int f166131K = 37;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final int f166132L = 38;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final int f166133M = 39;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final int f166134N = 40;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final int f166135O = 41;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final int f166136P = 42;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final int f166137Q = 43;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final int f166138R = 44;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final int f166139S = 45;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final int f166140T = 46;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166141a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166142b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166143c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166144d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166145e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166146f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166147g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166148h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166149i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f166150j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f166151k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f166152l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f166153m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f166154n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f166155o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f166156p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f166157q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f166158r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f166159s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f166160t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f166161u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f166162v = 22;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f166163w = 23;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f166164x = 24;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f166165y = 25;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f166166z = 26;

        public static class a implements M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166167a;

            public a(IBinder iBinder) {
                this.f166167a = iBinder;
            }

            @Override // com.prism.gaia.server.M
            public boolean A(Account account, String str, Bundle bundle, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeMap(map);
                    this.f166167a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public String C0(Account account) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    this.f166167a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void C2(IBinder iBinder, Account account, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166167a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void C4(IBinder iBinder, Account account, String[] strArr, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Account[] D(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public boolean D4(Account account, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f166167a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void E(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f166167a.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public AuthenticatorDescription[] E1(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (AuthenticatorDescription[]) parcelObtain2.createTypedArray(AuthenticatorDescription.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Account[] F(String str, int i10, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void G0(IBinder iBinder, Account account, Bundle bundle, boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void G2(IBinder iBinder, Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Bundle I2(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public boolean K2(Account account, String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void L0(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void M0(String[] strArr, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void M3(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f166167a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void M4(IBinder iBinder, String str, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166167a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void N4(IBinder iBinder, Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void Q3(Account account, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Account[] Q4(String str, int i10, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public boolean R3(Account account) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    this.f166167a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void S0(Account account, String str, int i10, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166167a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Map S3(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void T4(IBinder iBinder, Bundle bundle, boolean z10, Bundle bundle2, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle2, 0);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return M.f166120f3;
            }

            @Override // com.prism.gaia.server.M
            public int Y(Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public String a0(Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166167a;
            }

            @Override // com.prism.gaia.server.M
            public Account[] b2(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public String c0(Account account) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    this.f166167a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void c1(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void c5(IBinder iBinder, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public boolean h(Account account) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    this.f166167a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void j5(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public String l3(Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void m3(IBinder iBinder, Account account, String str, boolean z10, boolean z11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f166167a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Map o3(Account account) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    this.f166167a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Account[] o4(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f166167a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void p(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f166167a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public boolean p5(Account account, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void q1(Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void r4(Account account) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    this.f166167a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void s(Account account, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public Map s1(Account account, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void t2(String[] strArr, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    this.f166167a.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void w(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f166167a.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void w1(IBinder iBinder, Account account, boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.d(parcelObtain, account, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f166167a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.M
            public void x5(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(M.f166120f3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f166167a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, M.f166120f3);
        }

        public static M h2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(M.f166120f3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof M)) ? new a(iBinder) : (M) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(M.f166120f3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(M.f166120f3);
                return true;
            }
            switch (i10) {
                case 1:
                    String strC0 = c0((Account) c.c(parcel, Account.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeString(strC0);
                    return true;
                case 2:
                    String strA0 = a0((Account) c.c(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strA0);
                    return true;
                case 3:
                    AuthenticatorDescription[] authenticatorDescriptionArrE1 = E1(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(authenticatorDescriptionArrE1, 1);
                    return true;
                case 4:
                    Account[] accountArrB2 = b2(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountArrB2, 1);
                    return true;
                case 5:
                    Account[] accountArrF = F(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountArrF, 1);
                    return true;
                case 6:
                    Account[] accountArrO4 = o4(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountArrO4, 1);
                    return true;
                case 7:
                    Account[] accountArrQ4 = Q4(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountArrQ4, 1);
                    return true;
                case 8:
                    C4(parcel.readStrongBinder(), (Account) c.c(parcel, Account.CREATOR), parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    L0(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    j5(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean zD4 = D4((Account) c.c(parcel, Account.CREATOR), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zD4 ? 1 : 0);
                    return true;
                case 12:
                    boolean z10 = false;
                    IBinder strongBinder = parcel.readStrongBinder();
                    Account account = (Account) c.c(parcel, Account.CREATOR);
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    C2(strongBinder, account, z10);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean z11 = false;
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    Account account2 = (Account) c.c(parcel, Account.CREATOR);
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    w1(strongBinder2, account2, z11, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    boolean zH = h((Account) c.c(parcel, Account.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zH ? 1 : 0);
                    return true;
                case 15:
                    x5(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    String strL3 = l3((Account) c.c(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strL3);
                    return true;
                case 17:
                    s((Account) c.c(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    q1((Account) c.c(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    r4((Account) c.c(parcel, Account.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    Q3((Account) c.c(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean z12 = false;
                    Account account3 = (Account) c.c(parcel, Account.CREATOR);
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z12 = true;
                    }
                    S0(account3, string, i12, z12);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean z13 = false;
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    Account account4 = (Account) c.c(parcel, Account.CREATOR);
                    String string2 = parcel.readString();
                    boolean z14 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z13 = true;
                    }
                    m3(strongBinder3, account4, string2, z14, z13, (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean z15 = false;
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    if (parcel.readInt() != 0) {
                        z15 = true;
                    }
                    M3(strongBinder4, string3, string4, strArrCreateStringArray, z15, (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean z16 = false;
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String[] strArrCreateStringArray2 = parcel.createStringArray();
                    if (parcel.readInt() != 0) {
                        z16 = true;
                    }
                    c1(strongBinder5, string5, string6, strArrCreateStringArray2, z16, (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    p(parcel.readStrongBinder(), (Account) c.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    boolean z17 = false;
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    String string7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z17 = true;
                    }
                    M4(strongBinder6, string7, z17);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    G0(parcel.readStrongBinder(), (Account) c.c(parcel, Account.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 28:
                    boolean zR3 = R3((Account) c.c(parcel, Account.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zR3 ? 1 : 0);
                    return true;
                case 29:
                    c5(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 30:
                    N4(parcel.readStrongBinder(), (Account) c.c(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 31:
                    String strC02 = C0((Account) c.c(parcel, Account.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeString(strC02);
                    return true;
                case 32:
                    boolean z18 = false;
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    String[] strArrCreateStringArray3 = parcel.createStringArray();
                    if (parcel.readInt() != 0) {
                        z18 = true;
                    }
                    w(strongBinder7, string8, string9, strArrCreateStringArray3, z18, (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    E(parcel.readStrongBinder(), (Account) c.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    T4(strongBinder8, (Bundle) c.c(parcel, creator), parcel.readInt() != 0, (Bundle) c.c(parcel, creator), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    G2(parcel.readStrongBinder(), (Account) c.c(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    Map mapO3 = o3((Account) c.c(parcel, Account.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeMap(mapO3);
                    return true;
                case 37:
                    Account[] accountArrD = D(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountArrD, 1);
                    return true;
                case 38:
                    Map mapS1 = s1((Account) c.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeMap(mapS1);
                    return true;
                case 39:
                    boolean zP5 = p5((Account) c.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zP5 ? 1 : 0);
                    return true;
                case 40:
                    Bundle bundleI2 = I2(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, bundleI2, 1);
                    return true;
                case 41:
                    boolean zA = A((Account) c.c(parcel, Account.CREATOR), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zA ? 1 : 0);
                    return true;
                case 42:
                    boolean zK2 = K2((Account) c.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zK2 ? 1 : 0);
                    return true;
                case 43:
                    int iY = Y((Account) c.c(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iY);
                    return true;
                case 44:
                    Map mapS3 = S3(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeMap(mapS3);
                    return true;
                case 45:
                    M0(parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    t2(parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
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

    boolean A(Account account, String str, Bundle bundle, Map map) throws RemoteException;

    String C0(Account account) throws RemoteException;

    void C2(IBinder iBinder, Account account, boolean z10) throws RemoteException;

    void C4(IBinder iBinder, Account account, String[] strArr, String str) throws RemoteException;

    Account[] D(int i10) throws RemoteException;

    boolean D4(Account account, String str, Bundle bundle) throws RemoteException;

    void E(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) throws RemoteException;

    AuthenticatorDescription[] E1(int i10) throws RemoteException;

    Account[] F(String str, int i10, String str2) throws RemoteException;

    void G0(IBinder iBinder, Account account, Bundle bundle, boolean z10, int i10) throws RemoteException;

    void G2(IBinder iBinder, Account account, String str) throws RemoteException;

    Bundle I2(String str, int i10) throws RemoteException;

    boolean K2(Account account, String str, int i10) throws RemoteException;

    void L0(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException;

    void M0(String[] strArr, String str) throws RemoteException;

    void M3(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) throws RemoteException;

    void M4(IBinder iBinder, String str, boolean z10) throws RemoteException;

    void N4(IBinder iBinder, Account account, String str) throws RemoteException;

    void Q3(Account account, String str, String str2) throws RemoteException;

    Account[] Q4(String str, int i10, String str2) throws RemoteException;

    boolean R3(Account account) throws RemoteException;

    void S0(Account account, String str, int i10, boolean z10) throws RemoteException;

    Map S3(String str, String str2) throws RemoteException;

    void T4(IBinder iBinder, Bundle bundle, boolean z10, Bundle bundle2, int i10) throws RemoteException;

    int Y(Account account, String str) throws RemoteException;

    String a0(Account account, String str) throws RemoteException;

    Account[] b2(String str, String str2) throws RemoteException;

    String c0(Account account) throws RemoteException;

    void c1(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle, int i10) throws RemoteException;

    void c5(IBinder iBinder, String str, String str2) throws RemoteException;

    boolean h(Account account) throws RemoteException;

    void j5(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException;

    String l3(Account account, String str) throws RemoteException;

    void m3(IBinder iBinder, Account account, String str, boolean z10, boolean z11, Bundle bundle) throws RemoteException;

    Map o3(Account account) throws RemoteException;

    Account[] o4(String str, String str2, String str3) throws RemoteException;

    void p(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) throws RemoteException;

    boolean p5(Account account, int i10) throws RemoteException;

    void q1(Account account, String str) throws RemoteException;

    void r4(Account account) throws RemoteException;

    void s(Account account, String str, String str2) throws RemoteException;

    Map s1(Account account, int i10) throws RemoteException;

    void t2(String[] strArr, String str) throws RemoteException;

    void w(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) throws RemoteException;

    void w1(IBinder iBinder, Account account, boolean z10, int i10) throws RemoteException;

    void x5(String str, String str2) throws RemoteException;
}
