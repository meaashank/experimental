package com.prism.gaia.naked.metadata.android.app;

import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ServiceCAGI {

    @W6.l
    @W6.j("android.app.Service")
    public interface G extends ClassAccessor {
        @W6.n("mToken")
        NakedObject<IBinder> mToken();
    }
}
