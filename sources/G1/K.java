package g1;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class K {

    public class a implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f202188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f202189b;

        public a(f fVar, g gVar) {
            this.f202188a = fVar;
            this.f202189b = gVar;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            f fVar = this.f202188a;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            g gVar = this.f202189b;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f202190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f202191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f202192c;

        public b(e eVar, c cVar, d dVar) {
            this.f202190a = eVar;
            this.f202191b = cVar;
            this.f202192c = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = this.f202191b;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            d dVar = this.f202192c;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e eVar = this.f202190a;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    public interface c {
        void onAnimationEnd(Animation animation);
    }

    public interface d {
        void onAnimationRepeat(Animation animation);
    }

    public interface e {
        void onAnimationStart(Animation animation);
    }

    public interface f {
        void onChildViewAdded(View view, View view2);
    }

    public interface g {
        void onChildViewRemoved(View view, View view2);
    }

    @InterfaceC2511d({"android:animateLayoutChanges"})
    @TargetApi(11)
    public static void a(ViewGroup viewGroup, boolean z10) {
        if (z10) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void b(ViewGroup viewGroup, e eVar, c cVar, d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new b(eVar, cVar, dVar));
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void c(ViewGroup viewGroup, f fVar, g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new a(fVar, gVar));
        }
    }
}
