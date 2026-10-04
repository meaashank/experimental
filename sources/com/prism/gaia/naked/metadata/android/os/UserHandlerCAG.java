package com.prism.gaia.naked.metadata.android.os;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticBoolean;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.metadata.android.os.UserHandlerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class UserHandlerCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165895C = new Impl_C();

    @W6.m
    public static final class Impl_C implements UserHandlerCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.os.UserHandle");
        private InitOnceTry<NakedStaticInt> __PER_USER_RANGE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.b0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165904a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedStaticBoolean> __MU_ENABLED = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.c0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165906a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "PER_USER_RANGE");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticBoolean lambda$new$1() throws Exception {
            return new NakedStaticBoolean((Class<?>) ORG_CLASS(), "MU_ENABLED");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.UserHandlerCAGI.C
        public NakedStaticBoolean MU_ENABLED() {
            return this.__MU_ENABLED.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.UserHandlerCAGI.C
        public NakedStaticInt PER_USER_RANGE() {
            return this.__PER_USER_RANGE.get();
        }
    }
}
