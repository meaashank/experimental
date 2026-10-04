package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import android.content.PeriodicSync;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.metadata.android.content.PeriodicSyncCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class PeriodicSyncCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165602C = new Impl_C();

    @m
    public static final class Impl_C implements PeriodicSyncCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) PeriodicSync.class);
        private InitOnceTry<NakedLong> __flexTime = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.t0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64821a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedLong lambda$new$0() throws Exception {
            return new NakedLong((Class<?>) ORG_CLASS(), "flexTime");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.PeriodicSyncCAGI.C
        public NakedLong flexTime() {
            return this.__flexTime.get();
        }
    }
}
