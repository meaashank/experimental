package com.prism.gaia.naked.metadata.android.os;

import android.os.Build;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.os.BuildCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class BuildCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165857G = new Impl_G();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165856C = new Impl_C();

    @W6.m
    public static final class Impl_C implements BuildCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) Build.class);
        private InitOnceTry<NakedStaticObject<String[]>> __SUPPORTED_ABIS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165905a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedStaticObject<String[]>> __SUPPORTED_32_BIT_ABIS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165907a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedStaticObject<String[]>> __SUPPORTED_64_BIT_ABIS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165908a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "SUPPORTED_ABIS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "SUPPORTED_32_BIT_ABIS");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$2() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "SUPPORTED_64_BIT_ABIS");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BuildCAGI.C
        public NakedStaticObject<String[]> SUPPORTED_32_BIT_ABIS() {
            return this.__SUPPORTED_32_BIT_ABIS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BuildCAGI.C
        public NakedStaticObject<String[]> SUPPORTED_64_BIT_ABIS() {
            return this.__SUPPORTED_64_BIT_ABIS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BuildCAGI.C
        public NakedStaticObject<String[]> SUPPORTED_ABIS() {
            return this.__SUPPORTED_ABIS.get();
        }
    }

    @W6.l
    public static final class Impl_G implements BuildCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Build.class);
        private InitOnce<NakedStaticObject<String>> __DEVICE = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165909a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<String>> __SERIAL = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165910a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DEVICE");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "SERIAL");
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BuildCAGI.G
        public NakedStaticObject<String> DEVICE() {
            return this.__DEVICE.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.BuildCAGI.G
        public NakedStaticObject<String> SERIAL() {
            return this.__SERIAL.get();
        }
    }
}
