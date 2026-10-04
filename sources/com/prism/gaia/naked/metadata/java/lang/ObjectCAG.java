package com.prism.gaia.naked.metadata.java.lang;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.java.lang.ObjectCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ObjectCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166013G = new Impl_G();

    @l
    public static final class Impl_G implements ObjectCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Object.class);
        private InitOnce<NakedObject<Class<?>>> __shadow$_klass_ = new InitOnce<>(new InitOnce.Init() { // from class: B9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17445a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "shadow$_klass_");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.ObjectCAGI.G
        public NakedObject<Class<?>> shadow$_klass_() {
            return this.__shadow$_klass_.get();
        }
    }
}
