package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116937d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116938e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f116939f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.LayoutManager f116940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f116942c;

    public class a extends x {
        public a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager);
        }

        @Override // androidx.recyclerview.widget.x
        public int d(View view) {
            return this.f116940a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f116940a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f116940a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int g(View view) {
            return this.f116940a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int h() {
            return this.f116940a.getWidth();
        }

        @Override // androidx.recyclerview.widget.x
        public int i() {
            return this.f116940a.getWidth() - this.f116940a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.x
        public int j() {
            return this.f116940a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.x
        public int l() {
            return this.f116940a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.x
        public int m() {
            return this.f116940a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.x
        public int n() {
            return this.f116940a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.x
        public int o() {
            return (this.f116940a.getWidth() - this.f116940a.getPaddingLeft()) - this.f116940a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.x
        public int q(View view) {
            this.f116940a.getTransformedBoundingBox(view, true, this.f116942c);
            return this.f116942c.right;
        }

        @Override // androidx.recyclerview.widget.x
        public int r(View view) {
            this.f116940a.getTransformedBoundingBox(view, true, this.f116942c);
            return this.f116942c.left;
        }

        @Override // androidx.recyclerview.widget.x
        public void s(View view, int i10) {
            view.offsetLeftAndRight(i10);
        }

        @Override // androidx.recyclerview.widget.x
        public void t(int i10) {
            this.f116940a.offsetChildrenHorizontal(i10);
        }
    }

    public class b extends x {
        public b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager);
        }

        @Override // androidx.recyclerview.widget.x
        public int d(View view) {
            return this.f116940a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f116940a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f116940a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int g(View view) {
            return this.f116940a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int h() {
            return this.f116940a.getHeight();
        }

        @Override // androidx.recyclerview.widget.x
        public int i() {
            return this.f116940a.getHeight() - this.f116940a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.x
        public int j() {
            return this.f116940a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.x
        public int l() {
            return this.f116940a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.x
        public int m() {
            return this.f116940a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.x
        public int n() {
            return this.f116940a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.x
        public int o() {
            return (this.f116940a.getHeight() - this.f116940a.getPaddingTop()) - this.f116940a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.x
        public int q(View view) {
            this.f116940a.getTransformedBoundingBox(view, true, this.f116942c);
            return this.f116942c.bottom;
        }

        @Override // androidx.recyclerview.widget.x
        public int r(View view) {
            this.f116940a.getTransformedBoundingBox(view, true, this.f116942c);
            return this.f116942c.top;
        }

        @Override // androidx.recyclerview.widget.x
        public void s(View view, int i10) {
            view.offsetTopAndBottom(i10);
        }

        @Override // androidx.recyclerview.widget.x
        public void t(int i10) {
            this.f116940a.offsetChildrenVertical(i10);
        }
    }

    public /* synthetic */ x(RecyclerView.LayoutManager layoutManager, a aVar) {
        this(layoutManager);
    }

    public static x a(RecyclerView.LayoutManager layoutManager) {
        return new a(layoutManager);
    }

    public static x b(RecyclerView.LayoutManager layoutManager, int i10) {
        if (i10 == 0) {
            return new a(layoutManager);
        }
        if (i10 == 1) {
            return new b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static x c(RecyclerView.LayoutManager layoutManager) {
        return new b(layoutManager);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.LayoutManager k() {
        return this.f116940a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f116941b) {
            return 0;
        }
        return o() - this.f116941b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i10);

    public abstract void t(int i10);

    public void u() {
        this.f116941b = o();
    }

    public x(RecyclerView.LayoutManager layoutManager) {
        this.f116941b = Integer.MIN_VALUE;
        this.f116942c = new Rect();
        this.f116940a = layoutManager;
    }
}
