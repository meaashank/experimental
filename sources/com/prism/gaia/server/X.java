package com.prism.gaia.server;

import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.os.ParceledListSliceG;

/* JADX INFO: loaded from: classes6.dex */
public interface X extends IInterface {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final String f166337p3 = "com.prism.gaia.server.IJobScheduler";

    public static class a implements X {
        @Override // com.prism.gaia.server.X
        public ParceledListSliceG K1(String str, int i10) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.X
        public JobInfo Y1(int i10, String str, int i11) throws RemoteException {
            return null;
        }

        @Override // com.prism.gaia.server.X
        public void Y4(int i10, String str, int i11) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.server.X
        public int f1(JobInfo jobInfo, String str, int i10) throws RemoteException {
            return 0;
        }

        @Override // com.prism.gaia.server.X
        public void g4(String str, int i10) throws RemoteException {
        }

        @Override // com.prism.gaia.server.X
        public int t3(JobInfo jobInfo, JobWorkItem jobWorkItem, String str, int i10) throws RemoteException {
            return 0;
        }
    }

    public static abstract class b extends Binder implements X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f166338a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f166339b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166340c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f166341d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f166342e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f166343f = 6;

        public static class a implements X {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f166344a;

            public a(IBinder iBinder) {
                this.f166344a = iBinder;
            }

            @Override // com.prism.gaia.server.X
            public ParceledListSliceG K1(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(X.f166337p3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166344a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParceledListSliceG) c.c(parcelObtain2, ParceledListSliceG.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return X.f166337p3;
            }

            @Override // com.prism.gaia.server.X
            public JobInfo Y1(int i10, String str, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(X.f166337p3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    this.f166344a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (JobInfo) c.c(parcelObtain2, JobInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.X
            public void Y4(int i10, String str, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(X.f166337p3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    this.f166344a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f166344a;
            }

            @Override // com.prism.gaia.server.X
            public int f1(JobInfo jobInfo, String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(X.f166337p3);
                    c.d(parcelObtain, jobInfo, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166344a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.X
            public void g4(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(X.f166337p3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166344a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.prism.gaia.server.X
            public int t3(JobInfo jobInfo, JobWorkItem jobWorkItem, String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(X.f166337p3);
                    c.d(parcelObtain, jobInfo, 0);
                    c.d(parcelObtain, jobWorkItem, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f166344a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, X.f166337p3);
        }

        public static X U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(X.f166337p3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof X)) ? new a(iBinder) : (X) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(X.f166337p3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(X.f166337p3);
                return true;
            }
            switch (i10) {
                case 1:
                    int iT3 = t3((JobInfo) c.c(parcel, JobInfo.CREATOR), K7.b.a(c.c(parcel, JobWorkItem.CREATOR)), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iT3);
                    return true;
                case 2:
                    int iF1 = f1((JobInfo) c.c(parcel, JobInfo.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iF1);
                    return true;
                case 3:
                    Y4(parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    g4(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    JobInfo jobInfoY1 = Y1(parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, jobInfoY1, 1);
                    return true;
                case 6:
                    ParceledListSliceG parceledListSliceGK1 = K1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    c.d(parcel2, parceledListSliceGK1, 1);
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

    ParceledListSliceG K1(String str, int i10) throws RemoteException;

    JobInfo Y1(int i10, String str, int i11) throws RemoteException;

    void Y4(int i10, String str, int i11) throws RemoteException;

    int f1(JobInfo jobInfo, String str, int i10) throws RemoteException;

    void g4(String str, int i10) throws RemoteException;

    int t3(JobInfo jobInfo, JobWorkItem jobWorkItem, String str, int i10) throws RemoteException;
}
