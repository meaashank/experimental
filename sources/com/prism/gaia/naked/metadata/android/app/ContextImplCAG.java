package com.prism.gaia.naked.metadata.android.app;

import android.content.AttributionSource;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.ContextImplCAGI;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ContextImplCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165289G = new Impl_G();
    public static Impl_S31 S31 = new Impl_S31();
    public static Impl_N25 N25 = new Impl_N25();
    public static Impl_L21 L21 = new Impl_L21();
    public static Impl_K19 K19 = new Impl_K19();

    @W6.l
    public static final class Impl_G implements ContextImplCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContextImpl");
        private InitOnce<NakedObject<String>> __mBasePackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.X1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165403a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Object>> __mPackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Y1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165407a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<PackageManager>> __mPackageManager = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Z1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165411a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<Context>> __mOuterContext = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.a2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165416a.lambda$new$3();
            }
        });
        private InitOnce<NakedMethod<Context>> __getReceiverRestrictedContext = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.b2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165424a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mBasePackageName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPackageInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPackageManager");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mOuterContext");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getReceiverRestrictedContext");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.G
        public NakedMethod<Context> getReceiverRestrictedContext() {
            return this.__getReceiverRestrictedContext.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.G
        public NakedObject<String> mBasePackageName() {
            return this.__mBasePackageName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.G
        public NakedObject<Context> mOuterContext() {
            return this.__mOuterContext.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.G
        public NakedObject<Object> mPackageInfo() {
            return this.__mPackageInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.G
        public NakedObject<PackageManager> mPackageManager() {
            return this.__mPackageManager.get();
        }
    }

    @W6.l
    public static final class Impl_K19 implements ContextImplCAGI.K19 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContextImpl");
        private InitOnce<NakedObject<String>> __mOpPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.c2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165430a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<File>> __mDatabasesDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.d2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165435a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<File>> __mPreferencesDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.e2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165440a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<File>> __mFilesDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.f2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165445a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<File>> __mCacheDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.g2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165450a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mOpPackageName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mDatabasesDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPreferencesDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mFilesDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCacheDir");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.K19
        public NakedObject<File> mCacheDir() {
            return this.__mCacheDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.K19
        public NakedObject<File> mDatabasesDir() {
            return this.__mDatabasesDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.K19
        public NakedObject<File> mFilesDir() {
            return this.__mFilesDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.K19
        public NakedObject<String> mOpPackageName() {
            return this.__mOpPackageName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.K19
        public NakedObject<File> mPreferencesDir() {
            return this.__mPreferencesDir.get();
        }
    }

    @W6.l
    public static final class Impl_L21 implements ContextImplCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContextImpl");
        private InitOnce<NakedObject<UserHandle>> __mUser = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.h2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165455a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<File>> __mNoBackupFilesDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.i2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165460a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<File>> __mCodeCacheDir = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.j2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165465a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mUser");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mNoBackupFilesDir");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCodeCacheDir");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.L21
        public NakedObject<File> mCodeCacheDir() {
            return this.__mCodeCacheDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.L21
        public NakedObject<File> mNoBackupFilesDir() {
            return this.__mNoBackupFilesDir.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.L21
        public NakedObject<UserHandle> mUser() {
            return this.__mUser.get();
        }
    }

    @W6.l
    public static final class Impl_N25 implements ContextImplCAGI.N25 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContextImpl");
        private InitOnce<NakedObject<Object[]>> __mServiceCache = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.k2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165500a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mServiceCache");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.N25
        public NakedObject<Object[]> mServiceCache() {
            return this.__mServiceCache.get();
        }
    }

    @W6.l
    public static final class Impl_S31 implements ContextImplCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ContextImpl");
        private InitOnce<NakedObject<AttributionSource>> __mAttributionSource = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.l2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165505a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mAttributionSource");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ContextImplCAGI.S31
        public NakedObject<AttributionSource> mAttributionSource() {
            return this.__mAttributionSource.get();
        }
    }
}
