package E8;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.prism.gaia.naked.metadata.android.os.IBinderCAG;
import java.io.FileDescriptor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class d implements IBinder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f33329c = "asdf-".concat(d.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f33330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IInterface f33331b;

    public d(IBinder iBinder, IInterface iInterface) {
        this.f33330a = iBinder;
        this.f33331b = iInterface;
    }

    @TargetApi(36)
    public void addFrozenStateChangeCallback(Executor executor, IBinder.FrozenStateChangeCallback frozenStateChangeCallback) throws RemoteException {
        this.f33330a.addFrozenStateChangeCallback(executor, frozenStateChangeCallback);
    }

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f33330a.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    @TargetApi(13)
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f33330a.dumpAsync(fileDescriptor, strArr);
    }

    public IBinder getExtension() throws RemoteException {
        if (Build.VERSION.SDK_INT < 30 || IBinderCAG.R30.getExtension() == null) {
            return null;
        }
        try {
            return IBinderCAG.R30.getExtension().callWithException(this.f33330a, new Object[0]);
        } catch (RemoteException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Throwable th) {
            throw new RemoteException(th.toString());
        }
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() throws RemoteException {
        return this.f33330a.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.f33330a.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i10) throws RemoteException {
        this.f33330a.linkToDeath(deathRecipient, i10);
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.f33330a.pingBinder();
    }

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        return this.f33331b;
    }

    @TargetApi(36)
    public boolean removeFrozenStateChangeCallback(IBinder.FrozenStateChangeCallback frozenStateChangeCallback) {
        return this.f33330a.removeFrozenStateChangeCallback(frozenStateChangeCallback);
    }

    @Override // android.os.IBinder
    public boolean transact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return this.f33330a.transact(i10, parcel, parcel2, i11);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i10) {
        return this.f33330a.unlinkToDeath(deathRecipient, i10);
    }
}
