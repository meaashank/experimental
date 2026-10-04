package com.prism.gaia.naked.metadata.dalvik.system;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI;
import dalvik.system.BaseDexClassLoader;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class BaseDexClassLoaderCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166007G = new Impl_G();
    public static Impl_Q29 Q29 = new Impl_Q29();
    public static Impl_O26 O26 = new Impl_O26();

    @l
    public static final class Impl_G implements BaseDexClassLoaderCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) BaseDexClassLoader.class);
        private InitOnce<NakedObject<Object>> __pathList = new InitOnce<>(new InitOnce.Init() { // from class: A9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7264a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Class<?>>> __findClass = new InitOnce<>(new InitOnce.Init() { // from class: A9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7265a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Enumeration<URL>>> __findResources = new InitOnce<>(new InitOnce.Init() { // from class: A9.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7266a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<String>> __findLibrary = new InitOnce<>(new InitOnce.Init() { // from class: A9.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7267a.lambda$new$3();
            }
        });
        private InitOnce<NakedMethod<URL>> __findResource = new InitOnce<>(new InitOnce.Init() { // from class: A9.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7268a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "pathList");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "findClass", (Class<?>[]) new Class[]{String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "findResources", (Class<?>[]) new Class[]{String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "findLibrary", (Class<?>[]) new Class[]{String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "findResource", (Class<?>[]) new Class[]{String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.G
        public NakedMethod<Class<?>> findClass() {
            return this.__findClass.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.G
        public NakedMethod<String> findLibrary() {
            return this.__findLibrary.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.G
        public NakedMethod<URL> findResource() {
            return this.__findResource.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.G
        public NakedMethod<Enumeration<URL>> findResources() {
            return this.__findResources.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.G
        public NakedObject<Object> pathList() {
            return this.__pathList.get();
        }
    }

    @l
    public static final class Impl_O26 implements BaseDexClassLoaderCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) BaseDexClassLoader.class);
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: A9.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7269a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{ByteBuffer[].class, ClassLoader.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.O26
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }

    @l
    public static final class Impl_Q29 implements BaseDexClassLoaderCAGI.Q29 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) BaseDexClassLoader.class);
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: A9.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7270a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{ByteBuffer[].class, String.class, ClassLoader.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.BaseDexClassLoaderCAGI.Q29
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
