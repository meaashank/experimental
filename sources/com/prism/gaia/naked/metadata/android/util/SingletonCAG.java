package com.prism.gaia.naked.metadata.android.util;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.util.SingletonCAGI;
import w7.i;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SingletonCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165960G = new Impl_G();

    @l
    public static final class Impl_G implements SingletonCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.util.Singleton");
        private InitOnce<NakedMethod<Object>> __get = new InitOnce<>(new InitOnce.Init() { // from class: k9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f217344a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Object>> __mInstance = new InitOnce<>(new InitOnce.Init() { // from class: k9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f217345a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), i.f240158w);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInstance");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.util.SingletonCAGI.G
        public NakedMethod<Object> get() {
            return this.__get.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.util.SingletonCAGI.G
        public NakedObject<Object> mInstance() {
            return this.__mInstance.get();
        }
    }
}
