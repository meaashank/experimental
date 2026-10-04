package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.SyncRequest;
import android.os.Bundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(19)
public final class SyncRequestCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165605G = new Impl_G();

    @l
    public static final class Impl_G implements SyncRequestCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) SyncRequest.class);
        private InitOnce<NakedObject<Account>> __mAccountToSync = new InitOnce<>(new InitOnce.Init() { // from class: N8.z0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64833a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __mAuthority = new InitOnce<>(new InitOnce.Init() { // from class: N8.A0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64753a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<Bundle>> __mExtras = new InitOnce<>(new InitOnce.Init() { // from class: N8.B0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64755a.lambda$new$2();
            }
        });
        private InitOnce<NakedBoolean> __mIsPeriodic = new InitOnce<>(new InitOnce.Init() { // from class: N8.C0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64757a.lambda$new$3();
            }
        });
        private InitOnce<NakedBoolean> __mIsAuthority = new InitOnce<>(new InitOnce.Init() { // from class: N8.D0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64759a.lambda$new$4();
            }
        });
        private InitOnce<NakedLong> __mSyncFlexTimeSecs = new InitOnce<>(new InitOnce.Init() { // from class: N8.E0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64761a.lambda$new$5();
            }
        });
        private InitOnce<NakedLong> __mSyncRunTimeSecs = new InitOnce<>(new InitOnce.Init() { // from class: N8.F0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64763a.lambda$new$6();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mAccountToSync");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mAuthority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mExtras");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$3() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mIsPeriodic");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mIsAuthority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedLong lambda$new$5() throws Exception {
            return new NakedLong((Class<?>) ORG_CLASS(), "mSyncFlexTimeSecs");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedLong lambda$new$6() throws Exception {
            return new NakedLong((Class<?>) ORG_CLASS(), "mSyncRunTimeSecs");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedObject<Account> mAccountToSync() {
            return this.__mAccountToSync.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedObject<String> mAuthority() {
            return this.__mAuthority.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedObject<Bundle> mExtras() {
            return this.__mExtras.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedBoolean mIsAuthority() {
            return this.__mIsAuthority.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedBoolean mIsPeriodic() {
            return this.__mIsPeriodic.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedLong mSyncFlexTimeSecs() {
            return this.__mSyncFlexTimeSecs.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncRequestCAGI.G
        public NakedLong mSyncRunTimeSecs() {
            return this.__mSyncRunTimeSecs.get();
        }
    }
}
