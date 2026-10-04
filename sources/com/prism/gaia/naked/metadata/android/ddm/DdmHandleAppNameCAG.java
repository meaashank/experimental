package com.prism.gaia.naked.metadata.android.ddm;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.ddm.DdmHandleAppNameCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class DdmHandleAppNameCAG {
    public static Impl__J16 _J16 = new Impl__J16();
    public static Impl_J17 J17 = new Impl_J17();

    @l
    public static final class Impl_J17 implements DdmHandleAppNameCAGI.J17 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.ddm.DdmHandleAppName");
        private InitOnce<NakedStaticMethod<Void>> __setAppName = new InitOnce<>(new InitOnce.Init() { // from class: P8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65576a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setAppName", (Class<?>[]) new Class[]{String.class, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.ddm.DdmHandleAppNameCAGI.J17
        public NakedStaticMethod<Void> setAppName() {
            return this.__setAppName.get();
        }
    }

    @l
    public static final class Impl__J16 implements DdmHandleAppNameCAGI._J16 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.ddm.DdmHandleAppName");
        private InitOnce<NakedStaticMethod<Void>> __setAppName = new InitOnce<>(new InitOnce.Init() { // from class: P8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65577a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setAppName", (Class<?>[]) new Class[]{String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.ddm.DdmHandleAppNameCAGI._J16
        public NakedStaticMethod<Void> setAppName() {
            return this.__setAppName.get();
        }
    }
}
