package j7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.compat.android.app.ActivityClientCompat2;
import com.prism.gaia.naked.compat.android.util.SingletonCompat2;

/* JADX INFO: renamed from: j7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4791a extends E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f214194h = "asdf-".concat(C4791a.class.getSimpleName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f214195i = "FAKE_SERVICE_NAME_activity_client_controller";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4792b f214196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IInterface f214197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f214198g;

    private IInterface v() {
        return ActivityClientCompat2.Util.getActivityClientController();
    }

    private IInterface w() {
        IInterface iInterface = this.f214197f;
        if (iInterface != null) {
            return iInterface;
        }
        synchronized (this) {
            try {
                IInterface iInterface2 = this.f214197f;
                if (iInterface2 != null) {
                    return iInterface2;
                }
                IInterface iInterfaceV = v();
                this.f214197f = iInterfaceV;
                return iInterfaceV;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private C2953e<IInterface> x() {
        C4792b c4792b = this.f214196e;
        if (c4792b != null) {
            return c4792b;
        }
        synchronized (this) {
            try {
                C4792b c4792b2 = this.f214196e;
                if (c4792b2 != null) {
                    return c4792b2;
                }
                IInterface iInterfaceW = w();
                if (iInterfaceW == null) {
                    this.f214196e = null;
                } else {
                    this.f214196e = new C4792b(iInterfaceW);
                }
                return this.f214196e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    @Override // c7.E, u8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r4 = r3.f214198g     // Catch: java.lang.Throwable -> L8
            r0 = 0
            if (r4 == 0) goto La
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r4 = move-exception
            goto L3c
        La:
            r4 = 1
            r3.f214198g = r4     // Catch: java.lang.Throwable -> L8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            android.os.IInterface r1 = r3.v()     // Catch: java.lang.Throwable -> L34
            j7.b r2 = r3.f214196e     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L2b
            if (r1 == 0) goto L2b
            android.os.IBinder r1 = r1.asBinder()     // Catch: java.lang.Throwable -> L34
            j7.b r2 = r3.f214196e     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.n()     // Catch: java.lang.Throwable -> L34
            android.os.IInterface r2 = (android.os.IInterface) r2     // Catch: java.lang.Throwable -> L34
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.Throwable -> L34
            if (r1 == r2) goto L2b
            goto L2c
        L2b:
            r4 = r0
        L2c:
            monitor-enter(r3)
            r3.f214198g = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            return r4
        L31:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r4
        L34:
            monitor-enter(r3)
            r3.f214198g = r0     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            return r0
        L39:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r4
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.C4791a.a(java.lang.String):boolean");
    }

    @Override // c7.E
    public boolean f(IInterface iInterface, IBinder iBinder) {
        Object activityClientControllerSingleton;
        if (this.f214196e == null || (activityClientControllerSingleton = ActivityClientCompat2.Util.getActivityClientControllerSingleton()) == null) {
            return false;
        }
        SingletonCompat2.Util.set(activityClientControllerSingleton, this.f214196e.n());
        ActivityClientCompat2.Util.setActivityClientController(this.f214196e.n());
        return true;
    }

    @Override // c7.E
    @Nullable
    public IBinder g() {
        IInterface iInterfaceW = w();
        if (iInterfaceW == null) {
            return null;
        }
        return iInterfaceW.asBinder();
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        return w();
    }

    @Override // c7.E
    public String l() {
        return f214195i;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        return x();
    }

    public IInterface u() {
        return this.f214197f;
    }
}
