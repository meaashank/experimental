package com.prism.gaia.naked.metadata.android.rms.resource;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.rms.resource.ReceiverResourceCAGI;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ReceiverResourceCAG {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static Impl_D f165938D = new Impl_D();

    public static final class Impl_D implements ReceiverResourceCAGI.D {
        public Impl_HuaWei HuaWei = new Impl_HuaWei();

        public static final class Impl_HuaWei implements ReceiverResourceCAGI.D.HuaWei {
            public Impl_CN24 CN24 = new Impl_CN24();
            public Impl_CL CL = new Impl_CL();
            public Impl_CM CM = new Impl_CM();

            @m
            public static final class Impl_CL implements ReceiverResourceCAGI.D.HuaWei.CL {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.rms.resource.ReceiverResource");
                private InitOnceTry<NakedObject<Object>> __mResourceConfig = new InitOnceTry<>(new InitOnce.Init() { // from class: f9.a
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f200665a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mResourceConfig");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.rms.resource.ReceiverResourceCAGI.D.HuaWei.CL
                public NakedObject<Object> mResourceConfig() {
                    return this.__mResourceConfig.get();
                }
            }

            @m
            public static final class Impl_CM implements ReceiverResourceCAGI.D.HuaWei.CM {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.rms.resource.ReceiverResource");
                private InitOnceTry<NakedObject<String[]>> __mWhiteList = new InitOnceTry<>(new InitOnce.Init() { // from class: f9.b
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f200666a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mWhiteList");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.rms.resource.ReceiverResourceCAGI.D.HuaWei.CM
                public NakedObject<String[]> mWhiteList() {
                    return this.__mWhiteList.get();
                }
            }

            @m
            public static final class Impl_CN24 implements ReceiverResourceCAGI.D.HuaWei.CN24 {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.rms.resource.ReceiverResource");
                private InitOnceTry<NakedObject<List<String>>> __mWhiteList = new InitOnceTry<>(new InitOnce.Init() { // from class: f9.c
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f200667a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mWhiteList");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.rms.resource.ReceiverResourceCAGI.D.HuaWei.CN24
                public NakedObject<List<String>> mWhiteList() {
                    return this.__mWhiteList.get();
                }
            }
        }
    }
}
