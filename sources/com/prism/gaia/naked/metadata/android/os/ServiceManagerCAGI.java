package com.prism.gaia.naked.metadata.android.os;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ServiceManagerCAGI {

    @W6.l
    @W6.j("android.os.ServiceManager")
    public interface G extends ClassAccessor {
        @W6.f({String.class, IBinder.class})
        @W6.s("addService")
        NakedStaticMethod<Void> addService();

        @W6.s("checkService")
        NakedStaticMethod<IBinder> checkService();

        @W6.s("getIServiceManager")
        NakedStaticMethod<IInterface> getIServiceManager();

        @W6.s("getService")
        NakedStaticMethod<IBinder> getService();

        @W6.s("listServices")
        NakedStaticMethod<String[]> listServices();

        @W6.q("sCache")
        NakedStaticObject<Map<String, IBinder>> sCache();

        @W6.q("sServiceManager")
        NakedStaticObject<IInterface> sServiceManager();
    }
}
