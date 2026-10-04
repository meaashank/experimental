package com.prism.gaia.naked.metadata.android.app.servertransaction;

import W6.c;
import W6.l;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class LaunchActivityItemCAG {
    public static Impl_P28 P28 = new Impl_P28();

    @l
    public static final class Impl_P28 implements LaunchActivityItemCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.servertransaction.LaunchActivityItem");
        private InitOnce<NakedObject<Intent>> __mIntent = new InitOnce<>(new InitOnce.Init() { // from class: L8.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58691a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __mIdent = new InitOnce<>(new InitOnce.Init() { // from class: L8.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58698a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<ActivityInfo>> __mInfo = new InitOnce<>(new InitOnce.Init() { // from class: L8.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58699a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<Configuration>> __mOverrideConfig = new InitOnce<>(new InitOnce.Init() { // from class: L8.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58700a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<Object>> __mCompatInfo = new InitOnce<>(new InitOnce.Init() { // from class: L8.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58701a.lambda$new$4();
            }
        });
        private InitOnce<NakedObject<String>> __mReferrer = new InitOnce<>(new InitOnce.Init() { // from class: L8.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58702a.lambda$new$5();
            }
        });
        private InitOnce<NakedObject<Object>> __mVoiceInteractor = new InitOnce<>(new InitOnce.Init() { // from class: L8.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58703a.lambda$new$6();
            }
        });
        private InitOnce<NakedObject<Bundle>> __mState = new InitOnce<>(new InitOnce.Init() { // from class: L8.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58692a.lambda$new$7();
            }
        });
        private InitOnce<NakedObject<PersistableBundle>> __mPersistentState = new InitOnce<>(new InitOnce.Init() { // from class: L8.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58693a.lambda$new$8();
            }
        });
        private InitOnce<NakedObject<List<Object>>> __mPendingResults = new InitOnce<>(new InitOnce.Init() { // from class: L8.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58694a.lambda$new$9();
            }
        });
        private InitOnce<NakedObject<List<Object>>> __mPendingNewIntents = new InitOnce<>(new InitOnce.Init() { // from class: L8.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58695a.lambda$new$10();
            }
        });
        private InitOnce<NakedBoolean> __mIsForward = new InitOnce<>(new InitOnce.Init() { // from class: L8.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58696a.lambda$new$11();
            }
        });
        private InitOnce<NakedObject<Object>> __mProfilerInfo = new InitOnce<>(new InitOnce.Init() { // from class: L8.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f58697a.lambda$new$12();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mIntent");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mIdent");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$10() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPendingNewIntents");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$11() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mIsForward");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$12() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mProfilerInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mOverrideConfig");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCompatInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$5() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mReferrer");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$6() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mVoiceInteractor");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$7() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mState");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$8() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPersistentState");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$9() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPendingResults");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<Object> mCompatInfo() {
            return this.__mCompatInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedInt mIdent() {
            return this.__mIdent.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<ActivityInfo> mInfo() {
            return this.__mInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<Intent> mIntent() {
            return this.__mIntent.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedBoolean mIsForward() {
            return this.__mIsForward.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<Configuration> mOverrideConfig() {
            return this.__mOverrideConfig.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<List<Object>> mPendingNewIntents() {
            return this.__mPendingNewIntents.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<List<Object>> mPendingResults() {
            return this.__mPendingResults.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<PersistableBundle> mPersistentState() {
            return this.__mPersistentState.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<Object> mProfilerInfo() {
            return this.__mProfilerInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<String> mReferrer() {
            return this.__mReferrer.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<Bundle> mState() {
            return this.__mState.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.servertransaction.LaunchActivityItemCAGI.P28
        public NakedObject<Object> mVoiceInteractor() {
            return this.__mVoiceInteractor.get();
        }
    }
}
