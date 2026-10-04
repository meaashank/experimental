package com.prism.gaia.naked.metadata.android.net;

import W6.s;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class INetworkStatsServiceCAGI {

    @W6.l
    @W6.j("android.net.INetworkStatsService")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.net.INetworkStatsService$Stub")
        public interface Stub extends ClassAccessor {
            @W6.f({IBinder.class})
            @s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }
    }
}
