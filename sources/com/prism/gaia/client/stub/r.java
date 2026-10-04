package com.prism.gaia.client.stub;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface r extends IInterface {

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f164498d3 = "com.prism.gaia.client.stub.IIntentReceiverProxy";

    public static class a implements r {
        @Override // com.prism.gaia.client.stub.r
        public void L4(Intent intent, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f164499a = 1;

        public static class a implements r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f164500a;

            public a(IBinder iBinder) {
                this.f164500a = iBinder;
            }

            @Override // com.prism.gaia.client.stub.r
            public void L4(Intent intent, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(r.f164498d3);
                    c.d(parcelObtain, intent, 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f164500a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return r.f164498d3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f164500a;
            }
        }

        public b() {
            attachInterface(this, r.f164498d3);
        }

        public static r U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(r.f164498d3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r)) ? new a(iBinder) : (r) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(r.f164498d3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(r.f164498d3);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            L4((Intent) c.c(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
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

    void L4(Intent intent, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException;
}
