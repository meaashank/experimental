package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.InstallSourceInfo;
import android.content.pm.SigningInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class InstallSourceInfoCAGI {

    @W6.l
    @W6.i(InstallSourceInfo.class)
    public interface P28 extends ClassAccessor {
        @W6.n("mInitiatingPackageName")
        NakedObject<String> mInitiatingPackageName();

        @W6.n("mInitiatingPackageSigningInfo")
        NakedObject<SigningInfo> mInitiatingPackageSigningInfo();

        @W6.n("mInstallingPackageName")
        NakedObject<String> mInstallingPackageName();

        @W6.n("mOriginatingPackageName")
        NakedObject<String> mOriginatingPackageName();
    }

    @W6.l
    @W6.i(InstallSourceInfo.class)
    public interface U34 extends ClassAccessor {
        @W6.n("mUpdateOwnerPackageName")
        NakedObject<String> mUpdateOwnerPackageName();
    }
}
