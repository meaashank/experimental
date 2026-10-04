package com.prism.gaia.client.stub;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.s;
import com.prism.gaia.naked.compat.android.app.IServiceConnectionCompat2;
import com.prism.gaia.naked.compat.android.app.LoadedApkCompat2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class D extends s.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f164300f = "asdf-".concat(D.class.getSimpleName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<IBinder, D> f164301g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<IBinder, D> f164302h = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceConnection f164303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IInterface f164304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServiceConnection f164305d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IInterface f164306e;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = D.f164300f;
            IInterface iInterface = D.this.f164304c;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            String unused = D.f164300f;
            IInterface iInterface = D.this.f164304c;
        }
    }

    public D(IInterface iInterface) {
        this.f164303b = LoadedApkCompat2.Util.getConnFromDispatcher(iInterface);
        this.f164304c = iInterface;
        IInterface iInterfaceP = GaiaContext.j().P(this.f164305d);
        this.f164306e = iInterfaceP;
        f164301g.put(iInterfaceP.asBinder(), this);
    }

    public static synchronized D U5(IBinder iBinder) {
        D dRemove;
        dRemove = f164302h.remove(iBinder);
        if (dRemove != null) {
            dRemove.T5();
        }
        return dRemove;
    }

    public static synchronized D V5(IInterface iInterface) {
        return U5(iInterface.asBinder());
    }

    public static synchronized D Y5(IInterface iInterface) {
        IBinder iBinderAsBinder = iInterface.asBinder();
        D d10 = f164301g.get(iBinderAsBinder);
        if (d10 != null) {
            return d10;
        }
        Map<IBinder, D> map = f164302h;
        D d11 = map.get(iBinderAsBinder);
        if (d11 != null) {
            return d11;
        }
        D d12 = new D(iInterface);
        map.put(iBinderAsBinder, d12);
        return d12;
    }

    public static synchronized D Z5(IBinder iBinder) {
        D d10;
        d10 = f164301g.get(iBinder);
        if (d10 == null) {
            d10 = f164302h.get(iBinder);
        }
        return d10;
    }

    public final void T5() {
        f164301g.remove(this.f164306e.asBinder());
        GaiaContext.j().i(this.f164305d);
    }

    public ServiceConnection W5() {
        return this.f164305d;
    }

    public IInterface X5() {
        return this.f164306e;
    }

    @Override // com.prism.gaia.client.stub.s
    public void y3(ComponentName componentName, IBinder iBinder, boolean z10) {
        IServiceConnectionCompat2.Util.connected(this.f164304c, componentName, iBinder, z10);
    }
}
