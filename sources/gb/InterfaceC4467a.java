package gb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import fb.InterfaceC4416a;

/* JADX INFO: renamed from: gb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4467a extends IInterface {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final String f202340x3 = "com.prism.lib.upgrade.service.IUpgradeManager";

    void G5() throws RemoteException;

    void J4(InterfaceC4416a interfaceC4416a, boolean z10, boolean z11) throws RemoteException;

    boolean isInitialized() throws RemoteException;

    /* JADX INFO: renamed from: gb.a$a, reason: collision with other inner class name */
    public static class C0739a implements InterfaceC4467a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // gb.InterfaceC4467a
        public boolean isInitialized() throws RemoteException {
            return false;
        }

        @Override // gb.InterfaceC4467a
        public void G5() throws RemoteException {
        }

        @Override // gb.InterfaceC4467a
        public void J4(InterfaceC4416a interfaceC4416a, boolean z10, boolean z11) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: gb.a$b */
    public static abstract class b extends Binder implements InterfaceC4467a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f202341a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f202342b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f202343c = 3;

        /* JADX INFO: renamed from: gb.a$b$a, reason: collision with other inner class name */
        public static class C0740a implements InterfaceC4467a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f202344a;

            public C0740a(IBinder iBinder) {
                this.f202344a = iBinder;
            }

            @Override // gb.InterfaceC4467a
            public void G5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC4467a.f202340x3);
                    this.f202344a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // gb.InterfaceC4467a
            public void J4(InterfaceC4416a interfaceC4416a, boolean z10, boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC4467a.f202340x3);
                    parcelObtain.writeStrongInterface(interfaceC4416a);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f202344a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String U0() {
                return InterfaceC4467a.f202340x3;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f202344a;
            }

            @Override // gb.InterfaceC4467a
            public boolean isInitialized() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC4467a.f202340x3);
                    this.f202344a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC4467a.f202340x3);
        }

        public static InterfaceC4467a U0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4467a.f202340x3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4467a)) ? new C0740a(iBinder) : (InterfaceC4467a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(InterfaceC4467a.f202340x3);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(InterfaceC4467a.f202340x3);
                return true;
            }
            if (i10 == 1) {
                boolean zIsInitialized = isInitialized();
                parcel2.writeNoException();
                parcel2.writeInt(zIsInitialized ? 1 : 0);
            } else if (i10 == 2) {
                J4(InterfaceC4416a.b.U0(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0);
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                G5();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
