package com.prism.gaia.naked.metadata.android.app.job;

import android.app.job.JobParameters;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.app.job.IJobServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IJobServiceCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165469G = new Impl_G();

    @W6.l
    public static final class Impl_G implements IJobServiceCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobService");
        private InitOnce<NakedMethod<Void>> __startJob = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165485a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __stopJob = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165486a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __onNetworkChanged = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.p
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165487a.lambda$new$2();
            }
        });
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IJobServiceCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobService$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165488a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.app.job.IJobServiceCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "startJob", (Class<?>[]) new Class[]{JobParameters.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "stopJob", (Class<?>[]) new Class[]{JobParameters.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "onNetworkChanged", (Class<?>[]) new Class[]{JobParameters.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobServiceCAGI.G
        public NakedMethod<Void> onNetworkChanged() {
            return this.__onNetworkChanged.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobServiceCAGI.G
        public NakedMethod<Void> startJob() {
            return this.__startJob.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobServiceCAGI.G
        public NakedMethod<Void> stopJob() {
            return this.__stopJob.get();
        }
    }
}
