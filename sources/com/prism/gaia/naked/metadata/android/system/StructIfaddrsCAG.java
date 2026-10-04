package com.prism.gaia.naked.metadata.android.system;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.system.StructIfaddrsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class StructIfaddrsCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165952C = new Impl_C();

    @m
    public static final class Impl_C implements StructIfaddrsCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.system.StructIfaddrs");
        private InitOnceTry<NakedObject<String>> __ifa_name = new InitOnceTry<>(new InitOnce.Init() { // from class: i9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f202914a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<byte[]>> __hwaddr = new InitOnceTry<>(new InitOnce.Init() { // from class: i9.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f202915a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "ifa_name");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "hwaddr");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.system.StructIfaddrsCAGI.C
        public NakedObject<byte[]> hwaddr() {
            return this.__hwaddr.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.system.StructIfaddrsCAGI.C
        public NakedObject<String> ifa_name() {
            return this.__ifa_name.get();
        }
    }
}
