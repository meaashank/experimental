package A0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface a extends IInterface {

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f15q2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    void C3(boolean z10, boolean z11) throws RemoteException;

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f16a = 1;

        /* JADX INFO: renamed from: A0.a$b$a, reason: collision with other inner class name */
        public static class C0001a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f17a;

            public C0001a(IBinder iBinder) {
                this.f17a = iBinder;
            }

            @Override // A0.a
            public void C3(boolean z10, boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f15q2);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f17a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return a.f15q2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17a;
            }
        }

        public b() {
            attachInterface(this, a.f15q2);
        }

        public static a U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f15q2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.f15q2;
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
            C3(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: A0.a$a, reason: collision with other inner class name */
    public static class C0000a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // A0.a
        public void C3(boolean z10, boolean z11) throws RemoteException {
        }
    }
}
