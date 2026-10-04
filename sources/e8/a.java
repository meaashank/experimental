package E8;

import U6.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends Binder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f33325d = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f33326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IInterface f33328c;

    public a(@NonNull IBinder iBinder, @Nullable IInterface iInterface) {
        this.f33326a = iBinder;
        try {
            this.f33327b = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
        }
        this.f33328c = iInterface;
        attachInterface(iInterface, this.f33327b);
    }

    public void a(Parcel parcel) {
        parcel.enforceInterface(this.f33327b);
    }

    public abstract boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException;

    public void c(Parcel parcel) {
        parcel.writeNoException();
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        try {
            this.f33326a.dump(fileDescriptor, strArr);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        try {
            this.f33326a.dumpAsync(fileDescriptor, strArr);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.f33327b;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean isBinderAlive() {
        return this.f33326a.isBinderAlive();
    }

    @Override // android.os.Binder, android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i10) {
        try {
            this.f33326a.linkToDeath(deathRecipient, i10);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1598968902) {
            parcel2.writeString(this.f33327b);
            return true;
        }
        if (b(i10, parcel, parcel2, i11)) {
            return true;
        }
        j.M(i11);
        return super.onTransact(i10, parcel, parcel2, i11);
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean pingBinder() {
        return this.f33326a.pingBinder();
    }

    @Override // android.os.Binder, android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        return this.f33328c;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i10) {
        return this.f33326a.unlinkToDeath(deathRecipient, i10);
    }

    public a(@NonNull String str, @Nullable IInterface iInterface) {
        this.f33326a = this;
        this.f33327b = str;
        this.f33328c = iInterface;
        attachInterface(iInterface, str);
    }
}
