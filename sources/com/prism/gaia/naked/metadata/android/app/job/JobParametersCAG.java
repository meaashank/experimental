package com.prism.gaia.naked.metadata.android.app.job;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PersistableBundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.job.JobParametersCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
@TargetApi(21)
public final class JobParametersCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165471G = new Impl_G();

    @W6.l
    public static final class Impl_G implements JobParametersCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) JobParameters.class);
        private InitOnce<NakedObject<IBinder>> __callback = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.t
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165491a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<PersistableBundle>> __extras = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.u
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165492a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __jobId = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.v
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165493a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<IInterface>> __getCallback = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.w
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165494a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "callback");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "extras");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "jobId");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getCallback");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobParametersCAGI.G
        public NakedObject<IBinder> callback() {
            return this.__callback.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobParametersCAGI.G
        public NakedObject<PersistableBundle> extras() {
            return this.__extras.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobParametersCAGI.G
        public NakedMethod<IInterface> getCallback() {
            return this.__getCallback.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.JobParametersCAGI.G
        public NakedInt jobId() {
            return this.__jobId.get();
        }
    }
}
