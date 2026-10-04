package com.prism.gaia.naked.metadata.android.app;

import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.app.ActivityTaskManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityTaskManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165274G = new Impl_G();

    @W6.l
    public static final class Impl_G implements ActivityTaskManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityTaskManager");
        private InitOnce<NakedStaticObject<Object>> __IActivityTaskManagerSingleton = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.z
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165573a.lambda$new$0();
            }
        });
        private InitOnce<NakedStaticMethod<IInterface>> __getService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.A
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165264a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "IActivityTaskManagerSingleton");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$1() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getService");
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityTaskManagerCAGI.G
        public NakedStaticObject<Object> IActivityTaskManagerSingleton() {
            return this.__IActivityTaskManagerSingleton.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityTaskManagerCAGI.G
        public NakedStaticMethod<IInterface> getService() {
            return this.__getService.get();
        }
    }
}
