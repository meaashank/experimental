package com.prism.gaia.naked.metadata.android.content.res;

import W6.c;
import W6.l;
import android.content.pm.ApplicationInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.content.res.CompatibilityInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class CompatibilityInfoCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165805G = new Impl_G();

    @l
    public static final class Impl_G implements CompatibilityInfoCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.res.CompatibilityInfo");
        private InitOnce<NakedConstructor> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: O8.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65216a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticObject<Object>> __DEFAULT_COMPATIBILITY_INFO = new InitOnce<>(new InitOnce.Init() { // from class: O8.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f65217a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{ApplicationInfo.class, cls, cls, Boolean.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "DEFAULT_COMPATIBILITY_INFO");
        }

        @Override // com.prism.gaia.naked.metadata.android.content.res.CompatibilityInfoCAGI.G
        public NakedStaticObject<Object> DEFAULT_COMPATIBILITY_INFO() {
            return this.__DEFAULT_COMPATIBILITY_INFO.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.res.CompatibilityInfoCAGI.G
        public NakedConstructor ctor() {
            return this.__ctor.get();
        }
    }
}
