package com.prism.gaia.naked.metadata.android.content.pm;

import Y6.c;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class PackageParserCAGI {

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.content.pm.PackageParser$Activity")
        public interface Activity extends ClassAccessor {
            @W6.n("info")
            NakedObject<ActivityInfo> info();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$Component")
        public interface Component extends ClassAccessor {
            @W6.n(c.g.f79296d)
            NakedObject<String> className();

            @W6.n("componentName")
            NakedObject<ComponentName> componentName();

            @W6.p("getComponentName")
            NakedMethod<ComponentName> getComponentName();

            @W6.n("intents")
            NakedObject<List<IntentFilter>> intents();

            @W6.n("metaData")
            NakedObject<Bundle> metaData();

            @W6.n("owner")
            NakedObject<Object> owner();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$Instrumentation")
        public interface Instrumentation extends ClassAccessor {
            @W6.n("info")
            NakedObject<InstrumentationInfo> info();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$Package")
        public interface Package extends ClassAccessor {
            @W6.n("activities")
            NakedObject<List> activities();

            @W6.n(L9.c.f58720e)
            NakedObject<ApplicationInfo> applicationInfo();

            @W6.n("configPreferences")
            NakedObject<ArrayList<ConfigurationInfo>> configPreferences();

            @W6.n("instrumentation")
            NakedObject<List> instrumentation();

            @W6.n("mAppMetaData")
            NakedObject<Bundle> mAppMetaData();

            @W6.n("mPreferredOrder")
            NakedInt mPreferredOrder();

            @W6.n("mSharedUserId")
            NakedObject<String> mSharedUserId();

            @W6.n("mSharedUserLabel")
            NakedInt mSharedUserLabel();

            @W6.n("mVersionCode")
            NakedObject<Integer> mVersionCode();

            @W6.n("mVersionName")
            NakedObject<String> mVersionName();

            @W6.n("packageName")
            NakedObject<String> packageName();

            @W6.n("permissionGroups")
            NakedObject<List> permissionGroups();

            @W6.n(Z3.f.f79420q)
            NakedObject<List> permissions();

            @W6.n("protectedBroadcasts")
            NakedObject<List<String>> protectedBroadcasts();

            @W6.n("providers")
            NakedObject<List> providers();

            @W6.n("receivers")
            NakedObject<List> receivers();

            @W6.n("reqFeatures")
            NakedObject<ArrayList<FeatureInfo>> reqFeatures();

            @W6.n("requestedPermissions")
            NakedObject<ArrayList<String>> requestedPermissions();

            @W6.n("services")
            NakedObject<List> services();

            @W6.n("usesLibraries")
            NakedObject<ArrayList<String>> usesLibraries();

            @W6.n("usesOptionalLibraries")
            NakedObject<ArrayList<String>> usesOptionalLibraries();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$Permission")
        public interface Permission extends ClassAccessor {
            @W6.n("info")
            NakedObject<PermissionInfo> info();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$PermissionGroup")
        public interface PermissionGroup extends ClassAccessor {
            @W6.n("info")
            NakedObject<PermissionGroupInfo> info();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$Provider")
        public interface Provider extends ClassAccessor {
            @W6.n("info")
            NakedObject<ProviderInfo> info();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$Service")
        public interface Service extends ClassAccessor {
            @W6.n("info")
            NakedObject<ServiceInfo> info();
        }

        @W6.q("PARSE_IS_SYSTEM")
        NakedStaticInt PARSE_IS_SYSTEM();
    }

    public interface I14 {

        @W6.l
        @W6.j("android.content.pm.PackageParser$ActivityIntentInfo")
        public interface ActivityIntentInfo extends ClassAccessor {
            @W6.n("activity")
            NakedObject<Object> activity();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$IntentInfo")
        public interface IntentInfo extends ClassAccessor {
            @W6.n("hasDefault")
            NakedBoolean hasDefault();

            @W6.n("icon")
            NakedInt icon();

            @W6.n("labelRes")
            NakedInt labelRes();

            @W6.n("logo")
            NakedInt logo();

            @W6.n("nonLocalizedLabel")
            NakedObject<CharSequence> nonLocalizedLabel();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$ProviderIntentInfo")
        public interface ProviderIntentInfo extends ClassAccessor {
            @W6.n("provider")
            NakedObject<Object> provider();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$ServiceIntentInfo")
        public interface ServiceIntentInfo extends ClassAccessor {
            @W6.n(NotificationCompat.CATEGORY_SERVICE)
            NakedObject<Object> service();
        }
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface J16_J16 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Activity", "int", x.b.f238265f, "int", "int"})
        @W6.s("generateActivityInfo")
        NakedStaticMethod<ActivityInfo> generateActivityInfo();

        @W6.g({"android.content.pm.PackageParser$Package", "int", x.b.f238265f, "int"})
        @W6.s("generateApplicationInfo")
        NakedStaticMethod<ApplicationInfo> generateApplicationInfo();

        @W6.g({"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.HashSet"})
        @W6.s("generatePackageInfo")
        NakedStaticMethod<PackageInfo> generatePackageInfo();

        @W6.g({"android.content.pm.PackageParser$Provider", "int", x.b.f238265f, "int", "int"})
        @W6.s("generateProviderInfo")
        NakedStaticMethod<ProviderInfo> generateProviderInfo();

        @W6.g({"android.content.pm.PackageParser$Service", "int", x.b.f238265f, "int", "int"})
        @W6.s("generateServiceInfo")
        NakedStaticMethod<ServiceInfo> generateServiceInfo();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface J17 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Activity", "int", "android.content.pm.PackageUserState", "int"})
        @W6.s("generateActivityInfo")
        NakedStaticMethod<ActivityInfo> generateActivityInfo();

        @W6.g({"android.content.pm.PackageParser$Package", "int", "android.content.pm.PackageUserState"})
        @W6.s("generateApplicationInfo")
        NakedStaticMethod<ApplicationInfo> generateApplicationInfo();

        @W6.g({"android.content.pm.PackageParser$Provider", "int", "android.content.pm.PackageUserState", "int"})
        @W6.s("generateProviderInfo")
        NakedStaticMethod<ProviderInfo> generateProviderInfo();

        @W6.g({"android.content.pm.PackageParser$Service", "int", "android.content.pm.PackageUserState", "int"})
        @W6.s("generateServiceInfo")
        NakedStaticMethod<ServiceInfo> generateServiceInfo();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface J17_L21 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.HashSet", "android.content.pm.PackageUserState"})
        @W6.s("generatePackageInfo")
        NakedStaticMethod<PackageInfo> generatePackageInfo();
    }

    public interface K19 {

        @W6.l
        @W6.j("android.content.pm.PackageParser$IntentInfo")
        public interface IntentInfo extends ClassAccessor {
            @W6.n("banner")
            NakedInt banner();
        }
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface L21 extends ClassAccessor {

        @W6.l
        @W6.j("android.content.pm.PackageParser$Package")
        public interface Package extends ClassAccessor {
            @W6.n("splitCodePaths")
            NakedObject<String[]> splitCodePaths();

            @W6.n("splitFlags")
            NakedObject<int[]> splitFlags();
        }

        @W6.k
        NakedConstructor<Object> ctor();

        @W6.p("parsePackage")
        @W6.f({File.class, int.class})
        NakedMethod<Object> parsePackage();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface L22_L22 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "android.util.ArraySet", "android.content.pm.PackageUserState"})
        @W6.s("generatePackageInfo")
        NakedStaticMethod<PackageInfo> generatePackageInfo();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface M23 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.Set", "android.content.pm.PackageUserState"})
        @W6.s("generatePackageInfo")
        NakedStaticMethod<PackageInfo> generatePackageInfo();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface N24_O27 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Package", "int"})
        @W6.s("collectCertificates")
        NakedStaticMethod<Void> collectCertificates();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface P28 extends ClassAccessor {

        @W6.l
        @W6.j("android.content.pm.PackageParser$Package")
        public interface Package extends ClassAccessor {
            @W6.n("mSigningDetails")
            NakedObject<Object> mSigningDetails();

            @W6.n("mVersionCodeMajor")
            NakedInt mVersionCodeMajor();

            @W6.n("usesStaticLibraries")
            NakedObject<ArrayList<String>> usesStaticLibraries();
        }

        @W6.l
        @W6.j("android.content.pm.PackageParser$SigningDetails")
        public interface SigningDetails extends ClassAccessor {

            @W6.l
            @W6.j("android.content.pm.PackageParser$SigningDetails$CertCapabilities")
            public interface CertCapabilities extends ClassAccessor {
                @W6.q("AUTH")
                NakedStaticInt AUTH();
            }

            @W6.q(com.prism.lib_google_billing.q.f194113a)
            NakedStaticObject<Object> UNKNOWN();

            @W6.p("checkCapability")
            @W6.g({"android.content.pm.PackageParser$SigningDetails", "int"})
            NakedMethod<Boolean> checkCapability();

            @W6.f({Signature[].class, int.class, ArraySet.class, Signature[].class})
            @W6.k
            NakedConstructor<Object> ctor();

            @W6.p("hasAncestorOrSelf")
            @W6.g({"android.content.pm.PackageParser$SigningDetails"})
            NakedMethod<Boolean> hasAncestorOrSelf();

            @W6.p("hasPastSigningCertificates")
            NakedMethod<Boolean> hasPastSigningCertificates();

            @W6.p("hasSignatures")
            NakedMethod<Boolean> hasSignatures();

            @W6.n("pastSigningCertificates")
            NakedObject<Signature[]> pastSigningCertificates();

            @W6.n("publicKeys")
            NakedObject<ArraySet<PublicKey>> publicKeys();

            @W6.n("signatureSchemeVersion")
            NakedInt signatureSchemeVersion();

            @W6.n("signatures")
            NakedObject<Signature[]> signatures();
        }

        @W6.g({"android.content.pm.PackageParser$Package", x.b.f238265f})
        @W6.s("collectCertificates")
        NakedStaticMethod<Void> collectCertificates();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface _I15 extends ClassAccessor {
        @W6.g({"android.content.pm.PackageParser$Activity", "int"})
        @W6.s("generateActivityInfo")
        NakedStaticMethod<ActivityInfo> generateActivityInfo();

        @W6.g({"android.content.pm.PackageParser$Package", "int"})
        @W6.s("generateApplicationInfo")
        NakedStaticMethod<ApplicationInfo> generateApplicationInfo();

        @W6.g({"android.content.pm.PackageParser$Package", "[I", "int", "long", "long"})
        @W6.s("generatePackageInfo")
        NakedStaticMethod<PackageInfo> generatePackageInfo();

        @W6.g({"android.content.pm.PackageParser$Provider", "int"})
        @W6.s("generateProviderInfo")
        NakedStaticMethod<ProviderInfo> generateProviderInfo();

        @W6.g({"android.content.pm.PackageParser$Service", "int"})
        @W6.s("generateServiceInfo")
        NakedStaticMethod<ServiceInfo> generateServiceInfo();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface _K20 extends ClassAccessor {
        @W6.f({String.class})
        @W6.k
        NakedConstructor<Object> ctor();

        @W6.p("parsePackage")
        @W6.f({File.class, String.class, DisplayMetrics.class, int.class})
        NakedMethod<Object> parsePackage();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface _M23 extends ClassAccessor {
        @W6.p("collectCertificates")
        @W6.g({"android.content.pm.PackageParser$Package", "int"})
        NakedMethod<Void> collectCertificates();
    }

    @W6.l
    @W6.j("android.content.pm.PackageParser")
    public interface _O27 extends ClassAccessor {

        @W6.l
        @W6.j("android.content.pm.PackageParser$Package")
        public interface Package extends ClassAccessor {
            @W6.n("mSignatures")
            NakedObject<Signature[]> mSignatures();
        }
    }
}
