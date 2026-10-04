package p6;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.prism.commons.ipc.MainProcessGServiceProvider;
import com.prism.commons.utils.C3839c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f226360d = "f";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f226361e = "00000000000000";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f226362f = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.prism.commons.ipc.a f226363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f226364b = "00000000000000";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b> f226365c = new HashSet();

    public class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBinder f226366a;

        public a(IBinder iBinder) {
            this.f226366a = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            Log.d(f.f226360d, "mainProcess binder dead: " + this.f226366a);
            try {
                this.f226366a.unlinkToDeath(this, 0);
            } finally {
                f.this.h();
            }
        }
    }

    public interface b {
        void a();
    }

    public static f d() {
        return f226362f;
    }

    public final boolean b(Context context) {
        synchronized (this) {
            try {
                if (this.f226363a != null) {
                    return true;
                }
                return c(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(Context context) {
        this.f226363a = MainProcessGServiceProvider.c(context);
        if (this.f226363a == null) {
            return false;
        }
        return g();
    }

    @Nullable
    public IBinder e(Context context, String str) {
        if (!b(context)) {
            return null;
        }
        try {
            return C3839c.a(this.f226363a.C5(str));
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void f() {
        IBinder iBinderAsBinder = this.f226363a.asBinder();
        try {
            iBinderAsBinder.linkToDeath(new a(iBinderAsBinder), 0);
            Log.d(f226360d, "linkMainProcessBinderDiedLocked: " + iBinderAsBinder);
        } catch (Throwable unused) {
            Log.w(f226360d, "mainProcess binder already dead before linkToDeath: " + iBinderAsBinder);
            h();
        }
    }

    public final boolean g() {
        try {
            String strV4 = this.f226363a.V4();
            if (this.f226364b.equals("00000000000000") || !this.f226364b.equals(strV4)) {
                this.f226364b = strV4;
                f();
            }
            return true;
        } catch (RemoteException e10) {
            Log.w(f226360d, "connectMainProcessLocked failed: " + e10.getMessage(), e10);
            this.f226363a = null;
            return false;
        }
    }

    public void h() {
        Log.d(f226360d, "onMainProcessDead()");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(0);
        synchronized (this) {
            try {
                if (this.f226363a != null) {
                    this.f226363a = null;
                    arrayList = new ArrayList(this.f226365c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                ((b) obj).a();
            } catch (Throwable th2) {
                Log.e(f226360d, "onMainProcessDead exception: " + th2.getMessage(), th2);
            }
        }
    }

    public void i(b bVar) {
        synchronized (this) {
            this.f226365c.add(bVar);
        }
    }

    public void j(b bVar) {
        synchronized (this) {
            this.f226365c.remove(bVar);
        }
    }
}
