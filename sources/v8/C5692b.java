package v8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: v8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5692b implements IBinder {
    @Nullable
    public IBinder getExtension() throws RemoteException {
        return null;
    }

    @Override // android.os.IBinder
    @Nullable
    public String getInterfaceDescriptor() throws RemoteException {
        return "";
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return true;
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return true;
    }

    @Override // android.os.IBinder
    @Nullable
    public IInterface queryLocalInterface(@NonNull String str) {
        return null;
    }

    @Override // android.os.IBinder
    public boolean transact(int i10, @NonNull Parcel parcel, @Nullable Parcel parcel2, int i11) throws RemoteException {
        return true;
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(@NonNull IBinder.DeathRecipient deathRecipient, int i10) {
        return true;
    }

    @Override // android.os.IBinder
    public void dump(@NonNull FileDescriptor fileDescriptor, @Nullable String[] strArr) throws RemoteException {
    }

    @Override // android.os.IBinder
    public void dumpAsync(@NonNull FileDescriptor fileDescriptor, @Nullable String[] strArr) throws RemoteException {
    }

    @Override // android.os.IBinder
    public void linkToDeath(@NonNull IBinder.DeathRecipient deathRecipient, int i10) throws RemoteException {
    }
}
