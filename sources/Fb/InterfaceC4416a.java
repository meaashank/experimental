package fb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.prism.lib.upgrade.entity.VersionInfo;

/* JADX INFO: renamed from: fb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4416a extends IInterface {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final String f200678w3 = "com.prism.lib.upgrade.client.IUpgradeHandler";

    /* JADX INFO: renamed from: fb.a$c */
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

    void Q0(VersionInfo versionInfo) throws RemoteException;

    /* JADX INFO: renamed from: fb.a$a, reason: collision with other inner class name */
    public static class C0733a implements InterfaceC4416a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // fb.InterfaceC4416a
        public void Q0(VersionInfo versionInfo) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: fb.a$b */
    public static abstract class b extends Binder implements InterfaceC4416a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f200679a = 1;

        /* JADX INFO: renamed from: fb.a$b$a, reason: collision with other inner class name */
        public static class C0734a implements InterfaceC4416a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f200680a;

            public C0734a(IBinder iBinder) {
                this.f200680a = iBinder;
            }

            @Override // fb.InterfaceC4416a
            public void Q0(VersionInfo versionInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC4416a.f200678w3);
                    c.d(parcelObtain, versionInfo, 0);
                    this.f200680a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return InterfaceC4416a.f200678w3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f200680a;
            }
        }

        public b() {
            attachInterface(this, InterfaceC4416a.f200678w3);
        }

        public static InterfaceC4416a U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4416a.f200678w3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4416a)) ? new C0734a(iBinder) : (InterfaceC4416a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(InterfaceC4416a.f200678w3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(InterfaceC4416a.f200678w3);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            Q0((VersionInfo) c.c(parcel, VersionInfo.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
