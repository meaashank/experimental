package com.prism.gaia.client.stub;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface s extends IInterface {

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final String f164501e3 = "com.prism.gaia.client.stub.IServiceConnectionProxy";

    public static class a implements s {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.prism.gaia.client.stub.s
        public void y3(ComponentName componentName, IBinder iBinder, boolean z10) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f164502a = 1;

        public static class a implements s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f164503a;

            public a(IBinder iBinder) {
                this.f164503a = iBinder;
            }

            public String U0() {
                return s.f164501e3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f164503a;
            }

            @Override // com.prism.gaia.client.stub.s
            public void y3(ComponentName componentName, IBinder iBinder, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(s.f164501e3);
                    c.d(parcelObtain, componentName, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f164503a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s.f164501e3);
        }

        public static s U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(s.f164501e3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s)) ? new a(iBinder) : (s) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(s.f164501e3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(s.f164501e3);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            y3((ComponentName) c.c(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt() != 0);
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

    void y3(ComponentName componentName, IBinder iBinder, boolean z10) throws RemoteException;
}
