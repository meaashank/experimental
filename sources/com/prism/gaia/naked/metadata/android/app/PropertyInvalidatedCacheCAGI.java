package com.prism.gaia.naked.metadata.android.app;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class PropertyInvalidatedCacheCAGI {

    @W6.l
    @W6.j("android.app.PropertyInvalidatedCache")
    public interface G extends ClassAccessor {
        @W6.p("clear")
        NakedMethod<Void> clear();

        @W6.n("mDisabled")
        NakedBoolean mDisabled();
    }
}
