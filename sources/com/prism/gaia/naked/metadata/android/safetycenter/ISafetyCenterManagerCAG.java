package com.prism.gaia.naked.metadata.android.safetycenter;

import W6.c;
import W6.m;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.safetycenter.ISafetyCenterManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ISafetyCenterManagerCAG {
    public static Impl_T33 T33 = new Impl_T33();

    @m
    public static final class Impl_T33 implements ISafetyCenterManagerCAGI.T33 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.safetycenter.ISafetyCenterManager");
        public Impl_Stub Stub = new Impl_Stub();

        @m
        public static final class Impl_Stub implements ISafetyCenterManagerCAGI.T33.Stub {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.safetycenter.ISafetyCenterManager$Stub");
            private InitOnceTry<NakedStaticMethod<IInterface>> __asInterface = new InitOnceTry<>(new InitOnce.Init() { // from class: g9.a
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f202294a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "asInterface", (Class<?>[]) new Class[]{IBinder.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.safetycenter.ISafetyCenterManagerCAGI.T33.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
