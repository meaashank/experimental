package com.prism.gaia.naked.metadata.android.app;

import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class ActivityClientCAGI {

    @W6.m
    @W6.j("android.app.ActivityClient")
    public interface C extends ClassAccessor {
        @W6.q("INTERFACE_SINGLETON")
        NakedStaticObject<Object> INTERFACE_SINGLETON();

        @W6.s("getActivityClientController")
        NakedStaticMethod<IInterface> getActivityClientController();

        @W6.g({"android.app.IActivityClientController"})
        @W6.s("setActivityClientController")
        NakedStaticMethod<IInterface> setActivityClientController();
    }
}
