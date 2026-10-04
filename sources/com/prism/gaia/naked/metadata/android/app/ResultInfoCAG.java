package com.prism.gaia.naked.metadata.android.app;

import android.content.Intent;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.ResultInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ResultInfoCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165378C = new Impl_C();

    @W6.m
    public static final class Impl_C implements ResultInfoCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ResultInfo");
        private InitOnceTry<NakedObject<String>> __mResultWho = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.E3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165300a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedInt> __mRequestCode = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.F3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165305a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedInt> __mResultCode = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.G3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165310a.lambda$new$2();
            }
        });
        private InitOnceTry<NakedObject<Intent>> __mData = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.H3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165315a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mResultWho");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mRequestCode");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mResultCode");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mData");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ResultInfoCAGI.C
        public NakedObject<Intent> mData() {
            return this.__mData.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ResultInfoCAGI.C
        public NakedInt mRequestCode() {
            return this.__mRequestCode.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ResultInfoCAGI.C
        public NakedInt mResultCode() {
            return this.__mResultCode.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ResultInfoCAGI.C
        public NakedObject<String> mResultWho() {
            return this.__mResultWho.get();
        }
    }
}
