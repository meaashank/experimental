package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.room.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface InterfaceC2688z extends IInterface {

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public static final String f117325W2 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.z$a */
    public static class a implements InterfaceC2688z {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.InterfaceC2688z
        public void v(String[] strArr) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: androidx.room.z$b */
    public static abstract class b extends Binder implements InterfaceC2688z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f117326a = 1;

        /* JADX INFO: renamed from: androidx.room.z$b$a */
        public static class a implements InterfaceC2688z {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f117327a;

            public a(IBinder iBinder) {
                this.f117327a = iBinder;
            }

            public String U0() {
                return InterfaceC2688z.f117325W2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f117327a;
            }

            @Override // androidx.room.InterfaceC2688z
            public void v(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2688z.f117325W2);
                    parcelObtain.writeStringArray(strArr);
                    this.f117327a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC2688z.f117325W2);
        }

        public static InterfaceC2688z U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2688z.f117325W2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2688z)) ? new a(iBinder) : (InterfaceC2688z) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC2688z.f117325W2;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            v(parcel.createStringArray());
            return true;
        }
    }

    void v(String[] strArr) throws RemoteException;
}
