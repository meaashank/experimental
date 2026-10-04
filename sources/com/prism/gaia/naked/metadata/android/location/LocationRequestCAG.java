package com.prism.gaia.naked.metadata.android.location;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.location.LocationRequestCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class LocationRequestCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165825C = new Impl_C();

    @m
    public static final class Impl_C implements LocationRequestCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.location.LocationRequest");
        private InitOnceTry<NakedBoolean> __mHideFromAppOps = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.G
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76366a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<Object>> __mWorkSource = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.H
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76367a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedObject<String>> __mProvider = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.I
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76368a.lambda$new$2();
            }
        });
        private InitOnceTry<NakedMethod<String>> __getProvider = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.J
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76369a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mHideFromAppOps");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mWorkSource");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mProvider");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getProvider");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationRequestCAGI.C
        public NakedMethod<String> getProvider() {
            return this.__getProvider.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationRequestCAGI.C
        public NakedBoolean mHideFromAppOps() {
            return this.__mHideFromAppOps.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationRequestCAGI.C
        public NakedObject<String> mProvider() {
            return this.__mProvider.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationRequestCAGI.C
        public NakedObject<Object> mWorkSource() {
            return this.__mWorkSource.get();
        }
    }
}
