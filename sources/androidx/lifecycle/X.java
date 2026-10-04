package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class X extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f114159b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f114160c = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f114161a;

    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final class b {
        public b() {
        }

        @dd.o
        public static /* synthetic */ void c(Activity activity) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dd.o
        public final void a(@NotNull Activity activity, @NotNull Lifecycle.Event event) {
            kotlin.jvm.internal.G.p(activity, "activity");
            kotlin.jvm.internal.G.p(event, "event");
            if (activity instanceof F) {
                ((F) activity).getLifecycle().o(event);
            } else if (activity instanceof B) {
                Lifecycle lifecycle = ((B) activity).getLifecycle();
                if (lifecycle instanceof D) {
                    ((D) lifecycle).o(event);
                }
            }
        }

        @dd.j(name = w7.i.f240158w)
        @NotNull
        public final X b(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(X.f114160c);
            kotlin.jvm.internal.G.n(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (X) fragmentFindFragmentByTag;
        }

        @dd.o
        public final void d(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(X.f114160c) == null) {
                fragmentManager.beginTransaction().add(new X(), X.f114160c).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public b(C4969v c4969v) {
        }
    }

    @e.T(29)
    public static final class c implements Application.ActivityLifecycleCallbacks {

        @NotNull
        public static final a Companion = new a();

        public static final class a {
            public a() {
            }

            @dd.o
            public final void a(@NotNull Activity activity) {
                kotlin.jvm.internal.G.p(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a(C4969v c4969v) {
            }
        }

        @dd.o
        public static final void registerIn(@NotNull Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.G.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            kotlin.jvm.internal.G.p(activity, "activity");
            kotlin.jvm.internal.G.p(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
        }
    }

    @dd.o
    public static final void b(@NotNull Activity activity, @NotNull Lifecycle.Event event) {
        f114159b.a(activity, event);
    }

    @dd.j(name = w7.i.f240158w)
    @NotNull
    public static final X f(@NotNull Activity activity) {
        return f114159b.b(activity);
    }

    @dd.o
    public static final void g(@NotNull Activity activity) {
        f114159b.d(activity);
    }

    public final void a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f114159b;
            Activity activity = getActivity();
            kotlin.jvm.internal.G.o(activity, "activity");
            bVar.a(activity, event);
        }
    }

    public final void c(a aVar) {
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    public final void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public final void h(@Nullable a aVar) {
        this.f114161a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        a(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(Lifecycle.Event.ON_DESTROY);
        this.f114161a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f114161a);
        a(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f114161a);
        a(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(Lifecycle.Event.ON_STOP);
    }
}
