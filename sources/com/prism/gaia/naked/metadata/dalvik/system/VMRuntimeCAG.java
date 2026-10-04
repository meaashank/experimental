package com.prism.gaia.naked.metadata.dalvik.system;

import W6.c;
import W6.l;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class VMRuntimeCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166011G = new Impl_G();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f166010C = new Impl_C();
    public static Impl_L21 L21 = new Impl_L21();

    @m
    public static final class Impl_C implements VMRuntimeCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("dalvik.system.VMRuntime");
        private InitOnceTry<NakedStaticMethod<String>> __getCurrentInstructionSet = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7278a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __setTargetSdkVersion = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.p
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7279a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __getTargetSdkVersion = new InitOnceTry<>(new InitOnce.Init() { // from class: A9.q
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7280a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getCurrentInstructionSet");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setTargetSdkVersion", (Class<?>[]) new Class[]{Integer.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getTargetSdkVersion");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAGI.C
        public NakedStaticMethod<String> getCurrentInstructionSet() {
            return this.__getCurrentInstructionSet.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAGI.C
        public NakedMethod<Void> getTargetSdkVersion() {
            return this.__getTargetSdkVersion.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAGI.C
        public NakedMethod<Void> setTargetSdkVersion() {
            return this.__setTargetSdkVersion.get();
        }
    }

    @l
    public static final class Impl_G implements VMRuntimeCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("dalvik.system.VMRuntime");
        private InitOnce<NakedStaticMethod<Object>> __getRuntime = new InitOnce<>(new InitOnce.Init() { // from class: A9.r
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7281a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getRuntime");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAGI.G
        public NakedStaticMethod<Object> getRuntime() {
            return this.__getRuntime.get();
        }
    }

    @l
    public static final class Impl_L21 implements VMRuntimeCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("dalvik.system.VMRuntime");
        private InitOnce<NakedMethod<Boolean>> __is64Bit = new InitOnce<>(new InitOnce.Init() { // from class: A9.s
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f7282a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "is64Bit");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.dalvik.system.VMRuntimeCAGI.L21
        public NakedMethod<Boolean> is64Bit() {
            return this.__is64Bit.get();
        }
    }
}
