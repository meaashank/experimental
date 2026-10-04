package com.prism.gaia.naked.metadata.com.android.server;

import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SystemConfigCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165999G = new Impl_G();
    public static Impl__P28 _P28 = new Impl__P28();
    public static Impl_Q29 Q29 = new Impl_Q29();

    @m
    public static final class Impl_G implements SystemConfigCAGI.G {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.server.SystemConfig");
        private InitOnceTry<NakedStaticMethod<Object>> __getInstance = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.com.android.server.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f166000a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getInstance");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI.G
        public NakedStaticMethod<Object> getInstance() {
            return this.__getInstance.get();
        }
    }

    @m
    public static final class Impl_Q29 implements SystemConfigCAGI.Q29 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.server.SystemConfig");
        private InitOnceTry<NakedMethod<Map<String, Object>>> __getSharedLibraries = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.com.android.server.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f166001a.lambda$new$0();
            }
        });
        public Impl_SharedLibraryEntry SharedLibraryEntry = new Impl_SharedLibraryEntry();

        @m
        public static final class Impl_SharedLibraryEntry implements SystemConfigCAGI.Q29.SharedLibraryEntry {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.server.SystemConfig$SharedLibraryEntry");
            private InitOnceTry<NakedObject<String>> __name = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.com.android.server.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f166002a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedObject<String>> __filename = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.com.android.server.d
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f166003a.lambda$new$1();
                }
            });
            private InitOnceTry<NakedObject<String[]>> __dependencies = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.com.android.server.e
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f166004a.lambda$new$2();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "name");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "filename");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "dependencies");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI.Q29.SharedLibraryEntry
            public NakedObject<String[]> dependencies() {
                return this.__dependencies.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI.Q29.SharedLibraryEntry
            public NakedObject<String> filename() {
                return this.__filename.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI.Q29.SharedLibraryEntry
            public NakedObject<String> name() {
                return this.__name.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getSharedLibraries");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI.Q29
        public NakedMethod<Map<String, Object>> getSharedLibraries() {
            return this.__getSharedLibraries.get();
        }
    }

    @m
    public static final class Impl__P28 implements SystemConfigCAGI._P28 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.server.SystemConfig");
        private InitOnceTry<NakedMethod<Map<String, String>>> __getSharedLibraries = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.com.android.server.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f166005a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getSharedLibraries");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAGI._P28
        public NakedMethod<Map<String, String>> getSharedLibraries() {
            return this.__getSharedLibraries.get();
        }
    }
}
