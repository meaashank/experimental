package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ApplicationInfoCAGI {

    @W6.i(ApplicationInfo.class)
    @W6.m
    public interface C extends ClassAccessor {
        @W6.n("overlayPaths")
        NakedObject<String[]> overlayPaths();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface L21 extends ClassAccessor {
        @W6.n("enabledSetting")
        NakedInt enabledSetting();

        @W6.n("primaryCpuAbi")
        NakedObject<String> primaryCpuAbi();

        @W6.n("privateFlags")
        NakedInt privateFlags();

        @W6.n("resourceDirs")
        NakedObject<String[]> resourceDirs();

        @W6.n("scanPublicSourceDir")
        NakedObject<String> scanPublicSourceDir();

        @W6.n("scanSourceDir")
        NakedObject<String> scanSourceDir();

        @W6.n("secondaryCpuAbi")
        NakedObject<String> secondaryCpuAbi();

        @W6.n("secondaryNativeLibraryDir")
        NakedObject<String> secondaryNativeLibraryDir();

        @W6.n("splitPublicSourceDirs")
        NakedObject<String[]> splitPublicSourceDirs();

        @W6.n("splitSourceDirs")
        NakedObject<String[]> splitSourceDirs();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface N24 extends ClassAccessor {
        @W6.n("credentialProtectedDataDir")
        NakedObject<String> credentialProtectedDataDir();

        @W6.n("deviceProtectedDataDir")
        NakedObject<String> deviceProtectedDataDir();

        @W6.n("networkSecurityConfigRes")
        NakedInt networkSecurityConfigRes();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface N24_N25 extends ClassAccessor {
        @W6.n("credentialEncryptedDataDir")
        NakedObject<String> credentialEncryptedDataDir();

        @W6.n("deviceEncryptedDataDir")
        NakedObject<String> deviceEncryptedDataDir();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface O26 extends ClassAccessor {
        @W6.n("splitNames")
        NakedObject<String[]> splitNames();

        @W6.n("targetSandboxVersion")
        NakedInt targetSandboxVersion();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface P28 extends ClassAccessor {
        @W6.n("longVersionCode")
        NakedLong longVersionCode();

        @W6.p("setVersionCode")
        @W6.f({long.class})
        NakedMethod<Void> setVersionCode();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface Q29 extends ClassAccessor {
        @W6.n("sharedLibraryInfos")
        NakedObject<List<SharedLibraryInfo>> sharedLibraryInfos();
    }

    @W6.l
    @W6.i(ApplicationInfo.class)
    public interface _O27 extends ClassAccessor {
        @W6.n("versionCode")
        NakedInt versionCode();
    }
}
