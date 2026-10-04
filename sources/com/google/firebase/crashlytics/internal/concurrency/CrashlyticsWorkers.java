package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import dd.o;
import ed.InterfaceC4376a;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsWorkers {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static boolean enforcement;

    @dd.g
    @NotNull
    public final CrashlyticsWorker common;

    @dd.g
    @NotNull
    public final CrashlyticsWorker dataCollect;

    @dd.g
    @NotNull
    public final CrashlyticsWorker diskWrite;

    @dd.g
    @NotNull
    public final CrashlyticsWorker network;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        private final void checkThread(InterfaceC4376a<Boolean> interfaceC4376a, InterfaceC4376a<String> interfaceC4376a2) {
            if (interfaceC4376a.invoke().booleanValue()) {
                return;
            }
            Logger.getLogger().d(interfaceC4376a2.invoke());
            getEnforcement();
        }

        @o
        public static /* synthetic */ void getEnforcement$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getThreadName() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            G.o(threadName, "threadName");
            return M.p3(threadName, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            G.o(threadName, "threadName");
            return M.p3(threadName, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        @o
        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new InterfaceC4376a<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2
                @Override // ed.InterfaceC4376a
                @NotNull
                public final String invoke() {
                    return "Must be called on a background thread, was called on " + CrashlyticsWorkers.Companion.getThreadName() + '.';
                }
            });
        }

        @o
        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new InterfaceC4376a<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2
                @Override // ed.InterfaceC4376a
                @NotNull
                public final String invoke() {
                    return "Must be called on a blocking thread, was called on " + CrashlyticsWorkers.Companion.getThreadName() + '.';
                }
            });
        }

        @o
        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new InterfaceC4376a<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2
                @Override // ed.InterfaceC4376a
                @NotNull
                public final String invoke() {
                    return "Must not be called on a main thread, was called on " + CrashlyticsWorkers.Companion.getThreadName() + '.';
                }
            });
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z10) {
            CrashlyticsWorkers.enforcement = z10;
        }

        private Companion() {
        }
    }

    public CrashlyticsWorkers(@NotNull ExecutorService backgroundExecutorService, @NotNull ExecutorService blockingExecutorService) {
        G.p(backgroundExecutorService, "backgroundExecutorService");
        G.p(blockingExecutorService, "blockingExecutorService");
        this.common = new CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new CrashlyticsWorker(backgroundExecutorService);
        this.network = new CrashlyticsWorker(blockingExecutorService);
    }

    @o
    public static final void checkBackgroundThread() {
        Companion.checkBackgroundThread();
    }

    @o
    public static final void checkBlockingThread() {
        Companion.checkBlockingThread();
    }

    @o
    public static final void checkNotMainThread() {
        Companion.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return Companion.getEnforcement();
    }

    public static final void setEnforcement(boolean z10) {
        Companion.setEnforcement(z10);
    }
}
