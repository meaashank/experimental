package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.l;
import W6.m;
import android.content.ClipboardManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.ClipboardManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ClipboardManagerCAG {
    public static Impl__N24 _N24 = new Impl__N24();
    public static Impl_C26 C26 = new Impl_C26();

    @m
    public static final class Impl_C26 implements ClipboardManagerCAGI.C26 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) ClipboardManager.class);
        private InitOnceTry<NakedObject<IInterface>> __mService = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.V
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64778a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ClipboardManagerCAGI.C26
        public NakedObject<IInterface> mService() {
            return this.__mService.get();
        }
    }

    @l
    public static final class Impl__N24 implements ClipboardManagerCAGI._N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) ClipboardManager.class);
        private InitOnce<NakedStaticMethod<IInterface>> __getService = new InitOnce<>(new InitOnce.Init() { // from class: N8.W
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64779a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<IInterface>> __sService = new InitOnce<>(new InitOnce.Init() { // from class: N8.X
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64780a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ClipboardManagerCAGI._N24
        public NakedStaticMethod<IInterface> getService() {
            return this.__getService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.ClipboardManagerCAGI._N24
        public NakedStaticObject<IInterface> sService() {
            return this.__sService.get();
        }
    }
}
