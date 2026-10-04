package com.prism.gaia.naked.metadata.java.lang;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.java.lang.RuntimeCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class RuntimeCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166015G = new Impl_G();

    @l
    public static final class Impl_G implements RuntimeCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Runtime.class);
        private InitOnce<NakedMethod<Void>> __load0 = new InitOnce<>(new InitOnce.Init() { // from class: B9.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17447a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<String>> __nativeLoad = new InitOnce<>(new InitOnce.Init() { // from class: B9.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f17448a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "load0", (Class<?>[]) new Class[]{Class.class, String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "nativeLoad", (Class<?>[]) new Class[]{String.class, ClassLoader.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.RuntimeCAGI.G
        public NakedMethod<Void> load0() {
            return this.__load0.get();
        }

        @Override // com.prism.gaia.naked.metadata.java.lang.RuntimeCAGI.G
        public NakedStaticMethod<String> nativeLoad() {
            return this.__nativeLoad.get();
        }
    }
}
