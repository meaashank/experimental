package com.prism.gaia.naked.metadata.android.app.job;

import android.app.Notification;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IJobCallbackCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165467G = new Impl_G();
    public static Impl_U34 U34 = new Impl_U34();
    public static Impl_C34 C34 = new Impl_C34();

    @W6.m
    public static final class Impl_C34 implements IJobCallbackCAGI.C34 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.job.IJobCallback");
        private InitOnceTry<NakedMethod<Void>> __handleAbandonedJob = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165472a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleAbandonedJob", (Class<?>[]) new Class[]{Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.C34
        public NakedMethod<Void> handleAbandonedJob() {
            return this.__handleAbandonedJob.get();
        }
    }

    @W6.l
    public static final class Impl_G implements IJobCallbackCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobCallback");
        private InitOnce<NakedMethod<Void>> __acknowledgeStartMessage = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165473a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __acknowledgeStopMessage = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165474a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<JobWorkItem>> __dequeueWork = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165475a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Boolean>> __completeWork = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165476a.lambda$new$3();
            }
        });
        private InitOnce<NakedMethod<Void>> __jobFinished = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165477a.lambda$new$4();
            }
        });
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IJobCallbackCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobCallback$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.g
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165478a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "acknowledgeStartMessage", (Class<?>[]) new Class[]{Integer.TYPE, Boolean.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "acknowledgeStopMessage", (Class<?>[]) new Class[]{Integer.TYPE, Boolean.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "dequeueWork", (Class<?>[]) new Class[]{Integer.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "completeWork", (Class<?>[]) new Class[]{cls, cls});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "jobFinished", (Class<?>[]) new Class[]{Integer.TYPE, Boolean.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.G
        public NakedMethod<Void> acknowledgeStartMessage() {
            return this.__acknowledgeStartMessage.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.G
        public NakedMethod<Void> acknowledgeStopMessage() {
            return this.__acknowledgeStopMessage.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.G
        public NakedMethod<Boolean> completeWork() {
            return this.__completeWork.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.G
        public NakedMethod<JobWorkItem> dequeueWork() {
            return this.__dequeueWork.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.G
        public NakedMethod<Void> jobFinished() {
            return this.__jobFinished.get();
        }
    }

    @W6.l
    public static final class Impl_U34 implements IJobCallbackCAGI.U34 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.job.IJobCallback");
        private InitOnce<NakedMethod<Void>> __acknowledgeGetTransferredDownloadBytesMessage = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165479a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __acknowledgeGetTransferredUploadBytesMessage = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165480a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __updateEstimatedNetworkBytes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165481a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Void>> __updateTransferredNetworkBytes = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165482a.lambda$new$3();
            }
        });
        private InitOnce<NakedMethod<Void>> __setNotification = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.job.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165483a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "acknowledgeGetTransferredDownloadBytesMessage", (Class<?>[]) new Class[]{cls, cls, Long.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "acknowledgeGetTransferredUploadBytesMessage", (Class<?>[]) new Class[]{cls, cls, Long.TYPE});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class clsA = com.prism.gaia.client.stub.g.a();
            Class cls = Long.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "updateEstimatedNetworkBytes", (Class<?>[]) new Class[]{Integer.TYPE, clsA, cls, cls});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class clsA = com.prism.gaia.client.stub.g.a();
            Class cls = Long.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "updateTransferredNetworkBytes", (Class<?>[]) new Class[]{Integer.TYPE, clsA, cls, cls});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "setNotification", (Class<?>[]) new Class[]{cls, cls, Notification.class, cls});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.U34
        public NakedMethod<Void> acknowledgeGetTransferredDownloadBytesMessage() {
            return this.__acknowledgeGetTransferredDownloadBytesMessage.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.U34
        public NakedMethod<Void> acknowledgeGetTransferredUploadBytesMessage() {
            return this.__acknowledgeGetTransferredUploadBytesMessage.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.U34
        public NakedMethod<Void> setNotification() {
            return this.__setNotification.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.U34
        public NakedMethod<Void> updateEstimatedNetworkBytes() {
            return this.__updateEstimatedNetworkBytes.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAGI.U34
        public NakedMethod<Void> updateTransferredNetworkBytes() {
            return this.__updateTransferredNetworkBytes.get();
        }
    }
}
