package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import android.content.SyncAdapterType;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.content.SyncAdapterTypeCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SyncAdapterTypeCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165603C = new Impl_C();
    public static Impl_CN24 CN24 = new Impl_CN24();

    @m
    public static final class Impl_C implements SyncAdapterTypeCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) SyncAdapterType.class);
        private InitOnceTry<NakedConstructor<SyncAdapterType>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.u0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64823a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Boolean.TYPE;
            return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{String.class, String.class, cls, cls, cls, cls, String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncAdapterTypeCAGI.C
        public NakedConstructor<SyncAdapterType> ctor() {
            return this.__ctor.get();
        }
    }

    @m
    public static final class Impl_CN24 implements SyncAdapterTypeCAGI.CN24 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) SyncAdapterType.class);
        private InitOnceTry<NakedConstructor<SyncAdapterType>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.v0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64825a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Boolean.TYPE;
            return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{String.class, String.class, cls, cls, cls, cls, String.class, String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.SyncAdapterTypeCAGI.CN24
        public NakedConstructor<SyncAdapterType> ctor() {
            return this.__ctor.get();
        }
    }
}
