package com.prism.gaia.naked.metadata.android.security.net.config;

import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ApplicationConfigCAG {
    public static Impl_N24 N24 = new Impl_N24();

    @l
    public static final class Impl_N24 implements ApplicationConfigCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ApplicationConfig");
        private InitOnce<NakedBoolean> __mInitialized = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165940a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Object>> __mConfigSource = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165941a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __ensureInitialized = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165942a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Boolean>> __isCleartextTrafficPermitted = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165943a.lambda$new$3();
            }
        });
        private InitOnce<NakedStaticMethod<Object>> __getDefaultInstance = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165944a.lambda$new$4();
            }
        });
        private InitOnce<NakedStaticMethod<Void>> __setDefaultInstance = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165945a.lambda$new$5();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mInitialized");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mConfigSource");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "ensureInitialized");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "isCleartextTrafficPermitted");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$4() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getDefaultInstance");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$5() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setDefaultInstance", new String[]{"android.security.net.config.ApplicationConfig"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI.N24
        public NakedMethod<Void> ensureInitialized() {
            return this.__ensureInitialized.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI.N24
        public NakedStaticMethod<Object> getDefaultInstance() {
            return this.__getDefaultInstance.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI.N24
        public NakedMethod<Boolean> isCleartextTrafficPermitted() {
            return this.__isCleartextTrafficPermitted.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI.N24
        public NakedObject<Object> mConfigSource() {
            return this.__mConfigSource.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI.N24
        public NakedBoolean mInitialized() {
            return this.__mInitialized.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAGI.N24
        public NakedStaticMethod<Void> setDefaultInstance() {
            return this.__setDefaultInstance.get();
        }
    }
}
