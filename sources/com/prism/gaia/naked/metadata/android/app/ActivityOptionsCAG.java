package com.prism.gaia.naked.metadata.android.app;

import android.os.Bundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.app.ActivityOptionsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityOptionsCAG {
    public static Impl_J16 J16 = new Impl_J16();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165273C = new Impl_C();

    @W6.m
    public static final class Impl_C implements ActivityOptionsCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ActivityOptions");
        private InitOnceTry<NakedMethod<Boolean>> __getLaunchTaskBehind = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.w
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165558a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Integer>> __getLaunchTaskId = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.x
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165563a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getLaunchTaskBehind");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getLaunchTaskId");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityOptionsCAGI.C
        public NakedMethod<Boolean> getLaunchTaskBehind() {
            return this.__getLaunchTaskBehind.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityOptionsCAGI.C
        public NakedMethod<Integer> getLaunchTaskId() {
            return this.__getLaunchTaskId.get();
        }
    }

    @W6.l
    public static final class Impl_J16 implements ActivityOptionsCAGI.J16 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityOptions");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165568a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Bundle.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityOptionsCAGI.J16
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
