package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class BroadcastReceiverCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165589C = new Impl_C();
    public static Impl_CJ17 CJ17 = new Impl_CJ17();
    public static Impl_CM23 CM23 = new Impl_CM23();

    @m
    public static final class Impl_C implements BroadcastReceiverCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) BroadcastReceiver.class);
        private InitOnceTry<NakedMethod<BroadcastReceiver.PendingResult>> __getPendingResult = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64794a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __setPendingResult = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64796a.lambda$new$1();
            }
        });
        public Impl_PendingResult PendingResult = new Impl_PendingResult();

        @m
        public static final class Impl_PendingResult implements BroadcastReceiverCAGI.C.PendingResult {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) BroadcastReceiver.PendingResult.class);
            private InitOnceTry<NakedConstructor<BroadcastReceiver.PendingResult>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.i
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64798a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedBoolean> __mAbortBroadcast = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.l
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64804a.lambda$new$1();
                }
            });
            private InitOnceTry<NakedBoolean> __mFinished = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.m
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64806a.lambda$new$2();
                }
            });
            private InitOnceTry<NakedBoolean> __mInitialStickyHint = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.n
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64808a.lambda$new$3();
                }
            });
            private InitOnceTry<NakedBoolean> __mOrderedHint = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.o
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64810a.lambda$new$4();
                }
            });
            private InitOnceTry<NakedInt> __mResultCode = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.p
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64812a.lambda$new$5();
                }
            });
            private InitOnceTry<NakedObject<String>> __mResultData = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64814a.lambda$new$6();
                }
            });
            private InitOnceTry<NakedObject<Bundle>> __mResultExtras = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.r
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64816a.lambda$new$7();
                }
            });
            private InitOnceTry<NakedObject<IBinder>> __mToken = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.s
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64818a.lambda$new$8();
                }
            });
            private InitOnceTry<NakedInt> __mType = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.j
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64800a.lambda$new$9();
                }
            });
            private InitOnceTry<NakedMethod<Void>> __sendFinished = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.k
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64802a.lambda$new$10();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                Class clsORG_CLASS = ORG_CLASS();
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{cls, String.class, Bundle.class, cls, cls2, cls2, IBinder.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$1() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mAbortBroadcast");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$10() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "sendFinished");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$2() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mFinished");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$3() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mInitialStickyHint");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mOrderedHint");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$5() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mResultCode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$6() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mResultData");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$7() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mResultExtras");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$8() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mToken");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$9() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mType");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedConstructor<BroadcastReceiver.PendingResult> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedBoolean mAbortBroadcast() {
                return this.__mAbortBroadcast.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedBoolean mFinished() {
                return this.__mFinished.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedBoolean mInitialStickyHint() {
                return this.__mInitialStickyHint.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedBoolean mOrderedHint() {
                return this.__mOrderedHint.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedInt mResultCode() {
                return this.__mResultCode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedObject<String> mResultData() {
                return this.__mResultData.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedObject<Bundle> mResultExtras() {
                return this.__mResultExtras.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedObject<IBinder> mToken() {
                return this.__mToken.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedInt mType() {
                return this.__mType.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C.PendingResult
            public NakedMethod<Void> sendFinished() {
                return this.__sendFinished.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPendingResult");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setPendingResult", (Class<?>[]) new Class[]{BroadcastReceiver.PendingResult.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C
        public NakedMethod<BroadcastReceiver.PendingResult> getPendingResult() {
            return this.__getPendingResult.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.C
        public NakedMethod<Void> setPendingResult() {
            return this.__setPendingResult.get();
        }
    }

    @m
    public static final class Impl_CJ17 implements BroadcastReceiverCAGI.CJ17 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) BroadcastReceiver.class);
        private InitOnceTry<NakedMethod<BroadcastReceiver.PendingResult>> __getPendingResult = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.t
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64820a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __setPendingResult = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.u
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64822a.lambda$new$1();
            }
        });
        public Impl_PendingResult PendingResult = new Impl_PendingResult();

        @m
        public static final class Impl_PendingResult implements BroadcastReceiverCAGI.CJ17.PendingResult {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) BroadcastReceiver.PendingResult.class);
            private InitOnceTry<NakedConstructor<BroadcastReceiver.PendingResult>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.v
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64824a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedBoolean> __mAbortBroadcast = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.y
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64830a.lambda$new$1();
                }
            });
            private InitOnceTry<NakedBoolean> __mFinished = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.z
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64832a.lambda$new$2();
                }
            });
            private InitOnceTry<NakedBoolean> __mInitialStickyHint = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.A
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64752a.lambda$new$3();
                }
            });
            private InitOnceTry<NakedBoolean> __mOrderedHint = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.B
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64754a.lambda$new$4();
                }
            });
            private InitOnceTry<NakedInt> __mResultCode = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.C
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64756a.lambda$new$5();
                }
            });
            private InitOnceTry<NakedObject<String>> __mResultData = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.D
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64758a.lambda$new$6();
                }
            });
            private InitOnceTry<NakedObject<Bundle>> __mResultExtras = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.E
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64760a.lambda$new$7();
                }
            });
            private InitOnceTry<NakedInt> __mSendingUser = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.F
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64762a.lambda$new$8();
                }
            });
            private InitOnceTry<NakedObject<IBinder>> __mToken = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.w
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64826a.lambda$new$9();
                }
            });
            private InitOnceTry<NakedInt> __mType = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.x
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64828a.lambda$new$10();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                Class clsORG_CLASS = ORG_CLASS();
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{cls, String.class, Bundle.class, cls, cls2, cls2, IBinder.class, cls});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$1() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mAbortBroadcast");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$10() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mType");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$2() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mFinished");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$3() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mInitialStickyHint");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mOrderedHint");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$5() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mResultCode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$6() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mResultData");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$7() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mResultExtras");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$8() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mSendingUser");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$9() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mToken");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedConstructor<BroadcastReceiver.PendingResult> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedBoolean mAbortBroadcast() {
                return this.__mAbortBroadcast.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedBoolean mFinished() {
                return this.__mFinished.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedBoolean mInitialStickyHint() {
                return this.__mInitialStickyHint.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedBoolean mOrderedHint() {
                return this.__mOrderedHint.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedInt mResultCode() {
                return this.__mResultCode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedObject<String> mResultData() {
                return this.__mResultData.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedObject<Bundle> mResultExtras() {
                return this.__mResultExtras.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedInt mSendingUser() {
                return this.__mSendingUser.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedObject<IBinder> mToken() {
                return this.__mToken.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17.PendingResult
            public NakedInt mType() {
                return this.__mType.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPendingResult");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setPendingResult", (Class<?>[]) new Class[]{BroadcastReceiver.PendingResult.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17
        public NakedMethod<BroadcastReceiver.PendingResult> getPendingResult() {
            return this.__getPendingResult.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CJ17
        public NakedMethod<Void> setPendingResult() {
            return this.__setPendingResult.get();
        }
    }

    @m
    public static final class Impl_CM23 implements BroadcastReceiverCAGI.CM23 {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) BroadcastReceiver.class);
        private InitOnceTry<NakedMethod<BroadcastReceiver.PendingResult>> __getPendingResult = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.G
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64764a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __setPendingResult = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.H
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f64765a.lambda$new$1();
            }
        });
        public Impl_PendingResult PendingResult = new Impl_PendingResult();

        @m
        public static final class Impl_PendingResult implements BroadcastReceiverCAGI.CM23.PendingResult {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) BroadcastReceiver.PendingResult.class);
            private InitOnceTry<NakedConstructor<BroadcastReceiver.PendingResult>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.I
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64766a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedBoolean> __mAbortBroadcast = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.N
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64771a.lambda$new$1();
                }
            });
            private InitOnceTry<NakedBoolean> __mFinished = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.O
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64772a.lambda$new$2();
                }
            });
            private InitOnceTry<NakedInt> __mFlags = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.P
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64773a.lambda$new$3();
                }
            });
            private InitOnceTry<NakedBoolean> __mInitialStickyHint = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.Q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64774a.lambda$new$4();
                }
            });
            private InitOnceTry<NakedBoolean> __mOrderedHint = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.S
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64775a.lambda$new$5();
                }
            });
            private InitOnceTry<NakedInt> __mResultCode = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.T
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64776a.lambda$new$6();
                }
            });
            private InitOnceTry<NakedObject<String>> __mResultData = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.U
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64777a.lambda$new$7();
                }
            });
            private InitOnceTry<NakedObject<Bundle>> __mResultExtras = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.J
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64767a.lambda$new$8();
                }
            });
            private InitOnceTry<NakedInt> __mSendingUser = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.K
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64768a.lambda$new$9();
                }
            });
            private InitOnceTry<NakedObject<IBinder>> __mToken = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.L
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64769a.lambda$new$10();
                }
            });
            private InitOnceTry<NakedInt> __mType = new InitOnceTry<>(new InitOnce.Init() { // from class: N8.M
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f64770a.lambda$new$11();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                Class clsORG_CLASS = ORG_CLASS();
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{cls, String.class, Bundle.class, cls, cls2, cls2, IBinder.class, cls, cls});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$1() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mAbortBroadcast");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$10() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mToken");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$11() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mType");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$2() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mFinished");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$3() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mFlags");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mInitialStickyHint");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$5() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "mOrderedHint");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$6() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mResultCode");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$7() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mResultData");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$8() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mResultExtras");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$9() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "mSendingUser");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedConstructor<BroadcastReceiver.PendingResult> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedBoolean mAbortBroadcast() {
                return this.__mAbortBroadcast.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedBoolean mFinished() {
                return this.__mFinished.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedInt mFlags() {
                return this.__mFlags.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedBoolean mInitialStickyHint() {
                return this.__mInitialStickyHint.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedBoolean mOrderedHint() {
                return this.__mOrderedHint.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedInt mResultCode() {
                return this.__mResultCode.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedObject<String> mResultData() {
                return this.__mResultData.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedObject<Bundle> mResultExtras() {
                return this.__mResultExtras.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedInt mSendingUser() {
                return this.__mSendingUser.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedObject<IBinder> mToken() {
                return this.__mToken.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23.PendingResult
            public NakedInt mType() {
                return this.__mType.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPendingResult");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "setPendingResult", (Class<?>[]) new Class[]{BroadcastReceiver.PendingResult.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23
        public NakedMethod<BroadcastReceiver.PendingResult> getPendingResult() {
            return this.__getPendingResult.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.BroadcastReceiverCAGI.CM23
        public NakedMethod<Void> setPendingResult() {
            return this.__setPendingResult.get();
        }
    }
}
