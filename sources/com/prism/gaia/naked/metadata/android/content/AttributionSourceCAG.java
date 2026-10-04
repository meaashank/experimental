package com.prism.gaia.naked.metadata.android.content;

import N8.C1234a;
import W6.c;
import W6.m;
import android.content.AttributionSource;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.AttributionSourceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class AttributionSourceCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165587C = new Impl_C();

    @m
    public static final class Impl_C implements AttributionSourceCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) C1234a.a());
        private InitOnceTry<NakedObject<Object>> __mAttributionSourceState = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64784a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<AttributionSource>> __withPackageName = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64786a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mAttributionSourceState");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "withPackageName", (Class<?>[]) new Class[]{String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.AttributionSourceCAGI.C
        public NakedObject<Object> mAttributionSourceState() {
            return this.__mAttributionSourceState.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.AttributionSourceCAGI.C
        public NakedMethod<AttributionSource> withPackageName() {
            return this.__withPackageName.get();
        }
    }
}
