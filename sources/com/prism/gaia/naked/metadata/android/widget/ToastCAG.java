package com.prism.gaia.naked.metadata.android.widget;

import W6.c;
import W6.l;
import android.os.IInterface;
import android.widget.Toast;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.widget.ToastCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ToastCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165973G = new Impl_G();

    @l
    public static final class Impl_G implements ToastCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Toast.class);
        private InitOnce<NakedStaticObject<IInterface>> __sService = new InitOnce<>(new InitOnce.Init() { // from class: o9.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f223391a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.widget.ToastCAGI.G
        public NakedStaticObject<IInterface> sService() {
            return this.__sService.get();
        }
    }
}
