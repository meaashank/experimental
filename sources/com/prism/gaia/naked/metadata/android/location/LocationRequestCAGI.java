package com.prism.gaia.naked.metadata.android.location;

import W6.b;
import W6.c;
import W6.j;
import W6.m;
import W6.n;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class LocationRequestCAGI {

    @m
    @j("android.location.LocationRequest")
    public interface C extends ClassAccessor {
        @p("getProvider")
        NakedMethod<String> getProvider();

        @n("mHideFromAppOps")
        NakedBoolean mHideFromAppOps();

        @n("mProvider")
        NakedObject<String> mProvider();

        @n("mWorkSource")
        NakedObject<Object> mWorkSource();
    }
}
