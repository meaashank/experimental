package com.prism.gaia.naked.metadata.android.graphics;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.m;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public class CompatibilityCAGI {

    @m
    @j("android.graphics.Compatibility")
    public interface C extends ClassAccessor {
        @s("getTargetSdkVersion")
        NakedStaticMethod<Integer> getTargetSdkVersion();

        @f({int.class})
        @s("setTargetSdkVersion")
        NakedStaticMethod<Void> setTargetSdkVersion();
    }
}
