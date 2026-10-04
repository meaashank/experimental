package com.prism.gaia.naked.metadata.android.content.pm;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedStaticInt;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class UserInfoCAGI {

    @W6.l
    @W6.j("android.content.pm.UserInfo")
    public interface G extends ClassAccessor {
        @W6.q("FLAG_PRIMARY")
        NakedStaticInt FLAG_PRIMARY();

        @W6.f({int.class, String.class, int.class})
        @W6.k
        NakedConstructor<Object> ctor();
    }
}
