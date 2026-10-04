package g5;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.InterfaceC4337k;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4452a extends AbstractC4454c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f202242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f202243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f202244c;

    public C4452a(@InterfaceC4337k int i10) {
        this(i10, 4, 4);
    }

    @Override // g5.AbstractC4454c
    public int d() {
        return this.f202244c;
    }

    @Override // g5.AbstractC4454c
    public int e() {
        return this.f202243b;
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int left = childAt.getLeft();
            int bottom = childAt.getBottom();
            this.f202242a.setBounds(left, bottom, childAt.getRight(), this.f202244c + bottom);
            this.f202242a.draw(canvas);
        }
        canvas.restore();
    }

    public void g(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight();
            this.f202242a.setBounds(right, childAt.getTop(), this.f202243b + right, childAt.getBottom());
            this.f202242a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int iH = h(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean z10 = childLayoutPosition < iH;
        boolean zL = l(childLayoutPosition, iH, itemCount);
        boolean zI = i(childLayoutPosition, iH);
        boolean zK = k(childLayoutPosition, iH);
        if (iH == 1) {
            if (z10) {
                rect.set(0, 0, 0, this.f202244c / 2);
                return;
            } else if (zL) {
                rect.set(0, this.f202244c / 2, 0, 0);
                return;
            } else {
                int i10 = this.f202244c;
                rect.set(0, i10 / 2, 0, i10 / 2);
                return;
            }
        }
        if (z10 && zI) {
            rect.set(0, 0, this.f202243b / 2, this.f202244c / 2);
            return;
        }
        if (z10 && zK) {
            rect.set(this.f202243b / 2, 0, 0, this.f202244c / 2);
            return;
        }
        if (z10) {
            int i11 = this.f202243b;
            rect.set(i11 / 2, 0, i11 / 2, this.f202244c / 2);
            return;
        }
        if (zL && zI) {
            rect.set(0, this.f202244c / 2, this.f202243b / 2, 0);
            return;
        }
        if (zL && zK) {
            rect.set(this.f202243b / 2, this.f202244c / 2, 0, 0);
            return;
        }
        if (zL) {
            int i12 = this.f202243b;
            rect.set(i12 / 2, this.f202244c / 2, i12 / 2, 0);
            return;
        }
        if (zI) {
            int i13 = this.f202244c;
            rect.set(0, i13 / 2, this.f202243b / 2, i13 / 2);
        } else if (zK) {
            int i14 = this.f202243b / 2;
            int i15 = this.f202244c;
            rect.set(i14, i15 / 2, 0, i15 / 2);
        } else {
            int i16 = this.f202243b;
            int i17 = this.f202244c;
            rect.set(i16 / 2, i17 / 2, i16 / 2, i17 / 2);
        }
    }

    public final int h(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    public final boolean i(int i10, int i11) {
        return i11 == 1 || i10 % i11 == 0;
    }

    public final boolean j(int i10, int i11) {
        return i10 < i11;
    }

    public final boolean k(int i10, int i11) {
        return i11 == 1 || (i10 + 1) % i11 == 0;
    }

    public final boolean l(int i10, int i11, int i12) {
        if (i11 == 1) {
            return i10 + 1 == i12;
        }
        int i13 = i12 % i11;
        int i14 = ((i12 - i13) / i11) + (i13 > 0 ? 1 : 0);
        int i15 = i10 + 1;
        int i16 = i15 % i11;
        return i16 == 0 ? i14 == i15 / i11 : i14 == ((i15 - i16) / i11) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        f(canvas, recyclerView);
        g(canvas, recyclerView);
    }

    public C4452a(@InterfaceC4337k int i10, int i11, int i12) {
        this.f202242a = new ColorDrawable(i10);
        this.f202243b = i11;
        this.f202244c = i12;
    }
}
