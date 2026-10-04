package com.prism.gaia.naked.metadata.com.android.internal.content;

import W6.c;
import W6.l;
import android.content.Intent;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.com.android.internal.content.ReferrerIntentCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ReferrerIntentCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165983G = new Impl_G();

    @l
    public static final class Impl_G implements ReferrerIntentCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.content.ReferrerIntent");
        private InitOnce<NakedConstructor<Intent>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: t9.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f239218a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __mReferrer = new InitOnce<>(new InitOnce.Init() { // from class: t9.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f239219a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Intent.class, String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mReferrer");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.content.ReferrerIntentCAGI.G
        public NakedConstructor<Intent> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.content.ReferrerIntentCAGI.G
        public NakedObject<String> mReferrer() {
            return this.__mReferrer.get();
        }
    }
}
