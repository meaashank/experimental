package com.prism.gaia.naked.metadata.android.app.job;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.content.ComponentName;
import androidx.core.app.NotificationCompat;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.job.JobInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
@TargetApi(21)
public final class JobInfoCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165470G = new Impl_G();

    @W6.l
    public static final class Impl_G implements JobInfoCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) JobInfo.class);
        private InitOnce<NakedInt> __jobId = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.r
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165489a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<ComponentName>> __service = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.s
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165490a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$0() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "jobId");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), NotificationCompat.CATEGORY_SERVICE);
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobInfoCAGI.G
        public NakedInt jobId() {
            return this.__jobId.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobInfoCAGI.G
        public NakedObject<ComponentName> service() {
            return this.__service.get();
        }
    }
}
