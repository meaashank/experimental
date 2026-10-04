package com.prism.gaia.naked.metadata.android.ddm;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class DdmHandleAppNameCAGI {

    @l
    @j("android.ddm.DdmHandleAppName")
    public interface J17 extends ClassAccessor {
        @f({String.class, int.class})
        @s("setAppName")
        NakedStaticMethod<Void> setAppName();
    }

    @l
    @j("android.ddm.DdmHandleAppName")
    public interface _J16 extends ClassAccessor {
        @f({String.class})
        @s("setAppName")
        NakedStaticMethod<Void> setAppName();
    }
}
