package com.prism.gaia.naked.metadata.com.android.internal.policy;

import W6.c;
import W6.m;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.com.android.internal.policy.PhoneWindowCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class PhoneWindowCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165987C = new Impl_C();

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public static Impl_C2 f165988C2 = new Impl_C2();

    @m
    public static final class Impl_C implements PhoneWindowCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.internal.policy.impl.PhoneWindow$WindowManagerHolder");
        private InitOnceTry<NakedStaticObject<IInterface>> __sWindowManager = new InitOnceTry<>(new InitOnce.Init() { // from class: w9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f240173a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sWindowManager");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.policy.PhoneWindowCAGI.C
        public NakedStaticObject<IInterface> sWindowManager() {
            return this.__sWindowManager.get();
        }
    }

    @m
    public static final class Impl_C2 implements PhoneWindowCAGI.C2 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.internal.policy.PhoneWindow$WindowManagerHolder");
        private InitOnceTry<NakedStaticObject<IInterface>> __sWindowManager = new InitOnceTry<>(new InitOnce.Init() { // from class: w9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f240174a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sWindowManager");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.policy.PhoneWindowCAGI.C2
        public NakedStaticObject<IInterface> sWindowManager() {
            return this.__sWindowManager.get();
        }
    }
}
