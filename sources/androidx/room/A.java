package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC2688z;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface A extends IInterface {

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public static final String f116947X2 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static class a implements A {
        @Override // androidx.room.A
        public void O5(InterfaceC2688z interfaceC2688z, int i10) throws RemoteException {
        }

        @Override // androidx.room.A
        public void T3(int i10, String[] strArr) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.A
        public int w4(InterfaceC2688z interfaceC2688z, String str) throws RemoteException {
            return 0;
        }
    }

    public static abstract class b extends Binder implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f116948a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f116949b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f116950c = 3;

        public static class a implements A {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f116951a;

            public a(IBinder iBinder) {
                this.f116951a = iBinder;
            }

            @Override // androidx.room.A
            public void O5(InterfaceC2688z interfaceC2688z, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(A.f116947X2);
                    parcelObtain.writeStrongInterface(interfaceC2688z);
                    parcelObtain.writeInt(i10);
                    this.f116951a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.A
            public void T3(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(A.f116947X2);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f116951a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return A.f116947X2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f116951a;
            }

            @Override // androidx.room.A
            public int w4(InterfaceC2688z interfaceC2688z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(A.f116947X2);
                    parcelObtain.writeStrongInterface(interfaceC2688z);
                    parcelObtain.writeString(str);
                    this.f116951a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, A.f116947X2);
        }

        public static A U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(A.f116947X2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof A)) ? new a(iBinder) : (A) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = A.f116947X2;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iW4 = w4(InterfaceC2688z.b.U0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iW4);
            } else if (i10 == 2) {
                O5(InterfaceC2688z.b.U0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                T3(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void O5(InterfaceC2688z interfaceC2688z, int i10) throws RemoteException;

    void T3(int i10, String[] strArr) throws RemoteException;

    int w4(InterfaceC2688z interfaceC2688z, String str) throws RemoteException;
}
