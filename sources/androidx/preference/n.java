package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2573k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.U;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.t;
import androidx.preference.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.h0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends Fragment implements t.c, t.a, t.b, DialogPreference.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f115648j = "PreferenceFragment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f115649k = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f115650l = "android:preferences";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f115651m = "androidx.preference.PreferenceFragment.DIALOG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f115652n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f115654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f115655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f115656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115657e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f115659g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f115653a = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115658f = w.h.f115826k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f115660h = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f115661i = new b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            n.this.m();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = n.this.f115655c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Preference f115664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f115665b;

        public c(Preference preference, String str) {
            this.f115664a = preference;
            this.f115665b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.Adapter adapter = n.this.f115655c.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f115664a;
            int iC = preference != null ? ((PreferenceGroup.c) adapter).c(preference) : ((PreferenceGroup.c) adapter).e(this.f115665b);
            if (iC != -1) {
                n.this.f115655c.scrollToPosition(iC);
            } else {
                adapter.registerAdapterDataObserver(new h(adapter, n.this.f115655c, this.f115664a, this.f115665b));
            }
        }
    }

    public class d extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f115667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f115668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f115669c = true;

        public d() {
        }

        private boolean f(View view, RecyclerView recyclerView) {
            RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof v) || !((v) childViewHolder).f()) {
                return false;
            }
            boolean z10 = this.f115669c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z10;
            }
            RecyclerView.C childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            return (childViewHolder2 instanceof v) && ((v) childViewHolder2).e();
        }

        public void c(boolean z10) {
            this.f115669c = z10;
        }

        public void d(Drawable drawable) {
            if (drawable != null) {
                this.f115668b = drawable.getIntrinsicHeight();
            } else {
                this.f115668b = 0;
            }
            this.f115667a = drawable;
            n.this.f115655c.invalidateItemDecorations();
        }

        public void e(int i10) {
            this.f115668b = i10;
            n.this.f115655c.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            if (f(view, recyclerView)) {
                rect.bottom = this.f115668b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            if (this.f115667a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (f(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f115667a.setBounds(0, height, width, this.f115668b + height);
                    this.f115667a.draw(canvas);
                }
            }
        }
    }

    public interface e {
        boolean a(@NonNull n nVar, @NonNull Preference preference);
    }

    public interface f {
        boolean d(@NonNull n nVar, @NonNull Preference preference);
    }

    public interface g {
        boolean a(@NonNull n nVar, @NonNull PreferenceScreen preferenceScreen);
    }

    public static class h extends RecyclerView.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView.Adapter<?> f115671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f115672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Preference f115673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f115674d;

        public h(RecyclerView.Adapter<?> adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f115671a = adapter;
            this.f115672b = recyclerView;
            this.f115673c = preference;
            this.f115674d = str;
        }

        private void a() {
            this.f115671a.unregisterAdapterDataObserver(this);
            Preference preference = this.f115673c;
            int iC = preference != null ? ((PreferenceGroup.c) this.f115671a).c(preference) : ((PreferenceGroup.c) this.f115671a).e(this.f115674d);
            if (iC != -1) {
                this.f115672b.scrollToPosition(iC);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            a();
        }
    }

    public void A(@NonNull String str) {
        B(null, str);
    }

    public final void B(@Nullable Preference preference, @Nullable String str) {
        c cVar = new c(preference, str);
        if (this.f115655c == null) {
            this.f115659g = cVar;
        } else {
            cVar.run();
        }
    }

    public void C(@Nullable Drawable drawable) {
        this.f115653a.d(drawable);
    }

    public void D(int i10) {
        this.f115653a.e(i10);
    }

    public void E(PreferenceScreen preferenceScreen) {
        if (!this.f115654b.C(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        this.f115656d = true;
        if (this.f115657e) {
            x();
        }
    }

    public void F(@h0 int i10, @Nullable String str) {
        y();
        PreferenceScreen preferenceScreenR = this.f115654b.r(requireContext(), i10, null);
        Preference preference = preferenceScreenR;
        if (str != null) {
            Preference preferenceP1 = preferenceScreenR.p1(str);
            boolean z10 = preferenceP1 instanceof PreferenceScreen;
            preference = preferenceP1;
            if (!z10) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        E((PreferenceScreen) preference);
    }

    public final void G() {
        this.f115655c.setAdapter(null);
        PreferenceScreen preferenceScreenQ = q();
        if (preferenceScreenQ != null) {
            preferenceScreenQ.g0();
        }
    }

    @Override // androidx.preference.DialogPreference.a
    @Nullable
    public <T extends Preference> T c(@NonNull CharSequence charSequence) {
        t tVar = this.f115654b;
        if (tVar == null) {
            return null;
        }
        return (T) tVar.b(charSequence);
    }

    @Override // androidx.preference.t.a
    public void e(@NonNull Preference preference) {
        DialogInterfaceOnCancelListenerC2573k dialogInterfaceOnCancelListenerC2573kW;
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof e) {
                zA = ((e) parentFragment).a(this, preference);
            }
        }
        if (!zA && (getContext() instanceof e)) {
            zA = ((e) getContext()).a(this, preference);
        }
        if (!zA && (getActivity() instanceof e)) {
            zA = ((e) getActivity()).a(this, preference);
        }
        if (!zA && getParentFragmentManager().s0("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                dialogInterfaceOnCancelListenerC2573kW = androidx.preference.c.x(preference.s());
            } else if (preference instanceof ListPreference) {
                dialogInterfaceOnCancelListenerC2573kW = androidx.preference.f.w(preference.s());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                dialogInterfaceOnCancelListenerC2573kW = androidx.preference.h.w(preference.s());
            }
            dialogInterfaceOnCancelListenerC2573kW.setTargetFragment(this, 0);
            dialogInterfaceOnCancelListenerC2573kW.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.t.c
    public boolean f(@NonNull Preference preference) {
        if (preference.m() == null) {
            return false;
        }
        boolean zD = false;
        for (Fragment parentFragment = this; !zD && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof f) {
                zD = ((f) parentFragment).d(this, preference);
            }
        }
        if (!zD && (getContext() instanceof f)) {
            zD = ((f) getContext()).d(this, preference);
        }
        if (!zD && (getActivity() instanceof f)) {
            zD = ((f) getActivity()).d(this, preference);
        }
        if (zD) {
            return true;
        }
        Log.w(f115648j, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundleK = preference.k();
        Fragment fragmentA = parentFragmentManager.H0().a(requireActivity().getClassLoader(), preference.m());
        fragmentA.setArguments(bundleK);
        fragmentA.setTargetFragment(this, 0);
        U u10 = parentFragmentManager.u();
        u10.z(((View) requireView().getParent()).getId(), fragmentA, null);
        u10.k(null);
        u10.m();
        return true;
    }

    @Override // androidx.preference.t.b
    public void h(@NonNull PreferenceScreen preferenceScreen) {
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof g) {
                zA = ((g) parentFragment).a(this, preferenceScreen);
            }
        }
        if (!zA && (getContext() instanceof g)) {
            zA = ((g) getContext()).a(this, preferenceScreen);
        }
        if (zA || !(getActivity() instanceof g)) {
            return;
        }
        ((g) getActivity()).a(this, preferenceScreen);
    }

    public void l(@h0 int i10) {
        y();
        E(this.f115654b.r(requireContext(), i10, q()));
    }

    public void m() {
        PreferenceScreen preferenceScreenQ = q();
        if (preferenceScreenQ != null) {
            this.f115655c.setAdapter(s(preferenceScreenQ));
            preferenceScreenQ.a0();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Fragment n() {
        return null;
    }

    public final RecyclerView o() {
        return this.f115655c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(w.a.f115749R, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = w.j.f115855i;
        }
        requireContext().getTheme().applyStyle(i10, false);
        t tVar = new t(requireContext());
        this.f115654b = tVar;
        tVar.f115722n = this;
        u(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, w.k.f115874A0, w.a.f115743L, 0);
        this.f115658f = typedArrayObtainStyledAttributes.getResourceId(w.k.f115877B0, this.f115658f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(w.k.f115880C0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(w.k.f115883D0, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(w.k.f115886E0, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f115658f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(16908351);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewV = v(layoutInflaterCloneInContext, viewGroup2, bundle);
        this.f115655c = recyclerViewV;
        recyclerViewV.addItemDecoration(this.f115653a);
        C(drawable);
        if (dimensionPixelSize != -1) {
            D(dimensionPixelSize);
        }
        this.f115653a.c(z10);
        if (this.f115655c.getParent() == null) {
            viewGroup2.addView(this.f115655c);
        }
        this.f115660h.post(this.f115661i);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f115660h.removeCallbacks(this.f115661i);
        this.f115660h.removeMessages(1);
        if (this.f115656d) {
            G();
        }
        this.f115655c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenQ = q();
        if (preferenceScreenQ != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenQ.f(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f115654b.z(this);
        this.f115654b.x(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f115654b.z(null);
        this.f115654b.x(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenQ;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenQ = q()) != null) {
            preferenceScreenQ.e(bundle2);
        }
        if (this.f115656d) {
            m();
            Runnable runnable = this.f115659g;
            if (runnable != null) {
                runnable.run();
                this.f115659g = null;
            }
        }
        this.f115657e = true;
    }

    public t p() {
        return this.f115654b;
    }

    public PreferenceScreen q() {
        return this.f115654b.n();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r() {
    }

    @NonNull
    public RecyclerView.Adapter s(@NonNull PreferenceScreen preferenceScreen) {
        return new o(preferenceScreen);
    }

    @NonNull
    public RecyclerView.LayoutManager t() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void u(@Nullable Bundle bundle, @Nullable String str);

    @NonNull
    public RecyclerView v(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(w.f.f115809e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(w.h.f115828m, viewGroup, false);
        recyclerView2.setLayoutManager(t());
        recyclerView2.setAccessibilityDelegateCompat(new u(recyclerView2));
        return recyclerView2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void w() {
    }

    public final void x() {
        if (this.f115660h.hasMessages(1)) {
            return;
        }
        this.f115660h.obtainMessage(1).sendToTarget();
    }

    public final void y() {
        if (this.f115654b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public void z(@NonNull Preference preference) {
        B(preference, null);
    }
}
