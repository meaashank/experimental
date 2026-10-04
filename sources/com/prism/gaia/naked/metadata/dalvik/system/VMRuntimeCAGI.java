package com.prism.gaia.naked.metadata.dalvik.system;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.m;
import W6.p;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class VMRuntimeCAGI {

    @m
    @j("dalvik.system.VMRuntime")
    public interface C extends ClassAccessor {
        @s("getCurrentInstructionSet")
        NakedStaticMethod<String> getCurrentInstructionSet();

        @p("getTargetSdkVersion")
        NakedMethod<Void> getTargetSdkVersion();

        @p("setTargetSdkVersion")
        @f({int.class})
        NakedMethod<Void> setTargetSdkVersion();
    }

    @l
    @j("dalvik.system.VMRuntime")
    public interface G extends ClassAccessor {
        @s("getRuntime")
        NakedStaticMethod<Object> getRuntime();
    }

    @l
    @j("dalvik.system.VMRuntime")
    public interface L21 extends ClassAccessor {
        @p("is64Bit")
        NakedMethod<Boolean> is64Bit();
    }
}
