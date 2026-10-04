package com.prism.gaia.naked.metadata.dalvik.system;

import W6.c;
import W6.l;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class DexPathListCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166009G = new Impl_G();
    public static Impl_S31 S31 = new Impl_S31();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f166008C = new Impl_C();

    @m
    public static final class Impl_C implements DexPathListCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("dalvik.system.DexPathList");
        private InitOnceTry<NakedObject<Object>> __dexElements = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7271a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<Object>> __nativeLibraryPathElements = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7272a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedObject<Object>> __nativeLibraryDirectories = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7273a.lambda$new$2();
            }
        });
        private InitOnceTry<NakedObject<Object>> __systemNativeLibraryDirectories = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7274a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "dexElements");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "nativeLibraryPathElements");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "nativeLibraryDirectories");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "systemNativeLibraryDirectories");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.C
        public NakedObject<Object> dexElements() {
            return this.__dexElements.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.C
        public NakedObject<Object> nativeLibraryDirectories() {
            return this.__nativeLibraryDirectories.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.C
        public NakedObject<Object> nativeLibraryPathElements() {
            return this.__nativeLibraryPathElements.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.C
        public NakedObject<Object> systemNativeLibraryDirectories() {
            return this.__systemNativeLibraryDirectories.get();
        }
    }

    @l
    public static final class Impl_G implements DexPathListCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("dalvik.system.DexPathList");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: A9.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7275a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __initByteBufferDexPath = new InitOnce<>(new InitOnce.Init() { // from class: A9.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7276a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{ClassLoader.class, String.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "initByteBufferDexPath", (Class<?>[]) new Class[]{ByteBuffer[].class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.G
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.G
        public NakedMethod<Void> initByteBufferDexPath() {
            return this.__initByteBufferDexPath.get();
        }
    }

    @l
    public static final class Impl_S31 implements DexPathListCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("dalvik.system.DexPathList");
        private InitOnce<NakedMethod<Void>> __maybeRunBackgroundVerification = new InitOnce<>(new InitOnce.Init() { // from class: A9.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7277a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "maybeRunBackgroundVerification", (Class<?>[]) new Class[]{ClassLoader.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.DexPathListCAGI.S31
        public NakedMethod<Void> maybeRunBackgroundVerification() {
            return this.__maybeRunBackgroundVerification.get();
        }
    }
}
