package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IPackageManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165642G = new Impl_G();
    public static Impl_T33 T33 = new Impl_T33();

    @W6.l
    public static final class Impl_G implements IPackageManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.IPackageManager");
        private InitOnce<NakedMethod<PackageInfo>> __getPackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.C
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165615a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<ApplicationInfo>> __getApplicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.D
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165619a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "getPackageInfo", (Class<?>[]) new Class[]{String.class, cls, cls});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "getApplicationInfo", (Class<?>[]) new Class[]{String.class, cls, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageManagerCAGI.G
        public NakedMethod<ApplicationInfo> getApplicationInfo() {
            return this.__getApplicationInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageManagerCAGI.G
        public NakedMethod<PackageInfo> getPackageInfo() {
            return this.__getPackageInfo.get();
        }
    }

    @W6.l
    public static final class Impl_T33 implements IPackageManagerCAGI.T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.IPackageManager");
        private InitOnce<NakedMethod<PackageInfo>> __getPackageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.E
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165623a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<ApplicationInfo>> __getApplicationInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.F
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165626a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPackageInfo", (Class<?>[]) new Class[]{String.class, Long.TYPE, Integer.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getApplicationInfo", (Class<?>[]) new Class[]{String.class, Long.TYPE, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageManagerCAGI.T33
        public NakedMethod<ApplicationInfo> getApplicationInfo() {
            return this.__getApplicationInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageManagerCAGI.T33
        public NakedMethod<PackageInfo> getPackageInfo() {
            return this.__getPackageInfo.get();
        }
    }
}
