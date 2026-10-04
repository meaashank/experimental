package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import android.content.Intent;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.IntentCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IntentCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165600C = new Impl_C();

    @m
    public static final class Impl_C implements IntentCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) Intent.class);
        private InitOnceTry<NakedStaticObject<String>> __EXTRA_USER_HANDLE = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.o0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64811a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedStaticInt> __FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.p0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64813a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "EXTRA_USER_HANDLE");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$1() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT");
        }

        @Override // com.prism.gaia.naked.metadata.android.content.IntentCAGI.C
        public NakedStaticObject<String> EXTRA_USER_HANDLE() {
            return this.__EXTRA_USER_HANDLE.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.IntentCAGI.C
        public NakedStaticInt FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT() {
            return this.__FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
