package com.prism.gaia.naked.metadata.android.security.net.config;

import W6.l;
import android.content.pm.ApplicationInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.security.net.config.ManifestConfigSourceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ManifestConfigSourceCAG {
    public static Impl_N24_N25 N24_N25 = new Impl_N24_N25();
    public static Impl_O26_O27 O26_O27 = new Impl_O26_O27();
    public static Impl_P28 P28 = new Impl_P28();

    @l
    public static final class Impl_N24_N25 implements ManifestConfigSourceCAGI.N24_N25 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ManifestConfigSource");
        public Impl_DefaultConfigSource DefaultConfigSource = new Impl_DefaultConfigSource();

        @l
        public static final class Impl_DefaultConfigSource implements ManifestConfigSourceCAGI.N24_N25.DefaultConfigSource {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ManifestConfigSource$DefaultConfigSource");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.i
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165948a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Boolean.TYPE, Integer.TYPE});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.security.net.config.ManifestConfigSourceCAGI.N24_N25.DefaultConfigSource
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl_O26_O27 implements ManifestConfigSourceCAGI.O26_O27 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ManifestConfigSource");
        public Impl_DefaultConfigSource DefaultConfigSource = new Impl_DefaultConfigSource();

        @l
        public static final class Impl_DefaultConfigSource implements ManifestConfigSourceCAGI.O26_O27.DefaultConfigSource {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ManifestConfigSource$DefaultConfigSource");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.j
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165949a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                Class clsORG_CLASS = ORG_CLASS();
                Class cls = Integer.TYPE;
                return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{Boolean.TYPE, cls, cls});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.security.net.config.ManifestConfigSourceCAGI.O26_O27.DefaultConfigSource
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl_P28 implements ManifestConfigSourceCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ManifestConfigSource");
        public Impl_DefaultConfigSource DefaultConfigSource = new Impl_DefaultConfigSource();

        @l
        public static final class Impl_DefaultConfigSource implements ManifestConfigSourceCAGI.P28.DefaultConfigSource {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ManifestConfigSource$DefaultConfigSource");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.k
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165950a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Boolean.TYPE, ApplicationInfo.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.security.net.config.ManifestConfigSourceCAGI.P28.DefaultConfigSource
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
