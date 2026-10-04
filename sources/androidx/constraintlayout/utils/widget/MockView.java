package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f107491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f107492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f107493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f107495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f107496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f107497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f107498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f107499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f107500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f107501k;

    public MockView(Context context) {
        super(context);
        this.f107491a = new Paint();
        this.f107492b = new Paint();
        this.f107493c = new Paint();
        this.f107494d = true;
        this.f107495e = true;
        this.f107496f = null;
        this.f107497g = new Rect();
        this.f107498h = Color.argb(255, 0, 0, 0);
        this.f107499i = Color.argb(255, 200, 200, 200);
        this.f107500j = Color.argb(255, 50, 50, 50);
        this.f107501k = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.hj);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.jj) {
                    this.f107496f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == g.m.mj) {
                    this.f107494d = typedArrayObtainStyledAttributes.getBoolean(index, this.f107494d);
                } else if (index == g.m.ij) {
                    this.f107498h = typedArrayObtainStyledAttributes.getColor(index, this.f107498h);
                } else if (index == g.m.kj) {
                    this.f107500j = typedArrayObtainStyledAttributes.getColor(index, this.f107500j);
                } else if (index == g.m.lj) {
                    this.f107499i = typedArrayObtainStyledAttributes.getColor(index, this.f107499i);
                } else if (index == g.m.nj) {
                    this.f107495e = typedArrayObtainStyledAttributes.getBoolean(index, this.f107495e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f107496f == null) {
            try {
                this.f107496f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f107491a.setColor(this.f107498h);
        this.f107491a.setAntiAlias(true);
        this.f107492b.setColor(this.f107499i);
        this.f107492b.setAntiAlias(true);
        this.f107493c.setColor(this.f107500j);
        this.f107501k = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f107501k);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f107494d) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f10, f11, this.f107491a);
            canvas2.drawLine(0.0f, f11, f10, 0.0f, this.f107491a);
            canvas2.drawLine(0.0f, 0.0f, f10, 0.0f, this.f107491a);
            canvas2.drawLine(f10, 0.0f, f10, f11, this.f107491a);
            canvas2.drawLine(f10, f11, 0.0f, f11, this.f107491a);
            canvas2.drawLine(0.0f, f11, 0.0f, 0.0f, this.f107491a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f107496f;
        if (str == null || !this.f107495e) {
            return;
        }
        this.f107492b.getTextBounds(str, 0, str.length(), this.f107497g);
        float fWidth = (width - this.f107497g.width()) / 2.0f;
        float fHeight = ((height - this.f107497g.height()) / 2.0f) + this.f107497g.height();
        this.f107497g.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f107497g;
        int i10 = rect.left;
        int i11 = this.f107501k;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas2.drawRect(this.f107497g, this.f107493c);
        canvas2.drawText(this.f107496f, fWidth, fHeight, this.f107492b);
    }

    public MockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107491a = new Paint();
        this.f107492b = new Paint();
        this.f107493c = new Paint();
        this.f107494d = true;
        this.f107495e = true;
        this.f107496f = null;
        this.f107497g = new Rect();
        this.f107498h = Color.argb(255, 0, 0, 0);
        this.f107499i = Color.argb(255, 200, 200, 200);
        this.f107500j = Color.argb(255, 50, 50, 50);
        this.f107501k = 4;
        a(context, attrs);
    }

    public MockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107491a = new Paint();
        this.f107492b = new Paint();
        this.f107493c = new Paint();
        this.f107494d = true;
        this.f107495e = true;
        this.f107496f = null;
        this.f107497g = new Rect();
        this.f107498h = Color.argb(255, 0, 0, 0);
        this.f107499i = Color.argb(255, 200, 200, 200);
        this.f107500j = Color.argb(255, 50, 50, 50);
        this.f107501k = 4;
        a(context, attrs);
    }
}
