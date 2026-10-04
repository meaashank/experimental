package U9;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.launcher3.AllAppsList;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.model.BaseModelUpdateTask;
import com.android.launcher3.model.BgDataModel;
import com.android.launcher3.model.PackageUpdatedTask;
import com.android.launcher3.util.ItemInfoMatcher;
import g6.C4455a;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d1 extends BaseModelUpdateTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f74031a = com.prism.commons.utils.l0.b(d1.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HandlerThread f74032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Handler f74033c;

    public class a extends d1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ItemInfoMatcher f74034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f74035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f74036f;

        public a(ItemInfoMatcher itemInfoMatcher, e eVar, CountDownLatch countDownLatch) {
            this.f74034d = itemInfoMatcher;
            this.f74035e = eVar;
            this.f74036f = countDownLatch;
        }

        public final /* synthetic */ void G(e eVar, ArrayList arrayList, CountDownLatch countDownLatch) {
            try {
                eVar.a(this, arrayList);
            } catch (Throwable th) {
                try {
                    Log.e(d1.f74031a, "findShortcutsAsync UI callback error: " + th.getMessage(), th);
                } finally {
                    countDownLatch.countDown();
                }
            }
        }

        @Override // com.android.launcher3.model.BaseModelUpdateTask
        public void execute(LauncherAppState launcherAppState, BgDataModel bgDataModel, AllAppsList allAppsList) {
            final ArrayList<ShortcutInfo> arrayListF = U0.f(this.f74034d);
            Log.d(d1.f74031a, "findShortcutsAsync found:" + arrayListF.size());
            g6.k kVarB = C4455a.b().b();
            final e eVar = this.f74035e;
            final CountDownLatch countDownLatch = this.f74036f;
            kVarB.execute(new Runnable() { // from class: U9.c1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74025a.G(eVar, arrayListF, countDownLatch);
                }
            });
        }
    }

    public class b extends d1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ItemInfoMatcher f74037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f74038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f74039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d f74040g;

        public b(ItemInfoMatcher itemInfoMatcher, CountDownLatch countDownLatch, f fVar, d dVar) {
            this.f74037d = itemInfoMatcher;
            this.f74038e = countDownLatch;
            this.f74039f = fVar;
            this.f74040g = dVar;
        }

        public final /* synthetic */ void G(f fVar, ArrayList arrayList, d dVar, CountDownLatch countDownLatch) {
            try {
                ArrayList<ShortcutInfo> arrayListA = fVar.a(arrayList);
                int size = arrayListA.size();
                int i10 = 0;
                while (i10 < size) {
                    ShortcutInfo shortcutInfo = arrayListA.get(i10);
                    i10++;
                    getModelWriter().updateItemInDatabase(shortcutInfo);
                }
                bindUpdatedShortcuts(arrayListA, Process.myUserHandle());
                if (dVar != null) {
                    dVar.a(arrayListA);
                }
            } catch (Throwable th) {
                try {
                    Log.e(d1.f74031a, "updShortcutsAsync UI callback error: " + th.getMessage(), th);
                } finally {
                    countDownLatch.countDown();
                }
            }
        }

        @Override // com.android.launcher3.model.BaseModelUpdateTask
        public void execute(LauncherAppState launcherAppState, BgDataModel bgDataModel, AllAppsList allAppsList) {
            final ArrayList<ShortcutInfo> arrayListF = U0.f(this.f74037d);
            if (arrayListF.isEmpty()) {
                this.f74038e.countDown();
                return;
            }
            g6.k kVarB = C4455a.b().b();
            final f fVar = this.f74039f;
            final d dVar = this.f74040g;
            final CountDownLatch countDownLatch = this.f74038e;
            kVarB.execute(new Runnable() { // from class: U9.e1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74046a.G(fVar, arrayListF, dVar, countDownLatch);
                }
            });
        }
    }

    public class c extends d1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ItemInfoMatcher f74041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f74042e;

        public c(ItemInfoMatcher itemInfoMatcher, CountDownLatch countDownLatch) {
            this.f74041d = itemInfoMatcher;
            this.f74042e = countDownLatch;
        }

        public final /* synthetic */ void G(ItemInfoMatcher itemInfoMatcher, CountDownLatch countDownLatch) {
            try {
                deleteAndBindComponentsRemoved(itemInfoMatcher);
            } catch (Throwable th) {
                try {
                    Log.e(d1.f74031a, "delShortcutsAsync UI callback error: " + th.getMessage(), th);
                } finally {
                    countDownLatch.countDown();
                }
            }
        }

        @Override // com.android.launcher3.model.BaseModelUpdateTask
        public void execute(LauncherAppState launcherAppState, BgDataModel bgDataModel, AllAppsList allAppsList) {
            g6.k kVarB = C4455a.b().b();
            final ItemInfoMatcher itemInfoMatcher = this.f74041d;
            final CountDownLatch countDownLatch = this.f74042e;
            kVarB.execute(new Runnable() { // from class: U9.f1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74059a.G(itemInfoMatcher, countDownLatch);
                }
            });
        }
    }

    public interface d {
        void a(ArrayList<ShortcutInfo> arrayList);
    }

    public interface e {
        void a(BaseModelUpdateTask baseModelUpdateTask, ArrayList<ShortcutInfo> arrayList);
    }

    public interface f {
        ArrayList<ShortcutInfo> a(ArrayList<ShortcutInfo> arrayList);
    }

    public static void B(LauncherModel launcherModel, ItemInfoMatcher itemInfoMatcher, f fVar) {
        C(launcherModel, itemInfoMatcher, fVar, null);
    }

    public static void C(final LauncherModel launcherModel, final ItemInfoMatcher itemInfoMatcher, final f fVar, @Nullable final d dVar) {
        x(new Runnable() { // from class: U9.X0
            @Override // java.lang.Runnable
            public final void run() {
                d1.e(launcherModel, itemInfoMatcher, fVar, dVar);
            }
        });
    }

    public static void D(LauncherModel launcherModel, String str, f fVar) {
        C(launcherModel, ItemInfoMatcher.ofPackage(str), fVar, null);
    }

    public static void E(LauncherModel launcherModel, String str, f fVar, @Nullable d dVar) {
        C(launcherModel, ItemInfoMatcher.ofPackage(str), fVar, dVar);
    }

    public static /* synthetic */ ArrayList b(int i10, ArrayList arrayList) {
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            com.prism.hider.utils.m.u((ShortcutInfo) obj, i10);
        }
        return arrayList;
    }

    public static /* synthetic */ void c(Runnable runnable) {
        Handler handler = f74033c;
        if (handler != null) {
            handler.post(runnable);
            return;
        }
        Log.d(f74031a, "create consistence thread");
        HandlerThread handlerThread = new HandlerThread("nameless_model_update_task", -1);
        f74032b = handlerThread;
        handlerThread.start();
        Handler handler2 = new Handler(f74032b.getLooper());
        f74033c = handler2;
        handler2.post(runnable);
    }

    public static /* synthetic */ void d(LauncherModel launcherModel, ItemInfoMatcher itemInfoMatcher, e eVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        launcherModel.enqueueModelUpdateTask(new a(itemInfoMatcher, eVar, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Log.e(f74031a, "findShortcutsAsync consistence thread wait for UI sync" + e10.getMessage(), e10);
        }
    }

    public static /* synthetic */ void e(LauncherModel launcherModel, ItemInfoMatcher itemInfoMatcher, f fVar, d dVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        launcherModel.enqueueModelUpdateTask(new b(itemInfoMatcher, countDownLatch, fVar, dVar));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Log.e(f74031a, "updShortcutsAsync consistence thread wait for UI sync" + e10.getMessage(), e10);
        }
    }

    public static /* synthetic */ ArrayList f(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ShortcutInfo) obj).status = 0;
        }
        return arrayList;
    }

    public static /* synthetic */ void g(LauncherModel launcherModel, ItemInfoMatcher itemInfoMatcher) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        launcherModel.enqueueModelUpdateTask(new c(itemInfoMatcher, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Log.e(f74031a, "delShortcutsAsync consistence thread wait for UI sync" + e10.getMessage(), e10);
        }
    }

    public static void i(LauncherModel launcherModel, F f10) {
        j(launcherModel, U0.k(f10));
    }

    public static void j(LauncherModel launcherModel, ItemInfoMatcher itemInfoMatcher) {
        C(launcherModel, itemInfoMatcher, new b1(), null);
    }

    public static void k(LauncherModel launcherModel, String str) {
        j(launcherModel, ItemInfoMatcher.ofPackage(str));
    }

    public static void m(LauncherModel launcherModel, F f10) {
        n(launcherModel, U0.k(f10));
    }

    public static void n(final LauncherModel launcherModel, final ItemInfoMatcher itemInfoMatcher) {
        x(new Runnable() { // from class: U9.a1
            @Override // java.lang.Runnable
            public final void run() {
                d1.g(launcherModel, itemInfoMatcher);
            }
        });
    }

    public static void o(LauncherModel launcherModel, String str) {
        n(launcherModel, ItemInfoMatcher.ofPackage(str));
    }

    public static void q(LauncherModel launcherModel, F f10, e eVar) {
        s(launcherModel, U0.k(f10), eVar);
    }

    public static void s(final LauncherModel launcherModel, final ItemInfoMatcher itemInfoMatcher, final e eVar) {
        x(new Runnable() { // from class: U9.W0
            @Override // java.lang.Runnable
            public final void run() {
                d1.d(launcherModel, itemInfoMatcher, eVar);
            }
        });
    }

    public static void t(LauncherModel launcherModel, F f10, int i10) {
        u(launcherModel, U0.k(f10), i10);
    }

    public static void u(LauncherModel launcherModel, ItemInfoMatcher itemInfoMatcher, final int i10) {
        C(launcherModel, itemInfoMatcher, new f() { // from class: U9.Z0
            @Override // U9.d1.f
            public final ArrayList a(ArrayList arrayList) {
                d1.b(i10, arrayList);
                return arrayList;
            }
        }, null);
    }

    public static void v(LauncherModel launcherModel, String str, int i10) {
        u(launcherModel, ItemInfoMatcher.ofPackage(str), i10);
    }

    public static void w(LauncherModel launcherModel, String... strArr) {
        launcherModel.enqueueModelUpdateTask(new PackageUpdatedTask(2, Process.myUserHandle(), strArr));
    }

    public static void x(final Runnable runnable) {
        if (f74033c == null) {
            C4455a.b().b().execute(new Runnable() { // from class: U9.Y0
                @Override // java.lang.Runnable
                public final void run() {
                    d1.c(runnable);
                }
            });
        } else if (f74032b.getThreadId() == Process.myTid()) {
            runnable.run();
        } else {
            f74033c.post(runnable);
        }
    }

    public static void z(LauncherModel launcherModel, F f10, f fVar) {
        C(launcherModel, U0.k(f10), fVar, null);
    }
}
