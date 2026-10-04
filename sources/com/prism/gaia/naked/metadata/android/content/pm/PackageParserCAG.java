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
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class PackageParserCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165667G = new Impl_G();
    public static Impl__I15 _I15 = new Impl__I15();
    public static Impl__K20 _K20 = new Impl__K20();
    public static Impl__M23 _M23 = new Impl__M23();
    public static Impl__O27 _O27 = new Impl__O27();
    public static Impl_I14 I14 = new Impl_I14();
    public static Impl_J17 J17 = new Impl_J17();
    public static Impl_K19 K19 = new Impl_K19();
    public static Impl_L21 L21 = new Impl_L21();
    public static Impl_M23 M23 = new Impl_M23();
    public static Impl_P28 P28 = new Impl_P28();
    public static Impl_J16_J16 J16_J16 = new Impl_J16_J16();
    public static Impl_J17_L21 J17_L21 = new Impl_J17_L21();
    public static Impl_L22_L22 L22_L22 = new Impl_L22_L22();
    public static Impl_N24_O27 N24_O27 = new Impl_N24_O27();

    @W6.l
    public static final class Impl_G implements PackageParserCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticInt> __PARSE_IS_SYSTEM = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.B0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165612a.lambda$new$0();
            }
        });
        public Impl_Package Package = new Impl_Package();
        public Impl_Activity Activity = new Impl_Activity();
        public Impl_Provider Provider = new Impl_Provider();
        public Impl_Service Service = new Impl_Service();
        public Impl_Instrumentation Instrumentation = new Impl_Instrumentation();
        public Impl_Permission Permission = new Impl_Permission();
        public Impl_PermissionGroup PermissionGroup = new Impl_PermissionGroup();
        public Impl_Component Component = new Impl_Component();

        @W6.l
        public static final class Impl_Activity implements PackageParserCAGI.G.Activity {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Activity");
            private InitOnce<NakedObject<ActivityInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.C0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165616a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Activity
            public NakedObject<ActivityInfo> info() {
                return this.__info.get();
            }
        }

        @W6.l
        public static final class Impl_Component implements PackageParserCAGI.G.Component {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Component");
            private InitOnce<NakedObject<String>> __className = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.D0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165620a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<ComponentName>> __componentName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.E0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165624a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<List<IntentFilter>>> __intents = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.F0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165627a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<Object>> __owner = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.G0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165630a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<Bundle>> __metaData = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.H0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165632a.lambda$new$4();
                }
            });
            private InitOnce<NakedMethod<ComponentName>> __getComponentName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.I0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165635a.lambda$new$5();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), c.g.f79296d);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "componentName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "intents");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "owner");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "metaData");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$5() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "getComponentName");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Component
            public NakedObject<String> className() {
                return this.__className.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Component
            public NakedObject<ComponentName> componentName() {
                return this.__componentName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Component
            public NakedMethod<ComponentName> getComponentName() {
                return this.__getComponentName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Component
            public NakedObject<List<IntentFilter>> intents() {
                return this.__intents.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Component
            public NakedObject<Bundle> metaData() {
                return this.__metaData.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Component
            public NakedObject<Object> owner() {
                return this.__owner.get();
            }
        }

        @W6.l
        public static final class Impl_Instrumentation implements PackageParserCAGI.G.Instrumentation {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Instrumentation");
            private InitOnce<NakedObject<InstrumentationInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.J0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165645a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Instrumentation
            public NakedObject<InstrumentationInfo> info() {
                return this.__info.get();
            }
        }

        @W6.l
        public static final class Impl_Package implements PackageParserCAGI.G.Package {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Package");
            private InitOnce<NakedObject<List>> __activities = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.K0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165648a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Bundle>> __mAppMetaData = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.M0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165655a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<String>> __mSharedUserId = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.O0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165661a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<Integer>> __mVersionCode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.P0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165664a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<String>> __mVersionName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Q0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165671a.lambda$new$4();
                }
            });
            private InitOnce<NakedObject<String>> __packageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.R0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165673a.lambda$new$5();
                }
            });
            private InitOnce<NakedObject<List>> __permissionGroups = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.S0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165676a.lambda$new$6();
                }
            });
            private InitOnce<NakedObject<List>> __permissions = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.T0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165680a.lambda$new$7();
                }
            });
            private InitOnce<NakedObject<List<String>>> __protectedBroadcasts = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.U0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165683a.lambda$new$8();
                }
            });
            private InitOnce<NakedObject<List>> __providers = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.W0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165690a.lambda$new$9();
                }
            });
            private InitOnce<NakedObject<List>> __receivers = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.V0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165687a.lambda$new$10();
                }
            });
            private InitOnce<NakedObject<ArrayList<String>>> __requestedPermissions = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.X0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165693a.lambda$new$11();
                }
            });
            private InitOnce<NakedObject<List>> __services = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Y0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165696a.lambda$new$12();
                }
            });
            private InitOnce<NakedObject<List>> __instrumentation = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Z0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165699a.lambda$new$13();
                }
            });
            private InitOnce<NakedInt> __mPreferredOrder = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.a1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165703a.lambda$new$14();
                }
            });
            private InitOnce<NakedObject<ArrayList<String>>> __usesLibraries = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.b1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165707a.lambda$new$15();
                }
            });
            private InitOnce<NakedObject<ArrayList<String>>> __usesOptionalLibraries = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.c1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165711a.lambda$new$16();
                }
            });
            private InitOnce<NakedObject<ApplicationInfo>> __applicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.d1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165715a.lambda$new$17();
                }
            });
            private InitOnce<NakedObject<ArrayList<ConfigurationInfo>>> __configPreferences = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.e1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165719a.lambda$new$18();
                }
            });
            private InitOnce<NakedObject<ArrayList<FeatureInfo>>> __reqFeatures = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.L0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165651a.lambda$new$19();
                }
            });
            private InitOnce<NakedInt> __mSharedUserLabel = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.N0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165658a.lambda$new$20();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "activities");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mAppMetaData");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$10() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "receivers");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$11() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "requestedPermissions");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$12() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "services");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$13() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "instrumentation");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$14() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mPreferredOrder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$15() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "usesLibraries");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$16() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "usesOptionalLibraries");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$17() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), L9.c.f58720e);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$18() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "configPreferences");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$19() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "reqFeatures");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mSharedUserId");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$20() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mSharedUserLabel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mVersionCode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mVersionName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$5() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "packageName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$6() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "permissionGroups");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$7() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), Z3.f.f79420q);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$8() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "protectedBroadcasts");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$9() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "providers");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> activities() {
                return this.__activities.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<ApplicationInfo> applicationInfo() {
                return this.__applicationInfo.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<ArrayList<ConfigurationInfo>> configPreferences() {
                return this.__configPreferences.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> instrumentation() {
                return this.__instrumentation.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<Bundle> mAppMetaData() {
                return this.__mAppMetaData.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedInt mPreferredOrder() {
                return this.__mPreferredOrder.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<String> mSharedUserId() {
                return this.__mSharedUserId.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedInt mSharedUserLabel() {
                return this.__mSharedUserLabel.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<Integer> mVersionCode() {
                return this.__mVersionCode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<String> mVersionName() {
                return this.__mVersionName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<String> packageName() {
                return this.__packageName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> permissionGroups() {
                return this.__permissionGroups.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> permissions() {
                return this.__permissions.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List<String>> protectedBroadcasts() {
                return this.__protectedBroadcasts.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> providers() {
                return this.__providers.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> receivers() {
                return this.__receivers.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<ArrayList<FeatureInfo>> reqFeatures() {
                return this.__reqFeatures.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<ArrayList<String>> requestedPermissions() {
                return this.__requestedPermissions.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<List> services() {
                return this.__services.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<ArrayList<String>> usesLibraries() {
                return this.__usesLibraries.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Package
            public NakedObject<ArrayList<String>> usesOptionalLibraries() {
                return this.__usesOptionalLibraries.get();
            }
        }

        @W6.l
        public static final class Impl_Permission implements PackageParserCAGI.G.Permission {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Permission");
            private InitOnce<NakedObject<PermissionInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.f1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165723a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Permission
            public NakedObject<PermissionInfo> info() {
                return this.__info.get();
            }
        }

        @W6.l
        public static final class Impl_PermissionGroup implements PackageParserCAGI.G.PermissionGroup {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$PermissionGroup");
            private InitOnce<NakedObject<PermissionGroupInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.g1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165727a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.PermissionGroup
            public NakedObject<PermissionGroupInfo> info() {
                return this.__info.get();
            }
        }

        @W6.l
        public static final class Impl_Provider implements PackageParserCAGI.G.Provider {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Provider");
            private InitOnce<NakedObject<ProviderInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.h1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165731a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Provider
            public NakedObject<ProviderInfo> info() {
                return this.__info.get();
            }
        }

        @W6.l
        public static final class Impl_Service implements PackageParserCAGI.G.Service {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Service");
            private InitOnce<NakedObject<ServiceInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.i1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165735a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G.Service
            public NakedObject<ServiceInfo> info() {
                return this.__info.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "PARSE_IS_SYSTEM");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.G
        public NakedStaticInt PARSE_IS_SYSTEM() {
            return this.__PARSE_IS_SYSTEM.get();
        }
    }

    public static final class Impl_I14 implements PackageParserCAGI.I14 {
        public Impl_IntentInfo IntentInfo = new Impl_IntentInfo();
        public Impl_ActivityIntentInfo ActivityIntentInfo = new Impl_ActivityIntentInfo();
        public Impl_ServiceIntentInfo ServiceIntentInfo = new Impl_ServiceIntentInfo();
        public Impl_ProviderIntentInfo ProviderIntentInfo = new Impl_ProviderIntentInfo();

        @W6.l
        public static final class Impl_ActivityIntentInfo implements PackageParserCAGI.I14.ActivityIntentInfo {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$ActivityIntentInfo");
            private InitOnce<NakedObject<Object>> __activity = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.j1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165739a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "activity");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.ActivityIntentInfo
            public NakedObject<Object> activity() {
                return this.__activity.get();
            }
        }

        @W6.l
        public static final class Impl_IntentInfo implements PackageParserCAGI.I14.IntentInfo {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$IntentInfo");
            private InitOnce<NakedBoolean> __hasDefault = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.k1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165743a.lambda$new$0();
                }
            });
            private InitOnce<NakedInt> __labelRes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.l1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165747a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<CharSequence>> __nonLocalizedLabel = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.m1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165751a.lambda$new$2();
                }
            });
            private InitOnce<NakedInt> __icon = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.n1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165755a.lambda$new$3();
                }
            });
            private InitOnce<NakedInt> __logo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.o1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165759a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "hasDefault");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$1() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "labelRes");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "nonLocalizedLabel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$3() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "icon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$4() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "logo");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.IntentInfo
            public NakedBoolean hasDefault() {
                return this.__hasDefault.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.IntentInfo
            public NakedInt icon() {
                return this.__icon.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.IntentInfo
            public NakedInt labelRes() {
                return this.__labelRes.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.IntentInfo
            public NakedInt logo() {
                return this.__logo.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.IntentInfo
            public NakedObject<CharSequence> nonLocalizedLabel() {
                return this.__nonLocalizedLabel.get();
            }
        }

        @W6.l
        public static final class Impl_ProviderIntentInfo implements PackageParserCAGI.I14.ProviderIntentInfo {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$ProviderIntentInfo");
            private InitOnce<NakedObject<Object>> __provider = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.p1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165763a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "provider");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.ProviderIntentInfo
            public NakedObject<Object> provider() {
                return this.__provider.get();
            }
        }

        @W6.l
        public static final class Impl_ServiceIntentInfo implements PackageParserCAGI.I14.ServiceIntentInfo {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$ServiceIntentInfo");
            private InitOnce<NakedObject<Object>> __service = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.q1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165767a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), NotificationCompat.CATEGORY_SERVICE);
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.I14.ServiceIntentInfo
            public NakedObject<Object> service() {
                return this.__service.get();
            }
        }
    }

    @W6.l
    public static final class Impl_J16_J16 implements PackageParserCAGI.J16_J16 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<PackageInfo>> __generatePackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.r1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165771a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<ApplicationInfo>> __generateApplicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.s1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165775a.lambda$new$1();
            }
        });
        private InitOnce<NakedStaticMethod<ActivityInfo>> __generateActivityInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.t1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165779a.lambda$new$2();
            }
        });
        private InitOnce<NakedStaticMethod<ServiceInfo>> __generateServiceInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.u1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165783a.lambda$new$3();
            }
        });
        private InitOnce<NakedStaticMethod<ProviderInfo>> __generateProviderInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.v1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165787a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generatePackageInfo", new String[]{"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.HashSet"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateApplicationInfo", new String[]{"android.content.pm.PackageParser$Package", "int", x.b.f238265f, "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$2() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateActivityInfo", new String[]{"android.content.pm.PackageParser$Activity", "int", x.b.f238265f, "int", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$3() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateServiceInfo", new String[]{"android.content.pm.PackageParser$Service", "int", x.b.f238265f, "int", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$4() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateProviderInfo", new String[]{"android.content.pm.PackageParser$Provider", "int", x.b.f238265f, "int", "int"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J16_J16
        public NakedStaticMethod<ActivityInfo> generateActivityInfo() {
            return this.__generateActivityInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J16_J16
        public NakedStaticMethod<ApplicationInfo> generateApplicationInfo() {
            return this.__generateApplicationInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J16_J16
        public NakedStaticMethod<PackageInfo> generatePackageInfo() {
            return this.__generatePackageInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J16_J16
        public NakedStaticMethod<ProviderInfo> generateProviderInfo() {
            return this.__generateProviderInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J16_J16
        public NakedStaticMethod<ServiceInfo> generateServiceInfo() {
            return this.__generateServiceInfo.get();
        }
    }

    @W6.l
    public static final class Impl_J17 implements PackageParserCAGI.J17 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<ApplicationInfo>> __generateApplicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.w1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165791a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<ActivityInfo>> __generateActivityInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.x1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165795a.lambda$new$1();
            }
        });
        private InitOnce<NakedStaticMethod<ServiceInfo>> __generateServiceInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.y1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165799a.lambda$new$2();
            }
        });
        private InitOnce<NakedStaticMethod<ProviderInfo>> __generateProviderInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.z1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165803a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateApplicationInfo", new String[]{"android.content.pm.PackageParser$Package", "int", "android.content.pm.PackageUserState"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateActivityInfo", new String[]{"android.content.pm.PackageParser$Activity", "int", "android.content.pm.PackageUserState", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$2() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateServiceInfo", new String[]{"android.content.pm.PackageParser$Service", "int", "android.content.pm.PackageUserState", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$3() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateProviderInfo", new String[]{"android.content.pm.PackageParser$Provider", "int", "android.content.pm.PackageUserState", "int"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J17
        public NakedStaticMethod<ActivityInfo> generateActivityInfo() {
            return this.__generateActivityInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J17
        public NakedStaticMethod<ApplicationInfo> generateApplicationInfo() {
            return this.__generateApplicationInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J17
        public NakedStaticMethod<ProviderInfo> generateProviderInfo() {
            return this.__generateProviderInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J17
        public NakedStaticMethod<ServiceInfo> generateServiceInfo() {
            return this.__generateServiceInfo.get();
        }
    }

    @W6.l
    public static final class Impl_J17_L21 implements PackageParserCAGI.J17_L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<PackageInfo>> __generatePackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.A1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165608a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generatePackageInfo", new String[]{"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.HashSet", "android.content.pm.PackageUserState"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.J17_L21
        public NakedStaticMethod<PackageInfo> generatePackageInfo() {
            return this.__generatePackageInfo.get();
        }
    }

    public static final class Impl_K19 implements PackageParserCAGI.K19 {
        public Impl_IntentInfo IntentInfo = new Impl_IntentInfo();

        @W6.l
        public static final class Impl_IntentInfo implements PackageParserCAGI.K19.IntentInfo {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$IntentInfo");
            private InitOnce<NakedInt> __banner = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.B1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165613a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$0() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "banner");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.K19.IntentInfo
            public NakedInt banner() {
                return this.__banner.get();
            }
        }
    }

    @W6.l
    public static final class Impl_L21 implements PackageParserCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.C1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165617a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Object>> __parsePackage = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.D1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165621a.lambda$new$1();
            }
        });
        public Impl_Package Package = new Impl_Package();

        @W6.l
        public static final class Impl_Package implements PackageParserCAGI.L21.Package {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Package");
            private InitOnce<NakedObject<String[]>> __splitCodePaths = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.E1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165625a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<int[]>> __splitFlags = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.F1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165628a.lambda$new$1();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "splitCodePaths");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "splitFlags");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.L21.Package
            public NakedObject<String[]> splitCodePaths() {
                return this.__splitCodePaths.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.L21.Package
            public NakedObject<int[]> splitFlags() {
                return this.__splitFlags.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "parsePackage", (Class<?>[]) new Class[]{File.class, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.L21
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.L21
        public NakedMethod<Object> parsePackage() {
            return this.__parsePackage.get();
        }
    }

    @W6.l
    public static final class Impl_L22_L22 implements PackageParserCAGI.L22_L22 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<PackageInfo>> __generatePackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.G1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165631a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generatePackageInfo", new String[]{"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "android.util.ArraySet", "android.content.pm.PackageUserState"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.L22_L22
        public NakedStaticMethod<PackageInfo> generatePackageInfo() {
            return this.__generatePackageInfo.get();
        }
    }

    @W6.l
    public static final class Impl_M23 implements PackageParserCAGI.M23 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<PackageInfo>> __generatePackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.H1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165633a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generatePackageInfo", new String[]{"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.Set", "android.content.pm.PackageUserState"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.M23
        public NakedStaticMethod<PackageInfo> generatePackageInfo() {
            return this.__generatePackageInfo.get();
        }
    }

    @W6.l
    public static final class Impl_N24_O27 implements PackageParserCAGI.N24_O27 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<Void>> __collectCertificates = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.I1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165636a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "collectCertificates", new String[]{"android.content.pm.PackageParser$Package", "int"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.N24_O27
        public NakedStaticMethod<Void> collectCertificates() {
            return this.__collectCertificates.get();
        }
    }

    @W6.l
    public static final class Impl_P28 implements PackageParserCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<Void>> __collectCertificates = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.J1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165646a.lambda$new$0();
            }
        });
        public Impl_Package Package = new Impl_Package();
        public Impl_SigningDetails SigningDetails = new Impl_SigningDetails();

        @W6.l
        public static final class Impl_Package implements PackageParserCAGI.P28.Package {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Package");
            private InitOnce<NakedObject<Object>> __mSigningDetails = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.K1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165649a.lambda$new$0();
                }
            });
            private InitOnce<NakedInt> __mVersionCodeMajor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.L1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165652a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<ArrayList<String>>> __usesStaticLibraries = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.M1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165656a.lambda$new$2();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mSigningDetails");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$1() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mVersionCodeMajor");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "usesStaticLibraries");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.Package
            public NakedObject<Object> mSigningDetails() {
                return this.__mSigningDetails.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.Package
            public NakedInt mVersionCodeMajor() {
                return this.__mVersionCodeMajor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.Package
            public NakedObject<ArrayList<String>> usesStaticLibraries() {
                return this.__usesStaticLibraries.get();
            }
        }

        @W6.l
        public static final class Impl_SigningDetails implements PackageParserCAGI.P28.SigningDetails {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$SigningDetails");
            private InitOnce<NakedStaticObject<Object>> __UNKNOWN = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.N1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165659a.lambda$new$0();
                }
            });
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.O1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165662a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<Signature[]>> __signatures = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.P1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165665a.lambda$new$2();
                }
            });
            private InitOnce<NakedInt> __signatureSchemeVersion = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Q1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165672a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<ArraySet<PublicKey>>> __publicKeys = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.R1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165674a.lambda$new$4();
                }
            });
            private InitOnce<NakedObject<Signature[]>> __pastSigningCertificates = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.S1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165677a.lambda$new$5();
                }
            });
            private InitOnce<NakedMethod<Boolean>> __hasPastSigningCertificates = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.T1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165681a.lambda$new$6();
                }
            });
            private InitOnce<NakedMethod<Boolean>> __hasSignatures = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.U1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165684a.lambda$new$7();
                }
            });
            private InitOnce<NakedMethod<Boolean>> __checkCapability = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.V1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165688a.lambda$new$8();
                }
            });
            private InitOnce<NakedMethod<Boolean>> __hasAncestorOrSelf = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.W1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165691a.lambda$new$9();
                }
            });
            public Impl_CertCapabilities CertCapabilities = new Impl_CertCapabilities();

            @W6.l
            public static final class Impl_CertCapabilities implements PackageParserCAGI.P28.SigningDetails.CertCapabilities {
                private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$SigningDetails$CertCapabilities");
                private InitOnce<NakedStaticInt> __AUTH = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.X1
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f165694a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
                    return new NakedStaticInt((Class<?>) ORG_CLASS(), "AUTH");
                }

                @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails.CertCapabilities
                public NakedStaticInt AUTH() {
                    return this.__AUTH.get();
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), com.prism.lib_google_billing.q.f194113a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$1() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Signature[].class, Integer.TYPE, ArraySet.class, Signature[].class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "signatures");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$3() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "signatureSchemeVersion");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "publicKeys");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$5() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "pastSigningCertificates");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$6() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "hasPastSigningCertificates");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$7() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "hasSignatures");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$8() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "checkCapability", new String[]{"android.content.pm.PackageParser$SigningDetails", "int"});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$9() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "hasAncestorOrSelf", new String[]{"android.content.pm.PackageParser$SigningDetails"});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedStaticObject<Object> UNKNOWN() {
                return this.__UNKNOWN.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedMethod<Boolean> checkCapability() {
                return this.__checkCapability.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedMethod<Boolean> hasAncestorOrSelf() {
                return this.__hasAncestorOrSelf.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedMethod<Boolean> hasPastSigningCertificates() {
                return this.__hasPastSigningCertificates.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedMethod<Boolean> hasSignatures() {
                return this.__hasSignatures.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedObject<Signature[]> pastSigningCertificates() {
                return this.__pastSigningCertificates.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedObject<ArraySet<PublicKey>> publicKeys() {
                return this.__publicKeys.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedInt signatureSchemeVersion() {
                return this.__signatureSchemeVersion.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28.SigningDetails
            public NakedObject<Signature[]> signatures() {
                return this.__signatures.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "collectCertificates", new String[]{"android.content.pm.PackageParser$Package", x.b.f238265f});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI.P28
        public NakedStaticMethod<Void> collectCertificates() {
            return this.__collectCertificates.get();
        }
    }

    @W6.l
    public static final class Impl__I15 implements PackageParserCAGI._I15 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedStaticMethod<PackageInfo>> __generatePackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Y1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165697a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<ApplicationInfo>> __generateApplicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Z1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165700a.lambda$new$1();
            }
        });
        private InitOnce<NakedStaticMethod<ActivityInfo>> __generateActivityInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.a2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165704a.lambda$new$2();
            }
        });
        private InitOnce<NakedStaticMethod<ServiceInfo>> __generateServiceInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.b2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165708a.lambda$new$3();
            }
        });
        private InitOnce<NakedStaticMethod<ProviderInfo>> __generateProviderInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.c2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165712a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generatePackageInfo", new String[]{"android.content.pm.PackageParser$Package", "[I", "int", "long", "long"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateApplicationInfo", new String[]{"android.content.pm.PackageParser$Package", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$2() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateActivityInfo", new String[]{"android.content.pm.PackageParser$Activity", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$3() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateServiceInfo", new String[]{"android.content.pm.PackageParser$Service", "int"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$4() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "generateProviderInfo", new String[]{"android.content.pm.PackageParser$Provider", "int"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._I15
        public NakedStaticMethod<ActivityInfo> generateActivityInfo() {
            return this.__generateActivityInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._I15
        public NakedStaticMethod<ApplicationInfo> generateApplicationInfo() {
            return this.__generateApplicationInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._I15
        public NakedStaticMethod<PackageInfo> generatePackageInfo() {
            return this.__generatePackageInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._I15
        public NakedStaticMethod<ProviderInfo> generateProviderInfo() {
            return this.__generateProviderInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._I15
        public NakedStaticMethod<ServiceInfo> generateServiceInfo() {
            return this.__generateServiceInfo.get();
        }
    }

    @W6.l
    public static final class Impl__K20 implements PackageParserCAGI._K20 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.d2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165716a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Object>> __parsePackage = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.e2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165720a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "parsePackage", (Class<?>[]) new Class[]{File.class, String.class, DisplayMetrics.class, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._K20
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._K20
        public NakedMethod<Object> parsePackage() {
            return this.__parsePackage.get();
        }
    }

    @W6.l
    public static final class Impl__M23 implements PackageParserCAGI._M23 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        private InitOnce<NakedMethod<Void>> __collectCertificates = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.f2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165724a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "collectCertificates", new String[]{"android.content.pm.PackageParser$Package", "int"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._M23
        public NakedMethod<Void> collectCertificates() {
            return this.__collectCertificates.get();
        }
    }

    @W6.l
    public static final class Impl__O27 implements PackageParserCAGI._O27 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser");
        public Impl_Package Package = new Impl_Package();

        @W6.l
        public static final class Impl_Package implements PackageParserCAGI._O27.Package {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageParser$Package");
            private InitOnce<NakedObject<Signature[]>> __mSignatures = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.g2
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165728a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mSignatures");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAGI._O27.Package
            public NakedObject<Signature[]> mSignatures() {
                return this.__mSignatures.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
