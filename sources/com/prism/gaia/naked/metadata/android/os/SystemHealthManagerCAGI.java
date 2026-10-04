package com.prism.gaia.naked.metadata.android.os;

import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class SystemHealthManagerCAGI {

    @W6.l
    @W6.j("android.os.health.SystemHealthManager")
    public interface G extends ClassAccessor {
        @W6.n("mBatteryStats")
        NakedObject<IInterface> mBatteryStats();
    }
}
