package com.prism.gaia.naked.metadata.android.app.job;

import android.app.job.JobServiceEngine;
import android.os.Binder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.job.JobServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class JobServiceCAG {
    public static Impl_O26 O26 = new Impl_O26();
    public static Impl__N25 _N25 = new Impl__N25();

    @W6.l
    public static final class Impl_O26 implements JobServiceCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.JobService");
        private InitOnce<NakedObject<JobServiceEngine>> __mEngine = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.x
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165495a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mEngine");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobServiceCAGI.O26
        public NakedObject<JobServiceEngine> mEngine() {
            return this.__mEngine.get();
        }
    }

    @W6.l
    public static final class Impl__N25 implements JobServiceCAGI._N25 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.JobService");
        private InitOnce<NakedObject<Binder>> __mBinder = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165496a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mBinder");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobServiceCAGI._N25
        public NakedObject<Binder> mBinder() {
            return this.__mBinder.get();
        }
    }
}
