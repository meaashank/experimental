package com.prism.gaia.naked.metadata.android.view.inputmethod;

import W6.c;
import W6.m;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.view.inputmethod.IInputMethodManagerGlobalInvokerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IInputMethodManagerGlobalInvokerCAG {
    public static Impl_U34 U34 = new Impl_U34();

    @m
    public static final class Impl_U34 implements IInputMethodManagerGlobalInvokerCAGI.U34 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.view.inputmethod.IInputMethodManagerGlobalInvoker");
        private InitOnceTry<NakedStaticObject<IInterface>> __sServiceCache = new InitOnceTry<>(new InitOnce.Init() { // from class: m9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f221110a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sServiceCache");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.view.inputmethod.IInputMethodManagerGlobalInvokerCAGI.U34
        public NakedStaticObject<IInterface> sServiceCache() {
            return this.__sServiceCache.get();
        }
    }
}
