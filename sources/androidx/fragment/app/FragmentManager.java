package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.C2401y;
import androidx.core.util.InterfaceC2427d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.U;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.d;
import com.bumptech.glide.load.engine.GlideException;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import d.AbstractC4282a;
import d.C4283b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u1.C5637a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentManager implements P {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f113556S = "android:support:fragments";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f113557T = "state";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f113558U = "result_";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f113559V = "fragment_";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static boolean f113560W = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f113561X = "FragmentManager";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f113562Y = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f113563Z = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public androidx.activity.result.g<Intent> f113567D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public androidx.activity.result.g<IntentSenderRequest> f113568E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public androidx.activity.result.g<String[]> f113569F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f113571H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f113572I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f113573J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f113574K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f113575L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList<C2563a> f113576M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList<Boolean> f113577N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList<Fragment> f113578O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public L f113579P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public FragmentStrictMode.Policy f113580Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f113583b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<C2563a> f113585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f113586e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f113588g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<p> f113594m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC2584w<?> f113603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC2581t f113604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Fragment f113605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Fragment f113606y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<q> f113582a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f113584c = new T();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C2587z f113587f = new LayoutInflaterFactory2C2587z(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.activity.C f113589h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f113590i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, BackStackState> f113591j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f113592k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, o> f113593l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A f113595n = new A(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList<M> f113596o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC2427d<Configuration> f113597p = new InterfaceC2427d() { // from class: androidx.fragment.app.B
        @Override // androidx.core.util.InterfaceC2427d
        public final void accept(Object obj) {
            FragmentManager.i(this.f113488a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC2427d<Integer> f113598q = new InterfaceC2427d() { // from class: androidx.fragment.app.C
        @Override // androidx.core.util.InterfaceC2427d
        public final void accept(Object obj) {
            FragmentManager.e(this.f113489a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC2427d<C2401y> f113599r = new InterfaceC2427d() { // from class: androidx.fragment.app.D
        @Override // androidx.core.util.InterfaceC2427d
        public final void accept(Object obj) {
            FragmentManager.h(this.f113490a, (C2401y) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC2427d<androidx.core.app.U> f113600s = new InterfaceC2427d() { // from class: androidx.fragment.app.E
        @Override // androidx.core.util.InterfaceC2427d
        public final void accept(Object obj) {
            FragmentManager.g(this.f113509a, (androidx.core.app.U) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.core.view.U f113601t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f113602u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2583v f113607z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C2583v f113564A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f0 f113565B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public f0 f113566C = new e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f113570G = new ArrayDeque<>();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Runnable f113581R = new f();

    public class a implements androidx.activity.result.a<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f113570G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i11 = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentI = FragmentManager.this.f113584c.i(str);
            if (fragmentI == null) {
                androidx.constraintlayout.motion.widget.r.a("Permission request result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
            }
        }
    }

    public class b extends androidx.activity.C {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.C
        public void g() {
            FragmentManager.this.T0();
        }
    }

    public class c implements androidx.core.view.U {
        public c() {
        }

        @Override // androidx.core.view.U
        public void a(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.K(menu, menuInflater);
        }

        @Override // androidx.core.view.U
        public void b(@NonNull Menu menu) {
            FragmentManager.this.S(menu);
        }

        @Override // androidx.core.view.U
        public void c(@NonNull Menu menu) {
            FragmentManager.this.W(menu);
        }

        @Override // androidx.core.view.U
        public boolean d(@NonNull MenuItem menuItem) {
            return FragmentManager.this.R(menuItem);
        }
    }

    public class d extends C2583v {
        public d() {
        }

        @Override // androidx.fragment.app.C2583v
        @NonNull
        public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.K0().b(FragmentManager.this.K0().f(), str, null);
        }
    }

    public class e implements f0 {
        public e() {
        }

        @Override // androidx.fragment.app.f0
        @NonNull
        public SpecialEffectsController a(@NonNull ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

    public class g implements InterfaceC2611y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f113614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O f113615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f113616c;

        public g(String str, O o10, Lifecycle lifecycle) {
            this.f113614a = str;
            this.f113615b = o10;
            this.f113616c = lifecycle;
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.Event event) {
            Bundle bundle;
            if (event == Lifecycle.Event.ON_START && (bundle = FragmentManager.this.f113592k.get(this.f113614a)) != null) {
                this.f113615b.a(this.f113614a, bundle);
                FragmentManager.this.d(this.f113614a);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f113616c.g(this);
                FragmentManager.this.f113593l.remove(this.f113614a);
            }
        }
    }

    public class h implements M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f113618a;

        public h(Fragment fragment) {
            this.f113618a = fragment;
        }

        @Override // androidx.fragment.app.M
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.f113618a.onAttachFragment(fragment);
        }
    }

    public class i implements androidx.activity.result.a<ActivityResult> {
        public i() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.f113570G.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollLast.mWho;
            int i10 = launchedFragmentInfoPollLast.mRequestCode;
            Fragment fragmentI = FragmentManager.this.f113584c.i(str);
            if (fragmentI == null) {
                androidx.constraintlayout.motion.widget.r.a("Activity result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                fragmentI.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
            }
        }
    }

    public class j implements androidx.activity.result.a<ActivityResult> {
        public j() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f113570G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i10 = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentI = FragmentManager.this.f113584c.i(str);
            if (fragmentI == null) {
                androidx.constraintlayout.motion.widget.r.a("Intent Sender result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                fragmentI.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
            }
        }
    }

    public interface k {
        @Nullable
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @e.Z
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Nullable
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @e.Z
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @Nullable
        String getName();
    }

    public class l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113622a;

        public l(@NonNull String str) {
            this.f113622a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z(arrayList, arrayList2, this.f113622a);
        }
    }

    public static class m extends AbstractC4282a<IntentSenderRequest, ActivityResult> {
        @Override // d.AbstractC4282a
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(C4283b.n.f194537b);
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(C4283b.m.f194535b)) != null) {
                intent.putExtra(C4283b.m.f194535b, bundleExtra);
                fillInIntent.removeExtra(C4283b.m.f194535b);
                if (fillInIntent.getBooleanExtra(FragmentManager.f113563Z, false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).build();
                }
            }
            intent.putExtra(C4283b.n.f194538c, intentSenderRequest);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // d.AbstractC4282a
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class n {
        @Deprecated
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void d(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void e(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void g(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void h(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void j(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void l(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        public void n(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    public static class o implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f113624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O f113625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2611y f113626c;

        public o(@NonNull Lifecycle lifecycle, @NonNull O o10, @NonNull InterfaceC2611y interfaceC2611y) {
            this.f113624a = lifecycle;
            this.f113625b = o10;
            this.f113626c = interfaceC2611y;
        }

        @Override // androidx.fragment.app.O
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.f113625b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.f113624a.d().isAtLeast(state);
        }

        public void c() {
            this.f113624a.g(this.f113626c);
        }
    }

    public interface p {
        @e.I
        void a(@NonNull Fragment fragment, boolean z10);

        @e.I
        void b(@NonNull Fragment fragment, boolean z10);

        @e.I
        void onBackStackChanged();
    }

    public interface q {
        boolean a(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class r implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f113629c;

        public r(@Nullable String str, int i10, int i11) {
            this.f113627a = str;
            this.f113628b = i10;
            this.f113629c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f113606y;
            if (fragment == null || this.f113628b >= 0 || this.f113627a != null || !fragment.getChildFragmentManager().r1()) {
                return FragmentManager.this.v1(arrayList, arrayList2, this.f113627a, this.f113628b, this.f113629c);
            }
            return false;
        }
    }

    public class s implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113631a;

        public s(@NonNull String str) {
            this.f113631a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.G1(arrayList, arrayList2, this.f113631a);
        }
    }

    public class t implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113633a;

        public t(@NonNull String str) {
            this.f113633a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.O1(arrayList, arrayList2, this.f113633a);
        }
    }

    public static int K1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return U.f113740I;
        }
        if (i10 == 8197) {
            return U.f113743L;
        }
        if (i10 == 4099) {
            return U.f113742K;
        }
        if (i10 != 4100) {
            return 0;
        }
        return U.f113744M;
    }

    @Nullable
    public static Fragment R0(@NonNull View view) {
        Object tag = view.getTag(C5637a.c.f239344a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean X0(int i10) {
        return f113560W || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.Z0() && num.intValue() == 80) {
            fragmentManager.N(false);
        }
    }

    @Deprecated
    public static void f0(boolean z10) {
        f113560W = z10;
    }

    public static void g(FragmentManager fragmentManager, androidx.core.app.U u10) {
        if (fragmentManager.Z0()) {
            fragmentManager.V(u10.f110979a, false);
        }
    }

    public static void h(FragmentManager fragmentManager, C2401y c2401y) {
        if (fragmentManager.Z0()) {
            fragmentManager.O(c2401y.f111120a, false);
        }
    }

    public static /* synthetic */ void i(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.Z0()) {
            fragmentManager.H(configuration, false);
        }
    }

    public static void l0(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C2563a c2563a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c2563a.Q(-1);
                c2563a.W();
            } else {
                c2563a.Q(1);
                c2563a.V();
            }
            i10++;
        }
    }

    @NonNull
    public static <F extends Fragment> F q0(@NonNull View view) {
        F f10 = (F) v0(view);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @NonNull
    public static FragmentManager u0(@NonNull View view) {
        androidx.fragment.app.r rVar;
        Fragment fragmentV0 = v0(view);
        if (fragmentV0 != null) {
            if (fragmentV0.isAdded()) {
                return fragmentV0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentV0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                rVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.r) {
                rVar = (androidx.fragment.app.r) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (rVar != null) {
            return rVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @Nullable
    public static Fragment v0(@NonNull View view) {
        while (view != null) {
            Fragment fragmentR0 = R0(view);
            if (fragmentR0 != null) {
                return fragmentR0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public final void A() {
        AbstractC2584w<?> abstractC2584w = this.f113603v;
        if (abstractC2584w instanceof q0 ? this.f113584c.q().f113680f : abstractC2584w.f() instanceof Activity ? !((Activity) this.f113603v.f()).isChangingConfigurations() : true) {
            Iterator<BackStackState> it = this.f113591j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().mFragments.iterator();
                while (it2.hasNext()) {
                    this.f113584c.q().j(it2.next());
                }
            }
        }
    }

    @NonNull
    public List<Fragment> A0() {
        return this.f113584c.m();
    }

    public void A1(@NonNull p pVar) {
        ArrayList<p> arrayList = this.f113594m;
        if (arrayList != null) {
            arrayList.remove(pVar);
        }
    }

    public final Set<SpecialEffectsController> B() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) this.f113584c.l();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ViewGroup viewGroup = ((Q) obj).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.f113710f.b(viewGroup, P0()));
            }
        }
        return hashSet;
    }

    @NonNull
    public k B0(int i10) {
        return this.f113585d.get(i10);
    }

    public final void B1(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f113769r) {
                if (i11 != i10) {
                    m0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f113769r) {
                        i11++;
                    }
                }
                m0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m0(arrayList, arrayList2, i11, size);
        }
    }

    public final Set<SpecialEffectsController> C(@NonNull ArrayList<C2563a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList<U.a> arrayList2 = arrayList.get(i10).f113754c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                U.a aVar = arrayList2.get(i12);
                i12++;
                Fragment fragment = aVar.f113772b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.f113710f.a(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public int C0() {
        ArrayList<C2563a> arrayList = this.f113585d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void C1(@NonNull Fragment fragment) {
        this.f113579P.s(fragment);
    }

    @NonNull
    public Q D(@NonNull Fragment fragment) {
        Q qO = this.f113584c.o(fragment.mWho);
        if (qO != null) {
            return qO;
        }
        Q q10 = new Q(this.f113595n, this.f113584c, fragment);
        q10.o(this.f113603v.f().getClassLoader());
        q10.f113695e = this.f113602u;
        return q10;
    }

    @NonNull
    public final L D0(@NonNull Fragment fragment) {
        return this.f113579P.m(fragment);
    }

    public final void D1() {
        if (this.f113594m != null) {
            for (int i10 = 0; i10 < this.f113594m.size(); i10++) {
                this.f113594m.get(i10).onBackStackChanged();
            }
        }
    }

    public void E(@NonNull Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (X0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f113584c.v(fragment);
            if (Y0(fragment)) {
                this.f113571H = true;
            }
            X1(fragment);
        }
    }

    @NonNull
    public AbstractC2581t E0() {
        return this.f113604w;
    }

    public void E1(@Nullable Parcelable parcelable, @Nullable K k10) {
        if (this.f113603v instanceof q0) {
            a2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
        this.f113579P.t(k10);
        I1(parcelable);
    }

    public void F() {
        this.f113572I = false;
        this.f113573J = false;
        this.f113579P.f113682h = false;
        a0(4);
    }

    @Nullable
    public Fragment F0(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentO0 = o0(string);
        if (fragmentO0 != null) {
            return fragmentO0;
        }
        a2(new IllegalStateException(G.a("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public void F1(@NonNull String str) {
        h0(new s(str), false);
    }

    public void G() {
        this.f113572I = false;
        this.f113573J = false;
        this.f113579P.f113682h = false;
        a0(0);
    }

    public final ViewGroup G0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f113604w.d()) {
            View viewC = this.f113604w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public boolean G1(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        BackStackState backStackStateRemove = this.f113591j.remove(str);
        boolean z10 = false;
        if (backStackStateRemove == null) {
            return false;
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C2563a c2563a = arrayList.get(i10);
            i10++;
            C2563a c2563a2 = c2563a;
            if (c2563a2.f113815Q) {
                ArrayList<U.a> arrayList3 = c2563a2.f113754c;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    U.a aVar = arrayList3.get(i11);
                    i11++;
                    Fragment fragment = aVar.f113772b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<C2563a> it = backStackStateRemove.instantiate(this, map).iterator();
        while (it.hasNext()) {
            it.next().a(arrayList, arrayList2);
            z10 = true;
        }
        return z10;
    }

    public void H(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.f113603v instanceof B0.C)) {
            a2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.H(configuration, true);
                }
            }
        }
    }

    @NonNull
    public C2583v H0() {
        C2583v c2583v = this.f113607z;
        if (c2583v != null) {
            return c2583v;
        }
        Fragment fragment = this.f113605x;
        return fragment != null ? fragment.mFragmentManager.H0() : this.f113564A;
    }

    public void H1(@Nullable Parcelable parcelable) {
        if (this.f113603v instanceof androidx.savedstate.f) {
            a2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        I1(parcelable);
    }

    public boolean I(@NonNull MenuItem menuItem) {
        if (this.f113602u < 1) {
            return false;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public T I0() {
        return this.f113584c;
    }

    public void I1(@Nullable Parcelable parcelable) {
        Q q10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(f113558U) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f113603v.f().getClassLoader());
                this.f113592k.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(f113559V) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f113603v.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f113584c.y(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f113584c.w();
        ArrayList<String> arrayList = fragmentManagerState.mActive;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = arrayList.get(i10);
            i10++;
            Bundle bundleC = this.f113584c.C(str3, null);
            if (bundleC != null) {
                Fragment fragmentL = this.f113579P.l(((FragmentState) bundleC.getParcelable("state")).mWho);
                if (fragmentL != null) {
                    if (X0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentL);
                    }
                    q10 = new Q(this.f113595n, this.f113584c, fragmentL, bundleC);
                } else {
                    q10 = new Q(this.f113595n, this.f113584c, this.f113603v.f().getClassLoader(), H0(), bundleC);
                }
                Fragment fragmentK = q10.k();
                fragmentK.mSavedFragmentState = bundleC;
                fragmentK.mFragmentManager = this;
                if (X0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                q10.o(this.f113603v.f().getClassLoader());
                this.f113584c.s(q10);
                q10.t(this.f113602u);
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f113579P.o();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList2.get(i11);
            i11++;
            Fragment fragment = (Fragment) obj;
            if (!this.f113584c.c(fragment.mWho)) {
                if (X0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.mActive);
                }
                this.f113579P.s(fragment);
                fragment.mFragmentManager = this;
                Q q11 = new Q(this.f113595n, this.f113584c, fragment);
                q11.f113695e = 1;
                q11.m();
                fragment.mRemoving = true;
                q11.m();
            }
        }
        this.f113584c.x(fragmentManagerState.mAdded);
        if (fragmentManagerState.mBackStack != null) {
            this.f113585d = new ArrayList<>(fragmentManagerState.mBackStack.length);
            int i12 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                if (i12 >= backStackRecordStateArr.length) {
                    break;
                }
                C2563a c2563aInstantiate = backStackRecordStateArr[i12].instantiate(this);
                if (X0(2)) {
                    StringBuilder sbA = android.support.v4.media.a.a("restoreAllState: back stack #", i12, " (index ");
                    sbA.append(c2563aInstantiate.f113814P);
                    sbA.append("): ");
                    sbA.append(c2563aInstantiate);
                    Log.v("FragmentManager", sbA.toString());
                    PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                    c2563aInstantiate.U(GlideException.a.f139488d, printWriter, false);
                    printWriter.close();
                }
                this.f113585d.add(c2563aInstantiate);
                i12++;
            }
        } else {
            this.f113585d = null;
        }
        this.f113590i.set(fragmentManagerState.mBackStackIndex);
        String str4 = fragmentManagerState.mPrimaryNavActiveWho;
        if (str4 != null) {
            Fragment fragmentO0 = o0(str4);
            this.f113606y = fragmentO0;
            T(fragmentO0);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.mBackStackStateKeys;
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                this.f113591j.put(arrayList3.get(i13), fragmentManagerState.mBackStackStates.get(i13));
            }
        }
        this.f113570G = new ArrayDeque<>(fragmentManagerState.mLaunchedFragments);
    }

    public void J() {
        this.f113572I = false;
        this.f113573J = false;
        this.f113579P.f113682h = false;
        a0(1);
    }

    @NonNull
    public List<Fragment> J0() {
        return this.f113584c.p();
    }

    @Deprecated
    public K J1() {
        if (!(this.f113603v instanceof q0)) {
            return this.f113579P.p();
        }
        a2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    public boolean K(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f113602u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null && b1(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f113586e != null) {
            for (int i10 = 0; i10 < this.f113586e.size(); i10++) {
                Fragment fragment2 = this.f113586e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f113586e = arrayList;
        return z10;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AbstractC2584w<?> K0() {
        return this.f113603v;
    }

    public void L() {
        this.f113574K = true;
        j0(true);
        g0();
        A();
        a0(-1);
        Object obj = this.f113603v;
        if (obj instanceof B0.D) {
            ((B0.D) obj).removeOnTrimMemoryListener(this.f113598q);
        }
        Object obj2 = this.f113603v;
        if (obj2 instanceof B0.C) {
            ((B0.C) obj2).removeOnConfigurationChangedListener(this.f113597p);
        }
        Object obj3 = this.f113603v;
        if (obj3 instanceof androidx.core.app.N) {
            ((androidx.core.app.N) obj3).removeOnMultiWindowModeChangedListener(this.f113599r);
        }
        Object obj4 = this.f113603v;
        if (obj4 instanceof androidx.core.app.P) {
            ((androidx.core.app.P) obj4).removeOnPictureInPictureModeChangedListener(this.f113600s);
        }
        Object obj5 = this.f113603v;
        if ((obj5 instanceof androidx.core.view.M) && this.f113605x == null) {
            ((androidx.core.view.M) obj5).removeMenuProvider(this.f113601t);
        }
        this.f113603v = null;
        this.f113604w = null;
        this.f113605x = null;
        if (this.f113588g != null) {
            this.f113589h.k();
            this.f113588g = null;
        }
        androidx.activity.result.g<Intent> gVar = this.f113567D;
        if (gVar != null) {
            gVar.d();
            this.f113568E.d();
            this.f113569F.d();
        }
    }

    @NonNull
    public LayoutInflater.Factory2 L0() {
        return this.f113587f;
    }

    public Parcelable L1() {
        if (this.f113603v instanceof androidx.savedstate.f) {
            a2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        Bundle bundleM1 = M1();
        if (bundleM1.isEmpty()) {
            return null;
        }
        return bundleM1;
    }

    public void M() {
        a0(1);
    }

    @NonNull
    public A M0() {
        return this.f113595n;
    }

    @NonNull
    public Bundle M1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        w0();
        g0();
        j0(true);
        this.f113572I = true;
        this.f113579P.f113682h = true;
        ArrayList<String> arrayListZ = this.f113584c.z();
        HashMap<String, Bundle> mapN = this.f113584c.n();
        if (!mapN.isEmpty()) {
            ArrayList<String> arrayListA = this.f113584c.A();
            ArrayList<C2563a> arrayList = this.f113585d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f113585d.get(i10));
                    if (X0(2)) {
                        StringBuilder sbA = android.support.v4.media.a.a("saveAllState: adding back stack #", i10, ": ");
                        sbA.append(this.f113585d.get(i10));
                        Log.v("FragmentManager", sbA.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.mActive = arrayListZ;
            fragmentManagerState.mAdded = arrayListA;
            fragmentManagerState.mBackStack = backStackRecordStateArr;
            fragmentManagerState.mBackStackIndex = this.f113590i.get();
            Fragment fragment = this.f113606y;
            if (fragment != null) {
                fragmentManagerState.mPrimaryNavActiveWho = fragment.mWho;
            }
            fragmentManagerState.mBackStackStateKeys.addAll(this.f113591j.keySet());
            fragmentManagerState.mBackStackStates.addAll(this.f113591j.values());
            fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.f113570G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f113592k.keySet()) {
                bundle.putBundle(w.y.a(f113558U, str), this.f113592k.get(str));
            }
            for (String str2 : mapN.keySet()) {
                bundle.putBundle(w.y.a(f113559V, str2), mapN.get(str2));
            }
        } else if (X0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void N(boolean z10) {
        if (z10 && (this.f113603v instanceof B0.D)) {
            a2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.N(true);
                }
            }
        }
    }

    @Nullable
    public Fragment N0() {
        return this.f113605x;
    }

    public void N1(@NonNull String str) {
        h0(new t(str), false);
    }

    public void O(boolean z10, boolean z11) {
        if (z11 && (this.f113603v instanceof androidx.core.app.N)) {
            a2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.O(z10, true);
                }
            }
        }
    }

    @Nullable
    public Fragment O0() {
        return this.f113606y;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean O1(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.C2563a> r20, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r21, @androidx.annotation.NonNull java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.O1(java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    public void P(@NonNull Fragment fragment) {
        Iterator<M> it = this.f113596o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    @NonNull
    public f0 P0() {
        f0 f0Var = this.f113565B;
        if (f0Var != null) {
            return f0Var;
        }
        Fragment fragment = this.f113605x;
        return fragment != null ? fragment.mFragmentManager.P0() : this.f113566C;
    }

    @Nullable
    public Fragment.SavedState P1(@NonNull Fragment fragment) {
        Q qO = this.f113584c.o(fragment.mWho);
        if (qO != null && qO.k().equals(fragment)) {
            return qO.q();
        }
        a2(new IllegalStateException(C2575m.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public void Q() {
        ArrayList arrayList = (ArrayList) this.f113584c.m();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.Q();
            }
        }
    }

    @Nullable
    public FragmentStrictMode.Policy Q0() {
        return this.f113580Q;
    }

    public void Q1() {
        synchronized (this.f113582a) {
            try {
                if (this.f113582a.size() == 1) {
                    this.f113603v.g().removeCallbacks(this.f113581R);
                    this.f113603v.g().post(this.f113581R);
                    c2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean R(@NonNull MenuItem menuItem) {
        if (this.f113602u < 1) {
            return false;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void R1(@NonNull Fragment fragment, boolean z10) {
        ViewGroup viewGroupG0 = G0(fragment);
        if (viewGroupG0 == null || !(viewGroupG0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG0).f113554d = !z10;
    }

    public void S(@NonNull Menu menu) {
        if (this.f113602u < 1) {
            return;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    @NonNull
    public p0 S0(@NonNull Fragment fragment) {
        return this.f113579P.q(fragment);
    }

    public void S1(@NonNull C2583v c2583v) {
        this.f113607z = c2583v;
    }

    public final void T(@Nullable Fragment fragment) {
        if (fragment == null || !fragment.equals(o0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void T0() {
        j0(true);
        if (this.f113589h.f84852a) {
            r1();
        } else {
            this.f113588g.p();
        }
    }

    public void T1(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void U() {
        a0(5);
    }

    public void U0(@NonNull Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        X1(fragment);
    }

    public void U1(@Nullable Fragment fragment) {
        if (fragment == null || (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f113606y;
            this.f113606y = fragment;
            T(fragment2);
            T(this.f113606y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void V(boolean z10, boolean z11) {
        if (z11 && (this.f113603v instanceof androidx.core.app.P)) {
            a2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.V(z10, true);
                }
            }
        }
    }

    public void V0(@NonNull Fragment fragment) {
        if (fragment.mAdded && Y0(fragment)) {
            this.f113571H = true;
        }
    }

    public void V1(@NonNull f0 f0Var) {
        this.f113565B = f0Var;
    }

    public boolean W(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f113602u < 1) {
            return false;
        }
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null && b1(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean W0() {
        return this.f113574K;
    }

    public void W1(@Nullable FragmentStrictMode.Policy policy) {
        this.f113580Q = policy;
    }

    public void X() {
        c2();
        T(this.f113606y);
    }

    public final void X1(@NonNull Fragment fragment) {
        ViewGroup viewGroupG0 = G0(fragment);
        if (viewGroupG0 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i10 = C5637a.c.f239346c;
                if (viewGroupG0.getTag(i10) == null) {
                    viewGroupG0.setTag(i10, fragment);
                }
                ((Fragment) viewGroupG0.getTag(i10)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public void Y() {
        this.f113572I = false;
        this.f113573J = false;
        this.f113579P.f113682h = false;
        a0(7);
    }

    public final boolean Y0(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.v();
    }

    public void Y1(@NonNull Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void Z() {
        this.f113572I = false;
        this.f113573J = false;
        this.f113579P.f113682h = false;
        a0(5);
    }

    public final boolean Z0() {
        Fragment fragment = this.f113605x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f113605x.getParentFragmentManager().Z0();
    }

    public final void Z1() {
        ArrayList arrayList = (ArrayList) this.f113584c.l();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m1((Q) obj);
        }
    }

    @Override // androidx.fragment.app.P
    public final void a(@NonNull String str, @NonNull Bundle bundle) {
        o oVar = this.f113593l.get(str);
        if (oVar == null || !oVar.b(Lifecycle.State.STARTED)) {
            this.f113592k.put(str, bundle);
        } else {
            oVar.a(str, bundle);
        }
        if (X0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void a0(int i10) {
        try {
            this.f113583b = true;
            this.f113584c.d(i10);
            i1(i10, false);
            Iterator it = ((HashSet) B()).iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).n();
            }
            this.f113583b = false;
            j0(true);
        } catch (Throwable th) {
            this.f113583b = false;
            throw th;
        }
    }

    public boolean a1(@Nullable Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public final void a2(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
        AbstractC2584w<?> abstractC2584w = this.f113603v;
        if (abstractC2584w != null) {
            try {
                abstractC2584w.h(GlideException.a.f139488d, null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            e0(GlideException.a.f139488d, null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    @Override // androidx.fragment.app.P
    public final void b(@NonNull String str) {
        o oVarRemove = this.f113593l.remove(str);
        if (oVarRemove != null) {
            oVarRemove.c();
        }
        if (X0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    public void b0() {
        this.f113573J = true;
        this.f113579P.f113682h = true;
        a0(4);
    }

    public boolean b1(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void b2(@NonNull n nVar) {
        this.f113595n.p(nVar);
    }

    @Override // androidx.fragment.app.P
    @SuppressLint({"SyntheticAccessor"})
    public final void c(@NonNull String str, @NonNull androidx.lifecycle.B b10, @NonNull O o10) {
        Lifecycle lifecycle = b10.getLifecycle();
        if (lifecycle.d() == Lifecycle.State.DESTROYED) {
            return;
        }
        g gVar = new g(str, o10, lifecycle);
        o oVarPut = this.f113593l.put(str, new o(lifecycle, o10, gVar));
        if (oVarPut != null) {
            oVarPut.c();
        }
        if (X0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + o10);
        }
        lifecycle.c(gVar);
    }

    public void c0() {
        a0(2);
    }

    public boolean c1(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.O0()) && c1(fragmentManager.f113605x);
    }

    public final void c2() {
        synchronized (this.f113582a) {
            try {
                if (this.f113582a.isEmpty()) {
                    this.f113589h.m(C0() > 0 && c1(this.f113605x));
                } else {
                    this.f113589h.m(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.P
    public final void d(@NonNull String str) {
        this.f113592k.remove(str);
        if (X0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final void d0() {
        if (this.f113575L) {
            this.f113575L = false;
            Z1();
        }
    }

    public boolean d1(int i10) {
        return this.f113602u >= i10;
    }

    public void e0(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String strA = androidx.compose.runtime.changelist.j.a(str, TextProcessor.f150538k0);
        this.f113584c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f113586e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f113586e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C2563a> arrayList2 = this.f113585d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C2563a c2563a = this.f113585d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c2563a.toString());
                c2563a.U(strA, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f113590i.get());
        synchronized (this.f113582a) {
            try {
                int size3 = this.f113582a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        q qVar = this.f113582a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(qVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f113603v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f113604w);
        if (this.f113605x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f113605x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f113602u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f113572I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f113573J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f113574K);
        if (this.f113571H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f113571H);
        }
    }

    public boolean e1() {
        return this.f113572I || this.f113573J;
    }

    public void f1(@NonNull Fragment fragment, @NonNull String[] strArr, int i10) {
        if (this.f113569F == null) {
            this.f113603v.getClass();
            return;
        }
        this.f113570G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        this.f113569F.b(strArr);
    }

    public final void g0() {
        Iterator it = ((HashSet) B()).iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).n();
        }
    }

    public void g1(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (this.f113567D == null) {
            this.f113603v.q(fragment, intent, i10, bundle);
            return;
        }
        this.f113570G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra(C4283b.m.f194535b, bundle);
        }
        this.f113567D.b(intent);
    }

    public void h0(@NonNull q qVar, boolean z10) {
        if (!z10) {
            if (this.f113603v == null) {
                if (!this.f113574K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            w();
        }
        synchronized (this.f113582a) {
            try {
                if (this.f113603v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f113582a.add(qVar);
                    Q1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h1(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f113568E == null) {
            this.f113603v.r(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra(f113563Z, true);
            }
            if (X0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra(C4283b.m.f194535b, bundle);
        }
        IntentSenderRequest intentSenderRequestBuild = new IntentSenderRequest.Builder(intentSender).setFillInIntent(intent).setFlags(i12, i11).build();
        this.f113570G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (X0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f113568E.b(intentSenderRequestBuild);
    }

    public final void i0(boolean z10) {
        if (this.f113583b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f113603v == null) {
            if (!this.f113574K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f113603v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            w();
        }
        if (this.f113576M == null) {
            this.f113576M = new ArrayList<>();
            this.f113577N = new ArrayList<>();
        }
    }

    public void i1(int i10, boolean z10) {
        AbstractC2584w<?> abstractC2584w;
        if (this.f113603v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f113602u) {
            this.f113602u = i10;
            this.f113584c.u();
            Z1();
            if (this.f113571H && (abstractC2584w = this.f113603v) != null && this.f113602u == 7) {
                abstractC2584w.s();
                this.f113571H = false;
            }
        }
    }

    public boolean j0(boolean z10) {
        i0(z10);
        boolean z11 = false;
        while (y0(this.f113576M, this.f113577N)) {
            z11 = true;
            this.f113583b = true;
            try {
                B1(this.f113576M, this.f113577N);
            } finally {
                x();
            }
        }
        c2();
        d0();
        this.f113584c.b();
        return z11;
    }

    public void j1() {
        if (this.f113603v == null) {
            return;
        }
        this.f113572I = false;
        this.f113573J = false;
        this.f113579P.f113682h = false;
        for (Fragment fragment : this.f113584c.p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void k0(@NonNull q qVar, boolean z10) {
        if (z10 && (this.f113603v == null || this.f113574K)) {
            return;
        }
        i0(z10);
        if (qVar.a(this.f113576M, this.f113577N)) {
            this.f113583b = true;
            try {
                B1(this.f113576M, this.f113577N);
            } finally {
                x();
            }
        }
        c2();
        d0();
        this.f113584c.b();
    }

    public void k1(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        ArrayList arrayList = (ArrayList) this.f113584c.l();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Q q10 = (Q) obj;
            Fragment fragmentK = q10.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                q10.b();
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public U l1() {
        return u();
    }

    public void m(C2563a c2563a) {
        if (this.f113585d == null) {
            this.f113585d = new ArrayList<>();
        }
        this.f113585d.add(c2563a);
    }

    public final void m0(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<p> arrayList3;
        boolean z10 = arrayList.get(i10).f113769r;
        ArrayList<Fragment> arrayList4 = this.f113578O;
        if (arrayList4 == null) {
            this.f113578O = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.f113578O.addAll(this.f113584c.p());
        Fragment fragmentO0 = O0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C2563a c2563a = arrayList.get(i12);
            fragmentO0 = !arrayList2.get(i12).booleanValue() ? c2563a.X(this.f113578O, fragmentO0) : c2563a.Z(this.f113578O, fragmentO0);
            z11 = z11 || c2563a.f113760i;
        }
        this.f113578O.clear();
        if (!z10 && this.f113602u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList<U.a> arrayList5 = arrayList.get(i13).f113754c;
                int size = arrayList5.size();
                int i14 = 0;
                while (i14 < size) {
                    U.a aVar = arrayList5.get(i14);
                    i14++;
                    Fragment fragment = aVar.f113772b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f113584c.s(D(fragment));
                    }
                }
            }
        }
        l0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && (arrayList3 = this.f113594m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                C2563a c2563a2 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(x0(c2563a2));
            }
            ArrayList<p> arrayList6 = this.f113594m;
            int size3 = arrayList6.size();
            int i16 = 0;
            while (i16 < size3) {
                p pVar = arrayList6.get(i16);
                i16++;
                p pVar2 = pVar;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    pVar2.a((Fragment) it.next(), zBooleanValue);
                }
            }
            ArrayList<p> arrayList7 = this.f113594m;
            int size4 = arrayList7.size();
            int i17 = 0;
            while (i17 < size4) {
                p pVar3 = arrayList7.get(i17);
                i17++;
                p pVar4 = pVar3;
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    pVar4.b((Fragment) it2.next(), zBooleanValue);
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            C2563a c2563a3 = arrayList.get(i18);
            if (zBooleanValue) {
                for (int size5 = c2563a3.f113754c.size() - 1; size5 >= 0; size5--) {
                    Fragment fragment2 = c2563a3.f113754c.get(size5).f113772b;
                    if (fragment2 != null) {
                        D(fragment2).m();
                    }
                }
            } else {
                ArrayList<U.a> arrayList8 = c2563a3.f113754c;
                int size6 = arrayList8.size();
                int i19 = 0;
                while (i19 < size6) {
                    U.a aVar2 = arrayList8.get(i19);
                    i19++;
                    Fragment fragment3 = aVar2.f113772b;
                    if (fragment3 != null) {
                        D(fragment3).m();
                    }
                }
            }
        }
        i1(this.f113602u, true);
        for (SpecialEffectsController specialEffectsController : (HashSet) C(arrayList, i10, i11)) {
            specialEffectsController.f113714d = zBooleanValue;
            specialEffectsController.t();
            specialEffectsController.k();
        }
        while (i10 < i11) {
            C2563a c2563a4 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c2563a4.f113814P >= 0) {
                c2563a4.f113814P = -1;
            }
            c2563a4.Y();
            i10++;
        }
        if (z11) {
            D1();
        }
    }

    public void m1(@NonNull Q q10) {
        Fragment fragmentK = q10.k();
        if (fragmentK.mDeferStart) {
            if (this.f113583b) {
                this.f113575L = true;
            } else {
                fragmentK.mDeferStart = false;
                q10.m();
            }
        }
    }

    public Q n(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.i(fragment, str);
        }
        if (X0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        Q qD = D(fragment);
        fragment.mFragmentManager = this;
        this.f113584c.s(qD);
        if (!fragment.mDetached) {
            this.f113584c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Y0(fragment)) {
                this.f113571H = true;
            }
        }
        return qD;
    }

    @e.I
    public boolean n0() {
        boolean zJ0 = j0(true);
        w0();
        return zJ0;
    }

    public void n1() {
        h0(new r(null, -1, 0), false);
    }

    public void o(@NonNull M m10) {
        this.f113596o.add(m10);
    }

    @Nullable
    public Fragment o0(@NonNull String str) {
        return this.f113584c.f(str);
    }

    public void o1(int i10, int i11) {
        p1(i10, i11, false);
    }

    public void p(@NonNull p pVar) {
        if (this.f113594m == null) {
            this.f113594m = new ArrayList<>();
        }
        this.f113594m.add(pVar);
    }

    public final int p0(@Nullable String str, int i10, boolean z10) {
        ArrayList<C2563a> arrayList = this.f113585d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f113585d.size() - 1;
        }
        int size = this.f113585d.size() - 1;
        while (size >= 0) {
            C2563a c2563a = this.f113585d.get(size);
            if ((str != null && str.equals(c2563a.f113762k)) || (i10 >= 0 && i10 == c2563a.f113814P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f113585d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2563a c2563a2 = this.f113585d.get(size - 1);
            if ((str == null || !str.equals(c2563a2.f113762k)) && (i10 < 0 || i10 != c2563a2.f113814P)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void p1(int i10, int i11, boolean z10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Bad id: ", i10));
        }
        h0(new r(null, i10, i11), z10);
    }

    public void q(@NonNull Fragment fragment) {
        this.f113579P.h(fragment);
    }

    public void q1(@Nullable String str, int i10) {
        h0(new r(str, -1, i10), false);
    }

    public int r() {
        return this.f113590i.getAndIncrement();
    }

    @Nullable
    public Fragment r0(@e.C int i10) {
        return this.f113584c.g(i10);
    }

    @e.I
    public boolean r1() {
        return u1(null, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public void s(@NonNull AbstractC2584w<?> abstractC2584w, @NonNull AbstractC2581t abstractC2581t, @Nullable Fragment fragment) {
        if (this.f113603v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f113603v = abstractC2584w;
        this.f113604w = abstractC2581t;
        this.f113605x = fragment;
        if (fragment != null) {
            o(new h(fragment));
        } else if (abstractC2584w instanceof M) {
            o((M) abstractC2584w);
        }
        if (this.f113605x != null) {
            c2();
        }
        if (abstractC2584w instanceof androidx.activity.G) {
            androidx.activity.G g10 = (androidx.activity.G) abstractC2584w;
            OnBackPressedDispatcher onBackPressedDispatcher = g10.getOnBackPressedDispatcher();
            this.f113588g = onBackPressedDispatcher;
            androidx.lifecycle.B b10 = g10;
            if (fragment != null) {
                b10 = fragment;
            }
            onBackPressedDispatcher.i(b10, this.f113589h);
        }
        if (fragment != null) {
            this.f113579P = fragment.mFragmentManager.f113579P.m(fragment);
        } else if (abstractC2584w instanceof q0) {
            this.f113579P = L.n(((q0) abstractC2584w).getViewModelStore());
        } else {
            this.f113579P = new L(false);
        }
        this.f113579P.f113682h = e1();
        this.f113584c.B(this.f113579P);
        Object obj = this.f113603v;
        if ((obj instanceof androidx.savedstate.f) && fragment == null) {
            androidx.savedstate.d savedStateRegistry = ((androidx.savedstate.f) obj).getSavedStateRegistry();
            savedStateRegistry.j(f113556S, new d.c() { // from class: androidx.fragment.app.F
                @Override // androidx.savedstate.d.c
                public final Bundle a() {
                    return this.f113510a.M1();
                }
            });
            Bundle bundleB = savedStateRegistry.b(f113556S);
            if (bundleB != null) {
                I1(bundleB);
            }
        }
        Object obj2 = this.f113603v;
        if (obj2 instanceof androidx.activity.result.k) {
            androidx.activity.result.j activityResultRegistry = ((androidx.activity.result.k) obj2).getActivityResultRegistry();
            String strA = w.y.a("FragmentManager:", fragment != null ? android.support.v4.media.e.a(new StringBuilder(), fragment.mWho, com.prism.gaia.server.accounts.b.f166434b0) : "");
            this.f113567D = activityResultRegistry.j(androidx.compose.runtime.changelist.j.a(strA, "StartActivityForResult"), new C4283b.m(), new i());
            this.f113568E = activityResultRegistry.j(androidx.compose.runtime.changelist.j.a(strA, "StartIntentSenderForResult"), new m(), new j());
            this.f113569F = activityResultRegistry.j(androidx.compose.runtime.changelist.j.a(strA, "RequestPermissions"), new C4283b.k(), new a());
        }
        Object obj3 = this.f113603v;
        if (obj3 instanceof B0.C) {
            ((B0.C) obj3).addOnConfigurationChangedListener(this.f113597p);
        }
        Object obj4 = this.f113603v;
        if (obj4 instanceof B0.D) {
            ((B0.D) obj4).addOnTrimMemoryListener(this.f113598q);
        }
        Object obj5 = this.f113603v;
        if (obj5 instanceof androidx.core.app.N) {
            ((androidx.core.app.N) obj5).addOnMultiWindowModeChangedListener(this.f113599r);
        }
        Object obj6 = this.f113603v;
        if (obj6 instanceof androidx.core.app.P) {
            ((androidx.core.app.P) obj6).addOnPictureInPictureModeChangedListener(this.f113600s);
        }
        Object obj7 = this.f113603v;
        if ((obj7 instanceof androidx.core.view.M) && fragment == null) {
            ((androidx.core.view.M) obj7).addMenuProvider(this.f113601t);
        }
    }

    @Nullable
    public Fragment s0(@Nullable String str) {
        return this.f113584c.h(str);
    }

    public boolean s1(int i10, int i11) {
        if (i10 >= 0) {
            return u1(null, i10, i11);
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Bad id: ", i10));
    }

    public void t(@NonNull Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f113584c.a(fragment);
            if (X0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (Y0(fragment)) {
                this.f113571H = true;
            }
        }
    }

    public Fragment t0(@NonNull String str) {
        return this.f113584c.i(str);
    }

    @e.I
    public boolean t1(@Nullable String str, int i10) {
        return u1(str, -1, i10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f113605x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f113605x)));
            sb2.append("}");
        } else {
            AbstractC2584w<?> abstractC2584w = this.f113603v;
            if (abstractC2584w != null) {
                sb2.append(abstractC2584w.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f113603v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    @NonNull
    public U u() {
        return new C2563a(this);
    }

    public final boolean u1(@Nullable String str, int i10, int i11) {
        j0(false);
        i0(true);
        Fragment fragment = this.f113606y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().r1()) {
            return true;
        }
        boolean zV1 = v1(this.f113576M, this.f113577N, str, i10, i11);
        if (zV1) {
            this.f113583b = true;
            try {
                B1(this.f113576M, this.f113577N);
            } finally {
                x();
            }
        }
        c2();
        d0();
        this.f113584c.b();
        return zV1;
    }

    public boolean v() {
        ArrayList arrayList = (ArrayList) this.f113584c.m();
        int size = arrayList.size();
        boolean zY0 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                zY0 = Y0(fragment);
            }
            if (zY0) {
                return true;
            }
        }
        return false;
    }

    public boolean v1(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i10, int i11) {
        int iP0 = p0(str, i10, (i11 & 1) != 0);
        if (iP0 < 0) {
            return false;
        }
        for (int size = this.f113585d.size() - 1; size >= iP0; size--) {
            arrayList.add(this.f113585d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void w() {
        if (e1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void w0() {
        Iterator it = ((HashSet) B()).iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).o();
        }
    }

    public void w1(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            a2(new IllegalStateException(C2575m.a("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void x() {
        this.f113583b = false;
        this.f113577N.clear();
        this.f113576M.clear();
    }

    public final Set<Fragment> x0(@NonNull C2563a c2563a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c2563a.f113754c.size(); i10++) {
            Fragment fragment = c2563a.f113754c.get(i10).f113772b;
            if (fragment != null && c2563a.f113760i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public void x1(@NonNull n nVar, boolean z10) {
        this.f113595n.o(nVar, z10);
    }

    public void y(@NonNull String str) {
        h0(new l(str), false);
    }

    public final boolean y0(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f113582a) {
            if (this.f113582a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f113582a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f113582a.get(i10).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f113582a.clear();
                this.f113603v.g().removeCallbacks(this.f113581R);
            }
        }
    }

    public void y1(@NonNull Fragment fragment) {
        if (X0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f113584c.v(fragment);
        if (Y0(fragment)) {
            this.f113571H = true;
        }
        fragment.mRemoving = true;
        X1(fragment);
    }

    public boolean z(@NonNull ArrayList<C2563a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        if (G1(arrayList, arrayList2, str)) {
            return v1(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    public int z0() {
        return this.f113584c.k();
    }

    public void z1(@NonNull M m10) {
        this.f113596o.remove(m10);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        int mRequestCode;
        String mWho;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.mWho = str;
            this.mRequestCode = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }
    }
}
