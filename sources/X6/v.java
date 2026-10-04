package X6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.gaia.remote.BadgerInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface v extends IInterface {

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public static final String f78721G2 = "com.prism.gaia.client.IBadgerChangeListener";

    public static class c {
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, list.get(i11), i10);
            }
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

    void P3(List<BadgerInfo> list) throws RemoteException;

    public static abstract class b extends Binder implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f78722a = 1;

        public static class a implements v {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f78723a;

            public a(IBinder iBinder) {
                this.f78723a = iBinder;
            }

            @Override // X6.v
            public void P3(List<BadgerInfo> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(v.f78721G2);
                    c.c(parcelObtain, list, 0);
                    this.f78723a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return v.f78721G2;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f78723a;
            }
        }

        public b() {
            attachInterface(this, v.f78721G2);
        }

        public static v U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(v.f78721G2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof v)) ? new a(iBinder) : (v) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(v.f78721G2);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(v.f78721G2);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            P3(parcel.createTypedArrayList(BadgerInfo.CREATOR));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class a implements v {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // X6.v
        public void P3(List<BadgerInfo> list) throws RemoteException {
        }
    }
}
