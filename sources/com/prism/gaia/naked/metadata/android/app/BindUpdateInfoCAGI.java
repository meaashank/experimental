package com.prism.gaia.naked.metadata.android.app;

import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class BindUpdateInfoCAGI {

    @W6.m
    @W6.j("android.app.BindUpdateInfo")
    public interface C37 extends ClassAccessor {
        @W6.n("connection")
        NakedObject<IBinder> connection();

        @W6.n("unbind")
        NakedBoolean unbind();
    }
}
