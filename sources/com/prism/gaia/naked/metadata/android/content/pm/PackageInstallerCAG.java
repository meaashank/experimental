package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedFloat;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class PackageInstallerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165666G = new Impl_G();
    public static Impl__L22 _L22 = new Impl__L22();
    public static Impl_M23 M23 = new Impl_M23();

    public static final class Impl_G implements PackageInstallerCAGI.G {
        public Impl_SessionInfo SessionInfo = new Impl_SessionInfo();

        @W6.l
        public static final class Impl_SessionInfo implements PackageInstallerCAGI.G.SessionInfo {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageInstaller$SessionInfo");
            private InitOnce<NakedBoolean> __active = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165670a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Bitmap>> __appIcon = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.W
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165689a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<CharSequence>> __appLabel = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.X
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165692a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<String>> __appPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Y
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165695a.lambda$new$3();
                }
            });
            private InitOnce<NakedConstructor<PackageInstaller.SessionInfo>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.Z
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165698a.lambda$new$4();
                }
            });
            private InitOnce<NakedObject<String>> __installerPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.a0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165702a.lambda$new$5();
                }
            });
            private InitOnce<NakedInt> __mode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.b0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165706a.lambda$new$6();
                }
            });
            private InitOnce<NakedFloat> __progress = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.c0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165710a.lambda$new$7();
                }
            });
            private InitOnce<NakedObject<String>> __resolvedBaseCodePath = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.S
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165675a.lambda$new$8();
                }
            });
            private InitOnce<NakedBoolean> __sealed = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.T
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165679a.lambda$new$9();
                }
            });
            private InitOnce<NakedInt> __sessionId = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.U
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165682a.lambda$new$10();
                }
            });
            private InitOnce<NakedLong> __sizeBytes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.V
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165686a.lambda$new$11();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appIcon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$10() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "sessionId");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedLong lambda$new$11() throws Exception {
                return new NakedLong((Class<?>) ORG_CLASS(), "sizeBytes");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appLabel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appPackageName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$4() throws Exception {
                return new NakedConstructor(ORG_CLASS());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$5() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "installerPackageName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$6() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedFloat lambda$new$7() throws Exception {
                return new NakedFloat((Class<?>) ORG_CLASS(), "progress");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$8() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "resolvedBaseCodePath");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$9() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "sealed");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedBoolean active() {
                return this.__active.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedObject<Bitmap> appIcon() {
                return this.__appIcon.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedObject<CharSequence> appLabel() {
                return this.__appLabel.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedObject<String> appPackageName() {
                return this.__appPackageName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedConstructor<PackageInstaller.SessionInfo> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedObject<String> installerPackageName() {
                return this.__installerPackageName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedInt mode() {
                return this.__mode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedFloat progress() {
                return this.__progress.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedObject<String> resolvedBaseCodePath() {
                return this.__resolvedBaseCodePath.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedBoolean sealed() {
                return this.__sealed.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedInt sessionId() {
                return this.__sessionId.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.G.SessionInfo
            public NakedLong sizeBytes() {
                return this.__sizeBytes.get();
            }
        }
    }

    public static final class Impl_M23 implements PackageInstallerCAGI.M23 {
        public Impl_SessionParams SessionParams = new Impl_SessionParams();

        @W6.l
        public static final class Impl_SessionParams implements PackageInstallerCAGI.M23.SessionParams {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageInstaller$SessionParams");
            private InitOnce<NakedObject<String>> __abiOverride = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.d0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165714a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Bitmap>> __appIcon = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.k0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165742a.lambda$new$1();
                }
            });
            private InitOnce<NakedLong> __appIconLastModified = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.l0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165746a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<String>> __appLabel = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.m0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165750a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<String>> __appPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.n0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165754a.lambda$new$4();
                }
            });
            private InitOnce<NakedObject<String[]>> __grantedRuntimePermissions = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.o0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165758a.lambda$new$5();
                }
            });
            private InitOnce<NakedInt> __installFlags = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.p0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165762a.lambda$new$6();
                }
            });
            private InitOnce<NakedInt> __installLocation = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.e0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165718a.lambda$new$7();
                }
            });
            private InitOnce<NakedInt> __mode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.f0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165722a.lambda$new$8();
                }
            });
            private InitOnce<NakedObject<Uri>> __originatingUri = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.g0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165726a.lambda$new$9();
                }
            });
            private InitOnce<NakedObject<Uri>> __referrerUri = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.h0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165730a.lambda$new$10();
                }
            });
            private InitOnce<NakedLong> __sizeBytes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.i0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165734a.lambda$new$11();
                }
            });
            private InitOnce<NakedObject<String>> __volumeUuid = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.j0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165738a.lambda$new$12();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "abiOverride");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appIcon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$10() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "referrerUri");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedLong lambda$new$11() throws Exception {
                return new NakedLong((Class<?>) ORG_CLASS(), "sizeBytes");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$12() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "volumeUuid");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedLong lambda$new$2() throws Exception {
                return new NakedLong((Class<?>) ORG_CLASS(), "appIconLastModified");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appLabel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appPackageName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$5() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "grantedRuntimePermissions");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$6() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "installFlags");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$7() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "installLocation");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$8() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$9() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "originatingUri");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<String> abiOverride() {
                return this.__abiOverride.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<Bitmap> appIcon() {
                return this.__appIcon.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedLong appIconLastModified() {
                return this.__appIconLastModified.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<String> appLabel() {
                return this.__appLabel.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<String> appPackageName() {
                return this.__appPackageName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<String[]> grantedRuntimePermissions() {
                return this.__grantedRuntimePermissions.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedInt installFlags() {
                return this.__installFlags.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedInt installLocation() {
                return this.__installLocation.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedInt mode() {
                return this.__mode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<Uri> originatingUri() {
                return this.__originatingUri.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<Uri> referrerUri() {
                return this.__referrerUri.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedLong sizeBytes() {
                return this.__sizeBytes.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI.M23.SessionParams
            public NakedObject<String> volumeUuid() {
                return this.__volumeUuid.get();
            }
        }
    }

    public static final class Impl__L22 implements PackageInstallerCAGI._L22 {
        public Impl_SessionParams SessionParams = new Impl_SessionParams();

        @W6.l
        public static final class Impl_SessionParams implements PackageInstallerCAGI._L22.SessionParams {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageInstaller$SessionParams");
            private InitOnce<NakedObject<String>> __abiOverride = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.q0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165766a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Bitmap>> __appIcon = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.t0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165778a.lambda$new$1();
                }
            });
            private InitOnce<NakedLong> __appIconLastModified = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.u0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165782a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<String>> __appLabel = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.v0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165786a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<String>> __appPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.w0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165790a.lambda$new$4();
                }
            });
            private InitOnce<NakedInt> __installFlags = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.x0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165794a.lambda$new$5();
                }
            });
            private InitOnce<NakedInt> __installLocation = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.y0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165798a.lambda$new$6();
                }
            });
            private InitOnce<NakedInt> __mode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.z0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165802a.lambda$new$7();
                }
            });
            private InitOnce<NakedObject<Uri>> __originatingUri = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.A0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165607a.lambda$new$8();
                }
            });
            private InitOnce<NakedObject<Uri>> __referrerUri = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.r0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165770a.lambda$new$9();
                }
            });
            private InitOnce<NakedLong> __sizeBytes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.s0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165774a.lambda$new$10();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "abiOverride");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appIcon");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedLong lambda$new$10() throws Exception {
                return new NakedLong((Class<?>) ORG_CLASS(), "sizeBytes");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedLong lambda$new$2() throws Exception {
                return new NakedLong((Class<?>) ORG_CLASS(), "appIconLastModified");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appLabel");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appPackageName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$5() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "installFlags");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$6() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "installLocation");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$7() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$8() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "originatingUri");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$9() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "referrerUri");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedObject<String> abiOverride() {
                return this.__abiOverride.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedObject<Bitmap> appIcon() {
                return this.__appIcon.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedLong appIconLastModified() {
                return this.__appIconLastModified.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedObject<String> appLabel() {
                return this.__appLabel.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedObject<String> appPackageName() {
                return this.__appPackageName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedInt installFlags() {
                return this.__installFlags.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedInt installLocation() {
                return this.__installLocation.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedInt mode() {
                return this.__mode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedObject<Uri> originatingUri() {
                return this.__originatingUri.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedObject<Uri> referrerUri() {
                return this.__referrerUri.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAGI._L22.SessionParams
            public NakedLong sizeBytes() {
                return this.__sizeBytes.get();
            }
        }
    }
}
