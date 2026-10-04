package com.prism.gaia.naked.metadata.android.system;

import W6.b;
import W6.c;
import W6.j;
import W6.m;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class StructIfaddrsCAGI {

    @m
    @j("android.system.StructIfaddrs")
    public interface C extends ClassAccessor {
        @n("hwaddr")
        NakedObject<byte[]> hwaddr();

        @n("ifa_name")
        NakedObject<String> ifa_name();
    }
}
