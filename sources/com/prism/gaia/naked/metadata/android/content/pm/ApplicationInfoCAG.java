package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ApplicationInfoCAG {
    public static Impl_L21 L21 = new Impl_L21();
    public static Impl_N24 N24 = new Impl_N24();
    public static Impl_N24_N25 N24_N25 = new Impl_N24_N25();
    public static Impl_O26 O26 = new Impl_O26();
    public static Impl__O27 _O27 = new Impl__O27();
    public static Impl_P28 P28 = new Impl_P28();
    public static Impl_Q29 Q29 = new Impl_Q29();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165610C = new Impl_C();

    @W6.m
    public static final class Impl_C implements ApplicationInfoCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) ApplicationInfo.class);
        private InitOnceTry<NakedObject<String[]>> __overlayPaths = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165701a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "overlayPaths");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.C
        public NakedObject<String[]> overlayPaths() {
            return this.__overlayPaths.get();
        }
    }

    @W6.l
    public static final class Impl_L21 implements ApplicationInfoCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedObject<String>> __primaryCpuAbi = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165705a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __secondaryCpuAbi = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165709a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<String>> __secondaryNativeLibraryDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165713a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<String>> __scanPublicSourceDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165717a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<String>> __scanSourceDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165721a.lambda$new$4();
            }
        });
        private InitOnce<NakedObject<String[]>> __splitPublicSourceDirs = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165725a.lambda$new$5();
            }
        });
        private InitOnce<NakedObject<String[]>> __splitSourceDirs = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165729a.lambda$new$6();
            }
        });
        private InitOnce<NakedObject<String[]>> __resourceDirs = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165733a.lambda$new$7();
            }
        });
        private InitOnce<NakedInt> __privateFlags = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165737a.lambda$new$8();
            }
        });
        private InitOnce<NakedInt> __enabledSetting = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165741a.lambda$new$9();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "primaryCpuAbi");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "secondaryCpuAbi");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "secondaryNativeLibraryDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "scanPublicSourceDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "scanSourceDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$5() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "splitPublicSourceDirs");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$6() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "splitSourceDirs");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$7() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "resourceDirs");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$8() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "privateFlags");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$9() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "enabledSetting");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedInt enabledSetting() {
            return this.__enabledSetting.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String> primaryCpuAbi() {
            return this.__primaryCpuAbi.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedInt privateFlags() {
            return this.__privateFlags.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String[]> resourceDirs() {
            return this.__resourceDirs.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String> scanPublicSourceDir() {
            return this.__scanPublicSourceDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String> scanSourceDir() {
            return this.__scanSourceDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String> secondaryCpuAbi() {
            return this.__secondaryCpuAbi.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String> secondaryNativeLibraryDir() {
            return this.__secondaryNativeLibraryDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String[]> splitPublicSourceDirs() {
            return this.__splitPublicSourceDirs.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.L21
        public NakedObject<String[]> splitSourceDirs() {
            return this.__splitSourceDirs.get();
        }
    }

    @W6.l
    public static final class Impl_N24 implements ApplicationInfoCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedObject<String>> __deviceProtectedDataDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165745a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __credentialProtectedDataDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165749a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __networkSecurityConfigRes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165753a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "deviceProtectedDataDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "credentialProtectedDataDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "networkSecurityConfigRes");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.N24
        public NakedObject<String> credentialProtectedDataDir() {
            return this.__credentialProtectedDataDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.N24
        public NakedObject<String> deviceProtectedDataDir() {
            return this.__deviceProtectedDataDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.N24
        public NakedInt networkSecurityConfigRes() {
            return this.__networkSecurityConfigRes.get();
        }
    }

    @W6.l
    public static final class Impl_N24_N25 implements ApplicationInfoCAGI.N24_N25 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedObject<String>> __deviceEncryptedDataDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165757a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __credentialEncryptedDataDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.p
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165761a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "deviceEncryptedDataDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "credentialEncryptedDataDir");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.N24_N25
        public NakedObject<String> credentialEncryptedDataDir() {
            return this.__credentialEncryptedDataDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.N24_N25
        public NakedObject<String> deviceEncryptedDataDir() {
            return this.__deviceEncryptedDataDir.get();
        }
    }

    @W6.l
    public static final class Impl_O26 implements ApplicationInfoCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedInt> __targetSandboxVersion = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.q
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165765a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String[]>> __splitNames = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.r
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165769a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$0() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "targetSandboxVersion");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "splitNames");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.O26
        public NakedObject<String[]> splitNames() {
            return this.__splitNames.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.O26
        public NakedInt targetSandboxVersion() {
            return this.__targetSandboxVersion.get();
        }
    }

    @W6.l
    public static final class Impl_P28 implements ApplicationInfoCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedLong> __longVersionCode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.s
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165773a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __setVersionCode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.t
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165777a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedLong lambda$new$0() throws Exception {
            return new NakedLong((Class<?>) ORG_CLASS(), "longVersionCode");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setVersionCode", (Class<?>[]) new Class[]{Long.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.P28
        public NakedLong longVersionCode() {
            return this.__longVersionCode.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.P28
        public NakedMethod<Void> setVersionCode() {
            return this.__setVersionCode.get();
        }
    }

    @W6.l
    public static final class Impl_Q29 implements ApplicationInfoCAGI.Q29 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedObject<List<SharedLibraryInfo>>> __sharedLibraryInfos = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.u
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165781a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "sharedLibraryInfos");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI.Q29
        public NakedObject<List<SharedLibraryInfo>> sharedLibraryInfos() {
            return this.__sharedLibraryInfos.get();
        }
    }

    @W6.l
    public static final class Impl__O27 implements ApplicationInfoCAGI._O27 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ApplicationInfo.class);
        private InitOnce<NakedInt> __versionCode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.v
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165785a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$0() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "versionCode");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAGI._O27
        public NakedInt versionCode() {
            return this.__versionCode.get();
        }
    }
}
