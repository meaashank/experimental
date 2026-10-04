package com.prism.gaia.naked.metadata.android.app;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ActivityThreadCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165276G = new Impl_G();
    public static Impl_J16 J16 = new Impl_J16();
    public static Impl_J17 J17 = new Impl_J17();
    public static Impl_N24_P28 N24_P28 = new Impl_N24_P28();
    public static Impl_Q29 Q29 = new Impl_Q29();
    public static Impl_S31 S31 = new Impl_S31();
    public static Impl_ProviderKeyS31 ProviderKeyS31 = new Impl_ProviderKeyS31();
    public static Impl_T33 T33 = new Impl_T33();
    public static Impl_U34 U34 = new Impl_U34();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165275C = new Impl_C();

    @W6.m
    public static final class Impl_C implements ActivityThreadCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ActivityThread");
        private InitOnceTry<NakedObject<Object>> __mAllApplications = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.B
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165279a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedMethod<Void>> __performNewIntents = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.C
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165284a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedMethod<InstrumentationInfo>> __prepareInstrumentation = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.D
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165290a.lambda$new$2();
            }
        });
        public Impl_ResultData ResultData = new Impl_ResultData();

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public Impl_H f165277H = new Impl_H();

        @W6.m
        public static final class Impl_H implements ActivityThreadCAGI.C.H {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ActivityThread$H");
            private InitOnceTry<NakedStaticInt> __LAUNCH_ACTIVITY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.E
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165296a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedStaticInt> __PAUSE_ACTIVITY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.G
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165306a.lambda$new$1();
                }
            });
            private InitOnceTry<NakedStaticInt> __PAUSE_ACTIVITY_FINISHING = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.T
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165385a.lambda$new$2();
                }
            });
            private InitOnceTry<NakedStaticInt> __STOP_ACTIVITY_SHOW = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.f0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165443a.lambda$new$3();
                }
            });
            private InitOnceTry<NakedStaticInt> __STOP_ACTIVITY_HIDE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.r0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165533a.lambda$new$4();
                }
            });
            private InitOnceTry<NakedStaticInt> __SHOW_WINDOW = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.u0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165549a.lambda$new$5();
                }
            });
            private InitOnceTry<NakedStaticInt> __HIDE_WINDOW = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.v0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165554a.lambda$new$6();
                }
            });
            private InitOnceTry<NakedStaticInt> __RESUME_ACTIVITY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.w0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165559a.lambda$new$7();
                }
            });
            private InitOnceTry<NakedStaticInt> __SEND_RESULT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.y0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165569a.lambda$new$8();
                }
            });
            private InitOnceTry<NakedStaticInt> __DESTROY_ACTIVITY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.z0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165574a.lambda$new$9();
                }
            });
            private InitOnceTry<NakedStaticInt> __BIND_APPLICATION = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.P
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165365a.lambda$new$10();
                }
            });
            private InitOnceTry<NakedStaticInt> __EXIT_APPLICATION = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.b0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165422a.lambda$new$11();
                }
            });
            private InitOnceTry<NakedStaticInt> __NEW_INTENT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.m0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165508a.lambda$new$12();
                }
            });
            private InitOnceTry<NakedStaticInt> __RECEIVER = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.x0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165564a.lambda$new$13();
                }
            });
            private InitOnceTry<NakedStaticInt> __CREATE_SERVICE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.A0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165265a.lambda$new$14();
                }
            });
            private InitOnceTry<NakedStaticInt> __SERVICE_ARGS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.B0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165280a.lambda$new$15();
                }
            });
            private InitOnceTry<NakedStaticInt> __STOP_SERVICE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.C0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165285a.lambda$new$16();
                }
            });
            private InitOnceTry<NakedStaticInt> __CONFIGURATION_CHANGED = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.D0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165291a.lambda$new$17();
                }
            });
            private InitOnceTry<NakedStaticInt> __CLEAN_UP_CONTEXT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.E0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165297a.lambda$new$18();
                }
            });
            private InitOnceTry<NakedStaticInt> __GC_WHEN_IDLE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.F
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165301a.lambda$new$19();
                }
            });
            private InitOnceTry<NakedStaticInt> __BIND_SERVICE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.H
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165311a.lambda$new$20();
                }
            });
            private InitOnceTry<NakedStaticInt> __UNBIND_SERVICE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.I
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165316a.lambda$new$21();
                }
            });
            private InitOnceTry<NakedStaticInt> __DUMP_SERVICE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.J
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165332a.lambda$new$22();
                }
            });
            private InitOnceTry<NakedStaticInt> __LOW_MEMORY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.K
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165337a.lambda$new$23();
                }
            });
            private InitOnceTry<NakedStaticInt> __PROFILER_CONTROL = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.L
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165341a.lambda$new$24();
                }
            });
            private InitOnceTry<NakedStaticInt> __CREATE_BACKUP_AGENT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.M
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165349a.lambda$new$25();
                }
            });
            private InitOnceTry<NakedStaticInt> __DESTROY_BACKUP_AGENT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.N
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165353a.lambda$new$26();
                }
            });
            private InitOnceTry<NakedStaticInt> __SUICIDE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.O
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165361a.lambda$new$27();
                }
            });
            private InitOnceTry<NakedStaticInt> __REMOVE_PROVIDER = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165371a.lambda$new$28();
                }
            });
            private InitOnceTry<NakedStaticInt> __ENABLE_JIT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.S
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165379a.lambda$new$29();
                }
            });
            private InitOnceTry<NakedStaticInt> __DISPATCH_PACKAGE_BROADCAST = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.U
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165389a.lambda$new$30();
                }
            });
            private InitOnceTry<NakedStaticInt> __SCHEDULE_CRASH = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.V
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165393a.lambda$new$31();
                }
            });
            private InitOnceTry<NakedStaticInt> __DUMP_HEAP = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.W
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165397a.lambda$new$32();
                }
            });
            private InitOnceTry<NakedStaticInt> __DUMP_ACTIVITY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.X
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165401a.lambda$new$33();
                }
            });
            private InitOnceTry<NakedStaticInt> __SLEEPING = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Y
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165405a.lambda$new$34();
                }
            });
            private InitOnceTry<NakedStaticInt> __SET_CORE_SETTINGS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Z
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165409a.lambda$new$35();
                }
            });
            private InitOnceTry<NakedStaticInt> __UPDATE_PACKAGE_COMPATIBILITY_INFO = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.a0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165414a.lambda$new$36();
                }
            });
            private InitOnceTry<NakedStaticInt> __DUMP_PROVIDER = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.c0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165428a.lambda$new$37();
                }
            });
            private InitOnceTry<NakedStaticInt> __UNSTABLE_PROVIDER_DIED = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.d0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165433a.lambda$new$38();
                }
            });
            private InitOnceTry<NakedStaticInt> __REQUEST_ASSIST_CONTEXT_EXTRAS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.e0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165438a.lambda$new$39();
                }
            });
            private InitOnceTry<NakedStaticInt> __TRANSLUCENT_CONVERSION_COMPLETE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.g0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165448a.lambda$new$40();
                }
            });
            private InitOnceTry<NakedStaticInt> __INSTALL_PROVIDER = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.h0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165453a.lambda$new$41();
                }
            });
            private InitOnceTry<NakedStaticInt> __ON_NEW_ACTIVITY_OPTIONS = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.i0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165458a.lambda$new$42();
                }
            });
            private InitOnceTry<NakedStaticInt> __ENTER_ANIMATION_COMPLETE = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.j0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165463a.lambda$new$43();
                }
            });
            private InitOnceTry<NakedStaticInt> __START_BINDER_TRACKING = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.k0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165498a.lambda$new$44();
                }
            });
            private InitOnceTry<NakedStaticInt> __STOP_BINDER_TRACKING_AND_DUMP = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.l0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165503a.lambda$new$45();
                }
            });
            private InitOnceTry<NakedStaticInt> __LOCAL_VOICE_INTERACTION_STARTED = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.n0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165513a.lambda$new$46();
                }
            });
            private InitOnceTry<NakedStaticInt> __ATTACH_AGENT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.o0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165518a.lambda$new$47();
                }
            });
            private InitOnceTry<NakedStaticInt> __APPLICATION_INFO_CHANGED = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.p0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165523a.lambda$new$48();
                }
            });
            private InitOnceTry<NakedStaticInt> __RUN_ISOLATED_ENTRY_POINT = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.q0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165528a.lambda$new$49();
                }
            });
            private InitOnceTry<NakedStaticInt> __EXECUTE_TRANSACTION = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.s0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165539a.lambda$new$50();
                }
            });
            private InitOnceTry<NakedStaticInt> __RELAUNCH_ACTIVITY = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.t0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165544a.lambda$new$51();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "LAUNCH_ACTIVITY");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$1() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "PAUSE_ACTIVITY");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$10() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "BIND_APPLICATION");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$11() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "EXIT_APPLICATION");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$12() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "NEW_INTENT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$13() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "RECEIVER");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$14() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "CREATE_SERVICE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$15() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SERVICE_ARGS");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$16() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "STOP_SERVICE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$17() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "CONFIGURATION_CHANGED");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$18() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "CLEAN_UP_CONTEXT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$19() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "GC_WHEN_IDLE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$2() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "PAUSE_ACTIVITY_FINISHING");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$20() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "BIND_SERVICE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$21() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "UNBIND_SERVICE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$22() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DUMP_SERVICE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$23() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "LOW_MEMORY");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$24() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "PROFILER_CONTROL");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$25() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "CREATE_BACKUP_AGENT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$26() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DESTROY_BACKUP_AGENT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$27() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SUICIDE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$28() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "REMOVE_PROVIDER");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$29() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "ENABLE_JIT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$3() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "STOP_ACTIVITY_SHOW");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$30() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DISPATCH_PACKAGE_BROADCAST");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$31() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SCHEDULE_CRASH");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$32() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DUMP_HEAP");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$33() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DUMP_ACTIVITY");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$34() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SLEEPING");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$35() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SET_CORE_SETTINGS");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$36() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "UPDATE_PACKAGE_COMPATIBILITY_INFO");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$37() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DUMP_PROVIDER");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$38() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "UNSTABLE_PROVIDER_DIED");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$39() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "REQUEST_ASSIST_CONTEXT_EXTRAS");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$4() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "STOP_ACTIVITY_HIDE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$40() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "TRANSLUCENT_CONVERSION_COMPLETE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$41() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "INSTALL_PROVIDER");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$42() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "ON_NEW_ACTIVITY_OPTIONS");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$43() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "ENTER_ANIMATION_COMPLETE");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$44() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "START_BINDER_TRACKING");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$45() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "STOP_BINDER_TRACKING_AND_DUMP");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$46() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "LOCAL_VOICE_INTERACTION_STARTED");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$47() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "ATTACH_AGENT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$48() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "APPLICATION_INFO_CHANGED");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$49() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "RUN_ISOLATED_ENTRY_POINT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$5() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SHOW_WINDOW");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$50() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "EXECUTE_TRANSACTION");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$51() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "RELAUNCH_ACTIVITY");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$6() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "HIDE_WINDOW");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$7() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "RESUME_ACTIVITY");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$8() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "SEND_RESULT");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticInt lambda$new$9() throws Exception {
                return new NakedStaticInt((Class<?>) ORG_CLASS(), "DESTROY_ACTIVITY");
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt APPLICATION_INFO_CHANGED() {
                return this.__APPLICATION_INFO_CHANGED.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt ATTACH_AGENT() {
                return this.__ATTACH_AGENT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt BIND_APPLICATION() {
                return this.__BIND_APPLICATION.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt BIND_SERVICE() {
                return this.__BIND_SERVICE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt CLEAN_UP_CONTEXT() {
                return this.__CLEAN_UP_CONTEXT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt CONFIGURATION_CHANGED() {
                return this.__CONFIGURATION_CHANGED.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt CREATE_BACKUP_AGENT() {
                return this.__CREATE_BACKUP_AGENT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt CREATE_SERVICE() {
                return this.__CREATE_SERVICE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DESTROY_ACTIVITY() {
                return this.__DESTROY_ACTIVITY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DESTROY_BACKUP_AGENT() {
                return this.__DESTROY_BACKUP_AGENT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DISPATCH_PACKAGE_BROADCAST() {
                return this.__DISPATCH_PACKAGE_BROADCAST.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DUMP_ACTIVITY() {
                return this.__DUMP_ACTIVITY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DUMP_HEAP() {
                return this.__DUMP_HEAP.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DUMP_PROVIDER() {
                return this.__DUMP_PROVIDER.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt DUMP_SERVICE() {
                return this.__DUMP_SERVICE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt ENABLE_JIT() {
                return this.__ENABLE_JIT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt ENTER_ANIMATION_COMPLETE() {
                return this.__ENTER_ANIMATION_COMPLETE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt EXECUTE_TRANSACTION() {
                return this.__EXECUTE_TRANSACTION.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt EXIT_APPLICATION() {
                return this.__EXIT_APPLICATION.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt GC_WHEN_IDLE() {
                return this.__GC_WHEN_IDLE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt HIDE_WINDOW() {
                return this.__HIDE_WINDOW.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt INSTALL_PROVIDER() {
                return this.__INSTALL_PROVIDER.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt LAUNCH_ACTIVITY() {
                return this.__LAUNCH_ACTIVITY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt LOCAL_VOICE_INTERACTION_STARTED() {
                return this.__LOCAL_VOICE_INTERACTION_STARTED.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt LOW_MEMORY() {
                return this.__LOW_MEMORY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt NEW_INTENT() {
                return this.__NEW_INTENT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt ON_NEW_ACTIVITY_OPTIONS() {
                return this.__ON_NEW_ACTIVITY_OPTIONS.get();
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt PAUSE_ACTIVITY() {
                return this.__PAUSE_ACTIVITY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt PAUSE_ACTIVITY_FINISHING() {
                return this.__PAUSE_ACTIVITY_FINISHING.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt PROFILER_CONTROL() {
                return this.__PROFILER_CONTROL.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt RECEIVER() {
                return this.__RECEIVER.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt RELAUNCH_ACTIVITY() {
                return this.__RELAUNCH_ACTIVITY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt REMOVE_PROVIDER() {
                return this.__REMOVE_PROVIDER.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt REQUEST_ASSIST_CONTEXT_EXTRAS() {
                return this.__REQUEST_ASSIST_CONTEXT_EXTRAS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt RESUME_ACTIVITY() {
                return this.__RESUME_ACTIVITY.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt RUN_ISOLATED_ENTRY_POINT() {
                return this.__RUN_ISOLATED_ENTRY_POINT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SCHEDULE_CRASH() {
                return this.__SCHEDULE_CRASH.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SEND_RESULT() {
                return this.__SEND_RESULT.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SERVICE_ARGS() {
                return this.__SERVICE_ARGS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SET_CORE_SETTINGS() {
                return this.__SET_CORE_SETTINGS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SHOW_WINDOW() {
                return this.__SHOW_WINDOW.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SLEEPING() {
                return this.__SLEEPING.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt START_BINDER_TRACKING() {
                return this.__START_BINDER_TRACKING.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt STOP_ACTIVITY_HIDE() {
                return this.__STOP_ACTIVITY_HIDE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt STOP_ACTIVITY_SHOW() {
                return this.__STOP_ACTIVITY_SHOW.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt STOP_BINDER_TRACKING_AND_DUMP() {
                return this.__STOP_BINDER_TRACKING_AND_DUMP.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt STOP_SERVICE() {
                return this.__STOP_SERVICE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt SUICIDE() {
                return this.__SUICIDE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt TRANSLUCENT_CONVERSION_COMPLETE() {
                return this.__TRANSLUCENT_CONVERSION_COMPLETE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt UNBIND_SERVICE() {
                return this.__UNBIND_SERVICE.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt UNSTABLE_PROVIDER_DIED() {
                return this.__UNSTABLE_PROVIDER_DIED.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.H
            public NakedStaticInt UPDATE_PACKAGE_COMPATIBILITY_INFO() {
                return this.__UPDATE_PACKAGE_COMPATIBILITY_INFO.get();
            }
        }

        @W6.m
        public static final class Impl_ResultData implements ActivityThreadCAGI.C.ResultData {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.app.ActivityThread$ResultData");
            private InitOnceTry<NakedObject<IBinder>> __token = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.F0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165302a.lambda$new$0();
                }
            });
            private InitOnceTry<NakedObject<Object>> __results = new InitOnceTry<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.G0
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165307a.lambda$new$1();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), BidResponsed.KEY_TOKEN);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "results");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.ResultData
            public NakedObject<Object> results() {
                return this.__results.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C.ResultData
            public NakedObject<IBinder> token() {
                return this.__token.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mAllApplications");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "performNewIntents", (Class<?>[]) new Class[]{IBinder.class, List.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "prepareInstrumentation", new String[]{"android.app.ActivityThread$AppBindData"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C
        public NakedObject<Object> mAllApplications() {
            return this.__mAllApplications.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C
        public NakedMethod<Void> performNewIntents() {
            return this.__performNewIntents.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.C
        public NakedMethod<InstrumentationInfo> prepareInstrumentation() {
            return this.__prepareInstrumentation.get();
        }
    }

    @W6.l
    public static final class Impl_G implements ActivityThreadCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedStaticMethod> __currentActivityThread = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.H0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165312a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Map<IBinder, Object>>> __mActivities = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.J0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165333a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<String>> __getProcessName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.L0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165342a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Handler>> __getHandler = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.M0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165350a.lambda$new$3();
            }
        });
        private InitOnce<NakedMethod<Object>> __installProvider = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.N0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165354a.lambda$new$4();
            }
        });
        private InitOnce<NakedMethod<Void>> __handleCreateService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.O0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165362a.lambda$new$5();
            }
        });
        private InitOnce<NakedMethod<Void>> __handleServiceArgs = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.P0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165366a.lambda$new$6();
            }
        });
        private InitOnce<NakedMethod<Void>> __handleBindService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Q0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165372a.lambda$new$7();
            }
        });
        private InitOnce<NakedMethod<Void>> __handleUnbindService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.R0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165375a.lambda$new$8();
            }
        });
        private InitOnce<NakedMethod<Void>> __handleStopService = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.T0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165386a.lambda$new$9();
            }
        });
        private InitOnce<NakedObject<Object>> __mBoundApplication = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.S0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165380a.lambda$new$10();
            }
        });
        private InitOnce<NakedObject<Handler>> __mH = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.U0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165390a.lambda$new$11();
            }
        });
        private InitOnce<NakedObject<Application>> __mInitialApplication = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.V0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165394a.lambda$new$12();
            }
        });
        private InitOnce<NakedObject<Instrumentation>> __mInstrumentation = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.W0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165398a.lambda$new$13();
            }
        });
        private InitOnce<NakedObject<Map<String, WeakReference<?>>>> __mPackages = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.X0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165402a.lambda$new$14();
            }
        });
        private InitOnce<NakedObject<Map<IBinder, Service>>> __mServices = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Y0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165406a.lambda$new$15();
            }
        });
        private InitOnce<NakedObject<Map>> __mProviderMap = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Z0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165410a.lambda$new$16();
            }
        });
        private InitOnce<NakedObject<Object>> __mResourcesManager = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.a1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165415a.lambda$new$17();
            }
        });
        private InitOnce<NakedStaticObject<IInterface>> __sPackageManager = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.b1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165423a.lambda$new$18();
            }
        });
        private InitOnce<NakedMethod<Void>> __sendActivityResult = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.I0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165317a.lambda$new$19();
            }
        });
        private InitOnce<NakedMethod<Binder>> __getApplicationThread = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.K0
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165338a.lambda$new$20();
            }
        });
        public Impl_ActivityClientRecord ActivityClientRecord = new Impl_ActivityClientRecord();
        public Impl_ProviderClientRecord ProviderClientRecord = new Impl_ProviderClientRecord();
        public Impl_CreateServiceData CreateServiceData = new Impl_CreateServiceData();
        public Impl_ServiceArgsData ServiceArgsData = new Impl_ServiceArgsData();
        public Impl_BindServiceData BindServiceData = new Impl_BindServiceData();
        public Impl_AppBindData AppBindData = new Impl_AppBindData();
        public Impl_NewIntentData NewIntentData = new Impl_NewIntentData();

        @W6.l
        public static final class Impl_ActivityClientRecord implements ActivityThreadCAGI.G.ActivityClientRecord {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$ActivityClientRecord");
            private InitOnce<NakedObject<Activity>> __activity = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.c1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165429a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<ActivityInfo>> __activityInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.d1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165434a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<Object>> __packageInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.e1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165439a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<Intent>> __intent = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.f1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165444a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<IBinder>> __token = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.g1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165449a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "activity");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "activityInfo");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "packageInfo");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "intent");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), BidResponsed.KEY_TOKEN);
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ActivityClientRecord
            public NakedObject<Activity> activity() {
                return this.__activity.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ActivityClientRecord
            public NakedObject<ActivityInfo> activityInfo() {
                return this.__activityInfo.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ActivityClientRecord
            public NakedObject<Intent> intent() {
                return this.__intent.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ActivityClientRecord
            public NakedObject<Object> packageInfo() {
                return this.__packageInfo.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ActivityClientRecord
            public NakedObject<IBinder> token() {
                return this.__token.get();
            }
        }

        @W6.l
        public static final class Impl_AppBindData implements ActivityThreadCAGI.G.AppBindData {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$AppBindData");
            private InitOnce<NakedObject<ApplicationInfo>> __appInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.h1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165454a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Object>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.i1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165459a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<String>> __processName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.j1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165464a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<ComponentName>> __instrumentationName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.k1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165499a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<List<ProviderInfo>>> __providers = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.l1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165504a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "appInfo");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), GProcessClient.f164193t);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "instrumentationName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "providers");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.AppBindData
            public NakedObject<ApplicationInfo> appInfo() {
                return this.__appInfo.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.AppBindData
            public NakedObject<Object> info() {
                return this.__info.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.AppBindData
            public NakedObject<ComponentName> instrumentationName() {
                return this.__instrumentationName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.AppBindData
            public NakedObject<String> processName() {
                return this.__processName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.AppBindData
            public NakedObject<List<ProviderInfo>> providers() {
                return this.__providers.get();
            }
        }

        @W6.l
        public static final class Impl_BindServiceData implements ActivityThreadCAGI.G.BindServiceData {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$BindServiceData");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.m1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165509a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<IBinder>> __token = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.n1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165514a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<Intent>> __intent = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.o1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165519a.lambda$new$2();
                }
            });
            private InitOnce<NakedBoolean> __rebind = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.p1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165524a.lambda$new$3();
                }
            });
            private InitOnce<NakedObject<IBinder>> __bindToken = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.q1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165529a.lambda$new$4();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor(ORG_CLASS());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), BidResponsed.KEY_TOKEN);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "intent");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$3() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "rebind");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$4() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "bindToken");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.BindServiceData
            public NakedObject<IBinder> bindToken() {
                return this.__bindToken.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.BindServiceData
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.BindServiceData
            public NakedObject<Intent> intent() {
                return this.__intent.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.BindServiceData
            public NakedBoolean rebind() {
                return this.__rebind.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.BindServiceData
            public NakedObject<IBinder> token() {
                return this.__token.get();
            }
        }

        @W6.l
        public static final class Impl_CreateServiceData implements ActivityThreadCAGI.G.CreateServiceData {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$CreateServiceData");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.r1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165534a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<IBinder>> __token = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.s1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165540a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<ServiceInfo>> __info = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.t1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165545a.lambda$new$2();
                }
            });
            private InitOnce<NakedObject<Object>> __compatInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.u1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165550a.lambda$new$3();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor(ORG_CLASS());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), BidResponsed.KEY_TOKEN);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "info");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$3() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "compatInfo");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.CreateServiceData
            public NakedObject<Object> compatInfo() {
                return this.__compatInfo.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.CreateServiceData
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.CreateServiceData
            public NakedObject<ServiceInfo> info() {
                return this.__info.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.CreateServiceData
            public NakedObject<IBinder> token() {
                return this.__token.get();
            }
        }

        @W6.l
        public static final class Impl_NewIntentData implements ActivityThreadCAGI.G.NewIntentData {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$NewIntentData");
            private InitOnce<NakedObject<Object>> __intents = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.v1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165555a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "intents");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.NewIntentData
            public NakedObject<Object> intents() {
                return this.__intents.get();
            }
        }

        @W6.l
        public static final class Impl_ProviderClientRecord implements ActivityThreadCAGI.G.ProviderClientRecord {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$ProviderClientRecord");
            private InitOnce<NakedConstructor<?>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.w1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165560a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<String>> __mName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.x1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165565a.lambda$new$1();
                }
            });
            private InitOnce<NakedObject<IInterface>> __mProvider = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.y1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165570a.lambda$new$2();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), new String[]{"android.app.ActivityThread", "java.lang.String", "android.content.IContentProvider", "android.content.ContentProvider"});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mName");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$2() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mProvider");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ProviderClientRecord
            public NakedConstructor<?> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ProviderClientRecord
            public NakedObject<String> mName() {
                return this.__mName.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ProviderClientRecord
            public NakedObject<IInterface> mProvider() {
                return this.__mProvider.get();
            }
        }

        @W6.l
        public static final class Impl_ServiceArgsData implements ActivityThreadCAGI.G.ServiceArgsData {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$ServiceArgsData");
            private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.z1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165575a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<IBinder>> __token = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.A1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165266a.lambda$new$1();
                }
            });
            private InitOnce<NakedInt> __startId = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.B1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165281a.lambda$new$2();
                }
            });
            private InitOnce<NakedInt> __flags = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.C1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165286a.lambda$new$3();
                }
            });
            private InitOnce<NakedBoolean> __taskRemoved = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.D1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165292a.lambda$new$4();
                }
            });
            private InitOnce<NakedObject<Intent>> __args = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.E1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165298a.lambda$new$5();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor(ORG_CLASS());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), BidResponsed.KEY_TOKEN);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$2() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "startId");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedInt lambda$new$3() throws Exception {
                return new NakedInt((Class<?>) ORG_CLASS(), "flags");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedBoolean lambda$new$4() throws Exception {
                return new NakedBoolean((Class<?>) ORG_CLASS(), "taskRemoved");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$5() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "args");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ServiceArgsData
            public NakedObject<Intent> args() {
                return this.__args.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ServiceArgsData
            public NakedConstructor<Object> ctor() {
                return this.__ctor.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ServiceArgsData
            public NakedInt flags() {
                return this.__flags.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ServiceArgsData
            public NakedInt startId() {
                return this.__startId.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ServiceArgsData
            public NakedBoolean taskRemoved() {
                return this.__taskRemoved.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G.ServiceArgsData
            public NakedObject<IBinder> token() {
                return this.__token.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "currentActivityThread");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActivities");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$10() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mBoundApplication");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$11() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mH");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$12() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInitialApplication");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$13() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInstrumentation");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$14() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mPackages");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$15() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mServices");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$16() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mProviderMap");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$17() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mResourcesManager");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$18() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "sPackageManager");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$19() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedMethod((Class<?>) clsORG_CLASS, "sendActivityResult", (Class<?>[]) new Class[]{IBinder.class, String.class, cls, cls, Intent.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getProcessName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$20() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getApplicationThread");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getHandler");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "installProvider");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$5() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleCreateService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$6() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleServiceArgs");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$7() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleBindService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$8() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleUnbindService");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$9() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleStopService");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedStaticMethod currentActivityThread() {
            return this.__currentActivityThread.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Binder> getApplicationThread() {
            return this.__getApplicationThread.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Handler> getHandler() {
            return this.__getHandler.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<String> getProcessName() {
            return this.__getProcessName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Void> handleBindService() {
            return this.__handleBindService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Void> handleCreateService() {
            return this.__handleCreateService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Void> handleServiceArgs() {
            return this.__handleServiceArgs.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Void> handleStopService() {
            return this.__handleStopService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Void> handleUnbindService() {
            return this.__handleUnbindService.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Object> installProvider() {
            return this.__installProvider.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Map<IBinder, Object>> mActivities() {
            return this.__mActivities.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Object> mBoundApplication() {
            return this.__mBoundApplication.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Handler> mH() {
            return this.__mH.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Application> mInitialApplication() {
            return this.__mInitialApplication.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Instrumentation> mInstrumentation() {
            return this.__mInstrumentation.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Map<String, WeakReference<?>>> mPackages() {
            return this.__mPackages.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Map> mProviderMap() {
            return this.__mProviderMap.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Object> mResourcesManager() {
            return this.__mResourcesManager.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedObject<Map<IBinder, Service>> mServices() {
            return this.__mServices.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedStaticObject<IInterface> sPackageManager() {
            return this.__sPackageManager.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.G
        public NakedMethod<Void> sendActivityResult() {
            return this.__sendActivityResult.get();
        }
    }

    @W6.l
    public static final class Impl_J16 implements ActivityThreadCAGI.J16 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedMethod<Object>> __getPackageInfoNoCheck = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.F1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165303a.lambda$new$0();
            }
        });
        public Impl_ProviderClientRecord ProviderClientRecord = new Impl_ProviderClientRecord();

        @W6.l
        public static final class Impl_ProviderClientRecord implements ActivityThreadCAGI.J16.ProviderClientRecord {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$ProviderClientRecord");
            private InitOnce<NakedObject<Object>> __mHolder = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.G1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165308a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<IInterface>> __mProvider = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.H1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165313a.lambda$new$1();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mHolder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mProvider");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.J16.ProviderClientRecord
            public NakedObject<Object> mHolder() {
                return this.__mHolder.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.J16.ProviderClientRecord
            public NakedObject<IInterface> mProvider() {
                return this.__mProvider.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPackageInfoNoCheck", new String[]{"android.content.pm.ApplicationInfo", "android.content.res.CompatibilityInfo"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.J16
        public NakedMethod<Object> getPackageInfoNoCheck() {
            return this.__getPackageInfoNoCheck.get();
        }
    }

    public static final class Impl_J17 implements ActivityThreadCAGI.J17 {
        public Impl_ProviderKey ProviderKey = new Impl_ProviderKey();

        @W6.l
        public static final class Impl_ProviderKey implements ActivityThreadCAGI.J17.ProviderKey {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$ProviderKey");
            private InitOnce<NakedConstructor<?>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.I1
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165318a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
                return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{String.class, Integer.TYPE});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.J17.ProviderKey
            public NakedConstructor<?> ctor() {
                return this.__ctor.get();
            }
        }
    }

    @W6.l
    public static final class Impl_N24_P28 implements ActivityThreadCAGI.N24_P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedMethod<Void>> __performNewIntents = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.J1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165334a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "performNewIntents", (Class<?>[]) new Class[]{IBinder.class, List.class, Boolean.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.N24_P28
        public NakedMethod<Void> performNewIntents() {
            return this.__performNewIntents.get();
        }
    }

    @W6.l
    public static final class Impl_ProviderKeyS31 implements ActivityThreadCAGI.ProviderKeyS31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread$ProviderKey");
        private InitOnce<NakedObject<Object>> __mLock = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.K1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165339a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Object>> __mHolder = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.L1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165343a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mLock");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mHolder");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.ProviderKeyS31
        public NakedObject<Object> mHolder() {
            return this.__mHolder.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.ProviderKeyS31
        public NakedObject<Object> mLock() {
            return this.__mLock.get();
        }
    }

    @W6.l
    public static final class Impl_Q29 implements ActivityThreadCAGI.Q29 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedMethod<Void>> __handleNewIntent = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.M1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165351a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleNewIntent", (Class<?>[]) new Class[]{IBinder.class, List.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.Q29
        public NakedMethod<Void> handleNewIntent() {
            return this.__handleNewIntent.get();
        }
    }

    @W6.l
    public static final class Impl_S31 implements ActivityThreadCAGI.S31 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedObject<Map<IBinder, Object>>> __mActivities = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.N1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165355a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<Map<IBinder, Object>>> __mLaunchingActivities = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.O1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165363a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __handleNewIntent = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.P1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165367a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Object>> __getGetProviderKey = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.Q1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165373a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mActivities");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mLaunchingActivities");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "handleNewIntent", new String[]{"android.app.ActivityThread$ActivityClientRecord", "java.util.List"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getGetProviderKey", new String[]{"java.lang.String", "int"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.S31
        public NakedMethod<Object> getGetProviderKey() {
            return this.__getGetProviderKey.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.S31
        public NakedMethod<Void> handleNewIntent() {
            return this.__handleNewIntent.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.S31
        public NakedObject<Map<IBinder, Object>> mActivities() {
            return this.__mActivities.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.S31
        public NakedObject<Map<IBinder, Object>> mLaunchingActivities() {
            return this.__mLaunchingActivities.get();
        }
    }

    @W6.l
    public static final class Impl_T33 implements ActivityThreadCAGI.T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedMethod<Object>> __getPackageInfoNoCheck = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.R1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165376a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPackageInfoNoCheck", new String[]{"android.content.pm.ApplicationInfo", "android.content.res.CompatibilityInfo", x.b.f238265f});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.T33
        public NakedMethod<Object> getPackageInfoNoCheck() {
            return this.__getPackageInfoNoCheck.get();
        }
    }

    @W6.l
    public static final class Impl_U34 implements ActivityThreadCAGI.U34 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ActivityThread");
        private InitOnce<NakedMethod<Object>> __getPackageInfoNoCheck = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.S1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165381a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getPackageInfoNoCheck", new String[]{"android.content.pm.ApplicationInfo"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ActivityThreadCAGI.U34
        public NakedMethod<Object> getPackageInfoNoCheck() {
            return this.__getPackageInfoNoCheck.get();
        }
    }
}
