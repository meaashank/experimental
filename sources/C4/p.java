package C4;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class p implements RecyclerView.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17576c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final b f17577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public GestureDetector f17578b;

    public static final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f17579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f17580b;

        public a(RecyclerView recyclerView, p pVar) {
            this.f17579a = recyclerView;
            this.f17580b = pVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e10) {
            b bVar;
            G.p(e10, "e");
            View viewFindChildViewUnder = this.f17579a.findChildViewUnder(e10.getX(), e10.getY());
            if (viewFindChildViewUnder == null || (bVar = this.f17580b.f17577a) == null) {
                return;
            }
            bVar.b(viewFindChildViewUnder, this.f17579a.getChildAdapterPosition(viewFindChildViewUnder));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e10) {
            G.p(e10, "e");
            return true;
        }
    }

    public interface b {
        void a(@Nullable View view, int i10);

        void b(@Nullable View view, int i10);
    }

    public p(@Nullable Context context, @NotNull RecyclerView recyclerView, @Nullable b bVar) {
        G.p(recyclerView, "recyclerView");
        this.f17577a = bVar;
        this.f17578b = new GestureDetector(context, new a(recyclerView, this));
    }

    @NotNull
    public final GestureDetector b() {
        return this.f17578b;
    }

    public final void c(@NotNull GestureDetector gestureDetector) {
        G.p(gestureDetector, "<set-?>");
        this.f17578b = gestureDetector;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean onInterceptTouchEvent(@NotNull RecyclerView view, @NotNull MotionEvent e10) {
        G.p(view, "view");
        G.p(e10, "e");
        View viewFindChildViewUnder = view.findChildViewUnder(e10.getX(), e10.getY());
        if (viewFindChildViewUnder == null || this.f17577a == null || !this.f17578b.onTouchEvent(e10)) {
            return false;
        }
        this.f17577a.a(viewFindChildViewUnder, view.getChildAdapterPosition(viewFindChildViewUnder));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onTouchEvent(@NotNull RecyclerView view, @NotNull MotionEvent motionEvent) {
        G.p(view, "view");
        G.p(motionEvent, "motionEvent");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }
}
