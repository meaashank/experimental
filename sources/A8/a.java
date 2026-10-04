package A8;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class a extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7262b = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Binder f7263a;

    public a(Binder binder) {
        this.f7263a = binder;
    }

    public long a() {
        return (((long) c()) << 32) | ((long) b());
    }

    @Override // android.os.Binder
    public final void attachInterface(IInterface iInterface, String str) {
        this.f7263a.attachInterface(iInterface, str);
    }

    public int b() {
        return Process.myPid();
    }

    public int c() {
        return Process.myUid();
    }

    @Override // android.os.Binder, android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.f7263a.getInterfaceDescriptor();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Binder.restoreCallingIdentity(a());
            return this.f7263a.transact(i10, parcel, parcel2, i11);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return this.f7263a.queryLocalInterface(str);
    }
}
