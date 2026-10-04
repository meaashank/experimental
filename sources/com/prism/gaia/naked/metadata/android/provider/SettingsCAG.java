package com.prism.gaia.naked.metadata.android.provider;

import W6.c;
import W6.l;
import android.os.IInterface;
import android.provider.Settings;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.provider.SettingsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SettingsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165935G = new Impl_G();
    public static Impl_J17 J17 = new Impl_J17();
    public static Impl__O26 _O26 = new Impl__O26();
    public static Impl_O26 O26 = new Impl_O26();
    public static Impl_Q29 Q29 = new Impl_Q29();

    @l
    public static final class Impl_G implements SettingsCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.class);
        public Impl_Secure Secure = new Impl_Secure();
        public Impl_System System = new Impl_System();

        @l
        public static final class Impl_Secure implements SettingsCAGI.G.Secure {
            private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.Secure.class);
            private InitOnce<NakedStaticObject<Object>> __sNameValueCache = new InitOnce<>(new InitOnce.Init() { // from class: c9.a
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131287a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "sNameValueCache");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI.G.Secure
            public NakedStaticObject<Object> sNameValueCache() {
                return this.__sNameValueCache.get();
            }
        }

        @l
        public static final class Impl_System implements SettingsCAGI.G.System {
            private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.System.class);
            private InitOnce<NakedStaticObject<Object>> __sNameValueCache = new InitOnce<>(new InitOnce.Init() { // from class: c9.b
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131288a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "sNameValueCache");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI.G.System
            public NakedStaticObject<Object> sNameValueCache() {
                return this.__sNameValueCache.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl_J17 implements SettingsCAGI.J17 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.class);
        public Impl_Global Global = new Impl_Global();

        @l
        public static final class Impl_Global implements SettingsCAGI.J17.Global {
            private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.Global.class);
            private InitOnce<NakedStaticObject<Object>> __sNameValueCache = new InitOnce<>(new InitOnce.Init() { // from class: c9.c
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131289a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "sNameValueCache");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI.J17.Global
            public NakedStaticObject<Object> sNameValueCache() {
                return this.__sNameValueCache.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl_O26 implements SettingsCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.class);
        public Impl_NameValueCache NameValueCache = new Impl_NameValueCache();
        public Impl_ContentProviderHolder ContentProviderHolder = new Impl_ContentProviderHolder();

        @l
        public static final class Impl_ContentProviderHolder implements SettingsCAGI.O26.ContentProviderHolder {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.provider.Settings$ContentProviderHolder");
            private InitOnce<NakedObject<IInterface>> __mContentProvider = new InitOnce<>(new InitOnce.Init() { // from class: c9.d
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131290a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mContentProvider");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI.O26.ContentProviderHolder
            public NakedObject<IInterface> mContentProvider() {
                return this.__mContentProvider.get();
            }
        }

        @l
        public static final class Impl_NameValueCache implements SettingsCAGI.O26.NameValueCache {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.provider.Settings$NameValueCache");
            private InitOnce<NakedObject<Object>> __mProviderHolder = new InitOnce<>(new InitOnce.Init() { // from class: c9.e
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131291a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mProviderHolder");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI.O26.NameValueCache
            public NakedObject<Object> mProviderHolder() {
                return this.__mProviderHolder.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl_Q29 implements SettingsCAGI.Q29 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.class);
        public Impl_Config Config = new Impl_Config();

        @l
        public static final class Impl_Config implements SettingsCAGI.Q29.Config {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.provider.Settings$Config");
            private InitOnce<NakedStaticObject<Object>> __sNameValueCache = new InitOnce<>(new InitOnce.Init() { // from class: c9.f
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131292a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
                return new NakedStaticObject((Class<?>) ORG_CLASS(), "sNameValueCache");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI.Q29.Config
            public NakedStaticObject<Object> sNameValueCache() {
                return this.__sNameValueCache.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    @l
    public static final class Impl__O26 implements SettingsCAGI._O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Settings.class);
        public Impl_NameValueCache NameValueCache = new Impl_NameValueCache();

        @l
        public static final class Impl_NameValueCache implements SettingsCAGI._O26.NameValueCache {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.provider.Settings$NameValueCache");
            private InitOnce<NakedObject<Object>> __mContentProvider = new InitOnce<>(new InitOnce.Init() { // from class: c9.g
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f131293a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mContentProvider");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.provider.SettingsCAGI._O26.NameValueCache
            public NakedObject<Object> mContentProvider() {
                return this.__mContentProvider.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
