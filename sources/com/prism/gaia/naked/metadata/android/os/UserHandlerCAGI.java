package com.prism.gaia.naked.metadata.android.os;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticBoolean;
import com.prism.gaia.naked.entity.NakedStaticInt;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class UserHandlerCAGI {

    @W6.m
    @W6.j("android.os.UserHandle")
    public interface C extends ClassAccessor {
        @W6.q("MU_ENABLED")
        NakedStaticBoolean MU_ENABLED();

        @W6.q("PER_USER_RANGE")
        NakedStaticInt PER_USER_RANGE();
    }
}
