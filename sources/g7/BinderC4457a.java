package g7;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: g7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class BinderC4457a extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f202275b = "asdf-".concat(BinderC4457a.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f202276c = "android.adservices.adid.IGetAdIdCallback";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f202277d = "android.adservices.adid.GetAdIdResult";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f202278e = "mAdId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f202279f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f202280g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f202281a;

    public BinderC4457a(IBinder iBinder) {
        this.f202281a = iBinder;
        attachInterface(null, "android.adservices.adid.IGetAdIdCallback");
    }

    public static Parcelable c(Parcel parcel) {
        try {
            return (Parcelable) ((Parcelable.Creator) Class.forName(f202277d).getField("CREATOR").get(null)).createFromParcel(parcel);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Parcelable parcelable) {
        try {
            Field declaredField = parcelable.getClass().getDeclaredField(f202278e);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(parcelable);
            if (obj instanceof String) {
                String strA = C4458b.a((String) obj);
                if (strA.equals(obj)) {
                    return;
                }
                declaredField.set(parcelable, strA);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.adservices.adid.IGetAdIdCallback");
            parcelObtain.writeInt(i10);
            this.f202281a.transact(2, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable unused) {
            parcelObtain.recycle();
        }
    }

    public final void b(Parcel parcel) {
        Parcelable parcelableC = parcel.readInt() != 0 ? c(parcel) : null;
        if (parcelableC != null) {
            d(parcelableC);
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.adservices.adid.IGetAdIdCallback");
            if (parcelableC == null) {
                parcelObtain.writeInt(0);
            } else {
                parcelObtain.writeInt(1);
                parcelableC.writeToParcel(parcelObtain, 0);
            }
            this.f202281a.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable unused) {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        return "android.adservices.adid.IGetAdIdCallback";
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.enforceInterface("android.adservices.adid.IGetAdIdCallback");
            b(parcel);
            return true;
        }
        if (i10 == 2) {
            parcel.enforceInterface("android.adservices.adid.IGetAdIdCallback");
            a(parcel.readInt());
            return true;
        }
        if (i10 != 1598968902) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 != null) {
            parcel2.writeString("android.adservices.adid.IGetAdIdCallback");
        }
        return true;
    }
}
