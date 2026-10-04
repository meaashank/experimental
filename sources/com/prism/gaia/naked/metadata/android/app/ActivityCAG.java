package com.prism.gaia.naked.metadata.android.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.ActivityCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165269G = new Impl_G();

    @W6.l
    public static final class Impl_G implements ActivityCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.Activity");
        private InitOnce<NakedObject<ActivityInfo>> __mActivityInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165413a.lambda$new$0();
            }
        });
        private InitOnce<NakedBoolean> __mFinished = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165421a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<Activity>> __mParent = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165427a.lambda$new$2();
            }
        });
        private InitOnce<NakedInt> __mResultCode = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165432a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<Intent>> __mResultData = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165437a.lambda$new$4();
            }
        });
        private InitOnce<NakedObject<IBinder>> __mToken = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165442a.lambda$new$5();
            }
        });
        private InitOnce<NakedObject<String>> __mEmbeddedID = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165447a.lambda$new$6();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActivityInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$1() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mFinished");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mParent");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$3() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mResultCode");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mResultData");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$5() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mToken");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$6() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mEmbeddedID");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedObject<ActivityInfo> mActivityInfo() {
            return this.__mActivityInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedObject<String> mEmbeddedID() {
            return this.__mEmbeddedID.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedBoolean mFinished() {
            return this.__mFinished.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedObject<Activity> mParent() {
            return this.__mParent.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedInt mResultCode() {
            return this.__mResultCode.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedObject<Intent> mResultData() {
            return this.__mResultData.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityCAGI.G
        public NakedObject<IBinder> mToken() {
            return this.__mToken.get();
        }
    }
}
