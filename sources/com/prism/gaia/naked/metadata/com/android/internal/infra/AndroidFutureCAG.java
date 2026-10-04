package com.prism.gaia.naked.metadata.com.android.internal.infra;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.internal.infra.AndroidFutureCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AndroidFutureCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165984G = new Impl_G();

    @l
    public static final class Impl_G implements AndroidFutureCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.infra.AndroidFuture");
        private InitOnce<NakedStaticMethod<Object>> __completedFuture = new InitOnce<>(new InitOnce.Init() { // from class: u9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f239647a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "completedFuture");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.infra.AndroidFutureCAGI.G
        public NakedStaticMethod<Object> completedFuture() {
            return this.__completedFuture.get();
        }
    }
}
