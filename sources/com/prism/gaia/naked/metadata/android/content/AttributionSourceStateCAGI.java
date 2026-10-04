package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.j;
import W6.m;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class AttributionSourceStateCAGI {

    @m
    @j("android.content.AttributionSourceState")
    public interface C extends ClassAccessor {
        @n("next")
        NakedObject<Object[]> next();

        @n("packageName")
        NakedObject<String> packageName();

        @n("uid")
        NakedInt uid();
    }
}
