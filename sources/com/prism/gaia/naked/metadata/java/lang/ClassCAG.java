package com.prism.gaia.naked.metadata.java.lang;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.java.lang.ClassCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ClassCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166012G = new Impl_G();

    @l
    public static final class Impl_G implements ClassCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Class.class);
        private InitOnce<NakedObject<String>> __name = new InitOnce<>(new InitOnce.Init() { // from class: B9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17444a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "name");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ClassCAGI.G
        public NakedObject<String> name() {
            return this.__name.get();
        }
    }
}
