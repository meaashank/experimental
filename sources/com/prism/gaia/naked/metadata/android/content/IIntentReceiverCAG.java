package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import android.content.Intent;
import android.os.Bundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.content.IIntentReceiverCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IIntentReceiverCAG {
    public static Impl__J16 _J16 = new Impl__J16();
    public static Impl_J17 J17 = new Impl_J17();

    @l
    public static final class Impl_J17 implements IIntentReceiverCAGI.J17 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.IIntentReceiver");
        private InitOnce<NakedMethod<Void>> __performReceive = new InitOnce<>(new InitOnce.Init() { // from class: N8.l0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64805a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "performReceive", (Class<?>[]) new Class[]{Intent.class, cls, String.class, Bundle.class, cls2, cls2, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.IIntentReceiverCAGI.J17
        public NakedMethod<Void> performReceive() {
            return this.__performReceive.get();
        }
    }

    @l
    public static final class Impl__J16 implements IIntentReceiverCAGI._J16 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.IIntentReceiver");
        private InitOnce<NakedMethod<Void>> __performReceive = new InitOnce<>(new InitOnce.Init() { // from class: N8.m0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64807a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Boolean.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "performReceive", (Class<?>[]) new Class[]{Intent.class, Integer.TYPE, String.class, Bundle.class, cls, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.IIntentReceiverCAGI._J16
        public NakedMethod<Void> performReceive() {
            return this.__performReceive.get();
        }
    }
}
