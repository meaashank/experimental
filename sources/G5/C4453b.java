package g5;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.InterfaceC4337k;

/* JADX INFO: renamed from: g5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4453b extends AbstractC4454c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f202245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f202246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f202247c;

    public C4453b(@InterfaceC4337k int i10) {
        this(i10, 4, 4);
    }

    private int h(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    private boolean i(int i10, int i11) {
        return i11 == 1 || i10 % i11 == 0;
    }

    private boolean j(int i10, int i11) {
        return i10 < i11;
    }

    private boolean k(int i10, int i11) {
        return i11 == 1 || (i10 + 1) % i11 == 0;
    }

    private boolean l(int i10, int i11, int i12) {
        if (i11 == 1) {
            return i10 + 1 == i12;
        }
        int i13 = i12 % i11;
        int i14 = ((i12 - i13) / i11) + (i13 > 0 ? 1 : 0);
        int i15 = i10 + 1;
        int i16 = i15 % i11;
        return i16 == 0 ? i14 == i15 / i11 : i14 == ((i15 - i16) / i11) + 1;
    }

    @Override // g5.AbstractC4454c
    public int d() {
        return this.f202247c;
    }

    @Override // g5.AbstractC4454c
    public int e() {
        return this.f202246b;
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int left = childAt.getLeft();
            int bottom = childAt.getBottom();
            this.f202245a.setBounds(left, bottom, childAt.getRight(), this.f202247c + bottom);
            this.f202245a.draw(canvas);
        }
        canvas.restore();
    }

    public void g(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight();
            this.f202245a.setBounds(right, childAt.getTop(), this.f202246b + right, childAt.getBottom());
            this.f202245a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int iH = h(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean zJ = j(childLayoutPosition, iH);
        boolean zL = l(childLayoutPosition, iH, itemCount);
        boolean zI = i(childLayoutPosition, iH);
        boolean zK = k(childLayoutPosition, iH);
        if (iH == 1) {
            if (zJ) {
                int i10 = this.f202246b;
                int i11 = this.f202247c;
                rect.set(i10, i11, i10, i11 / 2);
                return;
            } else if (zL) {
                int i12 = this.f202246b;
                int i13 = this.f202247c;
                rect.set(i12, i13 / 2, i12, i13);
                return;
            } else {
                int i14 = this.f202246b;
                int i15 = this.f202247c;
                rect.set(i14, i15 / 2, i14, i15 / 2);
                return;
            }
        }
        if (zJ && zI) {
            int i16 = this.f202246b;
            int i17 = this.f202247c;
            rect.set(i16, i17, i16 / 2, i17 / 2);
            return;
        }
        if (zJ && zK) {
            int i18 = this.f202246b;
            int i19 = this.f202247c;
            rect.set(i18 / 2, i19, i18, i19 / 2);
            return;
        }
        if (zJ) {
            int i20 = this.f202246b;
            int i21 = this.f202247c;
            rect.set(i20 / 2, i21, i20 / 2, i21 / 2);
            return;
        }
        if (zL && zI) {
            int i22 = this.f202246b;
            int i23 = this.f202247c;
            rect.set(i22, i23 / 2, i22 / 2, i23);
            return;
        }
        if (zL && zK) {
            int i24 = this.f202246b;
            int i25 = this.f202247c;
            rect.set(i24 / 2, i25 / 2, i24, i25);
            return;
        }
        if (zL) {
            int i26 = this.f202246b;
            int i27 = this.f202247c;
            rect.set(i26 / 2, i27 / 2, i26 / 2, i27);
        } else if (zI) {
            int i28 = this.f202246b;
            int i29 = this.f202247c;
            rect.set(i28, i29 / 2, i28 / 2, i29 / 2);
        } else if (zK) {
            int i30 = this.f202246b;
            int i31 = this.f202247c;
            rect.set(i30 / 2, i31 / 2, i30, i31 / 2);
        } else {
            int i32 = this.f202246b;
            int i33 = this.f202247c;
            rect.set(i32 / 2, i33 / 2, i32 / 2, i33 / 2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        f(canvas, recyclerView);
        g(canvas, recyclerView);
    }

    public C4453b(@InterfaceC4337k int i10, int i11, int i12) {
        this.f202245a = new ColorDrawable(i10);
        this.f202246b = i11;
        this.f202247c = i12;
    }
}
