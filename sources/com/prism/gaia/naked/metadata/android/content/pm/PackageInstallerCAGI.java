package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedFloat;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class PackageInstallerCAGI {

    public interface G {

        @W6.l
        @W6.j("android.content.pm.PackageInstaller$SessionInfo")
        public interface SessionInfo extends ClassAccessor {
            @W6.n(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
            NakedBoolean active();

            @W6.n("appIcon")
            NakedObject<Bitmap> appIcon();

            @W6.n("appLabel")
            NakedObject<CharSequence> appLabel();

            @W6.n("appPackageName")
            NakedObject<String> appPackageName();

            @W6.k
            NakedConstructor<PackageInstaller.SessionInfo> ctor();

            @W6.n("installerPackageName")
            NakedObject<String> installerPackageName();

            @W6.n("mode")
            NakedInt mode();

            @W6.n("progress")
            NakedFloat progress();

            @W6.n("resolvedBaseCodePath")
            NakedObject<String> resolvedBaseCodePath();

            @W6.n("sealed")
            NakedBoolean sealed();

            @W6.n("sessionId")
            NakedInt sessionId();

            @W6.n("sizeBytes")
            NakedLong sizeBytes();
        }
    }

    public interface M23 {

        @W6.l
        @W6.j("android.content.pm.PackageInstaller$SessionParams")
        public interface SessionParams extends ClassAccessor {
            @W6.n("abiOverride")
            NakedObject<String> abiOverride();

            @W6.n("appIcon")
            NakedObject<Bitmap> appIcon();

            @W6.n("appIconLastModified")
            NakedLong appIconLastModified();

            @W6.n("appLabel")
            NakedObject<String> appLabel();

            @W6.n("appPackageName")
            NakedObject<String> appPackageName();

            @W6.n("grantedRuntimePermissions")
            NakedObject<String[]> grantedRuntimePermissions();

            @W6.n("installFlags")
            NakedInt installFlags();

            @W6.n("installLocation")
            NakedInt installLocation();

            @W6.n("mode")
            NakedInt mode();

            @W6.n("originatingUri")
            NakedObject<Uri> originatingUri();

            @W6.n("referrerUri")
            NakedObject<Uri> referrerUri();

            @W6.n("sizeBytes")
            NakedLong sizeBytes();

            @W6.n("volumeUuid")
            NakedObject<String> volumeUuid();
        }
    }

    public interface _L22 {

        @W6.l
        @W6.j("android.content.pm.PackageInstaller$SessionParams")
        public interface SessionParams extends ClassAccessor {
            @W6.n("abiOverride")
            NakedObject<String> abiOverride();

            @W6.n("appIcon")
            NakedObject<Bitmap> appIcon();

            @W6.n("appIconLastModified")
            NakedLong appIconLastModified();

            @W6.n("appLabel")
            NakedObject<String> appLabel();

            @W6.n("appPackageName")
            NakedObject<String> appPackageName();

            @W6.n("installFlags")
            NakedInt installFlags();

            @W6.n("installLocation")
            NakedInt installLocation();

            @W6.n("mode")
            NakedInt mode();

            @W6.n("originatingUri")
            NakedObject<Uri> originatingUri();

            @W6.n("referrerUri")
            NakedObject<Uri> referrerUri();

            @W6.n("sizeBytes")
            NakedLong sizeBytes();
        }
    }
}
