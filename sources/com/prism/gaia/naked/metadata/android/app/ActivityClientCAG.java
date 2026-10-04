package com.prism.gaia.naked.metadata.android.app;

import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.app.ActivityClientCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityClientCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165270C = new Impl_C();

    @W6.m
    public static final class Impl_C implements ActivityClientCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ActivityClient");
        private InitOnceTry<NakedStaticMethod<IInterface>> __getActivityClientController = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165452a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedStaticObject<Object>> __INTERFACE_SINGLETON = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165457a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedStaticMethod<IInterface>> __setActivityClientController = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165462a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getActivityClientController");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$1() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "INTERFACE_SINGLETON");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$2() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "setActivityClientController", new String[]{"android.app.IActivityClientController"});
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityClientCAGI.C
        public NakedStaticObject<Object> INTERFACE_SINGLETON() {
            return this.__INTERFACE_SINGLETON.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityClientCAGI.C
        public NakedStaticMethod<IInterface> getActivityClientController() {
            return this.__getActivityClientController.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityClientCAGI.C
        public NakedStaticMethod<IInterface> setActivityClientController() {
            return this.__setActivityClientController.get();
        }
    }
}
