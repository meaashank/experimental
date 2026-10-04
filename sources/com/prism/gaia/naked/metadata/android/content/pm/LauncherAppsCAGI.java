package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.UserManager;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class LauncherAppsCAGI {

    @W6.l
    @W6.j("android.content.pm.LauncherApps")
    public interface G extends ClassAccessor {
        @W6.n("mPm")
        NakedObject<PackageManager> mPm();

        @W6.n("mService")
        NakedObject<IInterface> mService();

        @W6.n("mUserManager")
        NakedObject<UserManager> mUserManager();
    }
}
