package g1;

import android.widget.AbsListView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @androidx.databinding.g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C4429a {

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public class C0736a implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f202193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f202194b;

        public C0736a(c cVar, b bVar) {
            this.f202193a = cVar;
            this.f202194b = bVar;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            b bVar = this.f202194b;
            if (bVar != null) {
                bVar.onScroll(absListView, i10, i11, i12);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            c cVar = this.f202193a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i10);
            }
        }
    }

    /* JADX INFO: renamed from: g1.a$b */
    public interface b {
        void onScroll(AbsListView absListView, int i10, int i11, int i12);
    }

    /* JADX INFO: renamed from: g1.a$c */
    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i10);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void a(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new C0736a(cVar, bVar));
    }
}
