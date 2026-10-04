package com.prism.gaia.client.stub;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface q extends IInterface {

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final String f164495c3 = "com.prism.gaia.client.stub.IContentObserverProxy";

    public static class a implements q {
        @Override // com.prism.gaia.client.stub.q
        public void E2(boolean z10, Uri uri, int i10) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f164496a = 1;

        public static class a implements q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f164497a;

            public a(IBinder iBinder) {
                this.f164497a = iBinder;
            }

            @Override // com.prism.gaia.client.stub.q
            public void E2(boolean z10, Uri uri, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(q.f164495c3);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i10);
                    this.f164497a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return q.f164495c3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f164497a;
            }
        }

        public b() {
            attachInterface(this, q.f164495c3);
        }

        public static q U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(q.f164495c3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q)) ? new a(iBinder) : (q) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(q.f164495c3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(q.f164495c3);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            E2(parcel.readInt() != 0, (Uri) c.c(parcel, Uri.CREATOR), parcel.readInt());
            return true;
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

    void E2(boolean z10, Uri uri, int i10) throws RemoteException;
}
