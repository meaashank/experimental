package J4;

import K4.d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import com.android.launcher3.uioverrides.dynamicui.ColorExtractionAlgorithm;

/* JADX INFO: loaded from: classes3.dex */
public class c extends ColorDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f53177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f53178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f53179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f53180d;

    public c(int i10) {
        super(i10);
        d.b bVar = new d.b();
        bVar.f58415a.setStyle(Paint.Style.STROKE);
        bVar.f58415a.setStrokeWidth(this.f53177a);
        bVar.f58415a.setColor(ColorExtractionAlgorithm.SECONDARY_COLOR_LIGHT);
        this.f53178b = bVar.f58415a;
        d.b bVar2 = new d.b();
        bVar2.f58415a.setStyle(Paint.Style.FILL);
        bVar2.f58415a.setColor(0);
        this.f53179c = bVar2.f58415a;
        d.b bVar3 = new d.b();
        bVar3.f58415a.setShader(K4.d.b(26));
        this.f53180d = bVar3.f58415a;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = canvas.getWidth() / 2.0f;
        float f10 = width / 8.0f;
        this.f53177a = f10;
        this.f53178b.setStrokeWidth(f10);
        this.f53179c.setColor(getColor());
        canvas.drawCircle(width, width, width - this.f53177a, this.f53180d);
        canvas.drawCircle(width, width, width - this.f53177a, this.f53179c);
        canvas.drawCircle(width, width, width - this.f53177a, this.f53178b);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i10) {
        super.setColor(i10);
        invalidateSelf();
    }
}
