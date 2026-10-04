package com.prism.gaia.client.stub;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.app.IServiceConnectionCompat2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164488d = "asdf-".concat(p.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<IBinder, p> f164489e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<IBinder, p> f164490f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IInterface f164491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceConnection f164492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IInterface f164493c;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            p.this.b(componentName, null, true);
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            p.this.b(componentName, null, false);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.this.b(componentName, g7.d.d(iBinder), false);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.this.b(componentName, null, false);
        }
    }

    public p(IInterface iInterface) {
        this.f164491a = iInterface;
        a aVar = new a();
        this.f164492b = aVar;
        this.f164493c = GaiaContext.j().P(aVar);
    }

    public static synchronized IInterface c(IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        try {
            IBinder iBinderAsBinder = iInterface.asBinder();
            Map<IBinder, p> map = f164489e;
            p pVarRemove = map.remove(iBinderAsBinder);
            if (pVarRemove == null) {
                pVarRemove = f164490f.get(iBinderAsBinder);
                if (pVarRemove == null) {
                    return null;
                }
                map.remove(pVarRemove.f164491a.asBinder());
            }
            f164490f.remove(pVarRemove.f164493c.asBinder());
            try {
                GaiaContext.j().i(pVarRemove.f164492b);
            } catch (Throwable unused) {
            }
            return pVarRemove.f164493c;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized IInterface d(IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        IBinder iBinderAsBinder = iInterface.asBinder();
        Map<IBinder, p> map = f164490f;
        p pVar = map.get(iBinderAsBinder);
        if (pVar != null) {
            return pVar.f164493c;
        }
        Map<IBinder, p> map2 = f164489e;
        p pVar2 = map2.get(iBinderAsBinder);
        if (pVar2 != null) {
            return pVar2.f164493c;
        }
        try {
            p pVar3 = new p(iInterface);
            map2.put(iBinderAsBinder, pVar3);
            map.put(pVar3.f164493c.asBinder(), pVar3);
            return pVar3.f164493c;
        } catch (Throwable unused) {
            return iInterface;
        }
    }

    public static boolean e(String str) {
        return g7.d.b(str);
    }

    public final void b(ComponentName componentName, IBinder iBinder, boolean z10) {
        try {
            IServiceConnectionCompat2.Util.connected(this.f164491a, componentName, iBinder, z10);
        } catch (Throwable unused) {
        }
    }
}
