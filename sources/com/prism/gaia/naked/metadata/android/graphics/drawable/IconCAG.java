package com.prism.gaia.naked.metadata.android.graphics.drawable;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.graphics.drawable.Icon;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.graphics.drawable.IconCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(23)
public final class IconCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165813G = new Impl_G();

    @l
    public static final class Impl_G implements IconCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Icon.class);
        private InitOnce<NakedObject<Object>> __mObj1 = new InitOnce<>(new InitOnce.Init() { // from class: R8.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f67746a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<String>> __mString1 = new InitOnce<>(new InitOnce.Init() { // from class: R8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f67747a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<Integer>> __mInt1 = new InitOnce<>(new InitOnce.Init() { // from class: R8.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f67748a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<Integer>> __mType = new InitOnce<>(new InitOnce.Init() { // from class: R8.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f67749a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mObj1");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mString1");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInt1");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mType");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.graphics.drawable.IconCAGI.G
        public NakedObject<Integer> mInt1() {
            return this.__mInt1.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.graphics.drawable.IconCAGI.G
        public NakedObject<Object> mObj1() {
            return this.__mObj1.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.graphics.drawable.IconCAGI.G
        public NakedObject<String> mString1() {
            return this.__mString1.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.graphics.drawable.IconCAGI.G
        public NakedObject<Integer> mType() {
            return this.__mType.get();
        }
    }
}
