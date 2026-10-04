package com.prism.gaia.naked.metadata.android.accounts;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.accounts.AccountManagerResponseCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class AccountManagerResponseCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165234C = new Impl_C();

    @W6.m
    public static final class Impl_C implements AccountManagerResponseCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.accounts.AccountManagerResponse");
        private InitOnceTry<NakedConstructor<Object>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165240a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), new String[]{"android.accounts.IAccountManagerResponse"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.AccountManagerResponseCAGI.C
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
