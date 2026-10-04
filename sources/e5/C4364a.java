package e5;

import B0.C0920d;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: e5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4364a extends RecyclerView.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f200245e = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f200246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f200247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f200248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f200249d;

    public C4364a(Context context, int i10, int i11) {
        this(context, i10);
        Drawable drawable = C0920d.getDrawable(context, i11);
        this.f200247b = drawable;
        this.f200248c = drawable.getIntrinsicHeight();
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i11 = this.f200248c + bottom;
            Drawable drawable = this.f200247b;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, measuredWidth, i11);
                this.f200247b.draw(canvas);
            }
            Paint paint = this.f200246a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i11, paint);
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int i11 = this.f200248c + right;
            Drawable drawable = this.f200247b;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i11, measuredHeight);
                this.f200247b.draw(canvas);
            }
            Paint paint = this.f200246a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i11, measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        rect.set(0, 0, 0, this.f200248c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        if (this.f200249d == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }

    public C4364a(Context context, int i10, int i11, int i12) {
        this(context, i10);
        this.f200248c = i11;
        Paint paint = new Paint(1);
        this.f200246a = paint;
        paint.setColor(i12);
        this.f200246a.setStyle(Paint.Style.FILL);
    }

    public C4364a(Context context, int i10) {
        this.f200248c = 2;
        if (i10 != 1 && i10 != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.f200249d = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f200245e);
        this.f200247b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
