package A0;

import A0.a;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface b extends IInterface {

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f18r2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    void B1(A0.a aVar) throws RemoteException;

    /* JADX INFO: renamed from: A0.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0002b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f19a = 1;

        /* JADX INFO: renamed from: A0.b$b$a */
        public static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20a;

            public a(IBinder iBinder) {
                this.f20a = iBinder;
            }

            @Override // A0.b
            public void B1(A0.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f18r2);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f20a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return b.f18r2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20a;
            }
        }

        public AbstractBinderC0002b() {
            attachInterface(this, b.f18r2);
        }

        public static b U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f18r2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.f18r2;
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
            B1(a.b.U0(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // A0.b
        public void B1(A0.a aVar) throws RemoteException {
        }
    }
}
