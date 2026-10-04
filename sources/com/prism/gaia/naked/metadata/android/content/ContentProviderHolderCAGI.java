package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.k;
import W6.l;
import W6.n;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ContentProviderHolderCAGI {

    @l
    @j("android.app.ContentProviderHolder")
    public interface O26 extends ClassAccessor {
        @n("connection")
        NakedObject<IBinder> connection();

        @f({ProviderInfo.class})
        @k
        NakedConstructor<Object> ctor();

        @n("info")
        NakedObject<ProviderInfo> info();

        @n("noReleaseNeeded")
        NakedBoolean noReleaseNeeded();

        @n("provider")
        NakedObject<IInterface> provider();
    }

    @l
    @j("android.app.ContentProviderHolder")
    public interface S31 extends ClassAccessor {
        @n("mLocal")
        NakedBoolean mLocal();
    }
}
