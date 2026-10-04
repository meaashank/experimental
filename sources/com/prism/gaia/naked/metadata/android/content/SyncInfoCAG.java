package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.accounts.Account;
import android.content.SyncInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.SyncInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SyncInfoCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165604G = new Impl_G();

    @l
    public static final class Impl_G implements SyncInfoCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) SyncInfo.class);
        private InitOnce<NakedConstructor<SyncInfo>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: N8.w0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64827a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __authorityId = new InitOnce<>(new InitOnce.Init() { // from class: N8.x0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64829a.lambda$new$1();
            }
        });
        private InitOnce<NakedStaticObject<Account>> __REDACTED_ACCOUNT = new InitOnce<>(new InitOnce.Init() { // from class: N8.y0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64831a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Integer.TYPE, Account.class, String.class, Long.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "authorityId");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$2() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "REDACTED_ACCOUNT");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncInfoCAGI.G
        public NakedStaticObject<Account> REDACTED_ACCOUNT() {
            return this.__REDACTED_ACCOUNT.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncInfoCAGI.G
        public NakedInt authorityId() {
            return this.__authorityId.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncInfoCAGI.G
        public NakedConstructor<SyncInfo> ctor() {
            return this.__ctor.get();
        }
    }
}
