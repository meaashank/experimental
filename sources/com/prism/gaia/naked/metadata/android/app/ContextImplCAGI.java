package com.prism.gaia.naked.metadata.android.app;

import android.content.AttributionSource;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ContextImplCAGI {

    @W6.l
    @W6.j("android.app.ContextImpl")
    public interface G extends ClassAccessor {
        @W6.p("getReceiverRestrictedContext")
        NakedMethod<Context> getReceiverRestrictedContext();

        @W6.n("mBasePackageName")
        NakedObject<String> mBasePackageName();

        @W6.n("mOuterContext")
        NakedObject<Context> mOuterContext();

        @W6.n("mPackageInfo")
        NakedObject<Object> mPackageInfo();

        @W6.n("mPackageManager")
        NakedObject<PackageManager> mPackageManager();
    }

    @W6.l
    @W6.j("android.app.ContextImpl")
    public interface K19 extends ClassAccessor {
        @W6.n("mCacheDir")
        NakedObject<File> mCacheDir();

        @W6.n("mDatabasesDir")
        NakedObject<File> mDatabasesDir();

        @W6.n("mFilesDir")
        NakedObject<File> mFilesDir();

        @W6.n("mOpPackageName")
        NakedObject<String> mOpPackageName();

        @W6.n("mPreferencesDir")
        NakedObject<File> mPreferencesDir();
    }

    @W6.l
    @W6.j("android.app.ContextImpl")
    public interface L21 extends ClassAccessor {
        @W6.n("mCodeCacheDir")
        NakedObject<File> mCodeCacheDir();

        @W6.n("mNoBackupFilesDir")
        NakedObject<File> mNoBackupFilesDir();

        @W6.n("mUser")
        NakedObject<UserHandle> mUser();
    }

    @W6.l
    @W6.j("android.app.ContextImpl")
    public interface N25 extends ClassAccessor {
        @W6.n("mServiceCache")
        NakedObject<Object[]> mServiceCache();
    }

    @W6.l
    @W6.j("android.app.ContextImpl")
    public interface S31 extends ClassAccessor {
        @W6.n("mAttributionSource")
        NakedObject<AttributionSource> mAttributionSource();
    }
}
