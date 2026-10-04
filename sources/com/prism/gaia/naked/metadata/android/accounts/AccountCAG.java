package com.prism.gaia.naked.metadata.android.accounts;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.accounts.AccountCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class AccountCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165233C = new Impl_C();

    @W6.m
    public static final class Impl_C implements AccountCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.accounts.Account");
        private InitOnceTry<NakedObject<String>> __accessId = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165239a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "accessId");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.AccountCAGI.C
        public NakedObject<String> accessId() {
            return this.__accessId.get();
        }
    }
}
