package com.prism.gaia.naked.metadata.android.os;

import android.os.Build;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class BuildCAGI {

    @W6.i(Build.class)
    @W6.m
    public interface C extends ClassAccessor {
        @W6.q("SUPPORTED_32_BIT_ABIS")
        NakedStaticObject<String[]> SUPPORTED_32_BIT_ABIS();

        @W6.q("SUPPORTED_64_BIT_ABIS")
        NakedStaticObject<String[]> SUPPORTED_64_BIT_ABIS();

        @W6.q("SUPPORTED_ABIS")
        NakedStaticObject<String[]> SUPPORTED_ABIS();
    }

    @W6.l
    @W6.i(Build.class)
    public interface G extends ClassAccessor {
        @W6.q("DEVICE")
        NakedStaticObject<String> DEVICE();

        @W6.q("SERIAL")
        NakedStaticObject<String> SERIAL();
    }
}
