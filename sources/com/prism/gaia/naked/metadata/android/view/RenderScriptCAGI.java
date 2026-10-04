package com.prism.gaia.naked.metadata.android.view;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.m;
import W6.s;
import android.renderscript.RenderScript;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class RenderScriptCAGI {

    @i(RenderScript.class)
    @m
    public interface C extends ClassAccessor {
        @f({File.class})
        @s("setupDiskCache")
        NakedStaticMethod<Void> setupDiskCache();
    }
}
