package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C2379b;
import androidx.core.app.C2401y;
import androidx.core.util.InterfaceC2427d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.d;
import com.bumptech.glide.load.engine.GlideException;
import e.InterfaceC4335i;
import e.InterfaceC4340n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class r extends androidx.activity.k implements C2379b.i, C2379b.k {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.D mFragmentLifecycleRegistry;
    final C2582u mFragments;
    boolean mResumed;
    boolean mStopped;

    public class a extends AbstractC2584w<r> implements B0.C, B0.D, androidx.core.app.N, androidx.core.app.P, q0, androidx.activity.G, androidx.activity.result.k, androidx.savedstate.f, M, androidx.core.view.M {
        public a() {
            super(r.this);
        }

        @Override // androidx.fragment.app.M
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            r.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.M
        public void addMenuProvider(@NonNull androidx.core.view.U u10) {
            r.this.addMenuProvider(u10);
        }

        @Override // B0.C
        public void addOnConfigurationChangedListener(@NonNull InterfaceC2427d<Configuration> interfaceC2427d) {
            r.this.addOnConfigurationChangedListener(interfaceC2427d);
        }

        @Override // androidx.core.app.N
        public void addOnMultiWindowModeChangedListener(@NonNull InterfaceC2427d<C2401y> interfaceC2427d) {
            r.this.addOnMultiWindowModeChangedListener(interfaceC2427d);
        }

        @Override // androidx.core.app.P
        public void addOnPictureInPictureModeChangedListener(@NonNull InterfaceC2427d<androidx.core.app.U> interfaceC2427d) {
            r.this.addOnPictureInPictureModeChangedListener(interfaceC2427d);
        }

        @Override // B0.D
        public void addOnTrimMemoryListener(@NonNull InterfaceC2427d<Integer> interfaceC2427d) {
            r.this.addOnTrimMemoryListener(interfaceC2427d);
        }

        @Override // androidx.fragment.app.AbstractC2584w, androidx.fragment.app.AbstractC2581t
        @Nullable
        public View c(int i10) {
            return r.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC2584w, androidx.fragment.app.AbstractC2581t
        public boolean d() {
            Window window = r.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.k
        @NonNull
        public androidx.activity.result.j getActivityResultRegistry() {
            return r.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.B
        @NonNull
        public Lifecycle getLifecycle() {
            return r.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.G
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return r.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.savedstate.f
        @NonNull
        public androidx.savedstate.d getSavedStateRegistry() {
            return r.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.q0
        @NonNull
        public p0 getViewModelStore() {
            return r.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC2584w
        public void h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            r.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.M
        public void invalidateMenu() {
            r.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC2584w
        @NonNull
        public LayoutInflater j() {
            return r.this.getLayoutInflater().cloneInContext(r.this);
        }

        @Override // androidx.fragment.app.AbstractC2584w
        public int k() {
            Window window = r.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC2584w
        public boolean l() {
            return r.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.AbstractC2584w
        public boolean n(@NonNull Fragment fragment) {
            return !r.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC2584w
        public boolean o(@NonNull String str) {
            return C2379b.r(r.this, str);
        }

        @Override // androidx.core.view.M
        public void removeMenuProvider(@NonNull androidx.core.view.U u10) {
            r.this.removeMenuProvider(u10);
        }

        @Override // B0.C
        public void removeOnConfigurationChangedListener(@NonNull InterfaceC2427d<Configuration> interfaceC2427d) {
            r.this.removeOnConfigurationChangedListener(interfaceC2427d);
        }

        @Override // androidx.core.app.N
        public void removeOnMultiWindowModeChangedListener(@NonNull InterfaceC2427d<C2401y> interfaceC2427d) {
            r.this.removeOnMultiWindowModeChangedListener(interfaceC2427d);
        }

        @Override // androidx.core.app.P
        public void removeOnPictureInPictureModeChangedListener(@NonNull InterfaceC2427d<androidx.core.app.U> interfaceC2427d) {
            r.this.removeOnPictureInPictureModeChangedListener(interfaceC2427d);
        }

        @Override // B0.D
        public void removeOnTrimMemoryListener(@NonNull InterfaceC2427d<Integer> interfaceC2427d) {
            r.this.removeOnTrimMemoryListener(interfaceC2427d);
        }

        @Override // androidx.fragment.app.AbstractC2584w
        public void s() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC2584w
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public r i() {
            return r.this;
        }

        @Override // androidx.core.view.M
        public void addMenuProvider(@NonNull androidx.core.view.U u10, @NonNull androidx.lifecycle.B b10) {
            r.this.addMenuProvider(u10, b10);
        }

        @Override // androidx.core.view.M
        public void addMenuProvider(@NonNull androidx.core.view.U u10, @NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.State state) {
            r.this.addMenuProvider(u10, b10, state);
        }
    }

    public r() {
        this.mFragments = C2582u.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.D(this);
        this.mStopped = true;
        P0();
    }

    public static /* synthetic */ Bundle N0(r rVar) {
        rVar.markFragmentsCreated();
        rVar.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    private void P0() {
        getSavedStateRegistry().j(LIFECYCLE_TAG, new d.c() { // from class: androidx.fragment.app.n
            @Override // androidx.savedstate.d.c
            public final Bundle a() {
                return r.N0(this.f113868a);
            }
        });
        addOnConfigurationChangedListener(new InterfaceC2427d() { // from class: androidx.fragment.app.o
            @Override // androidx.core.util.InterfaceC2427d
            public final void accept(Object obj) {
                this.f113869a.mFragments.F();
            }
        });
        addOnNewIntentListener(new InterfaceC2427d() { // from class: androidx.fragment.app.p
            @Override // androidx.core.util.InterfaceC2427d
            public final void accept(Object obj) {
                this.f113870a.mFragments.F();
            }
        });
        addOnContextAvailableListener(new b.c() { // from class: androidx.fragment.app.q
            @Override // b.c
            public final void a(Context context) {
                this.f113871a.mFragments.a(null);
            }
        });
    }

    public static boolean Q0(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zQ0 = false;
        for (Fragment fragment : fragmentManager.J0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zQ0 |= Q0(fragment.getChildFragmentManager(), state);
                }
                Z z10 = fragment.mViewLifecycleOwner;
                if (z10 != null && z10.getLifecycle().d().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    zQ0 = true;
                }
                if (fragment.mLifecycleRegistry.d().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.v(state);
                    zQ0 = true;
                }
            }
        }
        return zQ0;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.G(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + GlideException.a.f139488d;
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                W1.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.D().e0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.D();
    }

    @NonNull
    @Deprecated
    public W1.a getSupportLoaderManager() {
        return W1.a.d(this);
    }

    public void markFragmentsCreated() {
        while (Q0(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.k, android.app.Activity
    @InterfaceC4335i
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        this.mFragments.F();
        super.onActivityResult(i10, i11, intent);
    }

    @e.I
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n();
        this.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.k, android.app.Activity
    @InterfaceC4335i
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.F();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.F();
        super.onResume();
        this.mResumed = true;
        this.mFragments.z();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_RESUME);
        this.mFragments.r();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.F();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.z();
        this.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_START);
        this.mFragments.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.t();
        this.mFragmentLifecycleRegistry.o(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.X x10) {
        C2379b.n(this, x10);
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.X x10) {
        C2379b.o(this, x10);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (i10 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // androidx.core.app.C2379b.k
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @InterfaceC4340n
    public r(@e.G int i10) {
        super(i10);
        this.mFragments = C2582u.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.D(this);
        this.mStopped = true;
        P0();
    }
}
