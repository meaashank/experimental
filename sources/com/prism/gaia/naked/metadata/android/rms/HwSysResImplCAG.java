package com.prism.gaia.naked.metadata.android.rms;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.rms.HwSysResImplCAGI;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class HwSysResImplCAG {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static Impl_D f165937D = new Impl_D();

    public static final class Impl_D implements HwSysResImplCAGI.D {
        public Impl_HuaWei HuaWei = new Impl_HuaWei();

        public static final class Impl_HuaWei implements HwSysResImplCAGI.D.HuaWei {
            public Impl_CO26 CO26 = new Impl_CO26();

            @m
            public static final class Impl_CO26 implements HwSysResImplCAGI.D.HuaWei.CO26 {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.rms.HwSysResImpl");
                private InitOnceTry<NakedObject<Map<Integer, List<String>>>> __mWhiteListMap = new InitOnceTry<>(new InitOnce.Init() { // from class: e9.a
                    @Override // com.prism.gaia.naked.core.InitOnce.Init
                    public final Object onInit() {
                        return this.f200297a.lambda$new$0();
                    }
                });

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                    return new NakedObject((Class<?>) ORG_CLASS(), "mWhiteListMap");
                }

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }

                @Override // com.prism.gaia.naked.metadata.android.rms.HwSysResImplCAGI.D.HuaWei.CO26
                public NakedObject<Map<Integer, List<String>>> mWhiteListMap() {
                    return this.__mWhiteListMap.get();
                }
            }
        }
    }
}
