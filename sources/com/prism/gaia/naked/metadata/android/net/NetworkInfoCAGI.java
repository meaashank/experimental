package com.prism.gaia.naked.metadata.android.net;

import W6.n;
import android.net.NetworkInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class NetworkInfoCAGI {

    @W6.l
    @W6.i(NetworkInfo.class)
    public interface G extends ClassAccessor {
        @W6.f({int.class, int.class, String.class, String.class})
        @W6.k
        NakedConstructor<NetworkInfo> ctor();

        @W6.f({int.class})
        @W6.k
        NakedConstructor<NetworkInfo> ctorOld();

        @n("mDetailedState")
        NakedObject<NetworkInfo.DetailedState> mDetailedState();

        @n("mIsAvailable")
        NakedBoolean mIsAvailable();

        @n("mNetworkType")
        NakedInt mNetworkType();

        @n("mState")
        NakedObject<NetworkInfo.State> mState();

        @n("mTypeName")
        NakedObject<String> mTypeName();
    }
}
