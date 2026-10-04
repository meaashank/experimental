package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.m;
import W6.n;
import W6.p;
import android.content.AttributionSource;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class AttributionSourceCAGI {

    @i(AttributionSource.class)
    @m
    public interface C extends ClassAccessor {
        @n("mAttributionSourceState")
        NakedObject<Object> mAttributionSourceState();

        @p("withPackageName")
        @f({String.class})
        NakedMethod<AttributionSource> withPackageName();
    }
}
