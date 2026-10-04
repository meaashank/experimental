package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.k;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityC2390m;
import androidx.core.app.C2379b;
import androidx.core.app.C2382e;
import androidx.core.app.C2401y;
import androidx.core.app.N;
import androidx.core.app.O;
import androidx.core.app.P;
import androidx.core.app.U;
import androidx.core.util.InterfaceC2427d;
import androidx.core.view.M;
import androidx.lifecycle.InterfaceC2605s;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.X;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.d;
import b.InterfaceC2722a;
import d.AbstractC4282a;
import d.C4283b;
import e.InterfaceC4335i;
import e.InterfaceC4340n;
import e.InterfaceC4345t;
import e.T;
import ed.InterfaceC4376a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.L0;

/* JADX INFO: loaded from: classes.dex */
public class k extends ActivityC2390m implements InterfaceC2722a, androidx.lifecycle.B, q0, InterfaceC2605s, androidx.savedstate.f, G, androidx.activity.result.k, androidx.activity.result.b, B0.C, B0.D, O, N, P, M, A {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.j mActivityResultRegistry;

    @e.G
    private int mContentLayoutId;
    final b.b mContextAwareHelper;
    private m0.c mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final z mFullyDrawnReporter;
    private final androidx.lifecycle.D mLifecycleRegistry;
    private final androidx.core.view.P mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC2427d<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2427d<C2401y>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2427d<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC2427d<U>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2427d<Integer>> mOnTrimMemoryListeners;
    final j mReportFullyDrawnExecutor;
    final androidx.savedstate.e mSavedStateRegistryController;
    private p0 mViewModelStore;

    public class a extends androidx.activity.result.j {

        /* JADX INFO: renamed from: androidx.activity.k$a$a, reason: collision with other inner class name */
        public class RunnableC0160a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f85016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC4282a.C0707a f85017b;

            public RunnableC0160a(int i10, AbstractC4282a.C0707a c0707a) {
                this.f85016a = i10;
                this.f85017b = c0707a;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.f85016a, this.f85017b.f194516a);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f85019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f85020b;

            public b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f85019a = i10;
                this.f85020b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f85019a, 0, new Intent().setAction(C4283b.n.f194537b).putExtra(C4283b.n.f194539d, this.f85020b));
            }
        }

        public a() {
        }

        @Override // androidx.activity.result.j
        public <I, O> void f(int i10, @NonNull AbstractC4282a<I, O> abstractC4282a, I i11, @Nullable C2382e c2382e) {
            Bundle bundleN;
            int i12;
            k kVar = k.this;
            AbstractC4282a.C0707a<O> c0707aB = abstractC4282a.b(kVar, i11);
            if (c0707aB != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0160a(i10, c0707aB));
                return;
            }
            Intent intentA = abstractC4282a.a(kVar, i11);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(kVar.getClassLoader());
            }
            if (intentA.hasExtra(C4283b.m.f194535b)) {
                bundleN = intentA.getBundleExtra(C4283b.m.f194535b);
                intentA.removeExtra(C4283b.m.f194535b);
            } else {
                bundleN = c2382e != null ? c2382e.n() : null;
            }
            Bundle bundle = bundleN;
            if (C4283b.k.f194531b.equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra(C4283b.k.f194532c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C2379b.l(kVar, stringArrayExtra, i10);
                return;
            }
            if (!C4283b.n.f194537b.equals(intentA.getAction())) {
                kVar.startActivityForResult(intentA, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra(C4283b.n.f194538c);
            try {
                i12 = i10;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i12 = i10;
            }
            try {
                kVar.startIntentSenderForResult(intentSenderRequest.getIntentSender(), i12, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                new Handler(Looper.getMainLooper()).post(new b(i12, e));
            }
        }
    }

    public class b implements InterfaceC2611y {
        public b() {
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                Window window = k.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                }
            }
        }
    }

    public class c implements InterfaceC2611y {
        public c() {
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                k.this.mContextAwareHelper.f120563b = null;
                if (!k.this.isChangingConfigurations()) {
                    k.this.getViewModelStore().a();
                }
                k.this.mReportFullyDrawnExecutor.j2();
            }
        }
    }

    public class d implements InterfaceC2611y {
        public d() {
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.Event event) {
            k.this.ensureViewModelStore();
            k.this.getLifecycle().g(this);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }
    }

    public class f implements InterfaceC2611y {
        public f() {
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            k.this.mOnBackPressedDispatcher.s(h.a((k) b10));
        }
    }

    @T(19)
    public static class g {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @T(33)
    public static class h {
        @InterfaceC4345t
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f85027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p0 f85028b;
    }

    public interface j extends Executor {
        void j2();

        void r0(@NonNull View view);
    }

    /* JADX INFO: renamed from: androidx.activity.k$k, reason: collision with other inner class name */
    @T(16)
    public class ViewTreeObserverOnDrawListenerC0161k implements j, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f85030b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f85029a = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f85031c = false;

        public ViewTreeObserverOnDrawListenerC0161k() {
        }

        public static /* synthetic */ void a(ViewTreeObserverOnDrawListenerC0161k viewTreeObserverOnDrawListenerC0161k) {
            Runnable runnable = viewTreeObserverOnDrawListenerC0161k.f85030b;
            if (runnable != null) {
                runnable.run();
                viewTreeObserverOnDrawListenerC0161k.f85030b = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f85030b = runnable;
            View decorView = k.this.getWindow().getDecorView();
            if (!this.f85031c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.ViewTreeObserverOnDrawListenerC0161k.a(this.f85034a);
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.k.j
        public void j2() {
            k.this.getWindow().getDecorView().removeCallbacks(this);
            k.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f85030b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f85029a) {
                    this.f85031c = false;
                    k.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f85030b = null;
            if (k.this.mFullyDrawnReporter.e()) {
                this.f85031c = false;
                k.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // androidx.activity.k.j
        public void r0(@NonNull View view) {
            if (this.f85031c) {
                return;
            }
            this.f85031c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static class l implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f85033a = a();

        @NonNull
        public final Handler a() {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            return new Handler(looperMyLooper);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f85033a.postAtFrontOfQueue(runnable);
        }

        @Override // androidx.activity.k.j
        public void j2() {
        }

        @Override // androidx.activity.k.j
        public void r0(@NonNull View view) {
        }
    }

    public k() {
        this.mContextAwareHelper = new b.b();
        this.mMenuHostHelper = new androidx.core.view.P(new Runnable() { // from class: androidx.activity.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f85011a.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new androidx.lifecycle.D(this);
        androidx.savedstate.e eVarA = androidx.savedstate.e.f117363d.a(this);
        this.mSavedStateRegistryController = eVarA;
        this.mOnBackPressedDispatcher = null;
        ViewTreeObserverOnDrawListenerC0161k viewTreeObserverOnDrawListenerC0161k = new ViewTreeObserverOnDrawListenerC0161k();
        this.mReportFullyDrawnExecutor = viewTreeObserverOnDrawListenerC0161k;
        this.mFullyDrawnReporter = new z(viewTreeObserverOnDrawListenerC0161k, new InterfaceC4376a() { // from class: androidx.activity.h
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                k.J0(this.f85012a);
                return null;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        getLifecycle().c(new b());
        getLifecycle().c(new c());
        getLifecycle().c(new d());
        eVarA.c();
        d0.c(this);
        if (i10 <= 23) {
            getLifecycle().c(new B(this));
        }
        getSavedStateRegistry().j(ACTIVITY_RESULT_TAG, new d.c() { // from class: androidx.activity.i
            @Override // androidx.savedstate.d.c
            public final Bundle a() {
                return k.I0(this.f85013a);
            }
        });
        addOnContextAvailableListener(new b.c() { // from class: androidx.activity.j
            @Override // b.c
            public final void a(Context context) {
                k.H0(this.f85014a, context);
            }
        });
    }

    public static /* synthetic */ void H0(k kVar, Context context) {
        Bundle bundleB = kVar.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            kVar.mActivityResultRegistry.g(bundleB);
        }
    }

    public static /* synthetic */ Bundle I0(k kVar) {
        kVar.getClass();
        Bundle bundle = new Bundle();
        kVar.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    public static /* synthetic */ L0 J0(k kVar) {
        kVar.reportFullyDrawn();
        return null;
    }

    public final j K0() {
        return new ViewTreeObserverOnDrawListenerC0161k();
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.r0(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.M
    public void addMenuProvider(@NonNull androidx.core.view.U u10) {
        this.mMenuHostHelper.c(u10);
    }

    @Override // B0.C
    public final void addOnConfigurationChangedListener(@NonNull InterfaceC2427d<Configuration> interfaceC2427d) {
        this.mOnConfigurationChangedListeners.add(interfaceC2427d);
    }

    @Override // b.InterfaceC2722a
    public final void addOnContextAvailableListener(@NonNull b.c cVar) {
        this.mContextAwareHelper.a(cVar);
    }

    @Override // androidx.core.app.N
    public final void addOnMultiWindowModeChangedListener(@NonNull InterfaceC2427d<C2401y> interfaceC2427d) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC2427d);
    }

    @Override // androidx.core.app.O
    public final void addOnNewIntentListener(@NonNull InterfaceC2427d<Intent> interfaceC2427d) {
        this.mOnNewIntentListeners.add(interfaceC2427d);
    }

    @Override // androidx.core.app.P
    public final void addOnPictureInPictureModeChangedListener(@NonNull InterfaceC2427d<U> interfaceC2427d) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC2427d);
    }

    @Override // B0.D
    public final void addOnTrimMemoryListener(@NonNull InterfaceC2427d<Integer> interfaceC2427d) {
        this.mOnTrimMemoryListeners.add(interfaceC2427d);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.mViewModelStore = iVar.f85028b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new p0();
            }
        }
    }

    @Override // androidx.activity.result.k
    @NonNull
    public final androidx.activity.result.j getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC2605s
    @NonNull
    @InterfaceC4335i
    public R1.a getDefaultViewModelCreationExtras() {
        R1.e eVar = new R1.e();
        if (getApplication() != null) {
            eVar.c(m0.a.f114364h, getApplication());
        }
        eVar.c(d0.f114319c, this);
        eVar.c(d0.f114320d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.c(d0.f114321e, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.InterfaceC2605s
    @NonNull
    public m0.c getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new f0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.activity.A
    @NonNull
    public z getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f85027a;
        }
        return null;
    }

    @Override // androidx.core.app.ActivityC2390m, androidx.lifecycle.B
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.G
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new e(), null);
            getLifecycle().c(new f());
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.f
    @NonNull
    public final androidx.savedstate.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f117365b;
    }

    @Override // androidx.lifecycle.q0
    @NonNull
    public p0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @InterfaceC4335i
    public void initializeViewTreeOwners() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(getWindow().getDecorView(), this);
        ViewTreeFullyDrawnReporterOwner.b(getWindow().getDecorView(), this);
    }

    @Override // androidx.core.view.M
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC4335i
    @Deprecated
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @e.I
    @InterfaceC4335i
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().p();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @InterfaceC4335i
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC2427d<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        X.f114159b.d(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @NonNull Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.h(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC4335i
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC2427d<C2401y>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C2401y(z10));
        }
    }

    @Override // android.app.Activity
    @InterfaceC4335i
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC2427d<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        this.mMenuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @InterfaceC4335i
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC2427d<U>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new U(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, @Nullable View view, @NonNull Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC4335i
    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra(C4283b.k.f194532c, strArr).putExtra(C4283b.k.f194533d, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        p0 p0Var = this.mViewModelStore;
        if (p0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            p0Var = iVar.f85028b;
        }
        if (p0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f85027a = objOnRetainCustomNonConfigurationInstance;
        iVar2.f85028b = p0Var;
        return iVar2;
    }

    @Override // androidx.core.app.ActivityC2390m, android.app.Activity
    @InterfaceC4335i
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.D) {
            ((androidx.lifecycle.D) lifecycle).v(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @InterfaceC4335i
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<InterfaceC2427d<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // b.InterfaceC2722a
    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f120563b;
    }

    @Override // androidx.activity.result.b
    @NonNull
    public final <I, O> androidx.activity.result.g<I> registerForActivityResult(@NonNull AbstractC4282a<I, O> abstractC4282a, @NonNull androidx.activity.result.j jVar, @NonNull androidx.activity.result.a<O> aVar) {
        return jVar.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC4282a, aVar);
    }

    @Override // androidx.core.view.M
    public void removeMenuProvider(@NonNull androidx.core.view.U u10) {
        this.mMenuHostHelper.j(u10);
    }

    @Override // B0.C
    public final void removeOnConfigurationChangedListener(@NonNull InterfaceC2427d<Configuration> interfaceC2427d) {
        this.mOnConfigurationChangedListeners.remove(interfaceC2427d);
    }

    @Override // b.InterfaceC2722a
    public final void removeOnContextAvailableListener(@NonNull b.c cVar) {
        this.mContextAwareHelper.e(cVar);
    }

    @Override // androidx.core.app.N
    public final void removeOnMultiWindowModeChangedListener(@NonNull InterfaceC2427d<C2401y> interfaceC2427d) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC2427d);
    }

    @Override // androidx.core.app.O
    public final void removeOnNewIntentListener(@NonNull InterfaceC2427d<Intent> interfaceC2427d) {
        this.mOnNewIntentListeners.remove(interfaceC2427d);
    }

    @Override // androidx.core.app.P
    public final void removeOnPictureInPictureModeChangedListener(@NonNull InterfaceC2427d<U> interfaceC2427d) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC2427d);
    }

    @Override // B0.D
    public final void removeOnTrimMemoryListener(@NonNull InterfaceC2427d<Integer> interfaceC2427d) {
        this.mOnTrimMemoryListeners.remove(interfaceC2427d);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (z2.b.i()) {
                Trace.beginSection(z2.b.m("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.d();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@e.G int i10) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.r0(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // androidx.core.view.M
    public void addMenuProvider(@NonNull androidx.core.view.U u10, @NonNull androidx.lifecycle.B b10) {
        this.mMenuHostHelper.d(u10, b10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // androidx.core.view.M
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull androidx.core.view.U u10, @NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.e(u10, b10, state);
    }

    @Override // android.app.Activity
    @T(api = 26)
    @InterfaceC4335i
    public void onMultiWindowModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC2427d<C2401y>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C2401y(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @T(api = 26)
    @InterfaceC4335i
    public void onPictureInPictureModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC2427d<U>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new U(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.activity.result.b
    @NonNull
    public final <I, O> androidx.activity.result.g<I> registerForActivityResult(@NonNull AbstractC4282a<I, O> abstractC4282a, @NonNull androidx.activity.result.a<O> aVar) {
        return registerForActivityResult(abstractC4282a, this.mActivityResultRegistry, aVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.r0(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.r0(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @InterfaceC4340n
    public k(@e.G int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
