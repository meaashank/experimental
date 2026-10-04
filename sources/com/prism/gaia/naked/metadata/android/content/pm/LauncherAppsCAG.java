package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.UserManager;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.pm.LauncherAppsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class LauncherAppsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165653G = new Impl_G();

    @W6.l
    public static final class Impl_G implements LauncherAppsCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.LauncherApps");
        private InitOnce<NakedObject<PackageManager>> __mPm = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.N
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165657a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<IInterface>> __mService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.O
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165660a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<UserManager>> __mUserManager = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.P
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165663a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPm");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mUserManager");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.LauncherAppsCAGI.G
        public NakedObject<PackageManager> mPm() {
            return this.__mPm.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.LauncherAppsCAGI.G
        public NakedObject<IInterface> mService() {
            return this.__mService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.LauncherAppsCAGI.G
        public NakedObject<UserManager> mUserManager() {
            return this.__mUserManager.get();
        }
    }
}
