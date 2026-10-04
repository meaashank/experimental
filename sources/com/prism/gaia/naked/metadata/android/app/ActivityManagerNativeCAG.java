package com.prism.gaia.naked.metadata.android.app;

import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.app.ActivityManagerNativeCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityManagerNativeCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165272G = new Impl_G();
    public static Impl__N25 _N25 = new Impl__N25();

    @W6.l
    public static final class Impl_G implements ActivityManagerNativeCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityManagerNative");
        private InitOnce<NakedStaticMethod<IInterface>> __getDefault = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.u
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165548a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getDefault");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerNativeCAGI.G
        public NakedStaticMethod<IInterface> getDefault() {
            return this.__getDefault.get();
        }
    }

    @W6.l
    public static final class Impl__N25 implements ActivityManagerNativeCAGI._N25 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityManagerNative");
        private InitOnce<NakedStaticObject<Object>> __gDefault = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.v
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165553a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "gDefault");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityManagerNativeCAGI._N25
        public NakedStaticObject<Object> gDefault() {
            return this.__gDefault.get();
        }
    }
}
