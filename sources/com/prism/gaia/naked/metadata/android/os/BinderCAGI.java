package com.prism.gaia.naked.metadata.android.os;

import android.os.Binder;
import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class BinderCAGI {

    @W6.i(Binder.class)
    @W6.m
    public interface C extends ClassAccessor {
        @W6.f({IBinder.class})
        @W6.s("allowBlocking")
        NakedStaticMethod<IBinder> allowBlocking();
    }
}
