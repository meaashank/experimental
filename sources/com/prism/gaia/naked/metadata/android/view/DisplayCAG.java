package com.prism.gaia.naked.metadata.android.view;

import W6.c;
import W6.l;
import android.os.IInterface;
import android.view.Display;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.view.DisplayCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class DisplayCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165961G = new Impl_G();

    @l
    public static final class Impl_G implements DisplayCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Display.class);
        private InitOnce<NakedStaticObject<IInterface>> __sWindowManager = new InitOnce<>(new InitOnce.Init() { // from class: l9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f220958a.lambda$new$0();
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

        @Override // com.prism.gaia.naked.metadata.android.view.DisplayCAGI.G
        public NakedStaticObject<IInterface> sWindowManager() {
            return this.__sWindowManager.get();
        }
    }
}
