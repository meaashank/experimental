package com.prism.gaia.naked.metadata.android.hardware.display;

import W6.c;
import W6.l;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.hardware.display.DisplayManagerGlobalCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class DisplayManagerGlobalCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165814G = new Impl_G();

    @l
    public static final class Impl_G implements DisplayManagerGlobalCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.hardware.display.DisplayManagerGlobal");
        private InitOnce<NakedStaticMethod<Object>> __getInstance = new InitOnce<>(new InitOnce.Init() { // from class: S8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f68137a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<IInterface>> __mDm = new InitOnce<>(new InitOnce.Init() { // from class: S8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f68138a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getInstance");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mDm");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.hardware.display.DisplayManagerGlobalCAGI.G
        public NakedStaticMethod<Object> getInstance() {
            return this.__getInstance.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.hardware.display.DisplayManagerGlobalCAGI.G
        public NakedObject<IInterface> mDm() {
            return this.__mDm.get();
        }
    }
}
