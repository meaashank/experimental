package com.prism.gaia.naked.metadata.android.view;

import W6.c;
import W6.l;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.view.WindowManagerGlobalCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class WindowManagerGlobalCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165968G = new Impl_G();

    @l
    public static final class Impl_G implements WindowManagerGlobalCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.view.WindowManagerGlobal");
        private InitOnce<NakedStaticObject<IInterface>> __sWindowManagerService = new InitOnce<>(new InitOnce.Init() { // from class: l9.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f220966a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sWindowManagerService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.view.WindowManagerGlobalCAGI.G
        public NakedStaticObject<IInterface> sWindowManagerService() {
            return this.__sWindowManagerService.get();
        }
    }
}
