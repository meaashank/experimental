package s8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: s8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5582b implements IBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClassLoader f238600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f238601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IInterface f238602c;

    public AbstractC5582b(ClassLoader classLoader, IBinder iBinder) {
        this.f238600a = classLoader;
        this.f238601b = iBinder;
    }

    public abstract InvocationHandler a(Class<?> cls, IInterface iInterface);

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f238601b.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f238601b.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() throws RemoteException {
        return this.f238601b.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.f238601b.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i10) throws RemoteException {
        this.f238601b.linkToDeath(deathRecipient, i10);
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.f238601b.pingBinder();
    }

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        if (this.f238602c == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null && stackTrace.length > 1) {
                Class<?> cls = null;
                IInterface iInterface = null;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!stackTraceElement.isNativeMethod()) {
                        try {
                            Method declaredMethod = this.f238600a.loadClass(stackTraceElement.getClassName()).getDeclaredMethod(stackTraceElement.getMethodName(), IBinder.class);
                            if ((declaredMethod.getModifiers() & 8) != 0) {
                                declaredMethod.setAccessible(true);
                                Class<?> returnType = declaredMethod.getReturnType();
                                if (returnType.isInterface() && IInterface.class.isAssignableFrom(returnType)) {
                                    try {
                                        iInterface = (IInterface) declaredMethod.invoke(null, this.f238601b);
                                    } catch (Exception unused) {
                                    }
                                    cls = returnType;
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
                if (cls != null && iInterface != null) {
                    this.f238602c = (IInterface) Proxy.newProxyInstance(this.f238600a, new Class[]{cls}, a(cls, iInterface));
                }
            }
            return null;
        }
        return this.f238602c;
    }

    @Override // android.os.IBinder
    public boolean transact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return this.f238601b.transact(i10, parcel, parcel2, i11);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i10) {
        return this.f238601b.unlinkToDeath(deathRecipient, i10);
    }
}
