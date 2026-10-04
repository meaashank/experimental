package com.prism.gaia.naked.metadata.android.graphics;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.graphics.CompatibilityCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class CompatibilityCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165812C = new Impl_C();

    @m
    public static final class Impl_C implements CompatibilityCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.graphics.Compatibility");
        private InitOnceTry<NakedStaticMethod<Void>> __setTargetSdkVersion = new InitOnceTry<>(new InitOnce.Init() { // from class: Q8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f67655a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedStaticMethod<Integer>> __getTargetSdkVersion = new InitOnceTry<>(new InitOnce.Init() { // from class: Q8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f67656a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setTargetSdkVersion", (Class<?>[]) new Class[]{Integer.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getTargetSdkVersion");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.graphics.CompatibilityCAGI.C
        public NakedStaticMethod<Integer> getTargetSdkVersion() {
            return this.__getTargetSdkVersion.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.graphics.CompatibilityCAGI.C
        public NakedStaticMethod<Void> setTargetSdkVersion() {
            return this.__setTargetSdkVersion.get();
        }
    }
}
