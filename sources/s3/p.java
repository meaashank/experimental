package s3;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.load.resource.bitmap.B;
import e.f0;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class p implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f0
    public static final String f238503f = "com.bumptech.glide.manager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f238504g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.k f238505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f238506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1520a<View, Fragment> f238507c = new C1520a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f238508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f238509e;

    public class a implements b {
        @Override // s3.p.b
        @NonNull
        public com.bumptech.glide.k a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull q qVar, @NonNull Context context) {
            return new com.bumptech.glide.k(cVar, jVar, qVar, context);
        }
    }

    public interface b {
        @NonNull
        com.bumptech.glide.k a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull q qVar, @NonNull Context context);
    }

    public p(@Nullable b bVar) {
        bVar = bVar == null ? f238504g : bVar;
        this.f238506b = bVar;
        this.f238509e = new m(bVar);
        this.f238508d = b();
    }

    @TargetApi(17)
    public static void a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static i b() {
        return (B.f139816g && B.f139815f) ? new h() : new f();
    }

    @Nullable
    public static Activity c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void d(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().J0(), map);
            }
        }
    }

    public static boolean m(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    @Nullable
    public final Fragment e(@NonNull View view, @NonNull androidx.fragment.app.r rVar) {
        this.f238507c.clear();
        d(rVar.getSupportFragmentManager().J0(), this.f238507c);
        View viewFindViewById = rVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f238507c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f238507c.clear();
        return fragment;
    }

    @NonNull
    @Deprecated
    public com.bumptech.glide.k f(@NonNull Activity activity) {
        return h(activity.getApplicationContext());
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.k g(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return h(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @NonNull
    public com.bumptech.glide.k h(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (y3.o.v() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.r) {
                return k((androidx.fragment.app.r) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return h(contextWrapper.getBaseContext());
                }
            }
        }
        return l(context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public com.bumptech.glide.k i(@NonNull View view) {
        if (y3.o.u()) {
            return h(view.getContext().getApplicationContext());
        }
        y3.m.e(view);
        y3.m.f(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityC = c(view.getContext());
        if (activityC == null) {
            return h(view.getContext().getApplicationContext());
        }
        if (!(activityC instanceof androidx.fragment.app.r)) {
            return h(view.getContext().getApplicationContext());
        }
        androidx.fragment.app.r rVar = (androidx.fragment.app.r) activityC;
        Fragment fragmentE = e(view, rVar);
        return fragmentE != null ? j(fragmentE) : k(rVar);
    }

    @NonNull
    public com.bumptech.glide.k j(@NonNull Fragment fragment) {
        y3.m.f(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (y3.o.u()) {
            return h(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f238508d.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f238509e.b(context, com.bumptech.glide.c.e(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @NonNull
    public com.bumptech.glide.k k(@NonNull androidx.fragment.app.r rVar) {
        if (y3.o.u()) {
            return h(rVar.getApplicationContext());
        }
        a(rVar);
        this.f238508d.a(rVar);
        boolean zM = m(rVar);
        return this.f238509e.b(rVar, com.bumptech.glide.c.e(rVar.getApplicationContext()), rVar.getLifecycle(), rVar.getSupportFragmentManager(), zM);
    }

    @NonNull
    public final com.bumptech.glide.k l(@NonNull Context context) {
        if (this.f238505a == null) {
            synchronized (this) {
                try {
                    if (this.f238505a == null) {
                        this.f238505a = this.f238506b.a(com.bumptech.glide.c.e(context.getApplicationContext()), new C5570a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f238505a;
    }
}
