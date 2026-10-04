package com.prism.gaia.naked.metadata.android.app;

import android.content.ComponentName;
import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class IServiceConnectionCAGI {

    @W6.m
    @W6.j("android.app.IServiceConnection")
    public interface C36 extends ClassAccessor {
        @W6.p("connected")
        @W6.g({"android.content.ComponentName", "android.os.IBinder", "android.app.IBinderSession", x.b.f238265f})
        NakedMethod<Void> connected();
    }

    @W6.l
    @W6.j("android.app.IServiceConnection")
    public interface O26 extends ClassAccessor {
        @W6.p("connected")
        @W6.f({ComponentName.class, IBinder.class, boolean.class})
        NakedMethod<Void> connected();
    }

    @W6.l
    @W6.j("android.app.IServiceConnection")
    public interface _N25 extends ClassAccessor {
        @W6.p("connected")
        @W6.f({ComponentName.class, IBinder.class})
        NakedMethod<Void> connected();
    }
}
