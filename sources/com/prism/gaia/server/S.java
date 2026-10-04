package com.prism.gaia.server;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncAdapterType;
import android.content.SyncRequest;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.client.stub.q;
import com.prism.gaia.server.content.SyncStatusInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface S extends IInterface {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final String f166270k3 = "com.prism.gaia.server.IContentService";

    public static class a implements S {
        @Override // com.prism.gaia.server.S
        public boolean C(Account account, String str, ComponentName componentName, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public int E5(Account account, String str) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.S
        public void F0(int i10, ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void F1(Uri uri, com.prism.gaia.client.stub.q qVar, boolean z10, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public SyncAdapterType[] F2(int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.S
        public void G1(Account account, String str, Bundle bundle, long j10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void I(SyncRequest syncRequest) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public boolean J2() throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public boolean N1(Account account, String str, ComponentName componentName) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public List<PeriodicSync> Q1(Account account, String str, ComponentName componentName) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.S
        public SyncAdapterType[] R0() throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.S
        public void R4(com.prism.gaia.client.stub.q qVar) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void U1(Uri uri, boolean z10, com.prism.gaia.client.stub.q qVar, int i10, int i11) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public boolean X0(int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public SyncStatusInfo X3(Account account, String str, ComponentName componentName, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.S
        public void X4(SyncRequest syncRequest, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void Y0(Account account, String str, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void a1(Account account, String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.S
        public void c3(Account account, String str, boolean z10, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public boolean c4(Account account, String str) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public void f4(Account account, String str, boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void i(boolean z10, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public boolean j2(Account account, String str, ComponentName componentName) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public void l4(ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void p4(boolean z10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void s3(Account account, String str, ComponentName componentName, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public boolean t1(Account account, String str, int i10) throws RemoteException {
            return false;
        }

        @Override // com.prism.gaia.server.S
        public void u1(Account account, String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public void w0(Account account, String str, ComponentName componentName) throws RemoteException {
        }

        @Override // com.prism.gaia.server.S
        public int w3(Account account, String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.S
        public SyncStatusInfo x3(Account account, String str, ComponentName componentName) throws RemoteException {
            return null;
        }
    }

    public static abstract class b extends Binder implements S {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f166271A = 27;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f166272B = 28;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int f166273C = 29;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int f166274D = 30;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int f166275E = 31;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166276a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166277b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166278c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166279d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166280e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166281f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f166282g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f166283h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f166284i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f166285j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f166286k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f166287l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f166288m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f166289n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f166290o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f166291p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f166292q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f166293r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f166294s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f166295t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f166296u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f166297v = 22;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f166298w = 23;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f166299x = 24;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f166300y = 25;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f166301z = 26;

        public static class a implements S {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166302a;

            public a(IBinder iBinder) {
                this.f166302a = iBinder;
            }

            @Override // com.prism.gaia.server.S
            public boolean C(Account account, String str, ComponentName componentName, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public int E5(Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166302a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void F0(int i10, ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongInterface(iSyncStatusObserver);
                    this.f166302a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void F1(Uri uri, com.prism.gaia.client.stub.q qVar, boolean z10, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, uri, 0);
                    parcelObtain.writeStrongInterface(qVar);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f166302a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public SyncAdapterType[] F2(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SyncAdapterType[]) parcelObtain2.createTypedArray(SyncAdapterType.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void G1(Account account, String str, Bundle bundle, long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j10);
                    this.f166302a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void I(SyncRequest syncRequest) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, syncRequest, 0);
                    this.f166302a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public boolean J2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    this.f166302a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public boolean N1(Account account, String str, ComponentName componentName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    this.f166302a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public List<PeriodicSync> Q1(Account account, String str, ComponentName componentName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    this.f166302a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PeriodicSync.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public SyncAdapterType[] R0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    this.f166302a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SyncAdapterType[]) parcelObtain2.createTypedArray(SyncAdapterType.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void R4(com.prism.gaia.client.stub.q qVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeStrongInterface(qVar);
                    this.f166302a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return S.f166270k3;
            }

            @Override // com.prism.gaia.server.S
            public void U1(Uri uri, boolean z10, com.prism.gaia.client.stub.q qVar, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeStrongInterface(qVar);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f166302a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public boolean X0(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public SyncStatusInfo X3(Account account, String str, ComponentName componentName, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SyncStatusInfo) c.d(parcelObtain2, SyncStatusInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void X4(SyncRequest syncRequest, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, syncRequest, 0);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void Y0(Account account, String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void a1(Account account, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    this.f166302a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166302a;
            }

            @Override // com.prism.gaia.server.S
            public void c3(Account account, String str, boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public boolean c4(Account account, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    this.f166302a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void f4(Account account, String str, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166302a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void i(boolean z10, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public boolean j2(Account account, String str, ComponentName componentName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    this.f166302a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void l4(ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeStrongInterface(iSyncStatusObserver);
                    this.f166302a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void p4(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f166302a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void s3(Account account, String str, ComponentName componentName, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public boolean t1(Account account, String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void u1(Account account, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    this.f166302a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public void w0(Account account, String str, ComponentName componentName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    this.f166302a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public int w3(Account account, String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166302a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.S
            public SyncStatusInfo x3(Account account, String str, ComponentName componentName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(S.f166270k3);
                    c.f(parcelObtain, account, 0);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, componentName, 0);
                    this.f166302a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SyncStatusInfo) c.d(parcelObtain2, SyncStatusInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, S.f166270k3);
        }

        public static S U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(S.f166270k3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof S)) ? new a(iBinder) : (S) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(S.f166270k3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(S.f166270k3);
                return true;
            }
            switch (i10) {
                case 1:
                    U1((Uri) c.d(parcel, Uri.CREATOR), parcel.readInt() != 0, q.b.U0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    R4(q.b.U0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    F1((Uri) c.d(parcel, Uri.CREATOR), q.b.U0(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    a1((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    I((SyncRequest) c.d(parcel, SyncRequest.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    X4((SyncRequest) c.d(parcel, SyncRequest.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    w0((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    s3((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    boolean zC4 = c4((Account) c.d(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zC4 ? 1 : 0);
                    return true;
                case 10:
                    boolean zT1 = t1((Account) c.d(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zT1 ? 1 : 0);
                    return true;
                case 11:
                    f4((Account) c.d(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    c3((Account) c.d(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    List<PeriodicSync> listQ1 = Q1((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    c.e(parcel2, listQ1, 1);
                    return true;
                case 14:
                    G1((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    u1((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    int iE5 = E5((Account) c.d(parcel, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iE5);
                    return true;
                case 17:
                    int iW3 = w3((Account) c.d(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iW3);
                    return true;
                case 18:
                    Y0((Account) c.d(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    p4(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    i(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zJ2 = J2();
                    parcel2.writeNoException();
                    parcel2.writeInt(zJ2 ? 1 : 0);
                    return true;
                case 22:
                    boolean zX0 = X0(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zX0 ? 1 : 0);
                    return true;
                case 23:
                    SyncAdapterType[] syncAdapterTypeArrR0 = R0();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(syncAdapterTypeArrR0, 1);
                    return true;
                case 24:
                    SyncAdapterType[] syncAdapterTypeArrF2 = F2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(syncAdapterTypeArrF2, 1);
                    return true;
                case 25:
                    boolean zJ22 = j2((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zJ22 ? 1 : 0);
                    return true;
                case 26:
                    boolean zN1 = N1((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zN1 ? 1 : 0);
                    return true;
                case 27:
                    boolean zC = C((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zC ? 1 : 0);
                    return true;
                case 28:
                    SyncStatusInfo syncStatusInfoX3 = x3((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    c.f(parcel2, syncStatusInfoX3, 1);
                    return true;
                case 29:
                    SyncStatusInfo syncStatusInfoX32 = X3((Account) c.d(parcel, Account.CREATOR), parcel.readString(), (ComponentName) c.d(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    c.f(parcel2, syncStatusInfoX32, 1);
                    return true;
                case 30:
                    F0(parcel.readInt(), ISyncStatusObserver.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    l4(ISyncStatusObserver.Stub.asInterface(parcel.readStrongBinder()));
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

    boolean C(Account account, String str, ComponentName componentName, int i10) throws RemoteException;

    int E5(Account account, String str) throws RemoteException;

    void F0(int i10, ISyncStatusObserver iSyncStatusObserver) throws RemoteException;

    void F1(Uri uri, com.prism.gaia.client.stub.q qVar, boolean z10, int i10, int i11, int i12) throws RemoteException;

    SyncAdapterType[] F2(int i10) throws RemoteException;

    void G1(Account account, String str, Bundle bundle, long j10) throws RemoteException;

    void I(SyncRequest syncRequest) throws RemoteException;

    boolean J2() throws RemoteException;

    boolean N1(Account account, String str, ComponentName componentName) throws RemoteException;

    List<PeriodicSync> Q1(Account account, String str, ComponentName componentName) throws RemoteException;

    SyncAdapterType[] R0() throws RemoteException;

    void R4(com.prism.gaia.client.stub.q qVar) throws RemoteException;

    void U1(Uri uri, boolean z10, com.prism.gaia.client.stub.q qVar, int i10, int i11) throws RemoteException;

    boolean X0(int i10) throws RemoteException;

    SyncStatusInfo X3(Account account, String str, ComponentName componentName, int i10) throws RemoteException;

    void X4(SyncRequest syncRequest, int i10) throws RemoteException;

    void Y0(Account account, String str, int i10) throws RemoteException;

    void a1(Account account, String str, Bundle bundle) throws RemoteException;

    void c3(Account account, String str, boolean z10, int i10) throws RemoteException;

    boolean c4(Account account, String str) throws RemoteException;

    void f4(Account account, String str, boolean z10) throws RemoteException;

    void i(boolean z10, int i10) throws RemoteException;

    boolean j2(Account account, String str, ComponentName componentName) throws RemoteException;

    void l4(ISyncStatusObserver iSyncStatusObserver) throws RemoteException;

    void p4(boolean z10) throws RemoteException;

    void s3(Account account, String str, ComponentName componentName, int i10) throws RemoteException;

    boolean t1(Account account, String str, int i10) throws RemoteException;

    void u1(Account account, String str, Bundle bundle) throws RemoteException;

    void w0(Account account, String str, ComponentName componentName) throws RemoteException;

    int w3(Account account, String str, int i10) throws RemoteException;

    SyncStatusInfo x3(Account account, String str, ComponentName componentName) throws RemoteException;
}
