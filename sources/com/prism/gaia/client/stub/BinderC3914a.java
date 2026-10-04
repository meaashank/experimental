package com.prism.gaia.client.stub;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.client.stub.q;
import com.prism.gaia.naked.compat.android.database.ContentObserverCompat2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.prism.gaia.client.stub.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class BinderC3914a extends q.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164423d = "asdf-".concat(BinderC3914a.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<IBinder, BinderC3914a> f164424e = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentObserver f164425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IInterface f164426c;

    public BinderC3914a(IInterface iInterface) {
        ContentObserver contentObserverFromInf = ContentObserverCompat2.Util.getContentObserverFromInf(iInterface);
        this.f164425b = contentObserverFromInf;
        this.f164426c = iInterface;
        if (contentObserverFromInf == null) {
            throw new GaiaRuntimeException("reflect get ContentObserver failed");
        }
    }

    public static synchronized BinderC3914a T5(IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        IBinder iBinderAsBinder = iInterface.asBinder();
        Map<IBinder, BinderC3914a> map = f164424e;
        BinderC3914a binderC3914a = map.get(iBinderAsBinder);
        if (binderC3914a != null) {
            return binderC3914a;
        }
        BinderC3914a binderC3914a2 = new BinderC3914a(iInterface);
        map.put(iBinderAsBinder, binderC3914a2);
        return binderC3914a2;
    }

    public static synchronized BinderC3914a h2(IInterface iInterface) {
        return f164424e.remove(iInterface.asBinder());
    }

    @Override // com.prism.gaia.client.stub.q
    public void E2(boolean z10, Uri uri, int i10) throws RemoteException {
        ContentObserverCompat2.Util.dispatchChange(this.f164425b, z10, uri, i10);
    }

    public final void v5() {
    }
}
