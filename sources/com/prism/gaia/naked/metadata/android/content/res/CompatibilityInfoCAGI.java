package com.prism.gaia.naked.metadata.android.content.res;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.k;
import W6.l;
import W6.q;
import android.content.pm.ApplicationInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class CompatibilityInfoCAGI {

    @l
    @j("android.content.res.CompatibilityInfo")
    public interface G extends ClassAccessor {
        @q("DEFAULT_COMPATIBILITY_INFO")
        NakedStaticObject<Object> DEFAULT_COMPATIBILITY_INFO();

        @f({ApplicationInfo.class, int.class, int.class, boolean.class})
        @k
        NakedConstructor ctor();
    }
}
