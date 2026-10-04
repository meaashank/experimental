package com.prism.gaia.naked.metadata.android.app;

import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class NotificationManagerCAGI {

    @W6.l
    @W6.j("android.app.NotificationManager")
    public interface G extends ClassAccessor {
        @W6.s("getService")
        NakedStaticMethod<IInterface> getService();

        @W6.q("sService")
        NakedStaticObject<IInterface> sService();
    }
}
