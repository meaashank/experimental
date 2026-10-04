package com.prism.gaia.naked.metadata.android.os;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class INetworkManagementServiceCAGI {

    @W6.l
    @W6.j("android.os.INetworkManagementService")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.os.INetworkManagementService$Stub")
        public interface Stub extends ClassAccessor {
            @W6.f({IBinder.class})
            @W6.s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }
    }
}
