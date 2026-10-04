package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.o;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import e.InterfaceC4326A;
import e.f0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SidecarCompat implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f120104f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f120105g = "SidecarCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final SidecarInterface f120106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SidecarAdapter f120107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<IBinder, Activity> f120108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<Activity, ComponentCallbacks> f120109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public o.a f120110e;

    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SidecarAdapter f120111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SidecarInterface.SidecarCallback f120112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f120113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @InterfaceC4326A("lock")
        @Nullable
        public SidecarDeviceState f120114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @InterfaceC4326A("mLock")
        @NotNull
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f120115e;

        public DistinctSidecarElementCallback(@NotNull SidecarAdapter sidecarAdapter, @NotNull SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.G.p(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.G.p(callbackInterface, "callbackInterface");
            this.f120111a = sidecarAdapter;
            this.f120112b = callbackInterface;
            this.f120113c = new ReentrantLock();
            this.f120115e = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.G.p(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f120113c;
            reentrantLock.lock();
            try {
                if (this.f120111a.a(this.f120114d, newDeviceState)) {
                    return;
                }
                this.f120114d = newDeviceState;
                this.f120112b.onDeviceStateChanged(newDeviceState);
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.G.p(token, "token");
            kotlin.jvm.internal.G.p(newLayout, "newLayout");
            synchronized (this.f120113c) {
                if (this.f120111a.d(this.f120115e.get(token), newLayout)) {
                    return;
                }
                this.f120115e.put(token, newLayout);
                this.f120112b.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SidecarCompat f120116a;

        public TranslatingCallback(SidecarCompat this$0) {
            kotlin.jvm.internal.G.p(this$0, "this$0");
            this.f120116a = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterface;
            kotlin.jvm.internal.G.p(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f120116a.f120108c.values();
            SidecarCompat sidecarCompat = this.f120116a;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f120104f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterface = sidecarCompat.f120106a) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinderA);
                }
                o.a aVar = sidecarCompat.f120110e;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.f120107b.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.G.p(windowToken, "windowToken");
            kotlin.jvm.internal.G.p(newLayout, "newLayout");
            Activity activity = this.f120116a.f120108c.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.f120105g, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarCompat sidecarCompat = this.f120116a;
            SidecarAdapter sidecarAdapter = sidecarCompat.f120107b;
            SidecarInterface sidecarInterface = sidecarCompat.f120106a;
            SidecarDeviceState deviceState = sidecarInterface == null ? null : sidecarInterface.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            B bE = sidecarAdapter.e(newLayout, deviceState);
            o.a aVar = this.f120116a.f120110e;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, bE);
        }
    }

    public static final class a {
        public a() {
        }

        @Nullable
        public final IBinder a(@Nullable Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @Nullable
        public final SidecarInterface b(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @Nullable
        public final Version c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.f120053f.e(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final o.a f120117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f120118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @InterfaceC4326A("mLock")
        @NotNull
        public final WeakHashMap<Activity, B> f120119c;

        public b(@NotNull o.a callbackInterface) {
            kotlin.jvm.internal.G.p(callbackInterface, "callbackInterface");
            this.f120117a = callbackInterface;
            this.f120118b = new ReentrantLock();
            this.f120119c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.o.a
        public void a(@NotNull Activity activity, @NotNull B newLayout) {
            kotlin.jvm.internal.G.p(activity, "activity");
            kotlin.jvm.internal.G.p(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f120118b;
            reentrantLock.lock();
            try {
                if (newLayout.equals(this.f120119c.get(activity))) {
                    return;
                }
                this.f120119c.put(activity, newLayout);
                reentrantLock.unlock();
                this.f120117a.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SidecarCompat f120120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final WeakReference<Activity> f120121b;

        public c(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            kotlin.jvm.internal.G.p(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.G.p(activity, "activity");
            this.f120120a = sidecarCompat;
            this.f120121b = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            kotlin.jvm.internal.G.p(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f120121b.get();
            IBinder iBinderA = SidecarCompat.f120104f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f120120a.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            kotlin.jvm.internal.G.p(view, "view");
        }
    }

    public static final class d implements ComponentCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f120123b;

        public d(Activity activity) {
            this.f120123b = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            kotlin.jvm.internal.G.p(newConfig, "newConfig");
            SidecarCompat sidecarCompat = SidecarCompat.this;
            o.a aVar = sidecarCompat.f120110e;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f120123b;
            aVar.a(activity, sidecarCompat.i(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    @f0
    public SidecarCompat(@f0 @Nullable SidecarInterface sidecarInterface, @NotNull SidecarAdapter sidecarAdapter) {
        kotlin.jvm.internal.G.p(sidecarAdapter, "sidecarAdapter");
        this.f120106a = sidecarInterface;
        this.f120107b = sidecarAdapter;
        this.f120108c = new LinkedHashMap();
        this.f120109d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.o
    public void a(@NotNull o.a extensionCallback) {
        kotlin.jvm.internal.G.p(extensionCallback, "extensionCallback");
        this.f120110e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f120106a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f120107b, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.o
    @SuppressLint({"BanUncheckedReflection"})
    public boolean b() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f120106a;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.G.g(returnType, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.G.C("Illegal return type for 'setSidecarCallback': ", returnType));
            }
            SidecarInterface sidecarInterface2 = this.f120106a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f120106a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f120106a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!kotlin.jvm.internal.G.g(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.G.C("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
            }
            SidecarInterface sidecarInterface5 = this.f120106a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!kotlin.jvm.internal.G.g(returnType3, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.G.C("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
            }
            SidecarInterface sidecarInterface6 = this.f120106a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!kotlin.jvm.internal.G.g(returnType4, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.G.C("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType4));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.G.o(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (!arrayList.equals((List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    @Override // androidx.window.layout.o
    public void c(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        IBinder iBinderA = f120104f.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.o
    public void d(@NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.G.p(activity, "activity");
        IBinder iBinderA = f120104f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f120106a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        l(activity);
        boolean z10 = this.f120108c.size() == 1;
        this.f120108c.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.f120106a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Nullable
    public final SidecarInterface h() {
        return this.f120106a;
    }

    @f0
    @NotNull
    public final B i(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        IBinder iBinderA = f120104f.a(activity);
        if (iBinderA == null) {
            return new B(EmptyList.f217510a);
        }
        SidecarInterface sidecarInterface = this.f120106a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderA);
        SidecarAdapter sidecarAdapter = this.f120107b;
        SidecarInterface sidecarInterface2 = this.f120106a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.e(windowLayoutInfo, deviceState);
    }

    public final void j(@NotNull IBinder windowToken, @NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.G.p(windowToken, "windowToken");
        kotlin.jvm.internal.G.p(activity, "activity");
        this.f120108c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f120106a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f120108c.size() == 1 && (sidecarInterface = this.f120106a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        o.a aVar = this.f120110e;
        if (aVar != null) {
            aVar.a(activity, i(activity));
        }
        k(activity);
    }

    public final void k(Activity activity) {
        if (this.f120109d.get(activity) == null) {
            d dVar = new d(activity);
            this.f120109d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    public final void l(Activity activity) {
        activity.unregisterComponentCallbacks(this.f120109d.get(activity));
        this.f120109d.remove(activity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@NotNull Context context) {
        this(f120104f.b(context), new SidecarAdapter(null, 1, null));
        kotlin.jvm.internal.G.p(context, "context");
    }
}
