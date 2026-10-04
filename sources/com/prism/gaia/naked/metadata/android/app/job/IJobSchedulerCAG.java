package com.prism.gaia.naked.metadata.android.app.job;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.app.job.IJobSchedulerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IJobSchedulerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165468G = new Impl_G();

    @W6.l
    public static final class Impl_G implements IJobSchedulerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobScheduler");
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IJobSchedulerCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobScheduler$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.m
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165484a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "asInterface", (Class<?>[]) new Class[]{IBinder.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.job.IJobSchedulerCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
