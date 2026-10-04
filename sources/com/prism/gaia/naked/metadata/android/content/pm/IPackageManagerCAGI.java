package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IPackageManagerCAGI {

    @W6.l
    @W6.j("android.content.pm.IPackageManager")
    public interface G extends ClassAccessor {
        @W6.p("getApplicationInfo")
        @W6.f({String.class, int.class, int.class})
        NakedMethod<ApplicationInfo> getApplicationInfo();

        @W6.p("getPackageInfo")
        @W6.f({String.class, int.class, int.class})
        NakedMethod<PackageInfo> getPackageInfo();
    }

    @W6.l
    @W6.j("android.content.pm.IPackageManager")
    public interface T33 extends ClassAccessor {
        @W6.p("getApplicationInfo")
        @W6.f({String.class, long.class, int.class})
        NakedMethod<ApplicationInfo> getApplicationInfo();

        @W6.p("getPackageInfo")
        @W6.f({String.class, long.class, int.class})
        NakedMethod<PackageInfo> getPackageInfo();
    }
}
