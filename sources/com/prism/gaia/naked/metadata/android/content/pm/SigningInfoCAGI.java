package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.SigningInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class SigningInfoCAGI {

    @W6.l
    @W6.i(SigningInfo.class)
    public interface P28 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$SigningDetails"})
        @W6.k
        NakedConstructor<SigningInfo> ctor();
    }

    @W6.l
    @W6.i(SigningInfo.class)
    public interface T33 extends ClassAccessor {
        @W6.g({"android.content.pm.SigningDetails"})
        @W6.k
        NakedConstructor<SigningInfo> ctor();
    }
}
